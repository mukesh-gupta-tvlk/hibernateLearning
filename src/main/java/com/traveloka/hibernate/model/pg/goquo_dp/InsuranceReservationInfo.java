
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuranceReservationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceReservationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="insuranceReservation" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}InsuranceReservationEN" minOccurs="0"/>
 *         &lt;element name="insuranceReservationDetails" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfInsuranceReservationEN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceReservationInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "insuranceReservation",
    "insuranceReservationDetails"
})
public class InsuranceReservationInfo {

    @XmlElementRef(name = "insuranceReservation", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<InsuranceReservationEN> insuranceReservation;
    @XmlElementRef(name = "insuranceReservationDetails", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInsuranceReservationEN> insuranceReservationDetails;

    /**
     * Gets the value of the insuranceReservation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsuranceReservationEN }{@code >}
     *     
     */
    public JAXBElement<InsuranceReservationEN> getInsuranceReservation() {
        return insuranceReservation;
    }

    /**
     * Sets the value of the insuranceReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsuranceReservationEN }{@code >}
     *     
     */
    public void setInsuranceReservation(JAXBElement<InsuranceReservationEN> value) {
        this.insuranceReservation = value;
    }

    /**
     * Gets the value of the insuranceReservationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInsuranceReservationEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInsuranceReservationEN> getInsuranceReservationDetails() {
        return insuranceReservationDetails;
    }

    /**
     * Sets the value of the insuranceReservationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInsuranceReservationEN }{@code >}
     *     
     */
    public void setInsuranceReservationDetails(JAXBElement<ArrayOfInsuranceReservationEN> value) {
        this.insuranceReservationDetails = value;
    }

}
