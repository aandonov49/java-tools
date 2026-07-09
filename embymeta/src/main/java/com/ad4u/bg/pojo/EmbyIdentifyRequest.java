package com.ad4u.bg.pojo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmbyIdentifyRequest {
  @JsonProperty("Name")
  public String name;

  @JsonProperty("ProviderIds")
  public Map<String, String> providerIds = new HashMap<>();
}
