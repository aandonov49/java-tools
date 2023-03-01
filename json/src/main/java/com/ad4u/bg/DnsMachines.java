package com.ad4u.bg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DnsMachines {
    @JsonProperty("dns_list")
    private List<DnsNames> machineList = new ArrayList<DnsNames>();

    public List<DnsNames> getMachineList() {
        return machineList;
    }
}
