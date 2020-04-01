package com.traveloka.hibernate.model.pg.goquo_dp;

import com.traveloka.hibernate.model.pg.goquo_dp_bal.LoyaltyPriceInfo;
import lombok.Data;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceInformation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PriceInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdultMiles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AdultPerCash" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AdultPrice" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PerPaxPriceInfo" minOccurs="0"/>
 *         &lt;element name="BaseFareDiff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BaseFarePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BaseFareRoundingText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCardCommision" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChildMiles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChildPrice" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PerPaxPriceInfo" minOccurs="0"/>
 *         &lt;element name="DiffredTaxOnDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DispInsuranceAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispTotalWithInsurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FPromoAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GSTTTotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GSTTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InfantMiles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InfantPrice" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PerPaxPriceInfo" minOccurs="0"/>
 *         &lt;element name="InsuranceAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InsuranceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsActualFareUpdated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCashPlusMiles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMilesFare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowUpdatePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LoyaltyPrice" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Loyalty}LoyaltyPriceInfo" minOccurs="0"/>
 *         &lt;element name="MilesBaseFare" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MilesToUse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerSegPaxPriceDiff" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PaxPriceDifference" minOccurs="0"/>
 *         &lt;element name="PkgAmountWithPromotion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PkgAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PkgDispAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PkgMilesAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PriceDiff" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PromotionTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SpecialPrice" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfPerPaxPriceInfo" minOccurs="0"/>
 *         &lt;element name="StrikeoutFarePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StrikeoutTotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalAdultMiles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalChildMiles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalFareRound" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalInfantMiles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalMiles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalTaxwithoutGST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Totalb2bMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VoucherAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dispBaseFareDiff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispBaseFarePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispGSTTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispGSTTotalTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispPkgAmountWithPromotion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispPriceDiff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispPriceText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispPromotionTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispStrikeoutFarePrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispStrikeoutTotalPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispTotalPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispTotalTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispTotalTaxwithoutGST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceInformation", propOrder = {
    "adultMiles",
    "adultPerCash",
    "adultPrice",
    "baseFareDiff",
    "baseFarePrice",
    "baseFareRoundingText",
    "cCardCommision",
    "cRatio",
    "childMiles",
    "childPrice",
    "diffredTaxOnDiscount",
    "dispInsuranceAmt",
    "dispTotalWithInsurance",
    "fPromoAmount",
    "gsttTotalTax",
    "gstTax",
    "infantMiles",
    "infantPrice",
    "insuranceAmt",
    "insuranceName",
    "isActualFareUpdated",
    "isCashPlusMiles",
    "isMilesFare",
    "isShowUpdatePrice",
    "loyaltyPrice",
    "milesBaseFare",
    "milesToUse",
    "perSegPaxPriceDiff",
    "pkgAmountWithPromotion",
    "pkgAmt",
    "pkgDispAmt",
    "pkgMilesAmt",
    "priceDiff",
    "promotionTotalAmount",
    "specialPrice",
    "strikeoutFarePrice",
    "strikeoutTotalPrice",
    "totalAdultMiles",
    "totalChildMiles",
    "totalFareRound",
    "totalInfantMiles",
    "totalMarkup",
    "totalMiles",
    "totalPrice",
    "totalTax",
    "totalTaxwithoutGST",
    "totalb2BMarkup",
    "voucherAmount",
    "dispBaseFareDiff",
    "dispBaseFarePrice",
    "dispGSTTax",
    "dispGSTTotalTax",
    "dispPkgAmountWithPromotion",
    "dispPriceDiff",
    "dispPriceText",
    "dispPromotionTotalAmount",
    "dispStrikeoutFarePrice",
    "dispStrikeoutTotalPrice",
    "dispTotalPrice",
    "dispTotalTax",
    "dispTotalTaxwithoutGST"
})
public class PriceInformation {

