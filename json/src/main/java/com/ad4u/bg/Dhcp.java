package com.ad4u.bg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "dhcpd")
@XmlAccessorType(XmlAccessType.FIELD)
public class Dhcp {

  @XmlElement(required = true)
  private NetworkInterface lan;

  @XmlElement(required = true)
  private NetworkInterface opt2;

  @XmlElement(required = true)
  private NetworkInterface opt5;

  public Dhcp() {
    lan = new NetworkInterface();
    opt2 = new NetworkInterface();
    opt5 = new NetworkInterface();
  }

  public NetworkInterface getOpt5() {
    return opt5;
  }

  public NetworkInterface getOpt2() {
    return opt2;
  }

  public NetworkInterface getLan() {
    return lan;
  }
}
