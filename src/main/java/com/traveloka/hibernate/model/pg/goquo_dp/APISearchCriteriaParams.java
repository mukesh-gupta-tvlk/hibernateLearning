
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for API_SearchCriteriaParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_SearchCriteriaParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrivalCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LegIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_SearchCriteriaParams", propOrder = {
    "arrivalCity",
    "departureCity",
    "departureDate",
    "legIndex"
})
public class APISearchCriteriaParams {

    @XmlElementRef(name = "ArrivalCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrivalCity;
    @XmlElementRef(name = "DepartureCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departureCity;
    @XmlElement(name = "DepartureDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "LegIndex")
    protected Integer legIndex;

    /**
     * Gets the value of the arrivalCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrivalCity() {
        return arrivalCity;
    }

    /**
     * Sets the value of the arrivalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrivalCity(JAXBElement<String> value) {
        this.arrivalCity = value;
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
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
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

}
