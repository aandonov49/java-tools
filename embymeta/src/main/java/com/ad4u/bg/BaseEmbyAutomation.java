package com.ad4u.bg;

import java.util.List;

import jakarta.inject.Inject;

import com.ad4u.bg.pojo.EmbyIdentifyRequest;
import com.ad4u.bg.pojo.EmbyItemsResponse;
import com.ad4u.bg.pojo.EmbyResetRequest;
import com.ad4u.bg.pojo.EmbySearchResponse;
import com.ad4u.bg.restclient.EmbyClient;
import io.quarkus.runtime.QuarkusApplication;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

public abstract class BaseEmbyAutomation implements QuarkusApplication {
  private static final Logger logger = Logger.getLogger(BaseEmbyAutomation.class);

  @Inject
  @RestClient
  protected EmbyClient embyClient;

  protected static final String EMBY_API_KEY = "87e0075f35704ff995c84933d5710003";

  // Абстрактни методи, които подкласовете задължително трябва да дефинират
  protected abstract String getItemType();

  protected abstract List<EmbySearchResponse> executeRemoteSearch(EmbyItemsResponse.EmbyItem item);

  protected abstract String getLogLabel();

  @Override
  public int run(String... args) {
    boolean forceAll = args != null && java.util.Arrays.stream(args).anyMatch("all"::equalsIgnoreCase);

    try {
      // 1. Извличане на филмите от Emby
      logger.info(new StringBuilder().append("Извличане на ").append(getLogLabel()).append(" от Emby...").toString());
      EmbyItemsResponse embyResponse =
          embyClient.getItems(EMBY_API_KEY, getItemType(), true, "Path,FileName,ProviderIds");

      if (embyResponse.items == null || embyResponse.items.isEmpty()) {
        logger.warn(new StringBuilder().append("Няма намерени ").append(getLogLabel()).append(" в Emby.").toString());
        return 0;
      }

      logger.info(new StringBuilder().append("Намерени са ")
          .append(embyResponse.items.size())
          .append(" ")
          .append(getLogLabel())
          .append(". Започва обработка...")
          .toString());

      // 2. Цикъл по всеки филм
      for (EmbyItemsResponse.EmbyItem movie : embyResponse.items) {
        StringBuilder processLog = new StringBuilder();
        processLog.append("Преглед на филм: ").append(movie.name).append(" (ID: ").append(movie.id).append(")");
        logger.info(processLog.toString());

        try {
          // Проверяваме дали поне един доставчик вече е зададен — ако да, пропускаме елемента
          boolean hasProvider = movie.providerIds != null &&
              movie.providerIds.values().stream().anyMatch(v -> v != null && !v.isBlank());
          if (hasProvider && !forceAll) {
            logger.info(new StringBuilder()
                .append("⏭️ Пропускаме '")
                .append(movie.name)
                .append("' — вече има зададени доставчици: ")
                .append(movie.providerIds)
                .toString());
            continue;
          }

          // Извикване на специфичното търсене (за филми или за сериали)
          List<EmbySearchResponse> searchResults = executeRemoteSearch(movie);

          if (searchResults == null || searchResults.isEmpty()) {
            StringBuilder notFoundLog = new StringBuilder();
            notFoundLog.append("❌ Няма външни съвпадения в Emby за: ").append(movie.name);
            logger.warn(notFoundLog.toString());
            continue;
          }

          // Взимаме първия намерен резултат
          EmbySearchResponse bestMatch = searchResults.get(0);

          // Проверяваме дали този резултат съдържа Tvdb ID
          String tvdbId = null;
          if (bestMatch.providerIds != null) {
            tvdbId = bestMatch.providerIds.get("Tvdb"); // Проверяваме за ключ "Tvdb"
          }

          if (tvdbId == null) {
            StringBuilder noTvdbLog = new StringBuilder();
            noTvdbLog.append("⚠️ Намерен е филм '")
                .append(bestMatch.name)
                .append("', но доставчикът TheTVDB не върна ID за него.");
            logger.warn(noTvdbLog.toString());
            continue;
          }

          StringBuilder matchLog = new StringBuilder();
          matchLog.append("✅ Успешно локализирано TVDB ID: ")
              .append(tvdbId)
              .append(" за '")
              .append(bestMatch.name)
              .append("'");
          logger.info(matchLog.toString());

          // --- 1. ПЪРВО: НУЛИРАНЕ НА МЕТАДАННИТЕ (RESET) ---
          // Изчистваме старите данни, за да подготвим обекта
          EmbyResetRequest resetRequest = new EmbyResetRequest();
          resetRequest.itemIds.add(movie.id);

          embyClient.resetMetadata(EMBY_API_KEY, movie.id);

          StringBuilder resetLog = new StringBuilder();
          resetLog.append("🧹 Старите метаданни за '").append(movie.name).append("' бяха напълно изчистени.");
          logger.info(resetLog.toString());

          // --- 2. ВТОРО: ПРИЛАГАНЕ НА ИДЕНТИФИКАЦИЯТА (APPLY) ---
          // Записваме НОВОТО и правилно TheTVDB ID върху вече чистия обект

          // Изграждаме обекта за JSON тялото (само име и ID-та)
          EmbyIdentifyRequest embyIdentifyRequest = new EmbyIdentifyRequest();
          embyIdentifyRequest.name = null;
          embyIdentifyRequest.providerIds.put("Tvdb", tvdbId);

          // Извикваме обновения Quarkus клиент
          embyClient.applyIdentify(
              movie.id, // Подава се като PathParam
              EMBY_API_KEY, // QueryParam
              true, // ReplaceAllImages (QueryParam)
              true, // ReplaceAllMetadata (QueryParam)
              embyIdentifyRequest // Отива като JSON тяло (Payload)
          );

          // Задействане на пълен рефреш
          embyClient.refreshItem(movie.id, EMBY_API_KEY, "FullRefresh", "FullRefresh", true, true);

          StringBuilder successLog = new StringBuilder();
          successLog.append("🚀 Изпратен сигнал за обновяване на метаданните на '").append(movie.name).append("'");
          logger.info(successLog.toString());

          // Пауза за разтоварване на сървъра
          Thread.sleep(3000);

        } catch (Exception itemException) {
          StringBuilder errorLog = new StringBuilder();
          errorLog.append("Грешка при обработка на филма '").append(movie.name).append("'");
          logger.error(errorLog.toString(), itemException);
        }
      }

      logger.info(
          new StringBuilder().append("Всички ").append(getLogLabel()).append(" бяха обходени успешно!").toString());

    } catch (Exception e) {
      logger.error("Критична грешка в процеса на автоматизация!", e);
    }
    return 0;
  }
}
