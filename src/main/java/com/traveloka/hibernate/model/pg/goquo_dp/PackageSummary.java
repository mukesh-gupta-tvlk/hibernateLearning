
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdultCCDiscountPerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AdultCCTotalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChildCCDiscountPerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChildCCTotalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyConversionStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispCurrencySymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispNetAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispRedeemAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispRedeemInUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispTaxnFees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispTotalRedeem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InfantCCDiscountPerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InfantCCTotalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IsDiscountRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDiscountTotalRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsInsuranceTotalRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsLoyalty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMilesRedeem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsNetAmtRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsNonCollectAmt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPaymentCurrencyApplied" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPaymentDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowPromo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTotalRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsValidLoyalty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NetAmountInPaymentCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PaymentCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentCurrencyDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentCurrencyDispTaxnFees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentCurrencyDispTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentCurrencyTaxnFees" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PaymentCurrencyTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerAdultPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerAdultRedeem" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerChildPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerChildRedeem" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerInfantPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerInfantRedeem" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PromoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromoStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RedeemInUse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoudedAdjustmentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SGDInsurancePackageSummary" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfSGDInsurancePackageSummary" minOccurs="0"/>
 *         &lt;element name="SMSSettingsInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}SMSSettingsEN" minOccurs="0"/>
 *         &lt;element name="SPSummary" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfSpecialPriceSummary" minOccurs="0"/>
 *         &lt;element name="SourceCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SummaryErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SummaryErrorMsgText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SummaryType" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils}PackageSummaryType" minOccurs="0"/>
 *         &lt;element name="TargetCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxnFees" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalRedeem" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageSummary", propOrder = {
    "adultCCDiscountPerPax",
    "adultCCTotalDiscount",
    "amount",
    "childCCDiscountPerPax",
    "childCCTotalDiscount",
    "currencyCode",
    "currencyConversionStatus",
    "description",
    "dispAmount",
    "dispCurrencySymbol",
    "dispNetAmount",
    "dispRedeemAmount",
    "dispRedeemInUse",
    "dispTaxnFees",
    "dispTotal",
    "dispTotalRedeem",
    "exchangeRate",
    "infantCCDiscountPerPax",
    "infantCCTotalDiscount",
    "isDiscountRecord",
    "isDiscountTotalRecord",
    "isInsuranceTotalRecord",
    "isLoyalty",
    "isMilesRedeem",
    "isNetAmtRecord",
    "isNonCollectAmt",
    "isPaymentCurrencyApplied",
    "isPaymentDiscount",
    "isShowPromo",
    "isTotalRecord",
    "isValidLoyalty",
    "netAmount",
    "netAmountInPaymentCurrency",
    "paymentCurrency",
    "paymentCurrencyDesc",
    "paymentCurrencyDispTaxnFees",
    "paymentCurrencyDispTotal",
    "paymentCurrencyTaxnFees",
    "paymentCurrencyTotal",
    "perAdultPrice",
    "perAdultRedeem",
    "perChildPrice",
    "perChildRedeem",
    "perInfantPrice",
    "perInfantRedeem",
    "promoID",
    "promoStatus",
    "redeemInUse",
    "remarks",
    "roudedAdjustmentAmount",
    "sgdInsurancePackageSummary",
    "smsSettingsInfo",
    "spSummary",
    "sourceCurrency",
    "summaryErrorMsg",
    "summaryErrorMsgText",
    "summaryType",
    "targetCurrency",
    "taxCode",
    "taxnFees",
    "total",
    "totalRedeem"
})
public class PackageSummary {

