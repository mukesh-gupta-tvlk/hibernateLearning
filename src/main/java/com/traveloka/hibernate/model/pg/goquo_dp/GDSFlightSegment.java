
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
 * 
 * 
 */
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

    @XmlElementRef(name = "ActualCabinClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actualCabinClass;
    @XmlElementRef(name = "ActualCabinClassCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actualCabinClassCode;
    @XmlElementRef(name = "AdultFreeBaggageForDisplay", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adultFreeBaggageForDisplay;
    @XmlElementRef(name = "AirCraft", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airCraft;
    @XmlElementRef(name = "ArrAirName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrAirName;
    @XmlElementRef(name = "ArrAirPort", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrAirPort;
    @XmlElementRef(name = "ArrAirPortCountry", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrAirPortCountry;
    @XmlElementRef(name = "ArrCityName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrCityName;
    @XmlElementRef(name = "ArrDate", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrDate;
    @XmlElement(name = "ArrDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrDateTime;
    @XmlElementRef(name = "ArrTime", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrTime;
    @XmlElementRef(name = "ArrivalTerminalInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightTerminalInfo> arrivalTerminalInfo;
    @XmlElementRef(name = "AvailSeats", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> availSeats;
    @XmlElementRef(name = "BookingClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingClass;
    @XmlElementRef(name = "CMFareBasis", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cmFareBasis;
    @XmlElementRef(name = "CabinClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cabinClass;
    @XmlElementRef(name = "CabinClassCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cabinClassCode;
    @XmlElementRef(name = "ChildFreeBaggageForDisplay", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> childFreeBaggageForDisplay;
    @XmlElementRef(name = "ClassCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> classCode;
    @XmlElementRef(name = "DepAirName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depAirName;
    @XmlElementRef(name = "DepAirPort", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depAirPort;
    @XmlElementRef(name = "DepAirPortCountry", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depAirPortCountry;
    @XmlElementRef(name = "DepCityName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depCityName;
    @XmlElementRef(name = "DepDate", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depDate;
    @XmlElement(name = "DepDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depDateTime;
    @XmlElementRef(name = "DepTime", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depTime;
    @XmlElementRef(name = "DepartureTerminalInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<FlightTerminalInfo> departureTerminalInfo;
    @XmlElementRef(name = "DisClosureAirline", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<DisClosureAirline> disClosureAirline;
    @XmlElementRef(name = "DispArrDate", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispArrDate;
    @XmlElementRef(name = "DispCabinClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispCabinClass;
    @XmlElementRef(name = "DispDepDate", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispDepDate;
    @XmlElementRef(name = "DispFBCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispFBCode;
    @XmlElementRef(name = "DispSegFBCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispSegFBCode;
    @XmlElementRef(name = "FBCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fbCode;
    @XmlElementRef(name = "FlightNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightNo;
    @XmlElementRef(name = "FlightSegmentRef", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightSegmentRef;
    @XmlElementRef(name = "FreeBaggageForDisplay", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> freeBaggageForDisplay;
    @XmlElementRef(name = "InfantFreeBaggageForDisplay", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> infantFreeBaggageForDisplay;
    @XmlElementRef(name = "IntermediatePoints", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<IntermediatePoint> intermediatePoints;
    @XmlElement(name = "IsFirstSegment")
    protected Boolean isFirstSegment;
    @XmlElementRef(name = "JDuration", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jDuration;
    @XmlElementRef(name = "JDurationHRS", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jDurationHRS;
    @XmlElementRef(name = "JDurationMin", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jDurationMin;
    @XmlElementRef(name = "JDurationText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jDurationText;
    @XmlElement(name = "LegIndex")
    protected Integer legIndex;
    @XmlElementRef(name = "MLFGCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mlfgCode;
    @XmlElementRef(name = "MarAirLine", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marAirLine;
    @XmlElementRef(name = "MarAirLineName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marAirLineName;
    @XmlElementRef(name = "OprAirline", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oprAirline;
    @XmlElementRef(name = "OprAirlineName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oprAirlineName;
    @XmlElementRef(name = "OtherPaxFreeBaggageForDisplay", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otherPaxFreeBaggageForDisplay;
    @XmlElementRef(name = "ParentCabinClassCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentCabinClassCode;
    @XmlElementRef(name = "ProviderID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> providerID;
    @XmlElementRef(name = "SegFBCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segFBCode;
    @XmlElement(name = "SegmentIndex")
    protected Integer segmentIndex;
    @XmlElement(name = "Stops")
    protected Integer stops;
    @XmlElement(name = "TDuraMins")
    protected Integer tDuraMins;
    @XmlElementRef(name = "TDuration", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tDuration;
    @XmlElementRef(name = "TransTime", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transTime;
    @XmlElement(name = "TransTimeMins")
    protected Integer transTimeMins;
    @XmlElementRef(name = "TravelTime", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> travelTime;
    @XmlElementRef(name = "Via", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> via;
    protected Boolean isDisplayDuration;

    /**
     * Gets the value of the actualCabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActualCabinClass() {
        return actualCabinClass;
    }

    /**
     * Sets the value of the actualCabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActualCabinClass(JAXBElement<String> value) {
        this.actualCabinClass = value;
    }

    /**
     * Gets the value of the actualCabinClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActualCabinClassCode() {
        return actualCabinClassCode;
    }

    /**
     * Sets the value of the actualCabinClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActualCabinClassCode(JAXBElement<String> value) {
        this.actualCabinClassCode = value;
    }

    /**
     * Gets the value of the adultFreeBaggageForDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdultFreeBaggageForDisplay() {
        return adultFreeBaggageForDisplay;
    }

    /**
     * Sets the value of the adultFreeBaggageForDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdultFreeBaggageForDisplay(JAXBElement<String> value) {
        this.adultFreeBaggageForDisplay = value;
    }

    /**
     * Gets the value of the airCraft property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAirCraft() {
        return airCraft;
    }

    /**
     * Sets the value of the airCraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAirCraft(JAXBElement<String> value) {
        this.airCraft = value;
    }

    /**
     * Gets the value of the arrAirName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrAirName() {
        return arrAirName;
    }

    /**
     * Sets the value of the arrAirName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrAirName(JAXBElement<String> value) {
        this.arrAirName = value;
    }

    /**
     * Gets the value of the arrAirPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrAirPort() {
        return arrAirPort;
    }

    /**
     * Sets the value of the arrAirPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrAirPort(JAXBElement<String> value) {
        this.arrAirPort = value;
    }

    /**
     * Gets the value of the arrAirPortCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrAirPortCountry() {
        return arrAirPortCountry;
    }

    /**
     * Sets the value of the arrAirPortCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrAirPortCountry(JAXBElement<String> value) {
        this.arrAirPortCountry = value;
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
     * Gets the value of the arrivalTerminalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightTerminalInfo }{@code >}
     *     
     */
    public JAXBElement<FlightTerminalInfo> getArrivalTerminalInfo() {
        return arrivalTerminalInfo;
    }

    /**
     * Sets the value of the arrivalTerminalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightTerminalInfo }{@code >}
     *     
     */
    public void setArrivalTerminalInfo(JAXBElement<FlightTerminalInfo> value) {
        this.arrivalTerminalInfo = value;
    }

    /**
     * Gets the value of the availSeats property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAvailSeats() {
        return availSeats;
    }

    /**
     * Sets the value of the availSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAvailSeats(JAXBElement<String> value) {
        this.availSeats = value;
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
     * Gets the value of the cabinClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCabinClassCode() {
        return cabinClassCode;
    }

    /**
     * Sets the value of the cabinClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCabinClassCode(JAXBElement<String> value) {
        this.cabinClassCode = value;
    }

    /**
     * Gets the value of the childFreeBaggageForDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChildFreeBaggageForDisplay() {
        return childFreeBaggageForDisplay;
    }

    /**
     * Sets the value of the childFreeBaggageForDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChildFreeBaggageForDisplay(JAXBElement<String> value) {
        this.childFreeBaggageForDisplay = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClassCode(JAXBElement<String> value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the depAirName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepAirName() {
        return depAirName;
    }

    /**
     * Sets the value of the depAirName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepAirName(JAXBElement<String> value) {
        this.depAirName = value;
    }

    /**
     * Gets the value of the depAirPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepAirPort() {
        return depAirPort;
    }

    /**
     * Sets the value of the depAirPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepAirPort(JAXBElement<String> value) {
        this.depAirPort = value;
    }

    /**
     * Gets the value of the depAirPortCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepAirPortCountry() {
        return depAirPortCountry;
    }

    /**
     * Sets the value of the depAirPortCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepAirPortCountry(JAXBElement<String> value) {
        this.depAirPortCountry = value;
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
     * Gets the value of the departureTerminalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlightTerminalInfo }{@code >}
     *     
     */
    public JAXBElement<FlightTerminalInfo> getDepartureTerminalInfo() {
        return departureTerminalInfo;
    }

    /**
     * Sets the value of the departureTerminalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlightTerminalInfo }{@code >}
     *     
     */
    public void setDepartureTerminalInfo(JAXBElement<FlightTerminalInfo> value) {
        this.departureTerminalInfo = value;
    }

    /**
     * Gets the value of the disClosureAirline property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DisClosureAirline }{@code >}
     *     
     */
    public JAXBElement<DisClosureAirline> getDisClosureAirline() {
        return disClosureAirline;
    }

    /**
     * Sets the value of the disClosureAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DisClosureAirline }{@code >}
     *     
     */
    public void setDisClosureAirline(JAXBElement<DisClosureAirline> value) {
        this.disClosureAirline = value;
    }

    /**
     * Gets the value of the dispArrDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispArrDate() {
        return dispArrDate;
    }

    /**
     * Sets the value of the dispArrDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispArrDate(JAXBElement<String> value) {
        this.dispArrDate = value;
    }

    /**
     * Gets the value of the dispCabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispCabinClass() {
        return dispCabinClass;
    }

    /**
     * Sets the value of the dispCabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispCabinClass(JAXBElement<String> value) {
        this.dispCabinClass = value;
    }

    /**
     * Gets the value of the dispDepDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispDepDate() {
        return dispDepDate;
    }

    /**
     * Sets the value of the dispDepDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispDepDate(JAXBElement<String> value) {
        this.dispDepDate = value;
    }

    /**
     * Gets the value of the dispFBCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispFBCode() {
        return dispFBCode;
    }

    /**
     * Sets the value of the dispFBCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispFBCode(JAXBElement<String> value) {
        this.dispFBCode = value;
    }

    /**
     * Gets the value of the dispSegFBCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispSegFBCode() {
        return dispSegFBCode;
    }

    /**
     * Sets the value of the dispSegFBCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispSegFBCode(JAXBElement<String> value) {
        this.dispSegFBCode = value;
    }

    /**
     * Gets the value of the fbCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFBCode() {
        return fbCode;
    }

    /**
     * Sets the value of the fbCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFBCode(JAXBElement<String> value) {
        this.fbCode = value;
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
     * Gets the value of the freeBaggageForDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreeBaggageForDisplay() {
        return freeBaggageForDisplay;
    }

    /**
     * Sets the value of the freeBaggageForDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreeBaggageForDisplay(JAXBElement<String> value) {
        this.freeBaggageForDisplay = value;
    }

    /**
     * Gets the value of the infantFreeBaggageForDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInfantFreeBaggageForDisplay() {
        return infantFreeBaggageForDisplay;
    }

    /**
     * Sets the value of the infantFreeBaggageForDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInfantFreeBaggageForDisplay(JAXBElement<String> value) {
        this.infantFreeBaggageForDisplay = value;
    }

    /**
     * Gets the value of the intermediatePoints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntermediatePoint }{@code >}
     *     
     */
    public JAXBElement<IntermediatePoint> getIntermediatePoints() {
        return intermediatePoints;
    }

    /**
     * Sets the value of the intermediatePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntermediatePoint }{@code >}
     *     
     */
    public void setIntermediatePoints(JAXBElement<IntermediatePoint> value) {
        this.intermediatePoints = value;
    }

    /**
     * Gets the value of the isFirstSegment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFirstSegment() {
        return isFirstSegment;
    }

    /**
     * Sets the value of the isFirstSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFirstSegment(Boolean value) {
        this.isFirstSegment = value;
    }

    /**
     * Gets the value of the jDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJDuration() {
        return jDuration;
    }

    /**
     * Sets the value of the jDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJDuration(JAXBElement<String> value) {
        this.jDuration = value;
    }

    /**
     * Gets the value of the jDurationHRS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJDurationHRS() {
        return jDurationHRS;
    }

    /**
     * Sets the value of the jDurationHRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJDurationHRS(JAXBElement<String> value) {
        this.jDurationHRS = value;
    }

    /**
     * Gets the value of the jDurationMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJDurationMin() {
        return jDurationMin;
    }

    /**
     * Sets the value of the jDurationMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJDurationMin(JAXBElement<String> value) {
        this.jDurationMin = value;
    }

    /**
     * Gets the value of the jDurationText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJDurationText() {
        return jDurationText;
    }

    /**
     * Sets the value of the jDurationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJDurationText(JAXBElement<String> value) {
        this.jDurationText = value;
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
     * Gets the value of the mlfgCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMLFGCode() {
        return mlfgCode;
    }

    /**
     * Sets the value of the mlfgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMLFGCode(JAXBElement<String> value) {
        this.mlfgCode = value;
    }

    /**
     * Gets the value of the marAirLine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarAirLine() {
        return marAirLine;
    }

    /**
     * Sets the value of the marAirLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarAirLine(JAXBElement<String> value) {
        this.marAirLine = value;
    }

    /**
     * Gets the value of the marAirLineName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarAirLineName() {
        return marAirLineName;
    }

    /**
     * Sets the value of the marAirLineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarAirLineName(JAXBElement<String> value) {
        this.marAirLineName = value;
    }

    /**
     * Gets the value of the oprAirline property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOprAirline() {
        return oprAirline;
    }

    /**
     * Sets the value of the oprAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOprAirline(JAXBElement<String> value) {
        this.oprAirline = value;
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
     * Gets the value of the otherPaxFreeBaggageForDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherPaxFreeBaggageForDisplay() {
        return otherPaxFreeBaggageForDisplay;
    }

    /**
     * Sets the value of the otherPaxFreeBaggageForDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherPaxFreeBaggageForDisplay(JAXBElement<String> value) {
        this.otherPaxFreeBaggageForDisplay = value;
    }

    /**
     * Gets the value of the parentCabinClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentCabinClassCode() {
        return parentCabinClassCode;
    }

    /**
     * Sets the value of the parentCabinClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentCabinClassCode(JAXBElement<String> value) {
        this.parentCabinClassCode = value;
    }

    /**
     * Gets the value of the providerID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProviderID() {
        return providerID;
    }

    /**
     * Sets the value of the providerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProviderID(JAXBElement<String> value) {
        this.providerID = value;
    }

    /**
     * Gets the value of the segFBCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegFBCode() {
        return segFBCode;
    }

    /**
     * Sets the value of the segFBCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegFBCode(JAXBElement<String> value) {
        this.segFBCode = value;
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
     * Gets the value of the tDuraMins property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTDuraMins() {
        return tDuraMins;
    }

    /**
     * Sets the value of the tDuraMins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTDuraMins(Integer value) {
        this.tDuraMins = value;
    }

    /**
     * Gets the value of the tDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTDuration() {
        return tDuration;
    }

    /**
     * Sets the value of the tDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTDuration(JAXBElement<String> value) {
        this.tDuration = value;
    }

    /**
     * Gets the value of the transTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransTime() {
        return transTime;
    }

    /**
     * Sets the value of the transTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransTime(JAXBElement<String> value) {
        this.transTime = value;
    }

    /**
     * Gets the value of the transTimeMins property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransTimeMins() {
        return transTimeMins;
    }

    /**
     * Sets the value of the transTimeMins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransTimeMins(Integer value) {
        this.transTimeMins = value;
    }

    /**
     * Gets the value of the travelTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTravelTime() {
        return travelTime;
    }

    /**
     * Sets the value of the travelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTravelTime(JAXBElement<String> value) {
        this.travelTime = value;
    }

    /**
     * Gets the value of the via property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVia() {
        return via;
    }

    /**
     * Sets the value of the via property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVia(JAXBElement<String> value) {
        this.via = value;
    }

    /**
     * Gets the value of the isDisplayDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDisplayDuration() {
        return isDisplayDuration;
    }

    /**
     * Sets the value of the isDisplayDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDisplayDuration(Boolean value) {
        this.isDisplayDuration = value;
    }

}
