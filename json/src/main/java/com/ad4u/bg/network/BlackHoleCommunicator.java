package com.ad4u.bg.network;

import eu.ad4ubg.BindzoneType;
import eu.ad4ubg.ConfigType;
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
  private BindzoneType bindzones = new BindzoneType();
  private ObjectFactory factory = new ObjectFactory();

  public BindzoneType fillRequiredData(String blackHoleListUrl)
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
    List<ConfigType> list =
        stream
            .filter(line -> line.contains("0.0.0.0"))
            .map(this::parseLine)
            .filter(Objects::nonNull)
            .collect(Collectors.toList());
    bindzones.getConfig().addAll(list);
    return bindzones;
  }

  public ConfigType parseLine(String line) {
    String[] string = line.split(" ");
    if (!string[string.length - 1].equals("0.0.0.0")) {
      ConfigType config = factory.createConfigType();
      config
          .getEnableOrKeepConfOrResolveInterval()
          .add(factory.createMenuTypeName(string[string.length - 1]));
      config.getEnableOrKeepConfOrResolveInterval().add(factory.createConfigTypeType("master"));
      config.getEnableOrKeepConfOrResolveInterval().add(factory.createConfigTypeView("internal"));
      config
          .getEnableOrKeepConfOrResolveInterval()
          .add(factory.createConfigTypeNameserver("ad4u-bg.black"));
      config.getEnableOrKeepConfOrResolveInterval().add(factory.createConfigTypeRefresh("1d"));
      config.getEnableOrKeepConfOrResolveInterval().add(factory.createConfigTypeExpire("4w"));
      config.getEnableOrKeepConfOrResolveInterval().add(factory.createConfigTypeRetry("2h"));
      config
          .getEnableOrKeepConfOrResolveInterval()
          .add(factory.createConfigTypeAllowquery("localhost,localnets"));
      config
          .getEnableOrKeepConfOrResolveInterval()
          .add(factory.createConfigTypeAllowupdate("none"));
      eu.ad4ubg.RowType row = factory.createRowType();
      row.setHostname("@");
      row.setHosttype("A");
      row.setHostdst("0.0.0.0");
      config.getEnableOrKeepConfOrResolveInterval().add(factory.createConfigTypeRow(row));
      row = factory.createRowType();
      row.setHostname("*");
      row.setHosttype("A");
      row.setHostdst("0.0.0.0");
      config.getEnableOrKeepConfOrResolveInterval().add(factory.createConfigTypeRow(row));
      return config;
    }
    return null;
  }
}
