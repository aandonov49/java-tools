package com.ad4u.bg.restclient;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import com.ad4u.bg.pojo.EmbyIdentifyRequest;
import com.ad4u.bg.pojo.EmbyItemsResponse;
import com.ad4u.bg.pojo.EmbyRemoteSearchRequest;
import com.ad4u.bg.pojo.EmbySearchResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "emby-api")
@Path("/emby")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface EmbyClient {

  // СТЪПКА 1 (ЗА СЕРИАЛИ): Отдалечено търсене на сериали през Emby
  @POST
  @Path("/Items/RemoteSearch/Series") // <--- Специфичен път за сериали
  List<EmbySearchResponse> remoteSearchSeries(
      @QueryParam("api_key") String apiKey,
      EmbyRemoteSearchRequest request);

  // СТЪПКА 2: Нулиране на метаданните (Работи еднакво за филми и сериали)
  @POST
  @Path("/items/metadata/reset")
  void resetMetadata(
      @QueryParam("api_key") String apiKey,
      @QueryParam("ItemIds") String itemIds);

  // СТЪПКА 3: Прилагане на идентификацията (Работи еднакво за филми и сериали)
  @POST
  @Path("/Items/RemoteSearch/Apply/{itemId}")
  void applyIdentify(
      @PathParam("itemId") String itemId,
      @QueryParam("api_key") String apiKey,
      @QueryParam("ReplaceAllImages") boolean replaceImages,
      @QueryParam("ReplaceAllMetadata") boolean replaceMetadata,
      EmbyIdentifyRequest request);

  // СТЪПКА 4: Принудително обновяване (Работи еднакво за филми и сериали)
  @POST
  @Path("/Items/{itemId}/Refresh")
  void refreshItem(
      @PathParam("itemId") String itemId,
      @QueryParam("api_key") String apiKey,
      @QueryParam("MetadataRefreshMode") String metadataMode,
      @QueryParam("ImageRefreshMode") String imageMode,
      @QueryParam("ReplaceAllImages") boolean replaceImages,
      @QueryParam("ReplaceAllMetadata") boolean replaceMetadata);

  // Извличане на елементи (Ще подаваме "Series" като IncludeItemTypes)
  @GET
  @Path("/Items")
  EmbyItemsResponse getItems(
      @QueryParam("api_key") String apiKey,
      @QueryParam("IncludeItemTypes") String itemTypes,
      @QueryParam("Recursive") boolean recursive);

  @GET
  @Path("/Items")
  EmbyItemsResponse getItems(
      @QueryParam("api_key") String apiKey,
      @QueryParam("IncludeItemTypes") String itemTypes,
      @QueryParam("Recursive") boolean recursive,
      @QueryParam("Fields") String fields // Подавайте "Path,ProviderIds,Overview"
  );

  @POST
  @Path("/Items/RemoteSearch/Movie")
  List<EmbySearchResponse> remoteSearchMovie( // <--- Променено на List
      @QueryParam("api_key") String apiKey,
      EmbyRemoteSearchRequest request);
}
