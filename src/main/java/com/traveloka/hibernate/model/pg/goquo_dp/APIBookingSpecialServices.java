
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_BookingSpecialServices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_BookingSpecialServices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingSpecialServices" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfBookingSpecialServices" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_BookingSpecialServices", propOrder = {
    "bookingSpecialServices",
    "error"
})
public class APIBookingSpecialServices {

    @XmlElementRef(name = "BookingSpecialServices", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBookingSpecialServices> bookingSpecialServices;
    @XmlElementRef(name = "Error", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> error;

    /**
     * Gets the value of the bookingSpecialServices property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBookingSpecialServices }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBookingSpecialServices> getBookingSpecialServices() {
        return bookingSpecialServices;
    }

    /**
     * Sets the value of the bookingSpecialServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBookingSpecialServices }{@code >}
     *     
     */
    public void setBookingSpecialServices(JAXBElement<ArrayOfBookingSpecialServices> value) {
        this.bookingSpecialServices = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setError(JAXBElement<String> value) {
        this.error = value;
    }

}
