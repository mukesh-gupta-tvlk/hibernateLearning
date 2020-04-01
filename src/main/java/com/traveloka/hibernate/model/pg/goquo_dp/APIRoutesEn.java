
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIRoutesEn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIRoutesEn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrAirportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepAirportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIRoutesEn", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "arrAirportName",
    "arrCode",
    "arrCountryCode",
    "arrCountryName",
    "depAirportName",
    "depCode",
    "depCountryCode",
    "depCountryName",
    "status"
})
public class APIRoutesEn {

    @XmlElementRef(name = "ArrAirportName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrAirportName;
    @XmlElementRef(name = "ArrCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrCode;
    @XmlElementRef(name = "ArrCountryCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrCountryCode;
    @XmlElementRef(name = "ArrCountryName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrCountryName;
    @XmlElementRef(name = "DepAirportName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depAirportName;
    @XmlElementRef(name = "DepCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depCode;
    @XmlElementRef(name = "DepCountryCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depCountryCode;
    @XmlElementRef(name = "DepCountryName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depCountryName;
    @XmlElementRef(name = "Status", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;

    /**
     * Gets the value of the arrAirportName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrAirportName() {
        return arrAirportName;
    }

    /**
     * Sets the value of the arrAirportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrAirportName(JAXBElement<String> value) {
        this.arrAirportName = value;
    }

    /**
     * Gets the value of the arrCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrCode() {
        return arrCode;
    }

    /**
     * Sets the value of the arrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrCode(JAXBElement<String> value) {
        this.arrCode = value;
    }

    /**
     * Gets the value of the arrCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrCountryCode() {
        return arrCountryCode;
    }

    /**
     * Sets the value of the arrCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrCountryCode(JAXBElement<String> value) {
        this.arrCountryCode = value;
    }

    /**
     * Gets the value of the arrCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrCountryName() {
        return arrCountryName;
    }

    /**
     * Sets the value of the arrCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrCountryName(JAXBElement<String> value) {
        this.arrCountryName = value;
    }

    /**
     * Gets the value of the depAirportName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepAirportName() {
        return depAirportName;
    }

    /**
     * Sets the value of the depAirportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepAirportName(JAXBElement<String> value) {
        this.depAirportName = value;
    }

    /**
     * Gets the value of the depCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepCode() {
        return depCode;
    }

    /**
     * Sets the value of the depCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepCode(JAXBElement<String> value) {
        this.depCode = value;
    }

    /**
     * Gets the value of the depCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepCountryCode() {
        return depCountryCode;
    }

    /**
     * Sets the value of the depCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepCountryCode(JAXBElement<String> value) {
        this.depCountryCode = value;
    }

    /**
     * Gets the value of the depCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepCountryName() {
        return depCountryName;
    }

    /**
     * Sets the value of the depCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepCountryName(JAXBElement<String> value) {
        this.depCountryName = value;
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

}