  @XmlElement(name = "AdultMiles")
  protected BigDecimal adultMiles;
  @XmlElement(name = "AdultPerCash")
  protected BigDecimal adultPerCash;
  @XmlElement(name = "AdultPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected PerPaxPriceInfo adultPrice;
  @XmlElement(name = "BaseFareDiff")
  protected BigDecimal baseFareDiff;
  @XmlElement(name = "BaseFarePrice")
  protected BigDecimal baseFarePrice;
  @XmlElement(name = "BaseFareRoundingText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String baseFareRoundingText;
  @XmlElement(name = "CCardCommision")
  protected BigDecimal cCardCommision;
  @XmlElement(name = "CRatio")
  protected BigDecimal cRatio;
  @XmlElement(name = "ChildMiles")
  protected BigDecimal childMiles;
  @XmlElement(name = "ChildPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected PerPaxPriceInfo childPrice;
  @XmlElement(name = "DiffredTaxOnDiscount")
  protected BigDecimal diffredTaxOnDiscount;
  @XmlElement(name = "DispInsuranceAmt", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispInsuranceAmt;
  @XmlElement(name = "DispTotalWithInsurance", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispTotalWithInsurance;
  @XmlElement(name = "FPromoAmount")
  protected BigDecimal fPromoAmount;
  @XmlElement(name = "GSTTTotalTax")
  protected BigDecimal gsttTotalTax;
  @XmlElement(name = "GSTTax")
  protected BigDecimal gstTax;
  @XmlElement(name = "InfantMiles")
  protected BigDecimal infantMiles;
  @XmlElement(name = "InfantPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected PerPaxPriceInfo infantPrice;
  @XmlElement(name = "InsuranceAmt")
  protected BigDecimal insuranceAmt;
  @XmlElement(name = "InsuranceName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String insuranceName;
  @XmlElement(name = "IsActualFareUpdated")
  protected Boolean isActualFareUpdated;
  @XmlElement(name = "IsCashPlusMiles")
  protected Boolean isCashPlusMiles;
  @XmlElement(name = "IsMilesFare")
  protected Boolean isMilesFare;
  @XmlElement(name = "IsShowUpdatePrice")
  protected Boolean isShowUpdatePrice;
  @XmlElement(name = "LoyaltyPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected LoyaltyPriceInfo loyaltyPrice;
  @XmlElement(name = "MilesBaseFare")
  protected BigDecimal milesBaseFare;
  @XmlElement(name = "MilesToUse")
  protected BigDecimal milesToUse;
  @XmlElement(name = "PerSegPaxPriceDiff", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected PaxPriceDifference perSegPaxPriceDiff;
  @XmlElement(name = "PkgAmountWithPromotion")
  protected BigDecimal pkgAmountWithPromotion;
  @XmlElement(name = "PkgAmt")
  protected BigDecimal pkgAmt;
  @XmlElement(name = "PkgDispAmt", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String pkgDispAmt;
  @XmlElement(name = "PkgMilesAmt")
  protected BigDecimal pkgMilesAmt;
  @XmlElement(name = "PriceDiff")
  protected BigDecimal priceDiff;
  @XmlElement(name = "PromotionTotalAmount")
  protected BigDecimal promotionTotalAmount;
  @XmlElement(name = "SpecialPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfPerPaxPriceInfo specialPrice;
  @XmlElement(name = "StrikeoutFarePrice")
  protected BigDecimal strikeoutFarePrice;
  @XmlElement(name = "StrikeoutTotalPrice")
  protected BigDecimal strikeoutTotalPrice;
  @XmlElement(name = "TotalAdultMiles")
  protected BigDecimal totalAdultMiles;
  @XmlElement(name = "TotalChildMiles")
  protected BigDecimal totalChildMiles;
  @XmlElement(name = "TotalFareRound")
  protected BigDecimal totalFareRound;
  @XmlElement(name = "TotalInfantMiles")
  protected BigDecimal totalInfantMiles;
  @XmlElement(name = "TotalMarkup")
  protected BigDecimal totalMarkup;
  @XmlElement(name = "TotalMiles")
  protected BigDecimal totalMiles;
  @XmlElement(name = "TotalPrice")
  protected BigDecimal totalPrice;
  @XmlElement(name = "TotalTax")
  protected BigDecimal totalTax;
  @XmlElement(name = "TotalTaxwithoutGST")
  protected BigDecimal totalTaxwithoutGST;
  @XmlElement(name = "Totalb2bMarkup")
  protected BigDecimal totalb2BMarkup;
  @XmlElement(name = "VoucherAmount")
  protected BigDecimal voucherAmount;
  @XmlElement(name = "dispBaseFareDiff", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispBaseFareDiff;
  @XmlElement(name = "dispBaseFarePrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispBaseFarePrice;
  @XmlElement(name = "dispGSTTax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispGSTTax;
  @XmlElement(name = "dispGSTTotalTax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispGSTTotalTax;
  @XmlElement(name = "dispPkgAmountWithPromotion", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispPkgAmountWithPromotion;
  @XmlElement(name = "dispPriceDiff", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispPriceDiff;
  @XmlElement(name = "dispPriceText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispPriceText;
  @XmlElement(name = "dispPromotionTotalAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispPromotionTotalAmount;
  @XmlElement(name = "dispStrikeoutFarePrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispStrikeoutFarePrice;
  @XmlElement(name = "dispStrikeoutTotalPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispStrikeoutTotalPrice;
  @XmlElement(name = "dispTotalPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispTotalPrice;
  @XmlElement(name = "dispTotalTax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispTotalTax;
  @XmlElement(name = "dispTotalTaxwithoutGST", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispTotalTaxwithoutGST;

}
