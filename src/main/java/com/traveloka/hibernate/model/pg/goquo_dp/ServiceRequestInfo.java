
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceRequestInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceRequestInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommercialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightBagResID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FlightPaxIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FlightSegmentIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Subcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequestInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "commercialName",
    "flightBagResID",
    "flightPaxIndex",
    "flightSegmentIndex",
    "subcode"
})
public class ServiceRequestInfo {

    @XmlElementRef(name = "CommercialName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commercialName;
    @XmlElement(name = "FlightBagResID")
    protected Integer flightBagResID;
    @XmlElement(name = "FlightPaxIndex")
    protected Integer flightPaxIndex;
    @XmlElement(name = "FlightSegmentIndex")
    protected Integer flightSegmentIndex;
    @XmlElementRef(name = "Subcode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subcode;

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
     * Gets the value of the flightBagResID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightBagResID() {
        return flightBagResID;
    }

    /**
     * Sets the value of the flightBagResID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightBagResID(Integer value) {
        this.flightBagResID = value;
    }

    /**
     * Gets the value of the flightPaxIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightPaxIndex() {
        return flightPaxIndex;
    }

    /**
     * Sets the value of the flightPaxIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightPaxIndex(Integer value) {
        this.flightPaxIndex = value;
    }

    /**
     * Gets the value of the flightSegmentIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightSegmentIndex() {
        return flightSegmentIndex;
    }

    /**
     * Sets the value of the flightSegmentIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightSegmentIndex(Integer value) {
        this.flightSegmentIndex = value;
    }

    /**
     * Gets the value of the subcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubcode() {
        return subcode;
    }

    /**
     * Sets the value of the subcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubcode(JAXBElement<String> value) {
        this.subcode = value;
    }

}
