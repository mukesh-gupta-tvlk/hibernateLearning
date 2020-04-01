package com.traveloka.hibernate.model.pg.goquo_dp;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GDS_FlightSegment complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GDS_FlightSegment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActualCabinClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActualCabinClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdultFreeBaggageForDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirCraft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrAirName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrAirPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrAirPortCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ArrTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrivalTerminalInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}FlightTerminalInfo" minOccurs="0"/>
 *         &lt;element name="AvailSeats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMFareBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CabinClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChildFreeBaggageForDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepAirName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepAirPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepAirPortCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DepTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureTerminalInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}FlightTerminalInfo" minOccurs="0"/>
 *         &lt;element name="DisClosureAirline" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}DisClosureAirline" minOccurs="0"/>
 *         &lt;element name="DispArrDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispCabinClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispDepDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispFBCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispSegFBCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FBCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightSegmentRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreeBaggageForDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InfantFreeBaggageForDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntermediatePoints" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}IntermediatePoint" minOccurs="0"/>
 *         &lt;element name="IsFirstSegment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="JDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JDurationHRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JDurationMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JDurationText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MLFGCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarAirLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarAirLineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OprAirline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OprAirlineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherPaxFreeBaggageForDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentCabinClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProviderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegFBCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Stops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TDuraMins" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransTimeMins" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TravelTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Via" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDisplayDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDS_FlightSegment", propOrder = {
    "actualCabinClass",
    "actualCabinClassCode",
    "adultFreeBaggageForDisplay",
    "airCraft",
    "arrAirName",
    "arrAirPort",
    "arrAirPortCountry",
    "arrCityName",
    "arrDate",
    "arrDateTime",
    "arrTime",
    "arrivalTerminalInfo",
    "availSeats",
    "bookingClass",
    "cmFareBasis",
    "cabinClass",
    "cabinClassCode",
    "childFreeBaggageForDisplay",
    "classCode",
    "depAirName",
    "depAirPort",
    "depAirPortCountry",
    "depCityName",
    "depDate",
    "depDateTime",
    "depTime",
    "departureTerminalInfo",
    "disClosureAirline",
    "dispArrDate",
    "dispCabinClass",
    "dispDepDate",
    "dispFBCode",
    "dispSegFBCode",
    "fbCode",
    "flightNo",
    "flightSegmentRef",
    "freeBaggageForDisplay",
    "infantFreeBaggageForDisplay",
    "intermediatePoints",
    "isFirstSegment",
    "jDuration",
    "jDurationHRS",
    "jDurationMin",
    "jDurationText",
    "legIndex",
    "mlfgCode",
    "marAirLine",
    "marAirLineName",
    "oprAirline",
    "oprAirlineName",
    "otherPaxFreeBaggageForDisplay",
    "parentCabinClassCode",
    "providerID",
    "segFBCode",
    "segmentIndex",
    "stops",
    "tDuraMins",
    "tDuration",
    "transTime",
    "transTimeMins",
    "travelTime",
    "via",
    "isDisplayDuration"
})
public class GDSFlightSegment {

