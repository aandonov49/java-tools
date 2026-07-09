package com.ad4u.bg;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;

import com.ad4u.bg.pojo.EmbyItemsResponse;
import com.ad4u.bg.pojo.EmbyRemoteSearchRequest;
import com.ad4u.bg.pojo.EmbySearchResponse;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
@ApplicationScoped
public class EmbyMovieAutomationService extends BaseEmbyAutomation {

  @Override
  protected String getItemType() {
    return "Movie";
  }

  @Override
  protected String getLogLabel() {
    return "филми";
  }

  @Override
  protected List<EmbySearchResponse> executeRemoteSearch(EmbyItemsResponse.EmbyItem item) {
    // Подготовка на заявката за отдалечено търсене през Emby
    String englishName = item.getFileName();
    if (englishName.contains("(") && englishName.contains(")")) {
      englishName = item.getFileName().substring(item.getFileName().indexOf("(") + 1, item.getFileName().indexOf(")"));
    } else {
      englishName = item.getFileName();
    }
    EmbyRemoteSearchRequest searchRequest = new EmbyRemoteSearchRequest();
    searchRequest.itemId = item.id;
    searchRequest.searchInfo = new EmbyRemoteSearchRequest.SearchInfo();
    searchRequest.searchInfo.name = englishName;
    searchRequest.searchInfo.year = null;

    // Пускане на търсенето
    return embyClient.remoteSearchMovie(EMBY_API_KEY, searchRequest);

  }
}