    @XmlElement(name = "AdultCCDiscountPerPax")
    protected BigDecimal adultCCDiscountPerPax;
    @XmlElement(name = "AdultCCTotalDiscount")
    protected BigDecimal adultCCTotalDiscount;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "ChildCCDiscountPerPax")
    protected BigDecimal childCCDiscountPerPax;
    @XmlElement(name = "ChildCCTotalDiscount")
    protected BigDecimal childCCTotalDiscount;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElement(name = "CurrencyConversionStatus")
    protected Integer currencyConversionStatus;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DispAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispAmount;
    @XmlElementRef(name = "DispCurrencySymbol", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispCurrencySymbol;
    @XmlElementRef(name = "DispNetAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispNetAmount;
    @XmlElementRef(name = "DispRedeemAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispRedeemAmount;
    @XmlElementRef(name = "DispRedeemInUse", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispRedeemInUse;
    @XmlElementRef(name = "DispTaxnFees", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispTaxnFees;
    @XmlElementRef(name = "DispTotal", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispTotal;
    @XmlElementRef(name = "DispTotalRedeem", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispTotalRedeem;
    @XmlElement(name = "ExchangeRate")
    protected BigDecimal exchangeRate;
    @XmlElement(name = "InfantCCDiscountPerPax")
    protected BigDecimal infantCCDiscountPerPax;
    @XmlElement(name = "InfantCCTotalDiscount")
    protected BigDecimal infantCCTotalDiscount;
    @XmlElement(name = "IsDiscountRecord")
    protected Boolean isDiscountRecord;
    @XmlElement(name = "IsDiscountTotalRecord")
    protected Boolean isDiscountTotalRecord;
    @XmlElement(name = "IsInsuranceTotalRecord")
    protected Boolean isInsuranceTotalRecord;
    @XmlElement(name = "IsLoyalty")
    protected Boolean isLoyalty;
    @XmlElement(name = "IsMilesRedeem")
    protected Boolean isMilesRedeem;
    @XmlElement(name = "IsNetAmtRecord")
    protected Boolean isNetAmtRecord;
    @XmlElement(name = "IsNonCollectAmt")
    protected Boolean isNonCollectAmt;
    @XmlElement(name = "IsPaymentCurrencyApplied")
    protected Boolean isPaymentCurrencyApplied;
    @XmlElement(name = "IsPaymentDiscount")
    protected Boolean isPaymentDiscount;
    @XmlElement(name = "IsShowPromo")
    protected Boolean isShowPromo;
    @XmlElement(name = "IsTotalRecord")
    protected Boolean isTotalRecord;
    @XmlElement(name = "IsValidLoyalty")
    protected Boolean isValidLoyalty;
    @XmlElement(name = "NetAmount")
    protected BigDecimal netAmount;
    @XmlElement(name = "NetAmountInPaymentCurrency")
    protected BigDecimal netAmountInPaymentCurrency;
    @XmlElementRef(name = "PaymentCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentCurrency;
    @XmlElementRef(name = "PaymentCurrencyDesc", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentCurrencyDesc;
    @XmlElementRef(name = "PaymentCurrencyDispTaxnFees", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentCurrencyDispTaxnFees;
    @XmlElementRef(name = "PaymentCurrencyDispTotal", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentCurrencyDispTotal;
    @XmlElement(name = "PaymentCurrencyTaxnFees")
    protected BigDecimal paymentCurrencyTaxnFees;
    @XmlElement(name = "PaymentCurrencyTotal")
    protected BigDecimal paymentCurrencyTotal;
    @XmlElement(name = "PerAdultPrice")
    protected BigDecimal perAdultPrice;
    @XmlElement(name = "PerAdultRedeem")
    protected BigDecimal perAdultRedeem;
    @XmlElement(name = "PerChildPrice")
    protected BigDecimal perChildPrice;
    @XmlElement(name = "PerChildRedeem")
    protected BigDecimal perChildRedeem;
    @XmlElement(name = "PerInfantPrice")
    protected BigDecimal perInfantPrice;
    @XmlElement(name = "PerInfantRedeem")
    protected BigDecimal perInfantRedeem;
    @XmlElementRef(name = "PromoID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promoID;
    @XmlElementRef(name = "PromoStatus", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promoStatus;
    @XmlElement(name = "RedeemInUse")
    protected BigDecimal redeemInUse;
    @XmlElementRef(name = "Remarks", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remarks;
    @XmlElement(name = "RoudedAdjustmentAmount")
    protected BigDecimal roudedAdjustmentAmount;
    @XmlElementRef(name = "SGDInsurancePackageSummary", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSGDInsurancePackageSummary> sgdInsurancePackageSummary;
    @XmlElementRef(name = "SMSSettingsInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<SMSSettingsEN> smsSettingsInfo;
    @XmlElementRef(name = "SPSummary", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSpecialPriceSummary> spSummary;
    @XmlElementRef(name = "SourceCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceCurrency;
    @XmlElementRef(name = "SummaryErrorMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> summaryErrorMsg;
    @XmlElementRef(name = "SummaryErrorMsgText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> summaryErrorMsgText;
    @XmlElement(name = "SummaryType")
    @XmlSchemaType(name = "string")
    protected PackageSummaryType summaryType;
    @XmlElementRef(name = "TargetCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> targetCurrency;
    @XmlElementRef(name = "TaxCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxCode;
    @XmlElement(name = "TaxnFees")
    protected BigDecimal taxnFees;
    @XmlElement(name = "Total")
    protected BigDecimal total;
    @XmlElement(name = "TotalRedeem")
    protected BigDecimal totalRedeem;

    /**
     * Gets the value of the adultCCDiscountPerPax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdultCCDiscountPerPax() {
        return adultCCDiscountPerPax;
    }

    /**
     * Sets the value of the adultCCDiscountPerPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdultCCDiscountPerPax(BigDecimal value) {
        this.adultCCDiscountPerPax = value;
    }

    /**
     * Gets the value of the adultCCTotalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdultCCTotalDiscount() {
        return adultCCTotalDiscount;
    }

    /**
     * Sets the value of the adultCCTotalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdultCCTotalDiscount(BigDecimal value) {
        this.adultCCTotalDiscount = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the childCCDiscountPerPax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChildCCDiscountPerPax() {
        return childCCDiscountPerPax;
    }

    /**
     * Sets the value of the childCCDiscountPerPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChildCCDiscountPerPax(BigDecimal value) {
        this.childCCDiscountPerPax = value;
    }

    /**
     * Gets the value of the childCCTotalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChildCCTotalDiscount() {
        return childCCTotalDiscount;
    }

    /**
     * Sets the value of the childCCTotalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChildCCTotalDiscount(BigDecimal value) {
        this.childCCTotalDiscount = value;
    }

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
     * Gets the value of the currencyConversionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrencyConversionStatus() {
        return currencyConversionStatus;
    }

    /**
     * Sets the value of the currencyConversionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrencyConversionStatus(Integer value) {
        this.currencyConversionStatus = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the dispAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispAmount() {
        return dispAmount;
    }

    /**
     * Sets the value of the dispAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispAmount(JAXBElement<String> value) {
        this.dispAmount = value;
    }

    /**
     * Gets the value of the dispCurrencySymbol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispCurrencySymbol() {
        return dispCurrencySymbol;
    }

    /**
     * Sets the value of the dispCurrencySymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispCurrencySymbol(JAXBElement<String> value) {
        this.dispCurrencySymbol = value;
    }

    /**
     * Gets the value of the dispNetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispNetAmount() {
        return dispNetAmount;
    }

    /**
     * Sets the value of the dispNetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispNetAmount(JAXBElement<String> value) {
        this.dispNetAmount = value;
    }

    /**
     * Gets the value of the dispRedeemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispRedeemAmount() {
        return dispRedeemAmount;
    }

    /**
     * Sets the value of the dispRedeemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispRedeemAmount(JAXBElement<String> value) {
        this.dispRedeemAmount = value;
    }

    /**
     * Gets the value of the dispRedeemInUse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispRedeemInUse() {
        return dispRedeemInUse;
    }

    /**
     * Sets the value of the dispRedeemInUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispRedeemInUse(JAXBElement<String> value) {
        this.dispRedeemInUse = value;
    }

    /**
     * Gets the value of the dispTaxnFees property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispTaxnFees() {
        return dispTaxnFees;
    }

    /**
     * Sets the value of the dispTaxnFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispTaxnFees(JAXBElement<String> value) {
        this.dispTaxnFees = value;
    }

    /**
     * Gets the value of the dispTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispTotal() {
        return dispTotal;
    }

    /**
     * Sets the value of the dispTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispTotal(JAXBElement<String> value) {
        this.dispTotal = value;
    }

    /**
     * Gets the value of the dispTotalRedeem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispTotalRedeem() {
        return dispTotalRedeem;
    }

    /**
     * Sets the value of the dispTotalRedeem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispTotalRedeem(JAXBElement<String> value) {
        this.dispTotalRedeem = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the infantCCDiscountPerPax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInfantCCDiscountPerPax() {
        return infantCCDiscountPerPax;
    }

    /**
     * Sets the value of the infantCCDiscountPerPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInfantCCDiscountPerPax(BigDecimal value) {
        this.infantCCDiscountPerPax = value;
    }

    /**
     * Gets the value of the infantCCTotalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInfantCCTotalDiscount() {
        return infantCCTotalDiscount;
    }

    /**
     * Sets the value of the infantCCTotalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInfantCCTotalDiscount(BigDecimal value) {
        this.infantCCTotalDiscount = value;
    }

    /**
     * Gets the value of the isDiscountRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDiscountRecord() {
        return isDiscountRecord;
    }

    /**
     * Sets the value of the isDiscountRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDiscountRecord(Boolean value) {
        this.isDiscountRecord = value;
    }

    /**
     * Gets the value of the isDiscountTotalRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDiscountTotalRecord() {
        return isDiscountTotalRecord;
    }

    /**
     * Sets the value of the isDiscountTotalRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDiscountTotalRecord(Boolean value) {
        this.isDiscountTotalRecord = value;
    }

    /**
     * Gets the value of the isInsuranceTotalRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInsuranceTotalRecord() {
        return isInsuranceTotalRecord;
    }

    /**
     * Sets the value of the isInsuranceTotalRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInsuranceTotalRecord(Boolean value) {
        this.isInsuranceTotalRecord = value;
    }

    /**
     * Gets the value of the isLoyalty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLoyalty() {
        return isLoyalty;
    }

    /**
     * Sets the value of the isLoyalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLoyalty(Boolean value) {
        this.isLoyalty = value;
    }

    /**
     * Gets the value of the isMilesRedeem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMilesRedeem() {
        return isMilesRedeem;
    }

    /**
     * Sets the value of the isMilesRedeem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMilesRedeem(Boolean value) {
        this.isMilesRedeem = value;
    }

    /**
     * Gets the value of the isNetAmtRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNetAmtRecord() {
        return isNetAmtRecord;
    }

    /**
     * Sets the value of the isNetAmtRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNetAmtRecord(Boolean value) {
        this.isNetAmtRecord = value;
    }

    /**
     * Gets the value of the isNonCollectAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNonCollectAmt() {
        return isNonCollectAmt;
    }

    /**
     * Sets the value of the isNonCollectAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNonCollectAmt(Boolean value) {
        this.isNonCollectAmt = value;
    }

    /**
     * Gets the value of the isPaymentCurrencyApplied property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPaymentCurrencyApplied() {
        return isPaymentCurrencyApplied;
    }

    /**
     * Sets the value of the isPaymentCurrencyApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPaymentCurrencyApplied(Boolean value) {
        this.isPaymentCurrencyApplied = value;
    }

    /**
     * Gets the value of the isPaymentDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPaymentDiscount() {
        return isPaymentDiscount;
    }

    /**
     * Sets the value of the isPaymentDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPaymentDiscount(Boolean value) {
        this.isPaymentDiscount = value;
    }

    /**
     * Gets the value of the isShowPromo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowPromo() {
        return isShowPromo;
    }

    /**
     * Sets the value of the isShowPromo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowPromo(Boolean value) {
        this.isShowPromo = value;
    }

    /**
     * Gets the value of the isTotalRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTotalRecord() {
        return isTotalRecord;
    }

    /**
     * Sets the value of the isTotalRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTotalRecord(Boolean value) {
        this.isTotalRecord = value;
    }

    /**
     * Gets the value of the isValidLoyalty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValidLoyalty() {
        return isValidLoyalty;
    }

    /**
     * Sets the value of the isValidLoyalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValidLoyalty(Boolean value) {
        this.isValidLoyalty = value;
    }

    /**
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmount(BigDecimal value) {
        this.netAmount = value;
    }

    /**
     * Gets the value of the netAmountInPaymentCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmountInPaymentCurrency() {
        return netAmountInPaymentCurrency;
    }

    /**
     * Sets the value of the netAmountInPaymentCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmountInPaymentCurrency(BigDecimal value) {
        this.netAmountInPaymentCurrency = value;
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
     * Gets the value of the paymentCurrencyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentCurrencyDesc() {
        return paymentCurrencyDesc;
    }

    /**
     * Sets the value of the paymentCurrencyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentCurrencyDesc(JAXBElement<String> value) {
        this.paymentCurrencyDesc = value;
    }

    /**
     * Gets the value of the paymentCurrencyDispTaxnFees property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentCurrencyDispTaxnFees() {
        return paymentCurrencyDispTaxnFees;
    }

    /**
     * Sets the value of the paymentCurrencyDispTaxnFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentCurrencyDispTaxnFees(JAXBElement<String> value) {
        this.paymentCurrencyDispTaxnFees = value;
    }

    /**
     * Gets the value of the paymentCurrencyDispTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentCurrencyDispTotal() {
        return paymentCurrencyDispTotal;
    }

    /**
     * Sets the value of the paymentCurrencyDispTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentCurrencyDispTotal(JAXBElement<String> value) {
        this.paymentCurrencyDispTotal = value;
    }

    /**
     * Gets the value of the paymentCurrencyTaxnFees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentCurrencyTaxnFees() {
        return paymentCurrencyTaxnFees;
    }

    /**
     * Sets the value of the paymentCurrencyTaxnFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentCurrencyTaxnFees(BigDecimal value) {
        this.paymentCurrencyTaxnFees = value;
    }

    /**
     * Gets the value of the paymentCurrencyTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentCurrencyTotal() {
        return paymentCurrencyTotal;
    }

    /**
     * Sets the value of the paymentCurrencyTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentCurrencyTotal(BigDecimal value) {
        this.paymentCurrencyTotal = value;
    }

    /**
     * Gets the value of the perAdultPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerAdultPrice() {
        return perAdultPrice;
    }

    /**
     * Sets the value of the perAdultPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerAdultPrice(BigDecimal value) {
        this.perAdultPrice = value;
    }

    /**
     * Gets the value of the perAdultRedeem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerAdultRedeem() {
        return perAdultRedeem;
    }

    /**
     * Sets the value of the perAdultRedeem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerAdultRedeem(BigDecimal value) {
        this.perAdultRedeem = value;
    }

    /**
     * Gets the value of the perChildPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerChildPrice() {
        return perChildPrice;
    }

    /**
     * Sets the value of the perChildPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerChildPrice(BigDecimal value) {
        this.perChildPrice = value;
    }

    /**
     * Gets the value of the perChildRedeem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerChildRedeem() {
        return perChildRedeem;
    }

    /**
     * Sets the value of the perChildRedeem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerChildRedeem(BigDecimal value) {
        this.perChildRedeem = value;
    }

    /**
     * Gets the value of the perInfantPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerInfantPrice() {
        return perInfantPrice;
    }

    /**
     * Sets the value of the perInfantPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerInfantPrice(BigDecimal value) {
        this.perInfantPrice = value;
    }

    /**
     * Gets the value of the perInfantRedeem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerInfantRedeem() {
        return perInfantRedeem;
    }

    /**
     * Sets the value of the perInfantRedeem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerInfantRedeem(BigDecimal value) {
        this.perInfantRedeem = value;
    }

    /**
     * Gets the value of the promoID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromoID() {
        return promoID;
    }

    /**
     * Sets the value of the promoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromoID(JAXBElement<String> value) {
        this.promoID = value;
    }

    /**
     * Gets the value of the promoStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromoStatus() {
        return promoStatus;
    }

    /**
     * Sets the value of the promoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromoStatus(JAXBElement<String> value) {
        this.promoStatus = value;
    }

    /**
     * Gets the value of the redeemInUse property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRedeemInUse() {
        return redeemInUse;
    }

    /**
     * Sets the value of the redeemInUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRedeemInUse(BigDecimal value) {
        this.redeemInUse = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemarks(JAXBElement<String> value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the roudedAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoudedAdjustmentAmount() {
        return roudedAdjustmentAmount;
    }

    /**
     * Sets the value of the roudedAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoudedAdjustmentAmount(BigDecimal value) {
        this.roudedAdjustmentAmount = value;
    }

    /**
     * Gets the value of the sgdInsurancePackageSummary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSGDInsurancePackageSummary }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSGDInsurancePackageSummary> getSGDInsurancePackageSummary() {
        return sgdInsurancePackageSummary;
    }

    /**
     * Sets the value of the sgdInsurancePackageSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSGDInsurancePackageSummary }{@code >}
     *     
     */
    public void setSGDInsurancePackageSummary(JAXBElement<ArrayOfSGDInsurancePackageSummary> value) {
        this.sgdInsurancePackageSummary = value;
    }

    /**
     * Gets the value of the smsSettingsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SMSSettingsEN }{@code >}
     *     
     */
    public JAXBElement<SMSSettingsEN> getSMSSettingsInfo() {
        return smsSettingsInfo;
    }

    /**
     * Sets the value of the smsSettingsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SMSSettingsEN }{@code >}
     *     
     */
    public void setSMSSettingsInfo(JAXBElement<SMSSettingsEN> value) {
        this.smsSettingsInfo = value;
    }

    /**
     * Gets the value of the spSummary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSpecialPriceSummary }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSpecialPriceSummary> getSPSummary() {
        return spSummary;
    }

    /**
     * Sets the value of the spSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSpecialPriceSummary }{@code >}
     *     
     */
    public void setSPSummary(JAXBElement<ArrayOfSpecialPriceSummary> value) {
        this.spSummary = value;
    }

    /**
     * Gets the value of the sourceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceCurrency() {
        return sourceCurrency;
    }

    /**
     * Sets the value of the sourceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceCurrency(JAXBElement<String> value) {
        this.sourceCurrency = value;
    }

    /**
     * Gets the value of the summaryErrorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSummaryErrorMsg() {
        return summaryErrorMsg;
    }

    /**
     * Sets the value of the summaryErrorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSummaryErrorMsg(JAXBElement<String> value) {
        this.summaryErrorMsg = value;
    }

    /**
     * Gets the value of the summaryErrorMsgText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSummaryErrorMsgText() {
        return summaryErrorMsgText;
    }

    /**
     * Sets the value of the summaryErrorMsgText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSummaryErrorMsgText(JAXBElement<String> value) {
        this.summaryErrorMsgText = value;
    }

    /**
     * Gets the value of the summaryType property.
     * 
     * @return
     *     possible object is
     *     {@link PackageSummaryType }
     *     
     */
    public PackageSummaryType getSummaryType() {
        return summaryType;
    }

    /**
     * Sets the value of the summaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageSummaryType }
     *     
     */
    public void setSummaryType(PackageSummaryType value) {
        this.summaryType = value;
    }

    /**
     * Gets the value of the targetCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTargetCurrency() {
        return targetCurrency;
    }

    /**
     * Sets the value of the targetCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTargetCurrency(JAXBElement<String> value) {
        this.targetCurrency = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxCode(JAXBElement<String> value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the taxnFees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxnFees() {
        return taxnFees;
    }

    /**
     * Sets the value of the taxnFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxnFees(BigDecimal value) {
        this.taxnFees = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Gets the value of the totalRedeem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalRedeem() {
        return totalRedeem;
    }

    /**
     * Sets the value of the totalRedeem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalRedeem(BigDecimal value) {
        this.totalRedeem = value;
    }

}
