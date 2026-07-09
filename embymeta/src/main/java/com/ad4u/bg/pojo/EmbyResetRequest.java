package com.ad4u.bg.pojo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmbyResetRequest {

  @JsonProperty("ItemIds")
  public List<String> itemIds = new ArrayList<>();
}
