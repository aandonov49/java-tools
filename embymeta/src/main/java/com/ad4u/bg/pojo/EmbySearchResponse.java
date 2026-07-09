package com.ad4u.bg.pojo;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmbySearchResponse {

  @JsonProperty("Name")
  public String name;

  @JsonProperty("ProviderIds")
  public Map<String, String> providerIds; // Съдържа {"Tvdb": "123"}
}
