package com.ad4u.bg;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;

import com.ad4u.bg.pojo.EmbyItemsResponse;
import com.ad4u.bg.pojo.EmbyRemoteSearchRequest;
import com.ad4u.bg.pojo.EmbySearchResponse;

@ApplicationScoped
public class EmbySeriesAutomationService extends BaseEmbyAutomation {

  @Override
  protected String getItemType() {
    return "Series";
  }

  @Override
  protected String getLogLabel() {
    return "сериали";
  }

  @Override
  protected List<EmbySearchResponse> executeRemoteSearch(EmbyItemsResponse.EmbyItem item) {
    EmbyRemoteSearchRequest searchRequest = new EmbyRemoteSearchRequest();
    searchRequest.itemId = item.id;
    searchRequest.searchInfo = new EmbyRemoteSearchRequest.SearchInfo();
    searchRequest.searchInfo.name = item.name;
    searchRequest.searchInfo.year = item.productionYear;

    // Използва сериалния ендпоинт на EmbyClient
    return null;
    // return embyClient.remoteSearchSeries(EMBY_API_KEY, searchRequest);
  }
}
