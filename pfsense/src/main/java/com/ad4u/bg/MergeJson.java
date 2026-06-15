package com.ad4u.bg;

import com.fasterxml.jackson.databind.ObjectMapper;
import eu.ad4ubg.*;
import jakarta.xml.bind.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class MergeJson {
  private static final IpTables ipTables = new IpTables();
  private static final DnsMachines dnsList = new DnsMachines();
  private static ObjectFactory factory = new ObjectFactory();
  private static Dhcpd dhcp;
  private static Freeradiusauthorizedmacs radius = factory.createFreeradiusauthorizedmacs();
  private static String blackHoleUrl =
      "https://raw.githubusercontent.com/StevenBlack/hosts/master/alternates/fakenews/hosts";
  private static Map<String, String> aliases = new HashMap<String, String>();
  private static Freeradius freeradiusType;

  public static void main(String[] args) throws IOException, JAXBException, InterruptedException {
    File file = new File(args[args.length - 1]);
    createUniFiCsvFile(args[1], args[2]);
    JAXBContext context = JAXBContext.newInstance(Pfsense.class);
    Marshaller mar = context.createMarshaller();
    Unmarshaller umar = context.createUnmarshaller();
    // Pfsense object = (Pfsense) umar.unmarshal(new FileInputStream(file));
    ////    PfsenseType pfsenseCof1 = (PfsenseType) object.getValue();
    // dhcp = object.getDhcpd();
    //    dhcp.getOpt2().getStaticmap().clear();
    //    dhcp.getOpt5().getStaticmap().clear();
    //    dhcp.getOpt8().getStaticmap().clear();
    //    radius = pfsenseCof1.getInstalledpackages().getFreeradiusauthorizedmacs();
    //    freeradiusType = pfsenseCof1.getInstalledpackages().getFreeradius();
    //    freeradiusType.getConfig().clear();
    //
    //    if (args[0].equals("iptables")) {
    //      createIptablesFile(args[1], args[2]);
    //    } else if (args[0].equals("dns")) {
    //      createDnsFile(args[1], args[2]);
    //    }
    //
    //    StringWriter sw = new StringWriter();
    //
    //    InstalledpackagesType installedpackages = pfsenseCof1.getInstalledpackages();
    //    BindzoneType bindzoneType = installedpackages.getBindzone();
    //    BindzoneType bindzoneTypeNew = new BlackHoleCommunicator().fillRequiredData(blackHoleUrl);
    //    BindzoneType bindzones = new BindzoneType();
    //    List<ConfigType> list = new ArrayList<>();
    //    for (ConfigType confold : bindzoneType.getConfig()) {
    //      List<JAXBElement<?>> elements =
    //          confold.getEnableOrKeepConfOrResolveInterval().stream()
    //              .filter(
    //                  element -> {
    //                    if (((JAXBElement<?>) element).getName().getLocalPart().equals("name")) {
    //                      return (((JAXBElement<?>) element).getValue().equals("ad4u-bg.com")
    //                          || ((JAXBElement<?>)
    // element).getValue().equals("0.1.10.in-addr.arpa"));
    //                    }
    //                    return false;
    //                  })
    //              .collect(Collectors.toList());
    //      if (!elements.isEmpty()) {
    //        list.add(confold);
    //      }
    //    }
    //    List<AliasType> aliasases_new = factory.createAliasesType().getAlias();
    //    AliasesType aliasesType = pfsenseCof1.getAliases();
    //    for (AliasType aliasd : aliasesType.getAlias()) {
    //      List<JAXBElement<?>> ailiasList =
    //          aliasd.getNameOrUrlOrUpdatefreq().stream()
    //              .filter(
    //                  element -> {
    //                    if (((JAXBElement<?>) element).getName().getLocalPart().equals("name")) {
    //                      return !aliases.containsKey(((JAXBElement<?>) element).getValue());
    //                    }
    //                    return false;
    //                  })
    //              .collect(Collectors.toList());
    //      if (!ailiasList.isEmpty()) {
    //        aliasases_new.add(aliasd);
    //      }
    //    }
    //    List<AliasType> aliasases_update = factory.createAliasesType().getAlias();
    //    for (Map.Entry<String, String> entry : aliases.entrySet()) {
    //      AliasType type = factory.createAliasType();
    //      type.getNameOrUrlOrUpdatefreq().add(factory.createAliasTypeName(entry.getKey()));
    //      type.getNameOrUrlOrUpdatefreq().add(factory.createAliasTypeAddress(entry.getValue()));
    //      type.getNameOrUrlOrUpdatefreq().add(factory.createAliasTypeDescr(entry.getKey() + "
    // rule"));
    //      aliasases_update.add(type);
    //    }
    //    pfsenseCof1.getAliases().getAlias().clear();
    //    pfsenseCof1.getAliases().getAlias().addAll(aliasases_new);
    //    pfsenseCof1.getAliases().getAlias().addAll(aliasases_update);
    //    pfsenseCof1.getInstalledpackages().setFreeradius(freeradiusType);
    //    bindzones.getConfig().addAll(list);
    //    //    bindzones.getConfig().addAll(bindzoneTypeNew.getConfig());
    //    //    installedpackages.getBindzone().getConfig().clear();
    //    //    installedpackages.getBindzone().getConfig().addAll(bindzones.getConfig());
    //    //    pfsenseCof1.setInstalledpackages(installedpackages);
    //    pfsenseCof1.setDhcpd(dhcp);
    //
    //    object.setValue(pfsenseCof1);
    //    mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
    //    mar.setProperty(
    //        "org.glassfish.jaxb.characterEscapeHandler", new CustomCharacterEscapeHandler());
    //    mar.marshal(object, sw);
    //    mar.marshal(object, file);
    //    String xml = sw.toString();
    //    // .replaceAll("xsi:nil=\"true\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"",
    // "");
    //    System.out.println(xml);
  }

  private static void createDnsFile(String inputDirectory, String outputFile) throws IOException {
    Path directoryPath = Paths.get(inputDirectory);
    Stream<Path> files =
        Files.find(
            directoryPath,
            1,
            (path, basicFileAttributes) -> {
              File file = path.toFile();
              return !file.isDirectory() && file.getName().contains(".json");
            });
    files
        .sorted()
        .forEach(
            file -> {
              java.lang.System.out.println(file);
              try {
                readDsnsNamesFromFileIntoJsonList(file);
              } catch (IOException e) {
                e.printStackTrace();
              }
            });
    if (!Files.exists(Paths.get(outputFile).toFile().getParentFile().toPath()))
      Files.createDirectory(Paths.get(outputFile).toFile().getParentFile().toPath());
    if (!Files.exists(Paths.get(outputFile))) Files.createFile(Paths.get(outputFile));
    ObjectMapper mapper = new ObjectMapper();
    mapper.readerFor(DnsMachines.class);
    mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFile), dnsList);
  }

  private static void createIptablesFile(String inputDirectory, String outputFile)
      throws IOException {
    Path directoryPath = Paths.get(inputDirectory);
    Stream<Path> files =
        Files.find(
            directoryPath,
            1,
            (path, basicFileAttributes) -> {
              File file = path.toFile();
              return !file.isDirectory() && file.getName().contains(".json");
            });
    files
        .sorted()
        .forEach(
            file -> {
              try {
                readIptablesFromFileIntoJsonList(file);
              } catch (IOException e) {
                e.printStackTrace();
              }
            });
    if (!Files.exists(Paths.get(outputFile).toFile().getParentFile().toPath()))
      Files.createDirectory(Paths.get(outputFile).toFile().getParentFile().toPath());
    if (!Files.exists(Paths.get(outputFile))) Files.createFile(Paths.get(outputFile));
    ObjectMapper mapper = new ObjectMapper();
    mapper.readerFor(IpTables.class);
    mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFile), ipTables);
  }

  private static void createUniFiCsvFile(String inputDirectory, String outputFile)
      throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    Path directoryPath = Paths.get(inputDirectory);
    Stream<Path> files =
        Files.find(
            directoryPath,
            1,
            (path, basicFileAttributes) -> {
              File file = path.toFile();
              return !file.isDirectory() && file.getName().contains(".json");
            });
    List<String> records = new ArrayList<>();
    records.add(
        "\"MAC Address\",\"IP Address\",Hostname,\"Local DNS Record\",\"Lease Type\",Name,\"Expiration Time\"");

    files
        .sorted()
        .forEach(
            file -> {
              try {
                readFromJsonFileAndCreateCsvRecord(mapper, file, records);
              } catch (IOException e) {
                e.printStackTrace();
              }
            });
    if (!Files.exists(Paths.get(outputFile).toFile().getParentFile().toPath()))
      Files.createDirectory(Paths.get(outputFile).toFile().getParentFile().toPath());
    if (!Files.exists(Paths.get(outputFile))) Files.createFile(Paths.get(outputFile));
    File fileOut = new File(outputFile);
    FileWriter fileWriter = new FileWriter(fileOut);
    PrintWriter printWriter = new PrintWriter(fileWriter);
    records.forEach(
        record -> {
          printWriter.println(record);
        });
    printWriter.close();
  }

  private static void readFromJsonFileAndCreateCsvRecord(
      ObjectMapper mapper, Path filePath, List<String> records) throws IOException {
    StringBuilder builder = new StringBuilder();
    mapper.readerFor(Machine.class);
    Machine machine = mapper.readValue(filePath.toFile(), Machine.class);
    if (machine.getActive()) {
      builder.append(machine.getMac()); // MAC
      builder.append(",");
      //String ip = "10.90." + machine.getVlan() + "." + machine.getIp(); // IP
      String ip = "10.90.1." + machine.getIp(); // IP
      builder.append(ip);
      builder.append(",");
      String hostName = machine.getId().replace("_", "");
      hostName = hostName.substring(0, hostName.length() > 10 ? 9 : hostName.length());
      builder.append(""); // HOSTNAME
      builder.append(",");
      builder.append(""); // Local DNS Record
      builder.append(",");
      builder.append("Fixed"); // Lease Type "Fixed/Dynamic"
      builder.append(",");
      builder.append(machine.getId()); // Name
      builder.append(",");
      builder.append(""); // Expiration Time
      records.add(builder.toString());
    }
  }

  private static void readIptablesFromFileIntoJsonList(Path filePath) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    mapper.readerFor(Machine.class);
    Machine machine = mapper.readValue(filePath.toFile(), Machine.class);
    ipTables.getMachineList().add(machine);
    ipTables.getAliaseList().add(machine.getAllias());
    if (ipTables.getAliasesipList().containsKey(machine.getAllias())) {
      String ip = ipTables.getAliasesipList().get(machine.getAllias());
      ip = ip + "10.10.0." + machine.getIp() + " ";
      ipTables.getAliasesipList().put(machine.getAllias(), ip);
    } else {
      String ip = "10.10.0." + machine.getIp() + " ";
      ipTables.getAliasesipList().put(machine.getAllias(), ip);
    }
    if (machine.getActive() && !machine.getDuplicate()) {
      //      //      if (ipTables.getSwitchVlans().containsKey(machine.getVlan())) {
      //      //        List<String> data = ipTables.getSwitchVlans().get(machine.getVlan());
      //      //        String row =
      //      //            "mac-vlan mac-address "
      //      //                + machine.getMac()
      //      //                + " vlan "
      //      //                + machine.getVlan()
      //      //                + " description \""
      //      //                + machine.getSwitchLabel()
      //      //                + "\"";
      //      //        data.add(row);
      //      //        ipTables.getSwitchVlans().put(machine.getVlan(), data);
      //      //      } else {
      //      //        List<String> data = new ArrayList<>();
      //      //        String row =
      //      //            "mac-vlan mac-address "
      //      //                + machine.getMac()
      //      //                + " vlan "
      //      //                + machine.getVlan()
      //      //                + " description \""
      //      //                + machine.getSwitchLabel()
      //      //                + "\"";
      //      //        data.add(row);
      //      //        ipTables.getSwitchVlans().put(machine.getVlan(), data);
      //      //      }
      //      createVlanIpMappingOpt2(machine);
      //      createVlanIpMappingOpt5(machine);
      //      createVlanIpMappingOpt8(machine);
      //      createAliasesNoVlan(machine);
      //      createAliasesVlan10(machine);
      //      freeradiususers(machine);
    }
  }

  private static void readDsnsNamesFromFileIntoJsonList(Path filePath) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    mapper.readerFor(DnsNames.class);
    DnsNames dnsName = mapper.readValue(filePath.toFile(), DnsNames.class);
    dnsList.getMachineList().add(dnsName);
  }

  //  private static void createVlanIpMappingOpt2(Machine machine) {
  //    StaticmapType staticmap = factory.createStaticmapType();
  //    staticmap.setMac(machine.getMac().toUpperCase());
  //    staticmap.setIpaddr("10.10.0." + machine.getIp());
  //    staticmap.setDescr(machine.getId());
  //    staticmap.setHostname(machine.getId());
  //    staticmap.setHostname(machine.getId());
  //    setEmptyFields(staticmap);
  //    dhcp.getOpt2().getStaticmap().add(staticmap);
  //  }

  //  private static void createVlanIpMappingOpt5(Machine machine) {
  //    if (machine.getVlan() == 10) {
  //      StaticmapType staticmap = factory.createStaticmapType();
  //      staticmap.setMac(machine.getMac().toUpperCase());
  //      staticmap.setIpaddr("10.10." + machine.getVlan() + "." + machine.getIp());
  //      staticmap.setDescr(machine.getId());
  //      staticmap.setHostname(machine.getId());
  //      setEmptyFields(staticmap);
  //      dhcp.getOpt5().getStaticmap().add(staticmap);
  //    }
  //  }

  //  private static void createVlanIpMappingOpt8(Machine machine) {
  //    if (machine.getVlan() == 4) {
  //      StaticmapType staticmap = factory.createStaticmapType();
  //      staticmap.setMac(machine.getMac().toUpperCase());
  //      staticmap.setIpaddr("10.10." + machine.getVlan() + "." + machine.getIp());
  //      staticmap.setDescr(machine.getId());
  //      staticmap.setHostname(machine.getId());
  //      setEmptyFields(staticmap);
  //      dhcp.getOpt8().getStaticmap().add(staticmap);
  //    }
  //  }

  private static void createAliasesNoVlan(Machine machine) {
    String aliastext = "";
    if (aliases.containsKey(machine.getAllias())) {
      aliastext = aliases.get(machine.getAllias());
      aliastext = aliastext + " " + "10.10.0." + machine.getIp();
    } else {
      aliastext = "10.10.0." + machine.getIp();
    }
    aliases.put(machine.getAllias(), aliastext);
  }

  private static void createAliasesVlan10(Machine machine) {
    String aliastext = "";
    if (machine.getVlan() == 10) {
      if (aliases.containsKey(machine.getAllias() + machine.getVlan())) {
        aliastext = aliases.get(machine.getAllias() + machine.getVlan());
        aliastext = aliastext + " " + "10.10." + machine.getVlan() + "." + machine.getIp();
      } else {
        aliastext = "10.10." + machine.getVlan() + "." + machine.getIp();
      }
      aliases.put((machine.getAllias() + machine.getVlan()), aliastext);
    }
  }

  //  public static void setEmptyFields(StaticmapType staticmap) {
  //    staticmap.setCid("");
  //    staticmap.setArpTableStaticEntry("");
  //    staticmap.setFilename("");
  //    staticmap.setRootpath("");
  //    staticmap.setDefaultleasetime("");
  //    staticmap.setMaxleasetime("");
  //    staticmap.setGateway("");
  //    staticmap.setDomain("");
  //    staticmap.setDomainsearchlist("");
  //    staticmap.setDdnsdomain("");
  //    staticmap.setDdnsdomainkey("");
  //    staticmap.setDdnsdomainkeyalgorithm("");
  //    staticmap.setDdnsdomainkeyname("");
  //    staticmap.setDdnsdomainprimary("");
  //    staticmap.setDdnsdomainsecondary("");
  //    staticmap.setTftp("");
  //    staticmap.setLdap("");
  //    staticmap.setNextserver("");
  //    staticmap.setFilename32("");
  //    staticmap.setFilename32Arm("");
  //    staticmap.setFilename64("");
  //    staticmap.setFilename64Arm("");
  //    staticmap.setUefihttpboot("");
  //    staticmap.setNumberoptions("");
  //  }

  //  private static void freeradiususers(Machine machine) {
  //    if (machine.getVlan() > 1) {
  //      ConfigType config = factory.createConfigType();
  //      config
  //          .getEnableOrKeepConfOrResolveInterval()
  //          .add(
  //              factory.createConfigTypeVarusersusername(
  //                  machine.getMac().replaceAll(":", "").toLowerCase()));
  //      config
  //          .getEnableOrKeepConfOrResolveInterval()
  //          .add(
  //              factory.createConfigTypeVaruserspassword(
  //                  machine.getMac().replaceAll(":", "").toLowerCase()));
  //      config
  //          .getEnableOrKeepConfOrResolveInterval()
  //          .add(factory.createConfigTypeVarusersauthmethod("motp"));
  //      config
  //          .getEnableOrKeepConfOrResolveInterval()
  //          .add(factory.createConfigTypeDescription(machine.getId()));
  //      config
  //          .getEnableOrKeepConfOrResolveInterval()
  //          .add(factory.createConfigTypeVaruserspointoftime("Daily"));
  //      config
  //          .getEnableOrKeepConfOrResolveInterval()
  //          .add(factory.createConfigTypeVarusersmaxtotaloctetstimerange("daily"));
  //      config
  //          .getEnableOrKeepConfOrResolveInterval()
  //          .add(factory.createConfigTypeVarusersvlanid(machine.getVlan().byteValue()));
  //      freeradiusType.getConfig().add(config);
  //    }
  //  }
}
