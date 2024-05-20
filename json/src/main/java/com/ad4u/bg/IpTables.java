package com.ad4u.bg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

/**
 * The type Ip tables.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IpTables {
    @JsonProperty("iptables")
    private List<Machine> machineList = new ArrayList<Machine>();

    @JsonProperty("aliases")
    private Set<String> aliaseList = new HashSet<>();
    @JsonProperty("aliasesips")
    private Map<String,String> aliasesipList = new HashMap<>();

    /**
     * Gets machine list.
     *
     * @return the machine list
     */
    public List<Machine> getMachineList() {
        return machineList;
    }

    public Set<String> getAliaseList() {
        return aliaseList;
    }

    public Map<String, String> getAliasesipList() {
        return aliasesipList;
    }
}
