//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.30 at 04:44:02 AM EET 
//


package net.ifao.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}CreditCard" minOccurs="0"/&gt;
 *         &lt;element ref="{}OriginalCreditCard" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required" type="{}EnumPaymentType" /&gt;
 *       &lt;attribute name="profileId" use="required" type="{}String" /&gt;
 *       &lt;attribute name="paidByCompany" type="{}Boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creditCard",
    "originalCreditCard"
})
@XmlRootElement(name = "Payment")
public class Payment {

    @XmlElement(name = "CreditCard")
    protected CreditCard creditCard;
    @XmlElement(name = "OriginalCreditCard")
    protected OriginalCreditCard originalCreditCard;
    @XmlAttribute(name = "type", required = true)
    protected EnumPaymentType type;
    @XmlAttribute(name = "profileId", required = true)
    protected String profileId;
    @XmlAttribute(name = "paidByCompany")
    protected String paidByCompany;

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the originalCreditCard property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalCreditCard }
     *     
     */
    public OriginalCreditCard getOriginalCreditCard() {
        return originalCreditCard;
    }

    /**
     * Sets the value of the originalCreditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalCreditCard }
     *     
     */
    public void setOriginalCreditCard(OriginalCreditCard value) {
        this.originalCreditCard = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EnumPaymentType }
     *     
     */
    public EnumPaymentType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPaymentType }
     *     
     */
    public void setType(EnumPaymentType value) {
        this.type = value;
    }

    /**
     * Gets the value of the profileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileId(String value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the paidByCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidByCompany() {
        return paidByCompany;
    }

    /**
     * Sets the value of the paidByCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidByCompany(String value) {
        this.paidByCompany = value;
    }

}
