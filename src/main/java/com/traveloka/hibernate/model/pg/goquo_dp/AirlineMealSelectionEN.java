
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
 * <p>Java class for AirlineMealSelectionEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineMealSelectionEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirCraft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ApplicablePaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicableToClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseFare" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BusinessPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CommercialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DisMealsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMDAdded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EMDIssued" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EMDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EconomyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FGCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FGMealPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FlightReservationSegmentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ImagePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDefaultSelectionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDynamicFareClient" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsHiddenMeal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MealDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MealID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MealName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MealSelectionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PassengerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PromoPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PurchaseID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReqFGCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SectorFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SectorTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelPaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellingCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Taxes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TravelDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TravelDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineMealSelectionEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "airCraft",
    "airlineCode",
    "amount",
    "applicablePaxType",
    "applicableToClass",
    "baseFare",
    "businessPrice",
    "commercialName",
    "currencyCode",
    "customerUserID",
    "direction",
    "disMealsName",
    "emdAdded",
    "emdIssued",
    "emdNumber",
    "economyPrice",
    "fgCode",
    "fgMealPrice",
    "flightReservationSegmentID",
    "imagePath",
    "isDefaultSelectionEnabled",
    "isDynamicFareClient",
    "isHiddenMeal",
    "mealCode",
    "mealDesc",
    "mealID",
    "mealName",
    "mealSelectionID",
    "passengerID",
    "promoPrice",
    "purchaseID",
    "quantity",
    "region",
    "reqFGCode",
    "reservationID",
    "sectorFrom",
    "sectorTo",
    "selPaxID",
    "sellingCurrency",
    "status",
    "taxes",
    "ticketStatus",
    "travelDateFrom",
    "travelDateTo"
})
public class AirlineMealSelectionEN {

