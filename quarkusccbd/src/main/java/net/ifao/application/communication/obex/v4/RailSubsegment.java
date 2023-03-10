//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.11.12 at 11:11:03 PM EET 
//


package net.ifao.application.communication.obex.v4;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element ref="{}RailSeat" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}GeoLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}CarbonEmission" minOccurs="0"/&gt;
 *         &lt;element ref="{}RailCompanyLogos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{}Integer" /&gt;
 *       &lt;attribute name="direction" type="{}Integer" /&gt;
 *       &lt;attribute name="origin" type="{}String" /&gt;
 *       &lt;attribute name="destination" type="{}String" /&gt;
 *       &lt;attribute name="originTrack" type="{}String" /&gt;
 *       &lt;attribute name="destinationTrack" type="{}String" /&gt;
 *       &lt;attribute name="originCountryCode" type="{}String" /&gt;
 *       &lt;attribute name="destinationCountryCode" type="{}String" /&gt;
 *       &lt;attribute name="originArea" type="{}EnumArea" /&gt;
 *       &lt;attribute name="destinationArea" type="{}EnumArea" /&gt;
 *       &lt;attribute name="originDateAndTime" type="{}DateTime" /&gt;
 *       &lt;attribute name="destinationDateAndTime" type="{}DateTime" /&gt;
 *       &lt;attribute name="originIATACode" type="{}String" /&gt;
 *       &lt;attribute name="destinationIATACode" type="{}String" /&gt;
 *       &lt;attribute name="originCityIATACode" type="{}String" /&gt;
 *       &lt;attribute name="destinationCityIATACode" type="{}String" /&gt;
 *       &lt;attribute name="originCityName" type="{}String" /&gt;
 *       &lt;attribute name="destinationCityName" type="{}String" /&gt;
 *       &lt;attribute name="serviceClass" type="{}EnumRailServiceClass" /&gt;
 *       &lt;attribute name="providerConfirmationNumber" type="{}String" /&gt;
 *       &lt;attribute name="trainNumber" type="{}String" /&gt;
 *       &lt;attribute name="totalPrice" type="{}Float" /&gt;
 *       &lt;attribute name="railCompanyName" type="{}String" /&gt;
 *       &lt;attribute name="railCompanyCode" type="{}String" /&gt;
 *       &lt;attribute name="vehicle" type="{}String" /&gt;
 *       &lt;attribute name="vehicleDescription" type="{}String" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "railSeat",
    "geoLocation",
    "carbonEmission",
    "railCompanyLogos"
})
@XmlRootElement(name = "RailSubsegment")
public class RailSubsegment {

