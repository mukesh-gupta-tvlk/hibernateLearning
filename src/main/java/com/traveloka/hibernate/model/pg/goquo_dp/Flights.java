package com.traveloka.hibernate.model.pg.goquo_dp;

import com.traveloka.hibernate.model.pg.goquo_dp_bal.ArrayOfGQInsuranceRes;
import lombok.Data;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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

@Data
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
  @XmlElement(name = "ActualFareBasisCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String actualFareBasisCode;
  @XmlElement(name = "AdditionalFareInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String additionalFareInfo;
  @XmlElement(name = "Adult")
  protected Integer adult;
  @XmlElement(name = "AppliedPromotionInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected PromotionInfo appliedPromotionInfo;
  @XmlElement(name = "B2BDAmount")
  protected BigDecimal b2BDAmount;
  @XmlElement(name = "B2BDCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String b2BDCode;
  @XmlElement(name = "B2BIAmount")
  protected BigDecimal b2BIAmount;
  @XmlElement(name = "B2BICode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String b2BICode;
  @XmlElement(name = "BookingCharges", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected BookingChargesInfo bookingCharges;
  @XmlElement(name = "BookingError", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected FlightError bookingError;
  @XmlElement(name = "CantSelectFlight")
  protected Boolean cantSelectFlight;
  @XmlElement(name = "Child")
  protected Integer child;
  @XmlElement(name = "ClassCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String classCode;
  @XmlElement(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String currencyCode;
  @XmlElement(name = "FGCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String fgCode;
  @XmlElement(name = "FGKey", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String fgKey;
  @XmlElement(name = "FareBasisCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String fareBasisCode;
  @XmlElement(name = "FareType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String fareType;
  @XmlElement(name = "FlightClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String flightClass;
  @XmlElement(name = "FlightDirection", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String flightDirection;
  @XmlElement(name = "FreeBaggageAllowances", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfFreeBaggageAllowanceEN freeBaggageAllowances;
  @XmlElement(name = "GSTBreakDown", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfGSTBreakDownInfo gstBreakDown;
  @XmlElement(name = "IBNoStops")
  protected Integer ibNoStops;
  @XmlElement(name = "Infant")
  protected Integer infant;
  @XmlElement(name = "InsuranceGST", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected InsuranceGSTInfo insuranceGST;
  @XmlElement(name = "InsuranceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfGQInsuranceRes insuranceInfo;
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
  @XmlElement(name = "MK", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String mk;
  @XmlElement(name = "MarkupApplied", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfMarkupFlightEN markupApplied;
  @XmlElement(name = "MergedPriceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected PriceInformation mergedPriceInfo;
  @XmlElement(name = "MobAppLangText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected MobileAppLangTextEN mobAppLangText;
  @XmlElement(name = "MobTermsandCondText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String mobTermsandCondText;
  @XmlElement(name = "MobileInsuranceText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfMobileAppLangTextEN mobileInsuranceText;
  @XmlElement(name = "NetAmount")
  protected BigDecimal netAmount;
  @XmlElement(name = "OBNoStops")
  protected Integer obNoStops;
  @XmlElement(name = "ParentGroup", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String parentGroup;
  @XmlElement(name = "PromotionStatus")
  protected Integer promotionStatus;
  @XmlElement(name = "PunitID")
  protected Integer punitID;
  @XmlElement(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected Result resultMsg;
  @XmlElement(name = "SegLen")
  protected Integer segLen;
  @XmlElement(name = "SegmentedFareBreakDown", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfSegmentFareInfoEN segmentedFareBreakDown;
  @XmlElement(name = "SpecialTypePax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected SpecialTypePaxCount specialTypePax;
  @XmlElement(name = "StrikeoutInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected StrikeoutInfo strikeoutInfo;
  @XmlElement(name = "TaxBreakDown", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfTaxBreakDownInfo taxBreakDown;
  @XmlElement(name = "UnCombineFares", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfUnCombinedFareBasis unCombineFares;
  @XmlElement(name = "UpdatedPriceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected PriceInformation updatedPriceInfo;
  @XmlElement(name = "UpdatedTaxMarkup")
  protected BigDecimal updatedTaxMarkup;
  @XmlElement(name = "VATTax")
  protected BigDecimal vatTax;
  @XmlElement(name = "WHTax")
  protected BigDecimal whTax;
  @XmlElement(name = "dispCurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispCurrencyCode;
  @XmlElement(name = "inBoundFlights", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfFlightSegment inBoundFlights;
  @XmlElement(name = "outBoundFlights", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfFlightSegment outBoundFlights;
  @XmlElement(name = "priceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected PriceInformation priceInfo;
}
