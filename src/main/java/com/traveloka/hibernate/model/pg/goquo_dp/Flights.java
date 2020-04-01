package com.traveloka.hibernate.model.pg.goquo_dp;

import com.traveloka.hibernate.model.pg.goquo_dp_bal.ArrayOfGQInsuranceRes;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Flights complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Flights">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AFIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ActualFareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalFareInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AppliedPromotionInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PromotionInfo" minOccurs="0"/>
 *         &lt;element name="B2BDAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="B2BDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B2BIAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="B2BICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingCharges" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}BookingChargesInfo" minOccurs="0"/>
 *         &lt;element name="BookingError" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}FlightError" minOccurs="0"/>
 *         &lt;element name="CantSelectFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Child" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FGCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FGKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreeBaggageAllowances" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfFreeBaggageAllowanceEN" minOccurs="0"/>
 *         &lt;element name="GSTBreakDown" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfGSTBreakDownInfo" minOccurs="0"/>
 *         &lt;element name="IBNoStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Infant" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InsuranceGST" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}InsuranceGSTInfo" minOccurs="0"/>
 *         &lt;element name="InsuranceInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances}ArrayOfGQInsuranceRes" minOccurs="0"/>
 *         &lt;element name="IsChangeFlightBlock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCorporateFare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsFlightOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsInsuranceAdded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMinFareFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMultileg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsNoShowFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPromoFare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPromotionApplied" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowFareRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowPromotionFare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowPromotionInResults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSoldOutFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsStrikeoutApplied" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsUncombinedFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsValidPromoCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsVisaDepFlightSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsVisaMintimeFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarkupApplied" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfMarkupFlightEN" minOccurs="0"/>
 *         &lt;element name="MergedPriceInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PriceInformation" minOccurs="0"/>
 *         &lt;element name="MobAppLangText" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}MobileAppLangTextEN" minOccurs="0"/>
 *         &lt;element name="MobTermsandCondText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileInsuranceText" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfMobileAppLangTextEN" minOccurs="0"/>
 *         &lt;element name="NetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OBNoStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ParentGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PunitID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="SegLen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SegmentedFareBreakDown" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfSegmentFareInfoEN" minOccurs="0"/>
 *         &lt;element name="SpecialTypePax" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}SpecialTypePaxCount" minOccurs="0"/>
 *         &lt;element name="StrikeoutInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}StrikeoutInfo" minOccurs="0"/>
 *         &lt;element name="TaxBreakDown" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfTaxBreakDownInfo" minOccurs="0"/>
 *         &lt;element name="UnCombineFares" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfUnCombinedFareBasis" minOccurs="0"/>
 *         &lt;element name="UpdatedPriceInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PriceInformation" minOccurs="0"/>
 *         &lt;element name="UpdatedTaxMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VATTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WHTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dispCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inBoundFlights" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfFlightSegment" minOccurs="0"/>
 *         &lt;element name="outBoundFlights" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfFlightSegment" minOccurs="0"/>
 *         &lt;element name="priceInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PriceInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flights", propOrder = {
    "afIndex",
    "actualFareBasisCode",
    "additionalFareInfo",
    "adult",
    "appliedPromotionInfo",
    "b2BDAmount",
    "b2BDCode",
    "b2BIAmount",
    "b2BICode",
    "bookingCharges",
    "bookingError",
    "cantSelectFlight",
    "child",
    "classCode",
    "currencyCode",
    "fgCode",
    "fgKey",
    "fareBasisCode",
    "fareType",
    "flightClass",
    "flightDirection",
    "freeBaggageAllowances",
    "gstBreakDown",
    "ibNoStops",
    "infant",
    "insuranceGST",
    "insuranceInfo",
    "isChangeFlightBlock",
    "isCorporateFare",
    "isFlightOnly",
    "isInsuranceAdded",
    "isMinFareFlight",
    "isMultileg",
    "isNoShowFee",
    "isPromoFare",
    "isPromotionApplied",
    "isSelected",
    "isShowFareRules",
    "isShowPromotionFare",
    "isShowPromotionInResults",
    "isSoldOutFlight",
    "isStrikeoutApplied",
    "isUncombinedFlight",
    "isValidPromoCode",
    "isVisaDepFlightSelected",
    "isVisaMintimeFlight",
    "mk",
    "markupApplied",
    "mergedPriceInfo",
    "mobAppLangText",
    "mobTermsandCondText",
    "mobileInsuranceText",
    "netAmount",
    "obNoStops",
    "parentGroup",
    "promotionStatus",
    "punitID",
    "resultMsg",
    "segLen",
    "segmentedFareBreakDown",
    "specialTypePax",
    "strikeoutInfo",
    "taxBreakDown",
    "unCombineFares",
    "updatedPriceInfo",
    "updatedTaxMarkup",
    "vatTax",
    "whTax",
    "dispCurrencyCode",
    "inBoundFlights",
    "outBoundFlights",
    "priceInfo"
})
public class Flights {

