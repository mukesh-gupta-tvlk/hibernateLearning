
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerPaxPriceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerPaxPriceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GstTaxPerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerPaxTaxBreakDown" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfTaxBreakDownInfo" minOccurs="0"/>
 *         &lt;element name="PricePerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PromotionPerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SpecialFareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialTypePaxCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TaxPerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dispGstTaxPerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dispMLTotalPricePerPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispPricePerPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispPromotionPerPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispTaxPerPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispTotalPricePerPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerPaxPriceInfo", propOrder = {
    "gstTaxPerPax",
    "perPaxTaxBreakDown",
    "pricePerPax",
    "promotionPerPax",
    "specialFareType",
    "specialTypePaxCount",
    "taxPerPax",
    "dispGstTaxPerPax",
    "dispMLTotalPricePerPax",
    "dispPricePerPax",
    "dispPromotionPerPax",
    "dispTaxPerPax",
    "dispTotalPricePerPax"
})
public class PerPaxPriceInfo {

    @XmlElement(name = "GstTaxPerPax")
    protected BigDecimal gstTaxPerPax;
    @XmlElementRef(name = "PerPaxTaxBreakDown", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaxBreakDownInfo> perPaxTaxBreakDown;
    @XmlElement(name = "PricePerPax")
    protected BigDecimal pricePerPax;
    @XmlElement(name = "PromotionPerPax")
    protected BigDecimal promotionPerPax;
    @XmlElementRef(name = "SpecialFareType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialFareType;
    @XmlElement(name = "SpecialTypePaxCount")
    protected Integer specialTypePaxCount;
    @XmlElement(name = "TaxPerPax")
    protected BigDecimal taxPerPax;
    protected BigDecimal dispGstTaxPerPax;
    @XmlElementRef(name = "dispMLTotalPricePerPax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispMLTotalPricePerPax;
    @XmlElementRef(name = "dispPricePerPax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispPricePerPax;
    @XmlElementRef(name = "dispPromotionPerPax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispPromotionPerPax;
    @XmlElementRef(name = "dispTaxPerPax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispTaxPerPax;
    @XmlElementRef(name = "dispTotalPricePerPax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispTotalPricePerPax;

    /**
     * Gets the value of the gstTaxPerPax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGstTaxPerPax() {
        return gstTaxPerPax;
    }

    /**
     * Sets the value of the gstTaxPerPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGstTaxPerPax(BigDecimal value) {
        this.gstTaxPerPax = value;
    }

    /**
     * Gets the value of the perPaxTaxBreakDown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaxBreakDownInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTaxBreakDownInfo> getPerPaxTaxBreakDown() {
        return perPaxTaxBreakDown;
    }

    /**
     * Sets the value of the perPaxTaxBreakDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaxBreakDownInfo }{@code >}
     *     
     */
    public void setPerPaxTaxBreakDown(JAXBElement<ArrayOfTaxBreakDownInfo> value) {
        this.perPaxTaxBreakDown = value;
    }

    /**
     * Gets the value of the pricePerPax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricePerPax() {
        return pricePerPax;
    }

    /**
     * Sets the value of the pricePerPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricePerPax(BigDecimal value) {
        this.pricePerPax = value;
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
     * Gets the value of the taxPerPax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxPerPax() {
        return taxPerPax;
    }

    /**
     * Sets the value of the taxPerPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxPerPax(BigDecimal value) {
        this.taxPerPax = value;
    }

    /**
     * Gets the value of the dispGstTaxPerPax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDispGstTaxPerPax() {
        return dispGstTaxPerPax;
    }

    /**
     * Sets the value of the dispGstTaxPerPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDispGstTaxPerPax(BigDecimal value) {
        this.dispGstTaxPerPax = value;
    }

    /**
     * Gets the value of the dispMLTotalPricePerPax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispMLTotalPricePerPax() {
        return dispMLTotalPricePerPax;
    }

    /**
     * Sets the value of the dispMLTotalPricePerPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispMLTotalPricePerPax(JAXBElement<String> value) {
        this.dispMLTotalPricePerPax = value;
    }

    /**
     * Gets the value of the dispPricePerPax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispPricePerPax() {
        return dispPricePerPax;
    }

    /**
     * Sets the value of the dispPricePerPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispPricePerPax(JAXBElement<String> value) {
        this.dispPricePerPax = value;
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

    /**
     * Gets the value of the dispTaxPerPax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispTaxPerPax() {
        return dispTaxPerPax;
    }

    /**
     * Sets the value of the dispTaxPerPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispTaxPerPax(JAXBElement<String> value) {
        this.dispTaxPerPax = value;
    }

    /**
     * Gets the value of the dispTotalPricePerPax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispTotalPricePerPax() {
        return dispTotalPricePerPax;
    }

    /**
     * Sets the value of the dispTotalPricePerPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispTotalPricePerPax(JAXBElement<String> value) {
        this.dispTotalPricePerPax = value;
    }

}
