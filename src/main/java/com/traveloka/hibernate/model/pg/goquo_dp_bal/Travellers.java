
package com.traveloka.hibernate.model.pg.goquo_dp_bal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Travellers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Travellers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndividualPremium" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TotalPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Travellers", propOrder = {
    "individualPremium",
    "totalPax",
    "type"
})
public class Travellers {

    @XmlElement(name = "IndividualPremium")
    protected Double individualPremium;
    @XmlElementRef(name = "TotalPax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalPax;
    @XmlElementRef(name = "Type", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;

    /**
     * Gets the value of the individualPremium property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIndividualPremium() {
        return individualPremium;
    }

    /**
     * Sets the value of the individualPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIndividualPremium(Double value) {
        this.individualPremium = value;
    }

    /**
     * Gets the value of the totalPax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalPax() {
        return totalPax;
    }

    /**
     * Sets the value of the totalPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalPax(JAXBElement<String> value) {
        this.totalPax = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
    }

}
