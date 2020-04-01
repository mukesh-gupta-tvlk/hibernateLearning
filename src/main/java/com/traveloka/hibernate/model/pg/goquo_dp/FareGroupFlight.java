
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareGroupFlight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareGroupFlight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DispFareGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispMLFareGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FGFlight" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}Flights" minOccurs="0"/>
 *         &lt;element name="FGIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FareGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareGroupFlight", propOrder = {
    "dispFareGroup",
    "dispMLFareGroup",
    "fgFlight",
    "fgIndex",
    "fareGroup",
    "fareGroupCode",
    "parentGroupName"
})
public class FareGroupFlight {

    @XmlElementRef(name = "DispFareGroup", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispFareGroup;
    @XmlElementRef(name = "DispMLFareGroup", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispMLFareGroup;
    @XmlElementRef(name = "FGFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<Flights> fgFlight;
    @XmlElement(name = "FGIndex")
    protected Integer fgIndex;
    @XmlElementRef(name = "FareGroup", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareGroup;
    @XmlElementRef(name = "FareGroupCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareGroupCode;
    @XmlElementRef(name = "ParentGroupName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentGroupName;

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
     * Gets the value of the dispMLFareGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispMLFareGroup() {
        return dispMLFareGroup;
    }

    /**
     * Sets the value of the dispMLFareGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispMLFareGroup(JAXBElement<String> value) {
        this.dispMLFareGroup = value;
    }

    /**
     * Gets the value of the fgFlight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Flights }{@code >}
     *     
     */
    public JAXBElement<Flights> getFGFlight() {
        return fgFlight;
    }

    /**
     * Sets the value of the fgFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Flights }{@code >}
     *     
     */
    public void setFGFlight(JAXBElement<Flights> value) {
        this.fgFlight = value;
    }

    /**
     * Gets the value of the fgIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFGIndex() {
        return fgIndex;
    }

    /**
     * Sets the value of the fgIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFGIndex(Integer value) {
        this.fgIndex = value;
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
     * Gets the value of the parentGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentGroupName() {
        return parentGroupName;
    }

    /**
     * Sets the value of the parentGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentGroupName(JAXBElement<String> value) {
        this.parentGroupName = value;
    }

}
