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
 *         &lt;element ref="{}TripErrorReason" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="code" use="required" type="{}EnumTripError" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tripErrorReason"
})
@XmlRootElement(name = "TripError")
public class TripError {

    @XmlElement(name = "TripErrorReason")
    protected TripErrorReason tripErrorReason;
    @XmlAttribute(name = "code", required = true)
    protected EnumTripError code;

    /**
     * Gets the value of the tripErrorReason property.
     * 
     * @return
     *     possible object is
     *     {@link TripErrorReason }
     *     
     */
    public TripErrorReason getTripErrorReason() {
        return tripErrorReason;
    }

    /**
     * Sets the value of the tripErrorReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripErrorReason }
     *     
     */
    public void setTripErrorReason(TripErrorReason value) {
        this.tripErrorReason = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link EnumTripError }
     *     
     */
    public EnumTripError getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTripError }
     *     
     */
    public void setCode(EnumTripError value) {
        this.code = value;
    }

}
