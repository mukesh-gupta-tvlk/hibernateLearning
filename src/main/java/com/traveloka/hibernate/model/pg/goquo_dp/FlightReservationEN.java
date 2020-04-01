
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
 * <p>Java class for FlightReservationEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightReservationEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Amount_MYR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ArrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B2BID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BaseCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseMarkUp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BaseTotalCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BaseTotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CUPaymentMethodID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CUSupplierID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrencyRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CustomerUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DepCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DiffredTaxOnDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ETicketedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EticketNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FairGuranteeTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightReservationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IATACode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IncCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternalReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarkupApplied" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfficeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PNRCancelledOn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PNRCancelledStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PNRCreationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PNRNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromoAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="SabreAgentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TicketedBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TicketingDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TotalMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UserLoginID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VATTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WHTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="journeyType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightReservationEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "airlineLoc",
    "amount",
    "amountMYR",
    "arrCityCode",
    "b2BID",
    "baseCurrency",
    "baseMarkUp",
    "baseTotalCost",
    "baseTotalPrice",
    "cuPaymentMethodID",
    "cuSupplierID",
    "cabinClass",
    "currencyRatio",
    "customerUserID",
    "depCityCode",
    "depDate",
    "diffredTaxOnDiscount",
    "discAmount",
    "discCode",
    "eTicketedDateTime",
    "errorDescription",
    "eticketNo",
    "fairGuranteeTotalAmount",
    "fareBasis",
    "fareType",
    "flightReservationID",
    "iataCode",
    "ipAddress",
    "ipCountry",
    "incAmount",
    "incCode",
    "internalReferenceNo",
    "markupApplied",
    "notes",
    "officeID",
    "pnrCancelledOn",
    "pnrCancelledStatus",
    "pnrCreationDateTime",
    "pnrNo",
    "promoAmt",
    "reservationID",
    "resultMsg",
    "sabreAgentCode",
    "serviceUrl",
    "sourceSite",
    "stationCode",
    "status",
    "ticketedBy",
    "ticketingDeadline",
    "totalMarkup",
    "userLoginID",
    "vatTax",
    "whTax",
    "journeyType"
})
public class FlightReservationEN {

