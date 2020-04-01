
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirlineMLAvail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineMLAvail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdultPriceInformation" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}AirlineMLPaxPrice" minOccurs="0"/>
 *         &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AppliedPromotionInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PromotionInfo" minOccurs="0"/>
 *         &lt;element name="AvailIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AvailMLFlights" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfFlights" minOccurs="0"/>
 *         &lt;element name="BookingError" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}FlightError" minOccurs="0"/>
 *         &lt;element name="ChildPriceInformation" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}AirlineMLPaxPrice" minOccurs="0"/>
 *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InfantPriceInformation" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}AirlineMLPaxPrice" minOccurs="0"/>
 *         &lt;element name="Infants" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsPromoFare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPromotionApplied" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowPromotionFare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowPromotionInResults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsStrikeoutApplied" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PUnitID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PriceInformation" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}AirlineMLPrice" minOccurs="0"/>
 *         &lt;element name="PromotionStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SpecialPaxPrice" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfAirlineMLPaxPrice" minOccurs="0"/>
 *         &lt;element name="dispFlightAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineMLAvail", propOrder = {
    "adultPriceInformation",
    "adults",
    "appliedPromotionInfo",
    "availIndex",
    "availMLFlights",
    "bookingError",
    "childPriceInformation",
    "children",
    "currency",
    "flightAmount",
    "infantPriceInformation",
    "infants",
    "isPromoFare",
    "isPromotionApplied",
    "isSelected",
    "isShowPromotionFare",
    "isShowPromotionInResults",
    "isStrikeoutApplied",
    "pUnitID",
    "priceInformation",
    "promotionStatus",
    "specialPaxPrice",
    "dispFlightAmount"
})
public class AirlineMLAvail {

