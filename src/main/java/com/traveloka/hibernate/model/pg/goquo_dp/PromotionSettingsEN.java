package com.traveloka.hibernate.model.pg.goquo_dp;

import lombok.Data;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PromotionSettingsEN complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PromotionSettingsEN">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}PromotionCodesEN">
 *       &lt;sequence>
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirlineCodeMatchingSegments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ApplicableCardTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicableCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicablePaxCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ApplicablePaymentMethods" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplyToAdult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApplyToAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplyToChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApplyToDisabledPax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApplyToGovernmentPax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApplyToInfant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApplyToPassenger" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ApplyToSector" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ApplyToSnrCitizenPax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApplyToStudentPax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApplyToWomenPax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BookingChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingClassMatchingSegments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BookingDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BookingDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BuyPax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BuyandGetCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalculateToAdult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CalculateToChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CalculateToDisabledPax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CalculateToGovernmentPax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CalculateToInfant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CalculateToSnrCitizenPax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CalculateToStudentPax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CalculateToWomenPax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerUserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DepartureDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DepartureDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DepartureDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExcludeRoutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareBasisCodeMatchingSegments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FlightNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightNoMatchingSegments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsAllAirlineCodes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAllBookingClass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAllFareBasisCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAllFlightNumbers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCancellationEligible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsChangeDateEligible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsLimitMaxStay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMultipleDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPercentage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRemoveNonApplicableCardTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRemoveNonApplicablePaymentMethods" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRoundingAdjustSummaryAmt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSendSabreRemarks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowInResultPage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowPromotionFare" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="JourneyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LimitOncePerDevice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MDBookingClassAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxAdultCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxBookingLimitPerCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxChildCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxInfantCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxStay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinBookingAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MinBookingAmtCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinimumAdultCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinimumChildCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinimumInfantCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PromoPax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PromotionCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionCodeCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PromotionCodeList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionCodePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionValidationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionValidityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReturnDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReturnDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Routes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoutesRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SabreCommercialCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SabreCommercialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SabreRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionSettingsEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "airlineCode",
    "airlineCodeMatchingSegments",
    "amount",
    "applicableCardTypes",
    "applicableCurrency",
    "applicablePaxCount",
    "applicablePaymentMethods",
    "applyToAdult",
    "applyToAmount",
    "applyToChild",
    "applyToDisabledPax",
    "applyToGovernmentPax",
    "applyToInfant",
    "applyToPassenger",
    "applyToSector",
    "applyToSnrCitizenPax",
    "applyToStudentPax",
    "applyToWomenPax",
    "bookingChannel",
    "bookingClass",
    "bookingClassMatchingSegments",
    "bookingDateFrom",
    "bookingDateTo",
    "buyPax",
    "buyandGetCategory",
    "calculateToAdult",
    "calculateToChild",
    "calculateToDisabledPax",
    "calculateToGovernmentPax",
    "calculateToInfant",
    "calculateToSnrCitizenPax",
    "calculateToStudentPax",
    "calculateToWomenPax",
    "currencyCode",
    "customerUserId",
    "departureDateFrom",
    "departureDateTo",
    "departureDays",
    "excludeRoutes",
    "fareBasisCode",
    "fareBasisCodeMatchingSegments",
    "flightNo",
    "flightNoMatchingSegments",
    "isAllAirlineCodes",
    "isAllBookingClass",
    "isAllFareBasisCode",
    "isAllFlightNumbers",
    "isCancellationEligible",
    "isChangeDateEligible",
    "isDiscount",
    "isLimitMaxStay",
    "isMultipleDiscount",
    "isPercentage",
    "isRemoveNonApplicableCardTypes",
    "isRemoveNonApplicablePaymentMethods",
    "isRoundingAdjustSummaryAmt",
    "isSendSabreRemarks",
    "isShowInResultPage",
    "isShowPromotionFare",
    "journeyType",
    "limitOncePerDevice",
    "mdBookingClassAmount",
    "maxAdultCount",
    "maxBookingLimitPerCode",
    "maxChildCount",
    "maxInfantCount",
    "maxStay",
    "minBookingAmt",
    "minBookingAmtCurrency",
    "minimumAdultCount",
    "minimumChildCount",
    "minimumInfantCount",
    "promoPax",
    "promotionCategory",
    "promotionCodeCount",
    "promotionCodeList",
    "promotionCodePrefix",
    "promotionName",
    "promotionValidationName",
    "promotionValidityType",
    "returnDateFrom",
    "returnDateTo",
    "returnDays",
    "routes",
    "routesRegion",
    "sabreCommercialCode",
    "sabreCommercialName",
    "sabreRemarks"
})
public class PromotionSettingsEN
    extends PromotionCodesEN {

  @XmlElement(name = "AirlineCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String airlineCode;
  @XmlElement(name = "AirlineCodeMatchingSegments")
  protected Integer airlineCodeMatchingSegments;
  @XmlElement(name = "Amount")
  protected BigDecimal amount;
  @XmlElement(name = "ApplicableCardTypes", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String applicableCardTypes;
  @XmlElement(name = "ApplicableCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String applicableCurrency;
  @XmlElement(name = "ApplicablePaxCount")
  protected Integer applicablePaxCount;
  @XmlElement(name = "ApplicablePaymentMethods", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String applicablePaymentMethods;
  @XmlElement(name = "ApplyToAdult")
  protected Boolean applyToAdult;
  @XmlElement(name = "ApplyToAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String applyToAmount;
  @XmlElement(name = "ApplyToChild")
  protected Boolean applyToChild;
  @XmlElement(name = "ApplyToDisabledPax")
  protected Boolean applyToDisabledPax;
  @XmlElement(name = "ApplyToGovernmentPax")
  protected Boolean applyToGovernmentPax;
  @XmlElement(name = "ApplyToInfant")
  protected Boolean applyToInfant;
  @XmlElement(name = "ApplyToPassenger")
  protected Integer applyToPassenger;
  @XmlElement(name = "ApplyToSector")
  protected Integer applyToSector;
  @XmlElement(name = "ApplyToSnrCitizenPax")
  protected Boolean applyToSnrCitizenPax;
  @XmlElement(name = "ApplyToStudentPax")
  protected Boolean applyToStudentPax;
  @XmlElement(name = "ApplyToWomenPax")
  protected Boolean applyToWomenPax;
  @XmlElement(name = "BookingChannel", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String bookingChannel;
  @XmlElement(name = "BookingClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String bookingClass;
  @XmlElement(name = "BookingClassMatchingSegments")
  protected Integer bookingClassMatchingSegments;
  @XmlElement(name = "BookingDateFrom")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar bookingDateFrom;
  @XmlElement(name = "BookingDateTo")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar bookingDateTo;
  @XmlElement(name = "BuyPax")
  protected Integer buyPax;
  @XmlElement(name = "BuyandGetCategory", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String buyandGetCategory;
  @XmlElement(name = "CalculateToAdult")
  protected Boolean calculateToAdult;
  @XmlElement(name = "CalculateToChild")
  protected Boolean calculateToChild;
  @XmlElement(name = "CalculateToDisabledPax")
  protected Boolean calculateToDisabledPax;
  @XmlElement(name = "CalculateToGovernmentPax")
  protected Boolean calculateToGovernmentPax;
  @XmlElement(name = "CalculateToInfant")
  protected Boolean calculateToInfant;
  @XmlElement(name = "CalculateToSnrCitizenPax")
  protected Boolean calculateToSnrCitizenPax;
  @XmlElement(name = "CalculateToStudentPax")
  protected Boolean calculateToStudentPax;
  @XmlElement(name = "CalculateToWomenPax")
  protected Boolean calculateToWomenPax;
  @XmlElement(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String currencyCode;
  @XmlElement(name = "CustomerUserId")
  protected Integer customerUserId;
  @XmlElement(name = "DepartureDateFrom")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar departureDateFrom;
  @XmlElement(name = "DepartureDateTo")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar departureDateTo;
  @XmlElement(name = "DepartureDays", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String departureDays;
  @XmlElement(name = "ExcludeRoutes", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String excludeRoutes;
  @XmlElement(name = "FareBasisCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String fareBasisCode;
  @XmlElement(name = "FareBasisCodeMatchingSegments")
  protected Integer fareBasisCodeMatchingSegments;
  @XmlElement(name = "FlightNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String flightNo;
  @XmlElement(name = "FlightNoMatchingSegments")
  protected Integer flightNoMatchingSegments;
  @XmlElement(name = "IsAllAirlineCodes")
  protected Boolean isAllAirlineCodes;
  @XmlElement(name = "IsAllBookingClass")
  protected Boolean isAllBookingClass;
  @XmlElement(name = "IsAllFareBasisCode")
  protected Boolean isAllFareBasisCode;
  @XmlElement(name = "IsAllFlightNumbers")
  protected Boolean isAllFlightNumbers;
  @XmlElement(name = "IsCancellationEligible")
  protected Boolean isCancellationEligible;
  @XmlElement(name = "IsChangeDateEligible")
  protected Boolean isChangeDateEligible;
  @XmlElement(name = "IsDiscount")
  protected Boolean isDiscount;
  @XmlElement(name = "IsLimitMaxStay")
  protected Boolean isLimitMaxStay;
  @XmlElement(name = "IsMultipleDiscount")
  protected Boolean isMultipleDiscount;
  @XmlElement(name = "IsPercentage")
  protected Boolean isPercentage;
  @XmlElement(name = "IsRemoveNonApplicableCardTypes")
  protected Boolean isRemoveNonApplicableCardTypes;
  @XmlElement(name = "IsRemoveNonApplicablePaymentMethods")
  protected Boolean isRemoveNonApplicablePaymentMethods;
  @XmlElement(name = "IsRoundingAdjustSummaryAmt")
  protected Boolean isRoundingAdjustSummaryAmt;
  @XmlElement(name = "IsSendSabreRemarks")
  protected Boolean isSendSabreRemarks;
  @XmlElement(name = "IsShowInResultPage")
  protected Boolean isShowInResultPage;
  @XmlElement(name = "IsShowPromotionFare")
  protected Boolean isShowPromotionFare;
  @XmlElement(name = "JourneyType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String journeyType;
  @XmlElement(name = "LimitOncePerDevice")
  protected Boolean limitOncePerDevice;
  @XmlElement(name = "MDBookingClassAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String mdBookingClassAmount;
  @XmlElement(name = "MaxAdultCount")
  protected Integer maxAdultCount;
  @XmlElement(name = "MaxBookingLimitPerCode")
  protected Integer maxBookingLimitPerCode;
  @XmlElement(name = "MaxChildCount")
  protected Integer maxChildCount;
  @XmlElement(name = "MaxInfantCount")
  protected Integer maxInfantCount;
  @XmlElement(name = "MaxStay")
  protected Integer maxStay;
  @XmlElement(name = "MinBookingAmt")
  protected BigDecimal minBookingAmt;
  @XmlElement(name = "MinBookingAmtCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String minBookingAmtCurrency;
  @XmlElement(name = "MinimumAdultCount")
  protected Integer minimumAdultCount;
  @XmlElement(name = "MinimumChildCount")
  protected Integer minimumChildCount;
  @XmlElement(name = "MinimumInfantCount")
  protected Integer minimumInfantCount;
  @XmlElement(name = "PromoPax")
  protected Integer promoPax;
  @XmlElement(name = "PromotionCategory", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String promotionCategory;
  @XmlElement(name = "PromotionCodeCount")
  protected Integer promotionCodeCount;
  @XmlElement(name = "PromotionCodeList", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String promotionCodeList;
  @XmlElement(name = "PromotionCodePrefix", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String promotionCodePrefix;
  @XmlElement(name = "PromotionName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String promotionName;
  @XmlElement(name = "PromotionValidationName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String promotionValidationName;
  @XmlElement(name = "PromotionValidityType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String promotionValidityType;
  @XmlElement(name = "ReturnDateFrom")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar returnDateFrom;
  @XmlElement(name = "ReturnDateTo")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar returnDateTo;
  @XmlElement(name = "ReturnDays", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String returnDays;
  @XmlElement(name = "Routes", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String routes;
  @XmlElement(name = "RoutesRegion", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String routesRegion;
  @XmlElement(name = "SabreCommercialCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String sabreCommercialCode;
  @XmlElement(name = "SabreCommercialName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String sabreCommercialName;
  @XmlElement(name = "SabreRemarks", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String sabreRemarks;

}
