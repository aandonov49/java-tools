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
 * <p>Java class for EnumPriceSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EnumPriceSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="PROVIDER"/&gt;
 *     &lt;enumeration value="COMPANY"/&gt;
 *     &lt;enumeration value="DESTINATION"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumPriceSource")
@XmlEnum
public enum EnumPriceSource {

    PROVIDER,
    COMPANY,
    DESTINATION;

    public String value() {
        return name();
    }

    public static EnumPriceSource fromValue(String v) {
        return valueOf(v);
    }

}
