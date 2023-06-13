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
 *         &lt;element ref="{}CreditCardField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="companyCode" use="required" type="{}CCCompanyCode" /&gt;
 *       &lt;attribute name="number" use="required" type="{}EncryptedNumber" /&gt;
 *       &lt;attribute name="accountNumber" type="{}String" /&gt;
 *       &lt;attribute name="cvn" type="{}EncryptedNumber" /&gt;
 *       &lt;attribute name="paidByCompany" type="{}Boolean" /&gt;
 *       &lt;attribute name="expireDate" type="{}DateTime" /&gt;
 *       &lt;attribute name="corporateCard" type="{}Boolean" /&gt;
 *       &lt;attribute name="cardHolder" type="{}String" /&gt;
 *       &lt;attribute name="cardIsPresentWithTraveller" type="{}Boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creditCardField"
})
@XmlRootElement(name = "OriginalCreditCard")
public class OriginalCreditCard {

    @XmlElement(name = "CreditCardField")
    protected List<CreditCardField> creditCardField;
    @XmlAttribute(name = "companyCode", required = true)
    protected String companyCode;
    @XmlAttribute(name = "number", required = true)
    protected String number;
    @XmlAttribute(name = "accountNumber")
    protected String accountNumber;
    @XmlAttribute(name = "cvn")
    protected String cvn;
    @XmlAttribute(name = "paidByCompany")
    protected String paidByCompany;
    @XmlAttribute(name = "expireDate")
    protected String expireDate;
    @XmlAttribute(name = "corporateCard")
    protected String corporateCard;
    @XmlAttribute(name = "cardHolder")
    protected String cardHolder;
    @XmlAttribute(name = "cardIsPresentWithTraveller")
    protected String cardIsPresentWithTraveller;

    /**
     * Gets the value of the creditCardField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the javax XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the creditCardField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditCardField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditCardField }
     * 
     * 
     */
    public List<CreditCardField> getCreditCardField() {
        if (creditCardField == null) {
            creditCardField = new ArrayList<CreditCardField>();
        }
        return this.creditCardField;
    }

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the cvn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvn() {
        return cvn;
    }

    /**
     * Sets the value of the cvn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvn(String value) {
        this.cvn = value;
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

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDate(String value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the corporateCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateCard() {
        return corporateCard;
    }

    /**
     * Sets the value of the corporateCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateCard(String value) {
        this.corporateCard = value;
    }

    /**
     * Gets the value of the cardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * Sets the value of the cardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolder(String value) {
        this.cardHolder = value;
    }

    /**
     * Gets the value of the cardIsPresentWithTraveller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIsPresentWithTraveller() {
        return cardIsPresentWithTraveller;
    }

    /**
     * Sets the value of the cardIsPresentWithTraveller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIsPresentWithTraveller(String value) {
        this.cardIsPresentWithTraveller = value;
    }

}
