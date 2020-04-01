
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerUserPaymentMethodsEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerUserPaymentMethodsEN">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}PaymentMethodsEN">
 *       &lt;sequence>
 *         &lt;element name="ApplicableCardTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicableTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreditCardChargeAsDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditCardList" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfCustomerUserCardTypesEN" minOccurs="0"/>
 *         &lt;element name="CustomerUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustomerUserPaymentMethodID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DepositAmountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DisplayPaymentMethodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayTextinPricing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupPaymentCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GroupPaymentDueID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ImageFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsPaymentSettings" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfInstallmentPaymentSettingsEN" minOccurs="0"/>
 *         &lt;element name="InstTextInThanksPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstructionsInEnglish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsB2BCreditPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCaptureCardDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMarkupPercentage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPaymentCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSimulationPaymentMethod" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTopupEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LangCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LangText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Markup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MarkupApplicableCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarkupCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ParentPaymentMethodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SellingCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportedCurrencies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalSellingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerUserPaymentMethodsEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "applicableCardTypes",
    "applicableTo",
    "bookingStatus",
    "creditCardChargeAsDiscount",
    "creditCardList",
    "customerUserID",
    "customerUserPaymentMethodID",
    "depositAmountPercent",
    "displayPaymentMethodName",
    "displayTextinPricing",
    "groupPaymentCharges",
    "groupPaymentDueID",
    "imageFileName",
    "insPaymentSettings",
    "instTextInThanksPage",
    "instructionsInEnglish",
    "isB2BCreditPayment",
    "isCaptureCardDetails",
    "isMarkupPercentage",
    "isPaymentCurrency",
    "isSimulationPaymentMethod",
    "isTopupEnabled",
    "langCode",
    "langText",
    "markup",
    "markupApplicableCurrency",
    "markupCurrency",
    "parentID",
    "parentPaymentMethodName",
    "paymentCurrency",
    "paymentOrder",
    "sellingCurrency",
    "supportedCurrencies",
    "totalSellingPrice"
})
public class CustomerUserPaymentMethodsEN
    extends PaymentMethodsEN
{

    @XmlElementRef(name = "ApplicableCardTypes", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicableCardTypes;
    @XmlElementRef(name = "ApplicableTo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicableTo;
    @XmlElement(name = "BookingStatus")
    protected Integer bookingStatus;
    @XmlElement(name = "CreditCardChargeAsDiscount")
    protected BigDecimal creditCardChargeAsDiscount;
    @XmlElementRef(name = "CreditCardList", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCustomerUserCardTypesEN> creditCardList;
    @XmlElement(name = "CustomerUserID")
    protected Integer customerUserID;
    @XmlElement(name = "CustomerUserPaymentMethodID")
    protected Integer customerUserPaymentMethodID;
    @XmlElement(name = "DepositAmountPercent")
    protected BigDecimal depositAmountPercent;
    @XmlElementRef(name = "DisplayPaymentMethodName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayPaymentMethodName;
    @XmlElementRef(name = "DisplayTextinPricing", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayTextinPricing;
    @XmlElement(name = "GroupPaymentCharges")
    protected BigDecimal groupPaymentCharges;
    @XmlElement(name = "GroupPaymentDueID")
    protected Integer groupPaymentDueID;
    @XmlElementRef(name = "ImageFileName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imageFileName;
    @XmlElementRef(name = "InsPaymentSettings", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInstallmentPaymentSettingsEN> insPaymentSettings;
    @XmlElementRef(name = "InstTextInThanksPage", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instTextInThanksPage;
    @XmlElementRef(name = "InstructionsInEnglish", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instructionsInEnglish;
    @XmlElement(name = "IsB2BCreditPayment")
    protected Boolean isB2BCreditPayment;
    @XmlElement(name = "IsCaptureCardDetails")
    protected Boolean isCaptureCardDetails;
    @XmlElement(name = "IsMarkupPercentage")
    protected Boolean isMarkupPercentage;
    @XmlElement(name = "IsPaymentCurrency")
    protected Boolean isPaymentCurrency;
    @XmlElement(name = "IsSimulationPaymentMethod")
    protected Boolean isSimulationPaymentMethod;
    @XmlElement(name = "IsTopupEnabled")
    protected Boolean isTopupEnabled;
    @XmlElementRef(name = "LangCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> langCode;
    @XmlElementRef(name = "LangText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> langText;
    @XmlElement(name = "Markup")
    protected BigDecimal markup;
    @XmlElementRef(name = "MarkupApplicableCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markupApplicableCurrency;
    @XmlElementRef(name = "MarkupCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> markupCurrency;
    @XmlElement(name = "ParentID")
    protected Integer parentID;
    @XmlElementRef(name = "ParentPaymentMethodName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentPaymentMethodName;
    @XmlElementRef(name = "PaymentCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentCurrency;
    @XmlElement(name = "PaymentOrder")
    protected Integer paymentOrder;
    @XmlElementRef(name = "SellingCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sellingCurrency;
    @XmlElementRef(name = "SupportedCurrencies", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supportedCurrencies;
    @XmlElement(name = "TotalSellingPrice")
    protected BigDecimal totalSellingPrice;

    /**
     * Gets the value of the applicableCardTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicableCardTypes() {
        return applicableCardTypes;
    }

    /**
     * Sets the value of the applicableCardTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicableCardTypes(JAXBElement<String> value) {
        this.applicableCardTypes = value;
    }

    /**
     * Gets the value of the applicableTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicableTo() {
        return applicableTo;
    }

    /**
     * Sets the value of the applicableTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicableTo(JAXBElement<String> value) {
        this.applicableTo = value;
    }

    /**
     * Gets the value of the bookingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBookingStatus() {
        return bookingStatus;
    }

    /**
     * Sets the value of the bookingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBookingStatus(Integer value) {
        this.bookingStatus = value;
    }

    /**
     * Gets the value of the creditCardChargeAsDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditCardChargeAsDiscount() {
        return creditCardChargeAsDiscount;
    }

    /**
     * Sets the value of the creditCardChargeAsDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditCardChargeAsDiscount(BigDecimal value) {
        this.creditCardChargeAsDiscount = value;
    }

    /**
     * Gets the value of the creditCardList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomerUserCardTypesEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCustomerUserCardTypesEN> getCreditCardList() {
        return creditCardList;
    }

    /**
     * Sets the value of the creditCardList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCustomerUserCardTypesEN }{@code >}
     *     
     */
    public void setCreditCardList(JAXBElement<ArrayOfCustomerUserCardTypesEN> value) {
        this.creditCardList = value;
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
     * Gets the value of the customerUserPaymentMethodID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerUserPaymentMethodID() {
        return customerUserPaymentMethodID;
    }

    /**
     * Sets the value of the customerUserPaymentMethodID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerUserPaymentMethodID(Integer value) {
        this.customerUserPaymentMethodID = value;
    }

    /**
     * Gets the value of the depositAmountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepositAmountPercent() {
        return depositAmountPercent;
    }

    /**
     * Sets the value of the depositAmountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepositAmountPercent(BigDecimal value) {
        this.depositAmountPercent = value;
    }

    /**
     * Gets the value of the displayPaymentMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayPaymentMethodName() {
        return displayPaymentMethodName;
    }

    /**
     * Sets the value of the displayPaymentMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayPaymentMethodName(JAXBElement<String> value) {
        this.displayPaymentMethodName = value;
    }

    /**
     * Gets the value of the displayTextinPricing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayTextinPricing() {
        return displayTextinPricing;
    }

    /**
     * Sets the value of the displayTextinPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayTextinPricing(JAXBElement<String> value) {
        this.displayTextinPricing = value;
    }

    /**
     * Gets the value of the groupPaymentCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGroupPaymentCharges() {
        return groupPaymentCharges;
    }

    /**
     * Sets the value of the groupPaymentCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGroupPaymentCharges(BigDecimal value) {
        this.groupPaymentCharges = value;
    }

    /**
     * Gets the value of the groupPaymentDueID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupPaymentDueID() {
        return groupPaymentDueID;
    }

    /**
     * Sets the value of the groupPaymentDueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupPaymentDueID(Integer value) {
        this.groupPaymentDueID = value;
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
     * Gets the value of the insPaymentSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInstallmentPaymentSettingsEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInstallmentPaymentSettingsEN> getInsPaymentSettings() {
        return insPaymentSettings;
    }

    /**
     * Sets the value of the insPaymentSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInstallmentPaymentSettingsEN }{@code >}
     *     
     */
    public void setInsPaymentSettings(JAXBElement<ArrayOfInstallmentPaymentSettingsEN> value) {
        this.insPaymentSettings = value;
    }

    /**
     * Gets the value of the instTextInThanksPage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstTextInThanksPage() {
        return instTextInThanksPage;
    }

    /**
     * Sets the value of the instTextInThanksPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstTextInThanksPage(JAXBElement<String> value) {
        this.instTextInThanksPage = value;
    }

    /**
     * Gets the value of the instructionsInEnglish property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstructionsInEnglish() {
        return instructionsInEnglish;
    }

    /**
     * Sets the value of the instructionsInEnglish property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstructionsInEnglish(JAXBElement<String> value) {
        this.instructionsInEnglish = value;
    }

    /**
     * Gets the value of the isB2BCreditPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsB2BCreditPayment() {
        return isB2BCreditPayment;
    }

    /**
     * Sets the value of the isB2BCreditPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsB2BCreditPayment(Boolean value) {
        this.isB2BCreditPayment = value;
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
     * Gets the value of the isPaymentCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPaymentCurrency() {
        return isPaymentCurrency;
    }

    /**
     * Sets the value of the isPaymentCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPaymentCurrency(Boolean value) {
        this.isPaymentCurrency = value;
    }

    /**
     * Gets the value of the isSimulationPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSimulationPaymentMethod() {
        return isSimulationPaymentMethod;
    }

    /**
     * Sets the value of the isSimulationPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSimulationPaymentMethod(Boolean value) {
        this.isSimulationPaymentMethod = value;
    }

    /**
     * Gets the value of the isTopupEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTopupEnabled() {
        return isTopupEnabled;
    }

    /**
     * Sets the value of the isTopupEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTopupEnabled(Boolean value) {
        this.isTopupEnabled = value;
    }

    /**
     * Gets the value of the langCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLangCode() {
        return langCode;
    }

    /**
     * Sets the value of the langCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLangCode(JAXBElement<String> value) {
        this.langCode = value;
    }

    /**
     * Gets the value of the langText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLangText() {
        return langText;
    }

    /**
     * Sets the value of the langText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLangText(JAXBElement<String> value) {
        this.langText = value;
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
     * Gets the value of the parentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentID() {
        return parentID;
    }

    /**
     * Sets the value of the parentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentID(Integer value) {
        this.parentID = value;
    }

    /**
     * Gets the value of the parentPaymentMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentPaymentMethodName() {
        return parentPaymentMethodName;
    }

    /**
     * Sets the value of the parentPaymentMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentPaymentMethodName(JAXBElement<String> value) {
        this.parentPaymentMethodName = value;
    }

    /**
     * Gets the value of the paymentCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentCurrency() {
        return paymentCurrency;
    }

    /**
     * Sets the value of the paymentCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentCurrency(JAXBElement<String> value) {
        this.paymentCurrency = value;
    }

    /**
     * Gets the value of the paymentOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentOrder() {
        return paymentOrder;
    }

    /**
     * Sets the value of the paymentOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentOrder(Integer value) {
        this.paymentOrder = value;
    }

    /**
     * Gets the value of the sellingCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSellingCurrency() {
        return sellingCurrency;
    }

    /**
     * Sets the value of the sellingCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSellingCurrency(JAXBElement<String> value) {
        this.sellingCurrency = value;
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

    /**
     * Gets the value of the totalSellingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSellingPrice() {
        return totalSellingPrice;
    }

    /**
     * Sets the value of the totalSellingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSellingPrice(BigDecimal value) {
        this.totalSellingPrice = value;
    }

}
