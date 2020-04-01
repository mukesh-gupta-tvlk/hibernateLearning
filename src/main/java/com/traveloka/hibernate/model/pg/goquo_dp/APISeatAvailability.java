
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_SeatAvailability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_SeatAvailability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailableSeats" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfAPI_SeatSegment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_SeatAvailability", propOrder = {
    "availableSeats"
})
public class APISeatAvailability {

    @XmlElementRef(name = "AvailableSeats", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAPISeatSegment> availableSeats;

    /**
     * Gets the value of the availableSeats property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPISeatSegment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAPISeatSegment> getAvailableSeats() {
        return availableSeats;
    }

    /**
     * Sets the value of the availableSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPISeatSegment }{@code >}
     *     
     */
    public void setAvailableSeats(JAXBElement<ArrayOfAPISeatSegment> value) {
        this.availableSeats = value;
    }

}
