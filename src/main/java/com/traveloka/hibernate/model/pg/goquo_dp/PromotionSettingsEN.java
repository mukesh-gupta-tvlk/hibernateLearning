
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 * 
 * 
 */
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
    extends PromotionCodesEN
{

    @XmlElementRef(name = "AirlineCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airlineCode;
    @XmlElement(name = "AirlineCodeMatchingSegments")
    protected Integer airlineCodeMatchingSegments;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElementRef(name = "ApplicableCardTypes", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicableCardTypes;
    @XmlElementRef(name = "ApplicableCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicableCurrency;
    @XmlElement(name = "ApplicablePaxCount")
    protected Integer applicablePaxCount;
    @XmlElementRef(name = "ApplicablePaymentMethods", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicablePaymentMethods;
    @XmlElement(name = "ApplyToAdult")
    protected Boolean applyToAdult;
    @XmlElementRef(name = "ApplyToAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applyToAmount;
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
    @XmlElementRef(name = "BookingChannel", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingChannel;
    @XmlElementRef(name = "BookingClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingClass;
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
    @XmlElementRef(name = "BuyandGetCategory", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buyandGetCategory;
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
    @XmlElementRef(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElement(name = "CustomerUserId")
    protected Integer customerUserId;
    @XmlElement(name = "DepartureDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateFrom;
    @XmlElement(name = "DepartureDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateTo;
    @XmlElementRef(name = "DepartureDays", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departureDays;
    @XmlElementRef(name = "ExcludeRoutes", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> excludeRoutes;
    @XmlElementRef(name = "FareBasisCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareBasisCode;
    @XmlElement(name = "FareBasisCodeMatchingSegments")
    protected Integer fareBasisCodeMatchingSegments;
    @XmlElementRef(name = "FlightNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightNo;
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
    @XmlElementRef(name = "JourneyType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> journeyType;
    @XmlElement(name = "LimitOncePerDevice")
    protected Boolean limitOncePerDevice;
    @XmlElementRef(name = "MDBookingClassAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mdBookingClassAmount;
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
    @XmlElementRef(name = "MinBookingAmtCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minBookingAmtCurrency;
    @XmlElement(name = "MinimumAdultCount")
    protected Integer minimumAdultCount;
    @XmlElement(name = "MinimumChildCount")
    protected Integer minimumChildCount;
    @XmlElement(name = "MinimumInfantCount")
    protected Integer minimumInfantCount;
    @XmlElement(name = "PromoPax")
    protected Integer promoPax;
    @XmlElementRef(name = "PromotionCategory", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promotionCategory;
    @XmlElement(name = "PromotionCodeCount")
    protected Integer promotionCodeCount;
    @XmlElementRef(name = "PromotionCodeList", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promotionCodeList;
    @XmlElementRef(name = "PromotionCodePrefix", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promotionCodePrefix;
    @XmlElementRef(name = "PromotionName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promotionName;
    @XmlElementRef(name = "PromotionValidationName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promotionValidationName;
    @XmlElementRef(name = "PromotionValidityType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promotionValidityType;
    @XmlElement(name = "ReturnDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnDateFrom;
    @XmlElement(name = "ReturnDateTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnDateTo;
    @XmlElementRef(name = "ReturnDays", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnDays;
    @XmlElementRef(name = "Routes", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routes;
    @XmlElementRef(name = "RoutesRegion", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routesRegion;
    @XmlElementRef(name = "SabreCommercialCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sabreCommercialCode;
    @XmlElementRef(name = "SabreCommercialName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sabreCommercialName;
    @XmlElementRef(name = "SabreRemarks", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sabreRemarks;

    /**
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirlineCode(JAXBElement<String> value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the airlineCodeMatchingSegments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAirlineCodeMatchingSegments() {
        return airlineCodeMatchingSegments;
    }

    /**
     * Sets the value of the airlineCodeMatchingSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAirlineCodeMatchingSegments(Integer value) {
        this.airlineCodeMatchingSegments = value;
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
     * Gets the value of the applicableCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicableCurrency() {
        return applicableCurrency;
    }

    /**
     * Sets the value of the applicableCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicableCurrency(JAXBElement<String> value) {
        this.applicableCurrency = value;
    }

    /**
     * Gets the value of the applicablePaxCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplicablePaxCount() {
        return applicablePaxCount;
    }

    /**
     * Sets the value of the applicablePaxCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplicablePaxCount(Integer value) {
        this.applicablePaxCount = value;
    }

    /**
     * Gets the value of the applicablePaymentMethods property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicablePaymentMethods() {
        return applicablePaymentMethods;
    }

    /**
     * Sets the value of the applicablePaymentMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicablePaymentMethods(JAXBElement<String> value) {
        this.applicablePaymentMethods = value;
    }

    /**
     * Gets the value of the applyToAdult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyToAdult() {
        return applyToAdult;
    }

    /**
     * Sets the value of the applyToAdult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToAdult(Boolean value) {
        this.applyToAdult = value;
    }

    /**
     * Gets the value of the applyToAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplyToAmount() {
        return applyToAmount;
    }

    /**
     * Sets the value of the applyToAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplyToAmount(JAXBElement<String> value) {
        this.applyToAmount = value;
    }

    /**
     * Gets the value of the applyToChild property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyToChild() {
        return applyToChild;
    }

    /**
     * Sets the value of the applyToChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToChild(Boolean value) {
        this.applyToChild = value;
    }

    /**
     * Gets the value of the applyToDisabledPax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyToDisabledPax() {
        return applyToDisabledPax;
    }

    /**
     * Sets the value of the applyToDisabledPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToDisabledPax(Boolean value) {
        this.applyToDisabledPax = value;
    }

    /**
     * Gets the value of the applyToGovernmentPax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyToGovernmentPax() {
        return applyToGovernmentPax;
    }

    /**
     * Sets the value of the applyToGovernmentPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToGovernmentPax(Boolean value) {
        this.applyToGovernmentPax = value;
    }

    /**
     * Gets the value of the applyToInfant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyToInfant() {
        return applyToInfant;
    }

    /**
     * Sets the value of the applyToInfant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToInfant(Boolean value) {
        this.applyToInfant = value;
    }

    /**
     * Gets the value of the applyToPassenger property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplyToPassenger() {
        return applyToPassenger;
    }

    /**
     * Sets the value of the applyToPassenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplyToPassenger(Integer value) {
        this.applyToPassenger = value;
    }

    /**
     * Gets the value of the applyToSector property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplyToSector() {
        return applyToSector;
    }

    /**
     * Sets the value of the applyToSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplyToSector(Integer value) {
        this.applyToSector = value;
    }

    /**
     * Gets the value of the applyToSnrCitizenPax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyToSnrCitizenPax() {
        return applyToSnrCitizenPax;
    }

    /**
     * Sets the value of the applyToSnrCitizenPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToSnrCitizenPax(Boolean value) {
        this.applyToSnrCitizenPax = value;
    }

    /**
     * Gets the value of the applyToStudentPax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyToStudentPax() {
        return applyToStudentPax;
    }

    /**
     * Sets the value of the applyToStudentPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToStudentPax(Boolean value) {
        this.applyToStudentPax = value;
    }

    /**
     * Gets the value of the applyToWomenPax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyToWomenPax() {
        return applyToWomenPax;
    }

    /**
     * Sets the value of the applyToWomenPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToWomenPax(Boolean value) {
        this.applyToWomenPax = value;
    }

    /**
     * Gets the value of the bookingChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookingChannel() {
        return bookingChannel;
    }

    /**
     * Sets the value of the bookingChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookingChannel(JAXBElement<String> value) {
        this.bookingChannel = value;
    }

    /**
     * Gets the value of the bookingClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookingClass() {
        return bookingClass;
    }

    /**
     * Sets the value of the bookingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookingClass(JAXBElement<String> value) {
        this.bookingClass = value;
    }

    /**
     * Gets the value of the bookingClassMatchingSegments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBookingClassMatchingSegments() {
        return bookingClassMatchingSegments;
    }

    /**
     * Sets the value of the bookingClassMatchingSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBookingClassMatchingSegments(Integer value) {
        this.bookingClassMatchingSegments = value;
    }

    /**
     * Gets the value of the bookingDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingDateFrom() {
        return bookingDateFrom;
    }

    /**
     * Sets the value of the bookingDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingDateFrom(XMLGregorianCalendar value) {
        this.bookingDateFrom = value;
    }

    /**
     * Gets the value of the bookingDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingDateTo() {
        return bookingDateTo;
    }

    /**
     * Sets the value of the bookingDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingDateTo(XMLGregorianCalendar value) {
        this.bookingDateTo = value;
    }

    /**
     * Gets the value of the buyPax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuyPax() {
        return buyPax;
    }

    /**
     * Sets the value of the buyPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuyPax(Integer value) {
        this.buyPax = value;
    }

    /**
     * Gets the value of the buyandGetCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuyandGetCategory() {
        return buyandGetCategory;
    }

    /**
     * Sets the value of the buyandGetCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuyandGetCategory(JAXBElement<String> value) {
        this.buyandGetCategory = value;
    }

    /**
     * Gets the value of the calculateToAdult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateToAdult() {
        return calculateToAdult;
    }

    /**
     * Sets the value of the calculateToAdult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateToAdult(Boolean value) {
        this.calculateToAdult = value;
    }

    /**
     * Gets the value of the calculateToChild property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateToChild() {
        return calculateToChild;
    }

    /**
     * Sets the value of the calculateToChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateToChild(Boolean value) {
        this.calculateToChild = value;
    }

    /**
     * Gets the value of the calculateToDisabledPax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateToDisabledPax() {
        return calculateToDisabledPax;
    }

    /**
     * Sets the value of the calculateToDisabledPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateToDisabledPax(Boolean value) {
        this.calculateToDisabledPax = value;
    }

    /**
     * Gets the value of the calculateToGovernmentPax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateToGovernmentPax() {
        return calculateToGovernmentPax;
    }

    /**
     * Sets the value of the calculateToGovernmentPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateToGovernmentPax(Boolean value) {
        this.calculateToGovernmentPax = value;
    }

    /**
     * Gets the value of the calculateToInfant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateToInfant() {
        return calculateToInfant;
    }

    /**
     * Sets the value of the calculateToInfant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateToInfant(Boolean value) {
        this.calculateToInfant = value;
    }

    /**
     * Gets the value of the calculateToSnrCitizenPax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateToSnrCitizenPax() {
        return calculateToSnrCitizenPax;
    }

    /**
     * Sets the value of the calculateToSnrCitizenPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateToSnrCitizenPax(Boolean value) {
        this.calculateToSnrCitizenPax = value;
    }

    /**
     * Gets the value of the calculateToStudentPax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateToStudentPax() {
        return calculateToStudentPax;
    }

    /**
     * Sets the value of the calculateToStudentPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateToStudentPax(Boolean value) {
        this.calculateToStudentPax = value;
    }

    /**
     * Gets the value of the calculateToWomenPax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalculateToWomenPax() {
        return calculateToWomenPax;
    }

    /**
     * Sets the value of the calculateToWomenPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalculateToWomenPax(Boolean value) {
        this.calculateToWomenPax = value;
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
     * Gets the value of the customerUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerUserId() {
        return customerUserId;
    }

    /**
     * Sets the value of the customerUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerUserId(Integer value) {
        this.customerUserId = value;
    }

    /**
     * Gets the value of the departureDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDateFrom() {
        return departureDateFrom;
    }

    /**
     * Sets the value of the departureDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDateFrom(XMLGregorianCalendar value) {
        this.departureDateFrom = value;
    }

    /**
     * Gets the value of the departureDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDateTo() {
        return departureDateTo;
    }

    /**
     * Sets the value of the departureDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDateTo(XMLGregorianCalendar value) {
        this.departureDateTo = value;
    }

    /**
     * Gets the value of the departureDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartureDays() {
        return departureDays;
    }

    /**
     * Sets the value of the departureDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartureDays(JAXBElement<String> value) {
        this.departureDays = value;
    }

    /**
     * Gets the value of the excludeRoutes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExcludeRoutes() {
        return excludeRoutes;
    }

    /**
     * Sets the value of the excludeRoutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExcludeRoutes(JAXBElement<String> value) {
        this.excludeRoutes = value;
    }

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFareBasisCode(JAXBElement<String> value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the fareBasisCodeMatchingSegments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFareBasisCodeMatchingSegments() {
        return fareBasisCodeMatchingSegments;
    }

    /**
     * Sets the value of the fareBasisCodeMatchingSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFareBasisCodeMatchingSegments(Integer value) {
        this.fareBasisCodeMatchingSegments = value;
    }

    /**
     * Gets the value of the flightNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlightNo() {
        return flightNo;
    }

    /**
     * Sets the value of the flightNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlightNo(JAXBElement<String> value) {
        this.flightNo = value;
    }

    /**
     * Gets the value of the flightNoMatchingSegments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightNoMatchingSegments() {
        return flightNoMatchingSegments;
    }

    /**
     * Sets the value of the flightNoMatchingSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightNoMatchingSegments(Integer value) {
        this.flightNoMatchingSegments = value;
    }

    /**
     * Gets the value of the isAllAirlineCodes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllAirlineCodes() {
        return isAllAirlineCodes;
    }

    /**
     * Sets the value of the isAllAirlineCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllAirlineCodes(Boolean value) {
        this.isAllAirlineCodes = value;
    }

    /**
     * Gets the value of the isAllBookingClass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllBookingClass() {
        return isAllBookingClass;
    }

    /**
     * Sets the value of the isAllBookingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllBookingClass(Boolean value) {
        this.isAllBookingClass = value;
    }

    /**
     * Gets the value of the isAllFareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllFareBasisCode() {
        return isAllFareBasisCode;
    }

    /**
     * Sets the value of the isAllFareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllFareBasisCode(Boolean value) {
        this.isAllFareBasisCode = value;
    }

    /**
     * Gets the value of the isAllFlightNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAllFlightNumbers() {
        return isAllFlightNumbers;
    }

    /**
     * Sets the value of the isAllFlightNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAllFlightNumbers(Boolean value) {
        this.isAllFlightNumbers = value;
    }

    /**
     * Gets the value of the isCancellationEligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCancellationEligible() {
        return isCancellationEligible;
    }

    /**
     * Sets the value of the isCancellationEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCancellationEligible(Boolean value) {
        this.isCancellationEligible = value;
    }

    /**
     * Gets the value of the isChangeDateEligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsChangeDateEligible() {
        return isChangeDateEligible;
    }

    /**
     * Sets the value of the isChangeDateEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsChangeDateEligible(Boolean value) {
        this.isChangeDateEligible = value;
    }

    /**
     * Gets the value of the isDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDiscount() {
        return isDiscount;
    }

    /**
     * Sets the value of the isDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDiscount(Boolean value) {
        this.isDiscount = value;
    }

    /**
     * Gets the value of the isLimitMaxStay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLimitMaxStay() {
        return isLimitMaxStay;
    }

    /**
     * Sets the value of the isLimitMaxStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLimitMaxStay(Boolean value) {
        this.isLimitMaxStay = value;
    }

    /**
     * Gets the value of the isMultipleDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultipleDiscount() {
        return isMultipleDiscount;
    }

    /**
     * Sets the value of the isMultipleDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultipleDiscount(Boolean value) {
        this.isMultipleDiscount = value;
    }

    /**
     * Gets the value of the isPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPercentage() {
        return isPercentage;
    }

    /**
     * Sets the value of the isPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPercentage(Boolean value) {
        this.isPercentage = value;
    }

    /**
     * Gets the value of the isRemoveNonApplicableCardTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRemoveNonApplicableCardTypes() {
        return isRemoveNonApplicableCardTypes;
    }

    /**
     * Sets the value of the isRemoveNonApplicableCardTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRemoveNonApplicableCardTypes(Boolean value) {
        this.isRemoveNonApplicableCardTypes = value;
    }

    /**
     * Gets the value of the isRemoveNonApplicablePaymentMethods property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRemoveNonApplicablePaymentMethods() {
        return isRemoveNonApplicablePaymentMethods;
    }

    /**
     * Sets the value of the isRemoveNonApplicablePaymentMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRemoveNonApplicablePaymentMethods(Boolean value) {
        this.isRemoveNonApplicablePaymentMethods = value;
    }

    /**
     * Gets the value of the isRoundingAdjustSummaryAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRoundingAdjustSummaryAmt() {
        return isRoundingAdjustSummaryAmt;
    }

    /**
     * Sets the value of the isRoundingAdjustSummaryAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRoundingAdjustSummaryAmt(Boolean value) {
        this.isRoundingAdjustSummaryAmt = value;
    }

    /**
     * Gets the value of the isSendSabreRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSendSabreRemarks() {
        return isSendSabreRemarks;
    }

    /**
     * Sets the value of the isSendSabreRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSendSabreRemarks(Boolean value) {
        this.isSendSabreRemarks = value;
    }

    /**
     * Gets the value of the isShowInResultPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowInResultPage() {
        return isShowInResultPage;
    }

    /**
     * Sets the value of the isShowInResultPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowInResultPage(Boolean value) {
        this.isShowInResultPage = value;
    }

    /**
     * Gets the value of the isShowPromotionFare property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowPromotionFare() {
        return isShowPromotionFare;
    }

    /**
     * Sets the value of the isShowPromotionFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowPromotionFare(Boolean value) {
        this.isShowPromotionFare = value;
    }

    /**
     * Gets the value of the journeyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJourneyType() {
        return journeyType;
    }

    /**
     * Sets the value of the journeyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJourneyType(JAXBElement<String> value) {
        this.journeyType = value;
    }

    /**
     * Gets the value of the limitOncePerDevice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLimitOncePerDevice() {
        return limitOncePerDevice;
    }

    /**
     * Sets the value of the limitOncePerDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLimitOncePerDevice(Boolean value) {
        this.limitOncePerDevice = value;
    }

    /**
     * Gets the value of the mdBookingClassAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMDBookingClassAmount() {
        return mdBookingClassAmount;
    }

    /**
     * Sets the value of the mdBookingClassAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMDBookingClassAmount(JAXBElement<String> value) {
        this.mdBookingClassAmount = value;
    }

    /**
     * Gets the value of the maxAdultCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAdultCount() {
        return maxAdultCount;
    }

    /**
     * Sets the value of the maxAdultCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAdultCount(Integer value) {
        this.maxAdultCount = value;
    }

    /**
     * Gets the value of the maxBookingLimitPerCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxBookingLimitPerCode() {
        return maxBookingLimitPerCode;
    }

    /**
     * Sets the value of the maxBookingLimitPerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxBookingLimitPerCode(Integer value) {
        this.maxBookingLimitPerCode = value;
    }

    /**
     * Gets the value of the maxChildCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxChildCount() {
        return maxChildCount;
    }

    /**
     * Sets the value of the maxChildCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxChildCount(Integer value) {
        this.maxChildCount = value;
    }

    /**
     * Gets the value of the maxInfantCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxInfantCount() {
        return maxInfantCount;
    }

    /**
     * Sets the value of the maxInfantCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxInfantCount(Integer value) {
        this.maxInfantCount = value;
    }

    /**
     * Gets the value of the maxStay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxStay() {
        return maxStay;
    }

    /**
     * Sets the value of the maxStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxStay(Integer value) {
        this.maxStay = value;
    }

    /**
     * Gets the value of the minBookingAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinBookingAmt() {
        return minBookingAmt;
    }

    /**
     * Sets the value of the minBookingAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinBookingAmt(BigDecimal value) {
        this.minBookingAmt = value;
    }

    /**
     * Gets the value of the minBookingAmtCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinBookingAmtCurrency() {
        return minBookingAmtCurrency;
    }

    /**
     * Sets the value of the minBookingAmtCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinBookingAmtCurrency(JAXBElement<String> value) {
        this.minBookingAmtCurrency = value;
    }

    /**
     * Gets the value of the minimumAdultCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumAdultCount() {
        return minimumAdultCount;
    }

    /**
     * Sets the value of the minimumAdultCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumAdultCount(Integer value) {
        this.minimumAdultCount = value;
    }

    /**
     * Gets the value of the minimumChildCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumChildCount() {
        return minimumChildCount;
    }

    /**
     * Sets the value of the minimumChildCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumChildCount(Integer value) {
        this.minimumChildCount = value;
    }

    /**
     * Gets the value of the minimumInfantCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumInfantCount() {
        return minimumInfantCount;
    }

    /**
     * Sets the value of the minimumInfantCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumInfantCount(Integer value) {
        this.minimumInfantCount = value;
    }

    /**
     * Gets the value of the promoPax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPromoPax() {
        return promoPax;
    }

    /**
     * Sets the value of the promoPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPromoPax(Integer value) {
        this.promoPax = value;
    }

    /**
     * Gets the value of the promotionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromotionCategory() {
        return promotionCategory;
    }

    /**
     * Sets the value of the promotionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromotionCategory(JAXBElement<String> value) {
        this.promotionCategory = value;
    }

    /**
     * Gets the value of the promotionCodeCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPromotionCodeCount() {
        return promotionCodeCount;
    }

    /**
     * Sets the value of the promotionCodeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPromotionCodeCount(Integer value) {
        this.promotionCodeCount = value;
    }

    /**
     * Gets the value of the promotionCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromotionCodeList() {
        return promotionCodeList;
    }

    /**
     * Sets the value of the promotionCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromotionCodeList(JAXBElement<String> value) {
        this.promotionCodeList = value;
    }

    /**
     * Gets the value of the promotionCodePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromotionCodePrefix() {
        return promotionCodePrefix;
    }

    /**
     * Sets the value of the promotionCodePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromotionCodePrefix(JAXBElement<String> value) {
        this.promotionCodePrefix = value;
    }

    /**
     * Gets the value of the promotionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromotionName() {
        return promotionName;
    }

    /**
     * Sets the value of the promotionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromotionName(JAXBElement<String> value) {
        this.promotionName = value;
    }

    /**
     * Gets the value of the promotionValidationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromotionValidationName() {
        return promotionValidationName;
    }

    /**
     * Sets the value of the promotionValidationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromotionValidationName(JAXBElement<String> value) {
        this.promotionValidationName = value;
    }

    /**
     * Gets the value of the promotionValidityType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromotionValidityType() {
        return promotionValidityType;
    }

    /**
     * Sets the value of the promotionValidityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromotionValidityType(JAXBElement<String> value) {
        this.promotionValidityType = value;
    }

    /**
     * Gets the value of the returnDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDateFrom() {
        return returnDateFrom;
    }

    /**
     * Sets the value of the returnDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDateFrom(XMLGregorianCalendar value) {
        this.returnDateFrom = value;
    }

    /**
     * Gets the value of the returnDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDateTo() {
        return returnDateTo;
    }

    /**
     * Sets the value of the returnDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDateTo(XMLGregorianCalendar value) {
        this.returnDateTo = value;
    }

    /**
     * Gets the value of the returnDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnDays() {
        return returnDays;
    }

    /**
     * Sets the value of the returnDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnDays(JAXBElement<String> value) {
        this.returnDays = value;
    }

    /**
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoutes(JAXBElement<String> value) {
        this.routes = value;
    }

    /**
     * Gets the value of the routesRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoutesRegion() {
        return routesRegion;
    }

    /**
     * Sets the value of the routesRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoutesRegion(JAXBElement<String> value) {
        this.routesRegion = value;
    }

    /**
     * Gets the value of the sabreCommercialCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSabreCommercialCode() {
        return sabreCommercialCode;
    }

    /**
     * Sets the value of the sabreCommercialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSabreCommercialCode(JAXBElement<String> value) {
        this.sabreCommercialCode = value;
    }

    /**
     * Gets the value of the sabreCommercialName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSabreCommercialName() {
        return sabreCommercialName;
    }

    /**
     * Sets the value of the sabreCommercialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSabreCommercialName(JAXBElement<String> value) {
        this.sabreCommercialName = value;
    }

    /**
     * Gets the value of the sabreRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSabreRemarks() {
        return sabreRemarks;
    }

    /**
     * Sets the value of the sabreRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSabreRemarks(JAXBElement<String> value) {
        this.sabreRemarks = value;
    }

}