    @XmlElement(name = "RailSeat")
    protected List<RailSeat> railSeat;
    @XmlElement(name = "GeoLocation")
    protected List<GeoLocation> geoLocation;
    @XmlElement(name = "CarbonEmission")
    protected CarbonEmission carbonEmission;
    @XmlElement(name = "RailCompanyLogos")
    protected RailCompanyLogos railCompanyLogos;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "direction")
    protected String direction;
    @XmlAttribute(name = "origin")
    protected String origin;
    @XmlAttribute(name = "destination")
    protected String destination;
    @XmlAttribute(name = "originTrack")
    protected String originTrack;
    @XmlAttribute(name = "destinationTrack")
    protected String destinationTrack;
    @XmlAttribute(name = "originCountryCode")
    protected String originCountryCode;
    @XmlAttribute(name = "destinationCountryCode")
    protected String destinationCountryCode;
    @XmlAttribute(name = "originArea")
    protected EnumArea originArea;
    @XmlAttribute(name = "destinationArea")
    protected EnumArea destinationArea;
    @XmlAttribute(name = "originDateAndTime")
    protected String originDateAndTime;
    @XmlAttribute(name = "destinationDateAndTime")
    protected String destinationDateAndTime;
    @XmlAttribute(name = "originIATACode")
    protected String originIATACode;
    @XmlAttribute(name = "destinationIATACode")
    protected String destinationIATACode;
    @XmlAttribute(name = "originCityIATACode")
    protected String originCityIATACode;
    @XmlAttribute(name = "destinationCityIATACode")
    protected String destinationCityIATACode;
    @XmlAttribute(name = "originCityName")
    protected String originCityName;
    @XmlAttribute(name = "destinationCityName")
    protected String destinationCityName;
    @XmlAttribute(name = "serviceClass")
    protected EnumRailServiceClass serviceClass;
    @XmlAttribute(name = "providerConfirmationNumber")
    protected String providerConfirmationNumber;
    @XmlAttribute(name = "trainNumber")
    protected String trainNumber;
    @XmlAttribute(name = "totalPrice")
    protected String totalPrice;
    @XmlAttribute(name = "railCompanyName")
    protected String railCompanyName;
    @XmlAttribute(name = "railCompanyCode")
    protected String railCompanyCode;
    @XmlAttribute(name = "vehicle")
    protected String vehicle;
    @XmlAttribute(name = "vehicleDescription")
    protected String vehicleDescription;

    /**
     * Gets the value of the railSeat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the railSeat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailSeat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailSeat }
     * 
     * 
     */
    public List<RailSeat> getRailSeat() {
        if (railSeat == null) {
            railSeat = new ArrayList<RailSeat>();
        }
        return this.railSeat;
    }

    /**
     * Gets the value of the geoLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
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
     * Gets the value of the carbonEmission property.
     * 
     * @return
     *     possible object is
     *     {@link CarbonEmission }
     *     
     */
    public CarbonEmission getCarbonEmission() {
        return carbonEmission;
    }

    /**
     * Sets the value of the carbonEmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarbonEmission }
     *     
     */
    public void setCarbonEmission(CarbonEmission value) {
        this.carbonEmission = value;
    }

    /**
     * Gets the value of the railCompanyLogos property.
     * 
     * @return
     *     possible object is
     *     {@link RailCompanyLogos }
     *     
     */
    public RailCompanyLogos getRailCompanyLogos() {
        return railCompanyLogos;
    }

    /**
     * Sets the value of the railCompanyLogos property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailCompanyLogos }
     *     
     */
    public void setRailCompanyLogos(RailCompanyLogos value) {
        this.railCompanyLogos = value;
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
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the originTrack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginTrack() {
        return originTrack;
    }

    /**
     * Sets the value of the originTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginTrack(String value) {
        this.originTrack = value;
    }

    /**
     * Gets the value of the destinationTrack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationTrack() {
        return destinationTrack;
    }

    /**
     * Sets the value of the destinationTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationTrack(String value) {
        this.destinationTrack = value;
    }

    /**
     * Gets the value of the originCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /**
     * Sets the value of the originCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCountryCode(String value) {
        this.originCountryCode = value;
    }

    /**
     * Gets the value of the destinationCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /**
     * Sets the value of the destinationCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCountryCode(String value) {
        this.destinationCountryCode = value;
    }

    /**
     * Gets the value of the originArea property.
     * 
     * @return
     *     possible object is
     *     {@link EnumArea }
     *     
     */
    public EnumArea getOriginArea() {
        return originArea;
    }

    /**
     * Sets the value of the originArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumArea }
     *     
     */
    public void setOriginArea(EnumArea value) {
        this.originArea = value;
    }

    /**
     * Gets the value of the destinationArea property.
     * 
     * @return
     *     possible object is
     *     {@link EnumArea }
     *     
     */
    public EnumArea getDestinationArea() {
        return destinationArea;
    }

    /**
     * Sets the value of the destinationArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumArea }
     *     
     */
    public void setDestinationArea(EnumArea value) {
        this.destinationArea = value;
    }

    /**
     * Gets the value of the originDateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDateAndTime() {
        return originDateAndTime;
    }

    /**
     * Sets the value of the originDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginDateAndTime(String value) {
        this.originDateAndTime = value;
    }

    /**
     * Gets the value of the destinationDateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationDateAndTime() {
        return destinationDateAndTime;
    }

    /**
     * Sets the value of the destinationDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationDateAndTime(String value) {
        this.destinationDateAndTime = value;
    }

    /**
     * Gets the value of the originIATACode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginIATACode() {
        return originIATACode;
    }

    /**
     * Sets the value of the originIATACode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginIATACode(String value) {
        this.originIATACode = value;
    }

    /**
     * Gets the value of the destinationIATACode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationIATACode() {
        return destinationIATACode;
    }

    /**
     * Sets the value of the destinationIATACode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationIATACode(String value) {
        this.destinationIATACode = value;
    }

    /**
     * Gets the value of the originCityIATACode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCityIATACode() {
        return originCityIATACode;
    }

    /**
     * Sets the value of the originCityIATACode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCityIATACode(String value) {
        this.originCityIATACode = value;
    }

    /**
     * Gets the value of the destinationCityIATACode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCityIATACode() {
        return destinationCityIATACode;
    }

    /**
     * Sets the value of the destinationCityIATACode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCityIATACode(String value) {
        this.destinationCityIATACode = value;
    }

    /**
     * Gets the value of the originCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCityName() {
        return originCityName;
    }

    /**
     * Sets the value of the originCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCityName(String value) {
        this.originCityName = value;
    }

    /**
     * Gets the value of the destinationCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCityName() {
        return destinationCityName;
    }

    /**
     * Sets the value of the destinationCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCityName(String value) {
        this.destinationCityName = value;
    }

    /**
     * Gets the value of the serviceClass property.
     * 
     * @return
     *     possible object is
     *     {@link EnumRailServiceClass }
     *     
     */
    public EnumRailServiceClass getServiceClass() {
        return serviceClass;
    }

    /**
     * Sets the value of the serviceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumRailServiceClass }
     *     
     */
    public void setServiceClass(EnumRailServiceClass value) {
        this.serviceClass = value;
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
     * Gets the value of the trainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     * Sets the value of the trainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainNumber(String value) {
        this.trainNumber = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPrice(String value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the railCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailCompanyName() {
        return railCompanyName;
    }

    /**
     * Sets the value of the railCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailCompanyName(String value) {
        this.railCompanyName = value;
    }

    /**
     * Gets the value of the railCompanyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailCompanyCode() {
        return railCompanyCode;
    }

    /**
     * Sets the value of the railCompanyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailCompanyCode(String value) {
        this.railCompanyCode = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicle(String value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the vehicleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleDescription() {
        return vehicleDescription;
    }

    /**
     * Sets the value of the vehicleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleDescription(String value) {
        this.vehicleDescription = value;
    }

}
