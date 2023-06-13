//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.13 at 07:33:19 PM EEST 
//


package net.ifao.application.communication.obex.v4;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}CarCategory" minOccurs="0"/&gt;
 *         &lt;element ref="{}CarType" minOccurs="0"/&gt;
 *         &lt;element ref="{}CarTransmission" minOccurs="0"/&gt;
 *         &lt;element ref="{}CarMiscellaneous" minOccurs="0"/&gt;
 *         &lt;element ref="{}CarModel" minOccurs="0"/&gt;
 *         &lt;element ref="{}CarFees" minOccurs="0"/&gt;
 *         &lt;element ref="{}GeoLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}CarCompanyLogos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="rentalCarCompany" type="{}String" /&gt;
 *       &lt;attribute name="inventoryCode" type="{}String" /&gt;
 *       &lt;attribute name="rentAtAirport" type="{}Boolean" /&gt;
 *       &lt;attribute name="telephonePickUpStation" type="{}String" /&gt;
 *       &lt;attribute name="telephoneReturnStation" type="{}String" /&gt;
 *       &lt;attribute name="telefaxPickUpStation" type="{}String" /&gt;
 *       &lt;attribute name="telefaxReturnStation" type="{}String" /&gt;
 *       &lt;attribute name="emailPickUpStation" type="{}String" /&gt;
 *       &lt;attribute name="emailReturnStation" type="{}String" /&gt;
 *       &lt;attribute name="providerConfirmationNumber" type="{}String" /&gt;
 *       &lt;attribute name="preferred" type="{}Boolean" /&gt;
 *       &lt;attribute name="statusCode" type="{}String" /&gt;
 *       &lt;attribute name="rateCode" type="{}String" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "carCategory",
    "carType",
    "carTransmission",
    "carMiscellaneous",
    "carModel",
    "carFees",
    "geoLocation",
    "carCompanyLogos"
})
@XmlRootElement(name = "TripDetailsCar")
public class TripDetailsCar {

    @XmlElement(name = "CarCategory")
    protected CarCategory carCategory;
    @XmlElement(name = "CarType")
    protected CarType carType;
    @XmlElement(name = "CarTransmission")
    protected CarTransmission carTransmission;
    @XmlElement(name = "CarMiscellaneous")
    protected CarMiscellaneous carMiscellaneous;
    @XmlElement(name = "CarModel")
    protected CarModel carModel;
    @XmlElement(name = "CarFees")
    protected CarFees carFees;
    @XmlElement(name = "GeoLocation")
    protected List<GeoLocation> geoLocation;
    @XmlElement(name = "CarCompanyLogos")
    protected CarCompanyLogos carCompanyLogos;
    @XmlAttribute(name = "rentalCarCompany")
    protected String rentalCarCompany;
    @XmlAttribute(name = "inventoryCode")
    protected String inventoryCode;
    @XmlAttribute(name = "rentAtAirport")
    protected String rentAtAirport;
    @XmlAttribute(name = "telephonePickUpStation")
    protected String telephonePickUpStation;
    @XmlAttribute(name = "telephoneReturnStation")
    protected String telephoneReturnStation;
    @XmlAttribute(name = "telefaxPickUpStation")
    protected String telefaxPickUpStation;
    @XmlAttribute(name = "telefaxReturnStation")
    protected String telefaxReturnStation;
    @XmlAttribute(name = "emailPickUpStation")
    protected String emailPickUpStation;
    @XmlAttribute(name = "emailReturnStation")
    protected String emailReturnStation;
    @XmlAttribute(name = "providerConfirmationNumber")
    protected String providerConfirmationNumber;
    @XmlAttribute(name = "preferred")
    protected String preferred;
    @XmlAttribute(name = "statusCode")
    protected String statusCode;
    @XmlAttribute(name = "rateCode")
    protected String rateCode;

    /**
     * Gets the value of the carCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CarCategory }
     *     
     */
    public CarCategory getCarCategory() {
        return carCategory;
    }

    /**
     * Sets the value of the carCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarCategory }
     *     
     */
    public void setCarCategory(CarCategory value) {
        this.carCategory = value;
    }

    /**
     * Gets the value of the carType property.
     * 
     * @return
     *     possible object is
     *     {@link CarType }
     *     
     */
    public CarType getCarType() {
        return carType;
    }

    /**
     * Sets the value of the carType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarType }
     *     
     */
    public void setCarType(CarType value) {
        this.carType = value;
    }

    /**
     * Gets the value of the carTransmission property.
     * 
     * @return
     *     possible object is
     *     {@link CarTransmission }
     *     
     */
    public CarTransmission getCarTransmission() {
        return carTransmission;
    }

