//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.30 at 04:44:02 AM EET 
//


package net.ifao.aida;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumAirServiceClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EnumAirServiceClass"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="FIRST"/&gt;
 *     &lt;enumeration value="BUSINESS"/&gt;
 *     &lt;enumeration value="PREMIUM_ECONOMY"/&gt;
 *     &lt;enumeration value="ECONOMY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumAirServiceClass")
@XmlEnum
public enum EnumAirServiceClass {

    FIRST,
    BUSINESS,
    PREMIUM_ECONOMY,
    ECONOMY;

    public String value() {
        return name();
    }

    public static EnumAirServiceClass fromValue(String v) {
        return valueOf(v);
    }

}