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
 * <p>Java class for PriceStrikeoutSettingsEN complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PriceStrikeoutSettingsEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirlineCodeMatchingSegments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ApplicableCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplyToAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplyToPassenger" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BookingChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingClassMatchingSegments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BookingDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BookingDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CalculateToAdult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CalculateToChild" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CalculateToInfant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *         &lt;element name="IsDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPercentage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="JourneyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxAdultCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxChildCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxInfantCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxStay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinimumAdultCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinimumChildCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinimumInfantCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PriceStrikeoutSettingsId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PromotionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="ReturnDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReturnDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReturnDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Routes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoutesRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceStrikeoutSettingsEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "airlineCode",
    "airlineCodeMatchingSegments",
    "amount",
    "applicableCurrency",
    "applyToAmount",
    "applyToPassenger",
    "bookingChannel",
    "bookingClass",
    "bookingClassMatchingSegments",
    "bookingDateFrom",
    "bookingDateTo",
    "calculateToAdult",
    "calculateToChild",
    "calculateToInfant",
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
    "isDiscount",
    "isPercentage",
    "journeyType",
    "maxAdultCount",
    "maxChildCount",
    "maxInfantCount",
    "maxStay",
    "minimumAdultCount",
    "minimumChildCount",
    "minimumInfantCount",
    "priceStrikeoutSettingsId",
    "promotionName",
    "resultMsg",
    "returnDateFrom",
    "returnDateTo",
    "returnDays",
    "routes",
    "routesRegion",
    "status"
})
public class PriceStrikeoutSettingsEN {

  @XmlElement(name = "AirlineCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String airlineCode;
  @XmlElement(name = "AirlineCodeMatchingSegments")
  protected Integer airlineCodeMatchingSegments;
  @XmlElement(name = "Amount")
  protected BigDecimal amount;
  @XmlElement(name = "ApplicableCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String applicableCurrency;
  @XmlElement(name = "ApplyToAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String applyToAmount;
  @XmlElement(name = "ApplyToPassenger")
  protected Integer applyToPassenger;
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
  @XmlElement(name = "CalculateToAdult")
  protected Boolean calculateToAdult;
  @XmlElement(name = "CalculateToChild")
  protected Boolean calculateToChild;
  @XmlElement(name = "CalculateToInfant")
  protected Boolean calculateToInfant;
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
  @XmlElement(name = "IsDiscount")
  protected Boolean isDiscount;
  @XmlElement(name = "IsPercentage")
  protected Boolean isPercentage;
  @XmlElement(name = "JourneyType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String journeyType;
  @XmlElement(name = "MaxAdultCount")
  protected Integer maxAdultCount;
  @XmlElement(name = "MaxChildCount")
  protected Integer maxChildCount;
  @XmlElement(name = "MaxInfantCount")
  protected Integer maxInfantCount;
  @XmlElement(name = "MaxStay")
  protected Integer maxStay;
  @XmlElement(name = "MinimumAdultCount")
  protected Integer minimumAdultCount;
  @XmlElement(name = "MinimumChildCount")
  protected Integer minimumChildCount;
  @XmlElement(name = "MinimumInfantCount")
  protected Integer minimumInfantCount;
  @XmlElement(name = "PriceStrikeoutSettingsId")
  protected Long priceStrikeoutSettingsId;
  @XmlElement(name = "PromotionName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String promotionName;
  @XmlElement(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected Result resultMsg;
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
  @XmlElement(name = "Status")
  protected Integer status;

}
