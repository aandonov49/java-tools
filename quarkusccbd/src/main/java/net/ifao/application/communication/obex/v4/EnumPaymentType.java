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
 * <p>Java class for EnumPaymentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EnumPaymentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="NONREF"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CHECK"/&gt;
 *     &lt;enumeration value="CREDITCARD"/&gt;
 *     &lt;enumeration value="INVOICE"/&gt;
 *     &lt;enumeration value="EVOUCHER"/&gt;
 *     &lt;enumeration value="WEBBILLING"/&gt;
 *     &lt;enumeration value="EINVOICING"/&gt;
 *     &lt;enumeration value="COLLECTIVEINVOICE"/&gt;
 *     &lt;enumeration value="AGENCY"/&gt;
 *     &lt;enumeration value="BILLBACK"/&gt;
 *     &lt;enumeration value="AMABILLBACK"/&gt;
 *     &lt;enumeration value="CENTRALBILLING"/&gt;
 *     &lt;enumeration value="ECREDIT"/&gt;
 *     &lt;enumeration value="PAY_LATER"/&gt;
 *     &lt;enumeration value="ACCOUNT_WITH_AIRLINE"/&gt;
 *     &lt;enumeration value="BSP_PAYMENT"/&gt;
 *     &lt;enumeration value="HRS_PAYMENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumPaymentType")
@XmlEnum
public enum EnumPaymentType {

    NONREF,
    CASH,
    CHECK,
    CREDITCARD,
    INVOICE,
    EVOUCHER,
    WEBBILLING,
    EINVOICING,
    COLLECTIVEINVOICE,
    AGENCY,
    BILLBACK,
    AMABILLBACK,
    CENTRALBILLING,
    ECREDIT,
    PAY_LATER,
    ACCOUNT_WITH_AIRLINE,
    BSP_PAYMENT,
    HRS_PAYMENT;

    public String value() {
        return name();
    }

    public static EnumPaymentType fromValue(String v) {
        return valueOf(v);
    }

}