    @XmlElementRef(name = "AirlineLoc", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airlineLoc;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "Amount_MYR")
    protected BigDecimal amountMYR;
    @XmlElementRef(name = "ArrCityCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrCityCode;
    @XmlElement(name = "B2BID")
    protected Integer b2BID;
    @XmlElementRef(name = "BaseCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> baseCurrency;
    @XmlElement(name = "BaseMarkUp")
    protected BigDecimal baseMarkUp;
    @XmlElement(name = "BaseTotalCost")
    protected BigDecimal baseTotalCost;
    @XmlElement(name = "BaseTotalPrice")
    protected BigDecimal baseTotalPrice;
    @XmlElement(name = "CUPaymentMethodID")
    protected Integer cuPaymentMethodID;
    @XmlElement(name = "CUSupplierID")
    protected Integer cuSupplierID;
    @XmlElement(name = "CabinClass")
    protected Integer cabinClass;
    @XmlElement(name = "CurrencyRatio")
    protected BigDecimal currencyRatio;
    @XmlElement(name = "CustomerUserID")
    protected Integer customerUserID;
    @XmlElementRef(name = "DepCityCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depCityCode;
    @XmlElement(name = "DepDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depDate;
    @XmlElement(name = "DiffredTaxOnDiscount")
    protected BigDecimal diffredTaxOnDiscount;
    @XmlElement(name = "DiscAmount")
    protected BigDecimal discAmount;
    @XmlElementRef(name = "DiscCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> discCode;
    @XmlElement(name = "ETicketedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eTicketedDateTime;
    @XmlElementRef(name = "ErrorDescription", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorDescription;
    @XmlElementRef(name = "EticketNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eticketNo;
    @XmlElement(name = "FairGuranteeTotalAmount")
    protected BigDecimal fairGuranteeTotalAmount;
    @XmlElementRef(name = "FareBasis", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareBasis;
    @XmlElementRef(name = "FareType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareType;
    @XmlElement(name = "FlightReservationID")
    protected Integer flightReservationID;
    @XmlElementRef(name = "IATACode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iataCode;
    @XmlElementRef(name = "IPAddress", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ipAddress;
    @XmlElementRef(name = "IPCountry", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ipCountry;
    @XmlElement(name = "IncAmount")
    protected BigDecimal incAmount;
    @XmlElementRef(name = "IncCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> incCode;
    @XmlElementRef(name = "InternalReferenceNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> internalReferenceNo;
    @XmlElementRef(name = "MarkupApplied", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markupApplied;
    @XmlElementRef(name = "Notes", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElementRef(name = "OfficeID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> officeID;
    @XmlElement(name = "PNRCancelledOn")
    protected Integer pnrCancelledOn;
    @XmlElement(name = "PNRCancelledStatus")
    protected Integer pnrCancelledStatus;
    @XmlElement(name = "PNRCreationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pnrCreationDateTime;
    @XmlElementRef(name = "PNRNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pnrNo;
    @XmlElement(name = "PromoAmt")
    protected BigDecimal promoAmt;
    @XmlElementRef(name = "ReservationID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reservationID;
    @XmlElementRef(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> resultMsg;
    @XmlElementRef(name = "SabreAgentCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sabreAgentCode;
    @XmlElementRef(name = "ServiceUrl", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceUrl;
    @XmlElementRef(name = "SourceSite", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceSite;
    @XmlElementRef(name = "StationCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stationCode;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElement(name = "TicketedBy")
    protected Integer ticketedBy;
    @XmlElement(name = "TicketingDeadline")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ticketingDeadline;
    @XmlElement(name = "TotalMarkup")
    protected BigDecimal totalMarkup;
    @XmlElement(name = "UserLoginID")
    protected Integer userLoginID;
    @XmlElement(name = "VATTax")
    protected BigDecimal vatTax;
    @XmlElement(name = "WHTax")
    protected BigDecimal whTax;
    protected Integer journeyType;

    /**
     * Gets the value of the airlineLoc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirlineLoc() {
        return airlineLoc;
    }

    /**
     * Sets the value of the airlineLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirlineLoc(JAXBElement<String> value) {
        this.airlineLoc = value;
    }

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
     * Gets the value of the amountMYR property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountMYR() {
        return amountMYR;
    }

    /**
     * Sets the value of the amountMYR property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountMYR(BigDecimal value) {
        this.amountMYR = value;
    }

    /**
     * Gets the value of the arrCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrCityCode() {
        return arrCityCode;
    }

    /**
     * Sets the value of the arrCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrCityCode(JAXBElement<String> value) {
        this.arrCityCode = value;
    }

    /**
     * Gets the value of the b2BID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getB2BID() {
        return b2BID;
    }

    /**
     * Sets the value of the b2BID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setB2BID(Integer value) {
        this.b2BID = value;
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
     * Gets the value of the baseMarkUp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseMarkUp() {
        return baseMarkUp;
    }

    /**
     * Sets the value of the baseMarkUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseMarkUp(BigDecimal value) {
        this.baseMarkUp = value;
    }

    /**
     * Gets the value of the baseTotalCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseTotalCost() {
        return baseTotalCost;
    }

    /**
     * Sets the value of the baseTotalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseTotalCost(BigDecimal value) {
        this.baseTotalCost = value;
    }

    /**
     * Gets the value of the baseTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseTotalPrice() {
        return baseTotalPrice;
    }

    /**
     * Sets the value of the baseTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseTotalPrice(BigDecimal value) {
        this.baseTotalPrice = value;
    }

    /**
     * Gets the value of the cuPaymentMethodID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCUPaymentMethodID() {
        return cuPaymentMethodID;
    }

    /**
     * Sets the value of the cuPaymentMethodID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCUPaymentMethodID(Integer value) {
        this.cuPaymentMethodID = value;
    }

    /**
     * Gets the value of the cuSupplierID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCUSupplierID() {
        return cuSupplierID;
    }

    /**
     * Sets the value of the cuSupplierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCUSupplierID(Integer value) {
        this.cuSupplierID = value;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCabinClass(Integer value) {
        this.cabinClass = value;
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
     * Gets the value of the customerUserID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerUserID() {
        return customerUserID;
    }

    /**
     * Sets the value of the customerUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerUserID(Integer value) {
        this.customerUserID = value;
    }

    /**
     * Gets the value of the depCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepCityCode() {
        return depCityCode;
    }

    /**
     * Sets the value of the depCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepCityCode(JAXBElement<String> value) {
        this.depCityCode = value;
    }

    /**
     * Gets the value of the depDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepDate() {
        return depDate;
    }

    /**
     * Sets the value of the depDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepDate(XMLGregorianCalendar value) {
        this.depDate = value;
    }

    /**
     * Gets the value of the diffredTaxOnDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiffredTaxOnDiscount() {
        return diffredTaxOnDiscount;
    }

    /**
     * Sets the value of the diffredTaxOnDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiffredTaxOnDiscount(BigDecimal value) {
        this.diffredTaxOnDiscount = value;
    }

    /**
     * Gets the value of the discAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscAmount() {
        return discAmount;
    }

    /**
     * Sets the value of the discAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscAmount(BigDecimal value) {
        this.discAmount = value;
    }

    /**
     * Gets the value of the discCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDiscCode() {
        return discCode;
    }

    /**
     * Sets the value of the discCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDiscCode(JAXBElement<String> value) {
        this.discCode = value;
    }

    /**
     * Gets the value of the eTicketedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getETicketedDateTime() {
        return eTicketedDateTime;
    }

    /**
     * Sets the value of the eTicketedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setETicketedDateTime(XMLGregorianCalendar value) {
        this.eTicketedDateTime = value;
    }

    /**
     * Gets the value of the errorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorDescription() {
        return errorDescription;
    }

    /**
     * Sets the value of the errorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorDescription(JAXBElement<String> value) {
        this.errorDescription = value;
    }

    /**
     * Gets the value of the eticketNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEticketNo() {
        return eticketNo;
    }

    /**
     * Sets the value of the eticketNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEticketNo(JAXBElement<String> value) {
        this.eticketNo = value;
    }

    /**
     * Gets the value of the fairGuranteeTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFairGuranteeTotalAmount() {
        return fairGuranteeTotalAmount;
    }

    /**
     * Sets the value of the fairGuranteeTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFairGuranteeTotalAmount(BigDecimal value) {
        this.fairGuranteeTotalAmount = value;
    }

    /**
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFareBasis(JAXBElement<String> value) {
        this.fareBasis = value;
    }

    /**
     * Gets the value of the fareType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFareType() {
        return fareType;
    }

    /**
     * Sets the value of the fareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFareType(JAXBElement<String> value) {
        this.fareType = value;
    }

    /**
     * Gets the value of the flightReservationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightReservationID() {
        return flightReservationID;
    }

    /**
     * Sets the value of the flightReservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightReservationID(Integer value) {
        this.flightReservationID = value;
    }

    /**
     * Gets the value of the iataCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIATACode() {
        return iataCode;
    }

    /**
     * Sets the value of the iataCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIATACode(JAXBElement<String> value) {
        this.iataCode = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIPAddress(JAXBElement<String> value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the ipCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIPCountry() {
        return ipCountry;
    }

    /**
     * Sets the value of the ipCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIPCountry(JAXBElement<String> value) {
        this.ipCountry = value;
    }

    /**
     * Gets the value of the incAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncAmount() {
        return incAmount;
    }

    /**
     * Sets the value of the incAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIncAmount(BigDecimal value) {
        this.incAmount = value;
    }

    /**
     * Gets the value of the incCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIncCode() {
        return incCode;
    }

    /**
     * Sets the value of the incCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIncCode(JAXBElement<String> value) {
        this.incCode = value;
    }

    /**
     * Gets the value of the internalReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInternalReferenceNo() {
        return internalReferenceNo;
    }

    /**
     * Sets the value of the internalReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInternalReferenceNo(JAXBElement<String> value) {
        this.internalReferenceNo = value;
    }

    /**
     * Gets the value of the markupApplied property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarkupApplied() {
        return markupApplied;
    }

    /**
     * Sets the value of the markupApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarkupApplied(JAXBElement<String> value) {
        this.markupApplied = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotes(JAXBElement<String> value) {
        this.notes = value;
    }

    /**
     * Gets the value of the officeID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfficeID() {
        return officeID;
    }

    /**
     * Sets the value of the officeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfficeID(JAXBElement<String> value) {
        this.officeID = value;
    }

    /**
     * Gets the value of the pnrCancelledOn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPNRCancelledOn() {
        return pnrCancelledOn;
    }

    /**
     * Sets the value of the pnrCancelledOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPNRCancelledOn(Integer value) {
        this.pnrCancelledOn = value;
    }

    /**
     * Gets the value of the pnrCancelledStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPNRCancelledStatus() {
        return pnrCancelledStatus;
    }

    /**
     * Sets the value of the pnrCancelledStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPNRCancelledStatus(Integer value) {
        this.pnrCancelledStatus = value;
    }

    /**
     * Gets the value of the pnrCreationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPNRCreationDateTime() {
        return pnrCreationDateTime;
    }

    /**
     * Sets the value of the pnrCreationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPNRCreationDateTime(XMLGregorianCalendar value) {
        this.pnrCreationDateTime = value;
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
     * Gets the value of the promoAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromoAmt() {
        return promoAmt;
    }

    /**
     * Sets the value of the promoAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromoAmt(BigDecimal value) {
        this.promoAmt = value;
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
     * Gets the value of the sabreAgentCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSabreAgentCode() {
        return sabreAgentCode;
    }

    /**
     * Sets the value of the sabreAgentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSabreAgentCode(JAXBElement<String> value) {
        this.sabreAgentCode = value;
    }

    /**
     * Gets the value of the serviceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceUrl() {
        return serviceUrl;
    }

    /**
     * Sets the value of the serviceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceUrl(JAXBElement<String> value) {
        this.serviceUrl = value;
    }

    /**
     * Gets the value of the sourceSite property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceSite() {
        return sourceSite;
    }

    /**
     * Sets the value of the sourceSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceSite(JAXBElement<String> value) {
        this.sourceSite = value;
    }

    /**
     * Gets the value of the stationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStationCode() {
        return stationCode;
    }

    /**
     * Sets the value of the stationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStationCode(JAXBElement<String> value) {
        this.stationCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
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
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the ticketedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTicketedBy() {
        return ticketedBy;
    }

    /**
     * Sets the value of the ticketedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTicketedBy(Integer value) {
        this.ticketedBy = value;
    }

    /**
     * Gets the value of the ticketingDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketingDeadline() {
        return ticketingDeadline;
    }

    /**
     * Sets the value of the ticketingDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTicketingDeadline(XMLGregorianCalendar value) {
        this.ticketingDeadline = value;
    }

    /**
     * Gets the value of the totalMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalMarkup() {
        return totalMarkup;
    }

    /**
     * Sets the value of the totalMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalMarkup(BigDecimal value) {
        this.totalMarkup = value;
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

    /**
     * Gets the value of the vatTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATTax() {
        return vatTax;
    }

    /**
     * Sets the value of the vatTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVATTax(BigDecimal value) {
        this.vatTax = value;
    }

    /**
     * Gets the value of the whTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWHTax() {
        return whTax;
    }

    /**
     * Sets the value of the whTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWHTax(BigDecimal value) {
        this.whTax = value;
    }

    /**
     * Gets the value of the journeyType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJourneyType() {
        return journeyType;
    }

    /**
     * Sets the value of the journeyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJourneyType(Integer value) {
        this.journeyType = value;
    }

}
