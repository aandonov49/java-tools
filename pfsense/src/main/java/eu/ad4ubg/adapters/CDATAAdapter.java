package eu.ad4ubg.adapters;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class CDATAAdapter extends XmlAdapter<String, String> {
  @Override
  public String unmarshal(String s) throws Exception {
    String str = s.replaceAll("\\n", "");
    str = str.replaceAll("\\t", "");
    return str;
  }

  @Override
  public String marshal(String s) throws Exception {
    if (s == null || s.isEmpty()) {
      return null;
    }
    return "<![CDATA[" + s + "]]>";
  }
}
