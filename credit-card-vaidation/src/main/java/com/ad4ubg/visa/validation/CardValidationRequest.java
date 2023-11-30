package com.ad4ubg.visa.validation;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Card validation request.
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardValidationRequest {
    /**
     * The Systems trace audit number.
     */
    @JsonProperty("systemsTraceAuditNumber")
    public String systemsTraceAuditNumber;
    /**
     * The Card cvv 2 value.
     */
    @JsonProperty("cardCvv2Value")
    public String cardCvv2Value;
    /**
     * The Card acceptor.
     */
    @JsonProperty("cardAcceptor")
    public CardAcceptor cardAcceptor;
    /**
     * The Acquirer country code.
     */
    @JsonProperty("acquirerCountryCode")
    public String acquirerCountryCode;
    /**
     * The Primary account number.
     */
    @JsonProperty("primaryAccountNumber")
    public String primaryAccountNumber;
    /**
     * The Acquiring bin.
     */
    @JsonProperty("acquiringBin")
    public String acquiringBin;
    /**
     * The Retrieval reference number.
     */
    @JsonProperty("retrievalReferenceNumber")
    public String retrievalReferenceNumber;
    /**
     * The Card expiry date.
     */
    @JsonProperty("cardExpiryDate")
    public String cardExpiryDate;
    /**
     * The Address verification results.
     */
    @JsonProperty("addressVerificationResults")
    public AddressVerificationResults addressVerificationResults;

    /**
     * Gets systems trace audit number.
     *
     * @return the systems trace audit number
     */
    public String getSystemsTraceAuditNumber() {
        return systemsTraceAuditNumber;
    }

    /**
     * Sets systems trace audit number.
     *
     * @param systemsTraceAuditNumber the systems trace audit number
     */
    public void setSystemsTraceAuditNumber(String systemsTraceAuditNumber) {
        this.systemsTraceAuditNumber = systemsTraceAuditNumber;
    }

    /**
     * Gets card cvv 2 value.
     *
     * @return the card cvv 2 value
     */
    public String getCardCvv2Value() {
        return cardCvv2Value;
    }

    /**
     * Sets card cvv 2 value.
     *
     * @param cardCvv2Value the card cvv 2 value
     */
    public void setCardCvv2Value(String cardCvv2Value) {
        this.cardCvv2Value = cardCvv2Value;
    }

    /**
     * Gets card acceptor.
     *
     * @return the card acceptor
     */
    public CardAcceptor getCardAcceptor() {
        return cardAcceptor;
    }

    /**
     * Sets card acceptor.
     *
     * @param cardAcceptor the card acceptor
     */
    public void setCardAcceptor(CardAcceptor cardAcceptor) {
        this.cardAcceptor = cardAcceptor;
    }

    /**
     * Gets acquirer country code.
     *
     * @return the acquirer country code
     */
    public String getAcquirerCountryCode() {
        return acquirerCountryCode;
    }

    /**
     * Sets acquirer country code.
     *
     * @param acquirerCountryCode the acquirer country code
     */
    public void setAcquirerCountryCode(String acquirerCountryCode) {
        this.acquirerCountryCode = acquirerCountryCode;
    }

    /**
     * Gets primary account number.
     *
     * @return the primary account number
     */
    public String getPrimaryAccountNumber() {
        return primaryAccountNumber;
    }

    /**
     * Sets primary account number.
     *
     * @param primaryAccountNumber the primary account number
     */
    public void setPrimaryAccountNumber(String primaryAccountNumber) {
        this.primaryAccountNumber = primaryAccountNumber;
    }

    /**
     * Gets acquiring bin.
     *
     * @return the acquiring bin
     */
    public String getAcquiringBin() {
        return acquiringBin;
    }

    /**
     * Sets acquiring bin.
     *
     * @param acquiringBin the acquiring bin
     */
    public void setAcquiringBin(String acquiringBin) {
        this.acquiringBin = acquiringBin;
    }

    /**
     * Gets retrieval reference number.
     *
     * @return the retrieval reference number
     */
    public String getRetrievalReferenceNumber() {
        return retrievalReferenceNumber;
    }

    /**
     * Sets retrieval reference number.
     *
     * @param retrievalReferenceNumber the retrieval reference number
     */
    public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
        this.retrievalReferenceNumber = retrievalReferenceNumber;
    }

    /**
     * Gets card expiry date.
     *
     * @return the card expiry date
     */
    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    /**
     * Sets card expiry date.
     *
     * @param cardExpiryDate the card expiry date
     */
    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    /**
     * Gets address verification results.
     *
     * @return the address verification results
     */
    public AddressVerificationResults getAddressVerificationResults() {
        return addressVerificationResults;
    }

    /**
     * Sets address verification results.
     *
     * @param addressVerificationResults the address verification results
     */
    public void setAddressVerificationResults(AddressVerificationResults addressVerificationResults) {
        this.addressVerificationResults = addressVerificationResults;
    }

    @Override
    public String toString() {
        return "CardValidationRequest{" +
                "systemsTraceAuditNumber='" + systemsTraceAuditNumber + '\'' +
                ", cardCvv2Value='" + cardCvv2Value + '\'' +
                ", cardAcceptor=" + cardAcceptor +
                ", acquirerCountryCode='" + acquirerCountryCode + '\'' +
                ", primaryAccountNumber='" + primaryAccountNumber + '\'' +
                ", acquiringBin='" + acquiringBin + '\'' +
                ", retrievalReferenceNumber='" + retrievalReferenceNumber + '\'' +
                ", cardExpiryDate='" + cardExpiryDate + '\'' +
                ", addressVerificationResults=" + addressVerificationResults +
                '}';
    }
}
