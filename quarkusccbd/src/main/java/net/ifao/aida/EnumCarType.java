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
 * <p>Java class for EnumCarType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EnumCarType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="J"/&gt;
 *     &lt;enumeration value="K"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="Q"/&gt;
 *     &lt;enumeration value="Y"/&gt;
 *     &lt;enumeration value="Z"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumCarType")
@XmlEnum
public enum EnumCarType {

    B,
    C,
    D,
    F,
    J,
    K,
    L,
    P,
    R,
    S,
    T,
    V,
    W,
    X,
    E,
    G,
    H,
    M,
    N,
    Q,
    Y,
    Z;

    public String value() {
        return name();
    }

    public static EnumCarType fromValue(String v) {
        return valueOf(v);
    }

}
