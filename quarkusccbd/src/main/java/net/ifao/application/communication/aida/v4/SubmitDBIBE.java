//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.13 at 07:28:24 PM EEST 
//


package net.ifao.application.communication.aida.v4;

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
 *         &lt;element ref="{http://www.airplus.com/aida/virtualcreditcards}TransType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AU" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IK" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transType"
})
@XmlRootElement(name = "SubmitDBIBE")
public class SubmitDBIBE {

    @XmlElement(name = "TransType", required = true)
    protected TransType transType;
    @XmlAttribute(name = "AU")
    protected String au;
    @XmlAttribute(name = "IK")
    protected String ik;

    /**
     * Gets the value of the transType property.
     * 
     * @return
     *     possible object is
     *     {@link TransType }
     *     
     */
    public TransType getTransType() {
        return transType;
    }

    /**
     * Sets the value of the transType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransType }
     *     
     */
    public void setTransType(TransType value) {
        this.transType = value;
    }

    /**
     * Gets the value of the au property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAU() {
        return au;
    }

    /**
     * Sets the value of the au property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAU(String value) {
        this.au = value;
    }

    /**
     * Gets the value of the ik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIK() {
        return ik;
    }

    /**
     * Sets the value of the ik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIK(String value) {
        this.ik = value;
    }

    @Override
    public String toString() {
        return "SubmitDBIBE{" +
                "transType=" + transType +
                ", au='" + au + '\'' +
                ", ik='" + ik + '\'' +
                '}';
    }
}
