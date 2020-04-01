package com.traveloka.hibernate.model.pg.goquo_dp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightSearchCriteria complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FlightSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AgentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllowClassesOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicableFare" type="{http://schemas.datacontract.org/2004/07/}EnumApplicableFare" minOccurs="0"/>
 *         &lt;element name="ArrivalCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrivalCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B2BID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BookingClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CabinClass" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CallCenterUserLoginID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChildAge" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustomerUserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DepartureCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DepartureDateGap" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DirectFlightsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisabledPromoCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FBType" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils}FlightBookingType" minOccurs="0"/>
 *         &lt;element name="FSearchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GovtCompPromoCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GovtPromoCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GroupQuotationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GroupReservationID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Infants" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsFareStrikeOutApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsGroupBookingConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPackageUpsell" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPremierMember" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsShowUpsellHotelAvgAmt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="JourneyType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoyaltySearchInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}LoyaltySearchUserInfo" minOccurs="0"/>
 *         &lt;element name="MilesType" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils}MilesType" minOccurs="0"/>
 *         &lt;element name="NoOfNextDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoOfPreviousDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PreferredCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReRouteType" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils}EnumReRouteType" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReturnDateGap" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SearchOption" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SegmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SnrCitizenPromoCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StudentPromoCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UTM_Campaign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WomensPromoCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSearchCriteriaRQ", propOrder = {
    "adults",
    /*"agentID",
    "airlineCode",
    "allowClassesOnly",
    "applicableFare",*/
    "arrivalCity",
    /*"arrivalCityName",
    "b2BID",
    "bookingClass",
    "cabinClass",
    "callCenterUserLoginID",
    "childAge",*/
    "children",
    /*"customerId",
    "customerType",
    "customerUserId",*/
    "departureCity",
    /*"departureCityName",*/
    "departureDate",
    /*"departureDateGap",
    "directFlightsOnly",
    "disabledPromoCount",
    "fbType",
    "fSearchID",
    "govtCompPromoCount",
    "govtPromoCount",
    "groupQuotationID",
    "groupReservationID",*/
    "infants",
    /*"isFareStrikeOutApplicable",
    "isGroupBookingConfirmation",
    "isPackageUpsell",
    "isPremierMember",
    "isShowUpsellHotelAvgAmt",*/
    "journeyType",
    /*"languageCode",
    "loyaltySearchInfo",
    "milesType",
    "noOfNextDays",
    "noOfPreviousDays",
    "preferredCurrency",
    "promotionCode",
    "promotionalCode",
    "reRouteType",
    "remark",*/
    "returnDate",
    /*"returnDateGap",
    "searchOption",
    "segmentType",
    "sessionID",
    "snrCitizenPromoCount",
    "studentPromoCount",
    "utmCampaign",
    "womensPromoCount"*/
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@XmlRootElement(name = "FlightSearchCriteria")
public class FlightSearchCriteriaRQ {

  @XmlElement(name = "Adults")
  protected Integer adults;
  //@XmlElement(name = "AgentID")
  //protected Integer agentID;
  //@XmlElement(name = "AirlineCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  //protected String airlineCode;
  //@XmlElement(name = "AllowClassesOnly", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  //protected String allowClassesOnly;
  //@XmlElement(name = "ApplicableFare")
  //@XmlSchemaType(name = "string")
  //protected EnumApplicableFare applicableFare;
  @XmlElement(name = "ArrivalCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String arrivalCity;
  //@XmlElement(name = "ArrivalCityName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  //protected String arrivalCityName;
  //@XmlElement(name = "B2BID")
  //protected Integer b2BID;
  //@XmlElement(name = "BookingClass", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  //protected String bookingClass;
  //@XmlElement(name = "CabinClass")
  //protected Integer cabinClass;
  //@XmlElement(name = "CallCenterUserLoginID")
  //protected Integer callCenterUserLoginID;
  //@XmlElement(name = "ChildAge", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  //protected ArrayOfint childAge;
  @XmlElement(name = "Children")
  protected Integer children;
  //@XmlElement(name = "CustomerId")
  //protected Integer customerId;
  //@XmlElement(name = "CustomerType")
  //protected Integer customerType;
  //@XmlElement(name = "CustomerUserId")
  //protected Integer customerUserId;
  @XmlElement(name = "DepartureCity", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  protected String departureCity;
  //@XmlElement(name = "DepartureCityName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  //protected String departureCityName;
  @XmlElement(name = "DepartureDate")
  //@XmlSchemaType(name = "dateTime")
  protected String/*GregorianCalendar*/ departureDate;
  //@XmlElement(name = "DepartureDateGap")
  //protected Integer departureDateGap;
  //@XmlElement(name = "DirectFlightsOnly")
  //protected Boolean directFlightsOnly;
  //@XmlElement(name = "DisabledPromoCount")
  //protected Integer disabledPromoCount;
  //@XmlElement(name = "FBType")
  //@XmlSchemaType(name = "string")
  //protected FlightBookingType fbType;
  //@XmlElement(name = "FSearchID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  //protected String fSearchID;
  //@XmlElement(name = "GovtCompPromoCount")
  //protected Integer govtCompPromoCount;
  //@XmlElement(name = "GovtPromoCount")
  //protected Integer govtPromoCount;
  //@XmlElement(name = "GroupQuotationID")
  //protected Integer groupQuotationID;
  //@XmlElement(name = "GroupReservationID")
  //protected Integer groupReservationID;
  @XmlElement(name = "Infants")
  protected Integer infants;
  //@XmlElement(name = "IsFareStrikeOutApplicable")
  //protected Boolean isFareStrikeOutApplicable;
  //@XmlElement(name = "IsGroupBookingConfirmation")
  //protected Boolean isGroupBookingConfirmation;
  //@XmlElement(name = "IsPackageUpsell")
  //protected Boolean isPackageUpsell;
  //@XmlElement(name = "IsPremierMember")
  //protected Boolean isPremierMember;
  //@XmlElement(name = "IsShowUpsellHotelAvgAmt")
  //protected Boolean isShowUpsellHotelAvgAmt;
  @XmlElement(name = "JourneyType")
  protected Integer journeyType;
  //@XmlElement(name = "LanguageCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  //protected String languageCode;
  //@XmlElement(name = "LoyaltySearchInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  //protected LoyaltySearchUserInfo loyaltySearchInfo;
  //@XmlElement(name = "MilesType")
  //@XmlSchemaType(name = "string")
  //protected MilesType milesType;
  //@XmlElement(name = "NoOfNextDays")
  //protected Integer noOfNextDays;
  //@XmlElement(name = "NoOfPreviousDays")
  //protected Integer noOfPreviousDays;
  //@XmlElement(name = "PreferredCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  //protected String preferredCurrency;
  //@XmlElement(name = "PromotionCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  //protected String promotionCode;
  //@XmlElement(name = "PromotionalCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  //protected String promotionalCode;
  //@XmlElement(name = "ReRouteType")
  //@XmlSchemaType(name = "string")
  //protected EnumReRouteType reRouteType;
  //@XmlElement(name = "Remark", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  //protected String remark;
  @XmlElement(name = "ReturnDate")
  //@XmlSchemaType(name = "dateTime")
  protected String /*XMLGregorianCalendar*/ returnDate;
  //@XmlElement(name = "ReturnDateGap")
  //protected Integer returnDateGap;
  //@XmlElement(name = "SearchOption")
  //protected Integer searchOption;
  //@XmlElement(name = "SegmentType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  //protected String segmentType;
  //@XmlElement(name = "SessionID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  //protected String sessionID;
  //@XmlElement(name = "SnrCitizenPromoCount")
  //protected Integer snrCitizenPromoCount;
  //@XmlElement(name = "StudentPromoCount")
  //protected Integer studentPromoCount;
  //@XmlElement(name = "UTM_Campaign", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", required = false)
  //protected String utmCampaign;
  //@XmlElement(name = "WomensPromoCount")
  //protected Integer womensPromoCount;
}