    @XmlElementRef(name = "AirCraft", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airCraft;
    @XmlElementRef(name = "AirlineCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airlineCode;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElementRef(name = "ApplicablePaxType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicablePaxType;
    @XmlElementRef(name = "ApplicableToClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicableToClass;
    @XmlElement(name = "BaseFare")
    protected BigDecimal baseFare;
    @XmlElement(name = "BusinessPrice")
    protected BigDecimal businessPrice;
    @XmlElementRef(name = "CommercialName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commercialName;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElement(name = "CustomerUserID")
    protected Integer customerUserID;
    @XmlElement(name = "Direction")
    protected Integer direction;
    @XmlElementRef(name = "DisMealsName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> disMealsName;
    @XmlElement(name = "EMDAdded")
    protected Boolean emdAdded;
    @XmlElement(name = "EMDIssued")
    protected Boolean emdIssued;
    @XmlElementRef(name = "EMDNumber", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emdNumber;
    @XmlElement(name = "EconomyPrice")
    protected BigDecimal economyPrice;
    @XmlElementRef(name = "FGCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fgCode;
    @XmlElement(name = "FGMealPrice")
    protected BigDecimal fgMealPrice;
    @XmlElement(name = "FlightReservationSegmentID")
    protected Integer flightReservationSegmentID;
    @XmlElementRef(name = "ImagePath", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imagePath;
    @XmlElement(name = "IsDefaultSelectionEnabled")
    protected Boolean isDefaultSelectionEnabled;
    @XmlElement(name = "IsDynamicFareClient")
    protected Boolean isDynamicFareClient;
    @XmlElement(name = "IsHiddenMeal")
    protected Boolean isHiddenMeal;
    @XmlElementRef(name = "MealCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mealCode;
    @XmlElementRef(name = "MealDesc", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mealDesc;
    @XmlElement(name = "MealID")
    protected Integer mealID;
    @XmlElementRef(name = "MealName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mealName;
    @XmlElement(name = "MealSelectionID")
    protected Integer mealSelectionID;
    @XmlElement(name = "PassengerID")
    protected Integer passengerID;
    @XmlElement(name = "PromoPrice")
    protected BigDecimal promoPrice;
    @XmlElement(name = "PurchaseID")
    protected Integer purchaseID;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElementRef(name = "Region", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> region;
    @XmlElementRef(name = "ReqFGCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reqFGCode;
    @XmlElementRef(name = "ReservationID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reservationID;
    @XmlElementRef(name = "SectorFrom", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sectorFrom;
    @XmlElementRef(name = "SectorTo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sectorTo;
    @XmlElementRef(name = "SelPaxID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> selPaxID;
    @XmlElementRef(name = "SellingCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sellingCurrency;
    @XmlElementRef(name = "Status", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "Taxes", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxes;
    @XmlElement(name = "TicketStatus")
    protected Integer ticketStatus;
    @XmlElement(name = "TravelDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar travelDateFrom;
    @XmlElement(name = "TravelDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar travelDateTo;

    /**
     * Gets the value of the airCraft property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirCraft() {
        return airCraft;
    }

    /**
     * Sets the value of the airCraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirCraft(JAXBElement<String> value) {
        this.airCraft = value;
    }

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
     * Gets the value of the applicablePaxType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicablePaxType() {
        return applicablePaxType;
    }

    /**
     * Sets the value of the applicablePaxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicablePaxType(JAXBElement<String> value) {
        this.applicablePaxType = value;
    }

    /**
     * Gets the value of the applicableToClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicableToClass() {
        return applicableToClass;
    }

    /**
     * Sets the value of the applicableToClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicableToClass(JAXBElement<String> value) {
        this.applicableToClass = value;
    }

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseFare(BigDecimal value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the businessPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBusinessPrice() {
        return businessPrice;
    }

    /**
     * Sets the value of the businessPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBusinessPrice(BigDecimal value) {
        this.businessPrice = value;
    }

    /**
     * Gets the value of the commercialName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommercialName() {
        return commercialName;
    }

    /**
     * Sets the value of the commercialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommercialName(JAXBElement<String> value) {
        this.commercialName = value;
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
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirection(Integer value) {
        this.direction = value;
    }

    /**
     * Gets the value of the disMealsName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisMealsName() {
        return disMealsName;
    }

    /**
     * Sets the value of the disMealsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisMealsName(JAXBElement<String> value) {
        this.disMealsName = value;
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
     * Gets the value of the economyPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEconomyPrice() {
        return economyPrice;
    }

    /**
     * Sets the value of the economyPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEconomyPrice(BigDecimal value) {
        this.economyPrice = value;
    }

    /**
     * Gets the value of the fgCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFGCode() {
        return fgCode;
    }

    /**
     * Sets the value of the fgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFGCode(JAXBElement<String> value) {
        this.fgCode = value;
    }

    /**
     * Gets the value of the fgMealPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFGMealPrice() {
        return fgMealPrice;
    }

    /**
     * Sets the value of the fgMealPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFGMealPrice(BigDecimal value) {
        this.fgMealPrice = value;
    }

    /**
     * Gets the value of the flightReservationSegmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightReservationSegmentID() {
        return flightReservationSegmentID;
    }

    /**
     * Sets the value of the flightReservationSegmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightReservationSegmentID(Integer value) {
        this.flightReservationSegmentID = value;
    }

    /**
     * Gets the value of the imagePath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImagePath() {
        return imagePath;
    }

    /**
     * Sets the value of the imagePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImagePath(JAXBElement<String> value) {
        this.imagePath = value;
    }

    /**
     * Gets the value of the isDefaultSelectionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefaultSelectionEnabled() {
        return isDefaultSelectionEnabled;
    }

    /**
     * Sets the value of the isDefaultSelectionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefaultSelectionEnabled(Boolean value) {
        this.isDefaultSelectionEnabled = value;
    }

    /**
     * Gets the value of the isDynamicFareClient property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDynamicFareClient() {
        return isDynamicFareClient;
    }

    /**
     * Sets the value of the isDynamicFareClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDynamicFareClient(Boolean value) {
        this.isDynamicFareClient = value;
    }

    /**
     * Gets the value of the isHiddenMeal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHiddenMeal() {
        return isHiddenMeal;
    }

    /**
     * Sets the value of the isHiddenMeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHiddenMeal(Boolean value) {
        this.isHiddenMeal = value;
    }

    /**
     * Gets the value of the mealCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMealCode() {
        return mealCode;
    }

    /**
     * Sets the value of the mealCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMealCode(JAXBElement<String> value) {
        this.mealCode = value;
    }

    /**
     * Gets the value of the mealDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMealDesc() {
        return mealDesc;
    }

    /**
     * Sets the value of the mealDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMealDesc(JAXBElement<String> value) {
        this.mealDesc = value;
    }

    /**
     * Gets the value of the mealID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMealID() {
        return mealID;
    }

    /**
     * Sets the value of the mealID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMealID(Integer value) {
        this.mealID = value;
    }

    /**
     * Gets the value of the mealName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMealName() {
        return mealName;
    }

    /**
     * Sets the value of the mealName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMealName(JAXBElement<String> value) {
        this.mealName = value;
    }

    /**
     * Gets the value of the mealSelectionID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMealSelectionID() {
        return mealSelectionID;
    }

    /**
     * Sets the value of the mealSelectionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMealSelectionID(Integer value) {
        this.mealSelectionID = value;
    }

    /**
     * Gets the value of the passengerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassengerID() {
        return passengerID;
    }

    /**
     * Sets the value of the passengerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassengerID(Integer value) {
        this.passengerID = value;
    }

    /**
     * Gets the value of the promoPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromoPrice() {
        return promoPrice;
    }

    /**
     * Sets the value of the promoPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromoPrice(BigDecimal value) {
        this.promoPrice = value;
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
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegion(JAXBElement<String> value) {
        this.region = value;
    }

    /**
     * Gets the value of the reqFGCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReqFGCode() {
        return reqFGCode;
    }

    /**
     * Sets the value of the reqFGCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReqFGCode(JAXBElement<String> value) {
        this.reqFGCode = value;
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
     * Gets the value of the sectorFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSectorFrom() {
        return sectorFrom;
    }

    /**
     * Sets the value of the sectorFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSectorFrom(JAXBElement<String> value) {
        this.sectorFrom = value;
    }

    /**
     * Gets the value of the sectorTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSectorTo() {
        return sectorTo;
    }

    /**
     * Sets the value of the sectorTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSectorTo(JAXBElement<String> value) {
        this.sectorTo = value;
    }

    /**
     * Gets the value of the selPaxID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelPaxID() {
        return selPaxID;
    }

    /**
     * Sets the value of the selPaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelPaxID(JAXBElement<String> value) {
        this.selPaxID = value;
    }

    /**
     * Gets the value of the sellingCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSellingCurrency() {
        return sellingCurrency;
    }

    /**
     * Sets the value of the sellingCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSellingCurrency(JAXBElement<String> value) {
        this.sellingCurrency = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxes(JAXBElement<String> value) {
        this.taxes = value;
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

    /**
     * Gets the value of the travelDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelDateFrom() {
        return travelDateFrom;
    }

    /**
     * Sets the value of the travelDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelDateFrom(XMLGregorianCalendar value) {
        this.travelDateFrom = value;
    }

    /**
     * Gets the value of the travelDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelDateTo() {
        return travelDateTo;
    }

    /**
     * Sets the value of the travelDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelDateTo(XMLGregorianCalendar value) {
        this.travelDateTo = value;
    }

}
