
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirlineMLPaxPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineMLPaxPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerPaxPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerPaxTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerPaxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PromotionPerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SpecialFareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialTypePaxCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dispPerPaxPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispPerPaxTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispPerPaxTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispPromotionPerPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineMLPaxPrice", propOrder = {
    "currency",
    "displayCurrency",
    "perPaxPrice",
    "perPaxTax",
    "perPaxTotal",
    "promotionPerPax",
    "specialFareType",
    "specialTypePaxCount",
    "dispPerPaxPrice",
    "dispPerPaxTax",
    "dispPerPaxTotal",
    "dispPromotionPerPax"
})
public class AirlineMLPaxPrice {

    @XmlElementRef(name = "Currency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency;
    @XmlElementRef(name = "DisplayCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayCurrency;
    @XmlElement(name = "PerPaxPrice")
    protected BigDecimal perPaxPrice;
    @XmlElement(name = "PerPaxTax")
    protected BigDecimal perPaxTax;
    @XmlElement(name = "PerPaxTotal")
    protected BigDecimal perPaxTotal;
    @XmlElement(name = "PromotionPerPax")
    protected BigDecimal promotionPerPax;
    @XmlElementRef(name = "SpecialFareType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialFareType;
    @XmlElement(name = "SpecialTypePaxCount")
    protected Integer specialTypePaxCount;
    @XmlElementRef(name = "dispPerPaxPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispPerPaxPrice;
    @XmlElementRef(name = "dispPerPaxTax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispPerPaxTax;
    @XmlElementRef(name = "dispPerPaxTotal", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispPerPaxTotal;
    @XmlElementRef(name = "dispPromotionPerPax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispPromotionPerPax;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrency(JAXBElement<String> value) {
        this.currency = value;
    }

    /**
     * Gets the value of the displayCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayCurrency() {
        return displayCurrency;
    }

    /**
     * Sets the value of the displayCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayCurrency(JAXBElement<String> value) {
        this.displayCurrency = value;
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
     * Gets the value of the perPaxTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerPaxTax() {
        return perPaxTax;
    }

    /**
     * Sets the value of the perPaxTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerPaxTax(BigDecimal value) {
        this.perPaxTax = value;
    }

    /**
     * Gets the value of the perPaxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerPaxTotal() {
        return perPaxTotal;
    }

    /**
     * Sets the value of the perPaxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerPaxTotal(BigDecimal value) {
        this.perPaxTotal = value;
    }

    /**
     * Gets the value of the promotionPerPax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromotionPerPax() {
        return promotionPerPax;
    }

    /**
     * Sets the value of the promotionPerPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromotionPerPax(BigDecimal value) {
        this.promotionPerPax = value;
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
     * Gets the value of the specialTypePaxCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpecialTypePaxCount() {
        return specialTypePaxCount;
    }

    /**
     * Sets the value of the specialTypePaxCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpecialTypePaxCount(Integer value) {
        this.specialTypePaxCount = value;
    }

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
     * Gets the value of the dispPerPaxTax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispPerPaxTax() {
        return dispPerPaxTax;
    }

    /**
     * Sets the value of the dispPerPaxTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispPerPaxTax(JAXBElement<String> value) {
        this.dispPerPaxTax = value;
    }

    /**
     * Gets the value of the dispPerPaxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispPerPaxTotal() {
        return dispPerPaxTotal;
    }

    /**
     * Sets the value of the dispPerPaxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispPerPaxTotal(JAXBElement<String> value) {
        this.dispPerPaxTotal = value;
    }

    /**
     * Gets the value of the dispPromotionPerPax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispPromotionPerPax() {
        return dispPromotionPerPax;
    }

    /**
     * Sets the value of the dispPromotionPerPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispPromotionPerPax(JAXBElement<String> value) {
        this.dispPromotionPerPax = value;
    }

}
