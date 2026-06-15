package com.ad4u.bg;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import com.ad4u.bg.providers.JsonObjectMapperProvider;
import eu.ad4ubg.TvList;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "tv-api")
@RegisterProvider(JsonObjectMapperProvider.class)
public interface TvServiceClient {
  @GET
  @Path("/channels")
  @Produces(MediaType.APPLICATION_JSON)
  List<TvList> getTvChannels();
}
