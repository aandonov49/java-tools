package com.ad4u.bg;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MergeJson {
  private static final IpTables ipTables = new IpTables();
  private static final DnsMachines dnsList = new DnsMachines();
  static Dhcp dhcp = new Dhcp();
  static Freeradiusauthorizedmacs radius = new Freeradiusauthorizedmacs();

  public static void main(String[] args) throws IOException, JAXBException {
    if (args[0].equals("iptables")) {
      createIptablesFile(args[1], args[2]);
    } else if (args[0].equals("dns")) {
      createDnsFile(args[1], args[2]);
    }
    StringWriter sw = new StringWriter();
    dhcp.getOpt2().getRange().setFrom("10.10.2.5");
    dhcp.getOpt2().getRange().setTo("10.10.2.253");
    JAXBContext context = JAXBContext.newInstance(Dhcp.class);
    Marshaller mar = context.createMarshaller();
    mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
    mar.marshal(dhcp, sw);
    String xml = sw.toString();
    // .replaceAll("xsi:nil=\"true\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"", "");
    System.out.println(xml);
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
              System.out.println(file);
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
      if (ipTables.getSwitchVlans().containsKey(machine.getVLANId())) {
        List<String> data = ipTables.getSwitchVlans().get(machine.getVLANId());
        String row =
            "mac-vlan mac-address "
                + machine.getMac()
                + " vlan "
                + machine.getVLANId()
                + " description \""
                + machine.getSwitchLabel()
                + "\"";
        data.add(row);
        ipTables.getSwitchVlans().put(machine.getVLANId(), data);
      } else {
        List<String> data = new ArrayList<>();
        String row =
            "mac-vlan mac-address "
                + machine.getMac()
                + " vlan "
                + machine.getVLANId()
                + " description \""
                + machine.getSwitchLabel()
                + "\"";
        data.add(row);
        ipTables.getSwitchVlans().put(machine.getVLANId(), data);
      }
      Staticmap staticmap = new Staticmap();
      staticmap.setMac(machine.getMac().toUpperCase());
      staticmap.setIpaddr("10.10.0." + machine.getIp());
      staticmap.setDescr(machine.getId());
      dhcp.getOpt2().getStaticmap().add(staticmap);
      
    }
  }

  private static void readDsnsNamesFromFileIntoJsonList(Path filePath) throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    mapper.readerFor(DnsNames.class);
    DnsNames dnsName = mapper.readValue(filePath.toFile(), DnsNames.class);
    dnsList.getMachineList().add(dnsName);
  }
}
