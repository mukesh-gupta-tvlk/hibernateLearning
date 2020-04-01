
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingSpecialServices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingSpecialServices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialServices" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfSpecialService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingSpecialServices", propOrder = {
    "specialServiceType",
    "specialServices"
})
public class BookingSpecialServices {

    @XmlElementRef(name = "SpecialServiceType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialServiceType;
    @XmlElementRef(name = "SpecialServices", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSpecialService> specialServices;

    /**
     * Gets the value of the specialServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialServiceType() {
        return specialServiceType;
    }

    /**
     * Sets the value of the specialServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialServiceType(JAXBElement<String> value) {
        this.specialServiceType = value;
    }

    /**
     * Gets the value of the specialServices property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSpecialService }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSpecialService> getSpecialServices() {
        return specialServices;
    }

    /**
     * Sets the value of the specialServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSpecialService }{@code >}
     *     
     */
    public void setSpecialServices(JAXBElement<ArrayOfSpecialService> value) {
        this.specialServices = value;
    }

}
