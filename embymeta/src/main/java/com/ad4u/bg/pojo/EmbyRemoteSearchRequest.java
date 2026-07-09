package com.ad4u.bg.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmbyRemoteSearchRequest {
  @JsonProperty("ItemId")
  public String itemId;

  @JsonProperty("SearchInfo")
  public SearchInfo searchInfo;

  public static class SearchInfo {
    @JsonProperty("Name")
    public String name;

    @JsonProperty("Year")
    public Integer year;
  }
}
