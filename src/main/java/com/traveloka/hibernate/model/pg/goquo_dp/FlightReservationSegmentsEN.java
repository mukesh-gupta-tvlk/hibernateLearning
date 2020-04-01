
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FlightReservationSegmentsEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightReservationSegmentsEN">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}SegmentPaxPriceEN">
 *       &lt;sequence>
 *         &lt;element name="ATMPaymentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdultFreeBaggage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Aircraft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BookingChannel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMFareBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChildFareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChildFreeBaggage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CodeSharePNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EndCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCityCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCityCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCityForInsAPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExFlightReservationSegmentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FareBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightFareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightReservationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FlightReservationSegmentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FlightSegmentRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GuestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBArrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBDepCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InfantFareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InfantFreeBaggage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsCancellable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDateChangable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsInsuranceAvailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsProperETicket" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsRedemed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="JourneyType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LegIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ManagementResponseID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Meals" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MktairlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MktairlineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoAdults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoChildren" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoInfant" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OprAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OprAirlineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PNRNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricableUnitID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PromoId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PromoOfferId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="Seats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SegmentNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SegmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellingCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShopLionCUId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SpecialPaxFareBasisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SplPaxFreeBaggage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartCityCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartCityCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartCityForInsAPI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Stops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TicketStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TicketingDeadLine" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dispArrDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispDepDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dispTicketingDeadLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightReservationSegmentsEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "atmPaymentCode",
    "adultFreeBaggage",
    "aircraft",
    "arrDateTime",
    "bookingChannel",
    "bookingClass",
    "cmFareBasis",
    "cabinClass",
    "childFareBasisCode",
    "childFreeBaggage",
    "codeSharePNR",
    "depDateTime",
    "direction",
    "endCityCode",
    "endCityCountryCode",
    "endCityCountryName",
    "endCityForInsAPI",
    "endCityName",
    "exFlightReservationSegmentID",
    "fareBasis",
    "fareID",
    "flightFareBasisCode",
    "flightNo",
    "flightReservationID",
    "flightReservationSegmentID",
    "flightSegmentRef",
    "gateway",
    "guestName",
    "ibArrCityCode",
    "ibDepCityCode",
    "infantFareBasisCode",
    "infantFreeBaggage",
    "isCancellable",
    "isDateChangable",
    "isInsuranceAvailable",
    "isProperETicket",
    "isRedemed",
    "journeyType",
    "legIndex",
    "managementResponseID",
    "meals",
    "mktairlineCode",
    "mktairlineName",
    "noAdults",
    "noChildren",
    "noInfant",
    "oprAirlineCode",
    "oprAirlineName",
    "pnrNo",
    "pricableUnitID",
    "promoId",
    "promoOfferId",
    "reservationID",
    "resultMsg",
    "seats",
    "segmentIndex",
    "segmentNo",
    "segmentStatus",
    "sellingCurrency",
    "shopLionCUId",
    "specialPaxFareBasisCode",
    "splPaxFreeBaggage",
    "startCityCode",
    "startCityCountryCode",
    "startCityCountryName",
    "startCityForInsAPI",
    "startCityName",
    "status",
    "stops",
    "ticketStatus",
    "ticketingDeadLine",
    "dispArrDateTime",
    "dispDepDateTime",
    "dispTicketingDeadLine"
})
public class FlightReservationSegmentsEN
    extends SegmentPaxPriceEN
{

    @XmlElementRef(name = "ATMPaymentCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> atmPaymentCode;
    @XmlElement(name = "AdultFreeBaggage")
    protected Integer adultFreeBaggage;
    @XmlElementRef(name = "Aircraft", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aircraft;
    @XmlElement(name = "ArrDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrDateTime;
    @XmlElement(name = "BookingChannel")
    protected Integer bookingChannel;
    @XmlElementRef(name = "BookingClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingClass;
    @XmlElementRef(name = "CMFareBasis", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cmFareBasis;
    @XmlElementRef(name = "CabinClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cabinClass;
    @XmlElementRef(name = "ChildFareBasisCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> childFareBasisCode;
    @XmlElement(name = "ChildFreeBaggage")
    protected Integer childFreeBaggage;
    @XmlElementRef(name = "CodeSharePNR", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codeSharePNR;
    @XmlElement(name = "DepDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depDateTime;
    @XmlElement(name = "Direction")
    protected Integer direction;
    @XmlElementRef(name = "EndCityCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endCityCode;
    @XmlElementRef(name = "EndCityCountryCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endCityCountryCode;
    @XmlElementRef(name = "EndCityCountryName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endCityCountryName;
    @XmlElementRef(name = "EndCityForInsAPI", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endCityForInsAPI;
    @XmlElementRef(name = "EndCityName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endCityName;
    @XmlElement(name = "ExFlightReservationSegmentID")
    protected Integer exFlightReservationSegmentID;
    @XmlElementRef(name = "FareBasis", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareBasis;
    @XmlElementRef(name = "FareID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fareID;
    @XmlElementRef(name = "FlightFareBasisCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightFareBasisCode;
    @XmlElementRef(name = "FlightNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightNo;
    @XmlElement(name = "FlightReservationID")
    protected Integer flightReservationID;
    @XmlElement(name = "FlightReservationSegmentID")
    protected Integer flightReservationSegmentID;
    @XmlElementRef(name = "FlightSegmentRef", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightSegmentRef;
    @XmlElementRef(name = "Gateway", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gateway;
    @XmlElementRef(name = "GuestName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> guestName;
    @XmlElementRef(name = "IBArrCityCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ibArrCityCode;
    @XmlElementRef(name = "IBDepCityCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ibDepCityCode;
    @XmlElementRef(name = "InfantFareBasisCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> infantFareBasisCode;
    @XmlElement(name = "InfantFreeBaggage")
    protected Integer infantFreeBaggage;
    @XmlElement(name = "IsCancellable")
    protected Boolean isCancellable;
    @XmlElement(name = "IsDateChangable")
    protected Boolean isDateChangable;
    @XmlElement(name = "IsInsuranceAvailable")
    protected Integer isInsuranceAvailable;
    @XmlElement(name = "IsProperETicket")
    protected Integer isProperETicket;
    @XmlElement(name = "IsRedemed")
    protected Integer isRedemed;
    @XmlElement(name = "JourneyType")
    protected Integer journeyType;
    @XmlElement(name = "LegIndex")
    protected Integer legIndex;
    @XmlElement(name = "ManagementResponseID")
    protected Long managementResponseID;
    @XmlElementRef(name = "Meals", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> meals;
    @XmlElementRef(name = "MktairlineCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mktairlineCode;
    @XmlElementRef(name = "MktairlineName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mktairlineName;
    @XmlElement(name = "NoAdults")
    protected Integer noAdults;
    @XmlElement(name = "NoChildren")
    protected Integer noChildren;
    @XmlElement(name = "NoInfant")
    protected Integer noInfant;
    @XmlElementRef(name = "OprAirlineCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oprAirlineCode;
    @XmlElementRef(name = "OprAirlineName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oprAirlineName;
    @XmlElementRef(name = "PNRNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pnrNo;
    @XmlElement(name = "PricableUnitID")
    protected Integer pricableUnitID;
    @XmlElement(name = "PromoId")
    protected Integer promoId;
    @XmlElement(name = "PromoOfferId")
    protected Integer promoOfferId;
    @XmlElementRef(name = "ReservationID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reservationID;
    @XmlElementRef(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> resultMsg;
    @XmlElementRef(name = "Seats", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seats;
    @XmlElement(name = "SegmentIndex")
    protected Integer segmentIndex;
    @XmlElement(name = "SegmentNo")
    protected Integer segmentNo;
    @XmlElementRef(name = "SegmentStatus", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segmentStatus;
    @XmlElementRef(name = "SellingCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sellingCurrency;
    @XmlElement(name = "ShopLionCUId")
    protected Integer shopLionCUId;
    @XmlElementRef(name = "SpecialPaxFareBasisCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialPaxFareBasisCode;
    @XmlElementRef(name = "SplPaxFreeBaggage", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> splPaxFreeBaggage;
    @XmlElementRef(name = "StartCityCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startCityCode;
    @XmlElementRef(name = "StartCityCountryCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startCityCountryCode;
    @XmlElementRef(name = "StartCityCountryName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startCityCountryName;
    @XmlElementRef(name = "StartCityForInsAPI", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startCityForInsAPI;
    @XmlElementRef(name = "StartCityName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startCityName;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElement(name = "Stops")
    protected Integer stops;
    @XmlElement(name = "TicketStatus")
    protected Integer ticketStatus;
    @XmlElement(name = "TicketingDeadLine")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ticketingDeadLine;
    @XmlElementRef(name = "dispArrDateTime", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispArrDateTime;
    @XmlElementRef(name = "dispDepDateTime", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispDepDateTime;
    @XmlElementRef(name = "dispTicketingDeadLine", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispTicketingDeadLine;

    /**
     * Gets the value of the atmPaymentCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getATMPaymentCode() {
        return atmPaymentCode;
    }

    /**
     * Sets the value of the atmPaymentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setATMPaymentCode(JAXBElement<String> value) {
        this.atmPaymentCode = value;
    }

    /**
     * Gets the value of the adultFreeBaggage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdultFreeBaggage() {
        return adultFreeBaggage;
    }

    /**
     * Sets the value of the adultFreeBaggage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdultFreeBaggage(Integer value) {
        this.adultFreeBaggage = value;
    }

    /**
     * Gets the value of the aircraft property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAircraft() {
        return aircraft;
    }

    /**
     * Sets the value of the aircraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAircraft(JAXBElement<String> value) {
        this.aircraft = value;
    }

    /**
     * Gets the value of the arrDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrDateTime() {
        return arrDateTime;
    }

    /**
     * Sets the value of the arrDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrDateTime(XMLGregorianCalendar value) {
        this.arrDateTime = value;
    }

    /**
     * Gets the value of the bookingChannel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBookingChannel() {
        return bookingChannel;
    }

    /**
     * Sets the value of the bookingChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBookingChannel(Integer value) {
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
     * Gets the value of the cmFareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCMFareBasis() {
        return cmFareBasis;
    }

    /**
     * Sets the value of the cmFareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCMFareBasis(JAXBElement<String> value) {
        this.cmFareBasis = value;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCabinClass(JAXBElement<String> value) {
        this.cabinClass = value;
    }

    /**
     * Gets the value of the childFareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChildFareBasisCode() {
        return childFareBasisCode;
    }

    /**
     * Sets the value of the childFareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChildFareBasisCode(JAXBElement<String> value) {
        this.childFareBasisCode = value;
    }

    /**
     * Gets the value of the childFreeBaggage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildFreeBaggage() {
        return childFreeBaggage;
    }

    /**
     * Sets the value of the childFreeBaggage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildFreeBaggage(Integer value) {
        this.childFreeBaggage = value;
    }

    /**
     * Gets the value of the codeSharePNR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodeSharePNR() {
        return codeSharePNR;
    }

    /**
     * Sets the value of the codeSharePNR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodeSharePNR(JAXBElement<String> value) {
        this.codeSharePNR = value;
    }

    /**
     * Gets the value of the depDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepDateTime() {
        return depDateTime;
    }

    /**
     * Sets the value of the depDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepDateTime(XMLGregorianCalendar value) {
        this.depDateTime = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirection(Integer value) {
        this.direction = value;
    }

    /**
     * Gets the value of the endCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndCityCode() {
        return endCityCode;
    }

    /**
     * Sets the value of the endCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndCityCode(JAXBElement<String> value) {
        this.endCityCode = value;
    }

    /**
     * Gets the value of the endCityCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndCityCountryCode() {
        return endCityCountryCode;
    }

    /**
     * Sets the value of the endCityCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndCityCountryCode(JAXBElement<String> value) {
        this.endCityCountryCode = value;
    }

    /**
     * Gets the value of the endCityCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndCityCountryName() {
        return endCityCountryName;
    }

    /**
     * Sets the value of the endCityCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndCityCountryName(JAXBElement<String> value) {
        this.endCityCountryName = value;
    }

    /**
     * Gets the value of the endCityForInsAPI property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndCityForInsAPI() {
        return endCityForInsAPI;
    }

    /**
     * Sets the value of the endCityForInsAPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndCityForInsAPI(JAXBElement<String> value) {
        this.endCityForInsAPI = value;
    }

    /**
     * Gets the value of the endCityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndCityName() {
        return endCityName;
    }

    /**
     * Sets the value of the endCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndCityName(JAXBElement<String> value) {
        this.endCityName = value;
    }

    /**
     * Gets the value of the exFlightReservationSegmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExFlightReservationSegmentID() {
        return exFlightReservationSegmentID;
    }

    /**
     * Sets the value of the exFlightReservationSegmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExFlightReservationSegmentID(Integer value) {
        this.exFlightReservationSegmentID = value;
    }

    /**
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFareBasis(JAXBElement<String> value) {
        this.fareBasis = value;
    }

    /**
     * Gets the value of the fareID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFareID() {
        return fareID;
    }

    /**
     * Sets the value of the fareID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFareID(JAXBElement<String> value) {
        this.fareID = value;
    }

    /**
     * Gets the value of the flightFareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlightFareBasisCode() {
        return flightFareBasisCode;
    }

    /**
     * Sets the value of the flightFareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlightFareBasisCode(JAXBElement<String> value) {
        this.flightFareBasisCode = value;
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
     * Gets the value of the flightReservationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightReservationID() {
        return flightReservationID;
    }

    /**
     * Sets the value of the flightReservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightReservationID(Integer value) {
        this.flightReservationID = value;
    }

    /**
     * Gets the value of the flightReservationSegmentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightReservationSegmentID() {
        return flightReservationSegmentID;
    }

    /**
     * Sets the value of the flightReservationSegmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightReservationSegmentID(Integer value) {
        this.flightReservationSegmentID = value;
    }

    /**
     * Gets the value of the flightSegmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlightSegmentRef() {
        return flightSegmentRef;
    }

    /**
     * Sets the value of the flightSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlightSegmentRef(JAXBElement<String> value) {
        this.flightSegmentRef = value;
    }

    /**
     * Gets the value of the gateway property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGateway() {
        return gateway;
    }

    /**
     * Sets the value of the gateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGateway(JAXBElement<String> value) {
        this.gateway = value;
    }

    /**
     * Gets the value of the guestName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGuestName() {
        return guestName;
    }

    /**
     * Sets the value of the guestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGuestName(JAXBElement<String> value) {
        this.guestName = value;
    }

    /**
     * Gets the value of the ibArrCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIBArrCityCode() {
        return ibArrCityCode;
    }

    /**
     * Sets the value of the ibArrCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIBArrCityCode(JAXBElement<String> value) {
        this.ibArrCityCode = value;
    }

    /**
     * Gets the value of the ibDepCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIBDepCityCode() {
        return ibDepCityCode;
    }

    /**
     * Sets the value of the ibDepCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIBDepCityCode(JAXBElement<String> value) {
        this.ibDepCityCode = value;
    }

    /**
     * Gets the value of the infantFareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInfantFareBasisCode() {
        return infantFareBasisCode;
    }

    /**
     * Sets the value of the infantFareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInfantFareBasisCode(JAXBElement<String> value) {
        this.infantFareBasisCode = value;
    }

    /**
     * Gets the value of the infantFreeBaggage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInfantFreeBaggage() {
        return infantFreeBaggage;
    }

    /**
     * Sets the value of the infantFreeBaggage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInfantFreeBaggage(Integer value) {
        this.infantFreeBaggage = value;
    }

    /**
     * Gets the value of the isCancellable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCancellable() {
        return isCancellable;
    }

    /**
     * Sets the value of the isCancellable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCancellable(Boolean value) {
        this.isCancellable = value;
    }

    /**
     * Gets the value of the isDateChangable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDateChangable() {
        return isDateChangable;
    }

    /**
     * Sets the value of the isDateChangable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDateChangable(Boolean value) {
        this.isDateChangable = value;
    }

    /**
     * Gets the value of the isInsuranceAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsInsuranceAvailable() {
        return isInsuranceAvailable;
    }

    /**
     * Sets the value of the isInsuranceAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsInsuranceAvailable(Integer value) {
        this.isInsuranceAvailable = value;
    }

    /**
     * Gets the value of the isProperETicket property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsProperETicket() {
        return isProperETicket;
    }

    /**
     * Sets the value of the isProperETicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsProperETicket(Integer value) {
        this.isProperETicket = value;
    }

    /**
     * Gets the value of the isRedemed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsRedemed() {
        return isRedemed;
    }

    /**
     * Sets the value of the isRedemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsRedemed(Integer value) {
        this.isRedemed = value;
    }

    /**
     * Gets the value of the journeyType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJourneyType() {
        return journeyType;
    }

    /**
     * Sets the value of the journeyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJourneyType(Integer value) {
        this.journeyType = value;
    }

    /**
     * Gets the value of the legIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLegIndex() {
        return legIndex;
    }

    /**
     * Sets the value of the legIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLegIndex(Integer value) {
        this.legIndex = value;
    }

    /**
     * Gets the value of the managementResponseID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManagementResponseID() {
        return managementResponseID;
    }

    /**
     * Sets the value of the managementResponseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManagementResponseID(Long value) {
        this.managementResponseID = value;
    }

    /**
     * Gets the value of the meals property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMeals() {
        return meals;
    }

    /**
     * Sets the value of the meals property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMeals(JAXBElement<String> value) {
        this.meals = value;
    }

    /**
     * Gets the value of the mktairlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMktairlineCode() {
        return mktairlineCode;
    }

    /**
     * Sets the value of the mktairlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMktairlineCode(JAXBElement<String> value) {
        this.mktairlineCode = value;
    }

    /**
     * Gets the value of the mktairlineName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMktairlineName() {
        return mktairlineName;
    }

    /**
     * Sets the value of the mktairlineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMktairlineName(JAXBElement<String> value) {
        this.mktairlineName = value;
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
     * Gets the value of the noInfant property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoInfant() {
        return noInfant;
    }

    /**
     * Sets the value of the noInfant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoInfant(Integer value) {
        this.noInfant = value;
    }

    /**
     * Gets the value of the oprAirlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOprAirlineCode() {
        return oprAirlineCode;
    }

    /**
     * Sets the value of the oprAirlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOprAirlineCode(JAXBElement<String> value) {
        this.oprAirlineCode = value;
    }

    /**
     * Gets the value of the oprAirlineName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOprAirlineName() {
        return oprAirlineName;
    }

    /**
     * Sets the value of the oprAirlineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOprAirlineName(JAXBElement<String> value) {
        this.oprAirlineName = value;
    }

    /**
     * Gets the value of the pnrNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPNRNo() {
        return pnrNo;
    }

    /**
     * Sets the value of the pnrNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPNRNo(JAXBElement<String> value) {
        this.pnrNo = value;
    }

    /**
     * Gets the value of the pricableUnitID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPricableUnitID() {
        return pricableUnitID;
    }

    /**
     * Sets the value of the pricableUnitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPricableUnitID(Integer value) {
        this.pricableUnitID = value;
    }

    /**
     * Gets the value of the promoId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPromoId() {
        return promoId;
    }

    /**
     * Sets the value of the promoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPromoId(Integer value) {
        this.promoId = value;
    }

    /**
     * Gets the value of the promoOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPromoOfferId() {
        return promoOfferId;
    }

    /**
     * Sets the value of the promoOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPromoOfferId(Integer value) {
        this.promoOfferId = value;
    }

    /**
     * Gets the value of the reservationID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReservationID() {
        return reservationID;
    }

    /**
     * Sets the value of the reservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReservationID(JAXBElement<String> value) {
        this.reservationID = value;
    }

    /**
     * Gets the value of the resultMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public JAXBElement<Result> getResultMsg() {
        return resultMsg;
    }

    /**
     * Sets the value of the resultMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public void setResultMsg(JAXBElement<Result> value) {
        this.resultMsg = value;
    }

    /**
     * Gets the value of the seats property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeats() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeats(JAXBElement<String> value) {
        this.seats = value;
    }

    /**
     * Gets the value of the segmentIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentIndex() {
        return segmentIndex;
    }

    /**
     * Sets the value of the segmentIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentIndex(Integer value) {
        this.segmentIndex = value;
    }

    /**
     * Gets the value of the segmentNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentNo() {
        return segmentNo;
    }

    /**
     * Sets the value of the segmentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentNo(Integer value) {
        this.segmentNo = value;
    }

    /**
     * Gets the value of the segmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegmentStatus() {
        return segmentStatus;
    }

    /**
     * Sets the value of the segmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegmentStatus(JAXBElement<String> value) {
        this.segmentStatus = value;
    }

    /**
     * Gets the value of the sellingCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSellingCurrency() {
        return sellingCurrency;
    }

    /**
     * Sets the value of the sellingCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSellingCurrency(JAXBElement<String> value) {
        this.sellingCurrency = value;
    }

    /**
     * Gets the value of the shopLionCUId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShopLionCUId() {
        return shopLionCUId;
    }

    /**
     * Sets the value of the shopLionCUId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShopLionCUId(Integer value) {
        this.shopLionCUId = value;
    }

    /**
     * Gets the value of the specialPaxFareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialPaxFareBasisCode() {
        return specialPaxFareBasisCode;
    }

    /**
     * Sets the value of the specialPaxFareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialPaxFareBasisCode(JAXBElement<String> value) {
        this.specialPaxFareBasisCode = value;
    }

    /**
     * Gets the value of the splPaxFreeBaggage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSplPaxFreeBaggage() {
        return splPaxFreeBaggage;
    }

    /**
     * Sets the value of the splPaxFreeBaggage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSplPaxFreeBaggage(JAXBElement<String> value) {
        this.splPaxFreeBaggage = value;
    }

    /**
     * Gets the value of the startCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartCityCode() {
        return startCityCode;
    }

    /**
     * Sets the value of the startCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartCityCode(JAXBElement<String> value) {
        this.startCityCode = value;
    }

    /**
     * Gets the value of the startCityCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartCityCountryCode() {
        return startCityCountryCode;
    }

    /**
     * Sets the value of the startCityCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartCityCountryCode(JAXBElement<String> value) {
        this.startCityCountryCode = value;
    }

    /**
     * Gets the value of the startCityCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartCityCountryName() {
        return startCityCountryName;
    }

    /**
     * Sets the value of the startCityCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartCityCountryName(JAXBElement<String> value) {
        this.startCityCountryName = value;
    }

    /**
     * Gets the value of the startCityForInsAPI property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartCityForInsAPI() {
        return startCityForInsAPI;
    }

    /**
     * Sets the value of the startCityForInsAPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartCityForInsAPI(JAXBElement<String> value) {
        this.startCityForInsAPI = value;
    }

    /**
     * Gets the value of the startCityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartCityName() {
        return startCityName;
    }

    /**
     * Sets the value of the startCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartCityName(JAXBElement<String> value) {
        this.startCityName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the stops property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStops(Integer value) {
        this.stops = value;
    }

    /**
     * Gets the value of the ticketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTicketStatus() {
        return ticketStatus;
    }

    /**
     * Sets the value of the ticketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTicketStatus(Integer value) {
        this.ticketStatus = value;
    }

    /**
     * Gets the value of the ticketingDeadLine property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketingDeadLine() {
        return ticketingDeadLine;
    }

    /**
     * Sets the value of the ticketingDeadLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTicketingDeadLine(XMLGregorianCalendar value) {
        this.ticketingDeadLine = value;
    }

    /**
     * Gets the value of the dispArrDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispArrDateTime() {
        return dispArrDateTime;
    }

    /**
     * Sets the value of the dispArrDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispArrDateTime(JAXBElement<String> value) {
        this.dispArrDateTime = value;
    }

    /**
     * Gets the value of the dispDepDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispDepDateTime() {
        return dispDepDateTime;
    }

    /**
     * Sets the value of the dispDepDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispDepDateTime(JAXBElement<String> value) {
        this.dispDepDateTime = value;
    }

    /**
     * Gets the value of the dispTicketingDeadLine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispTicketingDeadLine() {
        return dispTicketingDeadLine;
    }

    /**
     * Sets the value of the dispTicketingDeadLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispTicketingDeadLine(JAXBElement<String> value) {
        this.dispTicketingDeadLine = value;
    }

}
