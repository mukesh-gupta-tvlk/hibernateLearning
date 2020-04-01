
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
 * <p>Java class for PriceStrikeoutSettingsEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceStrikeoutSettingsEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirlineCodeMatchingSegments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ApplicableCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplyToAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplyToPassenger" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BookingChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingClassMatchingSegments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BookingDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BookingDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CalculateToAdult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CalculateToChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CalculateToInfant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerUserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DepartureDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DepartureDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DepartureDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExcludeRoutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareBasisCodeMatchingSegments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FlightNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightNoMatchingSegments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsAllAirlineCodes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAllBookingClass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAllFareBasisCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAllFlightNumbers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPercentage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="JourneyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxAdultCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxChildCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxInfantCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxStay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinimumAdultCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinimumChildCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinimumInfantCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PriceStrikeoutSettingsId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PromotionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="ReturnDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReturnDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReturnDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Routes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoutesRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceStrikeoutSettingsEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "airlineCode",
    "airlineCodeMatchingSegments",
    "amount",
    "applicableCurrency",
    "applyToAmount",
    "applyToPassenger",
    "bookingChannel",
    "bookingClass",
    "bookingClassMatchingSegments",
    "bookingDateFrom",
    "bookingDateTo",
    "calculateToAdult",
    "calculateToChild",
    "calculateToInfant",
    "currencyCode",
    "customerUserId",
    "departureDateFrom",
    "departureDateTo",
    "departureDays",
    "excludeRoutes",
    "fareBasisCode",
    "fareBasisCodeMatchingSegments",
    "flightNo",
    "flightNoMatchingSegments",
    "isAllAirlineCodes",
    "isAllBookingClass",
    "isAllFareBasisCode",
    "isAllFlightNumbers",
    "isDiscount",
    "isPercentage",
    "journeyType",
    "maxAdultCount",
    "maxChildCount",
    "maxInfantCount",
    "maxStay",
    "minimumAdultCount",
    "minimumChildCount",
    "minimumInfantCount",
    "priceStrikeoutSettingsId",
    "promotionName",
    "resultMsg",
    "returnDateFrom",
    "returnDateTo",
    "returnDays",
    "routes",
    "routesRegion",
    "status"
})
public class PriceStrikeoutSettingsEN {

