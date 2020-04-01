package com.traveloka.hibernate.model.pg.goquo_dp;

import com.traveloka.hibernate.model.pg.goquo_dp_bal.LoyaltyPriceInfo;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
  @XmlElementRef(name = "AdultPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<PerPaxPriceInfo> adultPrice;
  @XmlElement(name = "BaseFareDiff")
  protected BigDecimal baseFareDiff;
  @XmlElement(name = "BaseFarePrice")
  protected BigDecimal baseFarePrice;
  @XmlElementRef(name = "BaseFareRoundingText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> baseFareRoundingText;
  @XmlElement(name = "CCardCommision")
  protected BigDecimal cCardCommision;
  @XmlElement(name = "CRatio")
  protected BigDecimal cRatio;
  @XmlElement(name = "ChildMiles")
  protected BigDecimal childMiles;
  @XmlElementRef(name = "ChildPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<PerPaxPriceInfo> childPrice;
  @XmlElement(name = "DiffredTaxOnDiscount")
  protected BigDecimal diffredTaxOnDiscount;
  @XmlElementRef(name = "DispInsuranceAmt", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> dispInsuranceAmt;
  @XmlElementRef(name = "DispTotalWithInsurance", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> dispTotalWithInsurance;
  @XmlElement(name = "FPromoAmount")
  protected BigDecimal fPromoAmount;
  @XmlElement(name = "GSTTTotalTax")
  protected BigDecimal gsttTotalTax;
  @XmlElement(name = "GSTTax")
  protected BigDecimal gstTax;
  @XmlElement(name = "InfantMiles")
  protected BigDecimal infantMiles;
  @XmlElementRef(name = "InfantPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<PerPaxPriceInfo> infantPrice;
  @XmlElement(name = "InsuranceAmt")
  protected BigDecimal insuranceAmt;
  @XmlElementRef(name = "InsuranceName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> insuranceName;
  @XmlElement(name = "IsActualFareUpdated")
  protected Boolean isActualFareUpdated;
  @XmlElement(name = "IsCashPlusMiles")
  protected Boolean isCashPlusMiles;
  @XmlElement(name = "IsMilesFare")
  protected Boolean isMilesFare;
  @XmlElement(name = "IsShowUpdatePrice")
  protected Boolean isShowUpdatePrice;
  @XmlElementRef(name = "LoyaltyPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<LoyaltyPriceInfo> loyaltyPrice;
  @XmlElement(name = "MilesBaseFare")
  protected BigDecimal milesBaseFare;
  @XmlElement(name = "MilesToUse")
  protected BigDecimal milesToUse;
  @XmlElementRef(name = "PerSegPaxPriceDiff", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<PaxPriceDifference> perSegPaxPriceDiff;
  @XmlElement(name = "PkgAmountWithPromotion")
  protected BigDecimal pkgAmountWithPromotion;
  @XmlElement(name = "PkgAmt")
  protected BigDecimal pkgAmt;
  @XmlElementRef(name = "PkgDispAmt", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> pkgDispAmt;
  @XmlElement(name = "PkgMilesAmt")
  protected BigDecimal pkgMilesAmt;
  @XmlElement(name = "PriceDiff")
  protected BigDecimal priceDiff;
  @XmlElement(name = "PromotionTotalAmount")
  protected BigDecimal promotionTotalAmount;
  @XmlElementRef(name = "SpecialPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<ArrayOfPerPaxPriceInfo> specialPrice;
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
  @XmlElementRef(name = "dispBaseFareDiff", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> dispBaseFareDiff;
  @XmlElementRef(name = "dispBaseFarePrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> dispBaseFarePrice;
  @XmlElementRef(name = "dispGSTTax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> dispGSTTax;
  @XmlElementRef(name = "dispGSTTotalTax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> dispGSTTotalTax;
  @XmlElementRef(name = "dispPkgAmountWithPromotion", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> dispPkgAmountWithPromotion;
  @XmlElementRef(name = "dispPriceDiff", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> dispPriceDiff;
  @XmlElementRef(name = "dispPriceText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> dispPriceText;
  @XmlElementRef(name = "dispPromotionTotalAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> dispPromotionTotalAmount;
  @XmlElementRef(name = "dispStrikeoutFarePrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> dispStrikeoutFarePrice;
  @XmlElementRef(name = "dispStrikeoutTotalPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> dispStrikeoutTotalPrice;
  @XmlElementRef(name = "dispTotalPrice", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> dispTotalPrice;
  @XmlElementRef(name = "dispTotalTax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> dispTotalTax;
  @XmlElementRef(name = "dispTotalTaxwithoutGST", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> dispTotalTaxwithoutGST;

  /**
   * Gets the value of the adultMiles property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getAdultMiles() {
    return adultMiles;
  }

  /**
   * Sets the value of the adultMiles property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setAdultMiles(BigDecimal value) {
    this.adultMiles = value;
  }

  /**
   * Gets the value of the adultPerCash property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getAdultPerCash() {
    return adultPerCash;
  }

  /**
   * Sets the value of the adultPerCash property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setAdultPerCash(BigDecimal value) {
    this.adultPerCash = value;
  }

  /**
   * Gets the value of the adultPrice property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link PerPaxPriceInfo }{@code >}
   */
  public JAXBElement<PerPaxPriceInfo> getAdultPrice() {
    return adultPrice;
  }

  /**
   * Sets the value of the adultPrice property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link PerPaxPriceInfo }{@code >}
   */
  public void setAdultPrice(JAXBElement<PerPaxPriceInfo> value) {
    this.adultPrice = value;
  }

  /**
   * Gets the value of the baseFareDiff property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getBaseFareDiff() {
    return baseFareDiff;
  }

  /**
   * Sets the value of the baseFareDiff property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setBaseFareDiff(BigDecimal value) {
    this.baseFareDiff = value;
  }

  /**
   * Gets the value of the baseFarePrice property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getBaseFarePrice() {
    return baseFarePrice;
  }

  /**
   * Sets the value of the baseFarePrice property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setBaseFarePrice(BigDecimal value) {
    this.baseFarePrice = value;
  }

  /**
   * Gets the value of the baseFareRoundingText property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getBaseFareRoundingText() {
    return baseFareRoundingText;
  }

  /**
   * Sets the value of the baseFareRoundingText property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setBaseFareRoundingText(JAXBElement<String> value) {
    this.baseFareRoundingText = value;
  }

  /**
   * Gets the value of the cCardCommision property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getCCardCommision() {
    return cCardCommision;
  }

  /**
   * Sets the value of the cCardCommision property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setCCardCommision(BigDecimal value) {
    this.cCardCommision = value;
  }

  /**
   * Gets the value of the cRatio property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getCRatio() {
    return cRatio;
  }

  /**
   * Sets the value of the cRatio property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setCRatio(BigDecimal value) {
    this.cRatio = value;
  }

  /**
   * Gets the value of the childMiles property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getChildMiles() {
    return childMiles;
  }

  /**
   * Sets the value of the childMiles property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setChildMiles(BigDecimal value) {
    this.childMiles = value;
  }

  /**
   * Gets the value of the childPrice property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link PerPaxPriceInfo }{@code >}
   */
  public JAXBElement<PerPaxPriceInfo> getChildPrice() {
    return childPrice;
  }

  /**
   * Sets the value of the childPrice property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link PerPaxPriceInfo }{@code >}
   */
  public void setChildPrice(JAXBElement<PerPaxPriceInfo> value) {
    this.childPrice = value;
  }

  /**
   * Gets the value of the diffredTaxOnDiscount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getDiffredTaxOnDiscount() {
    return diffredTaxOnDiscount;
  }

  /**
   * Sets the value of the diffredTaxOnDiscount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setDiffredTaxOnDiscount(BigDecimal value) {
    this.diffredTaxOnDiscount = value;
  }

  /**
   * Gets the value of the dispInsuranceAmt property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDispInsuranceAmt() {
    return dispInsuranceAmt;
  }

  /**
   * Sets the value of the dispInsuranceAmt property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDispInsuranceAmt(JAXBElement<String> value) {
    this.dispInsuranceAmt = value;
  }

  /**
   * Gets the value of the dispTotalWithInsurance property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDispTotalWithInsurance() {
    return dispTotalWithInsurance;
  }

  /**
   * Sets the value of the dispTotalWithInsurance property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDispTotalWithInsurance(JAXBElement<String> value) {
    this.dispTotalWithInsurance = value;
  }

  /**
   * Gets the value of the fPromoAmount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getFPromoAmount() {
    return fPromoAmount;
  }

  /**
   * Sets the value of the fPromoAmount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setFPromoAmount(BigDecimal value) {
    this.fPromoAmount = value;
  }

  /**
   * Gets the value of the gsttTotalTax property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getGSTTTotalTax() {
    return gsttTotalTax;
  }

  /**
   * Sets the value of the gsttTotalTax property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setGSTTTotalTax(BigDecimal value) {
    this.gsttTotalTax = value;
  }

  /**
   * Gets the value of the gstTax property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getGSTTax() {
    return gstTax;
  }

  /**
   * Sets the value of the gstTax property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setGSTTax(BigDecimal value) {
    this.gstTax = value;
  }

  /**
   * Gets the value of the infantMiles property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getInfantMiles() {
    return infantMiles;
  }

  /**
   * Sets the value of the infantMiles property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setInfantMiles(BigDecimal value) {
    this.infantMiles = value;
  }

  /**
   * Gets the value of the infantPrice property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link PerPaxPriceInfo }{@code >}
   */
  public JAXBElement<PerPaxPriceInfo> getInfantPrice() {
    return infantPrice;
  }

  /**
   * Sets the value of the infantPrice property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link PerPaxPriceInfo }{@code >}
   */
  public void setInfantPrice(JAXBElement<PerPaxPriceInfo> value) {
    this.infantPrice = value;
  }

  /**
   * Gets the value of the insuranceAmt property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getInsuranceAmt() {
    return insuranceAmt;
  }

  /**
   * Sets the value of the insuranceAmt property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setInsuranceAmt(BigDecimal value) {
    this.insuranceAmt = value;
  }

  /**
   * Gets the value of the insuranceName property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getInsuranceName() {
    return insuranceName;
  }

  /**
   * Sets the value of the insuranceName property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setInsuranceName(JAXBElement<String> value) {
    this.insuranceName = value;
  }

  /**
   * Gets the value of the isActualFareUpdated property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsActualFareUpdated() {
    return isActualFareUpdated;
  }

  /**
   * Sets the value of the isActualFareUpdated property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsActualFareUpdated(Boolean value) {
    this.isActualFareUpdated = value;
  }

  /**
   * Gets the value of the isCashPlusMiles property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsCashPlusMiles() {
    return isCashPlusMiles;
  }

  /**
   * Sets the value of the isCashPlusMiles property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsCashPlusMiles(Boolean value) {
    this.isCashPlusMiles = value;
  }

  /**
   * Gets the value of the isMilesFare property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsMilesFare() {
    return isMilesFare;
  }

  /**
   * Sets the value of the isMilesFare property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsMilesFare(Boolean value) {
    this.isMilesFare = value;
  }

  /**
   * Gets the value of the isShowUpdatePrice property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsShowUpdatePrice() {
    return isShowUpdatePrice;
  }

  /**
   * Sets the value of the isShowUpdatePrice property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsShowUpdatePrice(Boolean value) {
    this.isShowUpdatePrice = value;
  }

  /**
   * Gets the value of the loyaltyPrice property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link LoyaltyPriceInfo }{@code >}
   */
  public JAXBElement<LoyaltyPriceInfo> getLoyaltyPrice() {
    return loyaltyPrice;
  }

  /**
   * Sets the value of the loyaltyPrice property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link LoyaltyPriceInfo }{@code >}
   */
  public void setLoyaltyPrice(JAXBElement<LoyaltyPriceInfo> value) {
    this.loyaltyPrice = value;
  }

  /**
   * Gets the value of the milesBaseFare property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getMilesBaseFare() {
    return milesBaseFare;
  }

  /**
   * Sets the value of the milesBaseFare property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setMilesBaseFare(BigDecimal value) {
    this.milesBaseFare = value;
  }

  /**
   * Gets the value of the milesToUse property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getMilesToUse() {
    return milesToUse;
  }

  /**
   * Sets the value of the milesToUse property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setMilesToUse(BigDecimal value) {
    this.milesToUse = value;
  }

  /**
   * Gets the value of the perSegPaxPriceDiff property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link PaxPriceDifference }{@code >}
   */
  public JAXBElement<PaxPriceDifference> getPerSegPaxPriceDiff() {
    return perSegPaxPriceDiff;
  }

  /**
   * Sets the value of the perSegPaxPriceDiff property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link PaxPriceDifference }{@code >}
   */
  public void setPerSegPaxPriceDiff(JAXBElement<PaxPriceDifference> value) {
    this.perSegPaxPriceDiff = value;
  }

  /**
   * Gets the value of the pkgAmountWithPromotion property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPkgAmountWithPromotion() {
    return pkgAmountWithPromotion;
  }

  /**
   * Sets the value of the pkgAmountWithPromotion property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPkgAmountWithPromotion(BigDecimal value) {
    this.pkgAmountWithPromotion = value;
  }

  /**
   * Gets the value of the pkgAmt property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPkgAmt() {
    return pkgAmt;
  }

  /**
   * Sets the value of the pkgAmt property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPkgAmt(BigDecimal value) {
    this.pkgAmt = value;
  }

  /**
   * Gets the value of the pkgDispAmt property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getPkgDispAmt() {
    return pkgDispAmt;
  }

  /**
   * Sets the value of the pkgDispAmt property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setPkgDispAmt(JAXBElement<String> value) {
    this.pkgDispAmt = value;
  }

  /**
   * Gets the value of the pkgMilesAmt property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPkgMilesAmt() {
    return pkgMilesAmt;
  }

  /**
   * Sets the value of the pkgMilesAmt property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPkgMilesAmt(BigDecimal value) {
    this.pkgMilesAmt = value;
  }

  /**
   * Gets the value of the priceDiff property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPriceDiff() {
    return priceDiff;
  }

  /**
   * Sets the value of the priceDiff property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPriceDiff(BigDecimal value) {
    this.priceDiff = value;
  }

  /**
   * Gets the value of the promotionTotalAmount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPromotionTotalAmount() {
    return promotionTotalAmount;
  }

  /**
   * Sets the value of the promotionTotalAmount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPromotionTotalAmount(BigDecimal value) {
    this.promotionTotalAmount = value;
  }

  /**
   * Gets the value of the specialPrice property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ArrayOfPerPaxPriceInfo }{@code >}
   */
  public JAXBElement<ArrayOfPerPaxPriceInfo> getSpecialPrice() {
    return specialPrice;
  }

  /**
   * Sets the value of the specialPrice property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ArrayOfPerPaxPriceInfo }{@code >}
   */
  public void setSpecialPrice(JAXBElement<ArrayOfPerPaxPriceInfo> value) {
    this.specialPrice = value;
  }

  /**
   * Gets the value of the strikeoutFarePrice property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getStrikeoutFarePrice() {
    return strikeoutFarePrice;
  }

  /**
   * Sets the value of the strikeoutFarePrice property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setStrikeoutFarePrice(BigDecimal value) {
    this.strikeoutFarePrice = value;
  }

  /**
   * Gets the value of the strikeoutTotalPrice property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getStrikeoutTotalPrice() {
    return strikeoutTotalPrice;
  }

  /**
   * Sets the value of the strikeoutTotalPrice property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setStrikeoutTotalPrice(BigDecimal value) {
    this.strikeoutTotalPrice = value;
  }

  /**
   * Gets the value of the totalAdultMiles property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getTotalAdultMiles() {
    return totalAdultMiles;
  }

  /**
   * Sets the value of the totalAdultMiles property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setTotalAdultMiles(BigDecimal value) {
    this.totalAdultMiles = value;
  }

  /**
   * Gets the value of the totalChildMiles property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getTotalChildMiles() {
    return totalChildMiles;
  }

  /**
   * Sets the value of the totalChildMiles property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setTotalChildMiles(BigDecimal value) {
    this.totalChildMiles = value;
  }

  /**
   * Gets the value of the totalFareRound property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getTotalFareRound() {
    return totalFareRound;
  }

  /**
   * Sets the value of the totalFareRound property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setTotalFareRound(BigDecimal value) {
    this.totalFareRound = value;
  }

  /**
   * Gets the value of the totalInfantMiles property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getTotalInfantMiles() {
    return totalInfantMiles;
  }

  /**
   * Sets the value of the totalInfantMiles property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setTotalInfantMiles(BigDecimal value) {
    this.totalInfantMiles = value;
  }

  /**
   * Gets the value of the totalMarkup property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getTotalMarkup() {
    return totalMarkup;
  }

  /**
   * Sets the value of the totalMarkup property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setTotalMarkup(BigDecimal value) {
    this.totalMarkup = value;
  }

  /**
   * Gets the value of the totalMiles property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getTotalMiles() {
    return totalMiles;
  }

  /**
   * Sets the value of the totalMiles property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setTotalMiles(BigDecimal value) {
    this.totalMiles = value;
  }

  /**
   * Gets the value of the totalPrice property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getTotalPrice() {
    return totalPrice;
  }

  /**
   * Sets the value of the totalPrice property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setTotalPrice(BigDecimal value) {
    this.totalPrice = value;
  }

  /**
   * Gets the value of the totalTax property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getTotalTax() {
    return totalTax;
  }

  /**
   * Sets the value of the totalTax property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setTotalTax(BigDecimal value) {
    this.totalTax = value;
  }

  /**
   * Gets the value of the totalTaxwithoutGST property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getTotalTaxwithoutGST() {
    return totalTaxwithoutGST;
  }

  /**
   * Sets the value of the totalTaxwithoutGST property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setTotalTaxwithoutGST(BigDecimal value) {
    this.totalTaxwithoutGST = value;
  }

  /**
   * Gets the value of the totalb2BMarkup property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getTotalb2BMarkup() {
    return totalb2BMarkup;
  }

  /**
   * Sets the value of the totalb2BMarkup property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setTotalb2BMarkup(BigDecimal value) {
    this.totalb2BMarkup = value;
  }

  /**
   * Gets the value of the voucherAmount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getVoucherAmount() {
    return voucherAmount;
  }

  /**
   * Sets the value of the voucherAmount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setVoucherAmount(BigDecimal value) {
    this.voucherAmount = value;
  }

  /**
   * Gets the value of the dispBaseFareDiff property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDispBaseFareDiff() {
    return dispBaseFareDiff;
  }

  /**
   * Sets the value of the dispBaseFareDiff property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDispBaseFareDiff(JAXBElement<String> value) {
    this.dispBaseFareDiff = value;
  }

  /**
   * Gets the value of the dispBaseFarePrice property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDispBaseFarePrice() {
    return dispBaseFarePrice;
  }

  /**
   * Sets the value of the dispBaseFarePrice property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDispBaseFarePrice(JAXBElement<String> value) {
    this.dispBaseFarePrice = value;
  }

  /**
   * Gets the value of the dispGSTTax property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDispGSTTax() {
    return dispGSTTax;
  }

  /**
   * Sets the value of the dispGSTTax property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDispGSTTax(JAXBElement<String> value) {
    this.dispGSTTax = value;
  }

  /**
   * Gets the value of the dispGSTTotalTax property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDispGSTTotalTax() {
    return dispGSTTotalTax;
  }

  /**
   * Sets the value of the dispGSTTotalTax property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDispGSTTotalTax(JAXBElement<String> value) {
    this.dispGSTTotalTax = value;
  }

  /**
   * Gets the value of the dispPkgAmountWithPromotion property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDispPkgAmountWithPromotion() {
    return dispPkgAmountWithPromotion;
  }

  /**
   * Sets the value of the dispPkgAmountWithPromotion property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDispPkgAmountWithPromotion(JAXBElement<String> value) {
    this.dispPkgAmountWithPromotion = value;
  }

  /**
   * Gets the value of the dispPriceDiff property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDispPriceDiff() {
    return dispPriceDiff;
  }

  /**
   * Sets the value of the dispPriceDiff property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDispPriceDiff(JAXBElement<String> value) {
    this.dispPriceDiff = value;
  }

  /**
   * Gets the value of the dispPriceText property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDispPriceText() {
    return dispPriceText;
  }

  /**
   * Sets the value of the dispPriceText property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDispPriceText(JAXBElement<String> value) {
    this.dispPriceText = value;
  }

  /**
   * Gets the value of the dispPromotionTotalAmount property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDispPromotionTotalAmount() {
    return dispPromotionTotalAmount;
  }

  /**
   * Sets the value of the dispPromotionTotalAmount property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDispPromotionTotalAmount(JAXBElement<String> value) {
    this.dispPromotionTotalAmount = value;
  }

  /**
   * Gets the value of the dispStrikeoutFarePrice property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDispStrikeoutFarePrice() {
    return dispStrikeoutFarePrice;
  }

  /**
   * Sets the value of the dispStrikeoutFarePrice property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDispStrikeoutFarePrice(JAXBElement<String> value) {
    this.dispStrikeoutFarePrice = value;
  }

  /**
   * Gets the value of the dispStrikeoutTotalPrice property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDispStrikeoutTotalPrice() {
    return dispStrikeoutTotalPrice;
  }

  /**
   * Sets the value of the dispStrikeoutTotalPrice property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDispStrikeoutTotalPrice(JAXBElement<String> value) {
    this.dispStrikeoutTotalPrice = value;
  }

  /**
   * Gets the value of the dispTotalPrice property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDispTotalPrice() {
    return dispTotalPrice;
  }

  /**
   * Sets the value of the dispTotalPrice property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDispTotalPrice(JAXBElement<String> value) {
    this.dispTotalPrice = value;
  }

  /**
   * Gets the value of the dispTotalTax property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDispTotalTax() {
    return dispTotalTax;
  }

  /**
   * Sets the value of the dispTotalTax property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDispTotalTax(JAXBElement<String> value) {
    this.dispTotalTax = value;
  }

  /**
   * Gets the value of the dispTotalTaxwithoutGST property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDispTotalTaxwithoutGST() {
    return dispTotalTaxwithoutGST;
  }

  /**
   * Sets the value of the dispTotalTaxwithoutGST property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDispTotalTaxwithoutGST(JAXBElement<String> value) {
    this.dispTotalTaxwithoutGST = value;
  }

}
