package com.ad4u.bg;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MergeJson {
    private static final IpTables ipTables = new IpTables();
    private static final DnsMachines dnsList = new DnsMachines();

    public static void main(String[] args) throws IOException {
        if (args[0].equals("iptables")) {
            createIptablesFile(args[1], args[2]);
        } else if (args[0].equals("dns")) {
            createDnsFile(args[1], args[2]);
        }
    }

    private static void createDnsFile(String inputDirectory, String outputFile) throws IOException {
        Path directoryPath = Paths.get(inputDirectory);
        Stream<Path> files = Files.find(directoryPath, 1, (path, basicFileAttributes) -> {
            File file = path.toFile();
            return !file.isDirectory() &&
                    file.getName().contains(".json");
        });
        files.sorted().forEach(file -> {
                    System.out.println(file);
                    try {
                        readDsnsNamesFromFileIntoJsonList(file);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        );
        if (!Files.exists(Paths.get(outputFile).toFile().getParentFile().toPath()))
            Files.createDirectory(Paths.get(outputFile).toFile().getParentFile().toPath());
        if (!Files.exists(Paths.get(outputFile)))
            Files.createFile(Paths.get(outputFile));
        ObjectMapper mapper = new ObjectMapper();
        mapper.readerFor(DnsMachines.class);
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFile), dnsList);
    }

    private static void createIptablesFile(String inputDirectory, String outputFile) throws IOException {
        Path directoryPath = Paths.get(inputDirectory);
        Stream<Path> files = Files.find(directoryPath, 1, (path, basicFileAttributes) -> {
            File file = path.toFile();
            return !file.isDirectory() &&
                    file.getName().contains(".json");
        });
        files.sorted().forEach(file -> {
                    try {
                        readIptablesFromFileIntoJsonList(file);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        );
        if (!Files.exists(Paths.get(outputFile).toFile().getParentFile().toPath()))
            Files.createDirectory(Paths.get(outputFile).toFile().getParentFile().toPath());
        if (!Files.exists(Paths.get(outputFile)))
            Files.createFile(Paths.get(outputFile));
        ObjectMapper mapper = new ObjectMapper();
        mapper.readerFor(IpTables.class);
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFile), ipTables);
    }

    private static void readIptablesFromFileIntoJsonList(Path filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readerFor(Machine.class);
        Machine machine = mapper.readValue(filePath.toFile(), Machine.class);
        ipTables.getMachineList().add(machine);
    }

    private static void readDsnsNamesFromFileIntoJsonList(Path filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readerFor(DnsNames.class);
        DnsNames dnsName = mapper.readValue(filePath.toFile(), DnsNames.class);
        dnsList.getMachineList().add(dnsName);
    }
}
