
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_AddonAvailabilityRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_AddonAvailabilityRes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Baggages" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}API_BaggageAvailability" minOccurs="0"/>
 *         &lt;element name="ErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Insurance" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}API_InsuranceAvailability" minOccurs="0"/>
 *         &lt;element name="IsError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Lounge" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}API_LoungeAvailability" minOccurs="0"/>
 *         &lt;element name="Meals" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}API_MealAvailability" minOccurs="0"/>
 *         &lt;element name="Seats" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}API_SeatAvailability" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_AddonAvailabilityRes", propOrder = {
    "baggages",
    "errorMsg",
    "insurance",
    "isError",
    "lounge",
    "meals",
    "seats"
})
public class APIAddonAvailabilityRes {

    @XmlElementRef(name = "Baggages", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<APIBaggageAvailability> baggages;
    @XmlElementRef(name = "ErrorMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorMsg;
    @XmlElementRef(name = "Insurance", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<APIInsuranceAvailability> insurance;
    @XmlElement(name = "IsError")
    protected Boolean isError;
    @XmlElementRef(name = "Lounge", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<APILoungeAvailability> lounge;
    @XmlElementRef(name = "Meals", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<APIMealAvailability> meals;
    @XmlElementRef(name = "Seats", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<APISeatAvailability> seats;

    /**
     * Gets the value of the baggages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APIBaggageAvailability }{@code >}
     *     
     */
    public JAXBElement<APIBaggageAvailability> getBaggages() {
        return baggages;
    }

    /**
     * Sets the value of the baggages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APIBaggageAvailability }{@code >}
     *     
     */
    public void setBaggages(JAXBElement<APIBaggageAvailability> value) {
        this.baggages = value;
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
     * Gets the value of the insurance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APIInsuranceAvailability }{@code >}
     *     
     */
    public JAXBElement<APIInsuranceAvailability> getInsurance() {
        return insurance;
    }

    /**
     * Sets the value of the insurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APIInsuranceAvailability }{@code >}
     *     
     */
    public void setInsurance(JAXBElement<APIInsuranceAvailability> value) {
        this.insurance = value;
    }

    /**
     * Gets the value of the isError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsError() {
        return isError;
    }

    /**
     * Sets the value of the isError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsError(Boolean value) {
        this.isError = value;
    }

    /**
     * Gets the value of the lounge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APILoungeAvailability }{@code >}
     *     
     */
    public JAXBElement<APILoungeAvailability> getLounge() {
        return lounge;
    }

    /**
     * Sets the value of the lounge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APILoungeAvailability }{@code >}
     *     
     */
    public void setLounge(JAXBElement<APILoungeAvailability> value) {
        this.lounge = value;
    }

    /**
     * Gets the value of the meals property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APIMealAvailability }{@code >}
     *     
     */
    public JAXBElement<APIMealAvailability> getMeals() {
        return meals;
    }

    /**
     * Sets the value of the meals property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APIMealAvailability }{@code >}
     *     
     */
    public void setMeals(JAXBElement<APIMealAvailability> value) {
        this.meals = value;
    }

    /**
     * Gets the value of the seats property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APISeatAvailability }{@code >}
     *     
     */
    public JAXBElement<APISeatAvailability> getSeats() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APISeatAvailability }{@code >}
     *     
     */
    public void setSeats(JAXBElement<APISeatAvailability> value) {
        this.seats = value;
    }

}
