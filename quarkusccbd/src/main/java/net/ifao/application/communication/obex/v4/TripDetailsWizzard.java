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
 *         &lt;element ref="{}TripDetailsWizzardOther" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tripDetailsWizzardOther"
})
@XmlRootElement(name = "TripDetailsWizzard")
public class TripDetailsWizzard {

    @XmlElement(name = "TripDetailsWizzardOther", required = true)
    protected List<TripDetailsWizzardOther> tripDetailsWizzardOther;

    /**
     * Gets the value of the tripDetailsWizzardOther property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tripDetailsWizzardOther property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripDetailsWizzardOther().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TripDetailsWizzardOther }
     * 
     * 
     */
    public List<TripDetailsWizzardOther> getTripDetailsWizzardOther() {
        if (tripDetailsWizzardOther == null) {
            tripDetailsWizzardOther = new ArrayList<TripDetailsWizzardOther>();
        }
        return this.tripDetailsWizzardOther;
    }

}