    /**
     * Sets the value of the carTransmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarTransmission }
     *     
     */
    public void setCarTransmission(CarTransmission value) {
        this.carTransmission = value;
    }

    /**
     * Gets the value of the carMiscellaneous property.
     * 
     * @return
     *     possible object is
     *     {@link CarMiscellaneous }
     *     
     */
    public CarMiscellaneous getCarMiscellaneous() {
        return carMiscellaneous;
    }

    /**
     * Sets the value of the carMiscellaneous property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarMiscellaneous }
     *     
     */
    public void setCarMiscellaneous(CarMiscellaneous value) {
        this.carMiscellaneous = value;
    }

    /**
     * Gets the value of the carModel property.
     * 
     * @return
     *     possible object is
     *     {@link CarModel }
     *     
     */
    public CarModel getCarModel() {
        return carModel;
    }

    /**
     * Sets the value of the carModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarModel }
     *     
     */
    public void setCarModel(CarModel value) {
        this.carModel = value;
    }

    /**
     * Gets the value of the carFees property.
     * 
     * @return
     *     possible object is
     *     {@link CarFees }
     *     
     */
    public CarFees getCarFees() {
        return carFees;
    }

    /**
     * Sets the value of the carFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarFees }
     *     
     */
    public void setCarFees(CarFees value) {
        this.carFees = value;
    }

    /**
     * Gets the value of the geoLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the javax XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the geoLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeoLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoLocation }
     * 
     * 
     */
    public List<GeoLocation> getGeoLocation() {
        if (geoLocation == null) {
            geoLocation = new ArrayList<GeoLocation>();
        }
        return this.geoLocation;
    }

    /**
     * Gets the value of the carCompanyLogos property.
     * 
     * @return
     *     possible object is
     *     {@link CarCompanyLogos }
     *     
     */
    public CarCompanyLogos getCarCompanyLogos() {
        return carCompanyLogos;
    }

    /**
     * Sets the value of the carCompanyLogos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarCompanyLogos }
     *     
     */
    public void setCarCompanyLogos(CarCompanyLogos value) {
        this.carCompanyLogos = value;
    }

    /**
     * Gets the value of the rentalCarCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentalCarCompany() {
        return rentalCarCompany;
    }

    /**
     * Sets the value of the rentalCarCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentalCarCompany(String value) {
        this.rentalCarCompany = value;
    }

    /**
     * Gets the value of the inventoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryCode() {
        return inventoryCode;
    }

    /**
     * Sets the value of the inventoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryCode(String value) {
        this.inventoryCode = value;
    }

    /**
     * Gets the value of the rentAtAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRentAtAirport() {
        return rentAtAirport;
    }

    /**
     * Sets the value of the rentAtAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRentAtAirport(String value) {
        this.rentAtAirport = value;
    }

    /**
     * Gets the value of the telephonePickUpStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephonePickUpStation() {
        return telephonePickUpStation;
    }

    /**
     * Sets the value of the telephonePickUpStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephonePickUpStation(String value) {
        this.telephonePickUpStation = value;
    }

    /**
     * Gets the value of the telephoneReturnStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneReturnStation() {
        return telephoneReturnStation;
    }

    /**
     * Sets the value of the telephoneReturnStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneReturnStation(String value) {
        this.telephoneReturnStation = value;
    }

    /**
     * Gets the value of the telefaxPickUpStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefaxPickUpStation() {
        return telefaxPickUpStation;
    }

    /**
     * Sets the value of the telefaxPickUpStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefaxPickUpStation(String value) {
        this.telefaxPickUpStation = value;
    }

    /**
     * Gets the value of the telefaxReturnStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefaxReturnStation() {
        return telefaxReturnStation;
    }

    /**
     * Sets the value of the telefaxReturnStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefaxReturnStation(String value) {
        this.telefaxReturnStation = value;
    }

    /**
     * Gets the value of the emailPickUpStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPickUpStation() {
        return emailPickUpStation;
    }

    /**
     * Sets the value of the emailPickUpStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPickUpStation(String value) {
        this.emailPickUpStation = value;
    }

    /**
     * Gets the value of the emailReturnStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailReturnStation() {
        return emailReturnStation;
    }

    /**
     * Sets the value of the emailReturnStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailReturnStation(String value) {
        this.emailReturnStation = value;
    }

    /**
     * Gets the value of the providerConfirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderConfirmationNumber() {
        return providerConfirmationNumber;
    }

    /**
     * Sets the value of the providerConfirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderConfirmationNumber(String value) {
        this.providerConfirmationNumber = value;
    }

    /**
     * Gets the value of the preferred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferred(String value) {
        this.preferred = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

}
