//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.13 at 07:33:19 PM EEST 
//


package net.ifao.application.communication.obex.v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumGreeting.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EnumGreeting"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="MR"/&gt;
 *     &lt;enumeration value="MRS"/&gt;
 *     &lt;enumeration value="MISS"/&gt;
 *     &lt;enumeration value="MS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumGreeting")
@XmlEnum
public enum EnumGreeting {

    MR,
    MRS,
    MISS,
    MS;

    public String value() {
        return name();
    }

    public static EnumGreeting fromValue(String v) {
        return valueOf(v);
    }

}
