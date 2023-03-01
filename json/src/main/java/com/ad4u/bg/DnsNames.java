package com.ad4u.bg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DnsNames {
    @JsonProperty
    private String id;
    @JsonProperty
    private Boolean active;
    @JsonProperty("wwww_exist")
    private String wwwwexist;
    @JsonProperty
    private Boolean isNs;
    @JsonProperty
    private Boolean isMail;
    @JsonProperty
    private String document_root;
    @JsonProperty
    private String ip;

    public DnsNames() {
    }

    public DnsNames(String id, Boolean active, String wwwwexist, Boolean isNs, Boolean isMail, String document_root, String ip) {
        this.id = id;
        this.active = active;
        this.wwwwexist = wwwwexist;
        this.isNs = isNs;
        this.isMail = isMail;
        this.document_root = document_root;
        this.ip = ip;
    }

    public String getId() {
        return id;
    }

    public Boolean getActive() {
        return active;
    }

    public String getWwwwexist() {
        return wwwwexist;
    }

    public Boolean getNs() {
        return isNs;
    }

    public Boolean getMail() {
        return isMail;
    }

    public String getDocument_root() {
        return document_root;
    }

    public String getIp() {
        return ip;
    }

    @Override
    public String toString() {
        return "DnsNames{" +
                "id='" + id + '\'' +
                ", active=" + active +
                ", wwwwexist='" + wwwwexist + '\'' +
                ", isNs=" + isNs +
                ", isMail=" + isMail +
                ", document_root='" + document_root + '\'' +
                '}';
    }
}
