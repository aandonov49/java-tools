package com.ad4u.bg;

import java.util.List;

import eu.ad4ubg.TvCategory;
import eu.ad4ubg.TvList;

public interface RedisRepository {
  void storeChannelData(List<TvList> tcList);

  void storeCategoryData(List<TvCategory> cList);

  List<TvList> retrieveChannelData();

  List<TvCategory> retrieveCategoryData();
}
