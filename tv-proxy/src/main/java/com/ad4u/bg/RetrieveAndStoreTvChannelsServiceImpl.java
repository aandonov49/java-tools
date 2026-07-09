package com.ad4u.bg;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import eu.ad4ubg.TvCategory;
import eu.ad4ubg.TvList;
import io.quarkus.runtime.Startup;
import io.quarkus.scheduler.Scheduled;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

@ApplicationScoped
public class RetrieveAndStoreTvChannelsServiceImpl implements RetrieveAndStoreTvChannelsService {

  private static final Logger LOG = Logger.getLogger(RetrieveAndStoreTvChannelsServiceImpl.class);

  @Inject
  private TvServiceOldFashioned tvServiceClientOld;

  @Inject
  private RedisRepository redisRepository;

  @ConfigProperty(name = "tv-proxy.username")
  private String username;

  @ConfigProperty(name = "tv-proxy.password")
  private String password;

  @ConfigProperty(name = "tv-proxy.host")
  private String host;

  @ConfigProperty(name = "tv-proxy.port")
  private String port;

  /** Runs at startup to pre-populate Redis cache on application boot. */
  @Override
  @Startup
  public void init() {
    this.retrieveAndStoreTvChannels();
  }

  /** Scheduled weekly refresh of the Redis cache (every Sunday at 02:05). */
  @Scheduled(cron = "0 5 2 ? * SUN *")
  public void periodicChannelRefresh() {
    this.retrieveAndStoreTvChannels();
  }

  /**
   * Fetches channels and categories from the upstream provider, stores them separately in Redis, and returns the
   * channel list.
   */
  @Override
  public List<TvList> retrieveAndStoreTvChannels() {
    List<TvList> tcList = tvServiceClientOld.fetchTvChannels();
    List<TvCategory> cList = tvServiceClientOld.fetchTvCategories();
    redisRepository.storeChannelData(tcList);
    redisRepository.storeCategoryData(cList);
    linkCategory(cList, tcList);
    return tcList;
  }

  /** Joins channels with their categories in-memory using category_id as the key. */
  private static void linkCategory(List<TvCategory> cList, List<TvList> tcList) {
    Map<String, TvCategory> tvCategoryMap =
        cList.stream()
            .collect(
                Collectors.toMap(
                    TvCategory::getCategory_id,
                    category -> category,
                    (existing, replacement) -> existing));
    for (TvList tv : tcList) {
      tv.setTvCategory(tvCategoryMap.get(tv.getCategory_id()));
    }
  }

  /**
   * Reads channels and categories from Redis, links them in-memory, and builds an M3U playlist string.
   */
  @Override
  public String buildM3U() {
    List<TvList> tcList = redisRepository.retrieveChannelData();
    List<TvCategory> cList = redisRepository.retrieveCategoryData();
    linkCategory(cList, tcList);

    StringBuilder m3uContent = new StringBuilder();
    m3uContent.append("#EXTM3U\n");
    m3uContent.append("#EXTVLCOPT:http-user-agent=Giga Navigator/1.0.5 (Linux;Android 12; bg");

    for (TvList tv : tcList) {
      // Stream URL format: http://<host>:<port>/live/<user>/<pass>/<stream_id>.ts
      String streamUrl =
          "http://" + host + ":" + port + "/live/" + username + "/" + password + "/" + tv.getStream_id() + ".ts";
      m3uContent.append("\n");
      m3uContent.append("#EXTINF:-1 ");
      m3uContent.append("tvg-id=\"").append(tv.getEpg_channel_id() != null ? tv.getEpg_channel_id() : "").append("\" ");
      m3uContent.append("tvg-name=\"").append(tv.getName()).append("\" ");
      m3uContent.append("group-title=\"")
          .append(tv.getTvCategory() != null ? tv.getTvCategory().getCategory_name() : "")
          .append("\" ");
      m3uContent.append("tvg-logo=\"").append(tv.getStream_icon()).append("\" ");
      m3uContent.append(",").append(tv.getName()).append("\n");
      m3uContent.append(streamUrl);
    }

    LOG.info("Found " + tcList.size() + " channels");
    return m3uContent.toString();
  }
}
