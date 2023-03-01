package com.ad4u.bg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IpTables {
    @JsonProperty("iptables")
    private List<Machine> machineList = new ArrayList<Machine>();

    public List<Machine> getMachineList() {
        return machineList;
    }
}
