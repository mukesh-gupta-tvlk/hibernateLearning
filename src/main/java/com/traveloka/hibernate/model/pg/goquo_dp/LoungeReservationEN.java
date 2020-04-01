
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoungeReservationEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoungeReservationEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BaseFare" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CommercialCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommercialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMDAdded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EMDBookingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMDIssued" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EMDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightDirection" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FlightReservationSegmentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FlightSegmentIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FlightSegmentNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExistingSelection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMailSenttoServiceProvider" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsNormalFlowSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoungeReservationID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LoungeReservationOrderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LoungeSettingID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PNRNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassengerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PassengerIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PurchaseID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RFICCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RFICSubcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="SSRCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceRequestInformation" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ServiceRequestInfo" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Taxes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VoucherNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoungeReservationEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "arrCity",
    "baseFare",
    "commercialCode",
    "commercialName",
    "currency",
    "depCity",
    "emdAdded",
    "emdBookingType",
    "emdIssued",
    "emdNumber",
    "firstName",
    "flightDirection",
    "flightReservationSegmentID",
    "flightSegmentIndex",
    "flightSegmentNo",
    "groupCode",
    "isExistingSelection",
    "isMailSenttoServiceProvider",
    "isNormalFlowSuccess",
    "lastName",
    "loungeReservationID",
    "loungeReservationOrderID",
    "loungeSettingID",
    "pnrNo",
    "passengerID",
    "passengerIndex",
    "passengerType",
    "price",
    "purchaseID",
    "rficCode",
    "rficSubcode",
    "reservationID",
    "resultMsg",
    "ssrCode",
    "serviceRequestInformation",
    "status",
    "taxes",
    "ticketStatus",
    "voucherNo"
})
public class LoungeReservationEN {

