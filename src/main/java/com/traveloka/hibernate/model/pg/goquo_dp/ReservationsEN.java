package com.traveloka.hibernate.model.pg.goquo_dp;

import com.traveloka.hibernate.model.pg.serialization.arrays.ArrayOfint;

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
 * <p>Java class for ReservationsEN complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ReservationsEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AFID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ATMPaymentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Acquirer_Bank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddonAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AdultCCDiscountPerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AdultCCTotalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AirlineIBPNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirlineOBPNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrivalCities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="B2BCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B2BID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="B2BUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCCBookingEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingPaidStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BookingType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallCenterLoginID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CancellationDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancellationDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancellationDeadline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancelledDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Card_No_Partial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChangeFees" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CheckInDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckOutDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChildCCDiscountPerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChildCCTotalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ConnectionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditCardPromoId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyConvertionMarkUp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CustomerUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustomerUserPayMethodID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DepCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DeviceModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DiscountCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExCurrProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightHostPNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightSegmentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GroupQuotationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GroupReservationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HoldBookingRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelSupplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InfantCCDiscountPerPax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InfantCCTotalDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InitialAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InternalReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAddonMgmt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsB2BAdmin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsB2BCreditPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsBaggageFailed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsBlockBooking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCancellationMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsChangeFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsETicketEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsInitialPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMealFailed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsSeatFailed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsSelectedProductError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSupEmailverified" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Isticketmailsent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="JourneyType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LoggingID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="MailName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MasterReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="McoNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Modifiedby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NetAmountInPaymentCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NoAdults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoChildren" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoDisabledPax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoGvtPax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoInfant" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoSnrCitizen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoSpecialPax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoStudent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoWomen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NonRefundAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDFDiscountPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PNRNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartialAmountCollected" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PassengerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxLoginId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PaymentFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PaymentFeeVATTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PaymentGatewayPaymentOnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaymentGatewayPaymentStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentMethodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Platform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Profile" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ProfileEN" minOccurs="0"/>
 *         &lt;element name="PromoAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromoCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromoID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromoName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PukalNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ratio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResJourneyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReservationDateTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReservationDateTimeTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReservationFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationUTCDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="RoundingAdjustment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RoundingText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SaveErrorCode" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="SearchLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectedCUCardTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SelectedCustomerUserPaymentMethodId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SellingCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SubTotalStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SupplierBookingID1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupplierBookingID2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Ticketed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TicketingDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TicketmailsentDT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TodaySubTotalStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TodayTotalStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotAmountinPaymentCurrency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalPromoAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalSellingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Total_SellingPrice_MYR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UniqueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserLoginID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VATReceiptOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Validity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrentSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationsEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "afid",
    "atmPaymentCode",
    "accountCode",
    "acquirerBank",
    "addonAmount",
    "adultCCDiscountPerPax",
    "adultCCTotalDiscount",
    "airlineIBPNR",
    "airlineOBPNR",
    "appVersion",
    "arrCity",
    "arrivalCities",
    "arrivalDate",
    "b2BCompany",
    "b2BID",
    "b2BUser",
    "bccBookingEmail",
    "bookingClass",
    "bookingEmail",
    "bookingPaidStatus",
    "bookingType",
    "cabinClass",
    "callCenterLoginID",
    "cancellationDateFrom",
    "cancellationDateTo",
    "cancellationDeadline",
    "cancelledDateTime",
    "cardNoPartial",
    "changeFees",
    "channel",
    "checkInDate",
    "checkOutDate",
    "childCCDiscountPerPax",
    "childCCTotalDiscount",
    "connectionType",
    "creditCardDiscount",
    "creditCardPromoId",
    "currencyCode",
    "currencyConvertionMarkUp",
    "customerUserID",
    "customerUserPayMethodID",
    "dateFrom",
    "dateTo",
    "depCity",
    "departureDate",
    "deviceModel",
    "direction",
    "discountCurrency",
    "discountPrice",
    "email",
    "exCurrProvider",
    "exchangeRate",
    "firstName",
    "flightHostPNR",
    "flightSegmentID",
    "groupQuotationID",
    "groupReservationID",
    "holdBookingRefId",
    "hotelName",
    "hotelSupplier",
    "ipAddress",
    "infantCCDiscountPerPax",
    "infantCCTotalDiscount",
    "initialAmount",
    "internalReferenceNo",
    "isAddonMgmt",
    "isB2BAdmin",
    "isB2BCreditPayment",
    "isBaggageFailed",
    "isBlockBooking",
    "isCancellationMode",
    "isChangeFlight",
    "isETicketEnabled",
    "isInitialPayment",
    "isMealFailed",
    "isSeatFailed",
    "isSelectedProductError",
    "isSupEmailverified",
    "isticketmailsent",
    "journeyType",
    "loggingID",
    "mailName",
    "masterReservationID",
    "mcoNo",
    "modifiedby",
    "netAmount",
    "netAmountInPaymentCurrency",
    "noAdults",
    "noChildren",
    "noDisabledPax",
    "noGvtPax",
    "noInfant",
    "noSnrCitizen",
    "noSpecialPax",
    "noStudent",
    "noWomen",
    "nonRefundAmount",
    "notes",
    "pdfDiscountPrice",
    "pnrNumber",
    "parentReservationID",
    "partialAmountCollected",
    "passengerName",
    "paxLoginId",
    "paymentCurrency",
    "paymentDiscount",
    "paymentFee",
    "paymentFeeVATTax",
    "paymentGatewayPaymentOnDate",
    "paymentGatewayPaymentStatus",
    "paymentMethodName",
    "paymentRefId",
    "paymentStatus",
    "platform",
    "profile",
    "promoAmount",
    "promoCount",
    "promoID",
    "promoName",
    "pukalNo",
    "purchaseOrderId",
    "ratio",
    "remarks",
    "resJourneyType",
    "reservationDate",
    "reservationDateTimeFrom",
    "reservationDateTimeTo",
    "reservationFrom",
    "reservationID",
    "reservationTo",
    "reservationType",
    "reservationUTCDate",
    "resultMsg",
    "roundingAdjustment",
    "roundingText",
    "saveErrorCode",
    "searchLanguageCode",
    "selectedCUCardTypeId",
    "selectedCustomerUserPaymentMethodId",
    "sellingCurrency",
    "sourceCurrency",
    "stationCode",
    "status",
    "subTotalStatus",
    "supplierBookingID1",
    "supplierBookingID2",
    "surName",
    "targetCurrency",
    "telephone",
    "ticketStatus",
    "ticketed",
    "ticketingDeadline",
    "ticketmailsentDT",
    "title",
    "todaySubTotalStatus",
    "todayTotalStatus",
    "totAmountinPaymentCurrency",
    "totalAmount",
    "totalPromoAmount",
    "totalSellingPrice",
    "totalStatus",
    "totalTax",
    "totalSellingPriceMYR",
    "uniqueID",
    "userLoginID",
    "userName",
    "vatReceiptOption",
    "validity",
    "version",
    "warrentSerialNo"
})
public class ReservationsEN {

