package com.ad4u.bg.network;

import eu.ad4ubg.Bindzone;
import eu.ad4ubg.Config;
import eu.ad4ubg.ObjectFactory;
import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BlackHoleCommunicator {
  private HttpClient blackHoleHttpClient;
  private Bindzone bindzones = new Bindzone();
  private ObjectFactory factory = new ObjectFactory();

  public Bindzone fillRequiredData(String blackHoleListUrl)
      throws IOException, InterruptedException {
    blackHoleHttpClient =
        HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(10))
            .build();

    HttpRequest request =
        HttpRequest.newBuilder()
            .GET()
            .uri(URI.create(blackHoleListUrl))
            .setHeader("User-Agent", "Java 11 HttpClient") // add request header
            .build();
    InputStream response =
        blackHoleHttpClient.send(request, HttpResponse.BodyHandlers.ofInputStream()).body();
    BufferedReader reader = new BufferedReader(new InputStreamReader(response));
    Stream<String> stream = reader.lines();
    List<Config> list =
        stream
            .filter(line -> line.contains("0.0.0.0"))
            .map(this::parseLine)
            .filter(Objects::nonNull)
            .collect(Collectors.toList());
    bindzones.getConfig().addAll(list);
    return bindzones;
  }

  public Config parseLine(String line) {
    String[] string = line.split(" ");
    if (!string[string.length - 1].equals("0.0.0.0")) {
      Config config = factory.createConfig();
      config
          .getEnableOrKeepConfOrResolveInterval()
          .add(factory.createName(string[string.length - 1]));
      config.getEnableOrKeepConfOrResolveInterval().add(factory.createType("master"));
      config.getEnableOrKeepConfOrResolveInterval().add(factory.createView("internal"));
      config.getEnableOrKeepConfOrResolveInterval().add(factory.createNameserver("ad4u-bg.black"));
      config.getEnableOrKeepConfOrResolveInterval().add(factory.createRefresh("1d"));
      config.getEnableOrKeepConfOrResolveInterval().add(factory.createExpire("4w"));
      config.getEnableOrKeepConfOrResolveInterval().add(factory.createRetry("2h"));
      config
          .getEnableOrKeepConfOrResolveInterval()
          .add(factory.createAllowquery("localhost,localnets"));
      config.getEnableOrKeepConfOrResolveInterval().add(factory.createAllowupdate("none"));
      eu.ad4ubg.Row row = factory.createRow();
      row.getContent().add(factory.createHostname("@"));
      row.getContent().add(factory.createHosttype("A"));
      row.getContent().add(factory.createHostdst("0.0.0.0"));
      config.getEnableOrKeepConfOrResolveInterval().add(row);
      row = factory.createRow();
      row.getContent().add(factory.createHostname("*"));
      row.getContent().add(factory.createHosttype("A"));
      row.getContent().add(factory.createHostdst("0.0.0.0"));
      config.getEnableOrKeepConfOrResolveInterval().add(row);
      return config;
    }
    return null;
  }
}
