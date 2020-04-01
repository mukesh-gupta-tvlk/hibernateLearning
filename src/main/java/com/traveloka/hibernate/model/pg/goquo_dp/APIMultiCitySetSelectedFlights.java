
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_MultiCitySetSelectedFlights complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_MultiCitySetSelectedFlights">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SetSelectedFlights" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfMultiCitySetSelectedFlight" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_MultiCitySetSelectedFlights", propOrder = {
    "setSelectedFlights"
})
public class APIMultiCitySetSelectedFlights {

    @XmlElementRef(name = "SetSelectedFlights", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMultiCitySetSelectedFlight> setSelectedFlights;

    /**
     * Gets the value of the setSelectedFlights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMultiCitySetSelectedFlight }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMultiCitySetSelectedFlight> getSetSelectedFlights() {
        return setSelectedFlights;
    }

    /**
     * Sets the value of the setSelectedFlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMultiCitySetSelectedFlight }{@code >}
     *     
     */
    public void setSetSelectedFlights(JAXBElement<ArrayOfMultiCitySetSelectedFlight> value) {
        this.setSelectedFlights = value;
    }

}
