package com.ad4u.bg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Staticmap {
  @XmlElement(required = true, nillable = true)
  private String mac = "";

  @XmlElement(required = true, nillable = true)
  private String cid = "";

  @XmlElement(required = true, nillable = true)
  private String ipaddr = "";

  @XmlElement(required = true, nillable = true)
  private String hostname = "";

  @XmlElement(required = true, nillable = true)
  private String descr = "";

  @XmlElement(required = true, nillable = true)
  private String arp_table_static_entry = "";

  @XmlElement(required = true, nillable = true)
  private String filename = "";

  @XmlElement(required = true, nillable = true)
  private String rootpath = "";

  @XmlElement(required = true, nillable = true)
  private String defaultleasetime = "";

  @XmlElement(required = true, nillable = true)
  private String maxleasetime = "";

  @XmlElement(required = true, nillable = true)
  private String gateway = "";

  @XmlElement(required = true, nillable = true)
  private String domain = "";

  @XmlElement(required = true, nillable = true)
  private String domainsearchlist = "";

  @XmlElement(required = true, nillable = true)
  private String ddnsdomain = "";

  @XmlElement(required = true, nillable = true)
  private String ddnsdomainprimary = "";

  @XmlElement(required = true, nillable = true)
  private String ddnsdomainsecondary = "";

  @XmlElement(required = true, nillable = true)
  private String ddnsdomainkeyname = "";

  @XmlElement(required = true, nillable = true)
  private String ddnsdomainkeyalgorithm = "";

  @XmlElement(required = true, nillable = true)
  private String ddnsdomainkey = "";

  @XmlElement(required = true, nillable = true)
  private String tftp = "";

  @XmlElement(required = true, nillable = true)
  private String ldap = "";

  @XmlElement(required = true, nillable = true)
  private String nextserver = "";

  @XmlElement(required = true, nillable = true)
  private String filename32 = "";

  @XmlElement(required = true, nillable = true)
  private String filename64 = "";

  @XmlElement(required = true, nillable = true)
  private String filename32arm = "";

  @XmlElement(required = true, nillable = true)
  private String filename64arm = "";

  @XmlElement(required = true, nillable = true)
  private String uefihttpboot = "";

  @XmlElement(required = true, nillable = true)
  private String numberoptions = "";

  private String getMac() {
    return mac;
  }

  public void setMac(String mac) {
    this.mac = mac;
  }

  private String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }

  private String getIpaddr() {
    return ipaddr;
  }

  public void setIpaddr(String ipaddr) {
    this.ipaddr = ipaddr;
  }

  private String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  private String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }

  private String getArp_table_static_entry() {
    return arp_table_static_entry;
  }

  public void setArp_table_static_entry(String arp_table_static_entry) {
    this.arp_table_static_entry = arp_table_static_entry;
  }

  private String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  private String getRootpath() {
    return rootpath;
  }

  public void setRootpath(String rootpath) {
    this.rootpath = rootpath;
  }

  private String getDefaultleasetime() {
    return defaultleasetime;
  }

  public void setDefaultleasetime(String defaultleasetime) {
    this.defaultleasetime = defaultleasetime;
  }

  private String getMaxleasetime() {
    return maxleasetime;
  }

  public void setMaxleasetime(String maxleasetime) {
    this.maxleasetime = maxleasetime;
  }

  private String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  private String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  private String getDomainsearchlist() {
    return domainsearchlist;
  }

  public void setDomainsearchlist(String domainsearchlist) {
    this.domainsearchlist = domainsearchlist;
  }

  private String getDdnsdomain() {
    return ddnsdomain;
  }

  public void setDdnsdomain(String ddnsdomain) {
    this.ddnsdomain = ddnsdomain;
  }

  private String getDdnsdomainprimary() {
    return ddnsdomainprimary;
  }

  public void setDdnsdomainprimary(String ddnsdomainprimary) {
    this.ddnsdomainprimary = ddnsdomainprimary;
  }

  private String getDdnsdomainsecondary() {
    return ddnsdomainsecondary;
  }

  public void setDdnsdomainsecondary(String ddnsdomainsecondary) {
    this.ddnsdomainsecondary = ddnsdomainsecondary;
  }

  private String getDdnsdomainkeyname() {
    return ddnsdomainkeyname;
  }

  public void setDdnsdomainkeyname(String ddnsdomainkeyname) {
    this.ddnsdomainkeyname = ddnsdomainkeyname;
  }

  private String getDdnsdomainkeyalgorithm() {
    return ddnsdomainkeyalgorithm;
  }

  public void setDdnsdomainkeyalgorithm(String ddnsdomainkeyalgorithm) {
    this.ddnsdomainkeyalgorithm = ddnsdomainkeyalgorithm;
  }

  private String getDdnsdomainkey() {
    return ddnsdomainkey;
  }

  public void setDdnsdomainkey(String ddnsdomainkey) {
    this.ddnsdomainkey = ddnsdomainkey;
  }

  private String getTftp() {
    return tftp;
  }

  public void setTftp(String tftp) {
    this.tftp = tftp;
  }

  private String getLdap() {
    return ldap;
  }

  public void setLdap(String ldap) {
    this.ldap = ldap;
  }

  private String getNextserver() {
    return nextserver;
  }

  public void setNextserver(String nextserver) {
    this.nextserver = nextserver;
  }

  private String getFilename32() {
    return filename32;
  }

  public void setFilename32(String filename32) {
    this.filename32 = filename32;
  }

  private String getFilename64() {
    return filename64;
  }

  public void setFilename64(String filename64) {
    this.filename64 = filename64;
  }

  private String getFilename32arm() {
    return filename32arm;
  }

  public void setFilename32arm(String filename32arm) {
    this.filename32arm = filename32arm;
  }

  private String getFilename64arm() {
    return filename64arm;
  }

  public void setFilename64arm(String filename64arm) {
    this.filename64arm = filename64arm;
  }

  private String getUefihttpboot() {
    return uefihttpboot;
  }

  public void setUefihttpboot(String uefihttpboot) {
    this.uefihttpboot = uefihttpboot;
  }

  private String getNumberoptions() {
    return numberoptions;
  }

  public void setNumberoptions(String numberoptions) {
    this.numberoptions = numberoptions;
  }
}
