
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_LoungeAvailability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_LoungeAvailability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailableLounge" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfAPI_LoungeSegment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_LoungeAvailability", propOrder = {
    "availableLounge"
})
public class APILoungeAvailability {

    @XmlElementRef(name = "AvailableLounge", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAPILoungeSegment> availableLounge;

    /**
     * Gets the value of the availableLounge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPILoungeSegment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAPILoungeSegment> getAvailableLounge() {
        return availableLounge;
    }

    /**
     * Sets the value of the availableLounge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPILoungeSegment }{@code >}
     *     
     */
    public void setAvailableLounge(JAXBElement<ArrayOfAPILoungeSegment> value) {
        this.availableLounge = value;
    }

}
