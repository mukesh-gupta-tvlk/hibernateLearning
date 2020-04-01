
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_PaxSelectedAddOn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_PaxSelectedAddOn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectedBaggages" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfAPI_SelectedBaggages" minOccurs="0"/>
 *         &lt;element name="SelectedLounges" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfAPI_SelectedLounge" minOccurs="0"/>
 *         &lt;element name="SelectedMeals" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfAPI_SelectedMeals" minOccurs="0"/>
 *         &lt;element name="SelectedSeats" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfAPI_SelectedSeat" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_PaxSelectedAddOn", propOrder = {
    "passengerIndex",
    "passengerType",
    "selectedBaggages",
    "selectedLounges",
    "selectedMeals",
    "selectedSeats"
})
public class APIPaxSelectedAddOn {

    @XmlElement(name = "PassengerIndex")
    protected Integer passengerIndex;
    @XmlElementRef(name = "PassengerType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passengerType;
    @XmlElementRef(name = "SelectedBaggages", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAPISelectedBaggages> selectedBaggages;
    @XmlElementRef(name = "SelectedLounges", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAPISelectedLounge> selectedLounges;
    @XmlElementRef(name = "SelectedMeals", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAPISelectedMeals> selectedMeals;
    @XmlElementRef(name = "SelectedSeats", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAPISelectedSeat> selectedSeats;

    /**
     * Gets the value of the passengerIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassengerIndex() {
        return passengerIndex;
    }

    /**
     * Sets the value of the passengerIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassengerIndex(Integer value) {
        this.passengerIndex = value;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassengerType(JAXBElement<String> value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the selectedBaggages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPISelectedBaggages }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAPISelectedBaggages> getSelectedBaggages() {
        return selectedBaggages;
    }

    /**
     * Sets the value of the selectedBaggages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPISelectedBaggages }{@code >}
     *     
     */
    public void setSelectedBaggages(JAXBElement<ArrayOfAPISelectedBaggages> value) {
        this.selectedBaggages = value;
    }

    /**
     * Gets the value of the selectedLounges property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPISelectedLounge }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAPISelectedLounge> getSelectedLounges() {
        return selectedLounges;
    }

    /**
     * Sets the value of the selectedLounges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPISelectedLounge }{@code >}
     *     
     */
    public void setSelectedLounges(JAXBElement<ArrayOfAPISelectedLounge> value) {
        this.selectedLounges = value;
    }

    /**
     * Gets the value of the selectedMeals property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPISelectedMeals }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAPISelectedMeals> getSelectedMeals() {
        return selectedMeals;
    }

    /**
     * Sets the value of the selectedMeals property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPISelectedMeals }{@code >}
     *     
     */
    public void setSelectedMeals(JAXBElement<ArrayOfAPISelectedMeals> value) {
        this.selectedMeals = value;
    }

    /**
     * Gets the value of the selectedSeats property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPISelectedSeat }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAPISelectedSeat> getSelectedSeats() {
        return selectedSeats;
    }

    /**
     * Sets the value of the selectedSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPISelectedSeat }{@code >}
     *     
     */
    public void setSelectedSeats(JAXBElement<ArrayOfAPISelectedSeat> value) {
        this.selectedSeats = value;
    }

}
