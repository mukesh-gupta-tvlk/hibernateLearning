
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_MealAvailability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_MealAvailability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailableMeals" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfAPI_MealSegment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_MealAvailability", propOrder = {
    "availableMeals"
})
public class APIMealAvailability {

    @XmlElementRef(name = "AvailableMeals", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAPIMealSegment> availableMeals;

    /**
     * Gets the value of the availableMeals property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPIMealSegment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAPIMealSegment> getAvailableMeals() {
        return availableMeals;
    }

    /**
     * Sets the value of the availableMeals property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPIMealSegment }{@code >}
     *     
     */
    public void setAvailableMeals(JAXBElement<ArrayOfAPIMealSegment> value) {
        this.availableMeals = value;
    }

}
