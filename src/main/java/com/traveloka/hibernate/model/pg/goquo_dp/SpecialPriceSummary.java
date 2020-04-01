
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialPriceSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialPriceSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DispPerPaxPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PerPaxPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SpecialFareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalPaxPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialPriceSummary", propOrder = {
    "dispPerPaxPrice",
    "paxCount",
    "perPaxPrice",
    "specialFareType",
    "totalPaxPrice"
})
public class SpecialPriceSummary {

    @XmlElementRef(name = "DispPerPaxPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispPerPaxPrice;
    @XmlElement(name = "PaxCount")
    protected Integer paxCount;
    @XmlElement(name = "PerPaxPrice")
    protected BigDecimal perPaxPrice;
    @XmlElementRef(name = "SpecialFareType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialFareType;
    @XmlElement(name = "TotalPaxPrice")
    protected BigDecimal totalPaxPrice;

    /**
     * Gets the value of the dispPerPaxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispPerPaxPrice() {
        return dispPerPaxPrice;
    }

    /**
     * Sets the value of the dispPerPaxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispPerPaxPrice(JAXBElement<String> value) {
        this.dispPerPaxPrice = value;
    }

    /**
     * Gets the value of the paxCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaxCount() {
        return paxCount;
    }

    /**
     * Sets the value of the paxCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaxCount(Integer value) {
        this.paxCount = value;
    }

    /**
     * Gets the value of the perPaxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerPaxPrice() {
        return perPaxPrice;
    }

    /**
     * Sets the value of the perPaxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerPaxPrice(BigDecimal value) {
        this.perPaxPrice = value;
    }

    /**
     * Gets the value of the specialFareType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialFareType() {
        return specialFareType;
    }

    /**
     * Sets the value of the specialFareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialFareType(JAXBElement<String> value) {
        this.specialFareType = value;
    }

    /**
     * Gets the value of the totalPaxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPaxPrice() {
        return totalPaxPrice;
    }

    /**
     * Sets the value of the totalPaxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPaxPrice(BigDecimal value) {
        this.totalPaxPrice = value;
    }

}
