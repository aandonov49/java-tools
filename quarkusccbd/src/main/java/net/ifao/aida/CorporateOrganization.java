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
 *       &lt;attribute name="name" use="required" type="{}EnumCorporateOrganization" /&gt;
 *       &lt;attribute name="value" use="required" type="{}String" /&gt;
 *       &lt;attribute name="id" type="{}String" /&gt;
 *       &lt;attribute name="extRef" type="{}String" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CorporateOrganization")
public class CorporateOrganization {

    @XmlAttribute(name = "name", required = true)
    protected EnumCorporateOrganization name;
    @XmlAttribute(name = "value", required = true)
    protected String value;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "extRef")
    protected String extRef;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCorporateOrganization }
     *     
     */
    public EnumCorporateOrganization getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCorporateOrganization }
     *     
     */
    public void setName(EnumCorporateOrganization value) {
        this.name = value;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the extRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtRef() {
        return extRef;
    }

    /**
     * Sets the value of the extRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtRef(String value) {
        this.extRef = value;
    }

}