    @XmlElementRef(name = "AirlineCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airlineCode;
    @XmlElement(name = "AirlineCodeMatchingSegments")
    protected Integer airlineCodeMatchingSegments;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElementRef(name = "ApplicableCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicableCurrency;
    @XmlElementRef(name = "ApplyToAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applyToAmount;
    @XmlElement(name = "ApplyToPassenger")
    protected Integer applyToPassenger;
    @XmlElementRef(name = "BookingChannel", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingChannel;
    @XmlElementRef(name = "BookingClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingClass;
    @XmlElement(name = "BookingClassMatchingSegments")
    protected Integer bookingClassMatchingSegments;
    @XmlElement(name = "BookingDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bookingDateFrom;
    @XmlElement(name = "BookingDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bookingDateTo;
    @XmlElement(name = "CalculateToAdult")
    protected Boolean calculateToAdult;
    @XmlElement(name = "CalculateToChild")
    protected Boolean calculateToChild;
    @XmlElement(name = "CalculateToInfant")
    protected Boolean calculateToInfant;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElement(name = "CustomerUserId")
    protected Integer customerUserId;
    @XmlElement(name = "DepartureDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateFrom;
    @XmlElement(name = "DepartureDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateTo;
    @XmlElementRef(name = "DepartureDays", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departureDays;
    @XmlElementRef(name = "ExcludeRoutes", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> excludeRoutes;
    @XmlElementRef(name = "FareBasisCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareBasisCode;
    @XmlElement(name = "FareBasisCodeMatchingSegments")
    protected Integer fareBasisCodeMatchingSegments;
    @XmlElementRef(name = "FlightNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightNo;
    @XmlElement(name = "FlightNoMatchingSegments")
    protected Integer flightNoMatchingSegments;
    @XmlElement(name = "IsAllAirlineCodes")
    protected Boolean isAllAirlineCodes;
    @XmlElement(name = "IsAllBookingClass")
    protected Boolean isAllBookingClass;
    @XmlElement(name = "IsAllFareBasisCode")
    protected Boolean isAllFareBasisCode;
    @XmlElement(name = "IsAllFlightNumbers")
    protected Boolean isAllFlightNumbers;
    @XmlElement(name = "IsDiscount")
    protected Boolean isDiscount;
    @XmlElement(name = "IsPercentage")
    protected Boolean isPercentage;
    @XmlElementRef(name = "JourneyType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> journeyType;
    @XmlElement(name = "MaxAdultCount")
    protected Integer maxAdultCount;
    @XmlElement(name = "MaxChildCount")
    protected Integer maxChildCount;
    @XmlElement(name = "MaxInfantCount")
    protected Integer maxInfantCount;
    @XmlElement(name = "MaxStay")
    protected Integer maxStay;
    @XmlElement(name = "MinimumAdultCount")
    protected Integer minimumAdultCount;
    @XmlElement(name = "MinimumChildCount")
    protected Integer minimumChildCount;
    @XmlElement(name = "MinimumInfantCount")
    protected Integer minimumInfantCount;
    @XmlElement(name = "PriceStrikeoutSettingsId")
    protected Long priceStrikeoutSettingsId;
    @XmlElementRef(name = "PromotionName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promotionName;
    @XmlElementRef(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> resultMsg;
    @XmlElement(name = "ReturnDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnDateFrom;
    @XmlElement(name = "ReturnDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnDateTo;
    @XmlElementRef(name = "ReturnDays", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnDays;
    @XmlElementRef(name = "Routes", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routes;
    @XmlElementRef(name = "RoutesRegion", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routesRegion;
    @XmlElement(name = "Status")
    protected Integer status;

    /**
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirlineCode(JAXBElement<String> value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the airlineCodeMatchingSegments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAirlineCodeMatchingSegments() {
        return airlineCodeMatchingSegments;
    }

    /**
     * Sets the value of the airlineCodeMatchingSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAirlineCodeMatchingSegments(Integer value) {
        this.airlineCodeMatchingSegments = value;
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
     * Gets the value of the applicableCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicableCurrency() {
        return applicableCurrency;
    }

    /**
     * Sets the value of the applicableCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicableCurrency(JAXBElement<String> value) {
        this.applicableCurrency = value;
    }

    /**
     * Gets the value of the applyToAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplyToAmount() {
        return applyToAmount;
    }

    /**
     * Sets the value of the applyToAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplyToAmount(JAXBElement<String> value) {
        this.applyToAmount = value;
    }

    /**
     * Gets the value of the applyToPassenger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplyToPassenger() {
        return applyToPassenger;
    }

    /**
     * Sets the value of the applyToPassenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplyToPassenger(Integer value) {
        this.applyToPassenger = value;
    }

    /**
     * Gets the value of the bookingChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookingChannel() {
        return bookingChannel;
    }

    /**
     * Sets the value of the bookingChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookingChannel(JAXBElement<String> value) {
        this.bookingChannel = value;
    }

    /**
     * Gets the value of the bookingClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookingClass() {
        return bookingClass;
    }

    /**
     * Sets the value of the bookingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookingClass(JAXBElement<String> value) {
        this.bookingClass = value;
    }

    /**
     * Gets the value of the bookingClassMatchingSegments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBookingClassMatchingSegments() {
        return bookingClassMatchingSegments;
    }

    /**
     * Sets the value of the bookingClassMatchingSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBookingClassMatchingSegments(Integer value) {
        this.bookingClassMatchingSegments = value;
    }

    /**
     * Gets the value of the bookingDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingDateFrom() {
        return bookingDateFrom;
    }

    /**
     * Sets the value of the bookingDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingDateFrom(XMLGregorianCalendar value) {
        this.bookingDateFrom = value;
    }

    /**
     * Gets the value of the bookingDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingDateTo() {
        return bookingDateTo;
    }

    /**
     * Sets the value of the bookingDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingDateTo(XMLGregorianCalendar value) {
        this.bookingDateTo = value;
    }

    /**
     * Gets the value of the calculateToAdult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateToAdult() {
        return calculateToAdult;
    }

    /**
     * Sets the value of the calculateToAdult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateToAdult(Boolean value) {
        this.calculateToAdult = value;
    }

    /**
     * Gets the value of the calculateToChild property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateToChild() {
        return calculateToChild;
    }

    /**
     * Sets the value of the calculateToChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateToChild(Boolean value) {
        this.calculateToChild = value;
    }

    /**
     * Gets the value of the calculateToInfant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateToInfant() {
        return calculateToInfant;
    }

    /**
     * Sets the value of the calculateToInfant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateToInfant(Boolean value) {
        this.calculateToInfant = value;
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
     * Gets the value of the customerUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerUserId() {
        return customerUserId;
    }

    /**
     * Sets the value of the customerUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerUserId(Integer value) {
        this.customerUserId = value;
    }

    /**
     * Gets the value of the departureDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDateFrom() {
        return departureDateFrom;
    }

    /**
     * Sets the value of the departureDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDateFrom(XMLGregorianCalendar value) {
        this.departureDateFrom = value;
    }

    /**
     * Gets the value of the departureDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDateTo() {
        return departureDateTo;
    }

    /**
     * Sets the value of the departureDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDateTo(XMLGregorianCalendar value) {
        this.departureDateTo = value;
    }

    /**
     * Gets the value of the departureDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartureDays() {
        return departureDays;
    }

    /**
     * Sets the value of the departureDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartureDays(JAXBElement<String> value) {
        this.departureDays = value;
    }

    /**
     * Gets the value of the excludeRoutes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExcludeRoutes() {
        return excludeRoutes;
    }

    /**
     * Sets the value of the excludeRoutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExcludeRoutes(JAXBElement<String> value) {
        this.excludeRoutes = value;
    }

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFareBasisCode(JAXBElement<String> value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the fareBasisCodeMatchingSegments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFareBasisCodeMatchingSegments() {
        return fareBasisCodeMatchingSegments;
    }

    /**
     * Sets the value of the fareBasisCodeMatchingSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFareBasisCodeMatchingSegments(Integer value) {
        this.fareBasisCodeMatchingSegments = value;
    }

    /**
     * Gets the value of the flightNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlightNo() {
        return flightNo;
    }

    /**
     * Sets the value of the flightNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlightNo(JAXBElement<String> value) {
        this.flightNo = value;
    }

    /**
     * Gets the value of the flightNoMatchingSegments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightNoMatchingSegments() {
        return flightNoMatchingSegments;
    }

    /**
     * Sets the value of the flightNoMatchingSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightNoMatchingSegments(Integer value) {
        this.flightNoMatchingSegments = value;
    }

    /**
     * Gets the value of the isAllAirlineCodes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllAirlineCodes() {
        return isAllAirlineCodes;
    }

    /**
     * Sets the value of the isAllAirlineCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllAirlineCodes(Boolean value) {
        this.isAllAirlineCodes = value;
    }

    /**
     * Gets the value of the isAllBookingClass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllBookingClass() {
        return isAllBookingClass;
    }

    /**
     * Sets the value of the isAllBookingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllBookingClass(Boolean value) {
        this.isAllBookingClass = value;
    }

    /**
     * Gets the value of the isAllFareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllFareBasisCode() {
        return isAllFareBasisCode;
    }

    /**
     * Sets the value of the isAllFareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllFareBasisCode(Boolean value) {
        this.isAllFareBasisCode = value;
    }

    /**
     * Gets the value of the isAllFlightNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllFlightNumbers() {
        return isAllFlightNumbers;
    }

    /**
     * Sets the value of the isAllFlightNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllFlightNumbers(Boolean value) {
        this.isAllFlightNumbers = value;
    }

    /**
     * Gets the value of the isDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDiscount() {
        return isDiscount;
    }

    /**
     * Sets the value of the isDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDiscount(Boolean value) {
        this.isDiscount = value;
    }

    /**
     * Gets the value of the isPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPercentage() {
        return isPercentage;
    }

    /**
     * Sets the value of the isPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPercentage(Boolean value) {
        this.isPercentage = value;
    }

    /**
     * Gets the value of the journeyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJourneyType() {
        return journeyType;
    }

    /**
     * Sets the value of the journeyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJourneyType(JAXBElement<String> value) {
        this.journeyType = value;
    }

    /**
     * Gets the value of the maxAdultCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAdultCount() {
        return maxAdultCount;
    }

    /**
     * Sets the value of the maxAdultCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAdultCount(Integer value) {
        this.maxAdultCount = value;
    }

    /**
     * Gets the value of the maxChildCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxChildCount() {
        return maxChildCount;
    }

    /**
     * Sets the value of the maxChildCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxChildCount(Integer value) {
        this.maxChildCount = value;
    }

    /**
     * Gets the value of the maxInfantCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxInfantCount() {
        return maxInfantCount;
    }

    /**
     * Sets the value of the maxInfantCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxInfantCount(Integer value) {
        this.maxInfantCount = value;
    }

    /**
     * Gets the value of the maxStay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxStay() {
        return maxStay;
    }

    /**
     * Sets the value of the maxStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxStay(Integer value) {
        this.maxStay = value;
    }

    /**
     * Gets the value of the minimumAdultCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumAdultCount() {
        return minimumAdultCount;
    }

    /**
     * Sets the value of the minimumAdultCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumAdultCount(Integer value) {
        this.minimumAdultCount = value;
    }

    /**
     * Gets the value of the minimumChildCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumChildCount() {
        return minimumChildCount;
    }

    /**
     * Sets the value of the minimumChildCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumChildCount(Integer value) {
        this.minimumChildCount = value;
    }

    /**
     * Gets the value of the minimumInfantCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumInfantCount() {
        return minimumInfantCount;
    }

    /**
     * Sets the value of the minimumInfantCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumInfantCount(Integer value) {
        this.minimumInfantCount = value;
    }

    /**
     * Gets the value of the priceStrikeoutSettingsId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriceStrikeoutSettingsId() {
        return priceStrikeoutSettingsId;
    }

    /**
     * Sets the value of the priceStrikeoutSettingsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriceStrikeoutSettingsId(Long value) {
        this.priceStrikeoutSettingsId = value;
    }

    /**
     * Gets the value of the promotionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromotionName() {
        return promotionName;
    }

    /**
     * Sets the value of the promotionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromotionName(JAXBElement<String> value) {
        this.promotionName = value;
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
     * Gets the value of the returnDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDateFrom() {
        return returnDateFrom;
    }

    /**
     * Sets the value of the returnDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDateFrom(XMLGregorianCalendar value) {
        this.returnDateFrom = value;
    }

    /**
     * Gets the value of the returnDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDateTo() {
        return returnDateTo;
    }

    /**
     * Sets the value of the returnDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDateTo(XMLGregorianCalendar value) {
        this.returnDateTo = value;
    }

    /**
     * Gets the value of the returnDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnDays() {
        return returnDays;
    }

    /**
     * Sets the value of the returnDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnDays(JAXBElement<String> value) {
        this.returnDays = value;
    }

    /**
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoutes(JAXBElement<String> value) {
        this.routes = value;
    }

    /**
     * Gets the value of the routesRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoutesRegion() {
        return routesRegion;
    }

    /**
     * Sets the value of the routesRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoutesRegion(JAXBElement<String> value) {
        this.routesRegion = value;
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

}
