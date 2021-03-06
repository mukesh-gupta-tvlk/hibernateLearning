
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiSetSelectedReponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiSetSelectedReponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectedMLFlights" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}AirlineMLAvail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSetSelectedReponse", propOrder = {
    "errorDetails",
    "selectedMLFlights"
})
public class MultiSetSelectedReponse {

    @XmlElementRef(name = "ErrorDetails", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorDetails;
    @XmlElementRef(name = "SelectedMLFlights", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<AirlineMLAvail> selectedMLFlights;

    /**
     * Gets the value of the errorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets the value of the errorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorDetails(JAXBElement<String> value) {
        this.errorDetails = value;
    }

    /**
     * Gets the value of the selectedMLFlights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirlineMLAvail }{@code >}
     *     
     */
    public JAXBElement<AirlineMLAvail> getSelectedMLFlights() {
        return selectedMLFlights;
    }

    /**
     * Sets the value of the selectedMLFlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirlineMLAvail }{@code >}
     *     
     */
    public void setSelectedMLFlights(JAXBElement<AirlineMLAvail> value) {
        this.selectedMLFlights = value;
    }

}
