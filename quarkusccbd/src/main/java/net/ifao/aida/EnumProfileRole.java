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
 * <p>Java class for EnumProfileRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EnumProfileRole"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BOOKER"/&gt;
 *     &lt;enumeration value="TRAVELER"/&gt;
 *     &lt;enumeration value="APPROVER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumProfileRole")
@XmlEnum
public enum EnumProfileRole {

    BOOKER,
    TRAVELER,
    APPROVER;

    public String value() {
        return name();
    }

    public static EnumProfileRole fromValue(String v) {
        return valueOf(v);
    }

}