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
 * <p>Java class for EnumPriceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EnumPriceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="NET"/&gt;
 *     &lt;enumeration value="TAX"/&gt;
 *     &lt;enumeration value="PROVIDERFEE"/&gt;
 *     &lt;enumeration value="CYTRICFEE"/&gt;
 *     &lt;enumeration value="TOTAL"/&gt;
 *     &lt;enumeration value="TRAVELER_FEE"/&gt;
 *     &lt;enumeration value="PENALTY"/&gt;
 *     &lt;enumeration value="NONREF_FARE"/&gt;
 *     &lt;enumeration value="NONREF_TAX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumPriceType")
@XmlEnum
public enum EnumPriceType {

    NET,
    TAX,
    PROVIDERFEE,
    CYTRICFEE,
    TOTAL,
    TRAVELER_FEE,
    PENALTY,
    NONREF_FARE,
    NONREF_TAX;

    public String value() {
        return name();
    }

    public static EnumPriceType fromValue(String v) {
        return valueOf(v);
    }

}