//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.12 at 11:11:03 PM EET 
//


package net.ifao.application.communication.obex.v4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumGender.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EnumGender"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="MALE"/&gt;
 *     &lt;enumeration value="FEMALE"/&gt;
 *     &lt;enumeration value="UNDISCLOSED"/&gt;
 *     &lt;enumeration value="UNSPECIFIED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumGender")
@XmlEnum
public enum EnumGender {

    MALE,
    FEMALE,
    UNDISCLOSED,
    UNSPECIFIED;

    public String value() {
        return name();
    }

    public static EnumGender fromValue(String v) {
        return valueOf(v);
    }

}
