package eu.ad4ubg.adapters;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class StringAdapter extends XmlAdapter<String, String> {
  @Override
  public String unmarshal(String s) throws Exception {
    return s;
  }

  @Override
  public String marshal(String s) throws Exception {
    if (s == null) {
      return "";
    }
    return s;
  }
}