    @XmlElementRef(name = "AdultPriceInformation", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<AirlineMLPaxPrice> adultPriceInformation;
    @XmlElement(name = "Adults")
    protected Integer adults;
    @XmlElementRef(name = "AppliedPromotionInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<PromotionInfo> appliedPromotionInfo;
    @XmlElement(name = "AvailIndex")
    protected Integer availIndex;
    @XmlElementRef(name = "AvailMLFlights", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFlights> availMLFlights;
    @XmlElementRef(name = "BookingError", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightError> bookingError;
    @XmlElementRef(name = "ChildPriceInformation", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<AirlineMLPaxPrice> childPriceInformation;
    @XmlElement(name = "Children")
    protected Integer children;
    @XmlElementRef(name = "Currency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency;
    @XmlElement(name = "FlightAmount")
    protected BigDecimal flightAmount;
    @XmlElementRef(name = "InfantPriceInformation", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<AirlineMLPaxPrice> infantPriceInformation;
    @XmlElement(name = "Infants")
    protected Integer infants;
    @XmlElement(name = "IsPromoFare")
    protected Boolean isPromoFare;
    @XmlElement(name = "IsPromotionApplied")
    protected Boolean isPromotionApplied;
    @XmlElement(name = "IsSelected")
    protected Boolean isSelected;
    @XmlElement(name = "IsShowPromotionFare")
    protected Boolean isShowPromotionFare;
    @XmlElement(name = "IsShowPromotionInResults")
    protected Boolean isShowPromotionInResults;
    @XmlElement(name = "IsStrikeoutApplied")
    protected Boolean isStrikeoutApplied;
    @XmlElement(name = "PUnitID")
    protected Integer pUnitID;
    @XmlElementRef(name = "PriceInformation", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<AirlineMLPrice> priceInformation;
    @XmlElement(name = "PromotionStatus")
    protected Integer promotionStatus;
    @XmlElementRef(name = "SpecialPaxPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAirlineMLPaxPrice> specialPaxPrice;
    @XmlElementRef(name = "dispFlightAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispFlightAmount;

    /**
     * Gets the value of the adultPriceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirlineMLPaxPrice }{@code >}
     *     
     */
    public JAXBElement<AirlineMLPaxPrice> getAdultPriceInformation() {
        return adultPriceInformation;
    }

    /**
     * Sets the value of the adultPriceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirlineMLPaxPrice }{@code >}
     *     
     */
    public void setAdultPriceInformation(JAXBElement<AirlineMLPaxPrice> value) {
        this.adultPriceInformation = value;
    }

    /**
     * Gets the value of the adults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdults() {
        return adults;
    }

    /**
     * Sets the value of the adults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdults(Integer value) {
        this.adults = value;
    }

    /**
     * Gets the value of the appliedPromotionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PromotionInfo }{@code >}
     *     
     */
    public JAXBElement<PromotionInfo> getAppliedPromotionInfo() {
        return appliedPromotionInfo;
    }

    /**
     * Sets the value of the appliedPromotionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PromotionInfo }{@code >}
     *     
     */
    public void setAppliedPromotionInfo(JAXBElement<PromotionInfo> value) {
        this.appliedPromotionInfo = value;
    }

    /**
     * Gets the value of the availIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailIndex() {
        return availIndex;
    }

    /**
     * Sets the value of the availIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailIndex(Integer value) {
        this.availIndex = value;
    }

    /**
     * Gets the value of the availMLFlights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlights }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFlights> getAvailMLFlights() {
        return availMLFlights;
    }

    /**
     * Sets the value of the availMLFlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlights }{@code >}
     *     
     */
    public void setAvailMLFlights(JAXBElement<ArrayOfFlights> value) {
        this.availMLFlights = value;
    }

    /**
     * Gets the value of the bookingError property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightError }{@code >}
     *     
     */
    public JAXBElement<FlightError> getBookingError() {
        return bookingError;
    }

    /**
     * Sets the value of the bookingError property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightError }{@code >}
     *     
     */
    public void setBookingError(JAXBElement<FlightError> value) {
        this.bookingError = value;
    }

    /**
     * Gets the value of the childPriceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirlineMLPaxPrice }{@code >}
     *     
     */
    public JAXBElement<AirlineMLPaxPrice> getChildPriceInformation() {
        return childPriceInformation;
    }

    /**
     * Sets the value of the childPriceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirlineMLPaxPrice }{@code >}
     *     
     */
    public void setChildPriceInformation(JAXBElement<AirlineMLPaxPrice> value) {
        this.childPriceInformation = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildren(Integer value) {
        this.children = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrency(JAXBElement<String> value) {
        this.currency = value;
    }

    /**
     * Gets the value of the flightAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlightAmount() {
        return flightAmount;
    }

    /**
     * Sets the value of the flightAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlightAmount(BigDecimal value) {
        this.flightAmount = value;
    }

    /**
     * Gets the value of the infantPriceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirlineMLPaxPrice }{@code >}
     *     
     */
    public JAXBElement<AirlineMLPaxPrice> getInfantPriceInformation() {
        return infantPriceInformation;
    }

    /**
     * Sets the value of the infantPriceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirlineMLPaxPrice }{@code >}
     *     
     */
    public void setInfantPriceInformation(JAXBElement<AirlineMLPaxPrice> value) {
        this.infantPriceInformation = value;
    }

    /**
     * Gets the value of the infants property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInfants() {
        return infants;
    }

    /**
     * Sets the value of the infants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInfants(Integer value) {
        this.infants = value;
    }

    /**
     * Gets the value of the isPromoFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPromoFare() {
        return isPromoFare;
    }

    /**
     * Sets the value of the isPromoFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPromoFare(Boolean value) {
        this.isPromoFare = value;
    }

    /**
     * Gets the value of the isPromotionApplied property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPromotionApplied() {
        return isPromotionApplied;
    }

    /**
     * Sets the value of the isPromotionApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPromotionApplied(Boolean value) {
        this.isPromotionApplied = value;
    }

    /**
     * Gets the value of the isSelected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSelected() {
        return isSelected;
    }

    /**
     * Sets the value of the isSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSelected(Boolean value) {
        this.isSelected = value;
    }

    /**
     * Gets the value of the isShowPromotionFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowPromotionFare() {
        return isShowPromotionFare;
    }

    /**
     * Sets the value of the isShowPromotionFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowPromotionFare(Boolean value) {
        this.isShowPromotionFare = value;
    }

    /**
     * Gets the value of the isShowPromotionInResults property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowPromotionInResults() {
        return isShowPromotionInResults;
    }

    /**
     * Sets the value of the isShowPromotionInResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowPromotionInResults(Boolean value) {
        this.isShowPromotionInResults = value;
    }

    /**
     * Gets the value of the isStrikeoutApplied property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStrikeoutApplied() {
        return isStrikeoutApplied;
    }

    /**
     * Sets the value of the isStrikeoutApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStrikeoutApplied(Boolean value) {
        this.isStrikeoutApplied = value;
    }

    /**
     * Gets the value of the pUnitID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPUnitID() {
        return pUnitID;
    }

    /**
     * Sets the value of the pUnitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPUnitID(Integer value) {
        this.pUnitID = value;
    }

    /**
     * Gets the value of the priceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirlineMLPrice }{@code >}
     *     
     */
    public JAXBElement<AirlineMLPrice> getPriceInformation() {
        return priceInformation;
    }

    /**
     * Sets the value of the priceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirlineMLPrice }{@code >}
     *     
     */
    public void setPriceInformation(JAXBElement<AirlineMLPrice> value) {
        this.priceInformation = value;
    }

    /**
     * Gets the value of the promotionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPromotionStatus() {
        return promotionStatus;
    }

    /**
     * Sets the value of the promotionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPromotionStatus(Integer value) {
        this.promotionStatus = value;
    }

    /**
     * Gets the value of the specialPaxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAirlineMLPaxPrice }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAirlineMLPaxPrice> getSpecialPaxPrice() {
        return specialPaxPrice;
    }

    /**
     * Sets the value of the specialPaxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAirlineMLPaxPrice }{@code >}
     *     
     */
    public void setSpecialPaxPrice(JAXBElement<ArrayOfAirlineMLPaxPrice> value) {
        this.specialPaxPrice = value;
    }

    /**
     * Gets the value of the dispFlightAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispFlightAmount() {
        return dispFlightAmount;
    }

    /**
     * Sets the value of the dispFlightAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispFlightAmount(JAXBElement<String> value) {
        this.dispFlightAmount = value;
    }

}
