
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_BaggageAvailability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_BaggageAvailability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailableBaggages" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfAPI_BaggageSegment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_BaggageAvailability", propOrder = {
    "availableBaggages"
})
public class APIBaggageAvailability {

    @XmlElementRef(name = "AvailableBaggages", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAPIBaggageSegment> availableBaggages;

    /**
     * Gets the value of the availableBaggages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPIBaggageSegment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAPIBaggageSegment> getAvailableBaggages() {
        return availableBaggages;
    }

    /**
     * Sets the value of the availableBaggages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPIBaggageSegment }{@code >}
     *     
     */
    public void setAvailableBaggages(JAXBElement<ArrayOfAPIBaggageSegment> value) {
        this.availableBaggages = value;
    }

}
