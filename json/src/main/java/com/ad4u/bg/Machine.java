package com.ad4u.bg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Machine {
    @JsonProperty
    private String id;
    @JsonProperty
    private String mac;
    @JsonProperty
    private String ip;
    @JsonProperty
    private Boolean active;
    @JsonProperty
    private Boolean check_mac;
    @JsonProperty
    private Boolean inet_access;
    @JsonProperty
    private String forward_chain_firewall;
    @JsonProperty
    private String class_download;
    @JsonProperty
    private String class_www;
    @JsonProperty
    private String class_internal;
    @JsonProperty
    private String priority;
    @JsonProperty
    private String order;

    public Machine() {
    }

    public Machine(String id, String mac, String ip, Boolean active, Boolean check_mac, Boolean inet_access, String forward_chain_firewall, String class_download, String class_www, String class_internal, String priority, String order) {
        this.id = id;
        this.mac = mac;
        this.ip = ip;
        this.active = active;
        this.check_mac = check_mac;
        this.inet_access = inet_access;
        this.forward_chain_firewall = forward_chain_firewall;
        this.class_download = class_download;
        this.class_www = class_www;
        this.class_internal = class_internal;
        this.priority = priority;
        this.order = order;
    }

    public String getId() {
        return id;
    }

    public String getMac() {
        return mac;
    }

    public String getIp() {
        return ip;
    }

    public Boolean getActive() {
        return active;
    }

    public Boolean getCheck_mac() {
        return check_mac;
    }

    public Boolean getInet_access() {
        return inet_access;
    }

    public String getForward_chain_firewall() {
        return forward_chain_firewall;
    }

    public String getClass_download() {
        return class_download;
    }

    public String getClass_www() {
        return class_www;
    }

    public String getClass_internal() {
        return class_internal;
    }

    public String getPriority() {
        return priority;
    }

    public String getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "id='" + id + '\'' +
                ", mac='" + mac + '\'' +
                ", ip='" + ip + '\'' +
                ", active=" + active +
                ", check_mac=" + check_mac +
                ", inet_access=" + inet_access +
                ", forward_chain_firewall='" + forward_chain_firewall + '\'' +
                ", class_download='" + class_download + '\'' +
                ", class_www='" + class_www + '\'' +
                ", class_internal='" + class_internal + '\'' +
                ", priority='" + priority + '\'' +
                ", order='" + order + '\'' +
                '}';
    }
}
