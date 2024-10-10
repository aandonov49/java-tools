package com.ad4u.bg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class NetworkInterface {

  @XmlElement(required = true, nillable = true)
  private Range range;

  @XmlElement(required = true, nillable = true)
  private String failover_peerip = "";

  @XmlElement(required = true, nillable = true)
  private String defaultleasetime = "";

  @XmlElement(required = true, nillable = true)
  private String maxleasetime = "";

  @XmlElement(required = true, nillable = true)
  private String netmask = "";

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
  private String ddnsdomainprimaryport = "";

  @XmlElement(required = true, nillable = true)
  private String ddnsdomainsecondary = "";

  @XmlElement(required = true, nillable = true)
  private String ddnsdomainsecondaryport = "";

  @XmlElement(required = true, nillable = true)
  private String ddnsdomainkeyname = "";

  @XmlElement(required = true, nillable = true)
  private String ddnsdomainkeyalgorithm = "";

  @XmlElement(required = true, nillable = true)
  private String ddnsdomainkey = "";

  @XmlElement(required = true, nillable = true)
  private String mac_allow = "";

  @XmlElement(required = true, nillable = true)
  private String mac_deny = "";

  @XmlElement(required = true, nillable = true)
  private String ddnsclientupdates = "";

  @XmlElement(required = true, nillable = true)
  private String tftp = "";

  @XmlElement(required = true, nillable = true)
  private String ldap = "";

  @XmlElement(required = true, nillable = true)
  private String nextserver = "";

  @XmlElement(required = true, nillable = true)
  private String filename = "";

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
  private String rootpath = "";

  @XmlElement(required = true, nillable = true)
  private String numberoptions = "";

  @XmlElement(required = true, nillable = true)
  private List<Staticmap> staticmap;

  @XmlElement(required = true, nillable = true)
  private String denyunknown = "";

  @XmlElement(required = true, nillable = true)
  private Pool pool;

  @XmlElement(required = true, nillable = true)
  private String enable = "";

  @XmlElement(required = true, nillable = true)
  private List<String> dnsserver;

  @XmlElement(required = true, nillable = true)
  private String ntpserver = "";

  public NetworkInterface() {
    range = new Range();
    pool = new Pool();
    staticmap = new ArrayList<>();
    dnsserver = new ArrayList<>();
  }

  public Range getRange() {
    return range;
  }

  public void setRange(Range range) {
    this.range = range;
  }

  private String getFailover_peerip() {
    return failover_peerip;
  }

  public void setFailover_peerip(String failover_peerip) {
    this.failover_peerip = failover_peerip;
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

  private String getNetmask() {
    return netmask;
  }

  public void setNetmask(String netmask) {
    this.netmask = netmask;
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

  private String getDdnsdomainprimaryport() {
    return ddnsdomainprimaryport;
  }

  public void setDdnsdomainprimaryport(String ddnsdomainprimaryport) {
    this.ddnsdomainprimaryport = ddnsdomainprimaryport;
  }

  private String getDdnsdomainsecondary() {
    return ddnsdomainsecondary;
  }

  public void setDdnsdomainsecondary(String ddnsdomainsecondary) {
    this.ddnsdomainsecondary = ddnsdomainsecondary;
  }

  private String getDdnsdomainsecondaryport() {
    return ddnsdomainsecondaryport;
  }

  public void setDdnsdomainsecondaryport(String ddnsdomainsecondaryport) {
    this.ddnsdomainsecondaryport = ddnsdomainsecondaryport;
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

  private String getMac_allow() {
    return mac_allow;
  }

  public void setMac_allow(String mac_allow) {
    this.mac_allow = mac_allow;
  }

  private String getMac_deny() {
    return mac_deny;
  }

  public void setMac_deny(String mac_deny) {
    this.mac_deny = mac_deny;
  }

  private String getDdnsclientupdates() {
    return ddnsclientupdates;
  }

  public void setDdnsclientupdates(String ddnsclientupdates) {
    this.ddnsclientupdates = ddnsclientupdates;
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

  private String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
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

  private String getRootpath() {
    return rootpath;
  }

  public void setRootpath(String rootpath) {
    this.rootpath = rootpath;
  }

  private String getNumberoptions() {
    return numberoptions;
  }

  public void setNumberoptions(String numberoptions) {
    this.numberoptions = numberoptions;
  }

  public List<Staticmap> getStaticmap() {
    return staticmap;
  }

  public void setStaticmap(List<Staticmap> staticmap) {
    this.staticmap = staticmap;
  }

  private String getDenyunknown() {
    return denyunknown;
  }

  public void setDenyunknown(String denyunknown) {
    this.denyunknown = denyunknown;
  }

  public Pool getPool() {
    return pool;
  }

  public void setPool(Pool pool) {
    this.pool = pool;
  }

  private String getEnable() {
    return enable;
  }

  public void setEnable(String enable) {
    this.enable = enable;
  }

  public List<String> getDnsserver() {
    return dnsserver;
  }

  public void setDnsserver(List<String> dnsserver) {
    this.dnsserver = dnsserver;
  }

  private String getNtpserver() {
    return ntpserver;
  }

  public void setNtpserver(String ntpserver) {
    this.ntpserver = ntpserver;
  }
}
