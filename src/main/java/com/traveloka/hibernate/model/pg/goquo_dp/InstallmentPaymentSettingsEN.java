
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstallmentPaymentSettingsEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstallmentPaymentSettingsEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CUPaymentMethodId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustomerPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DisplayText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InterestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MinPurchaseAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Months" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallmentPaymentSettingsEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "cuPaymentMethodId",
    "customerPercentage",
    "displayText",
    "id",
    "interestType",
    "merchantPercentage",
    "minPurchaseAmt",
    "months",
    "resultMsg",
    "status"
})
public class InstallmentPaymentSettingsEN {

    @XmlElement(name = "CUPaymentMethodId")
    protected Integer cuPaymentMethodId;
    @XmlElement(name = "CustomerPercentage")
    protected BigDecimal customerPercentage;
    @XmlElementRef(name = "DisplayText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayText;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "InterestType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interestType;
    @XmlElement(name = "MerchantPercentage")
    protected BigDecimal merchantPercentage;
    @XmlElementRef(name = "MinPurchaseAmt", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minPurchaseAmt;
    @XmlElement(name = "Months")
    protected Integer months;
    @XmlElementRef(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> resultMsg;
    @XmlElement(name = "Status")
    protected Integer status;

    /**
     * Gets the value of the cuPaymentMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCUPaymentMethodId() {
        return cuPaymentMethodId;
    }

    /**
     * Sets the value of the cuPaymentMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCUPaymentMethodId(Integer value) {
        this.cuPaymentMethodId = value;
    }

    /**
     * Gets the value of the customerPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomerPercentage() {
        return customerPercentage;
    }

    /**
     * Sets the value of the customerPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomerPercentage(BigDecimal value) {
        this.customerPercentage = value;
    }

    /**
     * Gets the value of the displayText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayText() {
        return displayText;
    }

    /**
     * Sets the value of the displayText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayText(JAXBElement<String> value) {
        this.displayText = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the interestType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterestType() {
        return interestType;
    }

    /**
     * Sets the value of the interestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterestType(JAXBElement<String> value) {
        this.interestType = value;
    }

    /**
     * Gets the value of the merchantPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMerchantPercentage() {
        return merchantPercentage;
    }

    /**
     * Sets the value of the merchantPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMerchantPercentage(BigDecimal value) {
        this.merchantPercentage = value;
    }

    /**
     * Gets the value of the minPurchaseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinPurchaseAmt() {
        return minPurchaseAmt;
    }

    /**
     * Sets the value of the minPurchaseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinPurchaseAmt(JAXBElement<String> value) {
        this.minPurchaseAmt = value;
    }

    /**
     * Gets the value of the months property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonths() {
        return months;
    }

    /**
     * Sets the value of the months property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonths(Integer value) {
        this.months = value;
    }

    /**
     * Gets the value of the resultMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public JAXBElement<Result> getResultMsg() {
        return resultMsg;
    }

    /**
     * Sets the value of the resultMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public void setResultMsg(JAXBElement<Result> value) {
        this.resultMsg = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

}
