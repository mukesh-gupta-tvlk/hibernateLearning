
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
 * 
 * 
 */
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

    @XmlElementRef(name = "AFDirection", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> afDirection;
    @XmlElement(name = "AFIndex")
    protected Integer afIndex;
    @XmlElementRef(name = "AdditionalFareInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalFareInfo;
    @XmlElementRef(name = "ArrCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrCity;
    @XmlElementRef(name = "ArrCityName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrCityName;
    @XmlElementRef(name = "ArrDate", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrDate;
    @XmlElementRef(name = "ArrTime", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrTime;
    @XmlElement(name = "ArrivalDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDate;
    @XmlElementRef(name = "BusinessFlexiFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<Flights> businessFlexiFlight;
    @XmlElementRef(name = "BusinessFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<Flights> businessFlight;
    @XmlElementRef(name = "ConnectionCityDetails", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> connectionCityDetails;
    @XmlElementRef(name = "CurrSymbol", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currSymbol;
    @XmlElementRef(name = "Currency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency;
    @XmlElementRef(name = "CurrencyName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyName;
    @XmlElement(name = "DayDuration")
    protected Integer dayDuration;
    @XmlElementRef(name = "DepCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depCity;
    @XmlElementRef(name = "DepCityName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depCityName;
    @XmlElementRef(name = "DepDate", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depDate;
    @XmlElementRef(name = "DepTime", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depTime;
    @XmlElement(name = "DepartureDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "DiffDepFlightSeperator")
    protected Boolean diffDepFlightSeperator;
    @XmlElement(name = "DiffReturnFlightSeperator")
    protected Boolean diffReturnFlightSeperator;
    @XmlElementRef(name = "DisplayCurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayCurrencyCode;
    @XmlElement(name = "EC")
    protected Integer ec;
    @XmlElementRef(name = "EconomyFlexiFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<Flights> economyFlexiFlight;
    @XmlElementRef(name = "EconomyFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<Flights> economyFlight;
    @XmlElementRef(name = "FGKey", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fgKey;
    @XmlElementRef(name = "FareGroupFlights", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFareGroupFlight> fareGroupFlights;
    @XmlElementRef(name = "FirstFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<Flights> firstFlight;
    @XmlElement(name = "FlightAmount")
    protected BigDecimal flightAmount;
    @XmlElement(name = "FlightIndex")
    protected Integer flightIndex;
    @XmlElementRef(name = "FlightNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightNo;
    @XmlElementRef(name = "FuelStopOverCountry", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fuelStopOverCountry;
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
    @XmlElementRef(name = "IBAvailFareGroups", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFareGroupAirlineFlight> ibAvailFareGroups;
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
    @XmlElementRef(name = "MACode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maCode;
    @XmlElementRef(name = "MAName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maName;
    @XmlElementRef(name = "MANameML", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maNameML;
    @XmlElementRef(name = "MLFlightList", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFlights> mlFlightList;
    @XmlElementRef(name = "MLPriceInformation", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<PriceInformation> mlPriceInformation;
    @XmlElementRef(name = "MinFlightClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minFlightClass;
    @XmlElement(name = "NoAdults")
    protected Integer noAdults;
    @XmlElement(name = "NoChildren")
    protected Integer noChildren;
    @XmlElement(name = "NoInfants")
    protected Integer noInfants;
    @XmlElementRef(name = "NoSpecialPax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<SpecialTypePaxCount> noSpecialPax;
    @XmlElement(name = "NoStops")
    protected Integer noStops;
    @XmlElementRef(name = "OBAvailFareGroups", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFareGroupAirlineFlight> obAvailFareGroups;
    @XmlElement(name = "PUnitID")
    protected Integer pUnitID;
    @XmlElement(name = "PerAdultPrice")
    protected BigDecimal perAdultPrice;
    @XmlElementRef(name = "PremiumEconomyFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<Flights> premiumEconomyFlight;
    @XmlElementRef(name = "PromoFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<Flights> promoFlight;
    @XmlElementRef(name = "Region", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> region;
    @XmlElementRef(name = "SegmentInformation", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAirlineFlightSegment> segmentInformation;
    @XmlElementRef(name = "SuperSaverFlight", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<Flights> superSaverFlight;
    @XmlElementRef(name = "TotalDura", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalDura;
    @XmlElement(name = "TotalNoStops")
    protected Integer totalNoStops;
    @XmlElement(name = "TotalSegmentsWithStopOver")
    protected Integer totalSegmentsWithStopOver;
    @XmlElementRef(name = "dispFlightAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispFlightAmount;

    /**
     * Gets the value of the afDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAFDirection() {
        return afDirection;
    }

    /**
     * Sets the value of the afDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAFDirection(JAXBElement<String> value) {
        this.afDirection = value;
    }

    /**
     * Gets the value of the afIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAFIndex() {
        return afIndex;
    }

    /**
     * Sets the value of the afIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAFIndex(Integer value) {
        this.afIndex = value;
    }

    /**
     * Gets the value of the additionalFareInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalFareInfo() {
        return additionalFareInfo;
    }

    /**
     * Sets the value of the additionalFareInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalFareInfo(JAXBElement<String> value) {
        this.additionalFareInfo = value;
    }

    /**
     * Gets the value of the arrCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrCity() {
        return arrCity;
    }

    /**
     * Sets the value of the arrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrCity(JAXBElement<String> value) {
        this.arrCity = value;
    }

    /**
     * Gets the value of the arrCityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrCityName() {
        return arrCityName;
    }

    /**
     * Sets the value of the arrCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrCityName(JAXBElement<String> value) {
        this.arrCityName = value;
    }

    /**
     * Gets the value of the arrDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrDate() {
        return arrDate;
    }

    /**
     * Sets the value of the arrDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrDate(JAXBElement<String> value) {
        this.arrDate = value;
    }

    /**
     * Gets the value of the arrTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrTime() {
        return arrTime;
    }

    /**
     * Sets the value of the arrTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrTime(JAXBElement<String> value) {
        this.arrTime = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDate(XMLGregorianCalendar value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the businessFlexiFlight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Flights }{@code >}
     *     
     */
    public JAXBElement<Flights> getBusinessFlexiFlight() {
        return businessFlexiFlight;
    }

    /**
     * Sets the value of the businessFlexiFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Flights }{@code >}
     *     
     */
    public void setBusinessFlexiFlight(JAXBElement<Flights> value) {
        this.businessFlexiFlight = value;
    }

    /**
     * Gets the value of the businessFlight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Flights }{@code >}
     *     
     */
    public JAXBElement<Flights> getBusinessFlight() {
        return businessFlight;
    }

    /**
     * Sets the value of the businessFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Flights }{@code >}
     *     
     */
    public void setBusinessFlight(JAXBElement<Flights> value) {
        this.businessFlight = value;
    }

    /**
     * Gets the value of the connectionCityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConnectionCityDetails() {
        return connectionCityDetails;
    }

    /**
     * Sets the value of the connectionCityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConnectionCityDetails(JAXBElement<String> value) {
        this.connectionCityDetails = value;
    }

    /**
     * Gets the value of the currSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrSymbol() {
        return currSymbol;
    }

    /**
     * Sets the value of the currSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrSymbol(JAXBElement<String> value) {
        this.currSymbol = value;
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
     * Gets the value of the currencyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyName() {
        return currencyName;
    }

    /**
     * Sets the value of the currencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyName(JAXBElement<String> value) {
        this.currencyName = value;
    }

    /**
     * Gets the value of the dayDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDayDuration() {
        return dayDuration;
    }

    /**
     * Sets the value of the dayDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDayDuration(Integer value) {
        this.dayDuration = value;
    }

    /**
     * Gets the value of the depCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepCity() {
        return depCity;
    }

    /**
     * Sets the value of the depCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepCity(JAXBElement<String> value) {
        this.depCity = value;
    }

    /**
     * Gets the value of the depCityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepCityName() {
        return depCityName;
    }

    /**
     * Sets the value of the depCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepCityName(JAXBElement<String> value) {
        this.depCityName = value;
    }

    /**
     * Gets the value of the depDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepDate() {
        return depDate;
    }

    /**
     * Sets the value of the depDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepDate(JAXBElement<String> value) {
        this.depDate = value;
    }

    /**
     * Gets the value of the depTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepTime() {
        return depTime;
    }

    /**
     * Sets the value of the depTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepTime(JAXBElement<String> value) {
        this.depTime = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the diffDepFlightSeperator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiffDepFlightSeperator() {
        return diffDepFlightSeperator;
    }

    /**
     * Sets the value of the diffDepFlightSeperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiffDepFlightSeperator(Boolean value) {
        this.diffDepFlightSeperator = value;
    }

    /**
     * Gets the value of the diffReturnFlightSeperator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiffReturnFlightSeperator() {
        return diffReturnFlightSeperator;
    }

    /**
     * Sets the value of the diffReturnFlightSeperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiffReturnFlightSeperator(Boolean value) {
        this.diffReturnFlightSeperator = value;
    }

    /**
     * Gets the value of the displayCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayCurrencyCode() {
        return displayCurrencyCode;
    }

    /**
     * Sets the value of the displayCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayCurrencyCode(JAXBElement<String> value) {
        this.displayCurrencyCode = value;
    }

    /**
     * Gets the value of the ec property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEC() {
        return ec;
    }

    /**
     * Sets the value of the ec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEC(Integer value) {
        this.ec = value;
    }

    /**
     * Gets the value of the economyFlexiFlight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Flights }{@code >}
     *     
     */
    public JAXBElement<Flights> getEconomyFlexiFlight() {
        return economyFlexiFlight;
    }

    /**
     * Sets the value of the economyFlexiFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Flights }{@code >}
     *     
     */
    public void setEconomyFlexiFlight(JAXBElement<Flights> value) {
        this.economyFlexiFlight = value;
    }

    /**
     * Gets the value of the economyFlight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Flights }{@code >}
     *     
     */
    public JAXBElement<Flights> getEconomyFlight() {
        return economyFlight;
    }

    /**
     * Sets the value of the economyFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Flights }{@code >}
     *     
     */
    public void setEconomyFlight(JAXBElement<Flights> value) {
        this.economyFlight = value;
    }

    /**
     * Gets the value of the fgKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFGKey() {
        return fgKey;
    }

    /**
     * Sets the value of the fgKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFGKey(JAXBElement<String> value) {
        this.fgKey = value;
    }

    /**
     * Gets the value of the fareGroupFlights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFareGroupFlight }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFareGroupFlight> getFareGroupFlights() {
        return fareGroupFlights;
    }

    /**
     * Sets the value of the fareGroupFlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFareGroupFlight }{@code >}
     *     
     */
    public void setFareGroupFlights(JAXBElement<ArrayOfFareGroupFlight> value) {
        this.fareGroupFlights = value;
    }

    /**
     * Gets the value of the firstFlight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Flights }{@code >}
     *     
     */
    public JAXBElement<Flights> getFirstFlight() {
        return firstFlight;
    }

    /**
     * Sets the value of the firstFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Flights }{@code >}
     *     
     */
    public void setFirstFlight(JAXBElement<Flights> value) {
        this.firstFlight = value;
    }

    /**
     * Gets the value of the flightAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlightAmount() {
        return flightAmount;
    }

    /**
     * Sets the value of the flightAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlightAmount(BigDecimal value) {
        this.flightAmount = value;
    }

    /**
     * Gets the value of the flightIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightIndex() {
        return flightIndex;
    }

    /**
     * Sets the value of the flightIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightIndex(Integer value) {
        this.flightIndex = value;
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
     * Gets the value of the fuelStopOverCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFuelStopOverCountry() {
        return fuelStopOverCountry;
    }

    /**
     * Sets the value of the fuelStopOverCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFuelStopOverCountry(JAXBElement<String> value) {
        this.fuelStopOverCountry = value;
    }

    /**
     * Gets the value of the hasBusinessClass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBusinessClass() {
        return hasBusinessClass;
    }

    /**
     * Sets the value of the hasBusinessClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBusinessClass(Boolean value) {
        this.hasBusinessClass = value;
    }

    /**
     * Gets the value of the hasBusinessFlexiClass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBusinessFlexiClass() {
        return hasBusinessFlexiClass;
    }

    /**
     * Sets the value of the hasBusinessFlexiClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBusinessFlexiClass(Boolean value) {
        this.hasBusinessFlexiClass = value;
    }

    /**
     * Gets the value of the hasEconomyFlexiClass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasEconomyFlexiClass() {
        return hasEconomyFlexiClass;
    }

    /**
     * Sets the value of the hasEconomyFlexiClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasEconomyFlexiClass(Boolean value) {
        this.hasEconomyFlexiClass = value;
    }

    /**
     * Gets the value of the hasPremiumEconomyClass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPremiumEconomyClass() {
        return hasPremiumEconomyClass;
    }

    /**
     * Sets the value of the hasPremiumEconomyClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPremiumEconomyClass(Boolean value) {
        this.hasPremiumEconomyClass = value;
    }

    /**
     * Gets the value of the hasSuperSaverClass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasSuperSaverClass() {
        return hasSuperSaverClass;
    }

    /**
     * Sets the value of the hasSuperSaverClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasSuperSaverClass(Boolean value) {
        this.hasSuperSaverClass = value;
    }

    /**
     * Gets the value of the ibAvailFareGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFareGroupAirlineFlight }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFareGroupAirlineFlight> getIBAvailFareGroups() {
        return ibAvailFareGroups;
    }

    /**
     * Sets the value of the ibAvailFareGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFareGroupAirlineFlight }{@code >}
     *     
     */
    public void setIBAvailFareGroups(JAXBElement<ArrayOfFareGroupAirlineFlight> value) {
        this.ibAvailFareGroups = value;
    }

    /**
     * Gets the value of the isActualData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActualData() {
        return isActualData;
    }

    /**
     * Sets the value of the isActualData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActualData(Boolean value) {
        this.isActualData = value;
    }

    /**
     * Gets the value of the isArrCombineFlight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsArrCombineFlight() {
        return isArrCombineFlight;
    }

    /**
     * Sets the value of the isArrCombineFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsArrCombineFlight(Boolean value) {
        this.isArrCombineFlight = value;
    }

    /**
     * Gets the value of the isBusinessFlexiNA property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBusinessFlexiNA() {
        return isBusinessFlexiNA;
    }

    /**
     * Sets the value of the isBusinessFlexiNA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBusinessFlexiNA(Boolean value) {
        this.isBusinessFlexiNA = value;
    }

    /**
     * Gets the value of the isBusinessNA property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBusinessNA() {
        return isBusinessNA;
    }

    /**
     * Sets the value of the isBusinessNA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBusinessNA(Boolean value) {
        this.isBusinessNA = value;
    }

    /**
     * Gets the value of the isDepCombineFlight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDepCombineFlight() {
        return isDepCombineFlight;
    }

    /**
     * Sets the value of the isDepCombineFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDepCombineFlight(Boolean value) {
        this.isDepCombineFlight = value;
    }

    /**
     * Gets the value of the isDepartureConnectionFlight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDepartureConnectionFlight() {
        return isDepartureConnectionFlight;
    }

    /**
     * Sets the value of the isDepartureConnectionFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDepartureConnectionFlight(Boolean value) {
        this.isDepartureConnectionFlight = value;
    }

    /**
     * Gets the value of the isEconomyNA property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEconomyNA() {
        return isEconomyNA;
    }

    /**
     * Sets the value of the isEconomyNA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEconomyNA(Boolean value) {
        this.isEconomyNA = value;
    }

    /**
     * Gets the value of the isFirstFlight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFirstFlight() {
        return isFirstFlight;
    }

    /**
     * Sets the value of the isFirstFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFirstFlight(Boolean value) {
        this.isFirstFlight = value;
    }

    /**
     * Gets the value of the isFuelStopOver property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFuelStopOver() {
        return isFuelStopOver;
    }

    /**
     * Sets the value of the isFuelStopOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFuelStopOver(Boolean value) {
        this.isFuelStopOver = value;
    }

    /**
     * Gets the value of the isHideFlightPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHideFlightPrice() {
        return isHideFlightPrice;
    }

    /**
     * Sets the value of the isHideFlightPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHideFlightPrice(Boolean value) {
        this.isHideFlightPrice = value;
    }

    /**
     * Gets the value of the isMilesBooking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMilesBooking() {
        return isMilesBooking;
    }

    /**
     * Sets the value of the isMilesBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMilesBooking(Boolean value) {
        this.isMilesBooking = value;
    }

    /**
     * Gets the value of the isNoShowFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNoShowFee() {
        return isNoShowFee;
    }

    /**
     * Sets the value of the isNoShowFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNoShowFee(Boolean value) {
        this.isNoShowFee = value;
    }

    /**
     * Gets the value of the isPremiumEconomyNA property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPremiumEconomyNA() {
        return isPremiumEconomyNA;
    }

    /**
     * Sets the value of the isPremiumEconomyNA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPremiumEconomyNA(Boolean value) {
        this.isPremiumEconomyNA = value;
    }

    /**
     * Gets the value of the isPromoClassApplied property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPromoClassApplied() {
        return isPromoClassApplied;
    }

    /**
     * Sets the value of the isPromoClassApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPromoClassApplied(Boolean value) {
        this.isPromoClassApplied = value;
    }

    /**
     * Gets the value of the isPromoNA property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPromoNA() {
        return isPromoNA;
    }

    /**
     * Sets the value of the isPromoNA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPromoNA(Boolean value) {
        this.isPromoNA = value;
    }

    /**
     * Gets the value of the isShowBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowBusiness() {
        return isShowBusiness;
    }

    /**
     * Sets the value of the isShowBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowBusiness(Boolean value) {
        this.isShowBusiness = value;
    }

    /**
     * Gets the value of the isShowBusinessFlexi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowBusinessFlexi() {
        return isShowBusinessFlexi;
    }

    /**
     * Sets the value of the isShowBusinessFlexi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowBusinessFlexi(Boolean value) {
        this.isShowBusinessFlexi = value;
    }

    /**
     * Gets the value of the isShowEconomy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowEconomy() {
        return isShowEconomy;
    }

    /**
     * Sets the value of the isShowEconomy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowEconomy(Boolean value) {
        this.isShowEconomy = value;
    }

    /**
     * Gets the value of the isShowPremiumEconomy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowPremiumEconomy() {
        return isShowPremiumEconomy;
    }

    /**
     * Sets the value of the isShowPremiumEconomy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowPremiumEconomy(Boolean value) {
        this.isShowPremiumEconomy = value;
    }

    /**
     * Gets the value of the isShowPromo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowPromo() {
        return isShowPromo;
    }

    /**
     * Sets the value of the isShowPromo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowPromo(Boolean value) {
        this.isShowPromo = value;
    }

    /**
     * Gets the value of the isShowSuperSaver property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowSuperSaver() {
        return isShowSuperSaver;
    }

    /**
     * Sets the value of the isShowSuperSaver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowSuperSaver(Boolean value) {
        this.isShowSuperSaver = value;
    }

    /**
     * Gets the value of the isShowmEconomyFlexi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsShowmEconomyFlexi() {
        return isShowmEconomyFlexi;
    }

    /**
     * Sets the value of the isShowmEconomyFlexi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsShowmEconomyFlexi(Boolean value) {
        this.isShowmEconomyFlexi = value;
    }

    /**
     * Gets the value of the isValidPromoCode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValidPromoCode() {
        return isValidPromoCode;
    }

    /**
     * Sets the value of the isValidPromoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValidPromoCode(Boolean value) {
        this.isValidPromoCode = value;
    }

    /**
     * Gets the value of the maCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMACode() {
        return maCode;
    }

    /**
     * Sets the value of the maCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMACode(JAXBElement<String> value) {
        this.maCode = value;
    }

    /**
     * Gets the value of the maName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMAName() {
        return maName;
    }

    /**
     * Sets the value of the maName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMAName(JAXBElement<String> value) {
        this.maName = value;
    }

    /**
     * Gets the value of the maNameML property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMANameML() {
        return maNameML;
    }

    /**
     * Sets the value of the maNameML property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMANameML(JAXBElement<String> value) {
        this.maNameML = value;
    }

    /**
     * Gets the value of the mlFlightList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlights }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFlights> getMLFlightList() {
        return mlFlightList;
    }

    /**
     * Sets the value of the mlFlightList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFlights }{@code >}
     *     
     */
    public void setMLFlightList(JAXBElement<ArrayOfFlights> value) {
        this.mlFlightList = value;
    }

    /**
     * Gets the value of the mlPriceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriceInformation }{@code >}
     *     
     */
    public JAXBElement<PriceInformation> getMLPriceInformation() {
        return mlPriceInformation;
    }

    /**
     * Sets the value of the mlPriceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriceInformation }{@code >}
     *     
     */
    public void setMLPriceInformation(JAXBElement<PriceInformation> value) {
        this.mlPriceInformation = value;
    }

    /**
     * Gets the value of the minFlightClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinFlightClass() {
        return minFlightClass;
    }

    /**
     * Sets the value of the minFlightClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinFlightClass(JAXBElement<String> value) {
        this.minFlightClass = value;
    }

    /**
     * Gets the value of the noAdults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoAdults() {
        return noAdults;
    }

    /**
     * Sets the value of the noAdults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoAdults(Integer value) {
        this.noAdults = value;
    }

    /**
     * Gets the value of the noChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoChildren() {
        return noChildren;
    }

    /**
     * Sets the value of the noChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoChildren(Integer value) {
        this.noChildren = value;
    }

    /**
     * Gets the value of the noInfants property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoInfants() {
        return noInfants;
    }

    /**
     * Sets the value of the noInfants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoInfants(Integer value) {
        this.noInfants = value;
    }

    /**
     * Gets the value of the noSpecialPax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SpecialTypePaxCount }{@code >}
     *     
     */
    public JAXBElement<SpecialTypePaxCount> getNoSpecialPax() {
        return noSpecialPax;
    }

    /**
     * Sets the value of the noSpecialPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SpecialTypePaxCount }{@code >}
     *     
     */
    public void setNoSpecialPax(JAXBElement<SpecialTypePaxCount> value) {
        this.noSpecialPax = value;
    }

    /**
     * Gets the value of the noStops property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoStops() {
        return noStops;
    }

    /**
     * Sets the value of the noStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoStops(Integer value) {
        this.noStops = value;
    }

    /**
     * Gets the value of the obAvailFareGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFareGroupAirlineFlight }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFareGroupAirlineFlight> getOBAvailFareGroups() {
        return obAvailFareGroups;
    }

    /**
     * Sets the value of the obAvailFareGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFareGroupAirlineFlight }{@code >}
     *     
     */
    public void setOBAvailFareGroups(JAXBElement<ArrayOfFareGroupAirlineFlight> value) {
        this.obAvailFareGroups = value;
    }

    /**
     * Gets the value of the pUnitID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPUnitID() {
        return pUnitID;
    }

    /**
     * Sets the value of the pUnitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPUnitID(Integer value) {
        this.pUnitID = value;
    }

    /**
     * Gets the value of the perAdultPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerAdultPrice() {
        return perAdultPrice;
    }

    /**
     * Sets the value of the perAdultPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerAdultPrice(BigDecimal value) {
        this.perAdultPrice = value;
    }

    /**
     * Gets the value of the premiumEconomyFlight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Flights }{@code >}
     *     
     */
    public JAXBElement<Flights> getPremiumEconomyFlight() {
        return premiumEconomyFlight;
    }

    /**
     * Sets the value of the premiumEconomyFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Flights }{@code >}
     *     
     */
    public void setPremiumEconomyFlight(JAXBElement<Flights> value) {
        this.premiumEconomyFlight = value;
    }

    /**
     * Gets the value of the promoFlight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Flights }{@code >}
     *     
     */
    public JAXBElement<Flights> getPromoFlight() {
        return promoFlight;
    }

    /**
     * Sets the value of the promoFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Flights }{@code >}
     *     
     */
    public void setPromoFlight(JAXBElement<Flights> value) {
        this.promoFlight = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegion(JAXBElement<String> value) {
        this.region = value;
    }

    /**
     * Gets the value of the segmentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAirlineFlightSegment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAirlineFlightSegment> getSegmentInformation() {
        return segmentInformation;
    }

    /**
     * Sets the value of the segmentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAirlineFlightSegment }{@code >}
     *     
     */
    public void setSegmentInformation(JAXBElement<ArrayOfAirlineFlightSegment> value) {
        this.segmentInformation = value;
    }

    /**
     * Gets the value of the superSaverFlight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Flights }{@code >}
     *     
     */
    public JAXBElement<Flights> getSuperSaverFlight() {
        return superSaverFlight;
    }

    /**
     * Sets the value of the superSaverFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Flights }{@code >}
     *     
     */
    public void setSuperSaverFlight(JAXBElement<Flights> value) {
        this.superSaverFlight = value;
    }

    /**
     * Gets the value of the totalDura property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalDura() {
        return totalDura;
    }

    /**
     * Sets the value of the totalDura property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalDura(JAXBElement<String> value) {
        this.totalDura = value;
    }

    /**
     * Gets the value of the totalNoStops property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNoStops() {
        return totalNoStops;
    }

    /**
     * Sets the value of the totalNoStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNoStops(Integer value) {
        this.totalNoStops = value;
    }

    /**
     * Gets the value of the totalSegmentsWithStopOver property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalSegmentsWithStopOver() {
        return totalSegmentsWithStopOver;
    }

    /**
     * Sets the value of the totalSegmentsWithStopOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalSegmentsWithStopOver(Integer value) {
        this.totalSegmentsWithStopOver = value;
    }

    /**
     * Gets the value of the dispFlightAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispFlightAmount() {
        return dispFlightAmount;
    }

    /**
     * Sets the value of the dispFlightAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispFlightAmount(JAXBElement<String> value) {
        this.dispFlightAmount = value;
    }

}
