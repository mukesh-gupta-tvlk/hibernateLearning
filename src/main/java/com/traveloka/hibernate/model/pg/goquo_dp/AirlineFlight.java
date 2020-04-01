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
 * <p>Java class for AirlineFlight complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AirlineFlight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AFDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AFIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AdditionalFareInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BusinessFlexiFlight" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}Flights" minOccurs="0"/>
 *         &lt;element name="BusinessFlight" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}Flights" minOccurs="0"/>
 *         &lt;element name="ConnectionCityDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DayDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DepCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DiffDepFlightSeperator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DiffReturnFlightSeperator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplayCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EconomyFlexiFlight" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}Flights" minOccurs="0"/>
 *         &lt;element name="EconomyFlight" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}Flights" minOccurs="0"/>
 *         &lt;element name="FGKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareGroupFlights" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfFareGroupFlight" minOccurs="0"/>
 *         &lt;element name="FirstFlight" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}Flights" minOccurs="0"/>
 *         &lt;element name="FlightAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FlightIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FlightNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FuelStopOverCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasBusinessClass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasBusinessFlexiClass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasEconomyFlexiClass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasPremiumEconomyClass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasSuperSaverClass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IBAvailFareGroups" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfFareGroupAirlineFlight" minOccurs="0"/>
 *         &lt;element name="IsActualData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsArrCombineFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsBusinessFlexiNA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsBusinessNA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDepCombineFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDepartureConnectionFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEconomyNA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsFirstFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsFuelStopOver" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsHideFlightPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMilesBooking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsNoShowFee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPremiumEconomyNA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPromoClassApplied" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPromoNA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowBusinessFlexi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowEconomy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowPremiumEconomy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowPromo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowSuperSaver" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowmEconomyFlexi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsValidPromoCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MACode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MANameML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MLFlightList" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfFlights" minOccurs="0"/>
 *         &lt;element name="MLPriceInformation" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PriceInformation" minOccurs="0"/>
 *         &lt;element name="MinFlightClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoAdults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoChildren" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoInfants" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoSpecialPax" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}SpecialTypePaxCount" minOccurs="0"/>
 *         &lt;element name="NoStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OBAvailFareGroups" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfFareGroupAirlineFlight" minOccurs="0"/>
 *         &lt;element name="PUnitID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PerAdultPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PremiumEconomyFlight" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}Flights" minOccurs="0"/>
 *         &lt;element name="PromoFlight" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}Flights" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentInformation" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfAirlineFlightSegment" minOccurs="0"/>
 *         &lt;element name="SuperSaverFlight" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}Flights" minOccurs="0"/>
 *         &lt;element name="TotalDura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalNoStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalSegmentsWithStopOver" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dispFlightAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineFlight", propOrder = {
    "afDirection",
    "afIndex",
    "additionalFareInfo",
    "arrCity",
    "arrCityName",
    "arrDate",
    "arrTime",
    "arrivalDate",
    "businessFlexiFlight",
    "businessFlight",
    "connectionCityDetails",
    "currSymbol",
    "currency",
    "currencyName",
    "dayDuration",
    "depCity",
    "depCityName",
    "depDate",
    "depTime",
    "departureDate",
    "diffDepFlightSeperator",
    "diffReturnFlightSeperator",
    "displayCurrencyCode",
    "ec",
    "economyFlexiFlight",
    "economyFlight",
    "fgKey",
    "fareGroupFlights",
    "firstFlight",
    "flightAmount",
    "flightIndex",
    "flightNo",
    "fuelStopOverCountry",
    "hasBusinessClass",
    "hasBusinessFlexiClass",
    "hasEconomyFlexiClass",
    "hasPremiumEconomyClass",
    "hasSuperSaverClass",
    "ibAvailFareGroups",
    "isActualData",
    "isArrCombineFlight",
    "isBusinessFlexiNA",
    "isBusinessNA",
    "isDepCombineFlight",
    "isDepartureConnectionFlight",
    "isEconomyNA",
    "isFirstFlight",
    "isFuelStopOver",
    "isHideFlightPrice",
    "isMilesBooking",
    "isNoShowFee",
    "isPremiumEconomyNA",
    "isPromoClassApplied",
    "isPromoNA",
    "isShowBusiness",
    "isShowBusinessFlexi",
    "isShowEconomy",
    "isShowPremiumEconomy",
    "isShowPromo",
    "isShowSuperSaver",
    "isShowmEconomyFlexi",
    "isValidPromoCode",
    "maCode",
    "maName",
    "maNameML",
    "mlFlightList",
    "mlPriceInformation",
    "minFlightClass",
    "noAdults",
    "noChildren",
    "noInfants",
    "noSpecialPax",
    "noStops",
    "obAvailFareGroups",
    "pUnitID",
    "perAdultPrice",
    "premiumEconomyFlight",
    "promoFlight",
    "region",
    "segmentInformation",
    "superSaverFlight",
    "totalDura",
    "totalNoStops",
    "totalSegmentsWithStopOver",
    "dispFlightAmount"
})
public class AirlineFlight {