  @XmlElement(name = "AFID")
  protected Integer afid;
  @XmlElementRef(name = "ATMPaymentCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> atmPaymentCode;
  @XmlElementRef(name = "AccountCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> accountCode;
  @XmlElementRef(name = "Acquirer_Bank", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> acquirerBank;
  @XmlElement(name = "AddonAmount")
  protected BigDecimal addonAmount;
  @XmlElement(name = "AdultCCDiscountPerPax")
  protected BigDecimal adultCCDiscountPerPax;
  @XmlElement(name = "AdultCCTotalDiscount")
  protected BigDecimal adultCCTotalDiscount;
  @XmlElementRef(name = "AirlineIBPNR", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> airlineIBPNR;
  @XmlElementRef(name = "AirlineOBPNR", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> airlineOBPNR;
  @XmlElementRef(name = "AppVersion", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> appVersion;
  @XmlElementRef(name = "ArrCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> arrCity;
  @XmlElementRef(name = "ArrivalCities", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> arrivalCities;
  @XmlElement(name = "ArrivalDate")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar arrivalDate;
  @XmlElementRef(name = "B2BCompany", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> b2BCompany;
  @XmlElement(name = "B2BID")
  protected Integer b2BID;
  @XmlElementRef(name = "B2BUser", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> b2BUser;
  @XmlElementRef(name = "BCCBookingEmail", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> bccBookingEmail;
  @XmlElementRef(name = "BookingClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> bookingClass;
  @XmlElementRef(name = "BookingEmail", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> bookingEmail;
  @XmlElement(name = "BookingPaidStatus")
  protected Integer bookingPaidStatus;
  @XmlElement(name = "BookingType")
  protected Integer bookingType;
  @XmlElementRef(name = "CabinClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> cabinClass;
  @XmlElement(name = "CallCenterLoginID")
  protected Integer callCenterLoginID;
  @XmlElementRef(name = "CancellationDateFrom", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> cancellationDateFrom;
  @XmlElementRef(name = "CancellationDateTo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> cancellationDateTo;
  @XmlElementRef(name = "CancellationDeadline", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> cancellationDeadline;
  @XmlElementRef(name = "CancelledDateTime", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> cancelledDateTime;
  @XmlElementRef(name = "Card_No_Partial", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> cardNoPartial;
  @XmlElement(name = "ChangeFees")
  protected BigDecimal changeFees;
  @XmlElement(name = "Channel")
  protected Integer channel;
  @XmlElementRef(name = "CheckInDate", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> checkInDate;
  @XmlElementRef(name = "CheckOutDate", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> checkOutDate;
  @XmlElement(name = "ChildCCDiscountPerPax")
  protected BigDecimal childCCDiscountPerPax;
  @XmlElement(name = "ChildCCTotalDiscount")
  protected BigDecimal childCCTotalDiscount;
  @XmlElementRef(name = "ConnectionType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> connectionType;
  @XmlElement(name = "CreditCardDiscount")
  protected BigDecimal creditCardDiscount;
  @XmlElement(name = "CreditCardPromoId")
  protected Integer creditCardPromoId;
  @XmlElementRef(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> currencyCode;
  @XmlElement(name = "CurrencyConvertionMarkUp")
  protected BigDecimal currencyConvertionMarkUp;
  @XmlElement(name = "CustomerUserID")
  protected Integer customerUserID;
  @XmlElement(name = "CustomerUserPayMethodID")
  protected Integer customerUserPayMethodID;
  @XmlElement(name = "DateFrom")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar dateFrom;
  @XmlElement(name = "DateTo")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar dateTo;
  @XmlElementRef(name = "DepCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> depCity;
  @XmlElement(name = "DepartureDate")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar departureDate;
  @XmlElementRef(name = "DeviceModel", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> deviceModel;
  @XmlElement(name = "Direction")
  protected Integer direction;
  @XmlElementRef(name = "DiscountCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> discountCurrency;
  @XmlElement(name = "DiscountPrice")
  protected BigDecimal discountPrice;
  @XmlElementRef(name = "Email", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> email;
  @XmlElementRef(name = "ExCurrProvider", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> exCurrProvider;
  @XmlElement(name = "ExchangeRate")
  protected BigDecimal exchangeRate;
  @XmlElementRef(name = "FirstName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> firstName;
  @XmlElementRef(name = "FlightHostPNR", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> flightHostPNR;
  @XmlElement(name = "FlightSegmentID")
  protected Integer flightSegmentID;
  @XmlElement(name = "GroupQuotationID")
  protected Integer groupQuotationID;
  @XmlElement(name = "GroupReservationID")
  protected Integer groupReservationID;
  @XmlElementRef(name = "HoldBookingRefId", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> holdBookingRefId;
  @XmlElementRef(name = "HotelName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> hotelName;
  @XmlElementRef(name = "HotelSupplier", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> hotelSupplier;
  @XmlElementRef(name = "IPAddress", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> ipAddress;
  @XmlElement(name = "InfantCCDiscountPerPax")
  protected BigDecimal infantCCDiscountPerPax;
  @XmlElement(name = "InfantCCTotalDiscount")
  protected BigDecimal infantCCTotalDiscount;
  @XmlElement(name = "InitialAmount")
  protected BigDecimal initialAmount;
  @XmlElementRef(name = "InternalReferenceNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> internalReferenceNo;
  @XmlElement(name = "IsAddonMgmt")
  protected Integer isAddonMgmt;
  @XmlElement(name = "IsB2BAdmin")
  protected Boolean isB2BAdmin;
  @XmlElement(name = "IsB2BCreditPayment")
  protected Boolean isB2BCreditPayment;
  @XmlElement(name = "IsBaggageFailed")
  protected Integer isBaggageFailed;
  @XmlElement(name = "IsBlockBooking")
  protected Boolean isBlockBooking;
  @XmlElement(name = "IsCancellationMode")
  protected Boolean isCancellationMode;
  @XmlElement(name = "IsChangeFlight")
  protected Boolean isChangeFlight;
  @XmlElement(name = "IsETicketEnabled")
  protected Boolean isETicketEnabled;
  @XmlElement(name = "IsInitialPayment")
  protected Boolean isInitialPayment;
  @XmlElement(name = "IsMealFailed")
  protected Integer isMealFailed;
  @XmlElement(name = "IsSeatFailed")
  protected Integer isSeatFailed;
  @XmlElement(name = "IsSelectedProductError")
  protected Boolean isSelectedProductError;
  @XmlElement(name = "IsSupEmailverified")
  protected Integer isSupEmailverified;
  @XmlElement(name = "Isticketmailsent")
  protected Integer isticketmailsent;
  @XmlElement(name = "JourneyType")
  protected Integer journeyType;
  @XmlElement(name = "LoggingID")
  protected String loggingID;
  @XmlElementRef(name = "MailName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> mailName;
  @XmlElementRef(name = "MasterReservationID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> masterReservationID;
  @XmlElementRef(name = "McoNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> mcoNo;
  @XmlElementRef(name = "Modifiedby", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> modifiedby;
  @XmlElement(name = "NetAmount")
  protected BigDecimal netAmount;
  @XmlElement(name = "NetAmountInPaymentCurrency")
  protected BigDecimal netAmountInPaymentCurrency;
  @XmlElement(name = "NoAdults")
  protected Integer noAdults;
  @XmlElement(name = "NoChildren")
  protected Integer noChildren;
  @XmlElement(name = "NoDisabledPax")
  protected Integer noDisabledPax;
  @XmlElement(name = "NoGvtPax")
  protected Integer noGvtPax;
  @XmlElement(name = "NoInfant")
  protected Integer noInfant;
  @XmlElement(name = "NoSnrCitizen")
  protected Integer noSnrCitizen;
  @XmlElement(name = "NoSpecialPax")
  protected Integer noSpecialPax;
  @XmlElement(name = "NoStudent")
  protected Integer noStudent;
  @XmlElement(name = "NoWomen")
  protected Integer noWomen;
  @XmlElement(name = "NonRefundAmount")
  protected BigDecimal nonRefundAmount;
  @XmlElementRef(name = "Notes", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> notes;
  @XmlElement(name = "PDFDiscountPrice")
  protected BigDecimal pdfDiscountPrice;
  @XmlElementRef(name = "PNRNumber", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> pnrNumber;
  @XmlElementRef(name = "ParentReservationID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> parentReservationID;
  @XmlElement(name = "PartialAmountCollected")
  protected BigDecimal partialAmountCollected;
  @XmlElementRef(name = "PassengerName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> passengerName;
  @XmlElement(name = "PaxLoginId")
  protected Integer paxLoginId;
  @XmlElementRef(name = "PaymentCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> paymentCurrency;
  @XmlElement(name = "PaymentDiscount")
  protected BigDecimal paymentDiscount;
  @XmlElement(name = "PaymentFee")
  protected BigDecimal paymentFee;
  @XmlElement(name = "PaymentFeeVATTax")
  protected BigDecimal paymentFeeVATTax;
  @XmlElement(name = "PaymentGatewayPaymentOnDate")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar paymentGatewayPaymentOnDate;
  @XmlElement(name = "PaymentGatewayPaymentStatus")
  protected Integer paymentGatewayPaymentStatus;
  @XmlElementRef(name = "PaymentMethodName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> paymentMethodName;
  @XmlElementRef(name = "PaymentRefId", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> paymentRefId;
  @XmlElementRef(name = "PaymentStatus", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> paymentStatus;
  @XmlElementRef(name = "Platform", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> platform;
  @XmlElementRef(name = "Profile", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<ProfileEN> profile;
  @XmlElementRef(name = "PromoAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> promoAmount;
  @XmlElementRef(name = "PromoCount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> promoCount;
  @XmlElementRef(name = "PromoID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> promoID;
  @XmlElementRef(name = "PromoName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> promoName;
  @XmlElementRef(name = "PukalNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> pukalNo;
  @XmlElementRef(name = "PurchaseOrderId", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> purchaseOrderId;
  @XmlElement(name = "Ratio")
  protected BigDecimal ratio;
  @XmlElementRef(name = "Remarks", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> remarks;
  @XmlElementRef(name = "ResJourneyType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> resJourneyType;
  @XmlElement(name = "ReservationDate")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar reservationDate;
  @XmlElement(name = "ReservationDateTimeFrom")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar reservationDateTimeFrom;
  @XmlElement(name = "ReservationDateTimeTo")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar reservationDateTimeTo;
  @XmlElementRef(name = "ReservationFrom", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> reservationFrom;
  @XmlElementRef(name = "ReservationID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> reservationID;
  @XmlElementRef(name = "ReservationTo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> reservationTo;
  @XmlElementRef(name = "ReservationType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> reservationType;
  @XmlElement(name = "ReservationUTCDate")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar reservationUTCDate;
  @XmlElementRef(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<Result> resultMsg;
  @XmlElement(name = "RoundingAdjustment")
  protected BigDecimal roundingAdjustment;
  @XmlElementRef(name = "RoundingText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> roundingText;
  @XmlElementRef(name = "SaveErrorCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<ArrayOfint> saveErrorCode;
  @XmlElementRef(name = "SearchLanguageCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> searchLanguageCode;
  @XmlElement(name = "SelectedCUCardTypeId")
  protected Integer selectedCUCardTypeId;
  @XmlElement(name = "SelectedCustomerUserPaymentMethodId")
  protected Integer selectedCustomerUserPaymentMethodId;
  @XmlElementRef(name = "SellingCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> sellingCurrency;
  @XmlElementRef(name = "SourceCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> sourceCurrency;
  @XmlElementRef(name = "StationCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> stationCode;
  @XmlElement(name = "Status")
  protected Integer status;
  @XmlElement(name = "SubTotalStatus")
  protected Integer subTotalStatus;
  @XmlElementRef(name = "SupplierBookingID1", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> supplierBookingID1;
  @XmlElementRef(name = "SupplierBookingID2", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> supplierBookingID2;
  @XmlElementRef(name = "SurName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> surName;
  @XmlElementRef(name = "TargetCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> targetCurrency;
  @XmlElementRef(name = "Telephone", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> telephone;
  @XmlElement(name = "TicketStatus")
  protected Boolean ticketStatus;
  @XmlElement(name = "Ticketed")
  protected Integer ticketed;
  @XmlElement(name = "TicketingDeadline")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar ticketingDeadline;
  @XmlElement(name = "TicketmailsentDT")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar ticketmailsentDT;
  @XmlElementRef(name = "Title", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> title;
  @XmlElement(name = "TodaySubTotalStatus")
  protected Integer todaySubTotalStatus;
  @XmlElement(name = "TodayTotalStatus")
  protected Integer todayTotalStatus;
  @XmlElement(name = "TotAmountinPaymentCurrency")
  protected BigDecimal totAmountinPaymentCurrency;
  @XmlElement(name = "TotalAmount")
  protected BigDecimal totalAmount;
  @XmlElement(name = "TotalPromoAmount")
  protected BigDecimal totalPromoAmount;
  @XmlElement(name = "TotalSellingPrice")
  protected BigDecimal totalSellingPrice;
  @XmlElement(name = "TotalStatus")
  protected Integer totalStatus;
  @XmlElement(name = "TotalTax")
  protected BigDecimal totalTax;
  @XmlElement(name = "Total_SellingPrice_MYR")
  protected BigDecimal totalSellingPriceMYR;
  @XmlElementRef(name = "UniqueID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> uniqueID;
  @XmlElement(name = "UserLoginID")
  protected Integer userLoginID;
  @XmlElementRef(name = "UserName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> userName;
  @XmlElementRef(name = "VATReceiptOption", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> vatReceiptOption;
  @XmlElementRef(name = "Validity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> validity;
  @XmlElementRef(name = "Version", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> version;
  @XmlElementRef(name = "WarrentSerialNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
  protected JAXBElement<String> warrentSerialNo;

  /**
   * Gets the value of the afid property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getAFID() {
    return afid;
  }

  /**
   * Sets the value of the afid property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setAFID(Integer value) {
    this.afid = value;
  }

  /**
   * Gets the value of the atmPaymentCode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getATMPaymentCode() {
    return atmPaymentCode;
  }

  /**
   * Sets the value of the atmPaymentCode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setATMPaymentCode(JAXBElement<String> value) {
    this.atmPaymentCode = value;
  }

  /**
   * Gets the value of the accountCode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getAccountCode() {
    return accountCode;
  }

  /**
   * Sets the value of the accountCode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setAccountCode(JAXBElement<String> value) {
    this.accountCode = value;
  }

  /**
   * Gets the value of the acquirerBank property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getAcquirerBank() {
    return acquirerBank;
  }

  /**
   * Sets the value of the acquirerBank property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setAcquirerBank(JAXBElement<String> value) {
    this.acquirerBank = value;
  }

  /**
   * Gets the value of the addonAmount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getAddonAmount() {
    return addonAmount;
  }

  /**
   * Sets the value of the addonAmount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setAddonAmount(BigDecimal value) {
    this.addonAmount = value;
  }

  /**
   * Gets the value of the adultCCDiscountPerPax property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getAdultCCDiscountPerPax() {
    return adultCCDiscountPerPax;
  }

  /**
   * Sets the value of the adultCCDiscountPerPax property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setAdultCCDiscountPerPax(BigDecimal value) {
    this.adultCCDiscountPerPax = value;
  }

  /**
   * Gets the value of the adultCCTotalDiscount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getAdultCCTotalDiscount() {
    return adultCCTotalDiscount;
  }

  /**
   * Sets the value of the adultCCTotalDiscount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setAdultCCTotalDiscount(BigDecimal value) {
    this.adultCCTotalDiscount = value;
  }

  /**
   * Gets the value of the airlineIBPNR property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getAirlineIBPNR() {
    return airlineIBPNR;
  }

  /**
   * Sets the value of the airlineIBPNR property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setAirlineIBPNR(JAXBElement<String> value) {
    this.airlineIBPNR = value;
  }

  /**
   * Gets the value of the airlineOBPNR property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getAirlineOBPNR() {
    return airlineOBPNR;
  }

  /**
   * Sets the value of the airlineOBPNR property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setAirlineOBPNR(JAXBElement<String> value) {
    this.airlineOBPNR = value;
  }

  /**
   * Gets the value of the appVersion property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getAppVersion() {
    return appVersion;
  }

  /**
   * Sets the value of the appVersion property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setAppVersion(JAXBElement<String> value) {
    this.appVersion = value;
  }

  /**
   * Gets the value of the arrCity property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getArrCity() {
    return arrCity;
  }

  /**
   * Sets the value of the arrCity property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setArrCity(JAXBElement<String> value) {
    this.arrCity = value;
  }

  /**
   * Gets the value of the arrivalCities property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getArrivalCities() {
    return arrivalCities;
  }

  /**
   * Sets the value of the arrivalCities property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setArrivalCities(JAXBElement<String> value) {
    this.arrivalCities = value;
  }

  /**
   * Gets the value of the arrivalDate property.
   *
   * @return possible object is
   * {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getArrivalDate() {
    return arrivalDate;
  }

  /**
   * Sets the value of the arrivalDate property.
   *
   * @param value allowed object is
   *              {@link XMLGregorianCalendar }
   */
  public void setArrivalDate(XMLGregorianCalendar value) {
    this.arrivalDate = value;
  }

  /**
   * Gets the value of the b2BCompany property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getB2BCompany() {
    return b2BCompany;
  }

  /**
   * Sets the value of the b2BCompany property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setB2BCompany(JAXBElement<String> value) {
    this.b2BCompany = value;
  }

  /**
   * Gets the value of the b2BID property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getB2BID() {
    return b2BID;
  }

  /**
   * Sets the value of the b2BID property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setB2BID(Integer value) {
    this.b2BID = value;
  }

  /**
   * Gets the value of the b2BUser property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getB2BUser() {
    return b2BUser;
  }

  /**
   * Sets the value of the b2BUser property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setB2BUser(JAXBElement<String> value) {
    this.b2BUser = value;
  }

  /**
   * Gets the value of the bccBookingEmail property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getBCCBookingEmail() {
    return bccBookingEmail;
  }

  /**
   * Sets the value of the bccBookingEmail property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setBCCBookingEmail(JAXBElement<String> value) {
    this.bccBookingEmail = value;
  }

  /**
   * Gets the value of the bookingClass property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getBookingClass() {
    return bookingClass;
  }

  /**
   * Sets the value of the bookingClass property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setBookingClass(JAXBElement<String> value) {
    this.bookingClass = value;
  }

  /**
   * Gets the value of the bookingEmail property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getBookingEmail() {
    return bookingEmail;
  }

  /**
   * Sets the value of the bookingEmail property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setBookingEmail(JAXBElement<String> value) {
    this.bookingEmail = value;
  }

  /**
   * Gets the value of the bookingPaidStatus property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getBookingPaidStatus() {
    return bookingPaidStatus;
  }

  /**
   * Sets the value of the bookingPaidStatus property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setBookingPaidStatus(Integer value) {
    this.bookingPaidStatus = value;
  }

  /**
   * Gets the value of the bookingType property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getBookingType() {
    return bookingType;
  }

  /**
   * Sets the value of the bookingType property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setBookingType(Integer value) {
    this.bookingType = value;
  }

  /**
   * Gets the value of the cabinClass property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getCabinClass() {
    return cabinClass;
  }

  /**
   * Sets the value of the cabinClass property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setCabinClass(JAXBElement<String> value) {
    this.cabinClass = value;
  }

  /**
   * Gets the value of the callCenterLoginID property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getCallCenterLoginID() {
    return callCenterLoginID;
  }

  /**
   * Sets the value of the callCenterLoginID property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setCallCenterLoginID(Integer value) {
    this.callCenterLoginID = value;
  }

  /**
   * Gets the value of the cancellationDateFrom property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getCancellationDateFrom() {
    return cancellationDateFrom;
  }

  /**
   * Sets the value of the cancellationDateFrom property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setCancellationDateFrom(JAXBElement<String> value) {
    this.cancellationDateFrom = value;
  }

  /**
   * Gets the value of the cancellationDateTo property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getCancellationDateTo() {
    return cancellationDateTo;
  }

  /**
   * Sets the value of the cancellationDateTo property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setCancellationDateTo(JAXBElement<String> value) {
    this.cancellationDateTo = value;
  }

  /**
   * Gets the value of the cancellationDeadline property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getCancellationDeadline() {
    return cancellationDeadline;
  }

  /**
   * Sets the value of the cancellationDeadline property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setCancellationDeadline(JAXBElement<String> value) {
    this.cancellationDeadline = value;
  }

  /**
   * Gets the value of the cancelledDateTime property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getCancelledDateTime() {
    return cancelledDateTime;
  }

  /**
   * Sets the value of the cancelledDateTime property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setCancelledDateTime(JAXBElement<String> value) {
    this.cancelledDateTime = value;
  }

  /**
   * Gets the value of the cardNoPartial property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getCardNoPartial() {
    return cardNoPartial;
  }

  /**
   * Sets the value of the cardNoPartial property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setCardNoPartial(JAXBElement<String> value) {
    this.cardNoPartial = value;
  }

  /**
   * Gets the value of the changeFees property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getChangeFees() {
    return changeFees;
  }

  /**
   * Sets the value of the changeFees property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setChangeFees(BigDecimal value) {
    this.changeFees = value;
  }

  /**
   * Gets the value of the channel property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getChannel() {
    return channel;
  }

  /**
   * Sets the value of the channel property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setChannel(Integer value) {
    this.channel = value;
  }

  /**
   * Gets the value of the checkInDate property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getCheckInDate() {
    return checkInDate;
  }

  /**
   * Sets the value of the checkInDate property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setCheckInDate(JAXBElement<String> value) {
    this.checkInDate = value;
  }

  /**
   * Gets the value of the checkOutDate property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getCheckOutDate() {
    return checkOutDate;
  }

  /**
   * Sets the value of the checkOutDate property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setCheckOutDate(JAXBElement<String> value) {
    this.checkOutDate = value;
  }

  /**
   * Gets the value of the childCCDiscountPerPax property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getChildCCDiscountPerPax() {
    return childCCDiscountPerPax;
  }

  /**
   * Sets the value of the childCCDiscountPerPax property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setChildCCDiscountPerPax(BigDecimal value) {
    this.childCCDiscountPerPax = value;
  }

  /**
   * Gets the value of the childCCTotalDiscount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getChildCCTotalDiscount() {
    return childCCTotalDiscount;
  }

  /**
   * Sets the value of the childCCTotalDiscount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setChildCCTotalDiscount(BigDecimal value) {
    this.childCCTotalDiscount = value;
  }

  /**
   * Gets the value of the connectionType property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getConnectionType() {
    return connectionType;
  }

  /**
   * Sets the value of the connectionType property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setConnectionType(JAXBElement<String> value) {
    this.connectionType = value;
  }

  /**
   * Gets the value of the creditCardDiscount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getCreditCardDiscount() {
    return creditCardDiscount;
  }

  /**
   * Sets the value of the creditCardDiscount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setCreditCardDiscount(BigDecimal value) {
    this.creditCardDiscount = value;
  }

  /**
   * Gets the value of the creditCardPromoId property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getCreditCardPromoId() {
    return creditCardPromoId;
  }

  /**
   * Sets the value of the creditCardPromoId property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setCreditCardPromoId(Integer value) {
    this.creditCardPromoId = value;
  }

  /**
   * Gets the value of the currencyCode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getCurrencyCode() {
    return currencyCode;
  }

  /**
   * Sets the value of the currencyCode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setCurrencyCode(JAXBElement<String> value) {
    this.currencyCode = value;
  }

  /**
   * Gets the value of the currencyConvertionMarkUp property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getCurrencyConvertionMarkUp() {
    return currencyConvertionMarkUp;
  }

  /**
   * Sets the value of the currencyConvertionMarkUp property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setCurrencyConvertionMarkUp(BigDecimal value) {
    this.currencyConvertionMarkUp = value;
  }

  /**
   * Gets the value of the customerUserID property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getCustomerUserID() {
    return customerUserID;
  }

  /**
   * Sets the value of the customerUserID property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setCustomerUserID(Integer value) {
    this.customerUserID = value;
  }

  /**
   * Gets the value of the customerUserPayMethodID property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getCustomerUserPayMethodID() {
    return customerUserPayMethodID;
  }

  /**
   * Sets the value of the customerUserPayMethodID property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setCustomerUserPayMethodID(Integer value) {
    this.customerUserPayMethodID = value;
  }

  /**
   * Gets the value of the dateFrom property.
   *
   * @return possible object is
   * {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getDateFrom() {
    return dateFrom;
  }

  /**
   * Sets the value of the dateFrom property.
   *
   * @param value allowed object is
   *              {@link XMLGregorianCalendar }
   */
  public void setDateFrom(XMLGregorianCalendar value) {
    this.dateFrom = value;
  }

  /**
   * Gets the value of the dateTo property.
   *
   * @return possible object is
   * {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getDateTo() {
    return dateTo;
  }

  /**
   * Sets the value of the dateTo property.
   *
   * @param value allowed object is
   *              {@link XMLGregorianCalendar }
   */
  public void setDateTo(XMLGregorianCalendar value) {
    this.dateTo = value;
  }

  /**
   * Gets the value of the depCity property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDepCity() {
    return depCity;
  }

  /**
   * Sets the value of the depCity property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDepCity(JAXBElement<String> value) {
    this.depCity = value;
  }

  /**
   * Gets the value of the departureDate property.
   *
   * @return possible object is
   * {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getDepartureDate() {
    return departureDate;
  }

  /**
   * Sets the value of the departureDate property.
   *
   * @param value allowed object is
   *              {@link XMLGregorianCalendar }
   */
  public void setDepartureDate(XMLGregorianCalendar value) {
    this.departureDate = value;
  }

  /**
   * Gets the value of the deviceModel property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDeviceModel() {
    return deviceModel;
  }

  /**
   * Sets the value of the deviceModel property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDeviceModel(JAXBElement<String> value) {
    this.deviceModel = value;
  }

  /**
   * Gets the value of the direction property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getDirection() {
    return direction;
  }

  /**
   * Sets the value of the direction property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setDirection(Integer value) {
    this.direction = value;
  }

  /**
   * Gets the value of the discountCurrency property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getDiscountCurrency() {
    return discountCurrency;
  }

  /**
   * Sets the value of the discountCurrency property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setDiscountCurrency(JAXBElement<String> value) {
    this.discountCurrency = value;
  }

  /**
   * Gets the value of the discountPrice property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getDiscountPrice() {
    return discountPrice;
  }

  /**
   * Sets the value of the discountPrice property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setDiscountPrice(BigDecimal value) {
    this.discountPrice = value;
  }

  /**
   * Gets the value of the email property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getEmail() {
    return email;
  }

  /**
   * Sets the value of the email property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setEmail(JAXBElement<String> value) {
    this.email = value;
  }

  /**
   * Gets the value of the exCurrProvider property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getExCurrProvider() {
    return exCurrProvider;
  }

  /**
   * Sets the value of the exCurrProvider property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setExCurrProvider(JAXBElement<String> value) {
    this.exCurrProvider = value;
  }

  /**
   * Gets the value of the exchangeRate property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  /**
   * Sets the value of the exchangeRate property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setExchangeRate(BigDecimal value) {
    this.exchangeRate = value;
  }

  /**
   * Gets the value of the firstName property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getFirstName() {
    return firstName;
  }

  /**
   * Sets the value of the firstName property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setFirstName(JAXBElement<String> value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the flightHostPNR property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getFlightHostPNR() {
    return flightHostPNR;
  }

  /**
   * Sets the value of the flightHostPNR property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setFlightHostPNR(JAXBElement<String> value) {
    this.flightHostPNR = value;
  }

  /**
   * Gets the value of the flightSegmentID property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getFlightSegmentID() {
    return flightSegmentID;
  }

  /**
   * Sets the value of the flightSegmentID property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setFlightSegmentID(Integer value) {
    this.flightSegmentID = value;
  }

  /**
   * Gets the value of the groupQuotationID property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getGroupQuotationID() {
    return groupQuotationID;
  }

  /**
   * Sets the value of the groupQuotationID property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setGroupQuotationID(Integer value) {
    this.groupQuotationID = value;
  }

  /**
   * Gets the value of the groupReservationID property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getGroupReservationID() {
    return groupReservationID;
  }

  /**
   * Sets the value of the groupReservationID property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setGroupReservationID(Integer value) {
    this.groupReservationID = value;
  }

  /**
   * Gets the value of the holdBookingRefId property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getHoldBookingRefId() {
    return holdBookingRefId;
  }

  /**
   * Sets the value of the holdBookingRefId property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setHoldBookingRefId(JAXBElement<String> value) {
    this.holdBookingRefId = value;
  }

  /**
   * Gets the value of the hotelName property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getHotelName() {
    return hotelName;
  }

  /**
   * Sets the value of the hotelName property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setHotelName(JAXBElement<String> value) {
    this.hotelName = value;
  }

  /**
   * Gets the value of the hotelSupplier property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getHotelSupplier() {
    return hotelSupplier;
  }

  /**
   * Sets the value of the hotelSupplier property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setHotelSupplier(JAXBElement<String> value) {
    this.hotelSupplier = value;
  }

  /**
   * Gets the value of the ipAddress property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getIPAddress() {
    return ipAddress;
  }

  /**
   * Sets the value of the ipAddress property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setIPAddress(JAXBElement<String> value) {
    this.ipAddress = value;
  }

  /**
   * Gets the value of the infantCCDiscountPerPax property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getInfantCCDiscountPerPax() {
    return infantCCDiscountPerPax;
  }

  /**
   * Sets the value of the infantCCDiscountPerPax property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setInfantCCDiscountPerPax(BigDecimal value) {
    this.infantCCDiscountPerPax = value;
  }

  /**
   * Gets the value of the infantCCTotalDiscount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getInfantCCTotalDiscount() {
    return infantCCTotalDiscount;
  }

  /**
   * Sets the value of the infantCCTotalDiscount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setInfantCCTotalDiscount(BigDecimal value) {
    this.infantCCTotalDiscount = value;
  }

  /**
   * Gets the value of the initialAmount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getInitialAmount() {
    return initialAmount;
  }

  /**
   * Sets the value of the initialAmount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setInitialAmount(BigDecimal value) {
    this.initialAmount = value;
  }

  /**
   * Gets the value of the internalReferenceNo property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getInternalReferenceNo() {
    return internalReferenceNo;
  }

  /**
   * Sets the value of the internalReferenceNo property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setInternalReferenceNo(JAXBElement<String> value) {
    this.internalReferenceNo = value;
  }

  /**
   * Gets the value of the isAddonMgmt property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getIsAddonMgmt() {
    return isAddonMgmt;
  }

  /**
   * Sets the value of the isAddonMgmt property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setIsAddonMgmt(Integer value) {
    this.isAddonMgmt = value;
  }

  /**
   * Gets the value of the isB2BAdmin property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsB2BAdmin() {
    return isB2BAdmin;
  }

  /**
   * Sets the value of the isB2BAdmin property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsB2BAdmin(Boolean value) {
    this.isB2BAdmin = value;
  }

  /**
   * Gets the value of the isB2BCreditPayment property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsB2BCreditPayment() {
    return isB2BCreditPayment;
  }

  /**
   * Sets the value of the isB2BCreditPayment property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsB2BCreditPayment(Boolean value) {
    this.isB2BCreditPayment = value;
  }

  /**
   * Gets the value of the isBaggageFailed property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getIsBaggageFailed() {
    return isBaggageFailed;
  }

  /**
   * Sets the value of the isBaggageFailed property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setIsBaggageFailed(Integer value) {
    this.isBaggageFailed = value;
  }

  /**
   * Gets the value of the isBlockBooking property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsBlockBooking() {
    return isBlockBooking;
  }

  /**
   * Sets the value of the isBlockBooking property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsBlockBooking(Boolean value) {
    this.isBlockBooking = value;
  }

  /**
   * Gets the value of the isCancellationMode property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsCancellationMode() {
    return isCancellationMode;
  }

  /**
   * Sets the value of the isCancellationMode property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsCancellationMode(Boolean value) {
    this.isCancellationMode = value;
  }

  /**
   * Gets the value of the isChangeFlight property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsChangeFlight() {
    return isChangeFlight;
  }

  /**
   * Sets the value of the isChangeFlight property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsChangeFlight(Boolean value) {
    this.isChangeFlight = value;
  }

  /**
   * Gets the value of the isETicketEnabled property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsETicketEnabled() {
    return isETicketEnabled;
  }

  /**
   * Sets the value of the isETicketEnabled property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsETicketEnabled(Boolean value) {
    this.isETicketEnabled = value;
  }

  /**
   * Gets the value of the isInitialPayment property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsInitialPayment() {
    return isInitialPayment;
  }

  /**
   * Sets the value of the isInitialPayment property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsInitialPayment(Boolean value) {
    this.isInitialPayment = value;
  }

  /**
   * Gets the value of the isMealFailed property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getIsMealFailed() {
    return isMealFailed;
  }

  /**
   * Sets the value of the isMealFailed property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setIsMealFailed(Integer value) {
    this.isMealFailed = value;
  }

  /**
   * Gets the value of the isSeatFailed property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getIsSeatFailed() {
    return isSeatFailed;
  }

  /**
   * Sets the value of the isSeatFailed property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setIsSeatFailed(Integer value) {
    this.isSeatFailed = value;
  }

  /**
   * Gets the value of the isSelectedProductError property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsSelectedProductError() {
    return isSelectedProductError;
  }

  /**
   * Sets the value of the isSelectedProductError property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsSelectedProductError(Boolean value) {
    this.isSelectedProductError = value;
  }

  /**
   * Gets the value of the isSupEmailverified property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getIsSupEmailverified() {
    return isSupEmailverified;
  }

  /**
   * Sets the value of the isSupEmailverified property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setIsSupEmailverified(Integer value) {
    this.isSupEmailverified = value;
  }

  /**
   * Gets the value of the isticketmailsent property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getIsticketmailsent() {
    return isticketmailsent;
  }

  /**
   * Sets the value of the isticketmailsent property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setIsticketmailsent(Integer value) {
    this.isticketmailsent = value;
  }

  /**
   * Gets the value of the journeyType property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getJourneyType() {
    return journeyType;
  }

  /**
   * Sets the value of the journeyType property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setJourneyType(Integer value) {
    this.journeyType = value;
  }

  /**
   * Gets the value of the loggingID property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getLoggingID() {
    return loggingID;
  }

  /**
   * Sets the value of the loggingID property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setLoggingID(String value) {
    this.loggingID = value;
  }

  /**
   * Gets the value of the mailName property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getMailName() {
    return mailName;
  }

  /**
   * Sets the value of the mailName property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setMailName(JAXBElement<String> value) {
    this.mailName = value;
  }

  /**
   * Gets the value of the masterReservationID property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getMasterReservationID() {
    return masterReservationID;
  }

  /**
   * Sets the value of the masterReservationID property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setMasterReservationID(JAXBElement<String> value) {
    this.masterReservationID = value;
  }

  /**
   * Gets the value of the mcoNo property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getMcoNo() {
    return mcoNo;
  }

  /**
   * Sets the value of the mcoNo property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setMcoNo(JAXBElement<String> value) {
    this.mcoNo = value;
  }

  /**
   * Gets the value of the modifiedby property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getModifiedby() {
    return modifiedby;
  }

  /**
   * Sets the value of the modifiedby property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setModifiedby(JAXBElement<String> value) {
    this.modifiedby = value;
  }

  /**
   * Gets the value of the netAmount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getNetAmount() {
    return netAmount;
  }

  /**
   * Sets the value of the netAmount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setNetAmount(BigDecimal value) {
    this.netAmount = value;
  }

  /**
   * Gets the value of the netAmountInPaymentCurrency property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getNetAmountInPaymentCurrency() {
    return netAmountInPaymentCurrency;
  }

  /**
   * Sets the value of the netAmountInPaymentCurrency property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setNetAmountInPaymentCurrency(BigDecimal value) {
    this.netAmountInPaymentCurrency = value;
  }

  /**
   * Gets the value of the noAdults property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getNoAdults() {
    return noAdults;
  }

  /**
   * Sets the value of the noAdults property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setNoAdults(Integer value) {
    this.noAdults = value;
  }

  /**
   * Gets the value of the noChildren property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getNoChildren() {
    return noChildren;
  }

  /**
   * Sets the value of the noChildren property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setNoChildren(Integer value) {
    this.noChildren = value;
  }

  /**
   * Gets the value of the noDisabledPax property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getNoDisabledPax() {
    return noDisabledPax;
  }

  /**
   * Sets the value of the noDisabledPax property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setNoDisabledPax(Integer value) {
    this.noDisabledPax = value;
  }

  /**
   * Gets the value of the noGvtPax property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getNoGvtPax() {
    return noGvtPax;
  }

  /**
   * Sets the value of the noGvtPax property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setNoGvtPax(Integer value) {
    this.noGvtPax = value;
  }

  /**
   * Gets the value of the noInfant property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getNoInfant() {
    return noInfant;
  }

  /**
   * Sets the value of the noInfant property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setNoInfant(Integer value) {
    this.noInfant = value;
  }

  /**
   * Gets the value of the noSnrCitizen property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getNoSnrCitizen() {
    return noSnrCitizen;
  }

  /**
   * Sets the value of the noSnrCitizen property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setNoSnrCitizen(Integer value) {
    this.noSnrCitizen = value;
  }

  /**
   * Gets the value of the noSpecialPax property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getNoSpecialPax() {
    return noSpecialPax;
  }

  /**
   * Sets the value of the noSpecialPax property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setNoSpecialPax(Integer value) {
    this.noSpecialPax = value;
  }

  /**
   * Gets the value of the noStudent property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getNoStudent() {
    return noStudent;
  }

  /**
   * Sets the value of the noStudent property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setNoStudent(Integer value) {
    this.noStudent = value;
  }

  /**
   * Gets the value of the noWomen property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getNoWomen() {
    return noWomen;
  }

  /**
   * Sets the value of the noWomen property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setNoWomen(Integer value) {
    this.noWomen = value;
  }

  /**
   * Gets the value of the nonRefundAmount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getNonRefundAmount() {
    return nonRefundAmount;
  }

  /**
   * Sets the value of the nonRefundAmount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setNonRefundAmount(BigDecimal value) {
    this.nonRefundAmount = value;
  }

  /**
   * Gets the value of the notes property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getNotes() {
    return notes;
  }

  /**
   * Sets the value of the notes property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setNotes(JAXBElement<String> value) {
    this.notes = value;
  }

  /**
   * Gets the value of the pdfDiscountPrice property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPDFDiscountPrice() {
    return pdfDiscountPrice;
  }

  /**
   * Sets the value of the pdfDiscountPrice property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPDFDiscountPrice(BigDecimal value) {
    this.pdfDiscountPrice = value;
  }

  /**
   * Gets the value of the pnrNumber property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getPNRNumber() {
    return pnrNumber;
  }

  /**
   * Sets the value of the pnrNumber property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setPNRNumber(JAXBElement<String> value) {
    this.pnrNumber = value;
  }

  /**
   * Gets the value of the parentReservationID property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getParentReservationID() {
    return parentReservationID;
  }

  /**
   * Sets the value of the parentReservationID property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setParentReservationID(JAXBElement<String> value) {
    this.parentReservationID = value;
  }

  /**
   * Gets the value of the partialAmountCollected property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPartialAmountCollected() {
    return partialAmountCollected;
  }

  /**
   * Sets the value of the partialAmountCollected property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPartialAmountCollected(BigDecimal value) {
    this.partialAmountCollected = value;
  }

  /**
   * Gets the value of the passengerName property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getPassengerName() {
    return passengerName;
  }

  /**
   * Sets the value of the passengerName property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setPassengerName(JAXBElement<String> value) {
    this.passengerName = value;
  }

  /**
   * Gets the value of the paxLoginId property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getPaxLoginId() {
    return paxLoginId;
  }

  /**
   * Sets the value of the paxLoginId property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setPaxLoginId(Integer value) {
    this.paxLoginId = value;
  }

  /**
   * Gets the value of the paymentCurrency property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getPaymentCurrency() {
    return paymentCurrency;
  }

  /**
   * Sets the value of the paymentCurrency property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setPaymentCurrency(JAXBElement<String> value) {
    this.paymentCurrency = value;
  }

  /**
   * Gets the value of the paymentDiscount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPaymentDiscount() {
    return paymentDiscount;
  }

  /**
   * Sets the value of the paymentDiscount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPaymentDiscount(BigDecimal value) {
    this.paymentDiscount = value;
  }

  /**
   * Gets the value of the paymentFee property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPaymentFee() {
    return paymentFee;
  }

  /**
   * Sets the value of the paymentFee property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPaymentFee(BigDecimal value) {
    this.paymentFee = value;
  }

  /**
   * Gets the value of the paymentFeeVATTax property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getPaymentFeeVATTax() {
    return paymentFeeVATTax;
  }

  /**
   * Sets the value of the paymentFeeVATTax property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setPaymentFeeVATTax(BigDecimal value) {
    this.paymentFeeVATTax = value;
  }

  /**
   * Gets the value of the paymentGatewayPaymentOnDate property.
   *
   * @return possible object is
   * {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getPaymentGatewayPaymentOnDate() {
    return paymentGatewayPaymentOnDate;
  }

  /**
   * Sets the value of the paymentGatewayPaymentOnDate property.
   *
   * @param value allowed object is
   *              {@link XMLGregorianCalendar }
   */
  public void setPaymentGatewayPaymentOnDate(XMLGregorianCalendar value) {
    this.paymentGatewayPaymentOnDate = value;
  }

  /**
   * Gets the value of the paymentGatewayPaymentStatus property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getPaymentGatewayPaymentStatus() {
    return paymentGatewayPaymentStatus;
  }

  /**
   * Sets the value of the paymentGatewayPaymentStatus property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setPaymentGatewayPaymentStatus(Integer value) {
    this.paymentGatewayPaymentStatus = value;
  }

  /**
   * Gets the value of the paymentMethodName property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getPaymentMethodName() {
    return paymentMethodName;
  }

  /**
   * Sets the value of the paymentMethodName property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setPaymentMethodName(JAXBElement<String> value) {
    this.paymentMethodName = value;
  }

  /**
   * Gets the value of the paymentRefId property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getPaymentRefId() {
    return paymentRefId;
  }

  /**
   * Sets the value of the paymentRefId property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setPaymentRefId(JAXBElement<String> value) {
    this.paymentRefId = value;
  }

  /**
   * Gets the value of the paymentStatus property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getPaymentStatus() {
    return paymentStatus;
  }

  /**
   * Sets the value of the paymentStatus property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setPaymentStatus(JAXBElement<String> value) {
    this.paymentStatus = value;
  }

  /**
   * Gets the value of the platform property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getPlatform() {
    return platform;
  }

  /**
   * Sets the value of the platform property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setPlatform(JAXBElement<String> value) {
    this.platform = value;
  }

  /**
   * Gets the value of the profile property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ProfileEN }{@code >}
   */
  public JAXBElement<ProfileEN> getProfile() {
    return profile;
  }

  /**
   * Sets the value of the profile property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ProfileEN }{@code >}
   */
  public void setProfile(JAXBElement<ProfileEN> value) {
    this.profile = value;
  }

  /**
   * Gets the value of the promoAmount property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getPromoAmount() {
    return promoAmount;
  }

  /**
   * Sets the value of the promoAmount property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setPromoAmount(JAXBElement<String> value) {
    this.promoAmount = value;
  }

  /**
   * Gets the value of the promoCount property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getPromoCount() {
    return promoCount;
  }

  /**
   * Sets the value of the promoCount property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setPromoCount(JAXBElement<String> value) {
    this.promoCount = value;
  }

  /**
   * Gets the value of the promoID property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getPromoID() {
    return promoID;
  }

  /**
   * Sets the value of the promoID property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setPromoID(JAXBElement<String> value) {
    this.promoID = value;
  }

  /**
   * Gets the value of the promoName property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getPromoName() {
    return promoName;
  }

  /**
   * Sets the value of the promoName property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setPromoName(JAXBElement<String> value) {
    this.promoName = value;
  }

  /**
   * Gets the value of the pukalNo property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getPukalNo() {
    return pukalNo;
  }

  /**
   * Sets the value of the pukalNo property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setPukalNo(JAXBElement<String> value) {
    this.pukalNo = value;
  }

  /**
   * Gets the value of the purchaseOrderId property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getPurchaseOrderId() {
    return purchaseOrderId;
  }

  /**
   * Sets the value of the purchaseOrderId property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setPurchaseOrderId(JAXBElement<String> value) {
    this.purchaseOrderId = value;
  }

  /**
   * Gets the value of the ratio property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getRatio() {
    return ratio;
  }

  /**
   * Sets the value of the ratio property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setRatio(BigDecimal value) {
    this.ratio = value;
  }

  /**
   * Gets the value of the remarks property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getRemarks() {
    return remarks;
  }

  /**
   * Sets the value of the remarks property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setRemarks(JAXBElement<String> value) {
    this.remarks = value;
  }

  /**
   * Gets the value of the resJourneyType property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getResJourneyType() {
    return resJourneyType;
  }

  /**
   * Sets the value of the resJourneyType property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setResJourneyType(JAXBElement<String> value) {
    this.resJourneyType = value;
  }

  /**
   * Gets the value of the reservationDate property.
   *
   * @return possible object is
   * {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getReservationDate() {
    return reservationDate;
  }

  /**
   * Sets the value of the reservationDate property.
   *
   * @param value allowed object is
   *              {@link XMLGregorianCalendar }
   */
  public void setReservationDate(XMLGregorianCalendar value) {
    this.reservationDate = value;
  }

  /**
   * Gets the value of the reservationDateTimeFrom property.
   *
   * @return possible object is
   * {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getReservationDateTimeFrom() {
    return reservationDateTimeFrom;
  }

  /**
   * Sets the value of the reservationDateTimeFrom property.
   *
   * @param value allowed object is
   *              {@link XMLGregorianCalendar }
   */
  public void setReservationDateTimeFrom(XMLGregorianCalendar value) {
    this.reservationDateTimeFrom = value;
  }

  /**
   * Gets the value of the reservationDateTimeTo property.
   *
   * @return possible object is
   * {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getReservationDateTimeTo() {
    return reservationDateTimeTo;
  }

  /**
   * Sets the value of the reservationDateTimeTo property.
   *
   * @param value allowed object is
   *              {@link XMLGregorianCalendar }
   */
  public void setReservationDateTimeTo(XMLGregorianCalendar value) {
    this.reservationDateTimeTo = value;
  }

  /**
   * Gets the value of the reservationFrom property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getReservationFrom() {
    return reservationFrom;
  }

  /**
   * Sets the value of the reservationFrom property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setReservationFrom(JAXBElement<String> value) {
    this.reservationFrom = value;
  }

  /**
   * Gets the value of the reservationID property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getReservationID() {
    return reservationID;
  }

  /**
   * Sets the value of the reservationID property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setReservationID(JAXBElement<String> value) {
    this.reservationID = value;
  }

  /**
   * Gets the value of the reservationTo property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getReservationTo() {
    return reservationTo;
  }

  /**
   * Sets the value of the reservationTo property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setReservationTo(JAXBElement<String> value) {
    this.reservationTo = value;
  }

  /**
   * Gets the value of the reservationType property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getReservationType() {
    return reservationType;
  }

  /**
   * Sets the value of the reservationType property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setReservationType(JAXBElement<String> value) {
    this.reservationType = value;
  }

  /**
   * Gets the value of the reservationUTCDate property.
   *
   * @return possible object is
   * {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getReservationUTCDate() {
    return reservationUTCDate;
  }

  /**
   * Sets the value of the reservationUTCDate property.
   *
   * @param value allowed object is
   *              {@link XMLGregorianCalendar }
   */
  public void setReservationUTCDate(XMLGregorianCalendar value) {
    this.reservationUTCDate = value;
  }

  /**
   * Gets the value of the resultMsg property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link Result }{@code >}
   */
  public JAXBElement<Result> getResultMsg() {
    return resultMsg;
  }

  /**
   * Sets the value of the resultMsg property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link Result }{@code >}
   */
  public void setResultMsg(JAXBElement<Result> value) {
    this.resultMsg = value;
  }

  /**
   * Gets the value of the roundingAdjustment property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getRoundingAdjustment() {
    return roundingAdjustment;
  }

  /**
   * Sets the value of the roundingAdjustment property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setRoundingAdjustment(BigDecimal value) {
    this.roundingAdjustment = value;
  }

  /**
   * Gets the value of the roundingText property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getRoundingText() {
    return roundingText;
  }

  /**
   * Sets the value of the roundingText property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setRoundingText(JAXBElement<String> value) {
    this.roundingText = value;
  }

  /**
   * Gets the value of the saveErrorCode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
   */
  public JAXBElement<ArrayOfint> getSaveErrorCode() {
    return saveErrorCode;
  }

  /**
   * Sets the value of the saveErrorCode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
   */
  public void setSaveErrorCode(JAXBElement<ArrayOfint> value) {
    this.saveErrorCode = value;
  }

  /**
   * Gets the value of the searchLanguageCode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getSearchLanguageCode() {
    return searchLanguageCode;
  }

  /**
   * Sets the value of the searchLanguageCode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setSearchLanguageCode(JAXBElement<String> value) {
    this.searchLanguageCode = value;
  }

  /**
   * Gets the value of the selectedCUCardTypeId property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getSelectedCUCardTypeId() {
    return selectedCUCardTypeId;
  }

  /**
   * Sets the value of the selectedCUCardTypeId property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setSelectedCUCardTypeId(Integer value) {
    this.selectedCUCardTypeId = value;
  }

  /**
   * Gets the value of the selectedCustomerUserPaymentMethodId property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getSelectedCustomerUserPaymentMethodId() {
    return selectedCustomerUserPaymentMethodId;
  }

  /**
   * Sets the value of the selectedCustomerUserPaymentMethodId property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setSelectedCustomerUserPaymentMethodId(Integer value) {
    this.selectedCustomerUserPaymentMethodId = value;
  }

  /**
   * Gets the value of the sellingCurrency property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getSellingCurrency() {
    return sellingCurrency;
  }

  /**
   * Sets the value of the sellingCurrency property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setSellingCurrency(JAXBElement<String> value) {
    this.sellingCurrency = value;
  }

  /**
   * Gets the value of the sourceCurrency property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getSourceCurrency() {
    return sourceCurrency;
  }

  /**
   * Sets the value of the sourceCurrency property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setSourceCurrency(JAXBElement<String> value) {
    this.sourceCurrency = value;
  }

  /**
   * Gets the value of the stationCode property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getStationCode() {
    return stationCode;
  }

  /**
   * Sets the value of the stationCode property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setStationCode(JAXBElement<String> value) {
    this.stationCode = value;
  }

  /**
   * Gets the value of the status property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getStatus() {
    return status;
  }

  /**
   * Sets the value of the status property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setStatus(Integer value) {
    this.status = value;
  }

  /**
   * Gets the value of the subTotalStatus property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getSubTotalStatus() {
    return subTotalStatus;
  }

  /**
   * Sets the value of the subTotalStatus property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setSubTotalStatus(Integer value) {
    this.subTotalStatus = value;
  }

  /**
   * Gets the value of the supplierBookingID1 property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getSupplierBookingID1() {
    return supplierBookingID1;
  }

  /**
   * Sets the value of the supplierBookingID1 property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setSupplierBookingID1(JAXBElement<String> value) {
    this.supplierBookingID1 = value;
  }

  /**
   * Gets the value of the supplierBookingID2 property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getSupplierBookingID2() {
    return supplierBookingID2;
  }

  /**
   * Sets the value of the supplierBookingID2 property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setSupplierBookingID2(JAXBElement<String> value) {
    this.supplierBookingID2 = value;
  }

  /**
   * Gets the value of the surName property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getSurName() {
    return surName;
  }

  /**
   * Sets the value of the surName property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setSurName(JAXBElement<String> value) {
    this.surName = value;
  }

  /**
   * Gets the value of the targetCurrency property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getTargetCurrency() {
    return targetCurrency;
  }

  /**
   * Sets the value of the targetCurrency property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setTargetCurrency(JAXBElement<String> value) {
    this.targetCurrency = value;
  }

  /**
   * Gets the value of the telephone property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getTelephone() {
    return telephone;
  }

  /**
   * Sets the value of the telephone property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setTelephone(JAXBElement<String> value) {
    this.telephone = value;
  }

  /**
   * Gets the value of the ticketStatus property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isTicketStatus() {
    return ticketStatus;
  }

  /**
   * Sets the value of the ticketStatus property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setTicketStatus(Boolean value) {
    this.ticketStatus = value;
  }

  /**
   * Gets the value of the ticketed property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getTicketed() {
    return ticketed;
  }

  /**
   * Sets the value of the ticketed property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setTicketed(Integer value) {
    this.ticketed = value;
  }

  /**
   * Gets the value of the ticketingDeadline property.
   *
   * @return possible object is
   * {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getTicketingDeadline() {
    return ticketingDeadline;
  }

  /**
   * Sets the value of the ticketingDeadline property.
   *
   * @param value allowed object is
   *              {@link XMLGregorianCalendar }
   */
  public void setTicketingDeadline(XMLGregorianCalendar value) {
    this.ticketingDeadline = value;
  }

  /**
   * Gets the value of the ticketmailsentDT property.
   *
   * @return possible object is
   * {@link XMLGregorianCalendar }
   */
  public XMLGregorianCalendar getTicketmailsentDT() {
    return ticketmailsentDT;
  }

  /**
   * Sets the value of the ticketmailsentDT property.
   *
   * @param value allowed object is
   *              {@link XMLGregorianCalendar }
   */
  public void setTicketmailsentDT(XMLGregorianCalendar value) {
    this.ticketmailsentDT = value;
  }

  /**
   * Gets the value of the title property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getTitle() {
    return title;
  }

  /**
   * Sets the value of the title property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setTitle(JAXBElement<String> value) {
    this.title = value;
  }

  /**
   * Gets the value of the todaySubTotalStatus property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getTodaySubTotalStatus() {
    return todaySubTotalStatus;
  }

  /**
   * Sets the value of the todaySubTotalStatus property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setTodaySubTotalStatus(Integer value) {
    this.todaySubTotalStatus = value;
  }

  /**
   * Gets the value of the todayTotalStatus property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getTodayTotalStatus() {
    return todayTotalStatus;
  }

  /**
   * Sets the value of the todayTotalStatus property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setTodayTotalStatus(Integer value) {
    this.todayTotalStatus = value;
  }

  /**
   * Gets the value of the totAmountinPaymentCurrency property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getTotAmountinPaymentCurrency() {
    return totAmountinPaymentCurrency;
  }

  /**
   * Sets the value of the totAmountinPaymentCurrency property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setTotAmountinPaymentCurrency(BigDecimal value) {
    this.totAmountinPaymentCurrency = value;
  }

  /**
   * Gets the value of the totalAmount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getTotalAmount() {
    return totalAmount;
  }

  /**
   * Sets the value of the totalAmount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setTotalAmount(BigDecimal value) {
    this.totalAmount = value;
  }

  /**
   * Gets the value of the totalPromoAmount property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getTotalPromoAmount() {
    return totalPromoAmount;
  }

  /**
   * Sets the value of the totalPromoAmount property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setTotalPromoAmount(BigDecimal value) {
    this.totalPromoAmount = value;
  }

  /**
   * Gets the value of the totalSellingPrice property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getTotalSellingPrice() {
    return totalSellingPrice;
  }

  /**
   * Sets the value of the totalSellingPrice property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setTotalSellingPrice(BigDecimal value) {
    this.totalSellingPrice = value;
  }

  /**
   * Gets the value of the totalStatus property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getTotalStatus() {
    return totalStatus;
  }

  /**
   * Sets the value of the totalStatus property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setTotalStatus(Integer value) {
    this.totalStatus = value;
  }

  /**
   * Gets the value of the totalTax property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getTotalTax() {
    return totalTax;
  }

  /**
   * Sets the value of the totalTax property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setTotalTax(BigDecimal value) {
    this.totalTax = value;
  }

  /**
   * Gets the value of the totalSellingPriceMYR property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getTotalSellingPriceMYR() {
    return totalSellingPriceMYR;
  }

  /**
   * Sets the value of the totalSellingPriceMYR property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setTotalSellingPriceMYR(BigDecimal value) {
    this.totalSellingPriceMYR = value;
  }

  /**
   * Gets the value of the uniqueID property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getUniqueID() {
    return uniqueID;
  }

  /**
   * Sets the value of the uniqueID property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setUniqueID(JAXBElement<String> value) {
    this.uniqueID = value;
  }

  /**
   * Gets the value of the userLoginID property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getUserLoginID() {
    return userLoginID;
  }

  /**
   * Sets the value of the userLoginID property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setUserLoginID(Integer value) {
    this.userLoginID = value;
  }

  /**
   * Gets the value of the userName property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getUserName() {
    return userName;
  }

  /**
   * Sets the value of the userName property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setUserName(JAXBElement<String> value) {
    this.userName = value;
  }

  /**
   * Gets the value of the vatReceiptOption property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getVATReceiptOption() {
    return vatReceiptOption;
  }

  /**
   * Sets the value of the vatReceiptOption property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setVATReceiptOption(JAXBElement<String> value) {
    this.vatReceiptOption = value;
  }

  /**
   * Gets the value of the validity property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getValidity() {
    return validity;
  }

  /**
   * Sets the value of the validity property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setValidity(JAXBElement<String> value) {
    this.validity = value;
  }

  /**
   * Gets the value of the version property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getVersion() {
    return version;
  }

  /**
   * Sets the value of the version property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setVersion(JAXBElement<String> value) {
    this.version = value;
  }

  /**
   * Gets the value of the warrentSerialNo property.
   *
   * @return possible object is
   * {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public JAXBElement<String> getWarrentSerialNo() {
    return warrentSerialNo;
  }

  /**
   * Sets the value of the warrentSerialNo property.
   *
   * @param value allowed object is
   *              {@link JAXBElement }{@code <}{@link String }{@code >}
   */
  public void setWarrentSerialNo(JAXBElement<String> value) {
    this.warrentSerialNo = value;
  }

}
