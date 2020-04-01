
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_BaggageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_BaggageInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}API_AddonPriceInfo" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_BaggageInfo", propOrder = {
    "priceInfo",
    "weight"
})
public class APIBaggageInfo {

    @XmlElementRef(name = "PriceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<APIAddonPriceInfo> priceInfo;
    @XmlElement(name = "Weight")
    protected Integer weight;

    /**
     * Gets the value of the priceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APIAddonPriceInfo }{@code >}
     *     
     */
    public JAXBElement<APIAddonPriceInfo> getPriceInfo() {
        return priceInfo;
    }

    /**
     * Sets the value of the priceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APIAddonPriceInfo }{@code >}
     *     
     */
    public void setPriceInfo(JAXBElement<APIAddonPriceInfo> value) {
        this.priceInfo = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeight(Integer value) {
        this.weight = value;
    }

}
