
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FlightManagementResponseEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightManagementResponseEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AmountinPaymentCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BaseAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BaseCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DispAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DividedPNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fees" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IsETicketed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPartialTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ManageBookingStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PNRNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxLoginID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentCurrencyRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PaymentMethodID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProcessingFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RequestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TrackingNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionRequested" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserLoginID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightManagementResponseEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "amount",
    "amountinPaymentCurrency",
    "baseAmount",
    "baseCurrency",
    "cmId",
    "currencyRatio",
    "dispAmount",
    "dividedPNR",
    "errorMessage",
    "fees",
    "isETicketed",
    "isPartialTransaction",
    "isSuccess",
    "manageBookingStatus",
    "pnrNo",
    "paxLoginID",
    "paymentCurrency",
    "paymentCurrencyRatio",
    "paymentMethodID",
    "paymentStatus",
    "processingFee",
    "requestDate",
    "requestType",
    "reservationID",
    "responseID",
    "resultMsg",
    "taxAmount",
    "trackingNo",
    "transactionDirection",
    "transactionRequested",
    "transactionType",
    "userLoginID"
})
public class FlightManagementResponseEN {

    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "AmountinPaymentCurrency")
    protected BigDecimal amountinPaymentCurrency;
    @XmlElement(name = "BaseAmount")
    protected BigDecimal baseAmount;
    @XmlElementRef(name = "BaseCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> baseCurrency;
    @XmlElementRef(name = "CMId", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cmId;
    @XmlElement(name = "CurrencyRatio")
    protected BigDecimal currencyRatio;
    @XmlElementRef(name = "DispAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispAmount;
    @XmlElementRef(name = "DividedPNR", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dividedPNR;
    @XmlElementRef(name = "ErrorMessage", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorMessage;
    @XmlElement(name = "Fees")
    protected BigDecimal fees;
    @XmlElement(name = "IsETicketed")
    protected Boolean isETicketed;
    @XmlElement(name = "IsPartialTransaction")
    protected Boolean isPartialTransaction;
    @XmlElement(name = "IsSuccess")
    protected Boolean isSuccess;
    @XmlElement(name = "ManageBookingStatus")
    protected Boolean manageBookingStatus;
    @XmlElementRef(name = "PNRNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pnrNo;
    @XmlElement(name = "PaxLoginID")
    protected Integer paxLoginID;
    @XmlElementRef(name = "PaymentCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentCurrency;
    @XmlElement(name = "PaymentCurrencyRatio")
    protected BigDecimal paymentCurrencyRatio;
    @XmlElement(name = "PaymentMethodID")
    protected Integer paymentMethodID;
    @XmlElement(name = "PaymentStatus")
    protected Integer paymentStatus;
    @XmlElement(name = "ProcessingFee")
    protected BigDecimal processingFee;
    @XmlElement(name = "RequestDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDate;
    @XmlElementRef(name = "RequestType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestType;
    @XmlElementRef(name = "ReservationID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reservationID;
    @XmlElement(name = "ResponseID")
    protected Long responseID;
    @XmlElementRef(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> resultMsg;
    @XmlElement(name = "TaxAmount")
    protected BigDecimal taxAmount;
    @XmlElementRef(name = "TrackingNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trackingNo;
    @XmlElementRef(name = "TransactionDirection", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionDirection;
    @XmlElementRef(name = "TransactionRequested", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionRequested;
    @XmlElementRef(name = "TransactionType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionType;
    @XmlElement(name = "UserLoginID")
    protected Integer userLoginID;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the amountinPaymentCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountinPaymentCurrency() {
        return amountinPaymentCurrency;
    }

    /**
     * Sets the value of the amountinPaymentCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountinPaymentCurrency(BigDecimal value) {
        this.amountinPaymentCurrency = value;
    }

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseAmount(BigDecimal value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the baseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseCurrency() {
        return baseCurrency;
    }

    /**
     * Sets the value of the baseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseCurrency(JAXBElement<String> value) {
        this.baseCurrency = value;
    }

    /**
     * Gets the value of the cmId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCMId() {
        return cmId;
    }

    /**
     * Sets the value of the cmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCMId(JAXBElement<String> value) {
        this.cmId = value;
    }

    /**
     * Gets the value of the currencyRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyRatio() {
        return currencyRatio;
    }

    /**
     * Sets the value of the currencyRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyRatio(BigDecimal value) {
        this.currencyRatio = value;
    }

    /**
     * Gets the value of the dispAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispAmount() {
        return dispAmount;
    }

    /**
     * Sets the value of the dispAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispAmount(JAXBElement<String> value) {
        this.dispAmount = value;
    }

    /**
     * Gets the value of the dividedPNR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDividedPNR() {
        return dividedPNR;
    }

    /**
     * Sets the value of the dividedPNR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDividedPNR(JAXBElement<String> value) {
        this.dividedPNR = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMessage(JAXBElement<String> value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFees(BigDecimal value) {
        this.fees = value;
    }

    /**
     * Gets the value of the isETicketed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsETicketed() {
        return isETicketed;
    }

    /**
     * Sets the value of the isETicketed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsETicketed(Boolean value) {
        this.isETicketed = value;
    }

    /**
     * Gets the value of the isPartialTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPartialTransaction() {
        return isPartialTransaction;
    }

    /**
     * Sets the value of the isPartialTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPartialTransaction(Boolean value) {
        this.isPartialTransaction = value;
    }

    /**
     * Gets the value of the isSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSuccess() {
        return isSuccess;
    }

    /**
     * Sets the value of the isSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSuccess(Boolean value) {
        this.isSuccess = value;
    }

    /**
     * Gets the value of the manageBookingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManageBookingStatus() {
        return manageBookingStatus;
    }

    /**
     * Sets the value of the manageBookingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManageBookingStatus(Boolean value) {
        this.manageBookingStatus = value;
    }

    /**
     * Gets the value of the pnrNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPNRNo() {
        return pnrNo;
    }

    /**
     * Sets the value of the pnrNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPNRNo(JAXBElement<String> value) {
        this.pnrNo = value;
    }

    /**
     * Gets the value of the paxLoginID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaxLoginID() {
        return paxLoginID;
    }

    /**
     * Sets the value of the paxLoginID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaxLoginID(Integer value) {
        this.paxLoginID = value;
    }

    /**
     * Gets the value of the paymentCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentCurrency() {
        return paymentCurrency;
    }

    /**
     * Sets the value of the paymentCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentCurrency(JAXBElement<String> value) {
        this.paymentCurrency = value;
    }

    /**
     * Gets the value of the paymentCurrencyRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentCurrencyRatio() {
        return paymentCurrencyRatio;
    }

    /**
     * Sets the value of the paymentCurrencyRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentCurrencyRatio(BigDecimal value) {
        this.paymentCurrencyRatio = value;
    }

    /**
     * Gets the value of the paymentMethodID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentMethodID() {
        return paymentMethodID;
    }

    /**
     * Sets the value of the paymentMethodID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentMethodID(Integer value) {
        this.paymentMethodID = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentStatus(Integer value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the processingFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProcessingFee() {
        return processingFee;
    }

    /**
     * Sets the value of the processingFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProcessingFee(BigDecimal value) {
        this.processingFee = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestType(JAXBElement<String> value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the reservationID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReservationID() {
        return reservationID;
    }

    /**
     * Sets the value of the reservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReservationID(JAXBElement<String> value) {
        this.reservationID = value;
    }

    /**
     * Gets the value of the responseID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResponseID() {
        return responseID;
    }

    /**
     * Sets the value of the responseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResponseID(Long value) {
        this.responseID = value;
    }

    /**
     * Gets the value of the resultMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public JAXBElement<Result> getResultMsg() {
        return resultMsg;
    }

    /**
     * Sets the value of the resultMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public void setResultMsg(JAXBElement<Result> value) {
        this.resultMsg = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the trackingNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrackingNo() {
        return trackingNo;
    }

    /**
     * Sets the value of the trackingNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrackingNo(JAXBElement<String> value) {
        this.trackingNo = value;
    }

    /**
     * Gets the value of the transactionDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionDirection() {
        return transactionDirection;
    }

    /**
     * Sets the value of the transactionDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionDirection(JAXBElement<String> value) {
        this.transactionDirection = value;
    }

    /**
     * Gets the value of the transactionRequested property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionRequested() {
        return transactionRequested;
    }

    /**
     * Sets the value of the transactionRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionRequested(JAXBElement<String> value) {
        this.transactionRequested = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionType(JAXBElement<String> value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the userLoginID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserLoginID() {
        return userLoginID;
    }

    /**
     * Sets the value of the userLoginID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserLoginID(Integer value) {
        this.userLoginID = value;
    }

}
