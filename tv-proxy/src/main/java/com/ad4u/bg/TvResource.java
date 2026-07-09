package com.ad4u.bg;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.Response;

import org.jboss.logging.Logger;

@Path("/tv")
public class TvResource {

  private static final Logger LOG = Logger.getLogger(TvResource.class);

  @Inject
  RetrieveAndStoreTvChannelsService tvServiceClientOld;

  @GET
  @Path("/playlist.m3u")
  @Produces("application/mpegurl") // Казва на браузъра, че това е плейлист
  public Response generateM3uPlaylist() {
    return Response.ok(tvServiceClientOld.buildM3U())
        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"playlist.m3u\"")
        .build();

  }
}
