
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirlineMLFlightLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineMLFlightLeg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ArraivalCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailFlights" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfAirlineFlight" minOccurs="0"/>
 *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DepartureCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Infants" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowLeg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LegIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SelectedAirlineFlight" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}AirlineFlight" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineMLFlightLeg", propOrder = {
    "adults",
    "arraivalCity",
    "availFlights",
    "children",
    "departureCity",
    "infants",
    "isSelected",
    "isShowLeg",
    "legIndex",
    "selectedAirlineFlight"
})
public class AirlineMLFlightLeg {

    @XmlElement(name = "Adults")
    protected Integer adults;
    @XmlElementRef(name = "ArraivalCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arraivalCity;
    @XmlElementRef(name = "AvailFlights", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAirlineFlight> availFlights;
    @XmlElement(name = "Children")
    protected Integer children;
    @XmlElementRef(name = "DepartureCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departureCity;
    @XmlElement(name = "Infants")
    protected Integer infants;
    @XmlElement(name = "IsSelected")
    protected Boolean isSelected;
    @XmlElement(name = "IsShowLeg")
    protected Boolean isShowLeg;
    @XmlElement(name = "LegIndex")
    protected Integer legIndex;
    @XmlElementRef(name = "SelectedAirlineFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<AirlineFlight> selectedAirlineFlight;

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
     * Gets the value of the arraivalCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArraivalCity() {
        return arraivalCity;
    }

    /**
     * Sets the value of the arraivalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArraivalCity(JAXBElement<String> value) {
        this.arraivalCity = value;
    }

    /**
     * Gets the value of the availFlights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAirlineFlight }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAirlineFlight> getAvailFlights() {
        return availFlights;
    }

    /**
     * Sets the value of the availFlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAirlineFlight }{@code >}
     *     
     */
    public void setAvailFlights(JAXBElement<ArrayOfAirlineFlight> value) {
        this.availFlights = value;
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
     * Gets the value of the departureCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartureCity() {
        return departureCity;
    }

    /**
     * Sets the value of the departureCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartureCity(JAXBElement<String> value) {
        this.departureCity = value;
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
     * Gets the value of the isShowLeg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowLeg() {
        return isShowLeg;
    }

    /**
     * Sets the value of the isShowLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowLeg(Boolean value) {
        this.isShowLeg = value;
    }

    /**
     * Gets the value of the legIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLegIndex() {
        return legIndex;
    }

    /**
     * Sets the value of the legIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLegIndex(Integer value) {
        this.legIndex = value;
    }

    /**
     * Gets the value of the selectedAirlineFlight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirlineFlight }{@code >}
     *     
     */
    public JAXBElement<AirlineFlight> getSelectedAirlineFlight() {
        return selectedAirlineFlight;
    }

    /**
     * Sets the value of the selectedAirlineFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirlineFlight }{@code >}
     *     
     */
    public void setSelectedAirlineFlight(JAXBElement<AirlineFlight> value) {
        this.selectedAirlineFlight = value;
    }

}
