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
 * <p>Java class for EnumBookingSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EnumBookingSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ONLINE"/&gt;
 *     &lt;enumeration value="OFFLINE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumBookingSource")
@XmlEnum
public enum EnumBookingSource {

    ONLINE,
    OFFLINE;

    public String value() {
        return name();
    }

    public static EnumBookingSource fromValue(String v) {
        return valueOf(v);
    }

}
