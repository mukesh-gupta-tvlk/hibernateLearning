
package com.traveloka.hibernate.model.pg.goquo_dp_bal;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GQInsuranceRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GQInsuranceRes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DeclarationURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispPerPaxPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayCurrencySymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSTAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HTMLContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsBenefits" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances}Benefits" minOccurs="0"/>
 *         &lt;element name="InsTermsAndCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsTravellers" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances}Travellers" minOccurs="0"/>
 *         &lt;element name="InsuranceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsInurancePriceAddtoTotal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsNoInsurance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsOptional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowInsPartnerContent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MoreInfoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxDoumentIdRequiredType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PerPaxPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PolicyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PolicyWordingURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrivacyPolicyURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductVariant" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances}Insuranceproduct" minOccurs="0"/>
 *         &lt;element name="ProtectionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFICSubCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScriptContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellingAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SellingCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GQInsuranceRes", propOrder = {
    "amount",
    "css",
    "currency",
    "currencyRatio",
    "declarationURL",
    "departureCountry",
    "description",
    "destination",
    "dispAmount",
    "dispPerPaxPrice",
    "displayCurrencySymbol",
    "gstAmount",
    "htmlContent",
    "insBenefits",
    "insTermsAndCondition",
    "insTravellers",
    "insuranceName",
    "isInurancePriceAddtoTotal",
    "isNoInsurance",
    "isOptional",
    "isSelected",
    "isShowInsPartnerContent",
    "moreInfoURL",
    "paxDoumentIdRequiredType",
    "perPaxPrice",
    "policyName",
    "policyWordingURL",
    "privacyPolicyURL",
    "productID",
    "productURL",
    "productVariant",
    "protectionText",
    "rficSubCode",
    "scriptContent",
    "sellingAmount",
    "sellingCurrencyCode",
    "unitPrice"
})
public class GQInsuranceRes {

    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElementRef(name = "CSS", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> css;
    @XmlElementRef(name = "Currency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency;
    @XmlElement(name = "CurrencyRatio")
    protected BigDecimal currencyRatio;
    @XmlElementRef(name = "DeclarationURL", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> declarationURL;
    @XmlElementRef(name = "DepartureCountry", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departureCountry;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Destination", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destination;
    @XmlElementRef(name = "DispAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispAmount;
    @XmlElementRef(name = "DispPerPaxPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispPerPaxPrice;
    @XmlElementRef(name = "DisplayCurrencySymbol", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayCurrencySymbol;
    @XmlElement(name = "GSTAmount")
    protected BigDecimal gstAmount;
    @XmlElementRef(name = "HTMLContent", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> htmlContent;
    @XmlElementRef(name = "InsBenefits", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<Benefits> insBenefits;
    @XmlElementRef(name = "InsTermsAndCondition", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insTermsAndCondition;
    @XmlElementRef(name = "InsTravellers", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<Travellers> insTravellers;
    @XmlElementRef(name = "InsuranceName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranceName;
    @XmlElement(name = "IsInurancePriceAddtoTotal")
    protected Boolean isInurancePriceAddtoTotal;
    @XmlElement(name = "IsNoInsurance")
    protected Boolean isNoInsurance;
    @XmlElement(name = "IsOptional")
    protected Boolean isOptional;
    @XmlElement(name = "IsSelected")
    protected Boolean isSelected;
    @XmlElement(name = "IsShowInsPartnerContent")
    protected Boolean isShowInsPartnerContent;
    @XmlElementRef(name = "MoreInfoURL", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> moreInfoURL;
    @XmlElement(name = "PaxDoumentIdRequiredType")
    protected Integer paxDoumentIdRequiredType;
    @XmlElement(name = "PerPaxPrice")
    protected BigDecimal perPaxPrice;
    @XmlElementRef(name = "PolicyName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyName;
    @XmlElementRef(name = "PolicyWordingURL", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyWordingURL;
    @XmlElementRef(name = "PrivacyPolicyURL", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> privacyPolicyURL;
    @XmlElementRef(name = "ProductID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productID;
    @XmlElementRef(name = "ProductURL", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productURL;
    @XmlElementRef(name = "ProductVariant", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<Insuranceproduct> productVariant;
    @XmlElementRef(name = "ProtectionText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> protectionText;
    @XmlElementRef(name = "RFICSubCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rficSubCode;
    @XmlElementRef(name = "ScriptContent", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scriptContent;
    @XmlElement(name = "SellingAmount")
    protected Double sellingAmount;
    @XmlElementRef(name = "SellingCurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sellingCurrencyCode;
    @XmlElement(name = "UnitPrice")
    protected Double unitPrice;

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
     * Gets the value of the css property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCSS() {
        return css;
    }

    /**
     * Sets the value of the css property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCSS(JAXBElement<String> value) {
        this.css = value;
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
     * Gets the value of the currencyRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyRatio() {
        return currencyRatio;
    }

    /**
     * Sets the value of the currencyRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyRatio(BigDecimal value) {
        this.currencyRatio = value;
    }

    /**
     * Gets the value of the declarationURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeclarationURL() {
        return declarationURL;
    }

    /**
     * Sets the value of the declarationURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeclarationURL(JAXBElement<String> value) {
        this.declarationURL = value;
    }

    /**
     * Gets the value of the departureCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartureCountry() {
        return departureCountry;
    }

    /**
     * Sets the value of the departureCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartureCountry(JAXBElement<String> value) {
        this.departureCountry = value;
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
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestination(JAXBElement<String> value) {
        this.destination = value;
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
     * Gets the value of the displayCurrencySymbol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayCurrencySymbol() {
        return displayCurrencySymbol;
    }

    /**
     * Sets the value of the displayCurrencySymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayCurrencySymbol(JAXBElement<String> value) {
        this.displayCurrencySymbol = value;
    }

    /**
     * Gets the value of the gstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGSTAmount() {
        return gstAmount;
    }

    /**
     * Sets the value of the gstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGSTAmount(BigDecimal value) {
        this.gstAmount = value;
    }

    /**
     * Gets the value of the htmlContent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHTMLContent() {
        return htmlContent;
    }

    /**
     * Sets the value of the htmlContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHTMLContent(JAXBElement<String> value) {
        this.htmlContent = value;
    }

    /**
     * Gets the value of the insBenefits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Benefits }{@code >}
     *     
     */
    public JAXBElement<Benefits> getInsBenefits() {
        return insBenefits;
    }

    /**
     * Sets the value of the insBenefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Benefits }{@code >}
     *     
     */
    public void setInsBenefits(JAXBElement<Benefits> value) {
        this.insBenefits = value;
    }

    /**
     * Gets the value of the insTermsAndCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsTermsAndCondition() {
        return insTermsAndCondition;
    }

    /**
     * Sets the value of the insTermsAndCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsTermsAndCondition(JAXBElement<String> value) {
        this.insTermsAndCondition = value;
    }

    /**
     * Gets the value of the insTravellers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Travellers }{@code >}
     *     
     */
    public JAXBElement<Travellers> getInsTravellers() {
        return insTravellers;
    }

    /**
     * Sets the value of the insTravellers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Travellers }{@code >}
     *     
     */
    public void setInsTravellers(JAXBElement<Travellers> value) {
        this.insTravellers = value;
    }

    /**
     * Gets the value of the insuranceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsuranceName() {
        return insuranceName;
    }

    /**
     * Sets the value of the insuranceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsuranceName(JAXBElement<String> value) {
        this.insuranceName = value;
    }

    /**
     * Gets the value of the isInurancePriceAddtoTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInurancePriceAddtoTotal() {
        return isInurancePriceAddtoTotal;
    }

    /**
     * Sets the value of the isInurancePriceAddtoTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInurancePriceAddtoTotal(Boolean value) {
        this.isInurancePriceAddtoTotal = value;
    }

    /**
     * Gets the value of the isNoInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNoInsurance() {
        return isNoInsurance;
    }

    /**
     * Sets the value of the isNoInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNoInsurance(Boolean value) {
        this.isNoInsurance = value;
    }

    /**
     * Gets the value of the isOptional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOptional() {
        return isOptional;
    }

    /**
     * Sets the value of the isOptional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOptional(Boolean value) {
        this.isOptional = value;
    }

    /**
     * Gets the value of the isSelected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSelected() {
        return isSelected;
    }

    /**
     * Sets the value of the isSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSelected(Boolean value) {
        this.isSelected = value;
    }

    /**
     * Gets the value of the isShowInsPartnerContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowInsPartnerContent() {
        return isShowInsPartnerContent;
    }

    /**
     * Sets the value of the isShowInsPartnerContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowInsPartnerContent(Boolean value) {
        this.isShowInsPartnerContent = value;
    }

    /**
     * Gets the value of the moreInfoURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMoreInfoURL() {
        return moreInfoURL;
    }

    /**
     * Sets the value of the moreInfoURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMoreInfoURL(JAXBElement<String> value) {
        this.moreInfoURL = value;
    }

    /**
     * Gets the value of the paxDoumentIdRequiredType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaxDoumentIdRequiredType() {
        return paxDoumentIdRequiredType;
    }

    /**
     * Sets the value of the paxDoumentIdRequiredType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaxDoumentIdRequiredType(Integer value) {
        this.paxDoumentIdRequiredType = value;
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
     * Gets the value of the policyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyName() {
        return policyName;
    }

    /**
     * Sets the value of the policyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyName(JAXBElement<String> value) {
        this.policyName = value;
    }

    /**
     * Gets the value of the policyWordingURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyWordingURL() {
        return policyWordingURL;
    }

    /**
     * Sets the value of the policyWordingURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyWordingURL(JAXBElement<String> value) {
        this.policyWordingURL = value;
    }

    /**
     * Gets the value of the privacyPolicyURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrivacyPolicyURL() {
        return privacyPolicyURL;
    }

    /**
     * Sets the value of the privacyPolicyURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrivacyPolicyURL(JAXBElement<String> value) {
        this.privacyPolicyURL = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductID(JAXBElement<String> value) {
        this.productID = value;
    }

    /**
     * Gets the value of the productURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductURL() {
        return productURL;
    }

    /**
     * Sets the value of the productURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductURL(JAXBElement<String> value) {
        this.productURL = value;
    }

    /**
     * Gets the value of the productVariant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Insuranceproduct }{@code >}
     *     
     */
    public JAXBElement<Insuranceproduct> getProductVariant() {
        return productVariant;
    }

    /**
     * Sets the value of the productVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Insuranceproduct }{@code >}
     *     
     */
    public void setProductVariant(JAXBElement<Insuranceproduct> value) {
        this.productVariant = value;
    }

    /**
     * Gets the value of the protectionText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProtectionText() {
        return protectionText;
    }

    /**
     * Sets the value of the protectionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProtectionText(JAXBElement<String> value) {
        this.protectionText = value;
    }

    /**
     * Gets the value of the rficSubCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRFICSubCode() {
        return rficSubCode;
    }

    /**
     * Sets the value of the rficSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRFICSubCode(JAXBElement<String> value) {
        this.rficSubCode = value;
    }

    /**
     * Gets the value of the scriptContent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScriptContent() {
        return scriptContent;
    }

    /**
     * Sets the value of the scriptContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScriptContent(JAXBElement<String> value) {
        this.scriptContent = value;
    }

    /**
     * Gets the value of the sellingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSellingAmount() {
        return sellingAmount;
    }

    /**
     * Sets the value of the sellingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSellingAmount(Double value) {
        this.sellingAmount = value;
    }

    /**
     * Gets the value of the sellingCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSellingCurrencyCode() {
        return sellingCurrencyCode;
    }

    /**
     * Sets the value of the sellingCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSellingCurrencyCode(JAXBElement<String> value) {
        this.sellingCurrencyCode = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitPrice(Double value) {
        this.unitPrice = value;
    }

}
