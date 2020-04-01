
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareGroupAirlineFlight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareGroupAirlineFlight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DispFareGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareGroupDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreeBaggageAllowance" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}RouteFreeBaggageAllowance" minOccurs="0"/>
 *         &lt;element name="HasFlights" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareGroupAirlineFlight", propOrder = {
    "dispFareGroup",
    "fareGroup",
    "fareGroupCode",
    "fareGroupDesc",
    "freeBaggageAllowance",
    "hasFlights"
})
public class FareGroupAirlineFlight {

    @XmlElementRef(name = "DispFareGroup", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispFareGroup;
    @XmlElementRef(name = "FareGroup", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareGroup;
    @XmlElementRef(name = "FareGroupCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareGroupCode;
    @XmlElementRef(name = "FareGroupDesc", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareGroupDesc;
    @XmlElementRef(name = "FreeBaggageAllowance", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<RouteFreeBaggageAllowance> freeBaggageAllowance;
    @XmlElement(name = "HasFlights")
    protected Boolean hasFlights;

    /**
     * Gets the value of the dispFareGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispFareGroup() {
        return dispFareGroup;
    }

    /**
     * Sets the value of the dispFareGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispFareGroup(JAXBElement<String> value) {
        this.dispFareGroup = value;
    }

    /**
     * Gets the value of the fareGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFareGroup() {
        return fareGroup;
    }

    /**
     * Sets the value of the fareGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFareGroup(JAXBElement<String> value) {
        this.fareGroup = value;
    }

    /**
     * Gets the value of the fareGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFareGroupCode() {
        return fareGroupCode;
    }

    /**
     * Sets the value of the fareGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFareGroupCode(JAXBElement<String> value) {
        this.fareGroupCode = value;
    }

    /**
     * Gets the value of the fareGroupDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFareGroupDesc() {
        return fareGroupDesc;
    }

    /**
     * Sets the value of the fareGroupDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFareGroupDesc(JAXBElement<String> value) {
        this.fareGroupDesc = value;
    }

    /**
     * Gets the value of the freeBaggageAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RouteFreeBaggageAllowance }{@code >}
     *     
     */
    public JAXBElement<RouteFreeBaggageAllowance> getFreeBaggageAllowance() {
        return freeBaggageAllowance;
    }

    /**
     * Sets the value of the freeBaggageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RouteFreeBaggageAllowance }{@code >}
     *     
     */
    public void setFreeBaggageAllowance(JAXBElement<RouteFreeBaggageAllowance> value) {
        this.freeBaggageAllowance = value;
    }

    /**
     * Gets the value of the hasFlights property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasFlights() {
        return hasFlights;
    }

    /**
     * Sets the value of the hasFlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasFlights(Boolean value) {
        this.hasFlights = value;
    }

}
