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
    private Boolean duplicate = false;
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
    @JsonProperty
    private String allias="other";


    public Machine() {
    }

    public Machine(String id, String mac, String ip, Boolean duplicateip, Boolean active, Boolean check_mac, Boolean inet_access, String forward_chain_firewall, String class_download, String class_www, String class_internal, String priority, String order, String allias) {
        this.id = id;
        this.mac = mac;
        this.ip = ip;
        this.duplicate = duplicateip;
        this.active = active;
        this.check_mac = check_mac;
        this.inet_access = inet_access;
        this.forward_chain_firewall = forward_chain_firewall;
        this.class_download = class_download;
        this.class_www = class_www;
        this.class_internal = class_internal;
        this.priority = priority;
        this.order = order;
        this.allias = allias;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Boolean getDuplicate() {
        return duplicate;
    }

    public void setDuplicate(Boolean duplicate) {
        this.duplicate = duplicate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getCheck_mac() {
        return check_mac;
    }

    public void setCheck_mac(Boolean check_mac) {
        this.check_mac = check_mac;
    }

    public Boolean getInet_access() {
        return inet_access;
    }

    public void setInet_access(Boolean inet_access) {
        this.inet_access = inet_access;
    }

    public String getForward_chain_firewall() {
        return forward_chain_firewall;
    }

    public void setForward_chain_firewall(String forward_chain_firewall) {
        this.forward_chain_firewall = forward_chain_firewall;
    }

    public String getClass_download() {
        return class_download;
    }

    public void setClass_download(String class_download) {
        this.class_download = class_download;
    }

    public String getClass_www() {
        return class_www;
    }

    public void setClass_www(String class_www) {
        this.class_www = class_www;
    }

    public String getClass_internal() {
        return class_internal;
    }

    public void setClass_internal(String class_internal) {
        this.class_internal = class_internal;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getAllias() {
        return allias;
    }

    public void setAllias(String allias) {
        this.allias = allias;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "id='" + id + '\'' +
                ", mac='" + mac + '\'' +
                ", ip='" + ip + '\'' +
                ", duplicate=" + duplicate +
                ", active=" + active +
                ", check_mac=" + check_mac +
                ", inet_access=" + inet_access +
                ", forward_chain_firewall='" + forward_chain_firewall + '\'' +
                ", class_download='" + class_download + '\'' +
                ", class_www='" + class_www + '\'' +
                ", class_internal='" + class_internal + '\'' +
                ", priority='" + priority + '\'' +
                ", order='" + order + '\'' +
                ", allias='" + allias + '\'' +
                '}';
    }
}
