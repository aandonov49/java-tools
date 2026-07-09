package com.ad4u.bg;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import eu.ad4ubg.TvCategory;
import eu.ad4ubg.TvList;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@ApplicationScoped
public class RedisRepositoryImpl implements RedisRepository {

  private static final Logger LOG = Logger.getLogger(RedisRepositoryImpl.class);

  private static final String KEY_CHANNELS = "channels:all";
  private static final String KEY_CATEGORIES = "category:all";

  @Inject
  ObjectMapper objectMapper;

  @ConfigProperty(name = "redis.host", defaultValue = "localhost")
  String redisHost;

  @ConfigProperty(name = "redis.port", defaultValue = "6379")
  int redisPort;

  private volatile JedisPool pool;

  private JedisPool pool() {
    if (pool == null)
      pool = new JedisPool(redisHost, redisPort);
    return pool;
  }

  @Override
  public void storeChannelData(List<TvList> tcList) {
    try (Jedis jedis = pool().getResource()) {
      jedis.set(KEY_CHANNELS, objectMapper.writeValueAsString(tcList));
    } catch (JsonProcessingException e) {
      LOG.error(e.getMessage());
    }
  }

  @Override
  public void storeCategoryData(List<TvCategory> cList) {
    try (Jedis jedis = pool().getResource()) {
      jedis.set(KEY_CATEGORIES, objectMapper.writeValueAsString(cList));
    } catch (JsonProcessingException e) {
      LOG.error(e.getMessage());
    }
  }

  @Override
  public List<TvList> retrieveChannelData() {
    try (Jedis jedis = pool().getResource()) {
      String json = jedis.get(KEY_CHANNELS);
      if (json == null)
        return List.of();
      return objectMapper.readValue(json, new TypeReference<List<TvList>>() {
      });
    } catch (Exception e) {
      LOG.error(e.getMessage());
      return List.of();
    }
  }

  @Override
  public List<TvCategory> retrieveCategoryData() {
    try (Jedis jedis = pool().getResource()) {
      String json = jedis.get(KEY_CATEGORIES);
      if (json == null)
        return List.of();
      return objectMapper.readValue(json, new TypeReference<List<TvCategory>>() {
      });
    } catch (Exception e) {
      LOG.error(e.getMessage());
      return List.of();
    }
  }
}
