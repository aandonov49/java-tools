package com.ad4u.bg;

import java.util.List;

import eu.ad4ubg.TvList;

public interface RetrieveAndStoreTvChannelsService {
  void init();

  List<TvList> retrieveAndStoreTvChannels();

  String buildM3U();
}
