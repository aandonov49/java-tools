package com.ad4u.bg;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.Response;

import eu.ad4ubg.TvCategory;
import eu.ad4ubg.TvList;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

@Path("/tv")
public class TvResource {

  private static final Logger LOG = Logger.getLogger(TvResource.class);

  @Inject
  TvServiceOldFashioned tvServiceClientOld;

  @ConfigProperty(name = "tv-proxy.username")
  private String username;

  @ConfigProperty(name = "tv-proxy.password")
  private String password;

  @ConfigProperty(name = "tv-proxy.host")
  private String host;

  @ConfigProperty(name = "tv-proxy.port")
  private String port;

  @GET
  @Path("/playlist.m3u")
  @Produces("application/mpegurl") // Казва на браузъра, че това е плейлист
  public Response generateM3uPlaylist() {
    List<TvList> tcList = tvServiceClientOld.fetchTvChannels();
    List<TvCategory> cList = tvServiceClientOld.fetchTvCategories();
    Map<String, TvCategory> tvCategoryMap =
        cList.stream()
            .collect(
                Collectors.toMap(
                    TvCategory::getCategory_id,
                    category -> category,
                    (existing, replacement) -> existing));

    // 2. Използваме StringBuilder за бързо сглобяване на текстовия файл
    StringBuilder m3uContent = new StringBuilder();

    // Задължителен първи ред за всеки M3U файл
    m3uContent.append("#EXTM3U\n");
    m3uContent.append("#EXTVLCOPT:http-user-agent=Giga Navigator/1.0.5 (Linux;Android 12; bg");
    for (TvList tv : tcList) {
      tv.setTvCategory(tvCategoryMap.get(tv.getCategory_id()));
      String streamUrl =
          "http://" + host + ":" + port + "/live/" + username + "/" + password + "/" + tv.getStream_id() + ".ts";
      // #EXTINF:-1 tvg-id="BNT1" tvg-name="BNT1 HD" group-title="НОВИНИ"
      // tvg-logo="http://151.237.24.6:4000/icons/367.png",BNT1 HD
      // http://151.237.24.6:3000/atan/1234/367
      m3uContent.append("\n");
      m3uContent.append("#EXTINF:-1 ");
      m3uContent.append("tvg-id=\"").append(tv.getEpg_channel_id() != null ? tv.getEpg_channel_id() : "").append("\" ");
      m3uContent.append("tvg-name=\"").append(tv.getName()).append("\" ");
      m3uContent.append("group-title=\"").append(tv.getTvCategory().getCategory_name()).append("\" ");
      m3uContent.append("tvg-logo=\"").append(tv.getStream_icon()).append("\" ");
      m3uContent.append(",").append(tv.getName()).append("\n");
      m3uContent.append(streamUrl);
    }
    LOG.info(m3uContent.toString());
    return Response.ok(m3uContent.toString())
        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"playlist.m3u\"")
        .build();

  }
}