  @XmlElement(name = "AFDirection", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String afDirection;

  @XmlElement(name = "AFIndex")
  protected Integer afIndex;

  @XmlElement(name = "AdditionalFareInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String additionalFareInfo;


  @XmlElement(name = "ArrCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String arrCity;

  @XmlElement(name = "ArrCityName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String arrCityName;

  @XmlElement(name = "ArrDate", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String arrDate;

  @XmlElement(name = "ArrTime", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String arrTime;

  @XmlElement(name = "ArrivalDate")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar arrivalDate;

  @XmlElement(name = "BusinessFlexiFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected Flights businessFlexiFlight;

  @XmlElement(name = "BusinessFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected Flights businessFlight;

  @XmlElement(name = "ConnectionCityDetails", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String connectionCityDetails;

  @XmlElement(name = "CurrSymbol", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String currSymbol;

  @XmlElement(name = "Currency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String currency;

  @XmlElement(name = "CurrencyName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String currencyName;

  @XmlElement(name = "DayDuration")
  protected Integer dayDuration;

  @XmlElement(name = "DepCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String depCity;

  @XmlElement(name = "DepCityName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String depCityName;

  @XmlElement(name = "DepDate", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String depDate;

  @XmlElement(name = "DepTime", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String depTime;

  @XmlElement(name = "DepartureDate")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar departureDate;

  @XmlElement(name = "DiffDepFlightSeperator")
  protected Boolean diffDepFlightSeperator;

  @XmlElement(name = "DiffReturnFlightSeperator")
  protected Boolean diffReturnFlightSeperator;

  @XmlElement(name = "DisplayCurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String displayCurrencyCode;

  @XmlElement(name = "EC")
  protected Integer ec;

  @XmlElement(name = "EconomyFlexiFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected Flights economyFlexiFlight;

  @XmlElement(name = "EconomyFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected Flights economyFlight;

  @XmlElement(name = "FGKey", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String fgKey;

  @XmlElement(name = "FareGroupFlights", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfFareGroupFlight fareGroupFlights;

  @XmlElement(name = "FirstFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected Flights firstFlight;

  @XmlElement(name = "FlightAmount")
  protected BigDecimal flightAmount;

  @XmlElement(name = "FlightIndex")
  protected Integer flightIndex;

  @XmlElement(name = "FlightNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String flightNo;

  @XmlElement(name = "FuelStopOverCountry", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String fuelStopOverCountry;

  @XmlElement(name = "HasBusinessClass")
  protected Boolean hasBusinessClass;

  @XmlElement(name = "HasBusinessFlexiClass")
  protected Boolean hasBusinessFlexiClass;

  @XmlElement(name = "HasEconomyFlexiClass")
  protected Boolean hasEconomyFlexiClass;

  @XmlElement(name = "HasPremiumEconomyClass")
  protected Boolean hasPremiumEconomyClass;

  @XmlElement(name = "HasSuperSaverClass")
  protected Boolean hasSuperSaverClass;

  @XmlElement(name = "IBAvailFareGroups", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfFareGroupAirlineFlight ibAvailFareGroups;

  @XmlElement(name = "IsActualData")
  protected Boolean isActualData;

  @XmlElement(name = "IsArrCombineFlight")
  protected Boolean isArrCombineFlight;

  @XmlElement(name = "IsBusinessFlexiNA")
  protected Boolean isBusinessFlexiNA;

  @XmlElement(name = "IsBusinessNA")
  protected Boolean isBusinessNA;

  @XmlElement(name = "IsDepCombineFlight")
  protected Boolean isDepCombineFlight;

  @XmlElement(name = "IsDepartureConnectionFlight")
  protected Boolean isDepartureConnectionFlight;

  @XmlElement(name = "IsEconomyNA")
  protected Boolean isEconomyNA;

  @XmlElement(name = "IsFirstFlight")
  protected Boolean isFirstFlight;

  @XmlElement(name = "IsFuelStopOver")
  protected Boolean isFuelStopOver;

  @XmlElement(name = "IsHideFlightPrice")
  protected Boolean isHideFlightPrice;

  @XmlElement(name = "IsMilesBooking")
  protected Boolean isMilesBooking;

  @XmlElement(name = "IsNoShowFee")
  protected Boolean isNoShowFee;

  @XmlElement(name = "IsPremiumEconomyNA")
  protected Boolean isPremiumEconomyNA;

  @XmlElement(name = "IsPromoClassApplied")
  protected Boolean isPromoClassApplied;

  @XmlElement(name = "IsPromoNA")
  protected Boolean isPromoNA;

  @XmlElement(name = "IsShowBusiness")
  protected Boolean isShowBusiness;

  @XmlElement(name = "IsShowBusinessFlexi")
  protected Boolean isShowBusinessFlexi;

  @XmlElement(name = "IsShowEconomy")
  protected Boolean isShowEconomy;

  @XmlElement(name = "IsShowPremiumEconomy")
  protected Boolean isShowPremiumEconomy;

  @XmlElement(name = "IsShowPromo")
  protected Boolean isShowPromo;

  @XmlElement(name = "IsShowSuperSaver")
  protected Boolean isShowSuperSaver;

  @XmlElement(name = "IsShowmEconomyFlexi")
  protected Boolean isShowmEconomyFlexi;

  @XmlElement(name = "IsValidPromoCode")
  protected Boolean isValidPromoCode;

  @XmlElement(name = "MACode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String maCode;

  @XmlElement(name = "MAName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String maName;

  @XmlElement(name = "MANameML", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String maNameML;

  @XmlElement(name = "MLFlightList", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfFlights mlFlightList;

  @XmlElement(name = "MLPriceInformation", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected PriceInformation mlPriceInformation;

  @XmlElement(name = "MinFlightClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String minFlightClass;

  @XmlElement(name = "NoAdults")
  protected Integer noAdults;

  @XmlElement(name = "NoChildren")
  protected Integer noChildren;

  @XmlElement(name = "NoInfants")
  protected Integer noInfants;

  @XmlElement(name = "NoSpecialPax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected SpecialTypePaxCount noSpecialPax;

  @XmlElement(name = "NoStops")
  protected Integer noStops;

  @XmlElement(name = "OBAvailFareGroups", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfFareGroupAirlineFlight obAvailFareGroups;

  @XmlElement(name = "PUnitID")
  protected Integer pUnitID;

  @XmlElement(name = "PerAdultPrice")
  protected BigDecimal perAdultPrice;

  @XmlElement(name = "PremiumEconomyFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected Flights premiumEconomyFlight;

  @XmlElement(name = "PromoFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected Flights promoFlight;

  @XmlElement(name = "Region", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String region;

  @XmlElement(name = "SegmentInformation", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected ArrayOfAirlineFlightSegment segmentInformation;

  @XmlElement(name = "SuperSaverFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected Flights superSaverFlight;

  @XmlElement(name = "TotalDura", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String totalDura;

  @XmlElement(name = "TotalNoStops")
  protected Integer totalNoStops;

  @XmlElement(name = "TotalSegmentsWithStopOver")
  protected Integer totalSegmentsWithStopOver;

  @XmlElement(name = "dispFlightAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispFlightAmount;
}
