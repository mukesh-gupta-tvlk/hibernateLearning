
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
 * <p>Java class for InsuranceReservationEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceReservationEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BaseAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BaseCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMDAdded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EMDIssued" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EMDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSTAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InsExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="InsuranceAddonStatus" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}FlightAddOnBookingStatus" minOccurs="0"/>
 *         &lt;element name="InsuranceReservationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InsuranceReservationOrderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsNormalFlowSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OfferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentFailed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PolicyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyPurchasecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuoteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFICSubCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ServiceRequestInformation" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ServiceRequestInfo" minOccurs="0"/>
 *         &lt;element name="TicketStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceReservationEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "amount",
    "baseAmount",
    "baseCurrencyCode",
    "currencyCode",
    "destination",
    "emdAdded",
    "emdIssued",
    "emdNumber",
    "errorMsg",
    "gstAmount",
    "insExpiryDate",
    "insuranceAddonStatus",
    "insuranceReservationID",
    "insuranceReservationOrderID",
    "isNormalFlowSuccess",
    "offerId",
    "paymentFailed",
    "policyCode",
    "policyName",
    "policyPurchasecode",
    "purchaseID",
    "quoteId",
    "rficSubCode",
    "reservationID",
    "resultMsg",
    "status",
    "serviceRequestInformation",
    "ticketStatus"
})
public class InsuranceReservationEN {

    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "BaseAmount")
    protected BigDecimal baseAmount;
    @XmlElementRef(name = "BaseCurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> baseCurrencyCode;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "Destination", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destination;
    @XmlElement(name = "EMDAdded")
    protected Boolean emdAdded;
    @XmlElement(name = "EMDIssued")
    protected Boolean emdIssued;
    @XmlElementRef(name = "EMDNumber", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emdNumber;
    @XmlElementRef(name = "ErrorMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorMsg;
    @XmlElement(name = "GSTAmount")
    protected BigDecimal gstAmount;
    @XmlElement(name = "InsExpiryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar insExpiryDate;
    @XmlElementRef(name = "InsuranceAddonStatus", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightAddOnBookingStatus> insuranceAddonStatus;
    @XmlElement(name = "InsuranceReservationID")
    protected Integer insuranceReservationID;
    @XmlElement(name = "InsuranceReservationOrderID")
    protected Integer insuranceReservationOrderID;
    @XmlElement(name = "IsNormalFlowSuccess")
    protected Boolean isNormalFlowSuccess;
    @XmlElementRef(name = "OfferId", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> offerId;
    @XmlElement(name = "PaymentFailed")
    protected Boolean paymentFailed;
    @XmlElementRef(name = "PolicyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyCode;
    @XmlElementRef(name = "PolicyName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyName;
    @XmlElementRef(name = "PolicyPurchasecode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyPurchasecode;
    @XmlElement(name = "PurchaseID")
    protected Integer purchaseID;
    @XmlElementRef(name = "QuoteId", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quoteId;
    @XmlElementRef(name = "RFICSubCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rficSubCode;
    @XmlElementRef(name = "ReservationID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reservationID;
    @XmlElementRef(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> resultMsg;
    @XmlElement(name = "STATUS")
    protected Integer status;
    @XmlElementRef(name = "ServiceRequestInformation", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceRequestInfo> serviceRequestInformation;
    @XmlElement(name = "TicketStatus")
    protected Integer ticketStatus;

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
     * Gets the value of the baseCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseCurrencyCode() {
        return baseCurrencyCode;
    }

    /**
     * Sets the value of the baseCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseCurrencyCode(JAXBElement<String> value) {
        this.baseCurrencyCode = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestination(JAXBElement<String> value) {
        this.destination = value;
    }

    /**
     * Gets the value of the emdAdded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEMDAdded() {
        return emdAdded;
    }

    /**
     * Sets the value of the emdAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEMDAdded(Boolean value) {
        this.emdAdded = value;
    }

    /**
     * Gets the value of the emdIssued property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEMDIssued() {
        return emdIssued;
    }

    /**
     * Sets the value of the emdIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEMDIssued(Boolean value) {
        this.emdIssued = value;
    }

    /**
     * Gets the value of the emdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMDNumber() {
        return emdNumber;
    }

    /**
     * Sets the value of the emdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMDNumber(JAXBElement<String> value) {
        this.emdNumber = value;
    }

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMsg(JAXBElement<String> value) {
        this.errorMsg = value;
    }

    /**
     * Gets the value of the gstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGSTAmount() {
        return gstAmount;
    }

    /**
     * Sets the value of the gstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGSTAmount(BigDecimal value) {
        this.gstAmount = value;
    }

    /**
     * Gets the value of the insExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInsExpiryDate() {
        return insExpiryDate;
    }

    /**
     * Sets the value of the insExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInsExpiryDate(XMLGregorianCalendar value) {
        this.insExpiryDate = value;
    }

    /**
     * Gets the value of the insuranceAddonStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightAddOnBookingStatus }{@code >}
     *     
     */
    public JAXBElement<FlightAddOnBookingStatus> getInsuranceAddonStatus() {
        return insuranceAddonStatus;
    }

    /**
     * Sets the value of the insuranceAddonStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightAddOnBookingStatus }{@code >}
     *     
     */
    public void setInsuranceAddonStatus(JAXBElement<FlightAddOnBookingStatus> value) {
        this.insuranceAddonStatus = value;
    }

    /**
     * Gets the value of the insuranceReservationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInsuranceReservationID() {
        return insuranceReservationID;
    }

    /**
     * Sets the value of the insuranceReservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInsuranceReservationID(Integer value) {
        this.insuranceReservationID = value;
    }

    /**
     * Gets the value of the insuranceReservationOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInsuranceReservationOrderID() {
        return insuranceReservationOrderID;
    }

    /**
     * Sets the value of the insuranceReservationOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInsuranceReservationOrderID(Integer value) {
        this.insuranceReservationOrderID = value;
    }

    /**
     * Gets the value of the isNormalFlowSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNormalFlowSuccess() {
        return isNormalFlowSuccess;
    }

    /**
     * Sets the value of the isNormalFlowSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNormalFlowSuccess(Boolean value) {
        this.isNormalFlowSuccess = value;
    }

    /**
     * Gets the value of the offerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfferId(JAXBElement<String> value) {
        this.offerId = value;
    }

    /**
     * Gets the value of the paymentFailed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentFailed() {
        return paymentFailed;
    }

    /**
     * Sets the value of the paymentFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentFailed(Boolean value) {
        this.paymentFailed = value;
    }

    /**
     * Gets the value of the policyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyCode() {
        return policyCode;
    }

    /**
     * Sets the value of the policyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyCode(JAXBElement<String> value) {
        this.policyCode = value;
    }

    /**
     * Gets the value of the policyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyName() {
        return policyName;
    }

    /**
     * Sets the value of the policyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyName(JAXBElement<String> value) {
        this.policyName = value;
    }

    /**
     * Gets the value of the policyPurchasecode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyPurchasecode() {
        return policyPurchasecode;
    }

    /**
     * Sets the value of the policyPurchasecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyPurchasecode(JAXBElement<String> value) {
        this.policyPurchasecode = value;
    }

    /**
     * Gets the value of the purchaseID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPurchaseID() {
        return purchaseID;
    }

    /**
     * Sets the value of the purchaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPurchaseID(Integer value) {
        this.purchaseID = value;
    }

    /**
     * Gets the value of the quoteId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuoteId() {
        return quoteId;
    }

    /**
     * Sets the value of the quoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuoteId(JAXBElement<String> value) {
        this.quoteId = value;
    }

    /**
     * Gets the value of the rficSubCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRFICSubCode() {
        return rficSubCode;
    }

    /**
     * Sets the value of the rficSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRFICSubCode(JAXBElement<String> value) {
        this.rficSubCode = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSTATUS(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the serviceRequestInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceRequestInfo }{@code >}
     *     
     */
    public JAXBElement<ServiceRequestInfo> getServiceRequestInformation() {
        return serviceRequestInformation;
    }

    /**
     * Sets the value of the serviceRequestInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceRequestInfo }{@code >}
     *     
     */
    public void setServiceRequestInformation(JAXBElement<ServiceRequestInfo> value) {
        this.serviceRequestInformation = value;
    }

    /**
     * Gets the value of the ticketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTicketStatus() {
        return ticketStatus;
    }

    /**
     * Sets the value of the ticketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTicketStatus(Integer value) {
        this.ticketStatus = value;
    }

}
