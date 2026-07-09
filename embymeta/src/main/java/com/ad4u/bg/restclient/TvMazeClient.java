package com.ad4u.bg.restclient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import com.ad4u.bg.pojo.TvMazeShow;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "tvmaze-api")
@Path("/lookup")
@Produces(MediaType.APPLICATION_JSON)
public interface TvMazeClient {

  /**
   * Търсене на сериал по TheTVDB ID.
   * Пример: https://api.tvmaze.com/lookup/shows?thetvdb=81189
   */
  @GET
  @Path("/shows")
  TvMazeShow lookupByTvdb(@QueryParam("thetvdb") Integer tvdbId);

  /**
   * Търсене на сериал по IMDb ID.
   * Пример: https://api.tvmaze.com/lookup/shows?imdb=tt0944947
   */
  @GET
  @Path("/shows")
  TvMazeShow lookupByImdb(@QueryParam("imdb") String imdbId);
}
