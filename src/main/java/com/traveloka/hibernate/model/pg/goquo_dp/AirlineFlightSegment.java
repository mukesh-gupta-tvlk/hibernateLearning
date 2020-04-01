
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
 * <p>Java class for AirlineFlightSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineFlightSegment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirCraft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrAirportCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DepAirportCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DisClosureAirline" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}DisClosureAirline" minOccurs="0"/>
 *         &lt;element name="FlightNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FuelStopOver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntermediatePoints" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}IntermediatePoint" minOccurs="0"/>
 *         &lt;element name="MACode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MANameML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoOfStops" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OprAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OprAirlineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegBookingClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TDurationMins" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TransTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransTimeMins" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Via" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineFlightSegment", propOrder = {
    "airCraft",
    "arrAirportCityName",
    "arrCity",
    "arrCityName",
    "arrDate",
    "arrTime",
    "arrivalDate",
    "depAirportCityName",
    "depCity",
    "depCityName",
    "depDate",
    "depTime",
    "departureDate",
    "disClosureAirline",
    "flightNo",
    "fuelStopOver",
    "intermediatePoints",
    "maCode",
    "maName",
    "maNameML",
    "noOfStops",
    "oprAirlineCode",
    "oprAirlineName",
    "segBookingClass",
    "tDuration",
    "tDurationMins",
    "transTime",
    "transTimeMins",
    "via"
})
public class AirlineFlightSegment {

    @XmlElementRef(name = "AirCraft", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> airCraft;
    @XmlElementRef(name = "ArrAirportCityName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrAirportCityName;
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
    @XmlElementRef(name = "DepAirportCityName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depAirportCityName;
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
    @XmlElementRef(name = "DisClosureAirline", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<DisClosureAirline> disClosureAirline;
    @XmlElementRef(name = "FlightNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flightNo;
    @XmlElementRef(name = "FuelStopOver", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fuelStopOver;
    @XmlElementRef(name = "IntermediatePoints", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<IntermediatePoint> intermediatePoints;
    @XmlElementRef(name = "MACode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maCode;
    @XmlElementRef(name = "MAName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maName;
    @XmlElementRef(name = "MANameML", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maNameML;
    @XmlElement(name = "NoOfStops")
    protected Integer noOfStops;
    @XmlElementRef(name = "OprAirlineCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oprAirlineCode;
    @XmlElementRef(name = "OprAirlineName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oprAirlineName;
    @XmlElementRef(name = "SegBookingClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segBookingClass;
    @XmlElementRef(name = "TDuration", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tDuration;
    @XmlElement(name = "TDurationMins")
    protected Integer tDurationMins;
    @XmlElementRef(name = "TransTime", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transTime;
    @XmlElement(name = "TransTimeMins")
    protected Integer transTimeMins;
    @XmlElementRef(name = "Via", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> via;

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
     * Gets the value of the arrAirportCityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrAirportCityName() {
        return arrAirportCityName;
    }

    /**
     * Sets the value of the arrAirportCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrAirportCityName(JAXBElement<String> value) {
        this.arrAirportCityName = value;
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
     * Gets the value of the depAirportCityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepAirportCityName() {
        return depAirportCityName;
    }

    /**
     * Sets the value of the depAirportCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepAirportCityName(JAXBElement<String> value) {
        this.depAirportCityName = value;
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
     * Gets the value of the fuelStopOver property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFuelStopOver() {
        return fuelStopOver;
    }

    /**
     * Sets the value of the fuelStopOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFuelStopOver(JAXBElement<String> value) {
        this.fuelStopOver = value;
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
     * Gets the value of the noOfStops property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoOfStops() {
        return noOfStops;
    }

    /**
     * Sets the value of the noOfStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoOfStops(Integer value) {
        this.noOfStops = value;
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
     * Gets the value of the segBookingClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegBookingClass() {
        return segBookingClass;
    }

    /**
     * Sets the value of the segBookingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegBookingClass(JAXBElement<String> value) {
        this.segBookingClass = value;
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
     * Gets the value of the tDurationMins property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTDurationMins() {
        return tDurationMins;
    }

    /**
     * Sets the value of the tDurationMins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTDurationMins(Integer value) {
        this.tDurationMins = value;
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

}
