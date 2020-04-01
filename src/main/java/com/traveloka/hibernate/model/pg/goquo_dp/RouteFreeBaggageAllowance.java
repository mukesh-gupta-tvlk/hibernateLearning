
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RouteFreeBaggageAllowance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteFreeBaggageAllowance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CabinClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FBA" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}FreeBaggageAllowance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteFreeBaggageAllowance", propOrder = {
    "arrCity",
    "cabinClassCode",
    "classCode",
    "depCity",
    "fba"
})
public class RouteFreeBaggageAllowance {

    @XmlElementRef(name = "ArrCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrCity;
    @XmlElementRef(name = "CabinClassCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cabinClassCode;
    @XmlElementRef(name = "ClassCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> classCode;
    @XmlElementRef(name = "DepCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depCity;
    @XmlElementRef(name = "FBA", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<FreeBaggageAllowance> fba;

    /**
     * Gets the value of the arrCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrCity() {
        return arrCity;
    }

    /**
     * Sets the value of the arrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrCity(JAXBElement<String> value) {
        this.arrCity = value;
    }

    /**
     * Gets the value of the cabinClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCabinClassCode() {
        return cabinClassCode;
    }

    /**
     * Sets the value of the cabinClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCabinClassCode(JAXBElement<String> value) {
        this.cabinClassCode = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClassCode(JAXBElement<String> value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the depCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepCity() {
        return depCity;
    }

    /**
     * Sets the value of the depCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepCity(JAXBElement<String> value) {
        this.depCity = value;
    }

    /**
     * Gets the value of the fba property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FreeBaggageAllowance }{@code >}
     *     
     */
    public JAXBElement<FreeBaggageAllowance> getFBA() {
        return fba;
    }

    /**
     * Sets the value of the fba property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FreeBaggageAllowance }{@code >}
     *     
     */
    public void setFBA(JAXBElement<FreeBaggageAllowance> value) {
        this.fba = value;
    }

}
