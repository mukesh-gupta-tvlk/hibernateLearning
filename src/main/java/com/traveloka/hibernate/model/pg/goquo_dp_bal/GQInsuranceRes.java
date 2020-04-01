package com.traveloka.hibernate.model.pg.goquo_dp_bal;

import lombok.Data;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 */

@Data
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
  @XmlElement(name = "CSS", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String css;
  @XmlElement(name = "Currency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String currency;
  @XmlElement(name = "CurrencyRatio")
  protected BigDecimal currencyRatio;
  @XmlElement(name = "DeclarationURL", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String declarationURL;
  @XmlElement(name = "DepartureCountry", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String departureCountry;
  @XmlElement(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String description;
  @XmlElement(name = "Destination", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String destination;
  @XmlElement(name = "DispAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String dispAmount;
  @XmlElement(name = "DispPerPaxPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String dispPerPaxPrice;
  @XmlElement(name = "DisplayCurrencySymbol", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String displayCurrencySymbol;
  @XmlElement(name = "GSTAmount")
  protected BigDecimal gstAmount;
  @XmlElement(name = "HTMLContent", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String htmlContent;
  @XmlElement(name = "InsBenefits", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected Benefits insBenefits;
  @XmlElement(name = "InsTermsAndCondition", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String insTermsAndCondition;
  @XmlElement(name = "InsTravellers", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected Travellers insTravellers;
  @XmlElement(name = "InsuranceName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String insuranceName;
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
  @XmlElement(name = "MoreInfoURL", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String moreInfoURL;
  @XmlElement(name = "PaxDoumentIdRequiredType")
  protected Integer paxDoumentIdRequiredType;
  @XmlElement(name = "PerPaxPrice")
  protected BigDecimal perPaxPrice;
  @XmlElement(name = "PolicyName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String policyName;
  @XmlElement(name = "PolicyWordingURL", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String policyWordingURL;
  @XmlElement(name = "PrivacyPolicyURL", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String privacyPolicyURL;
  @XmlElement(name = "ProductID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String productID;
  @XmlElement(name = "ProductURL", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String productURL;
  @XmlElement(name = "ProductVariant", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected ProductVariant productVariant;
  @XmlElement(name = "ProtectionText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String protectionText;
  @XmlElement(name = "RFICSubCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String rficSubCode;
  @XmlElement(name = "ScriptContent", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String scriptContent;
  @XmlElement(name = "SellingAmount")
  protected Double sellingAmount;
  @XmlElement(name = "SellingCurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", required = false)
  protected String sellingCurrencyCode;
  @XmlElement(name = "UnitPrice")
  protected Double unitPrice;

}