  @XmlElement(name = "AFIndex")
  protected Integer afIndex;
  @XmlElementRef(name = "ActualFareBasisCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> actualFareBasisCode;
  @XmlElementRef(name = "AdditionalFareInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> additionalFareInfo;
  @XmlElement(name = "Adult")
  protected Integer adult;
  @XmlElementRef(name = "AppliedPromotionInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<PromotionInfo> appliedPromotionInfo;
  @XmlElement(name = "B2BDAmount")
  protected BigDecimal b2BDAmount;
  @XmlElementRef(name = "B2BDCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> b2BDCode;
  @XmlElement(name = "B2BIAmount")
  protected BigDecimal b2BIAmount;
  @XmlElementRef(name = "B2BICode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> b2BICode;
  @XmlElementRef(name = "BookingCharges", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<BookingChargesInfo> bookingCharges;
  @XmlElementRef(name = "BookingError", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<FlightError> bookingError;
  @XmlElement(name = "CantSelectFlight")
  protected Boolean cantSelectFlight;
  @XmlElement(name = "Child")
  protected Integer child;
  @XmlElementRef(name = "ClassCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> classCode;
  @XmlElementRef(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> currencyCode;
  @XmlElementRef(name = "FGCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> fgCode;
  @XmlElementRef(name = "FGKey", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> fgKey;
  @XmlElementRef(name = "FareBasisCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> fareBasisCode;
  @XmlElementRef(name = "FareType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> fareType;
  @XmlElementRef(name = "FlightClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> flightClass;
  @XmlElementRef(name = "FlightDirection", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> flightDirection;
  @XmlElementRef(name = "FreeBaggageAllowances", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<ArrayOfFreeBaggageAllowanceEN> freeBaggageAllowances;
  @XmlElementRef(name = "GSTBreakDown", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<ArrayOfGSTBreakDownInfo> gstBreakDown;
  @XmlElement(name = "IBNoStops")
  protected Integer ibNoStops;
  @XmlElement(name = "Infant")
  protected Integer infant;
  @XmlElementRef(name = "InsuranceGST", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<InsuranceGSTInfo> insuranceGST;
  @XmlElementRef(name = "InsuranceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<ArrayOfGQInsuranceRes> insuranceInfo;
  @XmlElement(name = "IsChangeFlightBlock")
  protected Boolean isChangeFlightBlock;
  @XmlElement(name = "IsCorporateFare")
  protected Boolean isCorporateFare;
  @XmlElement(name = "IsFlightOnly")
  protected Boolean isFlightOnly;
  @XmlElement(name = "IsInsuranceAdded")
  protected Boolean isInsuranceAdded;
  @XmlElement(name = "IsMinFareFlight")
  protected Boolean isMinFareFlight;
  @XmlElement(name = "IsMultileg")
  protected Boolean isMultileg;
  @XmlElement(name = "IsNoShowFee")
  protected Boolean isNoShowFee;
  @XmlElement(name = "IsPromoFare")
  protected Boolean isPromoFare;
  @XmlElement(name = "IsPromotionApplied")
  protected Boolean isPromotionApplied;
  @XmlElement(name = "IsSelected")
  protected Boolean isSelected;
  @XmlElement(name = "IsShowFareRules")
  protected Boolean isShowFareRules;
  @XmlElement(name = "IsShowPromotionFare")
  protected Boolean isShowPromotionFare;
  @XmlElement(name = "IsShowPromotionInResults")
  protected Boolean isShowPromotionInResults;
  @XmlElement(name = "IsSoldOutFlight")
  protected Boolean isSoldOutFlight;
  @XmlElement(name = "IsStrikeoutApplied")
  protected Boolean isStrikeoutApplied;
  @XmlElement(name = "IsUncombinedFlight")
  protected Boolean isUncombinedFlight;
  @XmlElement(name = "IsValidPromoCode")
  protected Boolean isValidPromoCode;
  @XmlElement(name = "IsVisaDepFlightSelected")
  protected Boolean isVisaDepFlightSelected;
  @XmlElement(name = "IsVisaMintimeFlight")
  protected Boolean isVisaMintimeFlight;
  @XmlElementRef(name = "MK", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> mk;
  @XmlElementRef(name = "MarkupApplied", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<ArrayOfMarkupFlightEN> markupApplied;
  @XmlElementRef(name = "MergedPriceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<PriceInformation> mergedPriceInfo;
  @XmlElementRef(name = "MobAppLangText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<MobileAppLangTextEN> mobAppLangText;
  @XmlElementRef(name = "MobTermsandCondText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> mobTermsandCondText;
  @XmlElementRef(name = "MobileInsuranceText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<ArrayOfMobileAppLangTextEN> mobileInsuranceText;
  @XmlElement(name = "NetAmount")
  protected BigDecimal netAmount;
  @XmlElement(name = "OBNoStops")
  protected Integer obNoStops;
  @XmlElementRef(name = "ParentGroup", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> parentGroup;
  @XmlElement(name = "PromotionStatus")
  protected Integer promotionStatus;
  @XmlElement(name = "PunitID")
  protected Integer punitID;
  @XmlElementRef(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<Result> resultMsg;
  @XmlElement(name = "SegLen")
  protected Integer segLen;
  @XmlElementRef(name = "SegmentedFareBreakDown", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<ArrayOfSegmentFareInfoEN> segmentedFareBreakDown;
  @XmlElementRef(name = "SpecialTypePax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<SpecialTypePaxCount> specialTypePax;
  @XmlElementRef(name = "StrikeoutInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<StrikeoutInfo> strikeoutInfo;
  @XmlElementRef(name = "TaxBreakDown", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<ArrayOfTaxBreakDownInfo> taxBreakDown;
  @XmlElementRef(name = "UnCombineFares", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<ArrayOfUnCombinedFareBasis> unCombineFares;
  @XmlElementRef(name = "UpdatedPriceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<PriceInformation> updatedPriceInfo;
  @XmlElement(name = "UpdatedTaxMarkup")
  protected BigDecimal updatedTaxMarkup;
  @XmlElement(name = "VATTax")
  protected BigDecimal vatTax;
  @XmlElement(name = "WHTax")
  protected BigDecimal whTax;
  @XmlElementRef(name = "dispCurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<String> dispCurrencyCode;
  @XmlElementRef(name = "inBoundFlights", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<ArrayOfFlightSegment> inBoundFlights;
  @XmlElementRef(name = "outBoundFlights", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<ArrayOfFlightSegment> outBoundFlights;
  @XmlElementRef(name = "priceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
  protected JAXBElement<PriceInformation> priceInfo;

  /**
   * Gets the value of the afIndex property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getAFIndex() {
    return afIndex;
  }

  /**
   * Sets the value of the afIndex property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setAFIndex(Integer value) {
    this.afIndex = value;
  }

  /**
   * Gets the value of the actualFareBasisCode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getActualFareBasisCode() {
    return actualFareBasisCode;
  }

  /**
   * Sets the value of the actualFareBasisCode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setActualFareBasisCode(JAXBElement<String> value) {
    this.actualFareBasisCode = value;
  }

  /**
   * Gets the value of the additionalFareInfo property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getAdditionalFareInfo() {
    return additionalFareInfo;
  }

  /**
   * Sets the value of the additionalFareInfo property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setAdditionalFareInfo(JAXBElement<String> value) {
    this.additionalFareInfo = value;
  }

  /**
   * Gets the value of the adult property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getAdult() {
    return adult;
  }

  /**
   * Sets the value of the adult property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setAdult(Integer value) {
    this.adult = value;
  }

  /**
   * Gets the value of the appliedPromotionInfo property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link PromotionInfo }{@code >}
   */
  public JAXBElement<PromotionInfo> getAppliedPromotionInfo() {
    return appliedPromotionInfo;
  }

  /**
   * Sets the value of the appliedPromotionInfo property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link PromotionInfo }{@code >}
   */
  public void setAppliedPromotionInfo(JAXBElement<PromotionInfo> value) {
    this.appliedPromotionInfo = value;
  }

  /**
   * Gets the value of the b2BDAmount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getB2BDAmount() {
    return b2BDAmount;
  }

  /**
   * Sets the value of the b2BDAmount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setB2BDAmount(BigDecimal value) {
    this.b2BDAmount = value;
  }

  /**
   * Gets the value of the b2BDCode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getB2BDCode() {
    return b2BDCode;
  }

  /**
   * Sets the value of the b2BDCode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setB2BDCode(JAXBElement<String> value) {
    this.b2BDCode = value;
  }

  /**
   * Gets the value of the b2BIAmount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getB2BIAmount() {
    return b2BIAmount;
  }

  /**
   * Sets the value of the b2BIAmount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setB2BIAmount(BigDecimal value) {
    this.b2BIAmount = value;
  }

  /**
   * Gets the value of the b2BICode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getB2BICode() {
    return b2BICode;
  }

  /**
   * Sets the value of the b2BICode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setB2BICode(JAXBElement<String> value) {
    this.b2BICode = value;
  }

  /**
   * Gets the value of the bookingCharges property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link BookingChargesInfo }{@code >}
   */
  public JAXBElement<BookingChargesInfo> getBookingCharges() {
    return bookingCharges;
  }

  /**
   * Sets the value of the bookingCharges property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link BookingChargesInfo }{@code >}
   */
  public void setBookingCharges(JAXBElement<BookingChargesInfo> value) {
    this.bookingCharges = value;
  }

  /**
   * Gets the value of the bookingError property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link FlightError }{@code >}
   */
  public JAXBElement<FlightError> getBookingError() {
    return bookingError;
  }

  /**
   * Sets the value of the bookingError property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link FlightError }{@code >}
   */
  public void setBookingError(JAXBElement<FlightError> value) {
    this.bookingError = value;
  }

  /**
   * Gets the value of the cantSelectFlight property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isCantSelectFlight() {
    return cantSelectFlight;
  }

  /**
   * Sets the value of the cantSelectFlight property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setCantSelectFlight(Boolean value) {
    this.cantSelectFlight = value;
  }

  /**
   * Gets the value of the child property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getChild() {
    return child;
  }

  /**
   * Sets the value of the child property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setChild(Integer value) {
    this.child = value;
  }

  /**
   * Gets the value of the classCode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getClassCode() {
    return classCode;
  }

  /**
   * Sets the value of the classCode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setClassCode(JAXBElement<String> value) {
    this.classCode = value;
  }

  /**
   * Gets the value of the currencyCode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getCurrencyCode() {
    return currencyCode;
  }

  /**
   * Sets the value of the currencyCode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setCurrencyCode(JAXBElement<String> value) {
    this.currencyCode = value;
  }

  /**
   * Gets the value of the fgCode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getFGCode() {
    return fgCode;
  }

  /**
   * Sets the value of the fgCode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setFGCode(JAXBElement<String> value) {
    this.fgCode = value;
  }

  /**
   * Gets the value of the fgKey property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getFGKey() {
    return fgKey;
  }

  /**
   * Sets the value of the fgKey property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setFGKey(JAXBElement<String> value) {
    this.fgKey = value;
  }

  /**
   * Gets the value of the fareBasisCode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getFareBasisCode() {
    return fareBasisCode;
  }

  /**
   * Sets the value of the fareBasisCode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setFareBasisCode(JAXBElement<String> value) {
    this.fareBasisCode = value;
  }

  /**
   * Gets the value of the fareType property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getFareType() {
    return fareType;
  }

  /**
   * Sets the value of the fareType property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setFareType(JAXBElement<String> value) {
    this.fareType = value;
  }

  /**
   * Gets the value of the flightClass property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getFlightClass() {
    return flightClass;
  }

  /**
   * Sets the value of the flightClass property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setFlightClass(JAXBElement<String> value) {
    this.flightClass = value;
  }

  /**
   * Gets the value of the flightDirection property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getFlightDirection() {
    return flightDirection;
  }

  /**
   * Sets the value of the flightDirection property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setFlightDirection(JAXBElement<String> value) {
    this.flightDirection = value;
  }

  /**
   * Gets the value of the freeBaggageAllowances property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ArrayOfFreeBaggageAllowanceEN }{@code >}
   */
  public JAXBElement<ArrayOfFreeBaggageAllowanceEN> getFreeBaggageAllowances() {
    return freeBaggageAllowances;
  }

  /**
   * Sets the value of the freeBaggageAllowances property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ArrayOfFreeBaggageAllowanceEN }{@code >}
   */
  public void setFreeBaggageAllowances(JAXBElement<ArrayOfFreeBaggageAllowanceEN> value) {
    this.freeBaggageAllowances = value;
  }

  /**
   * Gets the value of the gstBreakDown property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ArrayOfGSTBreakDownInfo }{@code >}
   */
  public JAXBElement<ArrayOfGSTBreakDownInfo> getGSTBreakDown() {
    return gstBreakDown;
  }

  /**
   * Sets the value of the gstBreakDown property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ArrayOfGSTBreakDownInfo }{@code >}
   */
  public void setGSTBreakDown(JAXBElement<ArrayOfGSTBreakDownInfo> value) {
    this.gstBreakDown = value;
  }

  /**
   * Gets the value of the ibNoStops property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getIBNoStops() {
    return ibNoStops;
  }

  /**
   * Sets the value of the ibNoStops property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setIBNoStops(Integer value) {
    this.ibNoStops = value;
  }

  /**
   * Gets the value of the infant property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getInfant() {
    return infant;
  }

  /**
   * Sets the value of the infant property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setInfant(Integer value) {
    this.infant = value;
  }

  /**
   * Gets the value of the insuranceGST property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link InsuranceGSTInfo }{@code >}
   */
  public JAXBElement<InsuranceGSTInfo> getInsuranceGST() {
    return insuranceGST;
  }

  /**
   * Sets the value of the insuranceGST property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link InsuranceGSTInfo }{@code >}
   */
  public void setInsuranceGST(JAXBElement<InsuranceGSTInfo> value) {
    this.insuranceGST = value;
  }

  /**
   * Gets the value of the insuranceInfo property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ArrayOfGQInsuranceRes }{@code >}
   */
  public JAXBElement<ArrayOfGQInsuranceRes> getInsuranceInfo() {
    return insuranceInfo;
  }

  /**
   * Sets the value of the insuranceInfo property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ArrayOfGQInsuranceRes }{@code >}
   */
  public void setInsuranceInfo(JAXBElement<ArrayOfGQInsuranceRes> value) {
    this.insuranceInfo = value;
  }

  /**
   * Gets the value of the isChangeFlightBlock property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsChangeFlightBlock() {
    return isChangeFlightBlock;
  }

  /**
   * Sets the value of the isChangeFlightBlock property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsChangeFlightBlock(Boolean value) {
    this.isChangeFlightBlock = value;
  }

  /**
   * Gets the value of the isCorporateFare property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsCorporateFare() {
    return isCorporateFare;
  }

  /**
   * Sets the value of the isCorporateFare property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsCorporateFare(Boolean value) {
    this.isCorporateFare = value;
  }

  /**
   * Gets the value of the isFlightOnly property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsFlightOnly() {
    return isFlightOnly;
  }

  /**
   * Sets the value of the isFlightOnly property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsFlightOnly(Boolean value) {
    this.isFlightOnly = value;
  }

  /**
   * Gets the value of the isInsuranceAdded property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsInsuranceAdded() {
    return isInsuranceAdded;
  }

  /**
   * Sets the value of the isInsuranceAdded property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsInsuranceAdded(Boolean value) {
    this.isInsuranceAdded = value;
  }

  /**
   * Gets the value of the isMinFareFlight property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsMinFareFlight() {
    return isMinFareFlight;
  }

  /**
   * Sets the value of the isMinFareFlight property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsMinFareFlight(Boolean value) {
    this.isMinFareFlight = value;
  }

  /**
   * Gets the value of the isMultileg property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsMultileg() {
    return isMultileg;
  }

  /**
   * Sets the value of the isMultileg property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsMultileg(Boolean value) {
    this.isMultileg = value;
  }

  /**
   * Gets the value of the isNoShowFee property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsNoShowFee() {
    return isNoShowFee;
  }

  /**
   * Sets the value of the isNoShowFee property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsNoShowFee(Boolean value) {
    this.isNoShowFee = value;
  }

  /**
   * Gets the value of the isPromoFare property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsPromoFare() {
    return isPromoFare;
  }

  /**
   * Sets the value of the isPromoFare property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsPromoFare(Boolean value) {
    this.isPromoFare = value;
  }

  /**
   * Gets the value of the isPromotionApplied property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsPromotionApplied() {
    return isPromotionApplied;
  }

  /**
   * Sets the value of the isPromotionApplied property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsPromotionApplied(Boolean value) {
    this.isPromotionApplied = value;
  }

  /**
   * Gets the value of the isSelected property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsSelected() {
    return isSelected;
  }

  /**
   * Sets the value of the isSelected property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsSelected(Boolean value) {
    this.isSelected = value;
  }

  /**
   * Gets the value of the isShowFareRules property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsShowFareRules() {
    return isShowFareRules;
  }

  /**
   * Sets the value of the isShowFareRules property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsShowFareRules(Boolean value) {
    this.isShowFareRules = value;
  }

  /**
   * Gets the value of the isShowPromotionFare property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsShowPromotionFare() {
    return isShowPromotionFare;
  }

  /**
   * Sets the value of the isShowPromotionFare property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsShowPromotionFare(Boolean value) {
    this.isShowPromotionFare = value;
  }

  /**
   * Gets the value of the isShowPromotionInResults property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsShowPromotionInResults() {
    return isShowPromotionInResults;
  }

  /**
   * Sets the value of the isShowPromotionInResults property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsShowPromotionInResults(Boolean value) {
    this.isShowPromotionInResults = value;
  }

  /**
   * Gets the value of the isSoldOutFlight property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsSoldOutFlight() {
    return isSoldOutFlight;
  }

  /**
   * Sets the value of the isSoldOutFlight property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsSoldOutFlight(Boolean value) {
    this.isSoldOutFlight = value;
  }

  /**
   * Gets the value of the isStrikeoutApplied property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsStrikeoutApplied() {
    return isStrikeoutApplied;
  }

  /**
   * Sets the value of the isStrikeoutApplied property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsStrikeoutApplied(Boolean value) {
    this.isStrikeoutApplied = value;
  }

  /**
   * Gets the value of the isUncombinedFlight property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsUncombinedFlight() {
    return isUncombinedFlight;
  }

  /**
   * Sets the value of the isUncombinedFlight property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsUncombinedFlight(Boolean value) {
    this.isUncombinedFlight = value;
  }

  /**
   * Gets the value of the isValidPromoCode property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsValidPromoCode() {
    return isValidPromoCode;
  }

  /**
   * Sets the value of the isValidPromoCode property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsValidPromoCode(Boolean value) {
    this.isValidPromoCode = value;
  }

  /**
   * Gets the value of the isVisaDepFlightSelected property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsVisaDepFlightSelected() {
    return isVisaDepFlightSelected;
  }

  /**
   * Sets the value of the isVisaDepFlightSelected property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsVisaDepFlightSelected(Boolean value) {
    this.isVisaDepFlightSelected = value;
  }

  /**
   * Gets the value of the isVisaMintimeFlight property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsVisaMintimeFlight() {
    return isVisaMintimeFlight;
  }

  /**
   * Sets the value of the isVisaMintimeFlight property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsVisaMintimeFlight(Boolean value) {
    this.isVisaMintimeFlight = value;
  }

  /**
   * Gets the value of the mk property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getMK() {
    return mk;
  }

  /**
   * Sets the value of the mk property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setMK(JAXBElement<String> value) {
    this.mk = value;
  }

  /**
   * Gets the value of the markupApplied property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ArrayOfMarkupFlightEN }{@code >}
   */
  public JAXBElement<ArrayOfMarkupFlightEN> getMarkupApplied() {
    return markupApplied;
  }

  /**
   * Sets the value of the markupApplied property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ArrayOfMarkupFlightEN }{@code >}
   */
  public void setMarkupApplied(JAXBElement<ArrayOfMarkupFlightEN> value) {
    this.markupApplied = value;
  }

  /**
   * Gets the value of the mergedPriceInfo property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link PriceInformation }{@code >}
   */
  public JAXBElement<PriceInformation> getMergedPriceInfo() {
    return mergedPriceInfo;
  }

  /**
   * Sets the value of the mergedPriceInfo property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link PriceInformation }{@code >}
   */
  public void setMergedPriceInfo(JAXBElement<PriceInformation> value) {
    this.mergedPriceInfo = value;
  }

  /**
   * Gets the value of the mobAppLangText property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link MobileAppLangTextEN }{@code >}
   */
  public JAXBElement<MobileAppLangTextEN> getMobAppLangText() {
    return mobAppLangText;
  }

  /**
   * Sets the value of the mobAppLangText property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link MobileAppLangTextEN }{@code >}
   */
  public void setMobAppLangText(JAXBElement<MobileAppLangTextEN> value) {
    this.mobAppLangText = value;
  }

  /**
   * Gets the value of the mobTermsandCondText property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getMobTermsandCondText() {
    return mobTermsandCondText;
  }

  /**
   * Sets the value of the mobTermsandCondText property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setMobTermsandCondText(JAXBElement<String> value) {
    this.mobTermsandCondText = value;
  }

  /**
   * Gets the value of the mobileInsuranceText property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ArrayOfMobileAppLangTextEN }{@code >}
   */
  public JAXBElement<ArrayOfMobileAppLangTextEN> getMobileInsuranceText() {
    return mobileInsuranceText;
  }

  /**
   * Sets the value of the mobileInsuranceText property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ArrayOfMobileAppLangTextEN }{@code >}
   */
  public void setMobileInsuranceText(JAXBElement<ArrayOfMobileAppLangTextEN> value) {
    this.mobileInsuranceText = value;
  }

  /**
   * Gets the value of the netAmount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getNetAmount() {
    return netAmount;
  }

  /**
   * Sets the value of the netAmount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setNetAmount(BigDecimal value) {
    this.netAmount = value;
  }

  /**
   * Gets the value of the obNoStops property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getOBNoStops() {
    return obNoStops;
  }

  /**
   * Sets the value of the obNoStops property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setOBNoStops(Integer value) {
    this.obNoStops = value;
  }

  /**
   * Gets the value of the parentGroup property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getParentGroup() {
    return parentGroup;
  }

  /**
   * Sets the value of the parentGroup property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setParentGroup(JAXBElement<String> value) {
    this.parentGroup = value;
  }

  /**
   * Gets the value of the promotionStatus property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getPromotionStatus() {
    return promotionStatus;
  }

  /**
   * Sets the value of the promotionStatus property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setPromotionStatus(Integer value) {
    this.promotionStatus = value;
  }

  /**
   * Gets the value of the punitID property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getPunitID() {
    return punitID;
  }

  /**
   * Sets the value of the punitID property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setPunitID(Integer value) {
    this.punitID = value;
  }

  /**
   * Gets the value of the resultMsg property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link Result }{@code >}
   */
  public JAXBElement<Result> getResultMsg() {
    return resultMsg;
  }

  /**
   * Sets the value of the resultMsg property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link Result }{@code >}
   */
  public void setResultMsg(JAXBElement<Result> value) {
    this.resultMsg = value;
  }

  /**
   * Gets the value of the segLen property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getSegLen() {
    return segLen;
  }

  /**
   * Sets the value of the segLen property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setSegLen(Integer value) {
    this.segLen = value;
  }

  /**
   * Gets the value of the segmentedFareBreakDown property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ArrayOfSegmentFareInfoEN }{@code >}
   */
  public JAXBElement<ArrayOfSegmentFareInfoEN> getSegmentedFareBreakDown() {
    return segmentedFareBreakDown;
  }

  /**
   * Sets the value of the segmentedFareBreakDown property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ArrayOfSegmentFareInfoEN }{@code >}
   */
  public void setSegmentedFareBreakDown(JAXBElement<ArrayOfSegmentFareInfoEN> value) {
    this.segmentedFareBreakDown = value;
  }

  /**
   * Gets the value of the specialTypePax property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link SpecialTypePaxCount }{@code >}
   */
  public JAXBElement<SpecialTypePaxCount> getSpecialTypePax() {
    return specialTypePax;
  }

  /**
   * Sets the value of the specialTypePax property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link SpecialTypePaxCount }{@code >}
   */
  public void setSpecialTypePax(JAXBElement<SpecialTypePaxCount> value) {
    this.specialTypePax = value;
  }

  /**
   * Gets the value of the strikeoutInfo property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link StrikeoutInfo }{@code >}
   */
  public JAXBElement<StrikeoutInfo> getStrikeoutInfo() {
    return strikeoutInfo;
  }

  /**
   * Sets the value of the strikeoutInfo property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link StrikeoutInfo }{@code >}
   */
  public void setStrikeoutInfo(JAXBElement<StrikeoutInfo> value) {
    this.strikeoutInfo = value;
  }

  /**
   * Gets the value of the taxBreakDown property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ArrayOfTaxBreakDownInfo }{@code >}
   */
  public JAXBElement<ArrayOfTaxBreakDownInfo> getTaxBreakDown() {
    return taxBreakDown;
  }

  /**
   * Sets the value of the taxBreakDown property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ArrayOfTaxBreakDownInfo }{@code >}
   */
  public void setTaxBreakDown(JAXBElement<ArrayOfTaxBreakDownInfo> value) {
    this.taxBreakDown = value;
  }

  /**
   * Gets the value of the unCombineFares property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ArrayOfUnCombinedFareBasis }{@code >}
   */
  public JAXBElement<ArrayOfUnCombinedFareBasis> getUnCombineFares() {
    return unCombineFares;
  }

  /**
   * Sets the value of the unCombineFares property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ArrayOfUnCombinedFareBasis }{@code >}
   */
  public void setUnCombineFares(JAXBElement<ArrayOfUnCombinedFareBasis> value) {
    this.unCombineFares = value;
  }

  /**
   * Gets the value of the updatedPriceInfo property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link PriceInformation }{@code >}
   */
  public JAXBElement<PriceInformation> getUpdatedPriceInfo() {
    return updatedPriceInfo;
  }

  /**
   * Sets the value of the updatedPriceInfo property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link PriceInformation }{@code >}
   */
  public void setUpdatedPriceInfo(JAXBElement<PriceInformation> value) {
    this.updatedPriceInfo = value;
  }

  /**
   * Gets the value of the updatedTaxMarkup property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getUpdatedTaxMarkup() {
    return updatedTaxMarkup;
  }

  /**
   * Sets the value of the updatedTaxMarkup property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setUpdatedTaxMarkup(BigDecimal value) {
    this.updatedTaxMarkup = value;
  }

  /**
   * Gets the value of the vatTax property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getVATTax() {
    return vatTax;
  }

  /**
   * Sets the value of the vatTax property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setVATTax(BigDecimal value) {
    this.vatTax = value;
  }

  /**
   * Gets the value of the whTax property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getWHTax() {
    return whTax;
  }

  /**
   * Sets the value of the whTax property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setWHTax(BigDecimal value) {
    this.whTax = value;
  }

  /**
   * Gets the value of the dispCurrencyCode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDispCurrencyCode() {
    return dispCurrencyCode;
  }

  /**
   * Sets the value of the dispCurrencyCode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDispCurrencyCode(JAXBElement<String> value) {
    this.dispCurrencyCode = value;
  }

  /**
   * Gets the value of the inBoundFlights property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ArrayOfFlightSegment }{@code >}
   */
  public JAXBElement<ArrayOfFlightSegment> getInBoundFlights() {
    return inBoundFlights;
  }

  /**
   * Sets the value of the inBoundFlights property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ArrayOfFlightSegment }{@code >}
   */
  public void setInBoundFlights(JAXBElement<ArrayOfFlightSegment> value) {
    this.inBoundFlights = value;
  }

  /**
   * Gets the value of the outBoundFlights property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ArrayOfFlightSegment }{@code >}
   */
  public JAXBElement<ArrayOfFlightSegment> getOutBoundFlights() {
    return outBoundFlights;
  }

  /**
   * Sets the value of the outBoundFlights property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ArrayOfFlightSegment }{@code >}
   */
  public void setOutBoundFlights(JAXBElement<ArrayOfFlightSegment> value) {
    this.outBoundFlights = value;
  }

  /**
   * Gets the value of the priceInfo property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link PriceInformation }{@code >}
   */
  public JAXBElement<PriceInformation> getPriceInfo() {
    return priceInfo;
  }

  /**
   * Sets the value of the priceInfo property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link PriceInformation }{@code >}
   */
  public void setPriceInfo(JAXBElement<PriceInformation> value) {
    this.priceInfo = value;
  }

}
