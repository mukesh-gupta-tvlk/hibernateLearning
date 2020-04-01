
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentPaxPriceEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentPaxPriceEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdultFareTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AdultTaxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChildFareTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChildTaxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DisabledFareTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DisabledTaxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GovtFareTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GovtTaxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InfantFareTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InfantTaxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SNRCitizenFareTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SNRCitizenTaxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StudentFareTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StudentTaxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WHTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WomenFareTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WomenTaxTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentPaxPriceEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "adultFareTotal",
    "adultTaxTotal",
    "childFareTotal",
    "childTaxTotal",
    "disabledFareTotal",
    "disabledTaxTotal",
    "discountAmount",
    "govtFareTotal",
    "govtTaxTotal",
    "infantFareTotal",
    "infantTaxTotal",
    "snrCitizenFareTotal",
    "snrCitizenTaxTotal",
    "studentFareTotal",
    "studentTaxTotal",
    "vatTax",
    "whTax",
    "womenFareTotal",
    "womenTaxTotal"
})
@XmlSeeAlso({
    FlightReservationSegmentsEN.class
})
public class SegmentPaxPriceEN {

    @XmlElement(name = "AdultFareTotal")
    protected BigDecimal adultFareTotal;
    @XmlElement(name = "AdultTaxTotal")
    protected BigDecimal adultTaxTotal;
    @XmlElement(name = "ChildFareTotal")
    protected BigDecimal childFareTotal;
    @XmlElement(name = "ChildTaxTotal")
    protected BigDecimal childTaxTotal;
    @XmlElement(name = "DisabledFareTotal")
    protected BigDecimal disabledFareTotal;
    @XmlElement(name = "DisabledTaxTotal")
    protected BigDecimal disabledTaxTotal;
    @XmlElement(name = "DiscountAmount")
    protected BigDecimal discountAmount;
    @XmlElement(name = "GovtFareTotal")
    protected BigDecimal govtFareTotal;
    @XmlElement(name = "GovtTaxTotal")
    protected BigDecimal govtTaxTotal;
    @XmlElement(name = "InfantFareTotal")
    protected BigDecimal infantFareTotal;
    @XmlElement(name = "InfantTaxTotal")
    protected BigDecimal infantTaxTotal;
    @XmlElement(name = "SNRCitizenFareTotal")
    protected BigDecimal snrCitizenFareTotal;
    @XmlElement(name = "SNRCitizenTaxTotal")
    protected BigDecimal snrCitizenTaxTotal;
    @XmlElement(name = "StudentFareTotal")
    protected BigDecimal studentFareTotal;
    @XmlElement(name = "StudentTaxTotal")
    protected BigDecimal studentTaxTotal;
    @XmlElement(name = "VATTax")
    protected BigDecimal vatTax;
    @XmlElement(name = "WHTax")
    protected BigDecimal whTax;
    @XmlElement(name = "WomenFareTotal")
    protected BigDecimal womenFareTotal;
    @XmlElement(name = "WomenTaxTotal")
    protected BigDecimal womenTaxTotal;

    /**
     * Gets the value of the adultFareTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdultFareTotal() {
        return adultFareTotal;
    }

    /**
     * Sets the value of the adultFareTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdultFareTotal(BigDecimal value) {
        this.adultFareTotal = value;
    }

    /**
     * Gets the value of the adultTaxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdultTaxTotal() {
        return adultTaxTotal;
    }

    /**
     * Sets the value of the adultTaxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdultTaxTotal(BigDecimal value) {
        this.adultTaxTotal = value;
    }

    /**
     * Gets the value of the childFareTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChildFareTotal() {
        return childFareTotal;
    }

    /**
     * Sets the value of the childFareTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChildFareTotal(BigDecimal value) {
        this.childFareTotal = value;
    }

    /**
     * Gets the value of the childTaxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChildTaxTotal() {
        return childTaxTotal;
    }

    /**
     * Sets the value of the childTaxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChildTaxTotal(BigDecimal value) {
        this.childTaxTotal = value;
    }

    /**
     * Gets the value of the disabledFareTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisabledFareTotal() {
        return disabledFareTotal;
    }

    /**
     * Sets the value of the disabledFareTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisabledFareTotal(BigDecimal value) {
        this.disabledFareTotal = value;
    }

    /**
     * Gets the value of the disabledTaxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisabledTaxTotal() {
        return disabledTaxTotal;
    }

    /**
     * Sets the value of the disabledTaxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisabledTaxTotal(BigDecimal value) {
        this.disabledTaxTotal = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmount(BigDecimal value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the govtFareTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGovtFareTotal() {
        return govtFareTotal;
    }

    /**
     * Sets the value of the govtFareTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGovtFareTotal(BigDecimal value) {
        this.govtFareTotal = value;
    }

    /**
     * Gets the value of the govtTaxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGovtTaxTotal() {
        return govtTaxTotal;
    }

    /**
     * Sets the value of the govtTaxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGovtTaxTotal(BigDecimal value) {
        this.govtTaxTotal = value;
    }

    /**
     * Gets the value of the infantFareTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInfantFareTotal() {
        return infantFareTotal;
    }

    /**
     * Sets the value of the infantFareTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInfantFareTotal(BigDecimal value) {
        this.infantFareTotal = value;
    }

    /**
     * Gets the value of the infantTaxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInfantTaxTotal() {
        return infantTaxTotal;
    }

    /**
     * Sets the value of the infantTaxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInfantTaxTotal(BigDecimal value) {
        this.infantTaxTotal = value;
    }

    /**
     * Gets the value of the snrCitizenFareTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSNRCitizenFareTotal() {
        return snrCitizenFareTotal;
    }

    /**
     * Sets the value of the snrCitizenFareTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSNRCitizenFareTotal(BigDecimal value) {
        this.snrCitizenFareTotal = value;
    }

    /**
     * Gets the value of the snrCitizenTaxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSNRCitizenTaxTotal() {
        return snrCitizenTaxTotal;
    }

    /**
     * Sets the value of the snrCitizenTaxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSNRCitizenTaxTotal(BigDecimal value) {
        this.snrCitizenTaxTotal = value;
    }

    /**
     * Gets the value of the studentFareTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStudentFareTotal() {
        return studentFareTotal;
    }

    /**
     * Sets the value of the studentFareTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStudentFareTotal(BigDecimal value) {
        this.studentFareTotal = value;
    }

    /**
     * Gets the value of the studentTaxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStudentTaxTotal() {
        return studentTaxTotal;
    }

    /**
     * Sets the value of the studentTaxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStudentTaxTotal(BigDecimal value) {
        this.studentTaxTotal = value;
    }

    /**
     * Gets the value of the vatTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATTax() {
        return vatTax;
    }

    /**
     * Sets the value of the vatTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVATTax(BigDecimal value) {
        this.vatTax = value;
    }

    /**
     * Gets the value of the whTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWHTax() {
        return whTax;
    }

    /**
     * Sets the value of the whTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWHTax(BigDecimal value) {
        this.whTax = value;
    }

    /**
     * Gets the value of the womenFareTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWomenFareTotal() {
        return womenFareTotal;
    }

    /**
     * Sets the value of the womenFareTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWomenFareTotal(BigDecimal value) {
        this.womenFareTotal = value;
    }

    /**
     * Gets the value of the womenTaxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWomenTaxTotal() {
        return womenTaxTotal;
    }

    /**
     * Sets the value of the womenTaxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWomenTaxTotal(BigDecimal value) {
        this.womenTaxTotal = value;
    }

}
