//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.13 at 07:33:19 PM EEST 
//


package net.ifao.application.communication.obex.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="profileId" type="{}String" /&gt;
 *       &lt;attribute name="type" type="{}EnumPriceType" /&gt;
 *       &lt;attribute name="source" type="{}EnumPriceSource" /&gt;
 *       &lt;attribute name="currency" type="{}String" /&gt;
 *       &lt;attribute name="value" type="{}Float" /&gt;
 *       &lt;attribute name="providerFeeCode" type="{}String" /&gt;
 *       &lt;attribute name="feeDescription" type="{}String" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Price")
public class Price {

    @XmlAttribute(name = "profileId")
    protected String profileId;
    @XmlAttribute(name = "type")
    protected EnumPriceType type;
    @XmlAttribute(name = "source")
    protected EnumPriceSource source;
    @XmlAttribute(name = "currency")
    protected String currency;
    @XmlAttribute(name = "value")
    protected String value;
    @XmlAttribute(name = "providerFeeCode")
    protected String providerFeeCode;
    @XmlAttribute(name = "feeDescription")
    protected String feeDescription;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EnumPriceType }
     *     
     */
    public EnumPriceType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPriceType }
     *     
     */
    public void setType(EnumPriceType value) {
        this.type = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link EnumPriceSource }
     *     
     */
    public EnumPriceSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPriceSource }
     *     
     */
    public void setSource(EnumPriceSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the providerFeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderFeeCode() {
        return providerFeeCode;
    }

    /**
     * Sets the value of the providerFeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderFeeCode(String value) {
        this.providerFeeCode = value;
    }

    /**
     * Gets the value of the feeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeDescription() {
        return feeDescription;
    }

    /**
     * Sets the value of the feeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeDescription(String value) {
        this.feeDescription = value;
    }

}
