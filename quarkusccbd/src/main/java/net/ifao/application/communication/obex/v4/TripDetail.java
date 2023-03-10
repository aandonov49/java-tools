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
 *         &lt;element ref="{}Payments" minOccurs="0"/&gt;
 *         &lt;element ref="{}Prices" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}TripDetailsAir"/&gt;
 *           &lt;element ref="{}TripDetailsHotel"/&gt;
 *           &lt;element ref="{}TripDetailsEvent"/&gt;
 *           &lt;element ref="{}TripDetailsRail"/&gt;
 *           &lt;element ref="{}TripDetailsCar"/&gt;
 *           &lt;element ref="{}TripDetailsCloud"/&gt;
 *           &lt;element ref="{}TripDetailsWizzard"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}TravelPolicyAlert" minOccurs="0"/&gt;
 *         &lt;element ref="{}FreeDataFields" minOccurs="0"/&gt;
 *         &lt;element ref="{}ProfileReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="cytricTripDetailNumber" use="required" type="{}Long" /&gt;
 *       &lt;attribute name="cytricRequestDetailNumber" type="{}Long" /&gt;
 *       &lt;attribute name="type" use="required" type="{}EnumTripDetailType" /&gt;
 *       &lt;attribute name="canceled" type="{}Boolean" /&gt;
 *       &lt;attribute name="bookingDateAndTime" use="required" type="{}DateAndTime" /&gt;
 *       &lt;attribute name="startDateAndTime" use="required" type="{}DateTime" /&gt;
 *       &lt;attribute name="completionDateAndTime" type="{}DateTime" /&gt;
 *       &lt;attribute name="duration" type="{}String" /&gt;
 *       &lt;attribute name="origin" use="required" type="{}String" /&gt;
 *       &lt;attribute name="destination" use="required" type="{}String" /&gt;
 *       &lt;attribute name="originIATACode" type="{}String" /&gt;
 *       &lt;attribute name="originIATAName" type="{}String" /&gt;
 *       &lt;attribute name="destinationIATACode" type="{}String" /&gt;
 *       &lt;attribute name="destinationIATAName" type="{}String" /&gt;
 *       &lt;attribute name="originCountryCode" type="{}String" /&gt;
 *       &lt;attribute name="originCountry" type="{}String" /&gt;
 *       &lt;attribute name="destinationCountryCode" type="{}String" /&gt;
 *       &lt;attribute name="destinationCountry" type="{}String" /&gt;
 *       &lt;attribute name="originArea" type="{}EnumArea" /&gt;
 *       &lt;attribute name="destinationArea" type="{}EnumArea" /&gt;
 *       &lt;attribute name="inventorySystem" type="{}EnumInventorySystem" /&gt;
 *       &lt;attribute name="inventoryRecordLocator" type="{}String" /&gt;
 *       &lt;attribute name="passiveSystem" type="{}EnumPassiveSystem" /&gt;
 *       &lt;attribute name="passiveType" type="{}EnumPassiveType" /&gt;
 *       &lt;attribute name="passiveRecordLocator" type="{}String" /&gt;
 *       &lt;attribute name="onHold" type="{}Boolean" /&gt;
 *       &lt;attribute name="delayedTicketing" type="{}Boolean" /&gt;
 *       &lt;attribute name="bookingSource" type="{}EnumBookingSource" /&gt;
 *       &lt;attribute name="fareLogixLocator" type="{}String" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "payments",
    "prices",
    "tripDetailsAir",
    "tripDetailsHotel",
    "tripDetailsEvent",
    "tripDetailsRail",
    "tripDetailsCar",
    "tripDetailsCloud",
    "tripDetailsWizzard",
    "travelPolicyAlert",
    "freeDataFields",
    "profileReference"
})
@XmlRootElement(name = "TripDetail")
public class TripDetail {