    @XmlElementRef(name = "ArrCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrCity;
    @XmlElement(name = "BaseFare")
    protected BigDecimal baseFare;
    @XmlElementRef(name = "CommercialCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commercialCode;
    @XmlElementRef(name = "CommercialName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commercialName;
    @XmlElementRef(name = "Currency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency;
    @XmlElementRef(name = "DepCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depCity;
    @XmlElement(name = "EMDAdded")
    protected Boolean emdAdded;
    @XmlElementRef(name = "EMDBookingType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emdBookingType;
    @XmlElement(name = "EMDIssued")
    protected Boolean emdIssued;
    @XmlElementRef(name = "EMDNumber", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emdNumber;
    @XmlElementRef(name = "FirstName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElement(name = "FlightDirection")
    protected Integer flightDirection;
    @XmlElement(name = "FlightReservationSegmentID")
    protected Integer flightReservationSegmentID;
    @XmlElement(name = "FlightSegmentIndex")
    protected Integer flightSegmentIndex;
    @XmlElement(name = "FlightSegmentNo")
    protected Integer flightSegmentNo;
    @XmlElementRef(name = "GroupCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groupCode;
    @XmlElement(name = "IsExistingSelection")
    protected Boolean isExistingSelection;
    @XmlElement(name = "IsMailSenttoServiceProvider")
    protected Boolean isMailSenttoServiceProvider;
    @XmlElement(name = "IsNormalFlowSuccess")
    protected Boolean isNormalFlowSuccess;
    @XmlElementRef(name = "LastName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElement(name = "LoungeReservationID")
    protected Long loungeReservationID;
    @XmlElement(name = "LoungeReservationOrderID")
    protected Integer loungeReservationOrderID;
    @XmlElement(name = "LoungeSettingID")
    protected Integer loungeSettingID;
    @XmlElementRef(name = "PNRNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pnrNo;
    @XmlElement(name = "PassengerID")
    protected Integer passengerID;
    @XmlElement(name = "PassengerIndex")
    protected Integer passengerIndex;
    @XmlElementRef(name = "PassengerType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passengerType;
    @XmlElement(name = "Price")
    protected BigDecimal price;
    @XmlElement(name = "PurchaseID")
    protected Integer purchaseID;
    @XmlElementRef(name = "RFICCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rficCode;
    @XmlElementRef(name = "RFICSubcode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rficSubcode;
    @XmlElementRef(name = "ReservationID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reservationID;
    @XmlElementRef(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> resultMsg;
    @XmlElementRef(name = "SSRCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ssrCode;
    @XmlElementRef(name = "ServiceRequestInformation", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceRequestInfo> serviceRequestInformation;
    @XmlElement(name = "Status")
    protected Integer status;
    @XmlElementRef(name = "Taxes", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxes;
    @XmlElement(name = "TicketStatus")
    protected Integer ticketStatus;
    @XmlElementRef(name = "VoucherNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voucherNo;

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
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseFare(BigDecimal value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the commercialCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommercialCode() {
        return commercialCode;
    }

    /**
     * Sets the value of the commercialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommercialCode(JAXBElement<String> value) {
        this.commercialCode = value;
    }

    /**
     * Gets the value of the commercialName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommercialName() {
        return commercialName;
    }

    /**
     * Sets the value of the commercialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommercialName(JAXBElement<String> value) {
        this.commercialName = value;
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
     * Gets the value of the emdAdded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEMDAdded() {
        return emdAdded;
    }

    /**
     * Sets the value of the emdAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEMDAdded(Boolean value) {
        this.emdAdded = value;
    }

    /**
     * Gets the value of the emdBookingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMDBookingType() {
        return emdBookingType;
    }

    /**
     * Sets the value of the emdBookingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMDBookingType(JAXBElement<String> value) {
        this.emdBookingType = value;
    }

    /**
     * Gets the value of the emdIssued property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEMDIssued() {
        return emdIssued;
    }

    /**
     * Sets the value of the emdIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEMDIssued(Boolean value) {
        this.emdIssued = value;
    }

    /**
     * Gets the value of the emdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMDNumber() {
        return emdNumber;
    }

    /**
     * Sets the value of the emdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMDNumber(JAXBElement<String> value) {
        this.emdNumber = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the flightDirection property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightDirection() {
        return flightDirection;
    }

    /**
     * Sets the value of the flightDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightDirection(Integer value) {
        this.flightDirection = value;
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
     * Gets the value of the flightSegmentIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightSegmentIndex() {
        return flightSegmentIndex;
    }

    /**
     * Sets the value of the flightSegmentIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightSegmentIndex(Integer value) {
        this.flightSegmentIndex = value;
    }

    /**
     * Gets the value of the flightSegmentNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlightSegmentNo() {
        return flightSegmentNo;
    }

    /**
     * Sets the value of the flightSegmentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlightSegmentNo(Integer value) {
        this.flightSegmentNo = value;
    }

    /**
     * Gets the value of the groupCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupCode() {
        return groupCode;
    }

    /**
     * Sets the value of the groupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupCode(JAXBElement<String> value) {
        this.groupCode = value;
    }

    /**
     * Gets the value of the isExistingSelection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExistingSelection() {
        return isExistingSelection;
    }

    /**
     * Sets the value of the isExistingSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExistingSelection(Boolean value) {
        this.isExistingSelection = value;
    }

    /**
     * Gets the value of the isMailSenttoServiceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMailSenttoServiceProvider() {
        return isMailSenttoServiceProvider;
    }

    /**
     * Sets the value of the isMailSenttoServiceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMailSenttoServiceProvider(Boolean value) {
        this.isMailSenttoServiceProvider = value;
    }

    /**
     * Gets the value of the isNormalFlowSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNormalFlowSuccess() {
        return isNormalFlowSuccess;
    }

    /**
     * Sets the value of the isNormalFlowSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNormalFlowSuccess(Boolean value) {
        this.isNormalFlowSuccess = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the loungeReservationID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLoungeReservationID() {
        return loungeReservationID;
    }

    /**
     * Sets the value of the loungeReservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLoungeReservationID(Long value) {
        this.loungeReservationID = value;
    }

    /**
     * Gets the value of the loungeReservationOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoungeReservationOrderID() {
        return loungeReservationOrderID;
    }

    /**
     * Sets the value of the loungeReservationOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoungeReservationOrderID(Integer value) {
        this.loungeReservationOrderID = value;
    }

    /**
     * Gets the value of the loungeSettingID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoungeSettingID() {
        return loungeSettingID;
    }

    /**
     * Sets the value of the loungeSettingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoungeSettingID(Integer value) {
        this.loungeSettingID = value;
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
     * Gets the value of the passengerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassengerID() {
        return passengerID;
    }

    /**
     * Sets the value of the passengerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassengerID(Integer value) {
        this.passengerID = value;
    }

    /**
     * Gets the value of the passengerIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassengerIndex() {
        return passengerIndex;
    }

    /**
     * Sets the value of the passengerIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassengerIndex(Integer value) {
        this.passengerIndex = value;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassengerType(JAXBElement<String> value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the purchaseID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPurchaseID() {
        return purchaseID;
    }

    /**
     * Sets the value of the purchaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPurchaseID(Integer value) {
        this.purchaseID = value;
    }

    /**
     * Gets the value of the rficCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRFICCode() {
        return rficCode;
    }

    /**
     * Sets the value of the rficCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRFICCode(JAXBElement<String> value) {
        this.rficCode = value;
    }

    /**
     * Gets the value of the rficSubcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRFICSubcode() {
        return rficSubcode;
    }

    /**
     * Sets the value of the rficSubcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRFICSubcode(JAXBElement<String> value) {
        this.rficSubcode = value;
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
     * Gets the value of the ssrCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSSRCode() {
        return ssrCode;
    }

    /**
     * Sets the value of the ssrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSSRCode(JAXBElement<String> value) {
        this.ssrCode = value;
    }

    /**
     * Gets the value of the serviceRequestInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceRequestInfo }{@code >}
     *     
     */
    public JAXBElement<ServiceRequestInfo> getServiceRequestInformation() {
        return serviceRequestInformation;
    }

    /**
     * Sets the value of the serviceRequestInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceRequestInfo }{@code >}
     *     
     */
    public void setServiceRequestInformation(JAXBElement<ServiceRequestInfo> value) {
        this.serviceRequestInformation = value;
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
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxes(JAXBElement<String> value) {
        this.taxes = value;
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
     * Gets the value of the voucherNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoucherNo() {
        return voucherNo;
    }

    /**
     * Sets the value of the voucherNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoucherNo(JAXBElement<String> value) {
        this.voucherNo = value;
    }

}
