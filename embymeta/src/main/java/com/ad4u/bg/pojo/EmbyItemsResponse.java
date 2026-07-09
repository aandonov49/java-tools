package com.ad4u.bg.pojo;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmbyItemsResponse {
  @JsonProperty("Items")
  public List<EmbyItem> items;

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class EmbyItem {

    @JsonProperty("Id")
    public String id;

    @JsonProperty("Name")
    public String name;

    @JsonProperty("ProductionYear")
    public Integer productionYear;

    @JsonProperty("Path")
    public String path;

    @JsonProperty("FileName")
    public String fileName;

    @JsonProperty("ProviderIds")
    public Map<String, String> providerIds; // Всички ID-та: {"Imdb": "tt123", "Tmdb": "456"}

    public String getFileName() {
      return fileName.substring(0, fileName.lastIndexOf('.'));
    }

    @Override
    public String toString() {
      return "EmbyItem{" +
          "id='" + id + '\'' +
          ", name='" + name + '\'' +
          ", productionYear=" + productionYear +
          ", path='" + path + '\'' +
          ", fileName='" + fileName + '\'' +
          ", providerIds=" + providerIds +
          '}';
    }
  }

  @Override
  public String toString() {
    return "EmbyItemsResponse{" +
        "items=" + items +
        '}';
  }
}
