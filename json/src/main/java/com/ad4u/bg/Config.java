package com.ad4u.bg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Config {

  @XmlElement(required = true, nillable = true)
  public String sortable = "";

  @XmlElement(required = true, nillable = true)
  public String varmacsaddress = "";

  @XmlElement(required = true, nillable = true)
  public String varmacsswisprredirectionurl = "";

  @XmlElement(required = true, nillable = true)
  public String varmacssimultaneousconnect = "";

  @XmlElement(required = true, nillable = true)
  public String description = "";

  @XmlElement(required = true, nillable = true)
  public String varmacsframedipaddress = "";

  @XmlElement(required = true, nillable = true)
  public String varmacsframedipnetmask = "";

  @XmlElement(required = true, nillable = true)
  public String varmacsframedroute = "";

  @XmlElement(required = true, nillable = true)
  public String varmacsframedip6address = "";

  @XmlElement(required = true, nillable = true)
  public String varmacsframedip6route = "";

  @XmlElement(required = true, nillable = true)
  public int varmacsvlanid;

  @XmlElement(required = true, nillable = true)
  public String varmacsexpiration = "";

  @XmlElement(required = true, nillable = true)
  public String varmacssessiontimeout = "";

  @XmlElement(required = true, nillable = true)
  public String varmacslogintime = "";

  @XmlElement(required = true, nillable = true)
  public String varmacsamountoftime = "";

  @XmlElement(required = true, nillable = true)
  public String varmacspointoftime = "";

  @XmlElement(required = true, nillable = true)
  public String varmacsmaxtotaloctets = "";

  @XmlElement(required = true, nillable = true)
  public String varmacsmaxtotaloctetstimerange = "";

  @XmlElement(required = true, nillable = true)
  public String varmacsmaxbandwidthdown = "";

  @XmlElement(required = true, nillable = true)
  public String varmacsmaxbandwidthup = "";

  @XmlElement(required = true, nillable = true)
  public String varmacsacctinteriminterval = "";

  @XmlElement(required = true, nillable = true)
  public String varmacstopadditionaloptions = "";

  @XmlElement(required = true, nillable = true)
  public String varmacscheckitemsadditionaloptions = "";

  @XmlElement(required = true, nillable = true)
  public String varmacsreplyitemsadditionaloptions = "";

  public String getSortable() {
    return sortable;
  }

  public void setSortable(String sortable) {
    this.sortable = sortable;
  }

  public String getVarmacsaddress() {
    return varmacsaddress;
  }

  public void setVarmacsaddress(String varmacsaddress) {
    this.varmacsaddress = varmacsaddress;
  }

  public String getVarmacsswisprredirectionurl() {
    return varmacsswisprredirectionurl;
  }

  public void setVarmacsswisprredirectionurl(String varmacsswisprredirectionurl) {
    this.varmacsswisprredirectionurl = varmacsswisprredirectionurl;
  }

  public String getVarmacssimultaneousconnect() {
    return varmacssimultaneousconnect;
  }

  public void setVarmacssimultaneousconnect(String varmacssimultaneousconnect) {
    this.varmacssimultaneousconnect = varmacssimultaneousconnect;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getVarmacsframedipaddress() {
    return varmacsframedipaddress;
  }

  public void setVarmacsframedipaddress(String varmacsframedipaddress) {
    this.varmacsframedipaddress = varmacsframedipaddress;
  }

  public String getVarmacsframedipnetmask() {
    return varmacsframedipnetmask;
  }

  public void setVarmacsframedipnetmask(String varmacsframedipnetmask) {
    this.varmacsframedipnetmask = varmacsframedipnetmask;
  }

  public String getVarmacsframedroute() {
    return varmacsframedroute;
  }

  public void setVarmacsframedroute(String varmacsframedroute) {
    this.varmacsframedroute = varmacsframedroute;
  }

  public String getVarmacsframedip6address() {
    return varmacsframedip6address;
  }

  public void setVarmacsframedip6address(String varmacsframedip6address) {
    this.varmacsframedip6address = varmacsframedip6address;
  }

  public String getVarmacsframedip6route() {
    return varmacsframedip6route;
  }

  public void setVarmacsframedip6route(String varmacsframedip6route) {
    this.varmacsframedip6route = varmacsframedip6route;
  }

  public int getVarmacsvlanid() {
    return varmacsvlanid;
  }

  public void setVarmacsvlanid(int varmacsvlanid) {
    this.varmacsvlanid = varmacsvlanid;
  }

  public String getVarmacsexpiration() {
    return varmacsexpiration;
  }

  public void setVarmacsexpiration(String varmacsexpiration) {
    this.varmacsexpiration = varmacsexpiration;
  }

  public String getVarmacssessiontimeout() {
    return varmacssessiontimeout;
  }

  public void setVarmacssessiontimeout(String varmacssessiontimeout) {
    this.varmacssessiontimeout = varmacssessiontimeout;
  }

  public String getVarmacslogintime() {
    return varmacslogintime;
  }

  public void setVarmacslogintime(String varmacslogintime) {
    this.varmacslogintime = varmacslogintime;
  }

  public String getVarmacsamountoftime() {
    return varmacsamountoftime;
  }

  public void setVarmacsamountoftime(String varmacsamountoftime) {
    this.varmacsamountoftime = varmacsamountoftime;
  }

  public String getVarmacspointoftime() {
    return varmacspointoftime;
  }

  public void setVarmacspointoftime(String varmacspointoftime) {
    this.varmacspointoftime = varmacspointoftime;
  }

  public String getVarmacsmaxtotaloctets() {
    return varmacsmaxtotaloctets;
  }

  public void setVarmacsmaxtotaloctets(String varmacsmaxtotaloctets) {
    this.varmacsmaxtotaloctets = varmacsmaxtotaloctets;
  }

  public String getVarmacsmaxtotaloctetstimerange() {
    return varmacsmaxtotaloctetstimerange;
  }

  public void setVarmacsmaxtotaloctetstimerange(String varmacsmaxtotaloctetstimerange) {
    this.varmacsmaxtotaloctetstimerange = varmacsmaxtotaloctetstimerange;
  }

  public String getVarmacsmaxbandwidthdown() {
    return varmacsmaxbandwidthdown;
  }

  public void setVarmacsmaxbandwidthdown(String varmacsmaxbandwidthdown) {
    this.varmacsmaxbandwidthdown = varmacsmaxbandwidthdown;
  }

  public String getVarmacsmaxbandwidthup() {
    return varmacsmaxbandwidthup;
  }

  public void setVarmacsmaxbandwidthup(String varmacsmaxbandwidthup) {
    this.varmacsmaxbandwidthup = varmacsmaxbandwidthup;
  }

  public String getVarmacsacctinteriminterval() {
    return varmacsacctinteriminterval;
  }

  public void setVarmacsacctinteriminterval(String varmacsacctinteriminterval) {
    this.varmacsacctinteriminterval = varmacsacctinteriminterval;
  }

  public String getVarmacstopadditionaloptions() {
    return varmacstopadditionaloptions;
  }

  public void setVarmacstopadditionaloptions(String varmacstopadditionaloptions) {
    this.varmacstopadditionaloptions = varmacstopadditionaloptions;
  }

  public String getVarmacscheckitemsadditionaloptions() {
    return varmacscheckitemsadditionaloptions;
  }

  public void setVarmacscheckitemsadditionaloptions(String varmacscheckitemsadditionaloptions) {
    this.varmacscheckitemsadditionaloptions = varmacscheckitemsadditionaloptions;
  }

  public String getVarmacsreplyitemsadditionaloptions() {
    return varmacsreplyitemsadditionaloptions;
  }

  public void setVarmacsreplyitemsadditionaloptions(String varmacsreplyitemsadditionaloptions) {
    this.varmacsreplyitemsadditionaloptions = varmacsreplyitemsadditionaloptions;
  }
}
