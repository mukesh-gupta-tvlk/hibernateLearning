
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}FlightReservationInfo" minOccurs="0"/>
 *         &lt;element name="InsuranceReservationInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfInsuranceReservationInfo" minOccurs="0"/>
 *         &lt;element name="InvalidAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReservationInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ReservationsEN" minOccurs="0"/>
 *         &lt;element name="baggageReservations" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfBaggageReservationEN" minOccurs="0"/>
 *         &lt;element name="loungeReservations" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfLoungeReservationEN" minOccurs="0"/>
 *         &lt;element name="mealReservations" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfAirlineMealSelectionEN" minOccurs="0"/>
 *         &lt;element name="passengerDetails" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}PassengerDetailsEN" minOccurs="0"/>
 *         &lt;element name="passengers" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfPassengersEN" minOccurs="0"/>
 *         &lt;element name="seatReservations" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfSeatReservationEN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationDetails", propOrder = {
    "errorDetails",
    "flightInfo",
    "insuranceReservationInfo",
    "invalidAccount",
    "reservationInfo",
    "baggageReservations",
    "loungeReservations",
    "mealReservations",
    "passengerDetails",
    "passengers",
    "seatReservations"
})
public class ReservationDetails {

    @XmlElementRef(name = "ErrorDetails", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorDetails;
    @XmlElementRef(name = "FlightInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightReservationInfo> flightInfo;
    @XmlElementRef(name = "InsuranceReservationInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInsuranceReservationInfo> insuranceReservationInfo;
    @XmlElement(name = "InvalidAccount")
    protected Boolean invalidAccount;
    @XmlElementRef(name = "ReservationInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ReservationsEN> reservationInfo;
    @XmlElementRef(name = "baggageReservations", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBaggageReservationEN> baggageReservations;
    @XmlElementRef(name = "loungeReservations", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLoungeReservationEN> loungeReservations;
    @XmlElementRef(name = "mealReservations", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAirlineMealSelectionEN> mealReservations;
    @XmlElementRef(name = "passengerDetails", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<PassengerDetailsEN> passengerDetails;
    @XmlElementRef(name = "passengers", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPassengersEN> passengers;
    @XmlElementRef(name = "seatReservations", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSeatReservationEN> seatReservations;

    /**
     * Gets the value of the errorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets the value of the errorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorDetails(JAXBElement<String> value) {
        this.errorDetails = value;
    }

    /**
     * Gets the value of the flightInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightReservationInfo }{@code >}
     *     
     */
    public JAXBElement<FlightReservationInfo> getFlightInfo() {
        return flightInfo;
    }

    /**
     * Sets the value of the flightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightReservationInfo }{@code >}
     *     
     */
    public void setFlightInfo(JAXBElement<FlightReservationInfo> value) {
        this.flightInfo = value;
    }

    /**
     * Gets the value of the insuranceReservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInsuranceReservationInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInsuranceReservationInfo> getInsuranceReservationInfo() {
        return insuranceReservationInfo;
    }

    /**
     * Sets the value of the insuranceReservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInsuranceReservationInfo }{@code >}
     *     
     */
    public void setInsuranceReservationInfo(JAXBElement<ArrayOfInsuranceReservationInfo> value) {
        this.insuranceReservationInfo = value;
    }

    /**
     * Gets the value of the invalidAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvalidAccount() {
        return invalidAccount;
    }

    /**
     * Sets the value of the invalidAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvalidAccount(Boolean value) {
        this.invalidAccount = value;
    }

    /**
     * Gets the value of the reservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReservationsEN }{@code >}
     *     
     */
    public JAXBElement<ReservationsEN> getReservationInfo() {
        return reservationInfo;
    }

    /**
     * Sets the value of the reservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReservationsEN }{@code >}
     *     
     */
    public void setReservationInfo(JAXBElement<ReservationsEN> value) {
        this.reservationInfo = value;
    }

    /**
     * Gets the value of the baggageReservations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBaggageReservationEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBaggageReservationEN> getBaggageReservations() {
        return baggageReservations;
    }

    /**
     * Sets the value of the baggageReservations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBaggageReservationEN }{@code >}
     *     
     */
    public void setBaggageReservations(JAXBElement<ArrayOfBaggageReservationEN> value) {
        this.baggageReservations = value;
    }

    /**
     * Gets the value of the loungeReservations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLoungeReservationEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLoungeReservationEN> getLoungeReservations() {
        return loungeReservations;
    }

    /**
     * Sets the value of the loungeReservations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLoungeReservationEN }{@code >}
     *     
     */
    public void setLoungeReservations(JAXBElement<ArrayOfLoungeReservationEN> value) {
        this.loungeReservations = value;
    }

    /**
     * Gets the value of the mealReservations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAirlineMealSelectionEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAirlineMealSelectionEN> getMealReservations() {
        return mealReservations;
    }

    /**
     * Sets the value of the mealReservations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAirlineMealSelectionEN }{@code >}
     *     
     */
    public void setMealReservations(JAXBElement<ArrayOfAirlineMealSelectionEN> value) {
        this.mealReservations = value;
    }

    /**
     * Gets the value of the passengerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PassengerDetailsEN }{@code >}
     *     
     */
    public JAXBElement<PassengerDetailsEN> getPassengerDetails() {
        return passengerDetails;
    }

    /**
     * Sets the value of the passengerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PassengerDetailsEN }{@code >}
     *     
     */
    public void setPassengerDetails(JAXBElement<PassengerDetailsEN> value) {
        this.passengerDetails = value;
    }

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPassengersEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPassengersEN> getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPassengersEN }{@code >}
     *     
     */
    public void setPassengers(JAXBElement<ArrayOfPassengersEN> value) {
        this.passengers = value;
    }

    /**
     * Gets the value of the seatReservations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSeatReservationEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSeatReservationEN> getSeatReservations() {
        return seatReservations;
    }

    /**
     * Sets the value of the seatReservations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSeatReservationEN }{@code >}
     *     
     */
    public void setSeatReservations(JAXBElement<ArrayOfSeatReservationEN> value) {
        this.seatReservations = value;
    }

}
