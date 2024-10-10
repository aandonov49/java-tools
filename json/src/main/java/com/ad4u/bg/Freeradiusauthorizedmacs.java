package com.ad4u.bg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "freeradiusauthorizedmacs")
@XmlAccessorType(XmlAccessType.FIELD)
public class Freeradiusauthorizedmacs {

  @XmlElement(required = true, nillable = true)
  private List<Config> config;

  public Freeradiusauthorizedmacs() {
    config = new ArrayList<Config>();
  }

  public List<Config> getConfig() {
    return config;
  }
}
