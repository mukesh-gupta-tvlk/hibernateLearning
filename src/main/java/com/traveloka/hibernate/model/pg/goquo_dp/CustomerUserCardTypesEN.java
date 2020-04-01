
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerUserCardTypesEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerUserCardTypesEN">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}CardTypesEN">
 *       &lt;sequence>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerUserCardTypeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustomerUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ImageFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCaptureCardDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMarkupPercentage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Markup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MarkupApplicableCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarkupCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="ShowMarkupinBookingPage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SupportedCurrencies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerUserCardTypesEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "currency",
    "customerUserCardTypeID",
    "customerUserID",
    "imageFileName",
    "isCaptureCardDetails",
    "isMarkupPercentage",
    "markup",
    "markupApplicableCurrency",
    "markupCurrency",
    "resultMsg",
    "showMarkupinBookingPage",
    "supportedCurrencies"
})
public class CustomerUserCardTypesEN
    extends CardTypesEN
{

    @XmlElementRef(name = "Currency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency;
    @XmlElement(name = "CustomerUserCardTypeID")
    protected Integer customerUserCardTypeID;
    @XmlElement(name = "CustomerUserID")
    protected Integer customerUserID;
    @XmlElementRef(name = "ImageFileName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imageFileName;
    @XmlElement(name = "IsCaptureCardDetails")
    protected Boolean isCaptureCardDetails;
    @XmlElement(name = "IsMarkupPercentage")
    protected Boolean isMarkupPercentage;
    @XmlElement(name = "Markup")
    protected BigDecimal markup;
    @XmlElementRef(name = "MarkupApplicableCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markupApplicableCurrency;
    @XmlElementRef(name = "MarkupCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markupCurrency;
    @XmlElementRef(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> resultMsg;
    @XmlElement(name = "ShowMarkupinBookingPage")
    protected Boolean showMarkupinBookingPage;
    @XmlElementRef(name = "SupportedCurrencies", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supportedCurrencies;

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
     * Gets the value of the customerUserCardTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerUserCardTypeID() {
        return customerUserCardTypeID;
    }

    /**
     * Sets the value of the customerUserCardTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerUserCardTypeID(Integer value) {
        this.customerUserCardTypeID = value;
    }

    /**
     * Gets the value of the customerUserID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerUserID() {
        return customerUserID;
    }

    /**
     * Sets the value of the customerUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerUserID(Integer value) {
        this.customerUserID = value;
    }

    /**
     * Gets the value of the imageFileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImageFileName() {
        return imageFileName;
    }

    /**
     * Sets the value of the imageFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImageFileName(JAXBElement<String> value) {
        this.imageFileName = value;
    }

    /**
     * Gets the value of the isCaptureCardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCaptureCardDetails() {
        return isCaptureCardDetails;
    }

    /**
     * Sets the value of the isCaptureCardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCaptureCardDetails(Boolean value) {
        this.isCaptureCardDetails = value;
    }

    /**
     * Gets the value of the isMarkupPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMarkupPercentage() {
        return isMarkupPercentage;
    }

    /**
     * Sets the value of the isMarkupPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMarkupPercentage(Boolean value) {
        this.isMarkupPercentage = value;
    }

    /**
     * Gets the value of the markup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarkup() {
        return markup;
    }

    /**
     * Sets the value of the markup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarkup(BigDecimal value) {
        this.markup = value;
    }

    /**
     * Gets the value of the markupApplicableCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarkupApplicableCurrency() {
        return markupApplicableCurrency;
    }

    /**
     * Sets the value of the markupApplicableCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarkupApplicableCurrency(JAXBElement<String> value) {
        this.markupApplicableCurrency = value;
    }

    /**
     * Gets the value of the markupCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarkupCurrency() {
        return markupCurrency;
    }

    /**
     * Sets the value of the markupCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarkupCurrency(JAXBElement<String> value) {
        this.markupCurrency = value;
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
     * Gets the value of the showMarkupinBookingPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowMarkupinBookingPage() {
        return showMarkupinBookingPage;
    }

    /**
     * Sets the value of the showMarkupinBookingPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowMarkupinBookingPage(Boolean value) {
        this.showMarkupinBookingPage = value;
    }

    /**
     * Gets the value of the supportedCurrencies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupportedCurrencies() {
        return supportedCurrencies;
    }

    /**
     * Sets the value of the supportedCurrencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupportedCurrencies(JAXBElement<String> value) {
        this.supportedCurrencies = value;
    }

}
