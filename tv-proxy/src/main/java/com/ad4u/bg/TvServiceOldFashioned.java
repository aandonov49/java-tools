package com.ad4u.bg;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

import com.ad4u.bg.providers.JsonObjectMapperProvider;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import eu.ad4ubg.TvCategory;
import eu.ad4ubg.TvList;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;

// @ApplicationScoped
@RegisterProvider(JsonObjectMapperProvider.class)
@RequestScoped
public class TvServiceOldFashioned {
  @Inject
  private ObjectMapper objectMapper;

  @ConfigProperty(name = "tv-proxy.channel.list.url")
  private String channelListUrl;

  @ConfigProperty(name = "tv-proxy.category.list.url")
  private String categoryListUrl;

  private final HttpClient httpClient = HttpClient.newHttpClient();

  public List<TvList> fetchTvChannels() {
    try {
      // 1. Построяваме ръчно HTTP заявката
      HttpRequest request = getHttpRequest(channelListUrl);

      // 2. Изпращаме заявката и взимаме отговора като String (текст)
      HttpResponse<String> response =
          httpClient.send(request, HttpResponse.BodyHandlers.ofString());

      // Проверка дали статус кодът е 200 OK
      if (response.statusCode() != 200) {
        throw new RuntimeException("Грешка от сървъра. Статус код: " + response.statusCode());
      }

      String jsonBody = response.body();

      // 3. РЪЧНО ДЕСЕРИАЛИЗИРАНЕ (Справяне с JsonToken.START_OBJECT)
      // Първо четем данните като общо JSON дърво, за да видим какво има вътре
      JsonNode rootNode = objectMapper.readTree(jsonBody);

      // АКО отговорът е директен масив [ {...}, {...} ]
      if (rootNode.isArray()) {
        return objectMapper.readValue(jsonBody, new TypeReference<List<TvList>>() {
        });
      }

      // АКО отговорът е обект { "някакво_поле": [ ... ] }
      // Често при IPTV списъци каналите са в поле "live_streams" или подобно
      else if (rootNode.isObject()) {

        // Проверяваме дали има конкретно поле със списък вътре (сменете името, ако е друго)
        if (rootNode.has("live_streams")) {
          JsonNode channelsNode = rootNode.get("live_streams");
          return objectMapper.convertValue(channelsNode, new TypeReference<List<TvList>>() {
          });
        } else {
          // Ако е друг вид обект, но искаме да пробваме да го прочетем
          System.out.println("Получен е обект, но липсва очакваното поле за канали.");
        }
      }

      return new ArrayList<>();

    } catch (Exception e) {
      // Хващаме всички грешки при мрежата или парсването
      throw new RuntimeException("Неуспешно извличане на каналите: " + e.getMessage(), e);
    }
  }

  public List<TvCategory> fetchTvCategories() {
    try {
      // 1. Построяваме ръчно HTTP заявката
      HttpRequest request = getHttpRequest(categoryListUrl);

      // 2. Изпращаме заявката и взимаме отговора като String (текст)
      HttpResponse<String> response =
          httpClient.send(request, HttpResponse.BodyHandlers.ofString());

      // Проверка дали статус кодът е 200 OK
      if (response.statusCode() != 200) {
        throw new RuntimeException("Грешка от сървъра. Статус код: " + response.statusCode());
      }

      String jsonBody = response.body();

      // 3. РЪЧНО ДЕСЕРИАЛИЗИРАНЕ (Справяне с JsonToken.START_OBJECT)
      // Първо четем данните като общо JSON дърво, за да видим какво има вътре
      JsonNode rootNode = objectMapper.readTree(jsonBody);

      // АКО отговорът е директен масив [ {...}, {...} ]
      if (rootNode.isArray()) {
        return objectMapper.readValue(jsonBody, new TypeReference<List<TvCategory>>() {
        });
      }

      // АКО отговорът е обект { "някакво_поле": [ ... ] }
      // Често при IPTV списъци каналите са в поле "live_streams" или подобно
      else if (rootNode.isObject()) {

        // Проверяваме дали има конкретно поле със списък вътре (сменете името, ако е друго)
        if (rootNode.has("live_streams")) {
          JsonNode channelsNode = rootNode.get("live_streams");
          return objectMapper.convertValue(channelsNode, new TypeReference<List<TvCategory>>() {
          });
        } else {
          // Ако е друг вид обект, но искаме да пробваме да го прочетем
          System.out.println("Получен е обект, но липсва очакваното поле за канали.");
        }
      }

      return new ArrayList<>();

    } catch (Exception e) {
      // Хващаме всички грешки при мрежата или парсването
      throw new RuntimeException("Неуспешно извличане на каналите: " + e.getMessage(), e);
    }
  }

  private HttpRequest getHttpRequest(String url) {
    HttpRequest request =
        HttpRequest.newBuilder()
            .uri(URI.create(url)) // Сложете точния URL
            .GET()
            .header("Accept", "application/json")
            .header("User-Agent", "Giga Navigator/1.0.5")
            .build();
    return request;
  }
}