    @XmlElement(name = "Payments")
    protected Payments payments;
    @XmlElement(name = "Prices")
    protected Prices prices;
    @XmlElement(name = "TripDetailsAir")
    protected TripDetailsAir tripDetailsAir;
    @XmlElement(name = "TripDetailsHotel")
    protected TripDetailsHotel tripDetailsHotel;
    @XmlElement(name = "TripDetailsEvent")
    protected TripDetailsEvent tripDetailsEvent;
    @XmlElement(name = "TripDetailsRail")
    protected TripDetailsRail tripDetailsRail;
    @XmlElement(name = "TripDetailsCar")
    protected TripDetailsCar tripDetailsCar;
    @XmlElement(name = "TripDetailsCloud")
    protected TripDetailsCloud tripDetailsCloud;
    @XmlElement(name = "TripDetailsWizzard")
    protected TripDetailsWizzard tripDetailsWizzard;
    @XmlElement(name = "TravelPolicyAlert")
    protected TravelPolicyAlert travelPolicyAlert;
    @XmlElement(name = "FreeDataFields")
    protected FreeDataFields freeDataFields;
    @XmlElement(name = "ProfileReference")
    protected List<ProfileReference> profileReference;
    @XmlAttribute(name = "cytricTripDetailNumber", required = true)
    protected String cytricTripDetailNumber;
    @XmlAttribute(name = "cytricRequestDetailNumber")
    protected String cytricRequestDetailNumber;
    @XmlAttribute(name = "type", required = true)
    protected EnumTripDetailType type;
    @XmlAttribute(name = "canceled")
    protected String canceled;
    @XmlAttribute(name = "bookingDateAndTime", required = true)
    protected String bookingDateAndTime;
    @XmlAttribute(name = "startDateAndTime", required = true)
    protected String startDateAndTime;
    @XmlAttribute(name = "completionDateAndTime")
    protected String completionDateAndTime;
    @XmlAttribute(name = "duration")
    protected String duration;
    @XmlAttribute(name = "origin", required = true)
    protected String origin;
    @XmlAttribute(name = "destination", required = true)
    protected String destination;
    @XmlAttribute(name = "originIATACode")
    protected String originIATACode;
    @XmlAttribute(name = "originIATAName")
    protected String originIATAName;
    @XmlAttribute(name = "destinationIATACode")
    protected String destinationIATACode;
    @XmlAttribute(name = "destinationIATAName")
    protected String destinationIATAName;
    @XmlAttribute(name = "originCountryCode")
    protected String originCountryCode;
    @XmlAttribute(name = "originCountry")
    protected String originCountry;
    @XmlAttribute(name = "destinationCountryCode")
    protected String destinationCountryCode;
    @XmlAttribute(name = "destinationCountry")
    protected String destinationCountry;
    @XmlAttribute(name = "originArea")
    protected EnumArea originArea;
    @XmlAttribute(name = "destinationArea")
    protected EnumArea destinationArea;
    @XmlAttribute(name = "inventorySystem")
    protected EnumInventorySystem inventorySystem;
    @XmlAttribute(name = "inventoryRecordLocator")
    protected String inventoryRecordLocator;
    @XmlAttribute(name = "passiveSystem")
    protected EnumPassiveSystem passiveSystem;
    @XmlAttribute(name = "passiveType")
    protected EnumPassiveType passiveType;
    @XmlAttribute(name = "passiveRecordLocator")
    protected String passiveRecordLocator;
    @XmlAttribute(name = "onHold")
    protected String onHold;
    @XmlAttribute(name = "delayedTicketing")
    protected String delayedTicketing;
    @XmlAttribute(name = "bookingSource")
    protected EnumBookingSource bookingSource;
    @XmlAttribute(name = "fareLogixLocator")
    protected String fareLogixLocator;

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link Payments }
     *     
     */
    public Payments getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payments }
     *     
     */
    public void setPayments(Payments value) {
        this.payments = value;
    }

    /**
     * Gets the value of the prices property.
     * 
     * @return
     *     possible object is
     *     {@link Prices }
     *     
     */
    public Prices getPrices() {
        return prices;
    }

    /**
     * Sets the value of the prices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prices }
     *     
     */
    public void setPrices(Prices value) {
        this.prices = value;
    }

    /**
     * Gets the value of the tripDetailsAir property.
     * 
     * @return
     *     possible object is
     *     {@link TripDetailsAir }
     *     
     */
    public TripDetailsAir getTripDetailsAir() {
        return tripDetailsAir;
    }

    /**
     * Sets the value of the tripDetailsAir property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripDetailsAir }
     *     
     */
    public void setTripDetailsAir(TripDetailsAir value) {
        this.tripDetailsAir = value;
    }

    /**
     * Gets the value of the tripDetailsHotel property.
     * 
     * @return
     *     possible object is
     *     {@link TripDetailsHotel }
     *     
     */
    public TripDetailsHotel getTripDetailsHotel() {
        return tripDetailsHotel;
    }

    /**
     * Sets the value of the tripDetailsHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripDetailsHotel }
     *     
     */
    public void setTripDetailsHotel(TripDetailsHotel value) {
        this.tripDetailsHotel = value;
    }

    /**
     * Gets the value of the tripDetailsEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TripDetailsEvent }
     *     
     */
    public TripDetailsEvent getTripDetailsEvent() {
        return tripDetailsEvent;
    }

    /**
     * Sets the value of the tripDetailsEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripDetailsEvent }
     *     
     */
    public void setTripDetailsEvent(TripDetailsEvent value) {
        this.tripDetailsEvent = value;
    }

    /**
     * Gets the value of the tripDetailsRail property.
     * 
     * @return
     *     possible object is
     *     {@link TripDetailsRail }
     *     
     */
    public TripDetailsRail getTripDetailsRail() {
        return tripDetailsRail;
    }

    /**
     * Sets the value of the tripDetailsRail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripDetailsRail }
     *     
     */
    public void setTripDetailsRail(TripDetailsRail value) {
        this.tripDetailsRail = value;
    }

    /**
     * Gets the value of the tripDetailsCar property.
     * 
     * @return
     *     possible object is
     *     {@link TripDetailsCar }
     *     
     */
    public TripDetailsCar getTripDetailsCar() {
        return tripDetailsCar;
    }

    /**
     * Sets the value of the tripDetailsCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripDetailsCar }
     *     
     */
    public void setTripDetailsCar(TripDetailsCar value) {
        this.tripDetailsCar = value;
    }

    /**
     * Gets the value of the tripDetailsCloud property.
     * 
     * @return
     *     possible object is
     *     {@link TripDetailsCloud }
     *     
     */
    public TripDetailsCloud getTripDetailsCloud() {
        return tripDetailsCloud;
    }

    /**
     * Sets the value of the tripDetailsCloud property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripDetailsCloud }
     *     
     */
    public void setTripDetailsCloud(TripDetailsCloud value) {
        this.tripDetailsCloud = value;
    }

    /**
     * Gets the value of the tripDetailsWizzard property.
     * 
     * @return
     *     possible object is
     *     {@link TripDetailsWizzard }
     *     
     */
    public TripDetailsWizzard getTripDetailsWizzard() {
        return tripDetailsWizzard;
    }

    /**
     * Sets the value of the tripDetailsWizzard property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripDetailsWizzard }
     *     
     */
    public void setTripDetailsWizzard(TripDetailsWizzard value) {
        this.tripDetailsWizzard = value;
    }

    /**
     * Gets the value of the travelPolicyAlert property.
     * 
     * @return
     *     possible object is
     *     {@link TravelPolicyAlert }
     *     
     */
    public TravelPolicyAlert getTravelPolicyAlert() {
        return travelPolicyAlert;
    }

    /**
     * Sets the value of the travelPolicyAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelPolicyAlert }
     *     
     */
    public void setTravelPolicyAlert(TravelPolicyAlert value) {
        this.travelPolicyAlert = value;
    }

    /**
     * Gets the value of the freeDataFields property.
     * 
     * @return
     *     possible object is
     *     {@link FreeDataFields }
     *     
     */
    public FreeDataFields getFreeDataFields() {
        return freeDataFields;
    }

    /**
     * Sets the value of the freeDataFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeDataFields }
     *     
     */
    public void setFreeDataFields(FreeDataFields value) {
        this.freeDataFields = value;
    }

    /**
     * Gets the value of the profileReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the profileReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileReference }
     * 
     * 
     */
    public List<ProfileReference> getProfileReference() {
        if (profileReference == null) {
            profileReference = new ArrayList<ProfileReference>();
        }
        return this.profileReference;
    }

    /**
     * Gets the value of the cytricTripDetailNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCytricTripDetailNumber() {
        return cytricTripDetailNumber;
    }

    /**
     * Sets the value of the cytricTripDetailNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCytricTripDetailNumber(String value) {
        this.cytricTripDetailNumber = value;
    }

    /**
     * Gets the value of the cytricRequestDetailNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCytricRequestDetailNumber() {
        return cytricRequestDetailNumber;
    }

    /**
     * Sets the value of the cytricRequestDetailNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCytricRequestDetailNumber(String value) {
        this.cytricRequestDetailNumber = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EnumTripDetailType }
     *     
     */
    public EnumTripDetailType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTripDetailType }
     *     
     */
    public void setType(EnumTripDetailType value) {
        this.type = value;
    }

    /**
     * Gets the value of the canceled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanceled() {
        return canceled;
    }

    /**
     * Sets the value of the canceled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanceled(String value) {
        this.canceled = value;
    }

    /**
     * Gets the value of the bookingDateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingDateAndTime() {
        return bookingDateAndTime;
    }

    /**
     * Sets the value of the bookingDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingDateAndTime(String value) {
        this.bookingDateAndTime = value;
    }

    /**
     * Gets the value of the startDateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateAndTime() {
        return startDateAndTime;
    }

    /**
     * Sets the value of the startDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateAndTime(String value) {
        this.startDateAndTime = value;
    }

    /**
     * Gets the value of the completionDateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletionDateAndTime() {
        return completionDateAndTime;
    }

    /**
     * Sets the value of the completionDateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletionDateAndTime(String value) {
        this.completionDateAndTime = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
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
     * Gets the value of the originIATAName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginIATAName() {
        return originIATAName;
    }

    /**
     * Sets the value of the originIATAName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginIATAName(String value) {
        this.originIATAName = value;
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
     * Gets the value of the destinationIATAName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationIATAName() {
        return destinationIATAName;
    }

    /**
     * Sets the value of the destinationIATAName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationIATAName(String value) {
        this.destinationIATAName = value;
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
     * Gets the value of the originCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * Sets the value of the originCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCountry(String value) {
        this.originCountry = value;
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
     * Gets the value of the destinationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /**
     * Sets the value of the destinationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCountry(String value) {
        this.destinationCountry = value;
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
     * Gets the value of the inventorySystem property.
     * 
     * @return
     *     possible object is
     *     {@link EnumInventorySystem }
     *     
     */
    public EnumInventorySystem getInventorySystem() {
        return inventorySystem;
    }

    /**
     * Sets the value of the inventorySystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumInventorySystem }
     *     
     */
    public void setInventorySystem(EnumInventorySystem value) {
        this.inventorySystem = value;
    }

    /**
     * Gets the value of the inventoryRecordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryRecordLocator() {
        return inventoryRecordLocator;
    }

    /**
     * Sets the value of the inventoryRecordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryRecordLocator(String value) {
        this.inventoryRecordLocator = value;
    }

    /**
     * Gets the value of the passiveSystem property.
     * 
     * @return
     *     possible object is
     *     {@link EnumPassiveSystem }
     *     
     */
    public EnumPassiveSystem getPassiveSystem() {
        return passiveSystem;
    }

    /**
     * Sets the value of the passiveSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPassiveSystem }
     *     
     */
    public void setPassiveSystem(EnumPassiveSystem value) {
        this.passiveSystem = value;
    }

    /**
     * Gets the value of the passiveType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumPassiveType }
     *     
     */
    public EnumPassiveType getPassiveType() {
        return passiveType;
    }

    /**
     * Sets the value of the passiveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPassiveType }
     *     
     */
    public void setPassiveType(EnumPassiveType value) {
        this.passiveType = value;
    }

    /**
     * Gets the value of the passiveRecordLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassiveRecordLocator() {
        return passiveRecordLocator;
    }

    /**
     * Sets the value of the passiveRecordLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassiveRecordLocator(String value) {
        this.passiveRecordLocator = value;
    }

    /**
     * Gets the value of the onHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnHold() {
        return onHold;
    }

    /**
     * Sets the value of the onHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnHold(String value) {
        this.onHold = value;
    }

    /**
     * Gets the value of the delayedTicketing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayedTicketing() {
        return delayedTicketing;
    }

    /**
     * Sets the value of the delayedTicketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayedTicketing(String value) {
        this.delayedTicketing = value;
    }

    /**
     * Gets the value of the bookingSource property.
     * 
     * @return
     *     possible object is
     *     {@link EnumBookingSource }
     *     
     */
    public EnumBookingSource getBookingSource() {
        return bookingSource;
    }

    /**
     * Sets the value of the bookingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumBookingSource }
     *     
     */
    public void setBookingSource(EnumBookingSource value) {
        this.bookingSource = value;
    }

    /**
     * Gets the value of the fareLogixLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareLogixLocator() {
        return fareLogixLocator;
    }

    /**
     * Sets the value of the fareLogixLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareLogixLocator(String value) {
        this.fareLogixLocator = value;
    }

}
