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
 * <p>Java class for MarkupFlightEN complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MarkupFlightEN">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}MarkupGroupsEN">
 *       &lt;sequence>
 *         &lt;element name="AdultPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Airlines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppliesToDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrCities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B2BId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="B2BUserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BookingStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CabinClass" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}CabinClass" minOccurs="0"/>
 *         &lt;element name="CalcMarkupBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChildPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepCities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightJourneyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InfantPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IsAddToTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsApplyIfFirstSegAirCodeMatches" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsApplyToMultiSegmentFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPercentageBased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MarkupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarkupFCancellationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MarkupID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MarkupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarkupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TravelEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TravelStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkupFlightEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "adultPrice",
    "airlines",
    "appliesToDays",
    "arrCities",
    "b2BId",
    "b2BUserId",
    "bookingClass",
    "bookingEndDate",
    "bookingStartDate",
    "cabinClass",
    "calcMarkupBy",
    "childPrice",
    "currencyCode",
    "depCities",
    "endPrice",
    "fareType",
    "flightJourneyType",
    "infantPrice",
    "isAddToTax",
    "isApplyIfFirstSegAirCodeMatches",
    "isApplyToMultiSegmentFlight",
    "isPercentageBased",
    "markupCode",
    "markupFCancellationID",
    "markupID",
    "markupName",
    "markupType",
    "prefix",
    "startPrice",
    "travelEndDate",
    "travelStartDate"
})
public class MarkupFlightEN
    extends MarkupGroupsEN {

  @XmlElement(name = "AdultPrice")
  protected BigDecimal adultPrice;
  @XmlElement(name = "Airlines", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String airlines;
  @XmlElement(name = "AppliesToDays", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String appliesToDays;
  @XmlElement(name = "ArrCities", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String arrCities;
  @XmlElement(name = "B2BId")
  protected Integer b2BId;
  @XmlElement(name = "B2BUserId")
  protected Integer b2BUserId;
  @XmlElement(name = "BookingClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String bookingClass;
  @XmlElement(name = "BookingEndDate")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar bookingEndDate;
  @XmlElement(name = "BookingStartDate")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar bookingStartDate;
  @XmlElement(name = "CabinClass")
  @XmlSchemaType(name = "string")
  protected CabinClass cabinClass;
  @XmlElement(name = "CalcMarkupBy", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String calcMarkupBy;
  @XmlElement(name = "ChildPrice")
  protected BigDecimal childPrice;
  @XmlElement(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String currencyCode;
  @XmlElement(name = "DepCities", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String depCities;
  @XmlElement(name = "EndPrice")
  protected BigDecimal endPrice;
  @XmlElement(name = "FareType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String fareType;
  @XmlElement(name = "FlightJourneyType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String flightJourneyType;
  @XmlElement(name = "InfantPrice")
  protected BigDecimal infantPrice;
  @XmlElement(name = "IsAddToTax")
  protected Boolean isAddToTax;
  @XmlElement(name = "IsApplyIfFirstSegAirCodeMatches")
  protected Boolean isApplyIfFirstSegAirCodeMatches;
  @XmlElement(name = "IsApplyToMultiSegmentFlight")
  protected Boolean isApplyToMultiSegmentFlight;
  @XmlElement(name = "IsPercentageBased")
  protected Boolean isPercentageBased;
  @XmlElement(name = "MarkupCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String markupCode;
  @XmlElement(name = "MarkupFCancellationID")
  protected Integer markupFCancellationID;
  @XmlElement(name = "MarkupID")
  protected Integer markupID;
  @XmlElement(name = "MarkupName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String markupName;
  @XmlElement(name = "MarkupType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String markupType;
  @XmlElement(name = "Prefix", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", required = false)
  protected String prefix;
  @XmlElement(name = "StartPrice")
  protected BigDecimal startPrice;
  @XmlElement(name = "TravelEndDate")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar travelEndDate;
  @XmlElement(name = "TravelStartDate")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar travelStartDate;

}
