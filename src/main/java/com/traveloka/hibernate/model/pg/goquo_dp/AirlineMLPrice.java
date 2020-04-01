
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirlineMLPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineMLPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseFareAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BaseFareRoundingText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerSegPaxPriceDiff" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PaxPriceDifference" minOccurs="0"/>
 *         &lt;element name="PkgAmountWithPromotion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PkgAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceDiff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PromotionTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dispPkgAmountWithPromotion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispPkgAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispPriceDiff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispPromotionTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispTaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispTotalMarkup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineMLPrice", propOrder = {
    "baseFareAmount",
    "baseFareRoundingText",
    "currency",
    "displayCurrency",
    "perSegPaxPriceDiff",
    "pkgAmountWithPromotion",
    "pkgAmt",
    "priceDiff",
    "promotionTotalAmount",
    "taxAmount",
    "totalAmount",
    "totalMarkup",
    "dispPkgAmountWithPromotion",
    "dispPkgAmt",
    "dispPrice",
    "dispPriceDiff",
    "dispPromotionTotalAmount",
    "dispTaxAmount",
    "dispTotalAmount",
    "dispTotalMarkup"
})
public class AirlineMLPrice {

    @XmlElement(name = "BaseFareAmount")
    protected BigDecimal baseFareAmount;
    @XmlElementRef(name = "BaseFareRoundingText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> baseFareRoundingText;
    @XmlElementRef(name = "Currency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency;
    @XmlElementRef(name = "DisplayCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayCurrency;
    @XmlElementRef(name = "PerSegPaxPriceDiff", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<PaxPriceDifference> perSegPaxPriceDiff;
    @XmlElement(name = "PkgAmountWithPromotion")
    protected BigDecimal pkgAmountWithPromotion;
    @XmlElement(name = "PkgAmt")
    protected BigDecimal pkgAmt;
    @XmlElement(name = "PriceDiff")
    protected BigDecimal priceDiff;
    @XmlElement(name = "PromotionTotalAmount")
    protected BigDecimal promotionTotalAmount;
    @XmlElement(name = "TaxAmount")
    protected BigDecimal taxAmount;
    @XmlElement(name = "TotalAmount")
    protected BigDecimal totalAmount;
    @XmlElement(name = "TotalMarkup")
    protected BigDecimal totalMarkup;
    @XmlElementRef(name = "dispPkgAmountWithPromotion", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispPkgAmountWithPromotion;
    @XmlElementRef(name = "dispPkgAmt", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispPkgAmt;
    @XmlElementRef(name = "dispPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispPrice;
    @XmlElementRef(name = "dispPriceDiff", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispPriceDiff;
    @XmlElementRef(name = "dispPromotionTotalAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispPromotionTotalAmount;
    @XmlElementRef(name = "dispTaxAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispTaxAmount;
    @XmlElementRef(name = "dispTotalAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispTotalAmount;
    @XmlElementRef(name = "dispTotalMarkup", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispTotalMarkup;

    /**
     * Gets the value of the baseFareAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseFareAmount() {
        return baseFareAmount;
    }

    /**
     * Sets the value of the baseFareAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseFareAmount(BigDecimal value) {
        this.baseFareAmount = value;
    }

    /**
     * Gets the value of the baseFareRoundingText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBaseFareRoundingText() {
        return baseFareRoundingText;
    }

    /**
     * Sets the value of the baseFareRoundingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBaseFareRoundingText(JAXBElement<String> value) {
        this.baseFareRoundingText = value;
    }

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
     * Gets the value of the perSegPaxPriceDiff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaxPriceDifference }{@code >}
     *     
     */
    public JAXBElement<PaxPriceDifference> getPerSegPaxPriceDiff() {
        return perSegPaxPriceDiff;
    }

    /**
     * Sets the value of the perSegPaxPriceDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaxPriceDifference }{@code >}
     *     
     */
    public void setPerSegPaxPriceDiff(JAXBElement<PaxPriceDifference> value) {
        this.perSegPaxPriceDiff = value;
    }

    /**
     * Gets the value of the pkgAmountWithPromotion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPkgAmountWithPromotion() {
        return pkgAmountWithPromotion;
    }

    /**
     * Sets the value of the pkgAmountWithPromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPkgAmountWithPromotion(BigDecimal value) {
        this.pkgAmountWithPromotion = value;
    }

    /**
     * Gets the value of the pkgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPkgAmt() {
        return pkgAmt;
    }

    /**
     * Sets the value of the pkgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPkgAmt(BigDecimal value) {
        this.pkgAmt = value;
    }

    /**
     * Gets the value of the priceDiff property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceDiff() {
        return priceDiff;
    }

    /**
     * Sets the value of the priceDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceDiff(BigDecimal value) {
        this.priceDiff = value;
    }

    /**
     * Gets the value of the promotionTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromotionTotalAmount() {
        return promotionTotalAmount;
    }

    /**
     * Sets the value of the promotionTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromotionTotalAmount(BigDecimal value) {
        this.promotionTotalAmount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the totalMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalMarkup() {
        return totalMarkup;
    }

    /**
     * Sets the value of the totalMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalMarkup(BigDecimal value) {
        this.totalMarkup = value;
    }

    /**
     * Gets the value of the dispPkgAmountWithPromotion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispPkgAmountWithPromotion() {
        return dispPkgAmountWithPromotion;
    }

    /**
     * Sets the value of the dispPkgAmountWithPromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispPkgAmountWithPromotion(JAXBElement<String> value) {
        this.dispPkgAmountWithPromotion = value;
    }

    /**
     * Gets the value of the dispPkgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispPkgAmt() {
        return dispPkgAmt;
    }

    /**
     * Sets the value of the dispPkgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispPkgAmt(JAXBElement<String> value) {
        this.dispPkgAmt = value;
    }

    /**
     * Gets the value of the dispPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispPrice() {
        return dispPrice;
    }

    /**
     * Sets the value of the dispPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispPrice(JAXBElement<String> value) {
        this.dispPrice = value;
    }

    /**
     * Gets the value of the dispPriceDiff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispPriceDiff() {
        return dispPriceDiff;
    }

    /**
     * Sets the value of the dispPriceDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispPriceDiff(JAXBElement<String> value) {
        this.dispPriceDiff = value;
    }

    /**
     * Gets the value of the dispPromotionTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispPromotionTotalAmount() {
        return dispPromotionTotalAmount;
    }

    /**
     * Sets the value of the dispPromotionTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispPromotionTotalAmount(JAXBElement<String> value) {
        this.dispPromotionTotalAmount = value;
    }

    /**
     * Gets the value of the dispTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispTaxAmount() {
        return dispTaxAmount;
    }

    /**
     * Sets the value of the dispTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispTaxAmount(JAXBElement<String> value) {
        this.dispTaxAmount = value;
    }

    /**
     * Gets the value of the dispTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispTotalAmount() {
        return dispTotalAmount;
    }

    /**
     * Sets the value of the dispTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispTotalAmount(JAXBElement<String> value) {
        this.dispTotalAmount = value;
    }

    /**
     * Gets the value of the dispTotalMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispTotalMarkup() {
        return dispTotalMarkup;
    }

    /**
     * Sets the value of the dispTotalMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispTotalMarkup(JAXBElement<String> value) {
        this.dispTotalMarkup = value;
    }

}
