package com.ad4ubg.visa.validation;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Card acceptor.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardAcceptor {
    /**
     * The Address.
     */
    @JsonProperty("address")
    public Address address;
    /**
     * The Id code.
     */
    @JsonProperty("idCode")
    public String idCode;
    /**
     * The Name.
     */
    @JsonProperty("name")
    public String name;
    /**
     * The Terminal id.
     */
    @JsonProperty("terminalId")
    public String terminalId;

    /**
     * Gets address.
     *
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Gets id code.
     *
     * @return the id code
     */
    public String getIdCode() {
        return idCode;
    }

    /**
     * Sets id code.
     *
     * @param idCode the id code
     */
    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets terminal id.
     *
     * @return the terminal id
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Sets terminal id.
     *
     * @param terminalId the terminal id
     */
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    @Override
    public String toString() {
        return "CardAcceptor{" +
                "address=" + address +
                ", idCode='" + idCode + '\'' +
                ", name='" + name + '\'' +
                ", terminalId='" + terminalId + '\'' +
                '}';
    }
}
