
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuranceGSTInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceGSTInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuranceGSTTaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PerTaxGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dispTotalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceGSTInfo", propOrder = {
    "currencyCode",
    "insuranceGSTTaxCode",
    "perTaxGST",
    "taxDescription",
    "totalTaxAmount",
    "dispTotalTaxAmount"
})
public class InsuranceGSTInfo {

    @XmlElementRef(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "InsuranceGSTTaxCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceGSTTaxCode;
    @XmlElement(name = "PerTaxGST")
    protected BigDecimal perTaxGST;
    @XmlElementRef(name = "TaxDescription", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxDescription;
    @XmlElement(name = "TotalTaxAmount")
    protected BigDecimal totalTaxAmount;
    @XmlElementRef(name = "dispTotalTaxAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispTotalTaxAmount;

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the insuranceGSTTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceGSTTaxCode() {
        return insuranceGSTTaxCode;
    }

    /**
     * Sets the value of the insuranceGSTTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceGSTTaxCode(JAXBElement<String> value) {
        this.insuranceGSTTaxCode = value;
    }

    /**
     * Gets the value of the perTaxGST property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerTaxGST() {
        return perTaxGST;
    }

    /**
     * Sets the value of the perTaxGST property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerTaxGST(BigDecimal value) {
        this.perTaxGST = value;
    }

    /**
     * Gets the value of the taxDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxDescription() {
        return taxDescription;
    }

    /**
     * Sets the value of the taxDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxDescription(JAXBElement<String> value) {
        this.taxDescription = value;
    }

    /**
     * Gets the value of the totalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Sets the value of the totalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTaxAmount(BigDecimal value) {
        this.totalTaxAmount = value;
    }

    /**
     * Gets the value of the dispTotalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispTotalTaxAmount() {
        return dispTotalTaxAmount;
    }

    /**
     * Sets the value of the dispTotalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispTotalTaxAmount(JAXBElement<String> value) {
        this.dispTotalTaxAmount = value;
    }

}
