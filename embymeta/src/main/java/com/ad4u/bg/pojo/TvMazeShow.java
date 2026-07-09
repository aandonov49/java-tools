package com.ad4u.bg.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TvMazeShow {

  @JsonProperty("id")
  public Integer id;

  @JsonProperty("name")
  public String name;

  @JsonProperty("status")
  public String status;

  @JsonProperty("premiered")
  public String premiered;

  @JsonProperty("externals")
  public Externals externals;

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Externals {

    @JsonProperty("thetvdb")
    public Integer thetvdb;

    @JsonProperty("imdb")
    public String imdb;

    @JsonProperty("tvrage")
    public Integer tvrage;

    @Override
    public String toString() {
      return "Externals{thetvdb=" + thetvdb + ", imdb='" + imdb + "', tvrage=" + tvrage + '}';
    }
  }

  @Override
  public String toString() {
    return "TvMazeShow{id=" + id + ", name='" + name + "', status='" + status
        + "', premiered='" + premiered + "', externals=" + externals + '}';
  }
}