  @XmlElement(name = "ActualCabinClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String actualCabinClass;
  @XmlElement(name = "ActualCabinClassCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String actualCabinClassCode;
  @XmlElement(name = "AdultFreeBaggageForDisplay", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String adultFreeBaggageForDisplay;
  @XmlElement(name = "AirCraft", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String airCraft;
  @XmlElement(name = "ArrAirName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String arrAirName;
  @XmlElement(name = "ArrAirPort", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String arrAirPort;
  @XmlElement(name = "ArrAirPortCountry", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String arrAirPortCountry;
  @XmlElement(name = "ArrCityName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String arrCityName;
  @XmlElement(name = "ArrDate", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String arrDate;
  @XmlElement(name = "ArrDateTime")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar arrDateTime;
  @XmlElement(name = "ArrTime", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String arrTime;
  @XmlElement(name = "ArrivalTerminalInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected FlightTerminalInfo arrivalTerminalInfo;
  @XmlElement(name = "AvailSeats", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String availSeats;
  @XmlElement(name = "BookingClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String bookingClass;
  @XmlElement(name = "CMFareBasis", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String cmFareBasis;
  @XmlElement(name = "CabinClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String cabinClass;
  @XmlElement(name = "CabinClassCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String cabinClassCode;
  @XmlElement(name = "ChildFreeBaggageForDisplay", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String childFreeBaggageForDisplay;
  @XmlElement(name = "ClassCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String classCode;
  @XmlElement(name = "DepAirName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String depAirName;
  @XmlElement(name = "DepAirPort", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String depAirPort;
  @XmlElement(name = "DepAirPortCountry", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String depAirPortCountry;
  @XmlElement(name = "DepCityName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String depCityName;
  @XmlElement(name = "DepDate", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String depDate;
  @XmlElement(name = "DepDateTime")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar depDateTime;
  @XmlElement(name = "DepTime", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String depTime;
  @XmlElement(name = "DepartureTerminalInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected FlightTerminalInfo departureTerminalInfo;
  @XmlElement(name = "DisClosureAirline", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected DisClosureAirline disClosureAirline;
  @XmlElement(name = "DispArrDate", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispArrDate;
  @XmlElement(name = "DispCabinClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispCabinClass;
  @XmlElement(name = "DispDepDate", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispDepDate;
  @XmlElement(name = "DispFBCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispFBCode;
  @XmlElement(name = "DispSegFBCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String dispSegFBCode;
  @XmlElement(name = "FBCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String fbCode;
  @XmlElement(name = "FlightNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String flightNo;
  @XmlElement(name = "FlightSegmentRef", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String flightSegmentRef;
  @XmlElement(name = "FreeBaggageForDisplay", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String freeBaggageForDisplay;
  @XmlElement(name = "InfantFreeBaggageForDisplay", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String infantFreeBaggageForDisplay;
  @XmlElement(name = "IntermediatePoints", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected IntermediatePoint intermediatePoints;
  @XmlElement(name = "IsFirstSegment")
  protected Boolean isFirstSegment;
  @XmlElement(name = "JDuration", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String jDuration;
  @XmlElement(name = "JDurationHRS", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String jDurationHRS;
  @XmlElement(name = "JDurationMin", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String jDurationMin;
  @XmlElement(name = "JDurationText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String jDurationText;
  @XmlElement(name = "LegIndex")
  protected Integer legIndex;
  @XmlElement(name = "MLFGCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String mlfgCode;
  @XmlElement(name = "MarAirLine", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String marAirLine;
  @XmlElement(name = "MarAirLineName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String marAirLineName;
  @XmlElement(name = "OprAirline", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String oprAirline;
  @XmlElement(name = "OprAirlineName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String oprAirlineName;
  @XmlElement(name = "OtherPaxFreeBaggageForDisplay", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String otherPaxFreeBaggageForDisplay;
  @XmlElement(name = "ParentCabinClassCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String parentCabinClassCode;
  @XmlElement(name = "ProviderID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String providerID;
  @XmlElement(name = "SegFBCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String segFBCode;
  @XmlElement(name = "SegmentIndex")
  protected Integer segmentIndex;
  @XmlElement(name = "Stops")
  protected Integer stops;
  @XmlElement(name = "TDuraMins")
  protected Integer tDuraMins;
  @XmlElement(name = "TDuration", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String tDuration;
  @XmlElement(name = "TransTime", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String transTime;
  @XmlElement(name = "TransTimeMins")
  protected Integer transTimeMins;
  @XmlElement(name = "TravelTime", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String travelTime;
  @XmlElement(name = "Via", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String via;
  @XmlElement(name = "isDisplayDuration")
  protected Boolean isDisplayDuration;

}
