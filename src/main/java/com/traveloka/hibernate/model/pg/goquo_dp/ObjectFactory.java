package com.traveloka.hibernate.model.pg.goquo_dp;

import com.traveloka.hibernate.model.pg.goquo_dp_bal.ArrayOfGQInsuranceRes;
import com.traveloka.hibernate.model.pg.goquo_dp_bal.LoyaltyPriceInfo;
import com.traveloka.hibernate.model.pg.serialization.arrays.ArrayOfint;
import com.traveloka.hibernate.model.pg.serialization.arrays.ArrayOfstring;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the org.datacontract.schemas._2004._07.goquo_dp package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private final static QName _ArrayOfBaggages_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ArrayOfBaggages");
  private final static QName _GSTBreakDownInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "GSTBreakDownInfo");
  private final static QName _APIAddonPriceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "API_AddonPriceInfo");
  private final static QName _ArrayOfAPISelectedLounge_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfAPI_SelectedLounge");
  private final static QName _APIBaggageSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "API_BaggageSegment");
  private final static QName _FlightReservationSegmentsEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "FlightReservationSegmentsEN");
  private final static QName _ArrayOfAPIPaxSelectedAddOn_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfAPI_PaxSelectedAddOn");
  private final static QName _ArrayOfAirlineMLPaxPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfAirlineMLPaxPrice");
  private final static QName _FlightSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FlightSegment");
  private final static QName _FareGroupAirlineFlight_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "FareGroupAirlineFlight");
  private final static QName _ServiceRequestInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ServiceRequestInfo");
  private final static QName _LoungeReservationEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "LoungeReservationEN");
  private final static QName _InsuranceReservationEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "InsuranceReservationEN");
  private final static QName _APIAddonSetSelectedReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "API_AddonSetSelectedReq");
  private final static QName _StrikeoutInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "StrikeoutInfo");
  private final static QName _APIAddonSetSelectedRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "API_AddonSetSelectedRes");
  private final static QName _ArrayOfPassengersEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrayOfPassengersEN");
  private final static QName _ArrayOfMultilegFlightReservation_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrayOfMultilegFlightReservation");
  private final static QName _ArrayOfGDSFlightSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfGDS_FlightSegment");
  private final static QName _LoyaltySearchUserInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "LoyaltySearchUserInfo");
  private final static QName _ResultPackage_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ResultPackage");
  private final static QName _ArrayOfSegmentFareInfoEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrayOfSegmentFareInfoEN");
  private final static QName _InsuranceReservationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "InsuranceReservationInfo");
  private final static QName _ArrayOfAPIRoutesEn_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ArrayOfAPIRoutesEn");
  private final static QName _MobileAppLangTextEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "MobileAppLangTextEN");
  private final static QName _PaxLoginsEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PaxLoginsEN");
  private final static QName _PaxPriceBreakDown_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PaxPriceBreakDown");
  private final static QName _AirlineMLAvail_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "AirlineMLAvail");
  private final static QName _FlightManagementResponseEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "FlightManagementResponseEN");
  private final static QName _PaxTypeCharge_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "PaxTypeCharge");
  private final static QName _MilesType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils", "MilesType");
  private final static QName _APILoungeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "API_LoungeInfo");
  private final static QName _ArrayOfMobileAppLangTextEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrayOfMobileAppLangTextEN");
  private final static QName _ArrayOfBookingSpecialServices_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfBookingSpecialServices");
  private final static QName _PackageSummaryType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils", "PackageSummaryType");
  private final static QName _ReservationsCardTransactionsEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ReservationsCardTransactionsEN");
  private final static QName _ArrayOfAPIMealSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfAPI_MealSegment");
  private final static QName _ArrayOfAPILoungeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ArrayOfAPI_LoungeInfo");
  private final static QName _ArrayOfMarkupFlightEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrayOfMarkupFlightEN");
  private final static QName _APILoungeSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "API_LoungeSegment");
  private final static QName _ArrayOfInsuranceReservationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrayOfInsuranceReservationInfo");
  private final static QName _FlightBookingType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils", "FlightBookingType");
  private final static QName _APISearchCriteriaParams_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "API_SearchCriteriaParams");
  private final static QName _ProfileEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ProfileEN");
  private final static QName _CabinClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "CabinClass");
  private final static QName _MarkupGroupsEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "MarkupGroupsEN");
  private final static QName _ArrayOfLoungeReservationEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrayOfLoungeReservationEN");
  private final static QName _APISeatSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "API_SeatSegment");
  private final static QName _PromotionCodesEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PromotionCodesEN");
  private final static QName _APIMealInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "API_MealInfo");
  private final static QName _ArrayOfSGDInsurancePackageSummary_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfSGDInsurancePackageSummary");
  private final static QName _FareGroupFlight_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FareGroupFlight");
  private final static QName _ArrayOfBaggageReservationEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrayOfBaggageReservationEN");
  private final static QName _APISeatAvailability_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "API_SeatAvailability");
  private final static QName _Flights_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Flights");
  private final static QName _AirlineMLPaxPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "AirlineMLPaxPrice");
  private final static QName _CustomerUserPaymentMethodsEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "CustomerUserPaymentMethodsEN");
  private final static QName _APIMealSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "API_MealSegment");
  private final static QName _BaggageReservationEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "BaggageReservationEN");
  private final static QName _APILoungeAvailability_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "API_LoungeAvailability");
  private final static QName _SegmentPaxPriceEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "SegmentPaxPriceEN");
  private final static QName _ArrayOfAirlineMealSelectionEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrayOfAirlineMealSelectionEN");
  private final static QName _InsuranceGSTInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "InsuranceGSTInfo");
  private final static QName _MultiSetSelectedReponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "MultiSetSelectedReponse");
  private final static QName _APIInsuranceURL_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "API_InsuranceURL");
  private final static QName _PerPaxPriceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "PerPaxPriceInfo");
  private final static QName _PaxPriceDifference_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "PaxPriceDifference");
  private final static QName _ArrayOfAPISelectedSeat_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfAPI_SelectedSeat");
  private final static QName _MultilegFlightReservation_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "MultilegFlightReservation");
  private final static QName _PassengerType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "PassengerType");
  private final static QName _SGDInsurancePackageSummary_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SGDInsurancePackageSummary");
  private final static QName _ArrayOfFareRulesEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ArrayOfFareRulesEN");
  private final static QName _ArrayOfSeatReservationEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrayOfSeatReservationEN");
  private final static QName _APIPaxSelectedAddOn_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "API_PaxSelectedAddOn");
  private final static QName _AirlineMLPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "AirlineMLPrice");
  private final static QName _MarkupFlightEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "MarkupFlightEN");
  private final static QName _APICancelBookingResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "APICancelBookingResponse");
  private final static QName _PromotionSettingsEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PromotionSettingsEN");
  private final static QName _FlightTerminalInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FlightTerminalInfo");
  private final static QName _ArrayOfInstallmentPaymentSettingsEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrayOfInstallmentPaymentSettingsEN");
  private final static QName _ArrayOfAPISearchCriteriaParams_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfAPI_SearchCriteriaParams");
  private final static QName _FlightReservationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "FlightReservationInfo");
  private final static QName _ArrayOfUnCombinedFareBasis_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfUnCombinedFareBasis");
  private final static QName _APISelectedMeals_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "API_SelectedMeals");
  private final static QName _SpecialTypePaxCount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "SpecialTypePaxCount");
  private final static QName _APISelectedLounge_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "API_SelectedLounge");
  private final static QName _PaymentMethodsEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PaymentMethodsEN");
  private final static QName _SMSPriceEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "SMSPriceEN");
  private final static QName _TaxBreakDownInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "TaxBreakDownInfo");
  private final static QName _ArrayOfMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ArrayOfMessage");
  private final static QName _SegmentFareInfoEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "SegmentFareInfoEN");
  private final static QName _ArrayOfSpecialPriceSummary_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfSpecialPriceSummary");
  private final static QName _SpecialPriceSummary_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "SpecialPriceSummary");
  private final static QName _ArrayOfAPISeatInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ArrayOfAPI_SeatInfo");
  private final static QName _PassengerDetailsEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PassengerDetailsEN");
  private final static QName _ReservationsEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ReservationsEN");
  private final static QName _ArrayOfInsuranceReservationEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrayOfInsuranceReservationEN");
  private final static QName _SearchType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "SearchType");
  private final static QName _APIMultiCitySearchCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "API_MultiCitySearchCriteria");
  private final static QName _ArrayOfAPIMealInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ArrayOfAPI_MealInfo");
  private final static QName _TicketingResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "TicketingResponse");
  private final static QName _APIRoutesEn_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "APIRoutesEn");
  private final static QName _APIBookingSpecialServices_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "API_BookingSpecialServices");
  private final static QName _PackageSummary_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "PackageSummary");
  private final static QName _SeatReservationEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "SeatReservationEN");
  private final static QName _BookingSpecialServices_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "BookingSpecialServices");
  private final static QName _IntermediatePoint_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "IntermediatePoint");
  private final static QName _ArrayOfAirlineMLFlightLeg_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfAirlineMLFlightLeg");
  private final static QName _ArrayOfMultiCitySetSelectedFlight_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfMultiCitySetSelectedFlight");
  private final static QName _ArrayOfFareGroupAirlineFlight_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfFareGroupAirlineFlight");
  private final static QName _FlightSearchReponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FlightSearchReponse");
  private final static QName _PriceStrikeoutSettingsEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PriceStrikeoutSettingsEN");
  private final static QName _ArrayOfSpecialPaxPriceDifference_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfSpecialPaxPriceDifference");
  private final static QName _ReservationDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ReservationDetails");
  private final static QName _ArrayOfCustomerUserCardTypesEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrayOfCustomerUserCardTypesEN");
  private final static QName _ArrayOfAPILoungeSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfAPI_LoungeSegment");
  private final static QName _GDSFlightSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "GDS_FlightSegment");
  private final static QName _DisClosureAirline_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DisClosureAirline");
  private final static QName _ArrayOfFareGroupFlight_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfFareGroupFlight");
  private final static QName _AirlineFlight_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "AirlineFlight");
  private final static QName _APIMealAvailability_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "API_MealAvailability");
  private final static QName _RouteFreeBaggageAllowance_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "RouteFreeBaggageAllowance");
  private final static QName _ConsentEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ConsentEN");
  private final static QName _CreditCardsEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "CreditCardsEN");
  private final static QName _AirlineFlightSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "AirlineFlightSegment");
  private final static QName _ArrayOfFlightReservationSegmentsEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrayOfFlightReservationSegmentsEN");
  private final static QName _ArrayOfPackageSummary_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfPackageSummary");
  private final static QName _ArrayOfAPIBaggageInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfAPI_BaggageInfo");
  private final static QName _ArrayOfFreeBaggageAllowanceEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfFreeBaggageAllowanceEN");
  private final static QName _ArrayOfAPIInsuranceURL_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfAPI_InsuranceURL");
  private final static QName _EnumReRouteType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils", "EnumReRouteType");
  private final static QName _APISelectedSeat_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "API_SelectedSeat");
  private final static QName _FreeBaggageAllowance_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FreeBaggageAllowance");
  private final static QName _ArrayOfAirlineFlightSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfAirlineFlightSegment");
  private final static QName _FareRulesEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "FareRulesEN");
  private final static QName _SMSSettingsEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "SMSSettingsEN");
  private final static QName _APICancelBookingRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "APICancelBookingRequest");
  private final static QName _AirlineMLFlightLeg_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "AirlineMLFlightLeg");
  private final static QName _Result_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Result");
  private final static QName _ArrayOfFlights_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ArrayOfFlights");
  private final static QName _APIBaggageInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "API_BaggageInfo");
  private final static QName _ArrayOfSpecialService_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfSpecialService");
  private final static QName _FlightReservationEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "FlightReservationEN");
  private final static QName _PassengersEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PassengersEN");
  private final static QName _BookingChargesInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "BookingChargesInfo");
  private final static QName _AirlineMealSelectionEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "AirlineMealSelectionEN");
  private final static QName _APIInsuranceAvailability_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "API_InsuranceAvailability");
  private final static QName _APIMultiCitySetSelectedFlights_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "API_MultiCitySetSelectedFlights");
  private final static QName _APISeatInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "API_SeatInfo");
  private final static QName _ReservationPromoCodesEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ReservationPromoCodesEN");
  private final static QName _FreeBaggageAllowanceEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "FreeBaggageAllowanceEN");
  private final static QName _APIAddonAvailabilityReq_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "API_AddonAvailabilityReq");
  private final static QName _APIAddonAvailabilityRes_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "API_AddonAvailabilityRes");
  private final static QName _MultiFlightSearchReponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "MultiFlightSearchReponse");
  private final static QName _PromotionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "PromotionInfo");
  private final static QName _ArrayOfGSTBreakDownInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfGSTBreakDownInfo");
  private final static QName _ArrayOfAPISeatSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfAPI_SeatSegment");
  private final static QName _APIBaggageAvailability_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "API_BaggageAvailability");
  private final static QName _ArrayOfFlightReservationEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrayOfFlightReservationEN");
  private final static QName _GetUpdatedBookingDetailsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "GetUpdatedBookingDetailsRequest");
  private final static QName _InstallmentPaymentSettingsEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "InstallmentPaymentSettingsEN");
  private final static QName _CustUserPaymentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils", "CustUserPaymentType");
  private final static QName _FlightAddOnBookingStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "FlightAddOnBookingStatus");
  private final static QName _FlightError_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FlightError");
  private final static QName _BookedProducts_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "BookedProducts");
  private final static QName _FlightSearchCriteria_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FlightSearchCriteria");
  private final static QName _Message_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Message");
  private final static QName _BookingPriceBreakDownEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "BookingPriceBreakDownEN");
  private final static QName _UnCombinedFareBasis_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "UnCombinedFareBasis");
  private final static QName _PriceInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "PriceInformation");
  private final static QName _ArrayOfAPISelectedBaggages_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfAPI_SelectedBaggages");
  private final static QName _ArrayOfTaxBreakDownInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfTaxBreakDownInfo");
  private final static QName _SpecialPaxPriceDifference_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SpecialPaxPriceDifference");
  private final static QName _SpecialService_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "SpecialService");
  private final static QName _B2BCompanyDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "B2BCompanyDetails");
  private final static QName _ArrayOfAPIBaggageSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfAPI_BaggageSegment");
  private final static QName _ArrayOfFlightReservationEticketEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrayOfFlightReservationEticketEN");
  private final static QName _ArrayOfAPISelectedMeals_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfAPI_SelectedMeals");
  private final static QName _CardTypesEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "CardTypesEN");
  private final static QName _CustomerUserCardTypesEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "CustomerUserCardTypesEN");
  private final static QName _MultiCitySetSelectedFlight_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "MultiCitySetSelectedFlight");
  private final static QName _ArrayOfAirlineFlight_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ArrayOfAirlineFlight");
  private final static QName _ArrayOfPaxPriceBreakDown_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrayOfPaxPriceBreakDown");
  private final static QName _ArrayOfPerPaxPriceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrayOfPerPaxPriceInfo");
  private final static QName _GSTReservationEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "GSTReservationEN");
  private final static QName _Baggages_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Baggages");
  private final static QName _APISelectedBaggages_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "API_SelectedBaggages");
  private final static QName _ArrayOfCustomerUserPaymentMethodsEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrayOfCustomerUserPaymentMethodsEN");
  private final static QName _ArrayOfFlightSegment_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ArrayOfFlightSegment");
  private final static QName _FlightReservationEticketEN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "FlightReservationEticketEN");
  private final static QName _FareRulesENReservationID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ReservationID");
  private final static QName _FareRulesENDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Description");
  private final static QName _FareRulesENSubject_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Subject");
  private final static QName _FareRulesENResultMsg_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ResultMsg");
  private final static QName _PassengersENGWOrganizationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "GWOrganizationName");
  private final static QName _PassengersENFFNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "FFNo");
  private final static QName _PassengersENEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Email");
  private final static QName _PassengersENGender_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Gender");
  private final static QName _PassengersENNameNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "NameNumber");
  private final static QName _PassengersENSeating_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Seating");
  private final static QName _PassengersENSelectedLionFast_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "selectedLionFast");
  private final static QName _PassengersENAssistance_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Assistance");
  private final static QName _PassengersENSpecialType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "SpecialType");
  private final static QName _PassengersENIBMeal_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "IBMeal");
  private final static QName _PassengersENSelectedLounge_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SelectedLounge");
  private final static QName _PassengersENSeatingCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "SeatingCode");
  private final static QName _PassengersENDocumentID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "DocumentID");
  private final static QName _PassengersENFFNoErrMsg_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "FFNoErrMsg");
  private final static QName _PassengersENInsDocumentId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "InsDocumentId");
  private final static QName _PassengersENContactNoType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ContactNoType");
  private final static QName _PassengersENPassportCountryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PassportCountryCode");
  private final static QName _PassengersENIBMealCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "IBMealCode");
  private final static QName _PassengersENSelectedExpCheckin_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SelectedExpCheckin");
  private final static QName _PassengersENMeal_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Meal");
  private final static QName _PassengersENNationalityCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "NationalityCode");
  private final static QName _PassengersENSelectedTaxi_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "SelectedTaxi");
  private final static QName _PassengersENSelectedComfyKit_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SelectedComfyKit");
  private final static QName _PassengersENInsDocumentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "InsDocumentType");
  private final static QName _PassengersENFFNoPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "FFNoPassword");
  private final static QName _PassengersENLoyaltyPrefLang_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "LoyaltyPrefLang");
  private final static QName _PassengersENSelectedSeats_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SelectedSeats");
  private final static QName _PassengersENDocType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "DocType");
  private final static QName _PassengersENIBSeatingCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "IBSeatingCode");
  private final static QName _PassengersENMealCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "MealCode");
  private final static QName _PassengersENPaxSuffix_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PaxSuffix");
  private final static QName _PassengersENFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "FirstName");
  private final static QName _PassengersENMobileNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "MobileNo");
  private final static QName _PassengersENModifiedDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ModifiedDetails");
  private final static QName _PassengersENSurName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "SurName");
  private final static QName _PassengersENNationality_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Nationality");
  private final static QName _PassengersENFFType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "FFType");
  private final static QName _PassengersENFFTypeCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "FFTypeCode");
  private final static QName _PassengersENTitle_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Title");
  private final static QName _PassengersENPassportNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PassportNo");
  private final static QName _PassengersENImpRating_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ImpRating");
  private final static QName _PassengersENOccupation_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Occupation");
  private final static QName _PassengersENPassengerType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PassengerType");
  private final static QName _PassengersENGWGovtID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "GWGovtID");
  private final static QName _PassengersENPassportCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PassportCountry");
  private final static QName _PassengersENIBSeating_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "IBSeating");
  private final static QName _PassengersENSelectedMeals_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SelectedMeals");
  private final static QName _PassengersENTel_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Tel");
  private final static QName _PassengersENPaxeTicket_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PaxeTicket");
  private final static QName _MultiCitySetSelectedFlightOBClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "OBClass");
  private final static QName _FlightsMobileInsuranceText_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "MobileInsuranceText");
  private final static QName _FlightsB2BICode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "B2BICode");
  private final static QName _FlightsParentGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ParentGroup");
  private final static QName _FlightsInBoundFlights_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "inBoundFlights");
  private final static QName _FlightsBookingCharges_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "BookingCharges");
  private final static QName _FlightsFlightDirection_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FlightDirection");
  private final static QName _FlightsFlightClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FlightClass");
  private final static QName _FlightsFreeBaggageAllowances_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "FreeBaggageAllowances");
  private final static QName _FlightsAdditionalFareInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "AdditionalFareInfo");
  private final static QName _FlightsTaxBreakDown_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "TaxBreakDown");
  private final static QName _FlightsMK_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "MK");
  private final static QName _FlightsMergedPriceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "MergedPriceInfo");
  private final static QName _FlightsMobTermsandCondText_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "MobTermsandCondText");
  private final static QName _FlightsSpecialTypePax_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "SpecialTypePax");
  private final static QName _FlightsSegmentedFareBreakDown_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SegmentedFareBreakDown");
  private final static QName _FlightsActualFareBasisCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ActualFareBasisCode");
  private final static QName _FlightsInsuranceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "InsuranceInfo");
  private final static QName _FlightsPriceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "priceInfo");
  private final static QName _FlightsCurrencyCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "CurrencyCode");
  private final static QName _FlightsUpdatedPriceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "UpdatedPriceInfo");
  private final static QName _FlightsOutBoundFlights_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "outBoundFlights");
  private final static QName _FlightsMarkupApplied_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "MarkupApplied");
  private final static QName _FlightsFareType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FareType");
  private final static QName _FlightsFGKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FGKey");
  private final static QName _FlightsInsuranceGST_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "InsuranceGST");
  private final static QName _FlightsUnCombineFares_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "UnCombineFares");
  private final static QName _FlightsFareBasisCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FareBasisCode");
  private final static QName _FlightsB2BDCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "B2BDCode");
  private final static QName _FlightsDispCurrencyCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "dispCurrencyCode");
  private final static QName _FlightsBookingError_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "BookingError");
  private final static QName _FlightsResultMsg_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ResultMsg");
  private final static QName _FlightsGSTBreakDown_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "GSTBreakDown");
  private final static QName _FlightsFGCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FGCode");
  private final static QName _FlightsAppliedPromotionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "AppliedPromotionInfo");
  private final static QName _FlightsMobAppLangText_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "MobAppLangText");
  private final static QName _FlightsClassCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ClassCode");
  private final static QName _FlightErrorErrMsg_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ErrMsg");
  private final static QName _APISelectedBaggagesSegmentIndex_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SegmentIndex");
  private final static QName _APIAddonSetSelectedResSelectedAddons_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SelectedAddons");
  private final static QName _APIAddonSetSelectedResErrorMsg_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ErrorMsg");
  private final static QName _APICancelBookingResponseErrorMsg_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ErrorMsg");
  private final static QName _PaxTypeChargeDispPerPaxCharge_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispPerPaxCharge");
  private final static QName _PaxTypeChargePaxType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "PaxType");
  private final static QName _PaxTypeChargeDispCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "dispCurrency");
  private final static QName _PaxTypeChargeDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Description");
  private final static QName _PaxTypeChargeDispTotalCharge_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispTotalCharge");
  private final static QName _AirlineMLFlightLegDepartureCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DepartureCity");
  private final static QName _AirlineMLFlightLegAvailFlights_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "AvailFlights");
  private final static QName _AirlineMLFlightLegArraivalCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArraivalCity");
  private final static QName _AirlineMLFlightLegSelectedAirlineFlight_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SelectedAirlineFlight");
  private final static QName _GSTBreakDownInfoTaxCurrencyCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "TaxCurrencyCode");
  private final static QName _GSTBreakDownInfoTaxCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "TaxCode");
  private final static QName _InsuranceReservationInfoInsuranceReservation_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "insuranceReservation");
  private final static QName _InsuranceReservationInfoInsuranceReservationDetails_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "insuranceReservationDetails");
  private final static QName _BookingChargesInfoChildSurcharge_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ChildSurcharge");
  private final static QName _BookingChargesInfoInfantSurcharge_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "InfantSurcharge");
  private final static QName _BookingChargesInfoAdultSurcharge_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "AdultSurcharge");
  private final static QName _UnCombinedFareBasisCombineFareBasisCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "CombineFareBasisCode");
  private final static QName _UnCombinedFareBasisPrimeFareBasisCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "PrimeFareBasisCode");
  private final static QName _UnCombinedFareBasisCombinationalFareGroups_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "CombinationalFareGroups");
  private final static QName _DisClosureAirlineCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Code");
  private final static QName _DisClosureAirlineText_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "text");
  private final static QName _DisClosureAirlineAirlineCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "AirlineCode");
  private final static QName _DisClosureAirlineCompanyShortName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "CompanyShortName");
  private final static QName _SpecialServiceCommercialCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "CommercialCode");
  private final static QName _SpecialServiceCommercialName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "CommercialName");
  private final static QName _BaggagesCabinClassCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "CabinClassCode");
  private final static QName _BaggagesCabinClassName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "CabinClassName");
  private final static QName _RouteFreeBaggageAllowanceArrCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ArrCity");
  private final static QName _RouteFreeBaggageAllowanceFBA_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FBA");
  private final static QName _RouteFreeBaggageAllowanceDepCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DepCity");
  private final static QName _ResultMsgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Msgs");
  private final static QName _ResultData_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Data");
  private final static QName _APIBaggageInfoPriceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "PriceInfo");
  private final static QName _APISearchCriteriaParamsArrivalCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrivalCity");
  private final static QName _FlightAddOnBookingStatusFailedReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "FailedReason");
  private final static QName _InsuranceGSTInfoInsuranceGSTTaxCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "InsuranceGSTTaxCode");
  private final static QName _InsuranceGSTInfoDispTotalTaxAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispTotalTaxAmount");
  private final static QName _InsuranceGSTInfoTaxDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "TaxDescription");
  private final static QName _InsuranceReservationENQuoteId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "QuoteId");
  private final static QName _InsuranceReservationENRFICSubCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "RFICSubCode");
  private final static QName _InsuranceReservationENDestination_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "Destination");
  private final static QName _InsuranceReservationENServiceRequestInformation_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ServiceRequestInformation");
  private final static QName _InsuranceReservationENBaseCurrencyCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "BaseCurrencyCode");
  private final static QName _InsuranceReservationENEMDNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "EMDNumber");
  private final static QName _InsuranceReservationENInsuranceAddonStatus_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "InsuranceAddonStatus");
  private final static QName _InsuranceReservationENPolicyName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PolicyName");
  private final static QName _InsuranceReservationENCurrencyCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "CurrencyCode");
  private final static QName _InsuranceReservationENOfferId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "OfferId");
  private final static QName _InsuranceReservationENPolicyPurchasecode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PolicyPurchasecode");
  private final static QName _InsuranceReservationENPolicyCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PolicyCode");
  private final static QName _FlightManagementResponseENDividedPNR_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "DividedPNR");
  private final static QName _FlightManagementResponseENTrackingNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "TrackingNo");
  private final static QName _FlightManagementResponseENTransactionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "TransactionType");
  private final static QName _FlightManagementResponseENDispAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "DispAmount");
  private final static QName _FlightManagementResponseENPaymentCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PaymentCurrency");
  private final static QName _FlightManagementResponseENTransactionDirection_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "TransactionDirection");
  private final static QName _FlightManagementResponseENErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ErrorMessage");
  private final static QName _FlightManagementResponseENRequestType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "RequestType");
  private final static QName _FlightManagementResponseENTransactionRequested_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "TransactionRequested");
  private final static QName _FlightManagementResponseENPNRNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PNRNo");
  private final static QName _FlightManagementResponseENBaseCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "BaseCurrency");
  private final static QName _FlightManagementResponseENCMId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "CMId");
  private final static QName _AirlineMealSelectionENCommercialName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "CommercialName");
  private final static QName _AirlineMealSelectionENDisMealsName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "DisMealsName");
  private final static QName _AirlineMealSelectionENSellingCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SellingCurrency");
  private final static QName _AirlineMealSelectionENStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Status");
  private final static QName _AirlineMealSelectionENMealName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "MealName");
  private final static QName _AirlineMealSelectionENApplicablePaxType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ApplicablePaxType");
  private final static QName _AirlineMealSelectionENTaxes_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Taxes");
  private final static QName _AirlineMealSelectionENFGCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "FGCode");
  private final static QName _AirlineMealSelectionENAirlineCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "AirlineCode");
  private final static QName _AirlineMealSelectionENReqFGCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ReqFGCode");
  private final static QName _AirlineMealSelectionENMealDesc_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "MealDesc");
  private final static QName _AirlineMealSelectionENSectorTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SectorTo");
  private final static QName _AirlineMealSelectionENAirCraft_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "AirCraft");
  private final static QName _AirlineMealSelectionENSelPaxID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SelPaxID");
  private final static QName _AirlineMealSelectionENImagePath_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ImagePath");
  private final static QName _AirlineMealSelectionENSectorFrom_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SectorFrom");
  private final static QName _AirlineMealSelectionENRegion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Region");
  private final static QName _AirlineMealSelectionENApplicableToClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ApplicableToClass");
  private final static QName _FlightSearchCriteriaRemark_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Remark");
  private final static QName _FlightSearchCriteriaPreferredCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "PreferredCurrency");
  private final static QName _FlightSearchCriteriaPromotionalCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "PromotionalCode");
  private final static QName _FlightSearchCriteriaBookingClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "BookingClass");
  private final static QName _FlightSearchCriteriaDepartureCityName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DepartureCityName");
  private final static QName _FlightSearchCriteriaChildAge_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ChildAge");
  private final static QName _FlightSearchCriteriaPromotionCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "PromotionCode");
  private final static QName _FlightSearchCriteriaUTMCampaign_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "UTM_Campaign");
  private final static QName _FlightSearchCriteriaArrivalCityName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrivalCityName");
  private final static QName _FlightSearchCriteriaFSearchID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FSearchID");
  private final static QName _FlightSearchCriteriaLoyaltySearchInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "LoyaltySearchInfo");
  private final static QName _FlightSearchCriteriaSessionID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "SessionID");
  private final static QName _FlightSearchCriteriaAllowClassesOnly_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "AllowClassesOnly");
  private final static QName _FlightSearchCriteriaLanguageCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "LanguageCode");
  private final static QName _FlightSearchCriteriaSegmentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SegmentType");
  private final static QName _PerPaxPriceInfoPerPaxTaxBreakDown_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "PerPaxTaxBreakDown");
  private final static QName _PerPaxPriceInfoSpecialFareType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SpecialFareType");
  private final static QName _PerPaxPriceInfoDispPromotionPerPax_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispPromotionPerPax");
  private final static QName _PerPaxPriceInfoDispMLTotalPricePerPax_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispMLTotalPricePerPax");
  private final static QName _PerPaxPriceInfoDispTotalPricePerPax_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispTotalPricePerPax");
  private final static QName _PerPaxPriceInfoDispPricePerPax_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispPricePerPax");
  private final static QName _PerPaxPriceInfoDispTaxPerPax_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "dispTaxPerPax");
  private final static QName _AirlineMLAvailChildPriceInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ChildPriceInformation");
  private final static QName _AirlineMLAvailInfantPriceInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "InfantPriceInformation");
  private final static QName _AirlineMLAvailDispFlightAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispFlightAmount");
  private final static QName _AirlineMLAvailAdultPriceInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "AdultPriceInformation");
  private final static QName _AirlineMLAvailCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Currency");
  private final static QName _AirlineMLAvailSpecialPaxPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SpecialPaxPrice");
  private final static QName _AirlineMLAvailAvailMLFlights_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "AvailMLFlights");
  private final static QName _MultilegFlightReservationFlightReservation_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "FlightReservation");
  private final static QName _MultilegFlightReservationFlightReservationSegments_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "FlightReservationSegments");
  private final static QName _APIInsuranceAvailabilityName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Name");
  private final static QName _APIInsuranceAvailabilityURLs_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "URLs");
  private final static QName _APISeatInfoRowNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "RowNo");
  private final static QName _APISeatInfoColumnNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ColumnNo");
  private final static QName _ReservationsCardTransactionsENBankName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "BankName");
  private final static QName _ReservationsCardTransactionsENMandiriToken_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "MandiriToken");
  private final static QName _ReservationsCardTransactionsENMandiriDebitcardNo_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "MandiriDebitcardNo");
  private final static QName _ReservationsCardTransactionsENApprovalCode_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ApprovalCode");
  private final static QName _ReservationsCardTransactionsENPaymentFailureReason_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PaymentFailureReason");
  private final static QName _ReservationsCardTransactionsENTransactionID_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "TransactionID");
  private final static QName _ReservationsCardTransactionsENProcessorName_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ProcessorName");
  private final static QName _APISelectedSeatSeatNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "SeatNo");
  private final static QName _APIAddonAvailabilityResSeats_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Seats");
  private final static QName _APIAddonAvailabilityResMeals_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Meals");
  private final static QName _APIAddonAvailabilityResLounge_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Lounge");
  private final static QName _APIAddonAvailabilityResInsurance_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Insurance");
  private final static QName _MarkupFlightENCalcMarkupBy_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "CalcMarkupBy");
  private final static QName _MarkupFlightENFareType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "FareType");
  private final static QName _MarkupFlightENMarkupCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "MarkupCode");
  private final static QName _MarkupFlightENFlightJourneyType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "FlightJourneyType");
  private final static QName _MarkupFlightENMarkupName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "MarkupName");
  private final static QName _MarkupFlightENBookingClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "BookingClass");
  private final static QName _MarkupFlightENDepCities_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "DepCities");
  private final static QName _MarkupFlightENPrefix_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Prefix");
  private final static QName _MarkupFlightENArrCities_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ArrCities");
  private final static QName _MarkupFlightENAppliesToDays_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "AppliesToDays");
  private final static QName _MarkupFlightENAirlines_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Airlines");
  private final static QName _MarkupFlightENMarkupType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "MarkupType");
  private final static QName _MessageCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Code");
  private final static QName _MessageMessageText_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "MessageText");
  private final static QName _LoungeReservationENRFICCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "RFICCode");
  private final static QName _LoungeReservationENArrCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ArrCity");
  private final static QName _LoungeReservationENGroupCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "GroupCode");
  private final static QName _LoungeReservationENSSRCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "SSRCode");
  private final static QName _LoungeReservationENCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Currency");
  private final static QName _LoungeReservationENRFICSubcode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "RFICSubcode");
  private final static QName _LoungeReservationENDepCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "DepCity");
  private final static QName _LoungeReservationENVoucherNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "VoucherNo");
  private final static QName _LoungeReservationENEMDBookingType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "EMDBookingType");
  private final static QName _LoungeReservationENCommercialCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "CommercialCode");
  private final static QName _LoungeReservationENLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "LastName");
  private final static QName _FlightSegmentTotalDuration_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "TotalDuration");
  private final static QName _FlightSegmentDefaultSelected_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DefaultSelected");
  private final static QName _FlightSegmentIndex_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Index");
  private final static QName _FlightSegmentSegments_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Segments");
  private final static QName _StrikeoutInfoPriceStrikeoutSetting_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "PriceStrikeoutSetting");
  private final static QName _FlightReservationSegmentsENSegmentStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SegmentStatus");
  private final static QName _FlightReservationSegmentsENSplPaxFreeBaggage_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "SplPaxFreeBaggage");
  private final static QName _FlightReservationSegmentsENFlightNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "FlightNo");
  private final static QName _FlightReservationSegmentsENStartCityName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "StartCityName");
  private final static QName _FlightReservationSegmentsENCMFareBasis_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "CMFareBasis");
  private final static QName _FlightReservationSegmentsENSpecialPaxFareBasisCode_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "SpecialPaxFareBasisCode");
  private final static QName _FlightReservationSegmentsENEndCityCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "EndCityCode");
  private final static QName _FlightReservationSegmentsENFareID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "FareID");
  private final static QName _FlightReservationSegmentsENGateway_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "Gateway");
  private final static QName _FlightReservationSegmentsENFlightFareBasisCode_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "FlightFareBasisCode");
  private final static QName _FlightReservationSegmentsENChildFareBasisCode_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ChildFareBasisCode");
  private final static QName _FlightReservationSegmentsENMeals_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "Meals");
  private final static QName _FlightReservationSegmentsENStartCityCountryCode_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "StartCityCountryCode");
  private final static QName _FlightReservationSegmentsENGuestName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "GuestName");
  private final static QName _FlightReservationSegmentsENCodeSharePNR_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "CodeSharePNR");
  private final static QName _FlightReservationSegmentsENMktairlineCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "MktairlineCode");
  private final static QName _FlightReservationSegmentsENEndCityCountryCode_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "EndCityCountryCode");
  private final static QName _FlightReservationSegmentsENStartCityForInsAPI_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "StartCityForInsAPI");
  private final static QName _FlightReservationSegmentsENIBDepCityCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "IBDepCityCode");
  private final static QName _FlightReservationSegmentsENEndCityForInsAPI_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "EndCityForInsAPI");
  private final static QName _FlightReservationSegmentsENIBArrCityCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "IBArrCityCode");
  private final static QName _FlightReservationSegmentsENOprAirlineCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "OprAirlineCode");
  private final static QName _FlightReservationSegmentsENFlightSegmentRef_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "FlightSegmentRef");
  private final static QName _FlightReservationSegmentsENDispArrDateTime_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "dispArrDateTime");
  private final static QName _FlightReservationSegmentsENDispTicketingDeadLine_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "dispTicketingDeadLine");
  private final static QName _FlightReservationSegmentsENInfantFareBasisCode_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "InfantFareBasisCode");
  private final static QName _FlightReservationSegmentsENSeats_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "Seats");
  private final static QName _FlightReservationSegmentsENFareBasis_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "FareBasis");
  private final static QName _FlightReservationSegmentsENDispDepDateTime_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "dispDepDateTime");
  private final static QName _FlightReservationSegmentsENStartCityCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "StartCityCode");
  private final static QName _FlightReservationSegmentsENATMPaymentCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ATMPaymentCode");
  private final static QName _FlightReservationSegmentsENEndCityCountryName_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "EndCityCountryName");
  private final static QName _FlightReservationSegmentsENMktairlineName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "MktairlineName");
  private final static QName _FlightReservationSegmentsENAircraft_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "Aircraft");
  private final static QName _FlightReservationSegmentsENOprAirlineName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "OprAirlineName");
  private final static QName _FlightReservationSegmentsENEndCityName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "EndCityName");
  private final static QName _FlightReservationSegmentsENStartCityCountryName_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "StartCityCountryName");
  private final static QName _AirlineMLPriceDispTaxAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "dispTaxAmount");
  private final static QName _AirlineMLPriceDispPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "dispPrice");
  private final static QName _AirlineMLPriceDispPkgAmountWithPromotion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispPkgAmountWithPromotion");
  private final static QName _AirlineMLPriceBaseFareRoundingText_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "BaseFareRoundingText");
  private final static QName _AirlineMLPricePerSegPaxPriceDiff_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "PerSegPaxPriceDiff");
  private final static QName _AirlineMLPriceDispPkgAmt_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "dispPkgAmt");
  private final static QName _AirlineMLPriceDispPriceDiff_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "dispPriceDiff");
  private final static QName _AirlineMLPriceDispPromotionTotalAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispPromotionTotalAmount");
  private final static QName _AirlineMLPriceDispTotalAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispTotalAmount");
  private final static QName _AirlineMLPriceDisplayCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DisplayCurrency");
  private final static QName _AirlineMLPriceDispTotalMarkup_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispTotalMarkup");
  private final static QName _APIRoutesEnDepCountryName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "DepCountryName");
  private final static QName _APIRoutesEnArrCountryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrCountryCode");
  private final static QName _APIRoutesEnDepCountryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "DepCountryCode");
  private final static QName _APIRoutesEnDepCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "DepCode");
  private final static QName _APIRoutesEnDepAirportName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "DepAirportName");
  private final static QName _APIRoutesEnArrAirportName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrAirportName");
  private final static QName _APIRoutesEnArrCountryName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrCountryName");
  private final static QName _APIRoutesEnArrCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ArrCode");
  private final static QName _BookingSpecialServicesSpecialServiceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SpecialServiceType");
  private final static QName _BookingSpecialServicesSpecialServices_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SpecialServices");
  private final static QName _FlightReservationInfoFlightReservation_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "flightReservation");
  private final static QName _FlightReservationInfoFlightPriceBreakDown_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "FlightPriceBreakDown");
  private final static QName _FlightReservationInfoFlightReservationSegments_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "flightReservationSegments");
  private final static QName _FlightReservationInfoPromoCodes_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PromoCodes");
  private final static QName _FlightReservationInfoETicket_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "eTicket");
  private final static QName _FlightReservationInfoManagementResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ManagementResponse");
  private final static QName _FlightReservationInfoFarerules_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "farerules");
  private final static QName _MultiFlightSearchReponseAvailableFlights_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "AvailableFlights");
  private final static QName _MultiFlightSearchReponseErrorDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ErrorDetails");
  private final static QName _SegmentFareInfoENFareBasisCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "FareBasisCode");
  private final static QName _SegmentFareInfoENPaxType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PaxType");
  private final static QName _IntermediatePointLocationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "LocationName");
  private final static QName _IntermediatePointVia_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Via");
  private final static QName _IntermediatePointDispArrivalDateTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DispArrivalDateTime");
  private final static QName _IntermediatePointDuration_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Duration");
  private final static QName _IntermediatePointElapsedTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ElapsedTime");
  private final static QName _IntermediatePointLocationCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "LocationCode");
  private final static QName _IntermediatePointAirportName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "AirportName");
  private final static QName _IntermediatePointDepartureTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DepartureTime");
  private final static QName _IntermediatePointArrivalTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ArrivalTime");
  private final static QName _IntermediatePointIntermediatePointTimeZone_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "IntermediatePointTimeZone");
  private final static QName _IntermediatePointArrivalDateTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrivalDateTime");
  private final static QName _IntermediatePointDepartureDateTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DepartureDateTime");
  private final static QName _IntermediatePointDispDepartureDateTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DispDepartureDateTime");
  private final static QName _APICancelBookingRequestUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "UserName");
  private final static QName _APICancelBookingRequestPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "Password");
  private final static QName _PaxLoginsENPassengers_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Passengers");
  private final static QName _PaxLoginsENUniqueID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "UniqueID");
  private final static QName _PaxLoginsENPassengerDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PassengerDetails");
  private final static QName _PaxLoginsENRegID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "RegID");
  private final static QName _PaxLoginsENProfile_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Profile");
  private final static QName _PaxLoginsENConsentInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ConsentInfo");
  private final static QName _PaxLoginsENNetzSkyMD5ProfileId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "NetzSkyMD5ProfileId");
  private final static QName _PackageSummaryTargetCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "TargetCurrency");
  private final static QName _PackageSummarySummaryErrorMsg_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SummaryErrorMsg");
  private final static QName _PackageSummaryDispTotal_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DispTotal");
  private final static QName _PackageSummaryPaymentCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "PaymentCurrency");
  private final static QName _PackageSummaryDispTotalRedeem_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DispTotalRedeem");
  private final static QName _PackageSummarySPSummary_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "SPSummary");
  private final static QName _PackageSummaryPromoID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "PromoID");
  private final static QName _PackageSummaryPaymentCurrencyDesc_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "PaymentCurrencyDesc");
  private final static QName _PackageSummaryPaymentCurrencyDispTotal_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "PaymentCurrencyDispTotal");
  private final static QName _PackageSummaryDispNetAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DispNetAmount");
  private final static QName _PackageSummaryRemarks_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Remarks");
  private final static QName _PackageSummarySummaryErrorMsgText_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SummaryErrorMsgText");
  private final static QName _PackageSummaryDispTaxnFees_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DispTaxnFees");
  private final static QName _PackageSummaryDispRedeemInUse_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DispRedeemInUse");
  private final static QName _PackageSummaryDispAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DispAmount");
  private final static QName _PackageSummarySourceCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SourceCurrency");
  private final static QName _PackageSummaryPromoStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "PromoStatus");
  private final static QName _PackageSummarySMSSettingsInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SMSSettingsInfo");
  private final static QName _PackageSummaryDispRedeemAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DispRedeemAmount");
  private final static QName _PackageSummaryPaymentCurrencyDispTaxnFees_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "PaymentCurrencyDispTaxnFees");
  private final static QName _PackageSummaryDispCurrencySymbol_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DispCurrencySymbol");
  private final static QName _MarkupGroupsENGroupName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "GroupName");
  private final static QName _APIMealSegmentArrAirCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ArrAirCode");
  private final static QName _APIMealSegmentDepAirCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DepAirCode");
  private final static QName _BookingPriceBreakDownENBreakupType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "BreakupType");
  private final static QName _BookingPriceBreakDownENPaxPriceBreakup_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PaxPriceBreakup");
  private final static QName _BookingPriceBreakDownENBreakupCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "BreakupCurrency");
  private final static QName _CustomerUserCardTypesENImageFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ImageFileName");
  private final static QName _CustomerUserCardTypesENMarkupApplicableCurrency_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "MarkupApplicableCurrency");
  private final static QName _CustomerUserCardTypesENSupportedCurrencies_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "SupportedCurrencies");
  private final static QName _CustomerUserCardTypesENMarkupCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "MarkupCurrency");
  private final static QName _APIBookingSpecialServicesError_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Error");
  private final static QName _APIBaggageAvailabilityAvailableBaggages_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "AvailableBaggages");
  private final static QName _MultiSetSelectedReponseSelectedMLFlights_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SelectedMLFlights");
  private final static QName _FlightTerminalInfoTerminalName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "TerminalName");
  private final static QName _FlightTerminalInfoTerminalCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "TerminalCode");
  private final static QName _APIAddonPriceInfoDescriptionText_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DescriptionText");
  private final static QName _APIAddonPriceInfoDispAdultPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DispAdultPrice");
  private final static QName _APIAddonPriceInfoChildCommercialName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ChildCommercialName");
  private final static QName _APIAddonPriceInfoDispChildPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DispChildPrice");
  private final static QName _APIAddonPriceInfoAdultCommercialName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "AdultCommercialName");
  private final static QName _APIAddonPriceInfoDispPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DispPrice");
  private final static QName _APIAddonPriceInfoAirportCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "AirportCode");
  private final static QName _APIAddonPriceInfoDispTax_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DispTax");
  private final static QName _APIAddonPriceInfoDispTotalPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DispTotalPrice");
  private final static QName _APISeatAvailabilityAvailableSeats_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "AvailableSeats");
  private final static QName _APIPaxSelectedAddOnSelectedMeals_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SelectedMeals");
  private final static QName _APIPaxSelectedAddOnSelectedLounges_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SelectedLounges");
  private final static QName _APIPaxSelectedAddOnSelectedBaggages_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SelectedBaggages");
  private final static QName _APIPaxSelectedAddOnSelectedSeats_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SelectedSeats");
  private final static QName _B2BCompanyDetailsCurrecny_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Currecny");
  private final static QName _B2BCompanyDetailsErrorDesc_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ErrorDesc");
  private final static QName _PassengerDetailsENTelephone_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Telephone");
  private final static QName _PassengerDetailsENCountryName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "CountryName");
  private final static QName _PassengerDetailsENEmergContactSurName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "EmergContact_SurName");
  private final static QName _PassengerDetailsENEmergContactFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "EmergContact_FirstName");
  private final static QName _PassengerDetailsENCounty_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "County");
  private final static QName _PassengerDetailsENBusinessContactNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "BusinessContactNo");
  private final static QName _PassengerDetailsENWorkContactNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "WorkContactNo");
  private final static QName _PassengerDetailsENEmergContactTitle_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "EmergContact_Title");
  private final static QName _PassengerDetailsENEmergContactRelationship_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "EmergContact_Relationship");
  private final static QName _PassengerDetailsENGSTCompanyDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "GSTCompanyDetails");
  private final static QName _PassengerDetailsENPostcode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Postcode");
  private final static QName _PassengerDetailsENAddress2_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Address2");
  private final static QName _PassengerDetailsENAddress3_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Address3");
  private final static QName _PassengerDetailsENAddress1_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Address1");
  private final static QName _PassengerDetailsENCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "City");
  private final static QName _PassengerDetailsENPreferredAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PreferredAddress");
  private final static QName _PassengerDetailsENState_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "State");
  private final static QName _PassengerDetailsENFax_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Fax");
  private final static QName _PassengerDetailsENEmergContactAreaCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "EmergContact_AreaCode");
  private final static QName _PassengerDetailsENEmergContactTelephone_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "EmergContact_Telephone");
  private final static QName _PaymentMethodsENName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Name");
  private final static QName _AirlineMLPaxPriceDispPerPaxTotal_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispPerPaxTotal");
  private final static QName _AirlineMLPaxPriceDispPerPaxPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispPerPaxPrice");
  private final static QName _AirlineMLPaxPriceDispPerPaxTax_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispPerPaxTax");
  private final static QName _PriceInformationChildPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ChildPrice");
  private final static QName _PriceInformationDispInsuranceAmt_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DispInsuranceAmt");
  private final static QName _PriceInformationDispStrikeoutFarePrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispStrikeoutFarePrice");
  private final static QName _PriceInformationDispGSTTotalTax_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispGSTTotalTax");
  private final static QName _PriceInformationDispTotalPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispTotalPrice");
  private final static QName _PriceInformationDispTotalWithInsurance_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DispTotalWithInsurance");
  private final static QName _PriceInformationDispTotalTaxwithoutGST_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispTotalTaxwithoutGST");
  private final static QName _PriceInformationSpecialPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "SpecialPrice");
  private final static QName _PriceInformationDispStrikeoutTotalPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispStrikeoutTotalPrice");
  private final static QName _PriceInformationDispGSTTax_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "dispGSTTax");
  private final static QName _PriceInformationDispBaseFareDiff_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispBaseFareDiff");
  private final static QName _PriceInformationInsuranceName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "InsuranceName");
  private final static QName _PriceInformationInfantPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "InfantPrice");
  private final static QName _PriceInformationDispTotalTax_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "dispTotalTax");
  private final static QName _PriceInformationPkgDispAmt_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "PkgDispAmt");
  private final static QName _PriceInformationLoyaltyPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "LoyaltyPrice");
  private final static QName _PriceInformationAdultPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "AdultPrice");
  private final static QName _PriceInformationDispPriceText_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispPriceText");
  private final static QName _PriceInformationDispBaseFarePrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "dispBaseFarePrice");
  private final static QName _FreeBaggageAllowanceDIS_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DIS");
  private final static QName _FreeBaggageAllowanceIC_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "IC");
  private final static QName _FreeBaggageAllowanceI_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "I");
  private final static QName _FreeBaggageAllowanceSRC_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "SRC");
  private final static QName _FreeBaggageAllowanceSTU_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "STU");
  private final static QName _FreeBaggageAllowanceGVT_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "GVT");
  private final static QName _FreeBaggageAllowanceC_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "C");
  private final static QName _FreeBaggageAllowanceAC_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "AC");
  private final static QName _FreeBaggageAllowanceA_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "A");
  private final static QName _FreeBaggageAllowanceADD_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ADD");
  private final static QName _FreeBaggageAllowanceCC_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "CC");
  private final static QName _SpecialPriceSummaryDispPerPaxPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DispPerPaxPrice");
  private final static QName _ProfileENPassportIssuedPlace_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PassportIssuedPlace");
  private final static QName _ProfileENLastUpdateBy_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "LastUpdateBy");
  private final static QName _ProfileENCardStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "CardStatus");
  private final static QName _ProfileENInterests_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Interests");
  private final static QName _ProfileENUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Url");
  private final static QName _ProfileENMealPref_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "MealPref");
  private final static QName _ProfileENIDPath1_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "IDPath1");
  private final static QName _ProfileENExistingUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ExistingUserName");
  private final static QName _ProfileENIDPath2_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "IDPath2");
  private final static QName _ProfileENCompanyName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "CompanyName");
  private final static QName _ProfileENProfileTitle_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ProfileTitle");
  private final static QName _ProfileENCountryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "CountryCode");
  private final static QName _ProfileENMemberTier_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "MemberTier");
  private final static QName _ProfileENMailingAddress3_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "MailingAddress3");
  private final static QName _ProfileENPreferredLanguage_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PreferredLanguage");
  private final static QName _ProfileENDocNationality_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "DocNationality");
  private final static QName _ProfileENMailingAddress1_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "MailingAddress1");
  private final static QName _ProfileENMailingAddress2_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "MailingAddress2");
  private final static QName _ProfileENDefaultCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "DefaultCurrency");
  private final static QName _ProfileENSecondaryEmailID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SecondaryEmailID");
  private final static QName _ProfileENDocumentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "DocumentType");
  private final static QName _ProfileENSeatingPref_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "SeatingPref");
  private final static QName _ProfileENFreqFlyerNum_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "FreqFlyerNum");
  private final static QName _ProfileENHomePhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "HomePhone");
  private final static QName _ProfileENIDCardNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "IDCardNumber");
  private final static QName _ProfileENIDCardCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "IDCardCountry");
  private final static QName _ProfileENMemberStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "MemberStatus");
  private final static QName _ProfileENNextExpireMiles_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "NextExpireMiles");
  private final static QName _ProfileENPostCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PostCode");
  private final static QName _ProfileENEmailVerificationCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "EmailVerificationCode");
  private final static QName _ProfileENCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Country");
  private final static QName _ProfileENSeatPreference_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SeatPreference");
  private final static QName _ProfileENBusinessPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "BusinessPhone");
  private final static QName _FreeBaggageAllowanceENRoute_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Route");
  private final static QName _FreeBaggageAllowanceENAllowance_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Allowance");
  private final static QName _FreeBaggageAllowanceENArrCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ArrCode");
  private final static QName _FreeBaggageAllowanceENAllowanceValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "AllowanceValue");
  private final static QName _FreeBaggageAllowanceENDepCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DepCode");
  private final static QName _FreeBaggageAllowanceENDepDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DepDate");
  private final static QName _FreeBaggageAllowanceENAirline_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Airline");
  private final static QName _FreeBaggageAllowanceENRetDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "RetDate");
  private final static QName _ReservationsENPlatform_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Platform");
  private final static QName _ReservationsENPromoCount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PromoCount");
  private final static QName _ReservationsENB2BUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "B2BUser");
  private final static QName _ReservationsENPNRNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PNRNumber");
  private final static QName _ReservationsENPassengerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PassengerName");
  private final static QName _ReservationsENPromoID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PromoID");
  private final static QName _ReservationsENPromoAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PromoAmount");
  private final static QName _ReservationsENParentReservationID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ParentReservationID");
  private final static QName _ReservationsENAirlineOBPNR_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "AirlineOBPNR");
  private final static QName _ReservationsENFlightHostPNR_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "FlightHostPNR");
  private final static QName _ReservationsENRemarks_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Remarks");
  private final static QName _ReservationsENVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Version");
  private final static QName _ReservationsENBookingEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "BookingEmail");
  private final static QName _ReservationsENHotelSupplier_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "HotelSupplier");
  private final static QName _ReservationsENCancellationDeadline_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "CancellationDeadline");
  private final static QName _ReservationsENSearchLanguageCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SearchLanguageCode");
  private final static QName _ReservationsENReservationFrom_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ReservationFrom");
  private final static QName _ReservationsENPaymentStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PaymentStatus");
  private final static QName _ReservationsENAccountCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "AccountCode");
  private final static QName _ReservationsENPukalNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PukalNo");
  private final static QName _ReservationsENInternalReferenceNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "InternalReferenceNo");
  private final static QName _ReservationsENHotelName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "HotelName");
  private final static QName _ReservationsENConnectionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ConnectionType");
  private final static QName _ReservationsENHoldBookingRefId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "HoldBookingRefId");
  private final static QName _ReservationsENPaymentRefId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PaymentRefId");
  private final static QName _ReservationsENPromoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PromoName");
  private final static QName _ReservationsENDeviceModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "DeviceModel");
  private final static QName _ReservationsENSourceCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SourceCurrency");
  private final static QName _ReservationsENModifiedby_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Modifiedby");
  private final static QName _ReservationsENArrivalCities_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrivalCities");
  private final static QName _ReservationsENAcquirerBank_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "Acquirer_Bank");
  private final static QName _ReservationsENB2BCompany_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "B2BCompany");
  private final static QName _ReservationsENAirlineIBPNR_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "AirlineIBPNR");
  private final static QName _ReservationsENCancelledDateTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "CancelledDateTime");
  private final static QName _ReservationsENCancellationDateTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "CancellationDateTo");
  private final static QName _ReservationsENCheckOutDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "CheckOutDate");
  private final static QName _ReservationsENMailName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "MailName");
  private final static QName _ReservationsENPurchaseOrderId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PurchaseOrderId");
  private final static QName _ReservationsENCheckInDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "CheckInDate");
  private final static QName _ReservationsENSaveErrorCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SaveErrorCode");
  private final static QName _ReservationsENPaymentMethodName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PaymentMethodName");
  private final static QName _ReservationsENTargetCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "TargetCurrency");
  private final static QName _ReservationsENVATReceiptOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "VATReceiptOption");
  private final static QName _ReservationsENStationCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "StationCode");
  private final static QName _ReservationsENExCurrProvider_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ExCurrProvider");
  private final static QName _ReservationsENSupplierBookingID2_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SupplierBookingID2");
  private final static QName _ReservationsENSupplierBookingID1_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SupplierBookingID1");
  private final static QName _ReservationsENAppVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "AppVersion");
  private final static QName _ReservationsENCardNoPartial_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "Card_No_Partial");
  private final static QName _ReservationsENDiscountCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "DiscountCurrency");
  private final static QName _ReservationsENBCCBookingEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "BCCBookingEmail");
  private final static QName _ReservationsENNotes_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Notes");
  private final static QName _ReservationsENWarrentSerialNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "WarrentSerialNo");
  private final static QName _ReservationsENResJourneyType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ResJourneyType");
  private final static QName _ReservationsENCancellationDateFrom_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "CancellationDateFrom");
  private final static QName _ReservationsENReservationTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ReservationTo");
  private final static QName _ReservationsENRoundingText_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "RoundingText");
  private final static QName _ReservationsENReservationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ReservationType");
  private final static QName _ReservationsENMasterReservationID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "MasterReservationID");
  private final static QName _ReservationsENMcoNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "McoNo");
  private final static QName _ReservationsENValidity_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Validity");
  private final static QName _ReservationsENIPAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "IPAddress");
  private final static QName _ReservationPromoCodesENReservationId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ReservationId");
  private final static QName _ReservationPromoCodesENDealManagerPromoCode_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "DealManagerPromoCode");
  private final static QName _ReservationPromoCodesENSpecialPaxPromoCode_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "SpecialPaxPromoCode");
  private final static QName _ReservationPromoCodesENServicePromoCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ServicePromoCode");
  private final static QName _BaggageReservationENBaggageCommercialName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "BaggageCommercialName");
  private final static QName _BaggageReservationENFlightCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "FlightCode");
  private final static QName _BaggageReservationENBaggageCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "BaggageCode");
  private final static QName _BaggageReservationENEMDErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "EMDErrorMessage");
  private final static QName _BaggageReservationENClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Class");
  private final static QName _PriceStrikeoutSettingsENJourneyType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "JourneyType");
  private final static QName _PriceStrikeoutSettingsENRoutesRegion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "RoutesRegion");
  private final static QName _PriceStrikeoutSettingsENApplicableCurrency_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ApplicableCurrency");
  private final static QName _PriceStrikeoutSettingsENRoutes_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Routes");
  private final static QName _PriceStrikeoutSettingsENApplyToAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ApplyToAmount");
  private final static QName _PriceStrikeoutSettingsENBookingChannel_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "BookingChannel");
  private final static QName _PriceStrikeoutSettingsENExcludeRoutes_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ExcludeRoutes");
  private final static QName _PriceStrikeoutSettingsENDepartureDays_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "DepartureDays");
  private final static QName _PriceStrikeoutSettingsENPromotionName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PromotionName");
  private final static QName _PriceStrikeoutSettingsENReturnDays_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ReturnDays");
  private final static QName _FlightReservationEticketENTrackingNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "TrackingNumber");
  private final static QName _FlightReservationEticketENTicketNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "TicketNo");
  private final static QName _FlightReservationEticketENPaxName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PaxName");
  private final static QName _APILoungeSegmentLoungeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "LoungeInfo");
  private final static QName _FlightReservationENIATACode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "IATACode");
  private final static QName _FlightReservationENIncCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "IncCode");
  private final static QName _FlightReservationENDepCityCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "DepCityCode");
  private final static QName _FlightReservationENErrorDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ErrorDescription");
  private final static QName _FlightReservationENDiscCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "DiscCode");
  private final static QName _FlightReservationENSabreAgentCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SabreAgentCode");
  private final static QName _FlightReservationENArrCityCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ArrCityCode");
  private final static QName _FlightReservationENMarkupApplied_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "MarkupApplied");
  private final static QName _FlightReservationENAirlineLoc_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "AirlineLoc");
  private final static QName _FlightReservationENOfficeID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "OfficeID");
  private final static QName _FlightReservationENSourceSite_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SourceSite");
  private final static QName _FlightReservationENIPCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "IPCountry");
  private final static QName _FlightReservationENEticketNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "EticketNo");
  private final static QName _FlightReservationENServiceUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ServiceUrl");
  private final static QName _APILoungeAvailabilityAvailableLounge_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "AvailableLounge");
  private final static QName _ReservationDetailsBaggageReservations_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "baggageReservations");
  private final static QName _ReservationDetailsPassengerDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "passengerDetails");
  private final static QName _ReservationDetailsReservationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ReservationInfo");
  private final static QName _ReservationDetailsInsuranceReservationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "InsuranceReservationInfo");
  private final static QName _ReservationDetailsPassengers_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "passengers");
  private final static QName _ReservationDetailsSeatReservations_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "seatReservations");
  private final static QName _ReservationDetailsLoungeReservations_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "loungeReservations");
  private final static QName _ReservationDetailsMealReservations_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "mealReservations");
  private final static QName _ReservationDetailsFlightInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FlightInfo");
  private final static QName _SMSPriceENDispCost_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "dispCost");
  private final static QName _SMSPriceENSettingsCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SettingsCurrency");
  private final static QName _SMSPriceENApplicableToCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ApplicableToCountry");
  private final static QName _GDSFlightSegmentCMFareBasis_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "CMFareBasis");
  private final static QName _GDSFlightSegmentFlightNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FlightNo");
  private final static QName _GDSFlightSegmentArrTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ArrTime");
  private final static QName _GDSFlightSegmentTransTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "TransTime");
  private final static QName _GDSFlightSegmentArrAirPortCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrAirPortCountry");
  private final static QName _GDSFlightSegmentDispSegFBCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DispSegFBCode");
  private final static QName _GDSFlightSegmentDispDepDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DispDepDate");
  private final static QName _GDSFlightSegmentAdultFreeBaggageForDisplay_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "AdultFreeBaggageForDisplay");
  private final static QName _GDSFlightSegmentTravelTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "TravelTime");
  private final static QName _GDSFlightSegmentDepAirPort_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DepAirPort");
  private final static QName _GDSFlightSegmentFlightSegmentRef_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "FlightSegmentRef");
  private final static QName _GDSFlightSegmentArrDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ArrDate");
  private final static QName _GDSFlightSegmentDepCityName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DepCityName");
  private final static QName _GDSFlightSegmentSegFBCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "SegFBCode");
  private final static QName _GDSFlightSegmentProviderID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ProviderID");
  private final static QName _GDSFlightSegmentFBCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FBCode");
  private final static QName _GDSFlightSegmentOprAirlineName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "OprAirlineName");
  private final static QName _GDSFlightSegmentCabinClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "CabinClass");
  private final static QName _GDSFlightSegmentDepAirPortCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DepAirPortCountry");
  private final static QName _GDSFlightSegmentDepTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DepTime");
  private final static QName _GDSFlightSegmentJDurationHRS_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "JDurationHRS");
  private final static QName _GDSFlightSegmentDispArrDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DispArrDate");
  private final static QName _GDSFlightSegmentArrAirName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ArrAirName");
  private final static QName _GDSFlightSegmentJDurationText_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "JDurationText");
  private final static QName _GDSFlightSegmentAvailSeats_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "AvailSeats");
  private final static QName _GDSFlightSegmentAirCraft_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "AirCraft");
  private final static QName _GDSFlightSegmentParentCabinClassCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ParentCabinClassCode");
  private final static QName _GDSFlightSegmentInfantFreeBaggageForDisplay_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "InfantFreeBaggageForDisplay");
  private final static QName _GDSFlightSegmentTDuration_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "TDuration");
  private final static QName _GDSFlightSegmentArrAirPort_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ArrAirPort");
  private final static QName _GDSFlightSegmentActualCabinClassCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ActualCabinClassCode");
  private final static QName _GDSFlightSegmentJDuration_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "JDuration");
  private final static QName _GDSFlightSegmentMarAirLine_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "MarAirLine");
  private final static QName _GDSFlightSegmentOprAirline_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "OprAirline");
  private final static QName _GDSFlightSegmentDepAirName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DepAirName");
  private final static QName _GDSFlightSegmentDispCabinClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DispCabinClass");
  private final static QName _GDSFlightSegmentFreeBaggageForDisplay_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "FreeBaggageForDisplay");
  private final static QName _GDSFlightSegmentArrCityName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ArrCityName");
  private final static QName _GDSFlightSegmentIntermediatePoints_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "IntermediatePoints");
  private final static QName _GDSFlightSegmentArrivalTerminalInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrivalTerminalInfo");
  private final static QName _GDSFlightSegmentMLFGCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "MLFGCode");
  private final static QName _GDSFlightSegmentDispFBCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DispFBCode");
  private final static QName _GDSFlightSegmentChildFreeBaggageForDisplay_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ChildFreeBaggageForDisplay");
  private final static QName _GDSFlightSegmentMarAirLineName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "MarAirLineName");
  private final static QName _GDSFlightSegmentDepartureTerminalInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DepartureTerminalInfo");
  private final static QName _GDSFlightSegmentOtherPaxFreeBaggageForDisplay_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "OtherPaxFreeBaggageForDisplay");
  private final static QName _GDSFlightSegmentActualCabinClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ActualCabinClass");
  private final static QName _GDSFlightSegmentJDurationMin_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "JDurationMin");
  private final static QName _MobileAppLangTextENControlText_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ControlText");
  private final static QName _MobileAppLangTextENControlName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ControlName");
  private final static QName _MobileAppLangTextENLangCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "LangCode");
  private final static QName _PromotionCodesENPromotionCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PromotionCode");
  private final static QName _PromotionInfoPromotionSettings_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "PromotionSettings");
  private final static QName _APISelectedMealsMealCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "MealCode");
  private final static QName _TicketingResponseErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "ErrorMessage");
  private final static QName _TicketingResponseResultReservationDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ResultReservationDetails");
  private final static QName _FareGroupAirlineFlightFareGroupDesc_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "FareGroupDesc");
  private final static QName _FareGroupAirlineFlightFareGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FareGroup");
  private final static QName _FareGroupAirlineFlightFareGroupCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "FareGroupCode");
  private final static QName _FareGroupAirlineFlightDispFareGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DispFareGroup");
  private final static QName _PromotionSettingsENApplicableCardTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ApplicableCardTypes");
  private final static QName _PromotionSettingsENPromotionCodePrefix_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PromotionCodePrefix");
  private final static QName _PromotionSettingsENPromotionValidationName_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PromotionValidationName");
  private final static QName _PromotionSettingsENMDBookingClassAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "MDBookingClassAmount");
  private final static QName _PromotionSettingsENPromotionCodeList_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PromotionCodeList");
  private final static QName _PromotionSettingsENApplicablePaymentMethods_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ApplicablePaymentMethods");
  private final static QName _PromotionSettingsENSabreCommercialCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SabreCommercialCode");
  private final static QName _PromotionSettingsENBuyandGetCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "BuyandGetCategory");
  private final static QName _PromotionSettingsENPromotionCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PromotionCategory");
  private final static QName _PromotionSettingsENPromotionValidityType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PromotionValidityType");
  private final static QName _PromotionSettingsENMinBookingAmtCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "MinBookingAmtCurrency");
  private final static QName _PromotionSettingsENSabreCommercialName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SabreCommercialName");
  private final static QName _PromotionSettingsENSabreRemarks_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SabreRemarks");
  private final static QName _InstallmentPaymentSettingsENMinPurchaseAmt_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "MinPurchaseAmt");
  private final static QName _InstallmentPaymentSettingsENDisplayText_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "DisplayText");
  private final static QName _InstallmentPaymentSettingsENInterestType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "InterestType");
  private final static QName _APIMultiCitySearchCriteriaSearchCriteriaParams_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SearchCriteriaParams");
  private final static QName _GSTReservationENTaxCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "TaxCurrency");
  private final static QName _GSTReservationENGSTID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "GSTID");
  private final static QName _GSTReservationENBRNNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "BRNNumber");
  private final static QName _GSTReservationENGSTCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "GSTCountry");
  private final static QName _GSTReservationENInvoiceNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "InvoiceNo");
  private final static QName _GSTReservationENBookingCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "BookingCurrency");
  private final static QName _GSTReservationENDistrict_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "District");
  private final static QName _GetUpdatedBookingDetailsRequestPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "Password");
  private final static QName _GetUpdatedBookingDetailsRequestPNR_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "PNR");
  private final static QName _GetUpdatedBookingDetailsRequestUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "UserName");
  private final static QName _SGDInsurancePackageSummaryInsurancePackageSummary_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "InsurancePackageSummary");
  private final static QName _FareGroupFlightFGFlight_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FGFlight");
  private final static QName _FareGroupFlightDispMLFareGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DispMLFareGroup");
  private final static QName _FareGroupFlightParentGroupName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ParentGroupName");
  private final static QName _AirlineFlightDisplayCurrencyCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DisplayCurrencyCode");
  private final static QName _AirlineFlightMANameML_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "MANameML");
  private final static QName _AirlineFlightTotalDura_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "TotalDura");
  private final static QName _AirlineFlightFareGroupFlights_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "FareGroupFlights");
  private final static QName _AirlineFlightMinFlightClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "MinFlightClass");
  private final static QName _AirlineFlightCurrSymbol_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "CurrSymbol");
  private final static QName _AirlineFlightEconomyFlight_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "EconomyFlight");
  private final static QName _AirlineFlightPromoFlight_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "PromoFlight");
  private final static QName _AirlineFlightPremiumEconomyFlight_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "PremiumEconomyFlight");
  private final static QName _AirlineFlightBusinessFlight_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "BusinessFlight");
  private final static QName _AirlineFlightFirstFlight_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FirstFlight");
  private final static QName _AirlineFlightCurrencyName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "CurrencyName");
  private final static QName _AirlineFlightMLFlightList_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "MLFlightList");
  private final static QName _AirlineFlightSuperSaverFlight_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SuperSaverFlight");
  private final static QName _AirlineFlightEconomyFlexiFlight_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "EconomyFlexiFlight");
  private final static QName _AirlineFlightOBAvailFareGroups_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "OBAvailFareGroups");
  private final static QName _AirlineFlightBusinessFlexiFlight_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "BusinessFlexiFlight");
  private final static QName _AirlineFlightIBAvailFareGroups_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "IBAvailFareGroups");
  private final static QName _AirlineFlightAFDirection_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "AFDirection");
  private final static QName _AirlineFlightMAName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "MAName");
  private final static QName _AirlineFlightSegmentInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SegmentInformation");
  private final static QName _AirlineFlightRegion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "Region");
  private final static QName _AirlineFlightMACode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "MACode");
  private final static QName _AirlineFlightFuelStopOverCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "FuelStopOverCountry");
  private final static QName _AirlineFlightConnectionCityDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ConnectionCityDetails");
  private final static QName _AirlineFlightMLPriceInformation_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "MLPriceInformation");
  private final static QName _AirlineFlightNoSpecialPax_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "NoSpecialPax");
  private final static QName _ResultPackageInsuranceReservationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "InsuranceReservationResult");
  private final static QName _ResultPackageMealReservationsResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "MealReservationsResult");
  private final static QName _ResultPackagePaymentFailedMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "PaymentFailedMessage");
  private final static QName _ResultPackageBaggageReservationsResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "BaggageReservationsResult");
  private final static QName _ResultPackageMultilegFlights_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "Multileg_Flights");
  private final static QName _ResultPackageFlightReservationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "FlightReservationResult");
  private final static QName _ResultPackageFlightReservationSegmentsListResult_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "FlightReservationSegmentsListResult");
  private final static QName _ResultPackageFlightReservationSegmentsResult_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "FlightReservationSegmentsResult");
  private final static QName _ResultPackageResultMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ResultMessage");
  private final static QName _ResultPackageMultiLegFlightReservationResult_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "MultiLegFlightReservationResult");
  private final static QName _ResultPackageBookingFailedProducts_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "BookingFailedProducts");
  private final static QName _ResultPackageSeatReservationsResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SeatReservationsResult");
  private final static QName _SMSSettingsENProvider_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Provider");
  private final static QName _SMSSettingsENServiceURL_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ServiceURL");
  private final static QName _APIMultiCitySetSelectedFlightsSetSelectedFlights_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "SetSelectedFlights");
  private final static QName _APIMealAvailabilityAvailableMeals_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "AvailableMeals");
  private final static QName _FlightSearchReponseAvailableFreeBaggages_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "AvailableFreeBaggages");
  private final static QName _PaxPriceBreakDownDispTotalAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "dispTotalAmount");
  private final static QName _PaxPriceBreakDownDispTax_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "dispTax");
  private final static QName _PaxPriceBreakDownDispAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "dispAmount");
  private final static QName _TaxBreakDownInfoDisplayDesc_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "DisplayDesc");
  private final static QName _TaxBreakDownInfoBreakDownCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "BreakDownCode");
  private final static QName _TaxBreakDownInfoDisplayAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DisplayAmount");
  private final static QName _CustomerUserPaymentMethodsENInstructionsInEnglish_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "InstructionsInEnglish");
  private final static QName _CustomerUserPaymentMethodsENLangText_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "LangText");
  private final static QName _CustomerUserPaymentMethodsENCreditCardList_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "CreditCardList");
  private final static QName _CustomerUserPaymentMethodsENInsPaymentSettings_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "InsPaymentSettings");
  private final static QName _CustomerUserPaymentMethodsENInstTextInThanksPage_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "InstTextInThanksPage");
  private final static QName _CustomerUserPaymentMethodsENDisplayPaymentMethodName_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "DisplayPaymentMethodName");
  private final static QName _CustomerUserPaymentMethodsENApplicableTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ApplicableTo");
  private final static QName _CustomerUserPaymentMethodsENDisplayTextinPricing_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "DisplayTextinPricing");
  private final static QName _CustomerUserPaymentMethodsENParentPaymentMethodName_QNAME = new QName(
      "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ParentPaymentMethodName");
  private final static QName _CreditCardsENCVV_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "CVV");
  private final static QName _CreditCardsENCardName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "CardName");
  private final static QName _CreditCardsENChannelCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ChannelCode");
  private final static QName _CreditCardsENPurAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "PurAmount");
  private final static QName _CreditCardsENExpDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ExpDate");
  private final static QName _CreditCardsENCardType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "CardType");
  private final static QName _CreditCardsENStartDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "StartDate");
  private final static QName _CreditCardsENContactNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "ContactNo");
  private final static QName _CreditCardsENIssueCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "IssueCountry");
  private final static QName _CreditCardsENTransNoAbout3D_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "TransNoAbout3D");
  private final static QName _CreditCardsENAgentCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "AgentCode");
  private final static QName _CreditCardsENIssueNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "IssueNo");
  private final static QName _CreditCardsENGatewayPaymentMethod_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "GatewayPaymentMethod");
  private final static QName _CreditCardsENCardNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "CardNo");
  private final static QName _CreditCardsENInfoAbout3D_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "InfoAbout3D");
  private final static QName _CreditCardsENIssueBank_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "IssueBank");
  private final static QName _CardTypesENServiceCardType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "ServiceCardType");
  private final static QName _APIInsuranceURLURL_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "URL");
  private final static QName _APIMealInfoMealName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "MealName");
  private final static QName _PaxPriceDifferenceSplPaxPriceDiff_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SplPaxPriceDiff");
  private final static QName _AirlineFlightSegmentSegBookingClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "SegBookingClass");
  private final static QName _AirlineFlightSegmentOprAirlineCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "OprAirlineCode");
  private final static QName _AirlineFlightSegmentArrAirportCityName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "ArrAirportCityName");
  private final static QName _AirlineFlightSegmentDepAirportCityName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DepAirportCityName");
  private final static QName _AirlineFlightSegmentFuelStopOver_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "FuelStopOver");
  private final static QName _APIAddonSetSelectedReqPaxSelectedAddons_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "PaxSelectedAddons");
  private final static QName _LoyaltySearchUserInfoMemberTier_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "MemberTier");
  private final static QName _LoyaltySearchUserInfoBinNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "BinNumber");
  private final static QName _LoyaltySearchUserInfoDiscountCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL",
      "DiscountCode");
  private final static QName _LoyaltySearchUserInfoFFMemberID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", "FFMemberID");
  private final static QName _SeatReservationENSeatCharactericts_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SeatCharactericts");
  private final static QName _SeatReservationENDirection_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Direction");
  private final static QName _SeatReservationENSeatAddOnStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities",
      "SeatAddOnStatus");
  private final static QName _SeatReservationENSubCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "SubCode");
  private final static QName _SeatReservationENSeatNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "SeatNo");
  private final static QName _ServiceRequestInfoSubcode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", "Subcode");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.goquo_dp
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link CreditCardsEN }
   */
  public CreditCardsEN createCreditCardsEN() {
    return new CreditCardsEN();
  }

  /**
   * Create an instance of {@link CustomerUserPaymentMethodsEN }
   */
  public CustomerUserPaymentMethodsEN createCustomerUserPaymentMethodsEN() {
    return new CustomerUserPaymentMethodsEN();
  }

  /**
   * Create an instance of {@link ReservationsCardTransactionsEN }
   */
  public ReservationsCardTransactionsEN createReservationsCardTransactionsEN() {
    return new ReservationsCardTransactionsEN();
  }

  /**
   * Create an instance of {@link PaxLoginsEN }
   */
  public PaxLoginsEN createPaxLoginsEN() {
    return new PaxLoginsEN();
  }

  /**
   * Create an instance of {@link FlightSearchCriteriaRQ }
   */
  public FlightSearchCriteriaRQ createFlightSearchCriteria() {
    return new FlightSearchCriteriaRQ();
  }

  /**
   * Create an instance of {@link ArrayOfAPIRoutesEn }
   */
  public ArrayOfAPIRoutesEn createArrayOfAPIRoutesEn() {
    return new ArrayOfAPIRoutesEn();
  }

  /**
   * Create an instance of {@link MultiFlightSearchReponse }
   */
  public MultiFlightSearchReponse createMultiFlightSearchReponse() {
    return new MultiFlightSearchReponse();
  }

  /**
   * Create an instance of {@link APIMultiCitySearchCriteria }
   */
  public APIMultiCitySearchCriteria createAPIMultiCitySearchCriteria() {
    return new APIMultiCitySearchCriteria();
  }

  /**
   * Create an instance of {@link ArrayOfFlights }
   */
  public ArrayOfFlights createArrayOfFlights() {
    return new ArrayOfFlights();
  }

  /**
   * Create an instance of {@link ArrayOfPackageSummary }
   */
  public ArrayOfPackageSummary createArrayOfPackageSummary() {
    return new ArrayOfPackageSummary();
  }

  /**
   * Create an instance of {@link ReservationsEN }
   */
  public ReservationsEN createReservationsEN() {
    return new ReservationsEN();
  }

  /**
   * Create an instance of {@link ArrayOfPassengersEN }
   */
  public ArrayOfPassengersEN createArrayOfPassengersEN() {
    return new ArrayOfPassengersEN();
  }

  /**
   * Create an instance of {@link PassengerDetailsEN }
   */
  public PassengerDetailsEN createPassengerDetailsEN() {
    return new PassengerDetailsEN();
  }

  /**
   * Create an instance of {@link ReservationDetails }
   */
  public ReservationDetails createReservationDetails() {
    return new ReservationDetails();
  }

  /**
   * Create an instance of {@link MultiSetSelectedReponse }
   */
  public MultiSetSelectedReponse createMultiSetSelectedReponse() {
    return new MultiSetSelectedReponse();
  }

  /**
   * Create an instance of {@link ArrayOfCustomerUserCardTypesEN }
   */
  public ArrayOfCustomerUserCardTypesEN createArrayOfCustomerUserCardTypesEN() {
    return new ArrayOfCustomerUserCardTypesEN();
  }

  /**
   * Create an instance of {@link APIAddonSetSelectedReq }
   */
  public APIAddonSetSelectedReq createAPIAddonSetSelectedReq() {
    return new APIAddonSetSelectedReq();
  }

  /**
   * Create an instance of {@link GetUpdatedBookingDetailsRequest }
   */
  public GetUpdatedBookingDetailsRequest createGetUpdatedBookingDetailsRequest() {
    return new GetUpdatedBookingDetailsRequest();
  }

  /**
   * Create an instance of {@link APICancelBookingResponse }
   */
  public APICancelBookingResponse createAPICancelBookingResponse() {
    return new APICancelBookingResponse();
  }

  /**
   * Create an instance of {@link APIMultiCitySetSelectedFlights }
   */
  public APIMultiCitySetSelectedFlights createAPIMultiCitySetSelectedFlights() {
    return new APIMultiCitySetSelectedFlights();
  }

  /**
   * Create an instance of {@link FlightSearchReponse }
   */
  public FlightSearchReponse createFlightSearchReponse() {
    return new FlightSearchReponse();
  }

  /**
   * Create an instance of {@link TicketingResponse }
   */
  public TicketingResponse createTicketingResponse() {
    return new TicketingResponse();
  }

  /**
   * Create an instance of {@link APIBookingSpecialServices }
   */
  public APIBookingSpecialServices createAPIBookingSpecialServices() {
    return new APIBookingSpecialServices();
  }

  /**
   * Create an instance of {@link APIAddonAvailabilityRes }
   */
  public APIAddonAvailabilityRes createAPIAddonAvailabilityRes() {
    return new APIAddonAvailabilityRes();
  }

  /**
   * Create an instance of {@link ArrayOfCustomerUserPaymentMethodsEN }
   */
  public ArrayOfCustomerUserPaymentMethodsEN createArrayOfCustomerUserPaymentMethodsEN() {
    return new ArrayOfCustomerUserPaymentMethodsEN();
  }

  /**
   * Create an instance of {@link APICancelBookingRequest }
   */
  public APICancelBookingRequest createAPICancelBookingRequest() {
    return new APICancelBookingRequest();
  }

  /**
   * Create an instance of {@link APIAddonAvailabilityReq }
   */
  public APIAddonAvailabilityReq createAPIAddonAvailabilityReq() {
    return new APIAddonAvailabilityReq();
  }

  /**
   * Create an instance of {@link B2BCompanyDetails }
   */
  public B2BCompanyDetails createB2BCompanyDetails() {
    return new B2BCompanyDetails();
  }

  /**
   * Create an instance of {@link CustomerUserCardTypesEN }
   */
  public CustomerUserCardTypesEN createCustomerUserCardTypesEN() {
    return new CustomerUserCardTypesEN();
  }

  /**
   * Create an instance of {@link ResultPackage }
   */
  public ResultPackage createResultPackage() {
    return new ResultPackage();
  }

  /**
   * Create an instance of {@link APIAddonSetSelectedRes }
   */
  public APIAddonSetSelectedRes createAPIAddonSetSelectedRes() {
    return new APIAddonSetSelectedRes();
  }

  /**
   * Create an instance of {@link Flights }
   */
  public Flights createFlights() {
    return new Flights();
  }

  /**
   * Create an instance of {@link APILoungeInfo }
   */
  public APILoungeInfo createAPILoungeInfo() {
    return new APILoungeInfo();
  }

  /**
   * Create an instance of {@link GDSFlightSegment }
   */
  public GDSFlightSegment createGDSFlightSegment() {
    return new GDSFlightSegment();
  }

  /**
   * Create an instance of {@link DisClosureAirline }
   */
  public DisClosureAirline createDisClosureAirline() {
    return new DisClosureAirline();
  }

  /**
   * Create an instance of {@link ArrayOfAPILoungeSegment }
   */
  public ArrayOfAPILoungeSegment createArrayOfAPILoungeSegment() {
    return new ArrayOfAPILoungeSegment();
  }

  /**
   * Create an instance of {@link PaxTypeCharge }
   */
  public PaxTypeCharge createPaxTypeCharge() {
    return new PaxTypeCharge();
  }

  /**
   * Create an instance of {@link AirlineMLAvail }
   */
  public AirlineMLAvail createAirlineMLAvail() {
    return new AirlineMLAvail();
  }

  /**
   * Create an instance of {@link ArrayOfAPIMealSegment }
   */
  public ArrayOfAPIMealSegment createArrayOfAPIMealSegment() {
    return new ArrayOfAPIMealSegment();
  }

  /**
   * Create an instance of {@link RouteFreeBaggageAllowance }
   */
  public RouteFreeBaggageAllowance createRouteFreeBaggageAllowance() {
    return new RouteFreeBaggageAllowance();
  }

  /**
   * Create an instance of {@link APIMealAvailability }
   */
  public APIMealAvailability createAPIMealAvailability() {
    return new APIMealAvailability();
  }

  /**
   * Create an instance of {@link ArrayOfBookingSpecialServices }
   */
  public ArrayOfBookingSpecialServices createArrayOfBookingSpecialServices() {
    return new ArrayOfBookingSpecialServices();
  }

  /**
   * Create an instance of {@link AirlineFlight }
   */
  public AirlineFlight createAirlineFlight() {
    return new AirlineFlight();
  }

  /**
   * Create an instance of {@link ArrayOfFareGroupFlight }
   */
  public ArrayOfFareGroupFlight createArrayOfFareGroupFlight() {
    return new ArrayOfFareGroupFlight();
  }

  /**
   * Create an instance of {@link APISearchCriteriaParams }
   */
  public APISearchCriteriaParams createAPISearchCriteriaParams() {
    return new APISearchCriteriaParams();
  }

  /**
   * Create an instance of {@link ArrayOfAPIBaggageInfo }
   */
  public ArrayOfAPIBaggageInfo createArrayOfAPIBaggageInfo() {
    return new ArrayOfAPIBaggageInfo();
  }

  /**
   * Create an instance of {@link APILoungeSegment }
   */
  public APILoungeSegment createAPILoungeSegment() {
    return new APILoungeSegment();
  }

  /**
   * Create an instance of {@link ArrayOfAPILoungeInfo }
   */
  public ArrayOfAPILoungeInfo createArrayOfAPILoungeInfo() {
    return new ArrayOfAPILoungeInfo();
  }

  /**
   * Create an instance of {@link AirlineFlightSegment }
   */
  public AirlineFlightSegment createAirlineFlightSegment() {
    return new AirlineFlightSegment();
  }

  /**
   * Create an instance of {@link ArrayOfAirlineFlightSegment }
   */
  public ArrayOfAirlineFlightSegment createArrayOfAirlineFlightSegment() {
    return new ArrayOfAirlineFlightSegment();
  }

  /**
   * Create an instance of {@link FreeBaggageAllowance }
   */
  public FreeBaggageAllowance createFreeBaggageAllowance() {
    return new FreeBaggageAllowance();
  }

  /**
   * Create an instance of {@link APISelectedSeat }
   */
  public APISelectedSeat createAPISelectedSeat() {
    return new APISelectedSeat();
  }

  /**
   * Create an instance of {@link ArrayOfAPIInsuranceURL }
   */
  public ArrayOfAPIInsuranceURL createArrayOfAPIInsuranceURL() {
    return new ArrayOfAPIInsuranceURL();
  }

  /**
   * Create an instance of {@link ArrayOfFreeBaggageAllowanceEN }
   */
  public ArrayOfFreeBaggageAllowanceEN createArrayOfFreeBaggageAllowanceEN() {
    return new ArrayOfFreeBaggageAllowanceEN();
  }

  /**
   * Create an instance of {@link SpecialPriceSummary }
   */
  public SpecialPriceSummary createSpecialPriceSummary() {
    return new SpecialPriceSummary();
  }

  /**
   * Create an instance of {@link ArrayOfAPISeatInfo }
   */
  public ArrayOfAPISeatInfo createArrayOfAPISeatInfo() {
    return new ArrayOfAPISeatInfo();
  }

  /**
   * Create an instance of {@link ArrayOfSpecialPriceSummary }
   */
  public ArrayOfSpecialPriceSummary createArrayOfSpecialPriceSummary() {
    return new ArrayOfSpecialPriceSummary();
  }

  /**
   * Create an instance of {@link APIAddonPriceInfo }
   */
  public APIAddonPriceInfo createAPIAddonPriceInfo() {
    return new APIAddonPriceInfo();
  }

  /**
   * Create an instance of {@link GSTBreakDownInfo }
   */
  public GSTBreakDownInfo createGSTBreakDownInfo() {
    return new GSTBreakDownInfo();
  }

  /**
   * Create an instance of {@link ArrayOfBaggages }
   */
  public ArrayOfBaggages createArrayOfBaggages() {
    return new ArrayOfBaggages();
  }

  /**
   * Create an instance of {@link FareGroupAirlineFlight }
   */
  public FareGroupAirlineFlight createFareGroupAirlineFlight() {
    return new FareGroupAirlineFlight();
  }

  /**
   * Create an instance of {@link PackageSummary }
   */
  public PackageSummary createPackageSummary() {
    return new PackageSummary();
  }

  /**
   * Create an instance of {@link FlightSegment }
   */
  public FlightSegment createFlightSegment() {
    return new FlightSegment();
  }

  /**
   * Create an instance of {@link ArrayOfAirlineMLPaxPrice }
   */
  public ArrayOfAirlineMLPaxPrice createArrayOfAirlineMLPaxPrice() {
    return new ArrayOfAirlineMLPaxPrice();
  }

  /**
   * Create an instance of {@link ArrayOfAPIMealInfo }
   */
  public ArrayOfAPIMealInfo createArrayOfAPIMealInfo() {
    return new ArrayOfAPIMealInfo();
  }

  /**
   * Create an instance of {@link ArrayOfAPIPaxSelectedAddOn }
   */
  public ArrayOfAPIPaxSelectedAddOn createArrayOfAPIPaxSelectedAddOn() {
    return new ArrayOfAPIPaxSelectedAddOn();
  }

  /**
   * Create an instance of {@link APIBaggageSegment }
   */
  public APIBaggageSegment createAPIBaggageSegment() {
    return new APIBaggageSegment();
  }

  /**
   * Create an instance of {@link ArrayOfAPISelectedLounge }
   */
  public ArrayOfAPISelectedLounge createArrayOfAPISelectedLounge() {
    return new ArrayOfAPISelectedLounge();
  }

  /**
   * Create an instance of {@link ArrayOfFareGroupAirlineFlight }
   */
  public ArrayOfFareGroupAirlineFlight createArrayOfFareGroupAirlineFlight() {
    return new ArrayOfFareGroupAirlineFlight();
  }

  /**
   * Create an instance of {@link LoyaltySearchUserInfo }
   */
  public LoyaltySearchUserInfo createLoyaltySearchUserInfo() {
    return new LoyaltySearchUserInfo();
  }

  /**
   * Create an instance of {@link ArrayOfGDSFlightSegment }
   */
  public ArrayOfGDSFlightSegment createArrayOfGDSFlightSegment() {
    return new ArrayOfGDSFlightSegment();
  }

  /**
   * Create an instance of {@link ArrayOfMultiCitySetSelectedFlight }
   */
  public ArrayOfMultiCitySetSelectedFlight createArrayOfMultiCitySetSelectedFlight() {
    return new ArrayOfMultiCitySetSelectedFlight();
  }

  /**
   * Create an instance of {@link StrikeoutInfo }
   */
  public StrikeoutInfo createStrikeoutInfo() {
    return new StrikeoutInfo();
  }

  /**
   * Create an instance of {@link ArrayOfAirlineMLFlightLeg }
   */
  public ArrayOfAirlineMLFlightLeg createArrayOfAirlineMLFlightLeg() {
    return new ArrayOfAirlineMLFlightLeg();
  }

  /**
   * Create an instance of {@link IntermediatePoint }
   */
  public IntermediatePoint createIntermediatePoint() {
    return new IntermediatePoint();
  }

  /**
   * Create an instance of {@link BookingSpecialServices }
   */
  public BookingSpecialServices createBookingSpecialServices() {
    return new BookingSpecialServices();
  }

  /**
   * Create an instance of {@link ArrayOfSpecialPaxPriceDifference }
   */
  public ArrayOfSpecialPaxPriceDifference createArrayOfSpecialPaxPriceDifference() {
    return new ArrayOfSpecialPaxPriceDifference();
  }

  /**
   * Create an instance of {@link SpecialPaxPriceDifference }
   */
  public SpecialPaxPriceDifference createSpecialPaxPriceDifference() {
    return new SpecialPaxPriceDifference();
  }

  /**
   * Create an instance of {@link ArrayOfTaxBreakDownInfo }
   */
  public ArrayOfTaxBreakDownInfo createArrayOfTaxBreakDownInfo() {
    return new ArrayOfTaxBreakDownInfo();
  }

  /**
   * Create an instance of {@link AirlineMLPrice }
   */
  public AirlineMLPrice createAirlineMLPrice() {
    return new AirlineMLPrice();
  }

  /**
   * Create an instance of {@link PriceInformation }
   */
  public PriceInformation createPriceInformation() {
    return new PriceInformation();
  }

  /**
   * Create an instance of {@link ArrayOfAPISelectedBaggages }
   */
  public ArrayOfAPISelectedBaggages createArrayOfAPISelectedBaggages() {
    return new ArrayOfAPISelectedBaggages();
  }

  /**
   * Create an instance of {@link APIPaxSelectedAddOn }
   */
  public APIPaxSelectedAddOn createAPIPaxSelectedAddOn() {
    return new APIPaxSelectedAddOn();
  }

  /**
   * Create an instance of {@link UnCombinedFareBasis }
   */
  public UnCombinedFareBasis createUnCombinedFareBasis() {
    return new UnCombinedFareBasis();
  }

  /**
   * Create an instance of {@link APISelectedMeals }
   */
  public APISelectedMeals createAPISelectedMeals() {
    return new APISelectedMeals();
  }

  /**
   * Create an instance of {@link ArrayOfUnCombinedFareBasis }
   */
  public ArrayOfUnCombinedFareBasis createArrayOfUnCombinedFareBasis() {
    return new ArrayOfUnCombinedFareBasis();
  }

  /**
   * Create an instance of {@link ArrayOfAPISelectedMeals }
   */
  public ArrayOfAPISelectedMeals createArrayOfAPISelectedMeals() {
    return new ArrayOfAPISelectedMeals();
  }

  /**
   * Create an instance of {@link ArrayOfAPISearchCriteriaParams }
   */
  public ArrayOfAPISearchCriteriaParams createArrayOfAPISearchCriteriaParams() {
    return new ArrayOfAPISearchCriteriaParams();
  }

  /**
   * Create an instance of {@link ArrayOfAPIBaggageSegment }
   */
  public ArrayOfAPIBaggageSegment createArrayOfAPIBaggageSegment() {
    return new ArrayOfAPIBaggageSegment();
  }

  /**
   * Create an instance of {@link SpecialService }
   */
  public SpecialService createSpecialService() {
    return new SpecialService();
  }

  /**
   * Create an instance of {@link FlightTerminalInfo }
   */
  public FlightTerminalInfo createFlightTerminalInfo() {
    return new FlightTerminalInfo();
  }

  /**
   * Create an instance of {@link TaxBreakDownInfo }
   */
  public TaxBreakDownInfo createTaxBreakDownInfo() {
    return new TaxBreakDownInfo();
  }

  /**
   * Create an instance of {@link APISelectedLounge }
   */
  public APISelectedLounge createAPISelectedLounge() {
    return new APISelectedLounge();
  }

  /**
   * Create an instance of {@link SpecialTypePaxCount }
   */
  public SpecialTypePaxCount createSpecialTypePaxCount() {
    return new SpecialTypePaxCount();
  }

  /**
   * Create an instance of {@link ArrayOfFlightSegment }
   */
  public ArrayOfFlightSegment createArrayOfFlightSegment() {
    return new ArrayOfFlightSegment();
  }

  /**
   * Create an instance of {@link Baggages }
   */
  public Baggages createBaggages() {
    return new Baggages();
  }

  /**
   * Create an instance of {@link APISelectedBaggages }
   */
  public APISelectedBaggages createAPISelectedBaggages() {
    return new APISelectedBaggages();
  }

  /**
   * Create an instance of {@link ArrayOfPerPaxPriceInfo }
   */
  public ArrayOfPerPaxPriceInfo createArrayOfPerPaxPriceInfo() {
    return new ArrayOfPerPaxPriceInfo();
  }

  /**
   * Create an instance of {@link ArrayOfAirlineFlight }
   */
  public ArrayOfAirlineFlight createArrayOfAirlineFlight() {
    return new ArrayOfAirlineFlight();
  }

  /**
   * Create an instance of {@link MultiCitySetSelectedFlight }
   */
  public MultiCitySetSelectedFlight createMultiCitySetSelectedFlight() {
    return new MultiCitySetSelectedFlight();
  }

  /**
   * Create an instance of {@link APIBaggageInfo }
   */
  public APIBaggageInfo createAPIBaggageInfo() {
    return new APIBaggageInfo();
  }

  /**
   * Create an instance of {@link APIMealInfo }
   */
  public APIMealInfo createAPIMealInfo() {
    return new APIMealInfo();
  }

  /**
   * Create an instance of {@link AirlineMLFlightLeg }
   */
  public AirlineMLFlightLeg createAirlineMLFlightLeg() {
    return new AirlineMLFlightLeg();
  }

  /**
   * Create an instance of {@link APISeatSegment }
   */
  public APISeatSegment createAPISeatSegment() {
    return new APISeatSegment();
  }

  /**
   * Create an instance of {@link APIMealSegment }
   */
  public APIMealSegment createAPIMealSegment() {
    return new APIMealSegment();
  }

  /**
   * Create an instance of {@link FreeBaggageAllowanceEN }
   */
  public FreeBaggageAllowanceEN createFreeBaggageAllowanceEN() {
    return new FreeBaggageAllowanceEN();
  }

  /**
   * Create an instance of {@link AirlineMLPaxPrice }
   */
  public AirlineMLPaxPrice createAirlineMLPaxPrice() {
    return new AirlineMLPaxPrice();
  }

  /**
   * Create an instance of {@link APISeatInfo }
   */
  public APISeatInfo createAPISeatInfo() {
    return new APISeatInfo();
  }

  /**
   * Create an instance of {@link APIInsuranceAvailability }
   */
  public APIInsuranceAvailability createAPIInsuranceAvailability() {
    return new APIInsuranceAvailability();
  }

  /**
   * Create an instance of {@link BookingChargesInfo }
   */
  public BookingChargesInfo createBookingChargesInfo() {
    return new BookingChargesInfo();
  }

  /**
   * Create an instance of {@link APISeatAvailability }
   */
  public APISeatAvailability createAPISeatAvailability() {
    return new APISeatAvailability();
  }

  /**
   * Create an instance of {@link FareGroupFlight }
   */
  public FareGroupFlight createFareGroupFlight() {
    return new FareGroupFlight();
  }

  /**
   * Create an instance of {@link ArrayOfSGDInsurancePackageSummary }
   */
  public ArrayOfSGDInsurancePackageSummary createArrayOfSGDInsurancePackageSummary() {
    return new ArrayOfSGDInsurancePackageSummary();
  }

  /**
   * Create an instance of {@link ArrayOfSpecialService }
   */
  public ArrayOfSpecialService createArrayOfSpecialService() {
    return new ArrayOfSpecialService();
  }

  /**
   * Create an instance of {@link APIBaggageAvailability }
   */
  public APIBaggageAvailability createAPIBaggageAvailability() {
    return new APIBaggageAvailability();
  }

  /**
   * Create an instance of {@link PromotionInfo }
   */
  public PromotionInfo createPromotionInfo() {
    return new PromotionInfo();
  }

  /**
   * Create an instance of {@link ArrayOfGSTBreakDownInfo }
   */
  public ArrayOfGSTBreakDownInfo createArrayOfGSTBreakDownInfo() {
    return new ArrayOfGSTBreakDownInfo();
  }

  /**
   * Create an instance of {@link ArrayOfAPISeatSegment }
   */
  public ArrayOfAPISeatSegment createArrayOfAPISeatSegment() {
    return new ArrayOfAPISeatSegment();
  }

  /**
   * Create an instance of {@link APILoungeAvailability }
   */
  public APILoungeAvailability createAPILoungeAvailability() {
    return new APILoungeAvailability();
  }

  /**
   * Create an instance of {@link SGDInsurancePackageSummary }
   */
  public SGDInsurancePackageSummary createSGDInsurancePackageSummary() {
    return new SGDInsurancePackageSummary();
  }

  /**
   * Create an instance of {@link FlightError }
   */
  public FlightError createFlightError() {
    return new FlightError();
  }

  /**
   * Create an instance of {@link PaxPriceDifference }
   */
  public PaxPriceDifference createPaxPriceDifference() {
    return new PaxPriceDifference();
  }

  /**
   * Create an instance of {@link ArrayOfAPISelectedSeat }
   */
  public ArrayOfAPISelectedSeat createArrayOfAPISelectedSeat() {
    return new ArrayOfAPISelectedSeat();
  }

  /**
   * Create an instance of {@link PerPaxPriceInfo }
   */
  public PerPaxPriceInfo createPerPaxPriceInfo() {
    return new PerPaxPriceInfo();
  }

  /**
   * Create an instance of {@link APIInsuranceURL }
   */
  public APIInsuranceURL createAPIInsuranceURL() {
    return new APIInsuranceURL();
  }

  /**
   * Create an instance of {@link InsuranceGSTInfo }
   */
  public InsuranceGSTInfo createInsuranceGSTInfo() {
    return new InsuranceGSTInfo();
  }

  /**
   * Create an instance of {@link SMSSettingsEN }
   */
  public SMSSettingsEN createSMSSettingsEN() {
    return new SMSSettingsEN();
  }

  /**
   * Create an instance of {@link PromotionCodesEN }
   */
  public PromotionCodesEN createPromotionCodesEN() {
    return new PromotionCodesEN();
  }

  /**
   * Create an instance of {@link FareRulesEN }
   */
  public FareRulesEN createFareRulesEN() {
    return new FareRulesEN();
  }

  /**
   * Create an instance of {@link Result }
   */
  public Result createResult() {
    return new Result();
  }

  /**
   * Create an instance of {@link PassengersEN }
   */
  public PassengersEN createPassengersEN() {
    return new PassengersEN();
  }

  /**
   * Create an instance of {@link AirlineMealSelectionEN }
   */
  public AirlineMealSelectionEN createAirlineMealSelectionEN() {
    return new AirlineMealSelectionEN();
  }

  /**
   * Create an instance of {@link ArrayOfBaggageReservationEN }
   */
  public ArrayOfBaggageReservationEN createArrayOfBaggageReservationEN() {
    return new ArrayOfBaggageReservationEN();
  }

  /**
   * Create an instance of {@link ArrayOfInsuranceReservationEN }
   */
  public ArrayOfInsuranceReservationEN createArrayOfInsuranceReservationEN() {
    return new ArrayOfInsuranceReservationEN();
  }

  /**
   * Create an instance of {@link FlightReservationEN }
   */
  public FlightReservationEN createFlightReservationEN() {
    return new FlightReservationEN();
  }

  /**
   * Create an instance of {@link FlightReservationSegmentsEN }
   */
  public FlightReservationSegmentsEN createFlightReservationSegmentsEN() {
    return new FlightReservationSegmentsEN();
  }

  /**
   * Create an instance of {@link ReservationPromoCodesEN }
   */
  public ReservationPromoCodesEN createReservationPromoCodesEN() {
    return new ReservationPromoCodesEN();
  }

  /**
   * Create an instance of {@link APIRoutesEn }
   */
  public APIRoutesEn createAPIRoutesEn() {
    return new APIRoutesEn();
  }

  /**
   * Create an instance of {@link ServiceRequestInfo }
   */
  public ServiceRequestInfo createServiceRequestInfo() {
    return new ServiceRequestInfo();
  }

  /**
   * Create an instance of {@link LoungeReservationEN }
   */
  public LoungeReservationEN createLoungeReservationEN() {
    return new LoungeReservationEN();
  }

  /**
   * Create an instance of {@link SegmentPaxPriceEN }
   */
  public SegmentPaxPriceEN createSegmentPaxPriceEN() {
    return new SegmentPaxPriceEN();
  }

  /**
   * Create an instance of {@link SeatReservationEN }
   */
  public SeatReservationEN createSeatReservationEN() {
    return new SeatReservationEN();
  }

  /**
   * Create an instance of {@link BaggageReservationEN }
   */
  public BaggageReservationEN createBaggageReservationEN() {
    return new BaggageReservationEN();
  }

  /**
   * Create an instance of {@link InsuranceReservationEN }
   */
  public InsuranceReservationEN createInsuranceReservationEN() {
    return new InsuranceReservationEN();
  }

  /**
   * Create an instance of {@link ArrayOfAirlineMealSelectionEN }
   */
  public ArrayOfAirlineMealSelectionEN createArrayOfAirlineMealSelectionEN() {
    return new ArrayOfAirlineMealSelectionEN();
  }

  /**
   * Create an instance of {@link ArrayOfMultilegFlightReservation }
   */
  public ArrayOfMultilegFlightReservation createArrayOfMultilegFlightReservation() {
    return new ArrayOfMultilegFlightReservation();
  }

  /**
   * Create an instance of {@link ArrayOfFlightReservationEN }
   */
  public ArrayOfFlightReservationEN createArrayOfFlightReservationEN() {
    return new ArrayOfFlightReservationEN();
  }

  /**
   * Create an instance of {@link InstallmentPaymentSettingsEN }
   */
  public InstallmentPaymentSettingsEN createInstallmentPaymentSettingsEN() {
    return new InstallmentPaymentSettingsEN();
  }

  /**
   * Create an instance of {@link PaxPriceBreakDown }
   */
  public PaxPriceBreakDown createPaxPriceBreakDown() {
    return new PaxPriceBreakDown();
  }

  /**
   * Create an instance of {@link ArrayOfSegmentFareInfoEN }
   */
  public ArrayOfSegmentFareInfoEN createArrayOfSegmentFareInfoEN() {
    return new ArrayOfSegmentFareInfoEN();
  }

  /**
   * Create an instance of {@link PriceStrikeoutSettingsEN }
   */
  public PriceStrikeoutSettingsEN createPriceStrikeoutSettingsEN() {
    return new PriceStrikeoutSettingsEN();
  }

  /**
   * Create an instance of {@link InsuranceReservationInfo }
   */
  public InsuranceReservationInfo createInsuranceReservationInfo() {
    return new InsuranceReservationInfo();
  }

  /**
   * Create an instance of {@link MobileAppLangTextEN }
   */
  public MobileAppLangTextEN createMobileAppLangTextEN() {
    return new MobileAppLangTextEN();
  }

  /**
   * Create an instance of {@link MultilegFlightReservation }
   */
  public MultilegFlightReservation createMultilegFlightReservation() {
    return new MultilegFlightReservation();
  }

  /**
   * Create an instance of {@link BookedProducts }
   */
  public BookedProducts createBookedProducts() {
    return new BookedProducts();
  }

  /**
   * Create an instance of {@link FlightAddOnBookingStatus }
   */
  public FlightAddOnBookingStatus createFlightAddOnBookingStatus() {
    return new FlightAddOnBookingStatus();
  }

  /**
   * Create an instance of {@link FlightManagementResponseEN }
   */
  public FlightManagementResponseEN createFlightManagementResponseEN() {
    return new FlightManagementResponseEN();
  }

  /**
   * Create an instance of {@link Message }
   */
  public Message createMessage() {
    return new Message();
  }

  /**
   * Create an instance of {@link BookingPriceBreakDownEN }
   */
  public BookingPriceBreakDownEN createBookingPriceBreakDownEN() {
    return new BookingPriceBreakDownEN();
  }

  /**
   * Create an instance of {@link ArrayOfFareRulesEN }
   */
  public ArrayOfFareRulesEN createArrayOfFareRulesEN() {
    return new ArrayOfFareRulesEN();
  }

  /**
   * Create an instance of {@link ArrayOfSeatReservationEN }
   */
  public ArrayOfSeatReservationEN createArrayOfSeatReservationEN() {
    return new ArrayOfSeatReservationEN();
  }

  /**
   * Create an instance of {@link MarkupFlightEN }
   */
  public MarkupFlightEN createMarkupFlightEN() {
    return new MarkupFlightEN();
  }

  /**
   * Create an instance of {@link ArrayOfMobileAppLangTextEN }
   */
  public ArrayOfMobileAppLangTextEN createArrayOfMobileAppLangTextEN() {
    return new ArrayOfMobileAppLangTextEN();
  }

  /**
   * Create an instance of {@link PromotionSettingsEN }
   */
  public PromotionSettingsEN createPromotionSettingsEN() {
    return new PromotionSettingsEN();
  }

  /**
   * Create an instance of {@link ConsentEN }
   */
  public ConsentEN createConsentEN() {
    return new ConsentEN();
  }

  /**
   * Create an instance of {@link ArrayOfInstallmentPaymentSettingsEN }
   */
  public ArrayOfInstallmentPaymentSettingsEN createArrayOfInstallmentPaymentSettingsEN() {
    return new ArrayOfInstallmentPaymentSettingsEN();
  }

  /**
   * Create an instance of {@link FlightReservationInfo }
   */
  public FlightReservationInfo createFlightReservationInfo() {
    return new FlightReservationInfo();
  }

  /**
   * Create an instance of {@link ArrayOfFlightReservationEticketEN }
   */
  public ArrayOfFlightReservationEticketEN createArrayOfFlightReservationEticketEN() {
    return new ArrayOfFlightReservationEticketEN();
  }

  /**
   * Create an instance of {@link ArrayOfMarkupFlightEN }
   */
  public ArrayOfMarkupFlightEN createArrayOfMarkupFlightEN() {
    return new ArrayOfMarkupFlightEN();
  }

  /**
   * Create an instance of {@link ArrayOfFlightReservationSegmentsEN }
   */
  public ArrayOfFlightReservationSegmentsEN createArrayOfFlightReservationSegmentsEN() {
    return new ArrayOfFlightReservationSegmentsEN();
  }

  /**
   * Create an instance of {@link ArrayOfMessage }
   */
  public ArrayOfMessage createArrayOfMessage() {
    return new ArrayOfMessage();
  }

  /**
   * Create an instance of {@link ArrayOfInsuranceReservationInfo }
   */
  public ArrayOfInsuranceReservationInfo createArrayOfInsuranceReservationInfo() {
    return new ArrayOfInsuranceReservationInfo();
  }

  /**
   * Create an instance of {@link PaymentMethodsEN }
   */
  public PaymentMethodsEN createPaymentMethodsEN() {
    return new PaymentMethodsEN();
  }

  /**
   * Create an instance of {@link SMSPriceEN }
   */
  public SMSPriceEN createSMSPriceEN() {
    return new SMSPriceEN();
  }

  /**
   * Create an instance of {@link CardTypesEN }
   */
  public CardTypesEN createCardTypesEN() {
    return new CardTypesEN();
  }

  /**
   * Create an instance of {@link ArrayOfPaxPriceBreakDown }
   */
  public ArrayOfPaxPriceBreakDown createArrayOfPaxPriceBreakDown() {
    return new ArrayOfPaxPriceBreakDown();
  }

  /**
   * Create an instance of {@link MarkupGroupsEN }
   */
  public MarkupGroupsEN createMarkupGroupsEN() {
    return new MarkupGroupsEN();
  }

  /**
   * Create an instance of {@link SegmentFareInfoEN }
   */
  public SegmentFareInfoEN createSegmentFareInfoEN() {
    return new SegmentFareInfoEN();
  }

  /**
   * Create an instance of {@link ProfileEN }
   */
  public ProfileEN createProfileEN() {
    return new ProfileEN();
  }

  /**
   * Create an instance of {@link ArrayOfLoungeReservationEN }
   */
  public ArrayOfLoungeReservationEN createArrayOfLoungeReservationEN() {
    return new ArrayOfLoungeReservationEN();
  }

  /**
   * Create an instance of {@link FlightReservationEticketEN }
   */
  public FlightReservationEticketEN createFlightReservationEticketEN() {
    return new FlightReservationEticketEN();
  }

  /**
   * Create an instance of {@link GSTReservationEN }
   */
  public GSTReservationEN createGSTReservationEN() {
    return new GSTReservationEN();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaggages }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfBaggages")
  public JAXBElement<ArrayOfBaggages> createArrayOfBaggages(ArrayOfBaggages value) {
    return new JAXBElement<ArrayOfBaggages>(_ArrayOfBaggages_QNAME, ArrayOfBaggages.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link GSTBreakDownInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "GSTBreakDownInfo")
  public JAXBElement<GSTBreakDownInfo> createGSTBreakDownInfo(GSTBreakDownInfo value) {
    return new JAXBElement<GSTBreakDownInfo>(_GSTBreakDownInfo_QNAME, GSTBreakDownInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIAddonPriceInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_AddonPriceInfo")
  public JAXBElement<APIAddonPriceInfo> createAPIAddonPriceInfo(APIAddonPriceInfo value) {
    return new JAXBElement<APIAddonPriceInfo>(_APIAddonPriceInfo_QNAME, APIAddonPriceInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISelectedLounge }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAPI_SelectedLounge")
  public JAXBElement<ArrayOfAPISelectedLounge> createArrayOfAPISelectedLounge(ArrayOfAPISelectedLounge value) {
    return new JAXBElement<ArrayOfAPISelectedLounge>(_ArrayOfAPISelectedLounge_QNAME, ArrayOfAPISelectedLounge.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIBaggageSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_BaggageSegment")
  public JAXBElement<APIBaggageSegment> createAPIBaggageSegment(APIBaggageSegment value) {
    return new JAXBElement<APIBaggageSegment>(_APIBaggageSegment_QNAME, APIBaggageSegment.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightReservationSegmentsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightReservationSegmentsEN")
  public JAXBElement<FlightReservationSegmentsEN> createFlightReservationSegmentsEN(FlightReservationSegmentsEN value) {
    return new JAXBElement<FlightReservationSegmentsEN>(_FlightReservationSegmentsEN_QNAME, FlightReservationSegmentsEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPIPaxSelectedAddOn }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAPI_PaxSelectedAddOn")
  public JAXBElement<ArrayOfAPIPaxSelectedAddOn> createArrayOfAPIPaxSelectedAddOn(ArrayOfAPIPaxSelectedAddOn value) {
    return new JAXBElement<ArrayOfAPIPaxSelectedAddOn>(_ArrayOfAPIPaxSelectedAddOn_QNAME, ArrayOfAPIPaxSelectedAddOn.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAirlineMLPaxPrice }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAirlineMLPaxPrice")
  public JAXBElement<ArrayOfAirlineMLPaxPrice> createArrayOfAirlineMLPaxPrice(ArrayOfAirlineMLPaxPrice value) {
    return new JAXBElement<ArrayOfAirlineMLPaxPrice>(_ArrayOfAirlineMLPaxPrice_QNAME, ArrayOfAirlineMLPaxPrice.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FlightSegment")
  public JAXBElement<FlightSegment> createFlightSegment(FlightSegment value) {
    return new JAXBElement<FlightSegment>(_FlightSegment_QNAME, FlightSegment.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FareGroupAirlineFlight }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FareGroupAirlineFlight")
  public JAXBElement<FareGroupAirlineFlight> createFareGroupAirlineFlight(FareGroupAirlineFlight value) {
    return new JAXBElement<FareGroupAirlineFlight>(_FareGroupAirlineFlight_QNAME, FareGroupAirlineFlight.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ServiceRequestInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ServiceRequestInfo")
  public JAXBElement<ServiceRequestInfo> createServiceRequestInfo(ServiceRequestInfo value) {
    return new JAXBElement<ServiceRequestInfo>(_ServiceRequestInfo_QNAME, ServiceRequestInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link LoungeReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "LoungeReservationEN")
  public JAXBElement<LoungeReservationEN> createLoungeReservationEN(LoungeReservationEN value) {
    return new JAXBElement<LoungeReservationEN>(_LoungeReservationEN_QNAME, LoungeReservationEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link InsuranceReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "InsuranceReservationEN")
  public JAXBElement<InsuranceReservationEN> createInsuranceReservationEN(InsuranceReservationEN value) {
    return new JAXBElement<InsuranceReservationEN>(_InsuranceReservationEN_QNAME, InsuranceReservationEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIAddonSetSelectedReq }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_AddonSetSelectedReq")
  public JAXBElement<APIAddonSetSelectedReq> createAPIAddonSetSelectedReq(APIAddonSetSelectedReq value) {
    return new JAXBElement<APIAddonSetSelectedReq>(_APIAddonSetSelectedReq_QNAME, APIAddonSetSelectedReq.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link StrikeoutInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "StrikeoutInfo")
  public JAXBElement<StrikeoutInfo> createStrikeoutInfo(StrikeoutInfo value) {
    return new JAXBElement<StrikeoutInfo>(_StrikeoutInfo_QNAME, StrikeoutInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIAddonSetSelectedRes }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_AddonSetSelectedRes")
  public JAXBElement<APIAddonSetSelectedRes> createAPIAddonSetSelectedRes(APIAddonSetSelectedRes value) {
    return new JAXBElement<APIAddonSetSelectedRes>(_APIAddonSetSelectedRes_QNAME, APIAddonSetSelectedRes.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPassengersEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfPassengersEN")
  public JAXBElement<ArrayOfPassengersEN> createArrayOfPassengersEN(ArrayOfPassengersEN value) {
    return new JAXBElement<ArrayOfPassengersEN>(_ArrayOfPassengersEN_QNAME, ArrayOfPassengersEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMultilegFlightReservation }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfMultilegFlightReservation")
  public JAXBElement<ArrayOfMultilegFlightReservation> createArrayOfMultilegFlightReservation(ArrayOfMultilegFlightReservation value) {
    return new JAXBElement<ArrayOfMultilegFlightReservation>(_ArrayOfMultilegFlightReservation_QNAME, ArrayOfMultilegFlightReservation.class, null,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGDSFlightSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfGDS_FlightSegment")
  public JAXBElement<ArrayOfGDSFlightSegment> createArrayOfGDSFlightSegment(ArrayOfGDSFlightSegment value) {
    return new JAXBElement<ArrayOfGDSFlightSegment>(_ArrayOfGDSFlightSegment_QNAME, ArrayOfGDSFlightSegment.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link LoyaltySearchUserInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "LoyaltySearchUserInfo")
  public JAXBElement<LoyaltySearchUserInfo> createLoyaltySearchUserInfo(LoyaltySearchUserInfo value) {
    return new JAXBElement<LoyaltySearchUserInfo>(_LoyaltySearchUserInfo_QNAME, LoyaltySearchUserInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ResultPackage }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultPackage")
  public JAXBElement<ResultPackage> createResultPackage(ResultPackage value) {
    return new JAXBElement<ResultPackage>(_ResultPackage_QNAME, ResultPackage.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSegmentFareInfoEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfSegmentFareInfoEN")
  public JAXBElement<ArrayOfSegmentFareInfoEN> createArrayOfSegmentFareInfoEN(ArrayOfSegmentFareInfoEN value) {
    return new JAXBElement<ArrayOfSegmentFareInfoEN>(_ArrayOfSegmentFareInfoEN_QNAME, ArrayOfSegmentFareInfoEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link InsuranceReservationInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "InsuranceReservationInfo")
  public JAXBElement<InsuranceReservationInfo> createInsuranceReservationInfo(InsuranceReservationInfo value) {
    return new JAXBElement<InsuranceReservationInfo>(_InsuranceReservationInfo_QNAME, InsuranceReservationInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPIRoutesEn }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfAPIRoutesEn")
  public JAXBElement<ArrayOfAPIRoutesEn> createArrayOfAPIRoutesEn(ArrayOfAPIRoutesEn value) {
    return new JAXBElement<ArrayOfAPIRoutesEn>(_ArrayOfAPIRoutesEn_QNAME, ArrayOfAPIRoutesEn.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link MobileAppLangTextEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MobileAppLangTextEN")
  public JAXBElement<MobileAppLangTextEN> createMobileAppLangTextEN(MobileAppLangTextEN value) {
    return new JAXBElement<MobileAppLangTextEN>(_MobileAppLangTextEN_QNAME, MobileAppLangTextEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PaxLoginsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PaxLoginsEN")
  public JAXBElement<PaxLoginsEN> createPaxLoginsEN(PaxLoginsEN value) {
    return new JAXBElement<PaxLoginsEN>(_PaxLoginsEN_QNAME, PaxLoginsEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PaxPriceBreakDown }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PaxPriceBreakDown")
  public JAXBElement<PaxPriceBreakDown> createPaxPriceBreakDown(PaxPriceBreakDown value) {
    return new JAXBElement<PaxPriceBreakDown>(_PaxPriceBreakDown_QNAME, PaxPriceBreakDown.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AirlineMLAvail }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AirlineMLAvail")
  public JAXBElement<AirlineMLAvail> createAirlineMLAvail(AirlineMLAvail value) {
    return new JAXBElement<AirlineMLAvail>(_AirlineMLAvail_QNAME, AirlineMLAvail.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightManagementResponseEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightManagementResponseEN")
  public JAXBElement<FlightManagementResponseEN> createFlightManagementResponseEN(FlightManagementResponseEN value) {
    return new JAXBElement<FlightManagementResponseEN>(_FlightManagementResponseEN_QNAME, FlightManagementResponseEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PaxTypeCharge }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PaxTypeCharge")
  public JAXBElement<PaxTypeCharge> createPaxTypeCharge(PaxTypeCharge value) {
    return new JAXBElement<PaxTypeCharge>(_PaxTypeCharge_QNAME, PaxTypeCharge.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link MilesType }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils", name = "MilesType")
  public JAXBElement<MilesType> createMilesType(MilesType value) {
    return new JAXBElement<MilesType>(_MilesType_QNAME, MilesType.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APILoungeInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_LoungeInfo")
  public JAXBElement<APILoungeInfo> createAPILoungeInfo(APILoungeInfo value) {
    return new JAXBElement<APILoungeInfo>(_APILoungeInfo_QNAME, APILoungeInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMobileAppLangTextEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfMobileAppLangTextEN")
  public JAXBElement<ArrayOfMobileAppLangTextEN> createArrayOfMobileAppLangTextEN(ArrayOfMobileAppLangTextEN value) {
    return new JAXBElement<ArrayOfMobileAppLangTextEN>(_ArrayOfMobileAppLangTextEN_QNAME, ArrayOfMobileAppLangTextEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBookingSpecialServices }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfBookingSpecialServices")
  public JAXBElement<ArrayOfBookingSpecialServices> createArrayOfBookingSpecialServices(ArrayOfBookingSpecialServices value) {
    return new JAXBElement<ArrayOfBookingSpecialServices>(_ArrayOfBookingSpecialServices_QNAME, ArrayOfBookingSpecialServices.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PackageSummaryType }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils", name = "PackageSummaryType")
  public JAXBElement<PackageSummaryType> createPackageSummaryType(PackageSummaryType value) {
    return new JAXBElement<PackageSummaryType>(_PackageSummaryType_QNAME, PackageSummaryType.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ReservationsCardTransactionsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationsCardTransactionsEN")
  public JAXBElement<ReservationsCardTransactionsEN> createReservationsCardTransactionsEN(ReservationsCardTransactionsEN value) {
    return new JAXBElement<ReservationsCardTransactionsEN>(_ReservationsCardTransactionsEN_QNAME, ReservationsCardTransactionsEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPIMealSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAPI_MealSegment")
  public JAXBElement<ArrayOfAPIMealSegment> createArrayOfAPIMealSegment(ArrayOfAPIMealSegment value) {
    return new JAXBElement<ArrayOfAPIMealSegment>(_ArrayOfAPIMealSegment_QNAME, ArrayOfAPIMealSegment.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPILoungeInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAPI_LoungeInfo")
  public JAXBElement<ArrayOfAPILoungeInfo> createArrayOfAPILoungeInfo(ArrayOfAPILoungeInfo value) {
    return new JAXBElement<ArrayOfAPILoungeInfo>(_ArrayOfAPILoungeInfo_QNAME, ArrayOfAPILoungeInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMarkupFlightEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfMarkupFlightEN")
  public JAXBElement<ArrayOfMarkupFlightEN> createArrayOfMarkupFlightEN(ArrayOfMarkupFlightEN value) {
    return new JAXBElement<ArrayOfMarkupFlightEN>(_ArrayOfMarkupFlightEN_QNAME, ArrayOfMarkupFlightEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APILoungeSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_LoungeSegment")
  public JAXBElement<APILoungeSegment> createAPILoungeSegment(APILoungeSegment value) {
    return new JAXBElement<APILoungeSegment>(_APILoungeSegment_QNAME, APILoungeSegment.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInsuranceReservationInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfInsuranceReservationInfo")
  public JAXBElement<ArrayOfInsuranceReservationInfo> createArrayOfInsuranceReservationInfo(ArrayOfInsuranceReservationInfo value) {
    return new JAXBElement<ArrayOfInsuranceReservationInfo>(_ArrayOfInsuranceReservationInfo_QNAME, ArrayOfInsuranceReservationInfo.class, null,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightBookingType }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils", name = "FlightBookingType")
  public JAXBElement<FlightBookingType> createFlightBookingType(FlightBookingType value) {
    return new JAXBElement<FlightBookingType>(_FlightBookingType_QNAME, FlightBookingType.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APISearchCriteriaParams }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_SearchCriteriaParams")
  public JAXBElement<APISearchCriteriaParams> createAPISearchCriteriaParams(APISearchCriteriaParams value) {
    return new JAXBElement<APISearchCriteriaParams>(_APISearchCriteriaParams_QNAME, APISearchCriteriaParams.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ProfileEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ProfileEN")
  public JAXBElement<ProfileEN> createProfileEN(ProfileEN value) {
    return new JAXBElement<ProfileEN>(_ProfileEN_QNAME, ProfileEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CabinClass }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CabinClass")
  public JAXBElement<CabinClass> createCabinClass(CabinClass value) {
    return new JAXBElement<CabinClass>(_CabinClass_QNAME, CabinClass.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link MarkupGroupsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MarkupGroupsEN")
  public JAXBElement<MarkupGroupsEN> createMarkupGroupsEN(MarkupGroupsEN value) {
    return new JAXBElement<MarkupGroupsEN>(_MarkupGroupsEN_QNAME, MarkupGroupsEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLoungeReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfLoungeReservationEN")
  public JAXBElement<ArrayOfLoungeReservationEN> createArrayOfLoungeReservationEN(ArrayOfLoungeReservationEN value) {
    return new JAXBElement<ArrayOfLoungeReservationEN>(_ArrayOfLoungeReservationEN_QNAME, ArrayOfLoungeReservationEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APISeatSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_SeatSegment")
  public JAXBElement<APISeatSegment> createAPISeatSegment(APISeatSegment value) {
    return new JAXBElement<APISeatSegment>(_APISeatSegment_QNAME, APISeatSegment.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PromotionCodesEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PromotionCodesEN")
  public JAXBElement<PromotionCodesEN> createPromotionCodesEN(PromotionCodesEN value) {
    return new JAXBElement<PromotionCodesEN>(_PromotionCodesEN_QNAME, PromotionCodesEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIMealInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_MealInfo")
  public JAXBElement<APIMealInfo> createAPIMealInfo(APIMealInfo value) {
    return new JAXBElement<APIMealInfo>(_APIMealInfo_QNAME, APIMealInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSGDInsurancePackageSummary }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfSGDInsurancePackageSummary")
  public JAXBElement<ArrayOfSGDInsurancePackageSummary> createArrayOfSGDInsurancePackageSummary(ArrayOfSGDInsurancePackageSummary value) {
    return new JAXBElement<ArrayOfSGDInsurancePackageSummary>(_ArrayOfSGDInsurancePackageSummary_QNAME, ArrayOfSGDInsurancePackageSummary.class, null,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FareGroupFlight }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FareGroupFlight")
  public JAXBElement<FareGroupFlight> createFareGroupFlight(FareGroupFlight value) {
    return new JAXBElement<FareGroupFlight>(_FareGroupFlight_QNAME, FareGroupFlight.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaggageReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfBaggageReservationEN")
  public JAXBElement<ArrayOfBaggageReservationEN> createArrayOfBaggageReservationEN(ArrayOfBaggageReservationEN value) {
    return new JAXBElement<ArrayOfBaggageReservationEN>(_ArrayOfBaggageReservationEN_QNAME, ArrayOfBaggageReservationEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APISeatAvailability }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_SeatAvailability")
  public JAXBElement<APISeatAvailability> createAPISeatAvailability(APISeatAvailability value) {
    return new JAXBElement<APISeatAvailability>(_APISeatAvailability_QNAME, APISeatAvailability.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Flights }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Flights")
  public JAXBElement<Flights> createFlights(Flights value) {
    return new JAXBElement<Flights>(_Flights_QNAME, Flights.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AirlineMLPaxPrice }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AirlineMLPaxPrice")
  public JAXBElement<AirlineMLPaxPrice> createAirlineMLPaxPrice(AirlineMLPaxPrice value) {
    return new JAXBElement<AirlineMLPaxPrice>(_AirlineMLPaxPrice_QNAME, AirlineMLPaxPrice.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CustomerUserPaymentMethodsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CustomerUserPaymentMethodsEN")
  public JAXBElement<CustomerUserPaymentMethodsEN> createCustomerUserPaymentMethodsEN(CustomerUserPaymentMethodsEN value) {
    return new JAXBElement<CustomerUserPaymentMethodsEN>(_CustomerUserPaymentMethodsEN_QNAME, CustomerUserPaymentMethodsEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIMealSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_MealSegment")
  public JAXBElement<APIMealSegment> createAPIMealSegment(APIMealSegment value) {
    return new JAXBElement<APIMealSegment>(_APIMealSegment_QNAME, APIMealSegment.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BaggageReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BaggageReservationEN")
  public JAXBElement<BaggageReservationEN> createBaggageReservationEN(BaggageReservationEN value) {
    return new JAXBElement<BaggageReservationEN>(_BaggageReservationEN_QNAME, BaggageReservationEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APILoungeAvailability }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_LoungeAvailability")
  public JAXBElement<APILoungeAvailability> createAPILoungeAvailability(APILoungeAvailability value) {
    return new JAXBElement<APILoungeAvailability>(_APILoungeAvailability_QNAME, APILoungeAvailability.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SegmentPaxPriceEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SegmentPaxPriceEN")
  public JAXBElement<SegmentPaxPriceEN> createSegmentPaxPriceEN(SegmentPaxPriceEN value) {
    return new JAXBElement<SegmentPaxPriceEN>(_SegmentPaxPriceEN_QNAME, SegmentPaxPriceEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAirlineMealSelectionEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfAirlineMealSelectionEN")
  public JAXBElement<ArrayOfAirlineMealSelectionEN> createArrayOfAirlineMealSelectionEN(ArrayOfAirlineMealSelectionEN value) {
    return new JAXBElement<ArrayOfAirlineMealSelectionEN>(_ArrayOfAirlineMealSelectionEN_QNAME, ArrayOfAirlineMealSelectionEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link InsuranceGSTInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "InsuranceGSTInfo")
  public JAXBElement<InsuranceGSTInfo> createInsuranceGSTInfo(InsuranceGSTInfo value) {
    return new JAXBElement<InsuranceGSTInfo>(_InsuranceGSTInfo_QNAME, InsuranceGSTInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link MultiSetSelectedReponse }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MultiSetSelectedReponse")
  public JAXBElement<MultiSetSelectedReponse> createMultiSetSelectedReponse(MultiSetSelectedReponse value) {
    return new JAXBElement<MultiSetSelectedReponse>(_MultiSetSelectedReponse_QNAME, MultiSetSelectedReponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIInsuranceURL }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_InsuranceURL")
  public JAXBElement<APIInsuranceURL> createAPIInsuranceURL(APIInsuranceURL value) {
    return new JAXBElement<APIInsuranceURL>(_APIInsuranceURL_QNAME, APIInsuranceURL.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PerPaxPriceInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PerPaxPriceInfo")
  public JAXBElement<PerPaxPriceInfo> createPerPaxPriceInfo(PerPaxPriceInfo value) {
    return new JAXBElement<PerPaxPriceInfo>(_PerPaxPriceInfo_QNAME, PerPaxPriceInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PaxPriceDifference }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PaxPriceDifference")
  public JAXBElement<PaxPriceDifference> createPaxPriceDifference(PaxPriceDifference value) {
    return new JAXBElement<PaxPriceDifference>(_PaxPriceDifference_QNAME, PaxPriceDifference.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISelectedSeat }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAPI_SelectedSeat")
  public JAXBElement<ArrayOfAPISelectedSeat> createArrayOfAPISelectedSeat(ArrayOfAPISelectedSeat value) {
    return new JAXBElement<ArrayOfAPISelectedSeat>(_ArrayOfAPISelectedSeat_QNAME, ArrayOfAPISelectedSeat.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link MultilegFlightReservation }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MultilegFlightReservation")
  public JAXBElement<MultilegFlightReservation> createMultilegFlightReservation(MultilegFlightReservation value) {
    return new JAXBElement<MultilegFlightReservation>(_MultilegFlightReservation_QNAME, MultilegFlightReservation.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PassengerType }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PassengerType")
  public JAXBElement<PassengerType> createPassengerType(PassengerType value) {
    return new JAXBElement<PassengerType>(_PassengerType_QNAME, PassengerType.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SGDInsurancePackageSummary }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SGDInsurancePackageSummary")
  public JAXBElement<SGDInsurancePackageSummary> createSGDInsurancePackageSummary(SGDInsurancePackageSummary value) {
    return new JAXBElement<SGDInsurancePackageSummary>(_SGDInsurancePackageSummary_QNAME, SGDInsurancePackageSummary.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFareRulesEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfFareRulesEN")
  public JAXBElement<ArrayOfFareRulesEN> createArrayOfFareRulesEN(ArrayOfFareRulesEN value) {
    return new JAXBElement<ArrayOfFareRulesEN>(_ArrayOfFareRulesEN_QNAME, ArrayOfFareRulesEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeatReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfSeatReservationEN")
  public JAXBElement<ArrayOfSeatReservationEN> createArrayOfSeatReservationEN(ArrayOfSeatReservationEN value) {
    return new JAXBElement<ArrayOfSeatReservationEN>(_ArrayOfSeatReservationEN_QNAME, ArrayOfSeatReservationEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIPaxSelectedAddOn }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_PaxSelectedAddOn")
  public JAXBElement<APIPaxSelectedAddOn> createAPIPaxSelectedAddOn(APIPaxSelectedAddOn value) {
    return new JAXBElement<APIPaxSelectedAddOn>(_APIPaxSelectedAddOn_QNAME, APIPaxSelectedAddOn.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AirlineMLPrice }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AirlineMLPrice")
  public JAXBElement<AirlineMLPrice> createAirlineMLPrice(AirlineMLPrice value) {
    return new JAXBElement<AirlineMLPrice>(_AirlineMLPrice_QNAME, AirlineMLPrice.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link MarkupFlightEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MarkupFlightEN")
  public JAXBElement<MarkupFlightEN> createMarkupFlightEN(MarkupFlightEN value) {
    return new JAXBElement<MarkupFlightEN>(_MarkupFlightEN_QNAME, MarkupFlightEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APICancelBookingResponse }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "APICancelBookingResponse")
  public JAXBElement<APICancelBookingResponse> createAPICancelBookingResponse(APICancelBookingResponse value) {
    return new JAXBElement<APICancelBookingResponse>(_APICancelBookingResponse_QNAME, APICancelBookingResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PromotionSettingsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PromotionSettingsEN")
  public JAXBElement<PromotionSettingsEN> createPromotionSettingsEN(PromotionSettingsEN value) {
    return new JAXBElement<PromotionSettingsEN>(_PromotionSettingsEN_QNAME, PromotionSettingsEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightTerminalInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FlightTerminalInfo")
  public JAXBElement<FlightTerminalInfo> createFlightTerminalInfo(FlightTerminalInfo value) {
    return new JAXBElement<FlightTerminalInfo>(_FlightTerminalInfo_QNAME, FlightTerminalInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInstallmentPaymentSettingsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfInstallmentPaymentSettingsEN")
  public JAXBElement<ArrayOfInstallmentPaymentSettingsEN> createArrayOfInstallmentPaymentSettingsEN(ArrayOfInstallmentPaymentSettingsEN value) {
    return new JAXBElement<ArrayOfInstallmentPaymentSettingsEN>(_ArrayOfInstallmentPaymentSettingsEN_QNAME, ArrayOfInstallmentPaymentSettingsEN.class,
        null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISearchCriteriaParams }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAPI_SearchCriteriaParams")
  public JAXBElement<ArrayOfAPISearchCriteriaParams> createArrayOfAPISearchCriteriaParams(ArrayOfAPISearchCriteriaParams value) {
    return new JAXBElement<ArrayOfAPISearchCriteriaParams>(_ArrayOfAPISearchCriteriaParams_QNAME, ArrayOfAPISearchCriteriaParams.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightReservationInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightReservationInfo")
  public JAXBElement<FlightReservationInfo> createFlightReservationInfo(FlightReservationInfo value) {
    return new JAXBElement<FlightReservationInfo>(_FlightReservationInfo_QNAME, FlightReservationInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnCombinedFareBasis }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfUnCombinedFareBasis")
  public JAXBElement<ArrayOfUnCombinedFareBasis> createArrayOfUnCombinedFareBasis(ArrayOfUnCombinedFareBasis value) {
    return new JAXBElement<ArrayOfUnCombinedFareBasis>(_ArrayOfUnCombinedFareBasis_QNAME, ArrayOfUnCombinedFareBasis.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APISelectedMeals }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_SelectedMeals")
  public JAXBElement<APISelectedMeals> createAPISelectedMeals(APISelectedMeals value) {
    return new JAXBElement<APISelectedMeals>(_APISelectedMeals_QNAME, APISelectedMeals.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SpecialTypePaxCount }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SpecialTypePaxCount")
  public JAXBElement<SpecialTypePaxCount> createSpecialTypePaxCount(SpecialTypePaxCount value) {
    return new JAXBElement<SpecialTypePaxCount>(_SpecialTypePaxCount_QNAME, SpecialTypePaxCount.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APISelectedLounge }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_SelectedLounge")
  public JAXBElement<APISelectedLounge> createAPISelectedLounge(APISelectedLounge value) {
    return new JAXBElement<APISelectedLounge>(_APISelectedLounge_QNAME, APISelectedLounge.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMethodsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PaymentMethodsEN")
  public JAXBElement<PaymentMethodsEN> createPaymentMethodsEN(PaymentMethodsEN value) {
    return new JAXBElement<PaymentMethodsEN>(_PaymentMethodsEN_QNAME, PaymentMethodsEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SMSPriceEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SMSPriceEN")
  public JAXBElement<SMSPriceEN> createSMSPriceEN(SMSPriceEN value) {
    return new JAXBElement<SMSPriceEN>(_SMSPriceEN_QNAME, SMSPriceEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TaxBreakDownInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "TaxBreakDownInfo")
  public JAXBElement<TaxBreakDownInfo> createTaxBreakDownInfo(TaxBreakDownInfo value) {
    return new JAXBElement<TaxBreakDownInfo>(_TaxBreakDownInfo_QNAME, TaxBreakDownInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMessage }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfMessage")
  public JAXBElement<ArrayOfMessage> createArrayOfMessage(ArrayOfMessage value) {
    return new JAXBElement<ArrayOfMessage>(_ArrayOfMessage_QNAME, ArrayOfMessage.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SegmentFareInfoEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SegmentFareInfoEN")
  public JAXBElement<SegmentFareInfoEN> createSegmentFareInfoEN(SegmentFareInfoEN value) {
    return new JAXBElement<SegmentFareInfoEN>(_SegmentFareInfoEN_QNAME, SegmentFareInfoEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialPriceSummary }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfSpecialPriceSummary")
  public JAXBElement<ArrayOfSpecialPriceSummary> createArrayOfSpecialPriceSummary(ArrayOfSpecialPriceSummary value) {
    return new JAXBElement<ArrayOfSpecialPriceSummary>(_ArrayOfSpecialPriceSummary_QNAME, ArrayOfSpecialPriceSummary.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SpecialPriceSummary }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SpecialPriceSummary")
  public JAXBElement<SpecialPriceSummary> createSpecialPriceSummary(SpecialPriceSummary value) {
    return new JAXBElement<SpecialPriceSummary>(_SpecialPriceSummary_QNAME, SpecialPriceSummary.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISeatInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAPI_SeatInfo")
  public JAXBElement<ArrayOfAPISeatInfo> createArrayOfAPISeatInfo(ArrayOfAPISeatInfo value) {
    return new JAXBElement<ArrayOfAPISeatInfo>(_ArrayOfAPISeatInfo_QNAME, ArrayOfAPISeatInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PassengerDetailsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PassengerDetailsEN")
  public JAXBElement<PassengerDetailsEN> createPassengerDetailsEN(PassengerDetailsEN value) {
    return new JAXBElement<PassengerDetailsEN>(_PassengerDetailsEN_QNAME, PassengerDetailsEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ReservationsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationsEN")
  public JAXBElement<ReservationsEN> createReservationsEN(ReservationsEN value) {
    return new JAXBElement<ReservationsEN>(_ReservationsEN_QNAME, ReservationsEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInsuranceReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfInsuranceReservationEN")
  public JAXBElement<ArrayOfInsuranceReservationEN> createArrayOfInsuranceReservationEN(ArrayOfInsuranceReservationEN value) {
    return new JAXBElement<ArrayOfInsuranceReservationEN>(_ArrayOfInsuranceReservationEN_QNAME, ArrayOfInsuranceReservationEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SearchType }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SearchType")
  public JAXBElement<SearchType> createSearchType(SearchType value) {
    return new JAXBElement<SearchType>(_SearchType_QNAME, SearchType.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIMultiCitySearchCriteria }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_MultiCitySearchCriteria")
  public JAXBElement<APIMultiCitySearchCriteria> createAPIMultiCitySearchCriteria(APIMultiCitySearchCriteria value) {
    return new JAXBElement<APIMultiCitySearchCriteria>(_APIMultiCitySearchCriteria_QNAME, APIMultiCitySearchCriteria.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPIMealInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAPI_MealInfo")
  public JAXBElement<ArrayOfAPIMealInfo> createArrayOfAPIMealInfo(ArrayOfAPIMealInfo value) {
    return new JAXBElement<ArrayOfAPIMealInfo>(_ArrayOfAPIMealInfo_QNAME, ArrayOfAPIMealInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TicketingResponse }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "TicketingResponse")
  public JAXBElement<TicketingResponse> createTicketingResponse(TicketingResponse value) {
    return new JAXBElement<TicketingResponse>(_TicketingResponse_QNAME, TicketingResponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIRoutesEn }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "APIRoutesEn")
  public JAXBElement<APIRoutesEn> createAPIRoutesEn(APIRoutesEn value) {
    return new JAXBElement<APIRoutesEn>(_APIRoutesEn_QNAME, APIRoutesEn.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIBookingSpecialServices }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_BookingSpecialServices")
  public JAXBElement<APIBookingSpecialServices> createAPIBookingSpecialServices(APIBookingSpecialServices value) {
    return new JAXBElement<APIBookingSpecialServices>(_APIBookingSpecialServices_QNAME, APIBookingSpecialServices.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PackageSummary }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PackageSummary")
  public JAXBElement<PackageSummary> createPackageSummary(PackageSummary value) {
    return new JAXBElement<PackageSummary>(_PackageSummary_QNAME, PackageSummary.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SeatReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SeatReservationEN")
  public JAXBElement<SeatReservationEN> createSeatReservationEN(SeatReservationEN value) {
    return new JAXBElement<SeatReservationEN>(_SeatReservationEN_QNAME, SeatReservationEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BookingSpecialServices }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "BookingSpecialServices")
  public JAXBElement<BookingSpecialServices> createBookingSpecialServices(BookingSpecialServices value) {
    return new JAXBElement<BookingSpecialServices>(_BookingSpecialServices_QNAME, BookingSpecialServices.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link IntermediatePoint }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "IntermediatePoint")
  public JAXBElement<IntermediatePoint> createIntermediatePoint(IntermediatePoint value) {
    return new JAXBElement<IntermediatePoint>(_IntermediatePoint_QNAME, IntermediatePoint.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAirlineMLFlightLeg }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAirlineMLFlightLeg")
  public JAXBElement<ArrayOfAirlineMLFlightLeg> createArrayOfAirlineMLFlightLeg(ArrayOfAirlineMLFlightLeg value) {
    return new JAXBElement<ArrayOfAirlineMLFlightLeg>(_ArrayOfAirlineMLFlightLeg_QNAME, ArrayOfAirlineMLFlightLeg.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMultiCitySetSelectedFlight }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfMultiCitySetSelectedFlight")
  public JAXBElement<ArrayOfMultiCitySetSelectedFlight> createArrayOfMultiCitySetSelectedFlight(ArrayOfMultiCitySetSelectedFlight value) {
    return new JAXBElement<ArrayOfMultiCitySetSelectedFlight>(_ArrayOfMultiCitySetSelectedFlight_QNAME, ArrayOfMultiCitySetSelectedFlight.class, null,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFareGroupAirlineFlight }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfFareGroupAirlineFlight")
  public JAXBElement<ArrayOfFareGroupAirlineFlight> createArrayOfFareGroupAirlineFlight(ArrayOfFareGroupAirlineFlight value) {
    return new JAXBElement<ArrayOfFareGroupAirlineFlight>(_ArrayOfFareGroupAirlineFlight_QNAME, ArrayOfFareGroupAirlineFlight.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightSearchReponse }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FlightSearchReponse")
  public JAXBElement<FlightSearchReponse> createFlightSearchReponse(FlightSearchReponse value) {
    return new JAXBElement<FlightSearchReponse>(_FlightSearchReponse_QNAME, FlightSearchReponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PriceStrikeoutSettingsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PriceStrikeoutSettingsEN")
  public JAXBElement<PriceStrikeoutSettingsEN> createPriceStrikeoutSettingsEN(PriceStrikeoutSettingsEN value) {
    return new JAXBElement<PriceStrikeoutSettingsEN>(_PriceStrikeoutSettingsEN_QNAME, PriceStrikeoutSettingsEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialPaxPriceDifference }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfSpecialPaxPriceDifference")
  public JAXBElement<ArrayOfSpecialPaxPriceDifference> createArrayOfSpecialPaxPriceDifference(ArrayOfSpecialPaxPriceDifference value) {
    return new JAXBElement<ArrayOfSpecialPaxPriceDifference>(_ArrayOfSpecialPaxPriceDifference_QNAME, ArrayOfSpecialPaxPriceDifference.class, null,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ReservationDetails }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ReservationDetails")
  public JAXBElement<ReservationDetails> createReservationDetails(ReservationDetails value) {
    return new JAXBElement<ReservationDetails>(_ReservationDetails_QNAME, ReservationDetails.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerUserCardTypesEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfCustomerUserCardTypesEN")
  public JAXBElement<ArrayOfCustomerUserCardTypesEN> createArrayOfCustomerUserCardTypesEN(ArrayOfCustomerUserCardTypesEN value) {
    return new JAXBElement<ArrayOfCustomerUserCardTypesEN>(_ArrayOfCustomerUserCardTypesEN_QNAME, ArrayOfCustomerUserCardTypesEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPILoungeSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAPI_LoungeSegment")
  public JAXBElement<ArrayOfAPILoungeSegment> createArrayOfAPILoungeSegment(ArrayOfAPILoungeSegment value) {
    return new JAXBElement<ArrayOfAPILoungeSegment>(_ArrayOfAPILoungeSegment_QNAME, ArrayOfAPILoungeSegment.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link GDSFlightSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "GDS_FlightSegment")
  public JAXBElement<GDSFlightSegment> createGDSFlightSegment(GDSFlightSegment value) {
    return new JAXBElement<GDSFlightSegment>(_GDSFlightSegment_QNAME, GDSFlightSegment.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link DisClosureAirline }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DisClosureAirline")
  public JAXBElement<DisClosureAirline> createDisClosureAirline(DisClosureAirline value) {
    return new JAXBElement<DisClosureAirline>(_DisClosureAirline_QNAME, DisClosureAirline.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFareGroupFlight }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfFareGroupFlight")
  public JAXBElement<ArrayOfFareGroupFlight> createArrayOfFareGroupFlight(ArrayOfFareGroupFlight value) {
    return new JAXBElement<ArrayOfFareGroupFlight>(_ArrayOfFareGroupFlight_QNAME, ArrayOfFareGroupFlight.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AirlineFlight }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AirlineFlight")
  public JAXBElement<AirlineFlight> createAirlineFlight(AirlineFlight value) {
    return new JAXBElement<AirlineFlight>(_AirlineFlight_QNAME, AirlineFlight.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIMealAvailability }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_MealAvailability")
  public JAXBElement<APIMealAvailability> createAPIMealAvailability(APIMealAvailability value) {
    return new JAXBElement<APIMealAvailability>(_APIMealAvailability_QNAME, APIMealAvailability.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link RouteFreeBaggageAllowance }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "RouteFreeBaggageAllowance")
  public JAXBElement<RouteFreeBaggageAllowance> createRouteFreeBaggageAllowance(RouteFreeBaggageAllowance value) {
    return new JAXBElement<RouteFreeBaggageAllowance>(_RouteFreeBaggageAllowance_QNAME, RouteFreeBaggageAllowance.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ConsentEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ConsentEN")
  public JAXBElement<ConsentEN> createConsentEN(ConsentEN value) {
    return new JAXBElement<ConsentEN>(_ConsentEN_QNAME, ConsentEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CreditCardsEN")
  public JAXBElement<CreditCardsEN> createCreditCardsEN(CreditCardsEN value) {
    return new JAXBElement<CreditCardsEN>(_CreditCardsEN_QNAME, CreditCardsEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AirlineFlightSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AirlineFlightSegment")
  public JAXBElement<AirlineFlightSegment> createAirlineFlightSegment(AirlineFlightSegment value) {
    return new JAXBElement<AirlineFlightSegment>(_AirlineFlightSegment_QNAME, AirlineFlightSegment.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlightReservationSegmentsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfFlightReservationSegmentsEN")
  public JAXBElement<ArrayOfFlightReservationSegmentsEN> createArrayOfFlightReservationSegmentsEN(ArrayOfFlightReservationSegmentsEN value) {
    return new JAXBElement<ArrayOfFlightReservationSegmentsEN>(_ArrayOfFlightReservationSegmentsEN_QNAME, ArrayOfFlightReservationSegmentsEN.class,
        null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPackageSummary }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfPackageSummary")
  public JAXBElement<ArrayOfPackageSummary> createArrayOfPackageSummary(ArrayOfPackageSummary value) {
    return new JAXBElement<ArrayOfPackageSummary>(_ArrayOfPackageSummary_QNAME, ArrayOfPackageSummary.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPIBaggageInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAPI_BaggageInfo")
  public JAXBElement<ArrayOfAPIBaggageInfo> createArrayOfAPIBaggageInfo(ArrayOfAPIBaggageInfo value) {
    return new JAXBElement<ArrayOfAPIBaggageInfo>(_ArrayOfAPIBaggageInfo_QNAME, ArrayOfAPIBaggageInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFreeBaggageAllowanceEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfFreeBaggageAllowanceEN")
  public JAXBElement<ArrayOfFreeBaggageAllowanceEN> createArrayOfFreeBaggageAllowanceEN(ArrayOfFreeBaggageAllowanceEN value) {
    return new JAXBElement<ArrayOfFreeBaggageAllowanceEN>(_ArrayOfFreeBaggageAllowanceEN_QNAME, ArrayOfFreeBaggageAllowanceEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPIInsuranceURL }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAPI_InsuranceURL")
  public JAXBElement<ArrayOfAPIInsuranceURL> createArrayOfAPIInsuranceURL(ArrayOfAPIInsuranceURL value) {
    return new JAXBElement<ArrayOfAPIInsuranceURL>(_ArrayOfAPIInsuranceURL_QNAME, ArrayOfAPIInsuranceURL.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link EnumReRouteType }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils", name = "EnumReRouteType")
  public JAXBElement<EnumReRouteType> createEnumReRouteType(EnumReRouteType value) {
    return new JAXBElement<EnumReRouteType>(_EnumReRouteType_QNAME, EnumReRouteType.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APISelectedSeat }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_SelectedSeat")
  public JAXBElement<APISelectedSeat> createAPISelectedSeat(APISelectedSeat value) {
    return new JAXBElement<APISelectedSeat>(_APISelectedSeat_QNAME, APISelectedSeat.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FreeBaggageAllowance }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FreeBaggageAllowance")
  public JAXBElement<FreeBaggageAllowance> createFreeBaggageAllowance(FreeBaggageAllowance value) {
    return new JAXBElement<FreeBaggageAllowance>(_FreeBaggageAllowance_QNAME, FreeBaggageAllowance.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAirlineFlightSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAirlineFlightSegment")
  public JAXBElement<ArrayOfAirlineFlightSegment> createArrayOfAirlineFlightSegment(ArrayOfAirlineFlightSegment value) {
    return new JAXBElement<ArrayOfAirlineFlightSegment>(_ArrayOfAirlineFlightSegment_QNAME, ArrayOfAirlineFlightSegment.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FareRulesEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FareRulesEN")
  public JAXBElement<FareRulesEN> createFareRulesEN(FareRulesEN value) {
    return new JAXBElement<FareRulesEN>(_FareRulesEN_QNAME, FareRulesEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SMSSettingsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SMSSettingsEN")
  public JAXBElement<SMSSettingsEN> createSMSSettingsEN(SMSSettingsEN value) {
    return new JAXBElement<SMSSettingsEN>(_SMSSettingsEN_QNAME, SMSSettingsEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APICancelBookingRequest }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "APICancelBookingRequest")
  public JAXBElement<APICancelBookingRequest> createAPICancelBookingRequest(APICancelBookingRequest value) {
    return new JAXBElement<APICancelBookingRequest>(_APICancelBookingRequest_QNAME, APICancelBookingRequest.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AirlineMLFlightLeg }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AirlineMLFlightLeg")
  public JAXBElement<AirlineMLFlightLeg> createAirlineMLFlightLeg(AirlineMLFlightLeg value) {
    return new JAXBElement<AirlineMLFlightLeg>(_AirlineMLFlightLeg_QNAME, AirlineMLFlightLeg.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Result")
  public JAXBElement<Result> createResult(Result value) {
    return new JAXBElement<Result>(_Result_QNAME, Result.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlights }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfFlights")
  public JAXBElement<ArrayOfFlights> createArrayOfFlights(ArrayOfFlights value) {
    return new JAXBElement<ArrayOfFlights>(_ArrayOfFlights_QNAME, ArrayOfFlights.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIBaggageInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_BaggageInfo")
  public JAXBElement<APIBaggageInfo> createAPIBaggageInfo(APIBaggageInfo value) {
    return new JAXBElement<APIBaggageInfo>(_APIBaggageInfo_QNAME, APIBaggageInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialService }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfSpecialService")
  public JAXBElement<ArrayOfSpecialService> createArrayOfSpecialService(ArrayOfSpecialService value) {
    return new JAXBElement<ArrayOfSpecialService>(_ArrayOfSpecialService_QNAME, ArrayOfSpecialService.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightReservationEN")
  public JAXBElement<FlightReservationEN> createFlightReservationEN(FlightReservationEN value) {
    return new JAXBElement<FlightReservationEN>(_FlightReservationEN_QNAME, FlightReservationEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PassengersEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PassengersEN")
  public JAXBElement<PassengersEN> createPassengersEN(PassengersEN value) {
    return new JAXBElement<PassengersEN>(_PassengersEN_QNAME, PassengersEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BookingChargesInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "BookingChargesInfo")
  public JAXBElement<BookingChargesInfo> createBookingChargesInfo(BookingChargesInfo value) {
    return new JAXBElement<BookingChargesInfo>(_BookingChargesInfo_QNAME, BookingChargesInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AirlineMealSelectionEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "AirlineMealSelectionEN")
  public JAXBElement<AirlineMealSelectionEN> createAirlineMealSelectionEN(AirlineMealSelectionEN value) {
    return new JAXBElement<AirlineMealSelectionEN>(_AirlineMealSelectionEN_QNAME, AirlineMealSelectionEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIInsuranceAvailability }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_InsuranceAvailability")
  public JAXBElement<APIInsuranceAvailability> createAPIInsuranceAvailability(APIInsuranceAvailability value) {
    return new JAXBElement<APIInsuranceAvailability>(_APIInsuranceAvailability_QNAME, APIInsuranceAvailability.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIMultiCitySetSelectedFlights }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_MultiCitySetSelectedFlights")
  public JAXBElement<APIMultiCitySetSelectedFlights> createAPIMultiCitySetSelectedFlights(APIMultiCitySetSelectedFlights value) {
    return new JAXBElement<APIMultiCitySetSelectedFlights>(_APIMultiCitySetSelectedFlights_QNAME, APIMultiCitySetSelectedFlights.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APISeatInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_SeatInfo")
  public JAXBElement<APISeatInfo> createAPISeatInfo(APISeatInfo value) {
    return new JAXBElement<APISeatInfo>(_APISeatInfo_QNAME, APISeatInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ReservationPromoCodesEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationPromoCodesEN")
  public JAXBElement<ReservationPromoCodesEN> createReservationPromoCodesEN(ReservationPromoCodesEN value) {
    return new JAXBElement<ReservationPromoCodesEN>(_ReservationPromoCodesEN_QNAME, ReservationPromoCodesEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FreeBaggageAllowanceEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FreeBaggageAllowanceEN")
  public JAXBElement<FreeBaggageAllowanceEN> createFreeBaggageAllowanceEN(FreeBaggageAllowanceEN value) {
    return new JAXBElement<FreeBaggageAllowanceEN>(_FreeBaggageAllowanceEN_QNAME, FreeBaggageAllowanceEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIAddonAvailabilityReq }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_AddonAvailabilityReq")
  public JAXBElement<APIAddonAvailabilityReq> createAPIAddonAvailabilityReq(APIAddonAvailabilityReq value) {
    return new JAXBElement<APIAddonAvailabilityReq>(_APIAddonAvailabilityReq_QNAME, APIAddonAvailabilityReq.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIAddonAvailabilityRes }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_AddonAvailabilityRes")
  public JAXBElement<APIAddonAvailabilityRes> createAPIAddonAvailabilityRes(APIAddonAvailabilityRes value) {
    return new JAXBElement<APIAddonAvailabilityRes>(_APIAddonAvailabilityRes_QNAME, APIAddonAvailabilityRes.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link MultiFlightSearchReponse }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MultiFlightSearchReponse")
  public JAXBElement<MultiFlightSearchReponse> createMultiFlightSearchReponse(MultiFlightSearchReponse value) {
    return new JAXBElement<MultiFlightSearchReponse>(_MultiFlightSearchReponse_QNAME, MultiFlightSearchReponse.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PromotionInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PromotionInfo")
  public JAXBElement<PromotionInfo> createPromotionInfo(PromotionInfo value) {
    return new JAXBElement<PromotionInfo>(_PromotionInfo_QNAME, PromotionInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGSTBreakDownInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfGSTBreakDownInfo")
  public JAXBElement<ArrayOfGSTBreakDownInfo> createArrayOfGSTBreakDownInfo(ArrayOfGSTBreakDownInfo value) {
    return new JAXBElement<ArrayOfGSTBreakDownInfo>(_ArrayOfGSTBreakDownInfo_QNAME, ArrayOfGSTBreakDownInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISeatSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAPI_SeatSegment")
  public JAXBElement<ArrayOfAPISeatSegment> createArrayOfAPISeatSegment(ArrayOfAPISeatSegment value) {
    return new JAXBElement<ArrayOfAPISeatSegment>(_ArrayOfAPISeatSegment_QNAME, ArrayOfAPISeatSegment.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIBaggageAvailability }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_BaggageAvailability")
  public JAXBElement<APIBaggageAvailability> createAPIBaggageAvailability(APIBaggageAvailability value) {
    return new JAXBElement<APIBaggageAvailability>(_APIBaggageAvailability_QNAME, APIBaggageAvailability.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlightReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfFlightReservationEN")
  public JAXBElement<ArrayOfFlightReservationEN> createArrayOfFlightReservationEN(ArrayOfFlightReservationEN value) {
    return new JAXBElement<ArrayOfFlightReservationEN>(_ArrayOfFlightReservationEN_QNAME, ArrayOfFlightReservationEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link GetUpdatedBookingDetailsRequest }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "GetUpdatedBookingDetailsRequest")
  public JAXBElement<GetUpdatedBookingDetailsRequest> createGetUpdatedBookingDetailsRequest(GetUpdatedBookingDetailsRequest value) {
    return new JAXBElement<GetUpdatedBookingDetailsRequest>(_GetUpdatedBookingDetailsRequest_QNAME, GetUpdatedBookingDetailsRequest.class, null,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link InstallmentPaymentSettingsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "InstallmentPaymentSettingsEN")
  public JAXBElement<InstallmentPaymentSettingsEN> createInstallmentPaymentSettingsEN(InstallmentPaymentSettingsEN value) {
    return new JAXBElement<InstallmentPaymentSettingsEN>(_InstallmentPaymentSettingsEN_QNAME, InstallmentPaymentSettingsEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CustUserPaymentType }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils", name = "CustUserPaymentType")
  public JAXBElement<CustUserPaymentType> createCustUserPaymentType(CustUserPaymentType value) {
    return new JAXBElement<CustUserPaymentType>(_CustUserPaymentType_QNAME, CustUserPaymentType.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightAddOnBookingStatus }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightAddOnBookingStatus")
  public JAXBElement<FlightAddOnBookingStatus> createFlightAddOnBookingStatus(FlightAddOnBookingStatus value) {
    return new JAXBElement<FlightAddOnBookingStatus>(_FlightAddOnBookingStatus_QNAME, FlightAddOnBookingStatus.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightError }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FlightError")
  public JAXBElement<FlightError> createFlightError(FlightError value) {
    return new JAXBElement<FlightError>(_FlightError_QNAME, FlightError.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BookedProducts }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BookedProducts")
  public JAXBElement<BookedProducts> createBookedProducts(BookedProducts value) {
    return new JAXBElement<BookedProducts>(_BookedProducts_QNAME, BookedProducts.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightSearchCriteriaRQ }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FlightSearchCriteria")
  public JAXBElement<FlightSearchCriteriaRQ> createFlightSearchCriteria(FlightSearchCriteriaRQ value) {
    return new JAXBElement<FlightSearchCriteriaRQ>(_FlightSearchCriteria_QNAME, FlightSearchCriteriaRQ.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Message")
  public JAXBElement<Message> createMessage(Message value) {
    return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BookingPriceBreakDownEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BookingPriceBreakDownEN")
  public JAXBElement<BookingPriceBreakDownEN> createBookingPriceBreakDownEN(BookingPriceBreakDownEN value) {
    return new JAXBElement<BookingPriceBreakDownEN>(_BookingPriceBreakDownEN_QNAME, BookingPriceBreakDownEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link UnCombinedFareBasis }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "UnCombinedFareBasis")
  public JAXBElement<UnCombinedFareBasis> createUnCombinedFareBasis(UnCombinedFareBasis value) {
    return new JAXBElement<UnCombinedFareBasis>(_UnCombinedFareBasis_QNAME, UnCombinedFareBasis.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PriceInformation }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PriceInformation")
  public JAXBElement<PriceInformation> createPriceInformation(PriceInformation value) {
    return new JAXBElement<PriceInformation>(_PriceInformation_QNAME, PriceInformation.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISelectedBaggages }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAPI_SelectedBaggages")
  public JAXBElement<ArrayOfAPISelectedBaggages> createArrayOfAPISelectedBaggages(ArrayOfAPISelectedBaggages value) {
    return new JAXBElement<ArrayOfAPISelectedBaggages>(_ArrayOfAPISelectedBaggages_QNAME, ArrayOfAPISelectedBaggages.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaxBreakDownInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfTaxBreakDownInfo")
  public JAXBElement<ArrayOfTaxBreakDownInfo> createArrayOfTaxBreakDownInfo(ArrayOfTaxBreakDownInfo value) {
    return new JAXBElement<ArrayOfTaxBreakDownInfo>(_ArrayOfTaxBreakDownInfo_QNAME, ArrayOfTaxBreakDownInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SpecialPaxPriceDifference }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SpecialPaxPriceDifference")
  public JAXBElement<SpecialPaxPriceDifference> createSpecialPaxPriceDifference(SpecialPaxPriceDifference value) {
    return new JAXBElement<SpecialPaxPriceDifference>(_SpecialPaxPriceDifference_QNAME, SpecialPaxPriceDifference.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SpecialService }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SpecialService")
  public JAXBElement<SpecialService> createSpecialService(SpecialService value) {
    return new JAXBElement<SpecialService>(_SpecialService_QNAME, SpecialService.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link B2BCompanyDetails }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "B2BCompanyDetails")
  public JAXBElement<B2BCompanyDetails> createB2BCompanyDetails(B2BCompanyDetails value) {
    return new JAXBElement<B2BCompanyDetails>(_B2BCompanyDetails_QNAME, B2BCompanyDetails.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPIBaggageSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAPI_BaggageSegment")
  public JAXBElement<ArrayOfAPIBaggageSegment> createArrayOfAPIBaggageSegment(ArrayOfAPIBaggageSegment value) {
    return new JAXBElement<ArrayOfAPIBaggageSegment>(_ArrayOfAPIBaggageSegment_QNAME, ArrayOfAPIBaggageSegment.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlightReservationEticketEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfFlightReservationEticketEN")
  public JAXBElement<ArrayOfFlightReservationEticketEN> createArrayOfFlightReservationEticketEN(ArrayOfFlightReservationEticketEN value) {
    return new JAXBElement<ArrayOfFlightReservationEticketEN>(_ArrayOfFlightReservationEticketEN_QNAME, ArrayOfFlightReservationEticketEN.class, null,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISelectedMeals }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAPI_SelectedMeals")
  public JAXBElement<ArrayOfAPISelectedMeals> createArrayOfAPISelectedMeals(ArrayOfAPISelectedMeals value) {
    return new JAXBElement<ArrayOfAPISelectedMeals>(_ArrayOfAPISelectedMeals_QNAME, ArrayOfAPISelectedMeals.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CardTypesEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CardTypesEN")
  public JAXBElement<CardTypesEN> createCardTypesEN(CardTypesEN value) {
    return new JAXBElement<CardTypesEN>(_CardTypesEN_QNAME, CardTypesEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link CustomerUserCardTypesEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CustomerUserCardTypesEN")
  public JAXBElement<CustomerUserCardTypesEN> createCustomerUserCardTypesEN(CustomerUserCardTypesEN value) {
    return new JAXBElement<CustomerUserCardTypesEN>(_CustomerUserCardTypesEN_QNAME, CustomerUserCardTypesEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link MultiCitySetSelectedFlight }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MultiCitySetSelectedFlight")
  public JAXBElement<MultiCitySetSelectedFlight> createMultiCitySetSelectedFlight(MultiCitySetSelectedFlight value) {
    return new JAXBElement<MultiCitySetSelectedFlight>(_MultiCitySetSelectedFlight_QNAME, MultiCitySetSelectedFlight.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAirlineFlight }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfAirlineFlight")
  public JAXBElement<ArrayOfAirlineFlight> createArrayOfAirlineFlight(ArrayOfAirlineFlight value) {
    return new JAXBElement<ArrayOfAirlineFlight>(_ArrayOfAirlineFlight_QNAME, ArrayOfAirlineFlight.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaxPriceBreakDown }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfPaxPriceBreakDown")
  public JAXBElement<ArrayOfPaxPriceBreakDown> createArrayOfPaxPriceBreakDown(ArrayOfPaxPriceBreakDown value) {
    return new JAXBElement<ArrayOfPaxPriceBreakDown>(_ArrayOfPaxPriceBreakDown_QNAME, ArrayOfPaxPriceBreakDown.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPerPaxPriceInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfPerPaxPriceInfo")
  public JAXBElement<ArrayOfPerPaxPriceInfo> createArrayOfPerPaxPriceInfo(ArrayOfPerPaxPriceInfo value) {
    return new JAXBElement<ArrayOfPerPaxPriceInfo>(_ArrayOfPerPaxPriceInfo_QNAME, ArrayOfPerPaxPriceInfo.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link GSTReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "GSTReservationEN")
  public JAXBElement<GSTReservationEN> createGSTReservationEN(GSTReservationEN value) {
    return new JAXBElement<GSTReservationEN>(_GSTReservationEN_QNAME, GSTReservationEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Baggages }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Baggages")
  public JAXBElement<Baggages> createBaggages(Baggages value) {
    return new JAXBElement<Baggages>(_Baggages_QNAME, Baggages.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APISelectedBaggages }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "API_SelectedBaggages")
  public JAXBElement<APISelectedBaggages> createAPISelectedBaggages(APISelectedBaggages value) {
    return new JAXBElement<APISelectedBaggages>(_APISelectedBaggages_QNAME, APISelectedBaggages.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerUserPaymentMethodsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrayOfCustomerUserPaymentMethodsEN")
  public JAXBElement<ArrayOfCustomerUserPaymentMethodsEN> createArrayOfCustomerUserPaymentMethodsEN(ArrayOfCustomerUserPaymentMethodsEN value) {
    return new JAXBElement<ArrayOfCustomerUserPaymentMethodsEN>(_ArrayOfCustomerUserPaymentMethodsEN_QNAME, ArrayOfCustomerUserPaymentMethodsEN.class,
        null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlightSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrayOfFlightSegment")
  public JAXBElement<ArrayOfFlightSegment> createArrayOfFlightSegment(ArrayOfFlightSegment value) {
    return new JAXBElement<ArrayOfFlightSegment>(_ArrayOfFlightSegment_QNAME, ArrayOfFlightSegment.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightReservationEticketEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightReservationEticketEN")
  public JAXBElement<FlightReservationEticketEN> createFlightReservationEticketEN(FlightReservationEticketEN value) {
    return new JAXBElement<FlightReservationEticketEN>(_FlightReservationEticketEN_QNAME, FlightReservationEticketEN.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationID", scope = FareRulesEN.class)
  public JAXBElement<String> createFareRulesENReservationID(String value) {
    return new JAXBElement<String>(_FareRulesENReservationID_QNAME, String.class, FareRulesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Description", scope = FareRulesEN.class)
  public JAXBElement<String> createFareRulesENDescription(String value) {
    return new JAXBElement<String>(_FareRulesENDescription_QNAME, String.class, FareRulesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Subject", scope = FareRulesEN.class)
  public JAXBElement<String> createFareRulesENSubject(String value) {
    return new JAXBElement<String>(_FareRulesENSubject_QNAME, String.class, FareRulesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = FareRulesEN.class)
  public JAXBElement<Result> createFareRulesENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, FareRulesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "GWOrganizationName", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENGWOrganizationName(String value) {
    return new JAXBElement<String>(_PassengersENGWOrganizationName_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FFNo", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENFFNo(String value) {
    return new JAXBElement<String>(_PassengersENFFNo_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Email", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENEmail(String value) {
    return new JAXBElement<String>(_PassengersENEmail_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Gender", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENGender(String value) {
    return new JAXBElement<String>(_PassengersENGender_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "NameNumber", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENNameNumber(String value) {
    return new JAXBElement<String>(_PassengersENNameNumber_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Seating", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENSeating(String value) {
    return new JAXBElement<String>(_PassengersENSeating_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "selectedLionFast", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENSelectedLionFast(String value) {
    return new JAXBElement<String>(_PassengersENSelectedLionFast_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Assistance", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENAssistance(String value) {
    return new JAXBElement<String>(_PassengersENAssistance_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SpecialType", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENSpecialType(String value) {
    return new JAXBElement<String>(_PassengersENSpecialType_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "IBMeal", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENIBMeal(String value) {
    return new JAXBElement<String>(_PassengersENIBMeal_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SelectedLounge", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENSelectedLounge(String value) {
    return new JAXBElement<String>(_PassengersENSelectedLounge_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SeatingCode", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENSeatingCode(String value) {
    return new JAXBElement<String>(_PassengersENSeatingCode_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DocumentID", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENDocumentID(String value) {
    return new JAXBElement<String>(_PassengersENDocumentID_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FFNoErrMsg", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENFFNoErrMsg(String value) {
    return new JAXBElement<String>(_PassengersENFFNoErrMsg_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "InsDocumentId", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENInsDocumentId(String value) {
    return new JAXBElement<String>(_PassengersENInsDocumentId_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ContactNoType", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENContactNoType(String value) {
    return new JAXBElement<String>(_PassengersENContactNoType_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PassportCountryCode", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENPassportCountryCode(String value) {
    return new JAXBElement<String>(_PassengersENPassportCountryCode_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "IBMealCode", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENIBMealCode(String value) {
    return new JAXBElement<String>(_PassengersENIBMealCode_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SelectedExpCheckin", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENSelectedExpCheckin(String value) {
    return new JAXBElement<String>(_PassengersENSelectedExpCheckin_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Meal", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENMeal(String value) {
    return new JAXBElement<String>(_PassengersENMeal_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "NationalityCode", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENNationalityCode(String value) {
    return new JAXBElement<String>(_PassengersENNationalityCode_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SelectedTaxi", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENSelectedTaxi(String value) {
    return new JAXBElement<String>(_PassengersENSelectedTaxi_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SelectedComfyKit", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENSelectedComfyKit(String value) {
    return new JAXBElement<String>(_PassengersENSelectedComfyKit_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "InsDocumentType", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENInsDocumentType(String value) {
    return new JAXBElement<String>(_PassengersENInsDocumentType_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FFNoPassword", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENFFNoPassword(String value) {
    return new JAXBElement<String>(_PassengersENFFNoPassword_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "LoyaltyPrefLang", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENLoyaltyPrefLang(String value) {
    return new JAXBElement<String>(_PassengersENLoyaltyPrefLang_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SelectedSeats", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENSelectedSeats(String value) {
    return new JAXBElement<String>(_PassengersENSelectedSeats_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DocType", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENDocType(String value) {
    return new JAXBElement<String>(_PassengersENDocType_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "IBSeatingCode", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENIBSeatingCode(String value) {
    return new JAXBElement<String>(_PassengersENIBSeatingCode_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MealCode", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENMealCode(String value) {
    return new JAXBElement<String>(_PassengersENMealCode_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PaxSuffix", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENPaxSuffix(String value) {
    return new JAXBElement<String>(_PassengersENPaxSuffix_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FirstName", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENFirstName(String value) {
    return new JAXBElement<String>(_PassengersENFirstName_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MobileNo", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENMobileNo(String value) {
    return new JAXBElement<String>(_PassengersENMobileNo_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ModifiedDetails", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENModifiedDetails(String value) {
    return new JAXBElement<String>(_PassengersENModifiedDetails_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SurName", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENSurName(String value) {
    return new JAXBElement<String>(_PassengersENSurName_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Nationality", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENNationality(String value) {
    return new JAXBElement<String>(_PassengersENNationality_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FFType", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENFFType(String value) {
    return new JAXBElement<String>(_PassengersENFFType_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FFTypeCode", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENFFTypeCode(String value) {
    return new JAXBElement<String>(_PassengersENFFTypeCode_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Title", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENTitle(String value) {
    return new JAXBElement<String>(_PassengersENTitle_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationID", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENReservationID(String value) {
    return new JAXBElement<String>(_FareRulesENReservationID_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PassportNo", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENPassportNo(String value) {
    return new JAXBElement<String>(_PassengersENPassportNo_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ImpRating", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENImpRating(String value) {
    return new JAXBElement<String>(_PassengersENImpRating_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Occupation", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENOccupation(String value) {
    return new JAXBElement<String>(_PassengersENOccupation_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PassengerType", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENPassengerType(String value) {
    return new JAXBElement<String>(_PassengersENPassengerType_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "GWGovtID", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENGWGovtID(String value) {
    return new JAXBElement<String>(_PassengersENGWGovtID_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PassportCountry", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENPassportCountry(String value) {
    return new JAXBElement<String>(_PassengersENPassportCountry_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "IBSeating", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENIBSeating(String value) {
    return new JAXBElement<String>(_PassengersENIBSeating_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = PassengersEN.class)
  public JAXBElement<Result> createPassengersENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SelectedMeals", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENSelectedMeals(String value) {
    return new JAXBElement<String>(_PassengersENSelectedMeals_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Tel", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENTel(String value) {
    return new JAXBElement<String>(_PassengersENTel_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PaxeTicket", scope = PassengersEN.class)
  public JAXBElement<String> createPassengersENPaxeTicket(String value) {
    return new JAXBElement<String>(_PassengersENPaxeTicket_QNAME, String.class, PassengersEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "OBClass", scope = MultiCitySetSelectedFlight.class)
  public JAXBElement<String> createMultiCitySetSelectedFlightOBClass(String value) {
    return new JAXBElement<String>(_MultiCitySetSelectedFlightOBClass_QNAME, String.class, MultiCitySetSelectedFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMobileAppLangTextEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MobileInsuranceText", scope = Flights.class)
  public JAXBElement<ArrayOfMobileAppLangTextEN> createFlightsMobileInsuranceText(ArrayOfMobileAppLangTextEN value) {
    return new JAXBElement<ArrayOfMobileAppLangTextEN>(_FlightsMobileInsuranceText_QNAME, ArrayOfMobileAppLangTextEN.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "B2BICode", scope = Flights.class)
  public JAXBElement<String> createFlightsB2BICode(String value) {
    return new JAXBElement<String>(_FlightsB2BICode_QNAME, String.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ParentGroup", scope = Flights.class)
  public JAXBElement<String> createFlightsParentGroup(String value) {
    return new JAXBElement<String>(_FlightsParentGroup_QNAME, String.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlightSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "inBoundFlights", scope = Flights.class)
  public JAXBElement<ArrayOfFlightSegment> createFlightsInBoundFlights(ArrayOfFlightSegment value) {
    return new JAXBElement<ArrayOfFlightSegment>(_FlightsInBoundFlights_QNAME, ArrayOfFlightSegment.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BookingChargesInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "BookingCharges", scope = Flights.class)
  public JAXBElement<BookingChargesInfo> createFlightsBookingCharges(BookingChargesInfo value) {
    return new JAXBElement<BookingChargesInfo>(_FlightsBookingCharges_QNAME, BookingChargesInfo.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FlightDirection", scope = Flights.class)
  public JAXBElement<String> createFlightsFlightDirection(String value) {
    return new JAXBElement<String>(_FlightsFlightDirection_QNAME, String.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FlightClass", scope = Flights.class)
  public JAXBElement<String> createFlightsFlightClass(String value) {
    return new JAXBElement<String>(_FlightsFlightClass_QNAME, String.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFreeBaggageAllowanceEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FreeBaggageAllowances", scope = Flights.class)
  public JAXBElement<ArrayOfFreeBaggageAllowanceEN> createFlightsFreeBaggageAllowances(ArrayOfFreeBaggageAllowanceEN value) {
    return new JAXBElement<ArrayOfFreeBaggageAllowanceEN>(_FlightsFreeBaggageAllowances_QNAME, ArrayOfFreeBaggageAllowanceEN.class, Flights.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AdditionalFareInfo", scope = Flights.class)
  public JAXBElement<String> createFlightsAdditionalFareInfo(String value) {
    return new JAXBElement<String>(_FlightsAdditionalFareInfo_QNAME, String.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaxBreakDownInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "TaxBreakDown", scope = Flights.class)
  public JAXBElement<ArrayOfTaxBreakDownInfo> createFlightsTaxBreakDown(ArrayOfTaxBreakDownInfo value) {
    return new JAXBElement<ArrayOfTaxBreakDownInfo>(_FlightsTaxBreakDown_QNAME, ArrayOfTaxBreakDownInfo.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MK", scope = Flights.class)
  public JAXBElement<String> createFlightsMK(String value) {
    return new JAXBElement<String>(_FlightsMK_QNAME, String.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PriceInformation }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MergedPriceInfo", scope = Flights.class)
  public JAXBElement<PriceInformation> createFlightsMergedPriceInfo(PriceInformation value) {
    return new JAXBElement<PriceInformation>(_FlightsMergedPriceInfo_QNAME, PriceInformation.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MobTermsandCondText", scope = Flights.class)
  public JAXBElement<String> createFlightsMobTermsandCondText(String value) {
    return new JAXBElement<String>(_FlightsMobTermsandCondText_QNAME, String.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SpecialTypePaxCount }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SpecialTypePax", scope = Flights.class)
  public JAXBElement<SpecialTypePaxCount> createFlightsSpecialTypePax(SpecialTypePaxCount value) {
    return new JAXBElement<SpecialTypePaxCount>(_FlightsSpecialTypePax_QNAME, SpecialTypePaxCount.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSegmentFareInfoEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SegmentedFareBreakDown", scope = Flights.class)
  public JAXBElement<ArrayOfSegmentFareInfoEN> createFlightsSegmentedFareBreakDown(ArrayOfSegmentFareInfoEN value) {
    return new JAXBElement<ArrayOfSegmentFareInfoEN>(_FlightsSegmentedFareBreakDown_QNAME, ArrayOfSegmentFareInfoEN.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ActualFareBasisCode", scope = Flights.class)
  public JAXBElement<String> createFlightsActualFareBasisCode(String value) {
    return new JAXBElement<String>(_FlightsActualFareBasisCode_QNAME, String.class, Flights.class, value);
  }

  /**
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "InsuranceInfo", scope = Flights.class)
  public JAXBElement<ArrayOfGQInsuranceRes> createFlightsInsuranceInfo(ArrayOfGQInsuranceRes value) {
    return new JAXBElement<ArrayOfGQInsuranceRes>(_FlightsInsuranceInfo_QNAME, ArrayOfGQInsuranceRes.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PriceInformation }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "priceInfo", scope = Flights.class)
  public JAXBElement<PriceInformation> createFlightsPriceInfo(PriceInformation value) {
    return new JAXBElement<PriceInformation>(_FlightsPriceInfo_QNAME, PriceInformation.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CurrencyCode", scope = Flights.class)
  public JAXBElement<String> createFlightsCurrencyCode(String value) {
    return new JAXBElement<String>(_FlightsCurrencyCode_QNAME, String.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PriceInformation }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "UpdatedPriceInfo", scope = Flights.class)
  public JAXBElement<PriceInformation> createFlightsUpdatedPriceInfo(PriceInformation value) {
    return new JAXBElement<PriceInformation>(_FlightsUpdatedPriceInfo_QNAME, PriceInformation.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlightSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "outBoundFlights", scope = Flights.class)
  public JAXBElement<ArrayOfFlightSegment> createFlightsOutBoundFlights(ArrayOfFlightSegment value) {
    return new JAXBElement<ArrayOfFlightSegment>(_FlightsOutBoundFlights_QNAME, ArrayOfFlightSegment.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMarkupFlightEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MarkupApplied", scope = Flights.class)
  public JAXBElement<ArrayOfMarkupFlightEN> createFlightsMarkupApplied(ArrayOfMarkupFlightEN value) {
    return new JAXBElement<ArrayOfMarkupFlightEN>(_FlightsMarkupApplied_QNAME, ArrayOfMarkupFlightEN.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link StrikeoutInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "StrikeoutInfo", scope = Flights.class)
  public JAXBElement<StrikeoutInfo> createFlightsStrikeoutInfo(StrikeoutInfo value) {
    return new JAXBElement<StrikeoutInfo>(_StrikeoutInfo_QNAME, StrikeoutInfo.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FareType", scope = Flights.class)
  public JAXBElement<String> createFlightsFareType(String value) {
    return new JAXBElement<String>(_FlightsFareType_QNAME, String.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FGKey", scope = Flights.class)
  public JAXBElement<String> createFlightsFGKey(String value) {
    return new JAXBElement<String>(_FlightsFGKey_QNAME, String.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link InsuranceGSTInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "InsuranceGST", scope = Flights.class)
  public JAXBElement<InsuranceGSTInfo> createFlightsInsuranceGST(InsuranceGSTInfo value) {
    return new JAXBElement<InsuranceGSTInfo>(_FlightsInsuranceGST_QNAME, InsuranceGSTInfo.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnCombinedFareBasis }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "UnCombineFares", scope = Flights.class)
  public JAXBElement<ArrayOfUnCombinedFareBasis> createFlightsUnCombineFares(ArrayOfUnCombinedFareBasis value) {
    return new JAXBElement<ArrayOfUnCombinedFareBasis>(_FlightsUnCombineFares_QNAME, ArrayOfUnCombinedFareBasis.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FareBasisCode", scope = Flights.class)
  public JAXBElement<String> createFlightsFareBasisCode(String value) {
    return new JAXBElement<String>(_FlightsFareBasisCode_QNAME, String.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "B2BDCode", scope = Flights.class)
  public JAXBElement<String> createFlightsB2BDCode(String value) {
    return new JAXBElement<String>(_FlightsB2BDCode_QNAME, String.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispCurrencyCode", scope = Flights.class)
  public JAXBElement<String> createFlightsDispCurrencyCode(String value) {
    return new JAXBElement<String>(_FlightsDispCurrencyCode_QNAME, String.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightError }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "BookingError", scope = Flights.class)
  public JAXBElement<FlightError> createFlightsBookingError(FlightError value) {
    return new JAXBElement<FlightError>(_FlightsBookingError_QNAME, FlightError.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ResultMsg", scope = Flights.class)
  public JAXBElement<Result> createFlightsResultMsg(Result value) {
    return new JAXBElement<Result>(_FlightsResultMsg_QNAME, Result.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGSTBreakDownInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "GSTBreakDown", scope = Flights.class)
  public JAXBElement<ArrayOfGSTBreakDownInfo> createFlightsGSTBreakDown(ArrayOfGSTBreakDownInfo value) {
    return new JAXBElement<ArrayOfGSTBreakDownInfo>(_FlightsGSTBreakDown_QNAME, ArrayOfGSTBreakDownInfo.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FGCode", scope = Flights.class)
  public JAXBElement<String> createFlightsFGCode(String value) {
    return new JAXBElement<String>(_FlightsFGCode_QNAME, String.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PromotionInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AppliedPromotionInfo", scope = Flights.class)
  public JAXBElement<PromotionInfo> createFlightsAppliedPromotionInfo(PromotionInfo value) {
    return new JAXBElement<PromotionInfo>(_FlightsAppliedPromotionInfo_QNAME, PromotionInfo.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link MobileAppLangTextEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MobAppLangText", scope = Flights.class)
  public JAXBElement<MobileAppLangTextEN> createFlightsMobAppLangText(MobileAppLangTextEN value) {
    return new JAXBElement<MobileAppLangTextEN>(_FlightsMobAppLangText_QNAME, MobileAppLangTextEN.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ClassCode", scope = Flights.class)
  public JAXBElement<String> createFlightsClassCode(String value) {
    return new JAXBElement<String>(_FlightsClassCode_QNAME, String.class, Flights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ErrMsg", scope = FlightError.class)
  public JAXBElement<String> createFlightErrorErrMsg(String value) {
    return new JAXBElement<String>(_FlightErrorErrMsg_QNAME, String.class, FlightError.class, value);
  }

  /**
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SegmentIndex", scope = APISelectedBaggages.class)
  public JAXBElement<ArrayOfint> createAPISelectedBaggagesSegmentIndex(ArrayOfint value) {
    return new JAXBElement<ArrayOfint>(_APISelectedBaggagesSegmentIndex_QNAME, ArrayOfint.class, APISelectedBaggages.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIAddonSetSelectedReq }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SelectedAddons", scope = APIAddonSetSelectedRes.class)
  public JAXBElement<APIAddonSetSelectedReq> createAPIAddonSetSelectedResSelectedAddons(APIAddonSetSelectedReq value) {
    return new JAXBElement<APIAddonSetSelectedReq>(_APIAddonSetSelectedResSelectedAddons_QNAME, APIAddonSetSelectedReq.class,
        APIAddonSetSelectedRes.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ErrorMsg", scope = APIAddonSetSelectedRes.class)
  public JAXBElement<String> createAPIAddonSetSelectedResErrorMsg(String value) {
    return new JAXBElement<String>(_APIAddonSetSelectedResErrorMsg_QNAME, String.class, APIAddonSetSelectedRes.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ErrorMsg", scope = APICancelBookingResponse.class)
  public JAXBElement<String> createAPICancelBookingResponseErrorMsg(String value) {
    return new JAXBElement<String>(_APICancelBookingResponseErrorMsg_QNAME, String.class, APICancelBookingResponse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispPerPaxCharge", scope = PaxTypeCharge.class)
  public JAXBElement<String> createPaxTypeChargeDispPerPaxCharge(String value) {
    return new JAXBElement<String>(_PaxTypeChargeDispPerPaxCharge_QNAME, String.class, PaxTypeCharge.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PaxType", scope = PaxTypeCharge.class)
  public JAXBElement<String> createPaxTypeChargePaxType(String value) {
    return new JAXBElement<String>(_PaxTypeChargePaxType_QNAME, String.class, PaxTypeCharge.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispCurrency", scope = PaxTypeCharge.class)
  public JAXBElement<String> createPaxTypeChargeDispCurrency(String value) {
    return new JAXBElement<String>(_PaxTypeChargeDispCurrency_QNAME, String.class, PaxTypeCharge.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Description", scope = PaxTypeCharge.class)
  public JAXBElement<String> createPaxTypeChargeDescription(String value) {
    return new JAXBElement<String>(_PaxTypeChargeDescription_QNAME, String.class, PaxTypeCharge.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispTotalCharge", scope = PaxTypeCharge.class)
  public JAXBElement<String> createPaxTypeChargeDispTotalCharge(String value) {
    return new JAXBElement<String>(_PaxTypeChargeDispTotalCharge_QNAME, String.class, PaxTypeCharge.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CurrencyCode", scope = PaxTypeCharge.class)
  public JAXBElement<String> createPaxTypeChargeCurrencyCode(String value) {
    return new JAXBElement<String>(_FlightsCurrencyCode_QNAME, String.class, PaxTypeCharge.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepartureCity", scope = AirlineMLFlightLeg.class)
  public JAXBElement<String> createAirlineMLFlightLegDepartureCity(String value) {
    return new JAXBElement<String>(_AirlineMLFlightLegDepartureCity_QNAME, String.class, AirlineMLFlightLeg.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAirlineFlight }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AvailFlights", scope = AirlineMLFlightLeg.class)
  public JAXBElement<ArrayOfAirlineFlight> createAirlineMLFlightLegAvailFlights(ArrayOfAirlineFlight value) {
    return new JAXBElement<ArrayOfAirlineFlight>(_AirlineMLFlightLegAvailFlights_QNAME, ArrayOfAirlineFlight.class, AirlineMLFlightLeg.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArraivalCity", scope = AirlineMLFlightLeg.class)
  public JAXBElement<String> createAirlineMLFlightLegArraivalCity(String value) {
    return new JAXBElement<String>(_AirlineMLFlightLegArraivalCity_QNAME, String.class, AirlineMLFlightLeg.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AirlineFlight }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SelectedAirlineFlight", scope = AirlineMLFlightLeg.class)
  public JAXBElement<AirlineFlight> createAirlineMLFlightLegSelectedAirlineFlight(AirlineFlight value) {
    return new JAXBElement<AirlineFlight>(_AirlineMLFlightLegSelectedAirlineFlight_QNAME, AirlineFlight.class, AirlineMLFlightLeg.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "TaxCurrencyCode", scope = GSTBreakDownInfo.class)
  public JAXBElement<String> createGSTBreakDownInfoTaxCurrencyCode(String value) {
    return new JAXBElement<String>(_GSTBreakDownInfoTaxCurrencyCode_QNAME, String.class, GSTBreakDownInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "TaxCode", scope = GSTBreakDownInfo.class)
  public JAXBElement<String> createGSTBreakDownInfoTaxCode(String value) {
    return new JAXBElement<String>(_GSTBreakDownInfoTaxCode_QNAME, String.class, GSTBreakDownInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Description", scope = GSTBreakDownInfo.class)
  public JAXBElement<String> createGSTBreakDownInfoDescription(String value) {
    return new JAXBElement<String>(_PaxTypeChargeDescription_QNAME, String.class, GSTBreakDownInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CurrencyCode", scope = GSTBreakDownInfo.class)
  public JAXBElement<String> createGSTBreakDownInfoCurrencyCode(String value) {
    return new JAXBElement<String>(_FlightsCurrencyCode_QNAME, String.class, GSTBreakDownInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link InsuranceReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "insuranceReservation", scope = InsuranceReservationInfo.class)
  public JAXBElement<InsuranceReservationEN> createInsuranceReservationInfoInsuranceReservation(InsuranceReservationEN value) {
    return new JAXBElement<InsuranceReservationEN>(_InsuranceReservationInfoInsuranceReservation_QNAME, InsuranceReservationEN.class,
        InsuranceReservationInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInsuranceReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "insuranceReservationDetails", scope = InsuranceReservationInfo.class)
  public JAXBElement<ArrayOfInsuranceReservationEN> createInsuranceReservationInfoInsuranceReservationDetails(ArrayOfInsuranceReservationEN value) {
    return new JAXBElement<ArrayOfInsuranceReservationEN>(_InsuranceReservationInfoInsuranceReservationDetails_QNAME,
        ArrayOfInsuranceReservationEN.class, InsuranceReservationInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PaxTypeCharge }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ChildSurcharge", scope = BookingChargesInfo.class)
  public JAXBElement<PaxTypeCharge> createBookingChargesInfoChildSurcharge(PaxTypeCharge value) {
    return new JAXBElement<PaxTypeCharge>(_BookingChargesInfoChildSurcharge_QNAME, PaxTypeCharge.class, BookingChargesInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PaxTypeCharge }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "InfantSurcharge", scope = BookingChargesInfo.class)
  public JAXBElement<PaxTypeCharge> createBookingChargesInfoInfantSurcharge(PaxTypeCharge value) {
    return new JAXBElement<PaxTypeCharge>(_BookingChargesInfoInfantSurcharge_QNAME, PaxTypeCharge.class, BookingChargesInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PaxTypeCharge }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AdultSurcharge", scope = BookingChargesInfo.class)
  public JAXBElement<PaxTypeCharge> createBookingChargesInfoAdultSurcharge(PaxTypeCharge value) {
    return new JAXBElement<PaxTypeCharge>(_BookingChargesInfoAdultSurcharge_QNAME, PaxTypeCharge.class, BookingChargesInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CombineFareBasisCode", scope = UnCombinedFareBasis.class)
  public JAXBElement<String> createUnCombinedFareBasisCombineFareBasisCode(String value) {
    return new JAXBElement<String>(_UnCombinedFareBasisCombineFareBasisCode_QNAME, String.class, UnCombinedFareBasis.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PrimeFareBasisCode", scope = UnCombinedFareBasis.class)
  public JAXBElement<String> createUnCombinedFareBasisPrimeFareBasisCode(String value) {
    return new JAXBElement<String>(_UnCombinedFareBasisPrimeFareBasisCode_QNAME, String.class, UnCombinedFareBasis.class, value);
  }

  /**
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CombinationalFareGroups", scope = UnCombinedFareBasis.class)
  public JAXBElement<ArrayOfstring> createUnCombinedFareBasisCombinationalFareGroups(ArrayOfstring value) {
    return new JAXBElement<ArrayOfstring>(_UnCombinedFareBasisCombinationalFareGroups_QNAME, ArrayOfstring.class, UnCombinedFareBasis.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FareBasisCode", scope = UnCombinedFareBasis.class)
  public JAXBElement<String> createUnCombinedFareBasisFareBasisCode(String value) {
    return new JAXBElement<String>(_FlightsFareBasisCode_QNAME, String.class, UnCombinedFareBasis.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Code", scope = DisClosureAirline.class)
  public JAXBElement<String> createDisClosureAirlineCode(String value) {
    return new JAXBElement<String>(_DisClosureAirlineCode_QNAME, String.class, DisClosureAirline.class, value);
  }

  /**
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "text", scope = DisClosureAirline.class)
  public JAXBElement<ArrayOfstring> createDisClosureAirlineText(ArrayOfstring value) {
    return new JAXBElement<ArrayOfstring>(_DisClosureAirlineText_QNAME, ArrayOfstring.class, DisClosureAirline.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AirlineCode", scope = DisClosureAirline.class)
  public JAXBElement<String> createDisClosureAirlineAirlineCode(String value) {
    return new JAXBElement<String>(_DisClosureAirlineAirlineCode_QNAME, String.class, DisClosureAirline.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CompanyShortName", scope = DisClosureAirline.class)
  public JAXBElement<String> createDisClosureAirlineCompanyShortName(String value) {
    return new JAXBElement<String>(_DisClosureAirlineCompanyShortName_QNAME, String.class, DisClosureAirline.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CommercialCode", scope = SpecialService.class)
  public JAXBElement<String> createSpecialServiceCommercialCode(String value) {
    return new JAXBElement<String>(_SpecialServiceCommercialCode_QNAME, String.class, SpecialService.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CommercialName", scope = SpecialService.class)
  public JAXBElement<String> createSpecialServiceCommercialName(String value) {
    return new JAXBElement<String>(_SpecialServiceCommercialName_QNAME, String.class, SpecialService.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CabinClassCode", scope = Baggages.class)
  public JAXBElement<String> createBaggagesCabinClassCode(String value) {
    return new JAXBElement<String>(_BaggagesCabinClassCode_QNAME, String.class, Baggages.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CabinClassName", scope = Baggages.class)
  public JAXBElement<String> createBaggagesCabinClassName(String value) {
    return new JAXBElement<String>(_BaggagesCabinClassName_QNAME, String.class, Baggages.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrCity", scope = RouteFreeBaggageAllowance.class)
  public JAXBElement<String> createRouteFreeBaggageAllowanceArrCity(String value) {
    return new JAXBElement<String>(_RouteFreeBaggageAllowanceArrCity_QNAME, String.class, RouteFreeBaggageAllowance.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CabinClassCode", scope = RouteFreeBaggageAllowance.class)
  public JAXBElement<String> createRouteFreeBaggageAllowanceCabinClassCode(String value) {
    return new JAXBElement<String>(_BaggagesCabinClassCode_QNAME, String.class, RouteFreeBaggageAllowance.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FreeBaggageAllowance }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FBA", scope = RouteFreeBaggageAllowance.class)
  public JAXBElement<FreeBaggageAllowance> createRouteFreeBaggageAllowanceFBA(FreeBaggageAllowance value) {
    return new JAXBElement<FreeBaggageAllowance>(_RouteFreeBaggageAllowanceFBA_QNAME, FreeBaggageAllowance.class, RouteFreeBaggageAllowance.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ClassCode", scope = RouteFreeBaggageAllowance.class)
  public JAXBElement<String> createRouteFreeBaggageAllowanceClassCode(String value) {
    return new JAXBElement<String>(_FlightsClassCode_QNAME, String.class, RouteFreeBaggageAllowance.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepCity", scope = RouteFreeBaggageAllowance.class)
  public JAXBElement<String> createRouteFreeBaggageAllowanceDepCity(String value) {
    return new JAXBElement<String>(_RouteFreeBaggageAllowanceDepCity_QNAME, String.class, RouteFreeBaggageAllowance.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMessage }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Msgs", scope = Result.class)
  public JAXBElement<ArrayOfMessage> createResultMsgs(ArrayOfMessage value) {
    return new JAXBElement<ArrayOfMessage>(_ResultMsgs_QNAME, ArrayOfMessage.class, Result.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Data", scope = Result.class)
  public JAXBElement<String> createResultData(String value) {
    return new JAXBElement<String>(_ResultData_QNAME, String.class, Result.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIAddonPriceInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PriceInfo", scope = APIBaggageInfo.class)
  public JAXBElement<APIAddonPriceInfo> createAPIBaggageInfoPriceInfo(APIAddonPriceInfo value) {
    return new JAXBElement<APIAddonPriceInfo>(_APIBaggageInfoPriceInfo_QNAME, APIAddonPriceInfo.class, APIBaggageInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepartureCity", scope = APISearchCriteriaParams.class)
  public JAXBElement<String> createAPISearchCriteriaParamsDepartureCity(String value) {
    return new JAXBElement<String>(_AirlineMLFlightLegDepartureCity_QNAME, String.class, APISearchCriteriaParams.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrivalCity", scope = APISearchCriteriaParams.class)
  public JAXBElement<String> createAPISearchCriteriaParamsArrivalCity(String value) {
    return new JAXBElement<String>(_APISearchCriteriaParamsArrivalCity_QNAME, String.class, APISearchCriteriaParams.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FailedReason", scope = FlightAddOnBookingStatus.class)
  public JAXBElement<String> createFlightAddOnBookingStatusFailedReason(String value) {
    return new JAXBElement<String>(_FlightAddOnBookingStatusFailedReason_QNAME, String.class, FlightAddOnBookingStatus.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "InsuranceGSTTaxCode", scope = InsuranceGSTInfo.class)
  public JAXBElement<String> createInsuranceGSTInfoInsuranceGSTTaxCode(String value) {
    return new JAXBElement<String>(_InsuranceGSTInfoInsuranceGSTTaxCode_QNAME, String.class, InsuranceGSTInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispTotalTaxAmount", scope = InsuranceGSTInfo.class)
  public JAXBElement<String> createInsuranceGSTInfoDispTotalTaxAmount(String value) {
    return new JAXBElement<String>(_InsuranceGSTInfoDispTotalTaxAmount_QNAME, String.class, InsuranceGSTInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "TaxDescription", scope = InsuranceGSTInfo.class)
  public JAXBElement<String> createInsuranceGSTInfoTaxDescription(String value) {
    return new JAXBElement<String>(_InsuranceGSTInfoTaxDescription_QNAME, String.class, InsuranceGSTInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CurrencyCode", scope = InsuranceGSTInfo.class)
  public JAXBElement<String> createInsuranceGSTInfoCurrencyCode(String value) {
    return new JAXBElement<String>(_FlightsCurrencyCode_QNAME, String.class, InsuranceGSTInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "QuoteId", scope = InsuranceReservationEN.class)
  public JAXBElement<String> createInsuranceReservationENQuoteId(String value) {
    return new JAXBElement<String>(_InsuranceReservationENQuoteId_QNAME, String.class, InsuranceReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "RFICSubCode", scope = InsuranceReservationEN.class)
  public JAXBElement<String> createInsuranceReservationENRFICSubCode(String value) {
    return new JAXBElement<String>(_InsuranceReservationENRFICSubCode_QNAME, String.class, InsuranceReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Destination", scope = InsuranceReservationEN.class)
  public JAXBElement<String> createInsuranceReservationENDestination(String value) {
    return new JAXBElement<String>(_InsuranceReservationENDestination_QNAME, String.class, InsuranceReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ServiceRequestInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ServiceRequestInformation", scope = InsuranceReservationEN.class)
  public JAXBElement<ServiceRequestInfo> createInsuranceReservationENServiceRequestInformation(ServiceRequestInfo value) {
    return new JAXBElement<ServiceRequestInfo>(_InsuranceReservationENServiceRequestInformation_QNAME, ServiceRequestInfo.class,
        InsuranceReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BaseCurrencyCode", scope = InsuranceReservationEN.class)
  public JAXBElement<String> createInsuranceReservationENBaseCurrencyCode(String value) {
    return new JAXBElement<String>(_InsuranceReservationENBaseCurrencyCode_QNAME, String.class, InsuranceReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ErrorMsg", scope = InsuranceReservationEN.class)
  public JAXBElement<String> createInsuranceReservationENErrorMsg(String value) {
    return new JAXBElement<String>(_APICancelBookingResponseErrorMsg_QNAME, String.class, InsuranceReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EMDNumber", scope = InsuranceReservationEN.class)
  public JAXBElement<String> createInsuranceReservationENEMDNumber(String value) {
    return new JAXBElement<String>(_InsuranceReservationENEMDNumber_QNAME, String.class, InsuranceReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightAddOnBookingStatus }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "InsuranceAddonStatus", scope = InsuranceReservationEN.class)
  public JAXBElement<FlightAddOnBookingStatus> createInsuranceReservationENInsuranceAddonStatus(FlightAddOnBookingStatus value) {
    return new JAXBElement<FlightAddOnBookingStatus>(_InsuranceReservationENInsuranceAddonStatus_QNAME, FlightAddOnBookingStatus.class,
        InsuranceReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationID", scope = InsuranceReservationEN.class)
  public JAXBElement<String> createInsuranceReservationENReservationID(String value) {
    return new JAXBElement<String>(_FareRulesENReservationID_QNAME, String.class, InsuranceReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PolicyName", scope = InsuranceReservationEN.class)
  public JAXBElement<String> createInsuranceReservationENPolicyName(String value) {
    return new JAXBElement<String>(_InsuranceReservationENPolicyName_QNAME, String.class, InsuranceReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CurrencyCode", scope = InsuranceReservationEN.class)
  public JAXBElement<String> createInsuranceReservationENCurrencyCode(String value) {
    return new JAXBElement<String>(_InsuranceReservationENCurrencyCode_QNAME, String.class, InsuranceReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "OfferId", scope = InsuranceReservationEN.class)
  public JAXBElement<String> createInsuranceReservationENOfferId(String value) {
    return new JAXBElement<String>(_InsuranceReservationENOfferId_QNAME, String.class, InsuranceReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PolicyPurchasecode", scope = InsuranceReservationEN.class)
  public JAXBElement<String> createInsuranceReservationENPolicyPurchasecode(String value) {
    return new JAXBElement<String>(_InsuranceReservationENPolicyPurchasecode_QNAME, String.class, InsuranceReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = InsuranceReservationEN.class)
  public JAXBElement<Result> createInsuranceReservationENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, InsuranceReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PolicyCode", scope = InsuranceReservationEN.class)
  public JAXBElement<String> createInsuranceReservationENPolicyCode(String value) {
    return new JAXBElement<String>(_InsuranceReservationENPolicyCode_QNAME, String.class, InsuranceReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DividedPNR", scope = FlightManagementResponseEN.class)
  public JAXBElement<String> createFlightManagementResponseENDividedPNR(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENDividedPNR_QNAME, String.class, FlightManagementResponseEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "TrackingNo", scope = FlightManagementResponseEN.class)
  public JAXBElement<String> createFlightManagementResponseENTrackingNo(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENTrackingNo_QNAME, String.class, FlightManagementResponseEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "TransactionType", scope = FlightManagementResponseEN.class)
  public JAXBElement<String> createFlightManagementResponseENTransactionType(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENTransactionType_QNAME, String.class, FlightManagementResponseEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DispAmount", scope = FlightManagementResponseEN.class)
  public JAXBElement<String> createFlightManagementResponseENDispAmount(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENDispAmount_QNAME, String.class, FlightManagementResponseEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PaymentCurrency", scope = FlightManagementResponseEN.class)
  public JAXBElement<String> createFlightManagementResponseENPaymentCurrency(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENPaymentCurrency_QNAME, String.class, FlightManagementResponseEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationID", scope = FlightManagementResponseEN.class)
  public JAXBElement<String> createFlightManagementResponseENReservationID(String value) {
    return new JAXBElement<String>(_FareRulesENReservationID_QNAME, String.class, FlightManagementResponseEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "TransactionDirection", scope = FlightManagementResponseEN.class)
  public JAXBElement<String> createFlightManagementResponseENTransactionDirection(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENTransactionDirection_QNAME, String.class, FlightManagementResponseEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ErrorMessage", scope = FlightManagementResponseEN.class)
  public JAXBElement<String> createFlightManagementResponseENErrorMessage(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENErrorMessage_QNAME, String.class, FlightManagementResponseEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "RequestType", scope = FlightManagementResponseEN.class)
  public JAXBElement<String> createFlightManagementResponseENRequestType(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENRequestType_QNAME, String.class, FlightManagementResponseEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "TransactionRequested", scope = FlightManagementResponseEN.class)
  public JAXBElement<String> createFlightManagementResponseENTransactionRequested(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENTransactionRequested_QNAME, String.class, FlightManagementResponseEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PNRNo", scope = FlightManagementResponseEN.class)
  public JAXBElement<String> createFlightManagementResponseENPNRNo(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENPNRNo_QNAME, String.class, FlightManagementResponseEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = FlightManagementResponseEN.class)
  public JAXBElement<Result> createFlightManagementResponseENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, FlightManagementResponseEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BaseCurrency", scope = FlightManagementResponseEN.class)
  public JAXBElement<String> createFlightManagementResponseENBaseCurrency(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENBaseCurrency_QNAME, String.class, FlightManagementResponseEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CMId", scope = FlightManagementResponseEN.class)
  public JAXBElement<String> createFlightManagementResponseENCMId(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENCMId_QNAME, String.class, FlightManagementResponseEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CommercialName", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENCommercialName(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENCommercialName_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DisMealsName", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENDisMealsName(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENDisMealsName_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SellingCurrency", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENSellingCurrency(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENSellingCurrency_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Status", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENStatus(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENStatus_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MealName", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENMealName(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENMealName_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ApplicablePaxType", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENApplicablePaxType(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENApplicablePaxType_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EMDNumber", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENEMDNumber(String value) {
    return new JAXBElement<String>(_InsuranceReservationENEMDNumber_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Taxes", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENTaxes(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENTaxes_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FGCode", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENFGCode(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENFGCode_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationID", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENReservationID(String value) {
    return new JAXBElement<String>(_FareRulesENReservationID_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "AirlineCode", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENAirlineCode(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENAirlineCode_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CurrencyCode", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENCurrencyCode(String value) {
    return new JAXBElement<String>(_InsuranceReservationENCurrencyCode_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReqFGCode", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENReqFGCode(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENReqFGCode_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MealDesc", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENMealDesc(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENMealDesc_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SectorTo", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENSectorTo(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENSectorTo_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "AirCraft", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENAirCraft(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENAirCraft_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SelPaxID", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENSelPaxID(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENSelPaxID_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ImagePath", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENImagePath(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENImagePath_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MealCode", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENMealCode(String value) {
    return new JAXBElement<String>(_PassengersENMealCode_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SectorFrom", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENSectorFrom(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENSectorFrom_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Region", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENRegion(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENRegion_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ApplicableToClass", scope = AirlineMealSelectionEN.class)
  public JAXBElement<String> createAirlineMealSelectionENApplicableToClass(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENApplicableToClass_QNAME, String.class, AirlineMealSelectionEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PaxType", scope = SpecialPaxPriceDifference.class)
  public JAXBElement<String> createSpecialPaxPriceDifferencePaxType(String value) {
    return new JAXBElement<String>(_PaxTypeChargePaxType_QNAME, String.class, SpecialPaxPriceDifference.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Remark", scope = FlightSearchCriteriaRQ.class)
  public JAXBElement<String> createFlightSearchCriteriaRemark(String value) {
    return new JAXBElement<String>(_FlightSearchCriteriaRemark_QNAME, String.class, FlightSearchCriteriaRQ.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PreferredCurrency", scope = FlightSearchCriteriaRQ.class)
  public JAXBElement<String> createFlightSearchCriteriaPreferredCurrency(String value) {
    return new JAXBElement<String>(_FlightSearchCriteriaPreferredCurrency_QNAME, String.class, FlightSearchCriteriaRQ.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PromotionalCode", scope = FlightSearchCriteriaRQ.class)
  public JAXBElement<String> createFlightSearchCriteriaPromotionalCode(String value) {
    return new JAXBElement<String>(_FlightSearchCriteriaPromotionalCode_QNAME, String.class, FlightSearchCriteriaRQ.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "BookingClass", scope = FlightSearchCriteriaRQ.class)
  public JAXBElement<String> createFlightSearchCriteriaBookingClass(String value) {
    return new JAXBElement<String>(_FlightSearchCriteriaBookingClass_QNAME, String.class, FlightSearchCriteriaRQ.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepartureCityName", scope = FlightSearchCriteriaRQ.class)
  public JAXBElement<String> createFlightSearchCriteriaDepartureCityName(String value) {
    return new JAXBElement<String>(_FlightSearchCriteriaDepartureCityName_QNAME, String.class, FlightSearchCriteriaRQ.class, value);
  }

  /**
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ChildAge", scope = FlightSearchCriteriaRQ.class)
  public JAXBElement<ArrayOfint> createFlightSearchCriteriaChildAge(ArrayOfint value) {
    return new JAXBElement<ArrayOfint>(_FlightSearchCriteriaChildAge_QNAME, ArrayOfint.class, FlightSearchCriteriaRQ.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepartureCity", scope = FlightSearchCriteriaRQ.class)
  public JAXBElement<String> createFlightSearchCriteriaDepartureCity(String value) {
    return new JAXBElement<String>(_AirlineMLFlightLegDepartureCity_QNAME, String.class, FlightSearchCriteriaRQ.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PromotionCode", scope = FlightSearchCriteriaRQ.class)
  public JAXBElement<String> createFlightSearchCriteriaPromotionCode(String value) {
    return new JAXBElement<String>(_FlightSearchCriteriaPromotionCode_QNAME, String.class, FlightSearchCriteriaRQ.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "UTM_Campaign", scope = FlightSearchCriteriaRQ.class)
  public JAXBElement<String> createFlightSearchCriteriaUTMCampaign(String value) {
    return new JAXBElement<String>(_FlightSearchCriteriaUTMCampaign_QNAME, String.class, FlightSearchCriteriaRQ.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrivalCityName", scope = FlightSearchCriteriaRQ.class)
  public JAXBElement<String> createFlightSearchCriteriaArrivalCityName(String value) {
    return new JAXBElement<String>(_FlightSearchCriteriaArrivalCityName_QNAME, String.class, FlightSearchCriteriaRQ.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FSearchID", scope = FlightSearchCriteriaRQ.class)
  public JAXBElement<String> createFlightSearchCriteriaFSearchID(String value) {
    return new JAXBElement<String>(_FlightSearchCriteriaFSearchID_QNAME, String.class, FlightSearchCriteriaRQ.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link LoyaltySearchUserInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "LoyaltySearchInfo", scope = FlightSearchCriteriaRQ.class)
  public JAXBElement<LoyaltySearchUserInfo> createFlightSearchCriteriaLoyaltySearchInfo(LoyaltySearchUserInfo value) {
    return new JAXBElement<LoyaltySearchUserInfo>(_FlightSearchCriteriaLoyaltySearchInfo_QNAME, LoyaltySearchUserInfo.class,
        FlightSearchCriteriaRQ.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SessionID", scope = FlightSearchCriteriaRQ.class)
  public JAXBElement<String> createFlightSearchCriteriaSessionID(String value) {
    return new JAXBElement<String>(_FlightSearchCriteriaSessionID_QNAME, String.class, FlightSearchCriteriaRQ.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrivalCity", scope = FlightSearchCriteriaRQ.class)
  public JAXBElement<String> createFlightSearchCriteriaArrivalCity(String value) {
    return new JAXBElement<String>(_APISearchCriteriaParamsArrivalCity_QNAME, String.class, FlightSearchCriteriaRQ.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AllowClassesOnly", scope = FlightSearchCriteriaRQ.class)
  public JAXBElement<String> createFlightSearchCriteriaAllowClassesOnly(String value) {
    return new JAXBElement<String>(_FlightSearchCriteriaAllowClassesOnly_QNAME, String.class, FlightSearchCriteriaRQ.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "LanguageCode", scope = FlightSearchCriteriaRQ.class)
  public JAXBElement<String> createFlightSearchCriteriaLanguageCode(String value) {
    return new JAXBElement<String>(_FlightSearchCriteriaLanguageCode_QNAME, String.class, FlightSearchCriteriaRQ.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AirlineCode", scope = FlightSearchCriteriaRQ.class)
  public JAXBElement<String> createFlightSearchCriteriaAirlineCode(String value) {
    return new JAXBElement<String>(_DisClosureAirlineAirlineCode_QNAME, String.class, FlightSearchCriteriaRQ.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SegmentType", scope = FlightSearchCriteriaRQ.class)
  public JAXBElement<String> createFlightSearchCriteriaSegmentType(String value) {
    return new JAXBElement<String>(_FlightSearchCriteriaSegmentType_QNAME, String.class, FlightSearchCriteriaRQ.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaxBreakDownInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PerPaxTaxBreakDown", scope = PerPaxPriceInfo.class)
  public JAXBElement<ArrayOfTaxBreakDownInfo> createPerPaxPriceInfoPerPaxTaxBreakDown(ArrayOfTaxBreakDownInfo value) {
    return new JAXBElement<ArrayOfTaxBreakDownInfo>(_PerPaxPriceInfoPerPaxTaxBreakDown_QNAME, ArrayOfTaxBreakDownInfo.class, PerPaxPriceInfo.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SpecialFareType", scope = PerPaxPriceInfo.class)
  public JAXBElement<String> createPerPaxPriceInfoSpecialFareType(String value) {
    return new JAXBElement<String>(_PerPaxPriceInfoSpecialFareType_QNAME, String.class, PerPaxPriceInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispPromotionPerPax", scope = PerPaxPriceInfo.class)
  public JAXBElement<String> createPerPaxPriceInfoDispPromotionPerPax(String value) {
    return new JAXBElement<String>(_PerPaxPriceInfoDispPromotionPerPax_QNAME, String.class, PerPaxPriceInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispMLTotalPricePerPax", scope = PerPaxPriceInfo.class)
  public JAXBElement<String> createPerPaxPriceInfoDispMLTotalPricePerPax(String value) {
    return new JAXBElement<String>(_PerPaxPriceInfoDispMLTotalPricePerPax_QNAME, String.class, PerPaxPriceInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispTotalPricePerPax", scope = PerPaxPriceInfo.class)
  public JAXBElement<String> createPerPaxPriceInfoDispTotalPricePerPax(String value) {
    return new JAXBElement<String>(_PerPaxPriceInfoDispTotalPricePerPax_QNAME, String.class, PerPaxPriceInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispPricePerPax", scope = PerPaxPriceInfo.class)
  public JAXBElement<String> createPerPaxPriceInfoDispPricePerPax(String value) {
    return new JAXBElement<String>(_PerPaxPriceInfoDispPricePerPax_QNAME, String.class, PerPaxPriceInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispTaxPerPax", scope = PerPaxPriceInfo.class)
  public JAXBElement<String> createPerPaxPriceInfoDispTaxPerPax(String value) {
    return new JAXBElement<String>(_PerPaxPriceInfoDispTaxPerPax_QNAME, String.class, PerPaxPriceInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AirlineMLPaxPrice }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ChildPriceInformation", scope = AirlineMLAvail.class)
  public JAXBElement<AirlineMLPaxPrice> createAirlineMLAvailChildPriceInformation(AirlineMLPaxPrice value) {
    return new JAXBElement<AirlineMLPaxPrice>(_AirlineMLAvailChildPriceInformation_QNAME, AirlineMLPaxPrice.class, AirlineMLAvail.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AirlineMLPaxPrice }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "InfantPriceInformation", scope = AirlineMLAvail.class)
  public JAXBElement<AirlineMLPaxPrice> createAirlineMLAvailInfantPriceInformation(AirlineMLPaxPrice value) {
    return new JAXBElement<AirlineMLPaxPrice>(_AirlineMLAvailInfantPriceInformation_QNAME, AirlineMLPaxPrice.class, AirlineMLAvail.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispFlightAmount", scope = AirlineMLAvail.class)
  public JAXBElement<String> createAirlineMLAvailDispFlightAmount(String value) {
    return new JAXBElement<String>(_AirlineMLAvailDispFlightAmount_QNAME, String.class, AirlineMLAvail.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AirlineMLPaxPrice }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AdultPriceInformation", scope = AirlineMLAvail.class)
  public JAXBElement<AirlineMLPaxPrice> createAirlineMLAvailAdultPriceInformation(AirlineMLPaxPrice value) {
    return new JAXBElement<AirlineMLPaxPrice>(_AirlineMLAvailAdultPriceInformation_QNAME, AirlineMLPaxPrice.class, AirlineMLAvail.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightError }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "BookingError", scope = AirlineMLAvail.class)
  public JAXBElement<FlightError> createAirlineMLAvailBookingError(FlightError value) {
    return new JAXBElement<FlightError>(_FlightsBookingError_QNAME, FlightError.class, AirlineMLAvail.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Currency", scope = AirlineMLAvail.class)
  public JAXBElement<String> createAirlineMLAvailCurrency(String value) {
    return new JAXBElement<String>(_AirlineMLAvailCurrency_QNAME, String.class, AirlineMLAvail.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AirlineMLPrice }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PriceInformation", scope = AirlineMLAvail.class)
  public JAXBElement<AirlineMLPrice> createAirlineMLAvailPriceInformation(AirlineMLPrice value) {
    return new JAXBElement<AirlineMLPrice>(_PriceInformation_QNAME, AirlineMLPrice.class, AirlineMLAvail.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAirlineMLPaxPrice }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SpecialPaxPrice", scope = AirlineMLAvail.class)
  public JAXBElement<ArrayOfAirlineMLPaxPrice> createAirlineMLAvailSpecialPaxPrice(ArrayOfAirlineMLPaxPrice value) {
    return new JAXBElement<ArrayOfAirlineMLPaxPrice>(_AirlineMLAvailSpecialPaxPrice_QNAME, ArrayOfAirlineMLPaxPrice.class, AirlineMLAvail.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PromotionInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AppliedPromotionInfo", scope = AirlineMLAvail.class)
  public JAXBElement<PromotionInfo> createAirlineMLAvailAppliedPromotionInfo(PromotionInfo value) {
    return new JAXBElement<PromotionInfo>(_FlightsAppliedPromotionInfo_QNAME, PromotionInfo.class, AirlineMLAvail.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlights }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AvailMLFlights", scope = AirlineMLAvail.class)
  public JAXBElement<ArrayOfFlights> createAirlineMLAvailAvailMLFlights(ArrayOfFlights value) {
    return new JAXBElement<ArrayOfFlights>(_AirlineMLAvailAvailMLFlights_QNAME, ArrayOfFlights.class, AirlineMLAvail.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightReservation", scope = MultilegFlightReservation.class)
  public JAXBElement<FlightReservationEN> createMultilegFlightReservationFlightReservation(FlightReservationEN value) {
    return new JAXBElement<FlightReservationEN>(_MultilegFlightReservationFlightReservation_QNAME, FlightReservationEN.class,
        MultilegFlightReservation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlightReservationSegmentsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightReservationSegments", scope = MultilegFlightReservation.class)
  public JAXBElement<ArrayOfFlightReservationSegmentsEN> createMultilegFlightReservationFlightReservationSegments(ArrayOfFlightReservationSegmentsEN value) {
    return new JAXBElement<ArrayOfFlightReservationSegmentsEN>(_MultilegFlightReservationFlightReservationSegments_QNAME,
        ArrayOfFlightReservationSegmentsEN.class, MultilegFlightReservation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Name", scope = APIInsuranceAvailability.class)
  public JAXBElement<String> createAPIInsuranceAvailabilityName(String value) {
    return new JAXBElement<String>(_APIInsuranceAvailabilityName_QNAME, String.class, APIInsuranceAvailability.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIAddonPriceInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PriceInfo", scope = APIInsuranceAvailability.class)
  public JAXBElement<APIAddonPriceInfo> createAPIInsuranceAvailabilityPriceInfo(APIAddonPriceInfo value) {
    return new JAXBElement<APIAddonPriceInfo>(_APIBaggageInfoPriceInfo_QNAME, APIAddonPriceInfo.class, APIInsuranceAvailability.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPIInsuranceURL }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "URLs", scope = APIInsuranceAvailability.class)
  public JAXBElement<ArrayOfAPIInsuranceURL> createAPIInsuranceAvailabilityURLs(ArrayOfAPIInsuranceURL value) {
    return new JAXBElement<ArrayOfAPIInsuranceURL>(_APIInsuranceAvailabilityURLs_QNAME, ArrayOfAPIInsuranceURL.class, APIInsuranceAvailability.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIAddonPriceInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PriceInfo", scope = APISeatInfo.class)
  public JAXBElement<APIAddonPriceInfo> createAPISeatInfoPriceInfo(APIAddonPriceInfo value) {
    return new JAXBElement<APIAddonPriceInfo>(_APIBaggageInfoPriceInfo_QNAME, APIAddonPriceInfo.class, APISeatInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "RowNo", scope = APISeatInfo.class)
  public JAXBElement<String> createAPISeatInfoRowNo(String value) {
    return new JAXBElement<String>(_APISeatInfoRowNo_QNAME, String.class, APISeatInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CabinClassCode", scope = APISeatInfo.class)
  public JAXBElement<String> createAPISeatInfoCabinClassCode(String value) {
    return new JAXBElement<String>(_BaggagesCabinClassCode_QNAME, String.class, APISeatInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ColumnNo", scope = APISeatInfo.class)
  public JAXBElement<String> createAPISeatInfoColumnNo(String value) {
    return new JAXBElement<String>(_APISeatInfoColumnNo_QNAME, String.class, APISeatInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CabinClassName", scope = APISeatInfo.class)
  public JAXBElement<String> createAPISeatInfoCabinClassName(String value) {
    return new JAXBElement<String>(_BaggagesCabinClassName_QNAME, String.class, APISeatInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationID", scope = ReservationsCardTransactionsEN.class)
  public JAXBElement<String> createReservationsCardTransactionsENReservationID(String value) {
    return new JAXBElement<String>(_FareRulesENReservationID_QNAME, String.class, ReservationsCardTransactionsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BankName", scope = ReservationsCardTransactionsEN.class)
  public JAXBElement<String> createReservationsCardTransactionsENBankName(String value) {
    return new JAXBElement<String>(_ReservationsCardTransactionsENBankName_QNAME, String.class, ReservationsCardTransactionsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MandiriToken", scope = ReservationsCardTransactionsEN.class)
  public JAXBElement<String> createReservationsCardTransactionsENMandiriToken(String value) {
    return new JAXBElement<String>(_ReservationsCardTransactionsENMandiriToken_QNAME, String.class, ReservationsCardTransactionsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MandiriDebitcardNo", scope = ReservationsCardTransactionsEN.class)
  public JAXBElement<String> createReservationsCardTransactionsENMandiriDebitcardNo(String value) {
    return new JAXBElement<String>(_ReservationsCardTransactionsENMandiriDebitcardNo_QNAME, String.class, ReservationsCardTransactionsEN.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ApprovalCode", scope = ReservationsCardTransactionsEN.class)
  public JAXBElement<String> createReservationsCardTransactionsENApprovalCode(String value) {
    return new JAXBElement<String>(_ReservationsCardTransactionsENApprovalCode_QNAME, String.class, ReservationsCardTransactionsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PaymentFailureReason", scope = ReservationsCardTransactionsEN.class)
  public JAXBElement<String> createReservationsCardTransactionsENPaymentFailureReason(String value) {
    return new JAXBElement<String>(_ReservationsCardTransactionsENPaymentFailureReason_QNAME, String.class, ReservationsCardTransactionsEN.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "TransactionID", scope = ReservationsCardTransactionsEN.class)
  public JAXBElement<String> createReservationsCardTransactionsENTransactionID(String value) {
    return new JAXBElement<String>(_ReservationsCardTransactionsENTransactionID_QNAME, String.class, ReservationsCardTransactionsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = ReservationsCardTransactionsEN.class)
  public JAXBElement<Result> createReservationsCardTransactionsENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, ReservationsCardTransactionsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ProcessorName", scope = ReservationsCardTransactionsEN.class)
  public JAXBElement<String> createReservationsCardTransactionsENProcessorName(String value) {
    return new JAXBElement<String>(_ReservationsCardTransactionsENProcessorName_QNAME, String.class, ReservationsCardTransactionsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SeatNo", scope = APISelectedSeat.class)
  public JAXBElement<String> createAPISelectedSeatSeatNo(String value) {
    return new JAXBElement<String>(_APISelectedSeatSeatNo_QNAME, String.class, APISelectedSeat.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APISeatAvailability }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Seats", scope = APIAddonAvailabilityRes.class)
  public JAXBElement<APISeatAvailability> createAPIAddonAvailabilityResSeats(APISeatAvailability value) {
    return new JAXBElement<APISeatAvailability>(_APIAddonAvailabilityResSeats_QNAME, APISeatAvailability.class, APIAddonAvailabilityRes.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIMealAvailability }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Meals", scope = APIAddonAvailabilityRes.class)
  public JAXBElement<APIMealAvailability> createAPIAddonAvailabilityResMeals(APIMealAvailability value) {
    return new JAXBElement<APIMealAvailability>(_APIAddonAvailabilityResMeals_QNAME, APIMealAvailability.class, APIAddonAvailabilityRes.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APILoungeAvailability }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Lounge", scope = APIAddonAvailabilityRes.class)
  public JAXBElement<APILoungeAvailability> createAPIAddonAvailabilityResLounge(APILoungeAvailability value) {
    return new JAXBElement<APILoungeAvailability>(_APIAddonAvailabilityResLounge_QNAME, APILoungeAvailability.class, APIAddonAvailabilityRes.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ErrorMsg", scope = APIAddonAvailabilityRes.class)
  public JAXBElement<String> createAPIAddonAvailabilityResErrorMsg(String value) {
    return new JAXBElement<String>(_APIAddonSetSelectedResErrorMsg_QNAME, String.class, APIAddonAvailabilityRes.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIInsuranceAvailability }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Insurance", scope = APIAddonAvailabilityRes.class)
  public JAXBElement<APIInsuranceAvailability> createAPIAddonAvailabilityResInsurance(APIInsuranceAvailability value) {
    return new JAXBElement<APIInsuranceAvailability>(_APIAddonAvailabilityResInsurance_QNAME, APIInsuranceAvailability.class,
        APIAddonAvailabilityRes.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIBaggageAvailability }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Baggages", scope = APIAddonAvailabilityRes.class)
  public JAXBElement<APIBaggageAvailability> createAPIAddonAvailabilityResBaggages(APIBaggageAvailability value) {
    return new JAXBElement<APIBaggageAvailability>(_Baggages_QNAME, APIBaggageAvailability.class, APIAddonAvailabilityRes.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CalcMarkupBy", scope = MarkupFlightEN.class)
  public JAXBElement<String> createMarkupFlightENCalcMarkupBy(String value) {
    return new JAXBElement<String>(_MarkupFlightENCalcMarkupBy_QNAME, String.class, MarkupFlightEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FareType", scope = MarkupFlightEN.class)
  public JAXBElement<String> createMarkupFlightENFareType(String value) {
    return new JAXBElement<String>(_MarkupFlightENFareType_QNAME, String.class, MarkupFlightEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MarkupCode", scope = MarkupFlightEN.class)
  public JAXBElement<String> createMarkupFlightENMarkupCode(String value) {
    return new JAXBElement<String>(_MarkupFlightENMarkupCode_QNAME, String.class, MarkupFlightEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightJourneyType", scope = MarkupFlightEN.class)
  public JAXBElement<String> createMarkupFlightENFlightJourneyType(String value) {
    return new JAXBElement<String>(_MarkupFlightENFlightJourneyType_QNAME, String.class, MarkupFlightEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MarkupName", scope = MarkupFlightEN.class)
  public JAXBElement<String> createMarkupFlightENMarkupName(String value) {
    return new JAXBElement<String>(_MarkupFlightENMarkupName_QNAME, String.class, MarkupFlightEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BookingClass", scope = MarkupFlightEN.class)
  public JAXBElement<String> createMarkupFlightENBookingClass(String value) {
    return new JAXBElement<String>(_MarkupFlightENBookingClass_QNAME, String.class, MarkupFlightEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DepCities", scope = MarkupFlightEN.class)
  public JAXBElement<String> createMarkupFlightENDepCities(String value) {
    return new JAXBElement<String>(_MarkupFlightENDepCities_QNAME, String.class, MarkupFlightEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Prefix", scope = MarkupFlightEN.class)
  public JAXBElement<String> createMarkupFlightENPrefix(String value) {
    return new JAXBElement<String>(_MarkupFlightENPrefix_QNAME, String.class, MarkupFlightEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrCities", scope = MarkupFlightEN.class)
  public JAXBElement<String> createMarkupFlightENArrCities(String value) {
    return new JAXBElement<String>(_MarkupFlightENArrCities_QNAME, String.class, MarkupFlightEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CurrencyCode", scope = MarkupFlightEN.class)
  public JAXBElement<String> createMarkupFlightENCurrencyCode(String value) {
    return new JAXBElement<String>(_InsuranceReservationENCurrencyCode_QNAME, String.class, MarkupFlightEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "AppliesToDays", scope = MarkupFlightEN.class)
  public JAXBElement<String> createMarkupFlightENAppliesToDays(String value) {
    return new JAXBElement<String>(_MarkupFlightENAppliesToDays_QNAME, String.class, MarkupFlightEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Airlines", scope = MarkupFlightEN.class)
  public JAXBElement<String> createMarkupFlightENAirlines(String value) {
    return new JAXBElement<String>(_MarkupFlightENAirlines_QNAME, String.class, MarkupFlightEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MarkupType", scope = MarkupFlightEN.class)
  public JAXBElement<String> createMarkupFlightENMarkupType(String value) {
    return new JAXBElement<String>(_MarkupFlightENMarkupType_QNAME, String.class, MarkupFlightEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Code", scope = Message.class)
  public JAXBElement<String> createMessageCode(String value) {
    return new JAXBElement<String>(_MessageCode_QNAME, String.class, Message.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MessageText", scope = Message.class)
  public JAXBElement<String> createMessageMessageText(String value) {
    return new JAXBElement<String>(_MessageMessageText_QNAME, String.class, Message.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CommercialName", scope = LoungeReservationEN.class)
  public JAXBElement<String> createLoungeReservationENCommercialName(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENCommercialName_QNAME, String.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FirstName", scope = LoungeReservationEN.class)
  public JAXBElement<String> createLoungeReservationENFirstName(String value) {
    return new JAXBElement<String>(_PassengersENFirstName_QNAME, String.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ServiceRequestInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ServiceRequestInformation", scope = LoungeReservationEN.class)
  public JAXBElement<ServiceRequestInfo> createLoungeReservationENServiceRequestInformation(ServiceRequestInfo value) {
    return new JAXBElement<ServiceRequestInfo>(_InsuranceReservationENServiceRequestInformation_QNAME, ServiceRequestInfo.class,
        LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "RFICCode", scope = LoungeReservationEN.class)
  public JAXBElement<String> createLoungeReservationENRFICCode(String value) {
    return new JAXBElement<String>(_LoungeReservationENRFICCode_QNAME, String.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrCity", scope = LoungeReservationEN.class)
  public JAXBElement<String> createLoungeReservationENArrCity(String value) {
    return new JAXBElement<String>(_LoungeReservationENArrCity_QNAME, String.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "GroupCode", scope = LoungeReservationEN.class)
  public JAXBElement<String> createLoungeReservationENGroupCode(String value) {
    return new JAXBElement<String>(_LoungeReservationENGroupCode_QNAME, String.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EMDNumber", scope = LoungeReservationEN.class)
  public JAXBElement<String> createLoungeReservationENEMDNumber(String value) {
    return new JAXBElement<String>(_InsuranceReservationENEMDNumber_QNAME, String.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SSRCode", scope = LoungeReservationEN.class)
  public JAXBElement<String> createLoungeReservationENSSRCode(String value) {
    return new JAXBElement<String>(_LoungeReservationENSSRCode_QNAME, String.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Taxes", scope = LoungeReservationEN.class)
  public JAXBElement<String> createLoungeReservationENTaxes(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENTaxes_QNAME, String.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationID", scope = LoungeReservationEN.class)
  public JAXBElement<String> createLoungeReservationENReservationID(String value) {
    return new JAXBElement<String>(_FareRulesENReservationID_QNAME, String.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Currency", scope = LoungeReservationEN.class)
  public JAXBElement<String> createLoungeReservationENCurrency(String value) {
    return new JAXBElement<String>(_LoungeReservationENCurrency_QNAME, String.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "RFICSubcode", scope = LoungeReservationEN.class)
  public JAXBElement<String> createLoungeReservationENRFICSubcode(String value) {
    return new JAXBElement<String>(_LoungeReservationENRFICSubcode_QNAME, String.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DepCity", scope = LoungeReservationEN.class)
  public JAXBElement<String> createLoungeReservationENDepCity(String value) {
    return new JAXBElement<String>(_LoungeReservationENDepCity_QNAME, String.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PassengerType", scope = LoungeReservationEN.class)
  public JAXBElement<String> createLoungeReservationENPassengerType(String value) {
    return new JAXBElement<String>(_PassengersENPassengerType_QNAME, String.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "VoucherNo", scope = LoungeReservationEN.class)
  public JAXBElement<String> createLoungeReservationENVoucherNo(String value) {
    return new JAXBElement<String>(_LoungeReservationENVoucherNo_QNAME, String.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EMDBookingType", scope = LoungeReservationEN.class)
  public JAXBElement<String> createLoungeReservationENEMDBookingType(String value) {
    return new JAXBElement<String>(_LoungeReservationENEMDBookingType_QNAME, String.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PNRNo", scope = LoungeReservationEN.class)
  public JAXBElement<String> createLoungeReservationENPNRNo(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENPNRNo_QNAME, String.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = LoungeReservationEN.class)
  public JAXBElement<Result> createLoungeReservationENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CommercialCode", scope = LoungeReservationEN.class)
  public JAXBElement<String> createLoungeReservationENCommercialCode(String value) {
    return new JAXBElement<String>(_LoungeReservationENCommercialCode_QNAME, String.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "LastName", scope = LoungeReservationEN.class)
  public JAXBElement<String> createLoungeReservationENLastName(String value) {
    return new JAXBElement<String>(_LoungeReservationENLastName_QNAME, String.class, LoungeReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "TotalDuration", scope = FlightSegment.class)
  public JAXBElement<String> createFlightSegmentTotalDuration(String value) {
    return new JAXBElement<String>(_FlightSegmentTotalDuration_QNAME, String.class, FlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DefaultSelected", scope = FlightSegment.class)
  public JAXBElement<String> createFlightSegmentDefaultSelected(String value) {
    return new JAXBElement<String>(_FlightSegmentDefaultSelected_QNAME, String.class, FlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Index", scope = FlightSegment.class)
  public JAXBElement<String> createFlightSegmentIndex(String value) {
    return new JAXBElement<String>(_FlightSegmentIndex_QNAME, String.class, FlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGDSFlightSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Segments", scope = FlightSegment.class)
  public JAXBElement<ArrayOfGDSFlightSegment> createFlightSegmentSegments(ArrayOfGDSFlightSegment value) {
    return new JAXBElement<ArrayOfGDSFlightSegment>(_FlightSegmentSegments_QNAME, ArrayOfGDSFlightSegment.class, FlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PriceStrikeoutSettingsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PriceStrikeoutSetting", scope = StrikeoutInfo.class)
  public JAXBElement<PriceStrikeoutSettingsEN> createStrikeoutInfoPriceStrikeoutSetting(PriceStrikeoutSettingsEN value) {
    return new JAXBElement<PriceStrikeoutSettingsEN>(_StrikeoutInfoPriceStrikeoutSetting_QNAME, PriceStrikeoutSettingsEN.class, StrikeoutInfo.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIAddonPriceInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PriceInfo", scope = APILoungeInfo.class)
  public JAXBElement<APIAddonPriceInfo> createAPILoungeInfoPriceInfo(APIAddonPriceInfo value) {
    return new JAXBElement<APIAddonPriceInfo>(_APIBaggageInfoPriceInfo_QNAME, APIAddonPriceInfo.class, APILoungeInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SegmentStatus", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENSegmentStatus(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENSegmentStatus_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SellingCurrency", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENSellingCurrency(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENSellingCurrency_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SplPaxFreeBaggage", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENSplPaxFreeBaggage(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENSplPaxFreeBaggage_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightNo", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENFlightNo(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENFlightNo_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "StartCityName", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENStartCityName(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENStartCityName_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CMFareBasis", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENCMFareBasis(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENCMFareBasis_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SpecialPaxFareBasisCode", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENSpecialPaxFareBasisCode(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENSpecialPaxFareBasisCode_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EndCityCode", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENEndCityCode(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENEndCityCode_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FareID", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENFareID(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENFareID_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Gateway", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENGateway(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENGateway_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightFareBasisCode", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENFlightFareBasisCode(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENFlightFareBasisCode_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ChildFareBasisCode", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENChildFareBasisCode(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENChildFareBasisCode_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Meals", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENMeals(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENMeals_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "StartCityCountryCode", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENStartCityCountryCode(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENStartCityCountryCode_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "GuestName", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENGuestName(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENGuestName_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CodeSharePNR", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENCodeSharePNR(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENCodeSharePNR_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MktairlineCode", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENMktairlineCode(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENMktairlineCode_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EndCityCountryCode", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENEndCityCountryCode(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENEndCityCountryCode_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "StartCityForInsAPI", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENStartCityForInsAPI(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENStartCityForInsAPI_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "IBDepCityCode", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENIBDepCityCode(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENIBDepCityCode_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EndCityForInsAPI", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENEndCityForInsAPI(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENEndCityForInsAPI_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "IBArrCityCode", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENIBArrCityCode(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENIBArrCityCode_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "OprAirlineCode", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENOprAirlineCode(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENOprAirlineCode_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightSegmentRef", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENFlightSegmentRef(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENFlightSegmentRef_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "dispArrDateTime", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENDispArrDateTime(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENDispArrDateTime_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "dispTicketingDeadLine", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENDispTicketingDeadLine(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENDispTicketingDeadLine_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "InfantFareBasisCode", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENInfantFareBasisCode(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENInfantFareBasisCode_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Seats", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENSeats(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENSeats_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BookingClass", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENBookingClass(String value) {
    return new JAXBElement<String>(_MarkupFlightENBookingClass_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FareBasis", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENFareBasis(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENFareBasis_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "dispDepDateTime", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENDispDepDateTime(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENDispDepDateTime_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "StartCityCode", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENStartCityCode(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENStartCityCode_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationID", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENReservationID(String value) {
    return new JAXBElement<String>(_FareRulesENReservationID_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ATMPaymentCode", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENATMPaymentCode(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENATMPaymentCode_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CabinClass", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENCabinClass(String value) {
    return new JAXBElement<String>(_CabinClass_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EndCityCountryName", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENEndCityCountryName(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENEndCityCountryName_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MktairlineName", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENMktairlineName(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENMktairlineName_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Aircraft", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENAircraft(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENAircraft_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "OprAirlineName", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENOprAirlineName(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENOprAirlineName_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PNRNo", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENPNRNo(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENPNRNo_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<Result> createFlightReservationSegmentsENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EndCityName", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENEndCityName(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENEndCityName_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "StartCityCountryName", scope = FlightReservationSegmentsEN.class)
  public JAXBElement<String> createFlightReservationSegmentsENStartCityCountryName(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENStartCityCountryName_QNAME, String.class, FlightReservationSegmentsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispTaxAmount", scope = AirlineMLPrice.class)
  public JAXBElement<String> createAirlineMLPriceDispTaxAmount(String value) {
    return new JAXBElement<String>(_AirlineMLPriceDispTaxAmount_QNAME, String.class, AirlineMLPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispPrice", scope = AirlineMLPrice.class)
  public JAXBElement<String> createAirlineMLPriceDispPrice(String value) {
    return new JAXBElement<String>(_AirlineMLPriceDispPrice_QNAME, String.class, AirlineMLPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispPkgAmountWithPromotion", scope = AirlineMLPrice.class)
  public JAXBElement<String> createAirlineMLPriceDispPkgAmountWithPromotion(String value) {
    return new JAXBElement<String>(_AirlineMLPriceDispPkgAmountWithPromotion_QNAME, String.class, AirlineMLPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Currency", scope = AirlineMLPrice.class)
  public JAXBElement<String> createAirlineMLPriceCurrency(String value) {
    return new JAXBElement<String>(_AirlineMLAvailCurrency_QNAME, String.class, AirlineMLPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "BaseFareRoundingText", scope = AirlineMLPrice.class)
  public JAXBElement<String> createAirlineMLPriceBaseFareRoundingText(String value) {
    return new JAXBElement<String>(_AirlineMLPriceBaseFareRoundingText_QNAME, String.class, AirlineMLPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PaxPriceDifference }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PerSegPaxPriceDiff", scope = AirlineMLPrice.class)
  public JAXBElement<PaxPriceDifference> createAirlineMLPricePerSegPaxPriceDiff(PaxPriceDifference value) {
    return new JAXBElement<PaxPriceDifference>(_AirlineMLPricePerSegPaxPriceDiff_QNAME, PaxPriceDifference.class, AirlineMLPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispPkgAmt", scope = AirlineMLPrice.class)
  public JAXBElement<String> createAirlineMLPriceDispPkgAmt(String value) {
    return new JAXBElement<String>(_AirlineMLPriceDispPkgAmt_QNAME, String.class, AirlineMLPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispPriceDiff", scope = AirlineMLPrice.class)
  public JAXBElement<String> createAirlineMLPriceDispPriceDiff(String value) {
    return new JAXBElement<String>(_AirlineMLPriceDispPriceDiff_QNAME, String.class, AirlineMLPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispPromotionTotalAmount", scope = AirlineMLPrice.class)
  public JAXBElement<String> createAirlineMLPriceDispPromotionTotalAmount(String value) {
    return new JAXBElement<String>(_AirlineMLPriceDispPromotionTotalAmount_QNAME, String.class, AirlineMLPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispTotalAmount", scope = AirlineMLPrice.class)
  public JAXBElement<String> createAirlineMLPriceDispTotalAmount(String value) {
    return new JAXBElement<String>(_AirlineMLPriceDispTotalAmount_QNAME, String.class, AirlineMLPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DisplayCurrency", scope = AirlineMLPrice.class)
  public JAXBElement<String> createAirlineMLPriceDisplayCurrency(String value) {
    return new JAXBElement<String>(_AirlineMLPriceDisplayCurrency_QNAME, String.class, AirlineMLPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispTotalMarkup", scope = AirlineMLPrice.class)
  public JAXBElement<String> createAirlineMLPriceDispTotalMarkup(String value) {
    return new JAXBElement<String>(_AirlineMLPriceDispTotalMarkup_QNAME, String.class, AirlineMLPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DepCountryName", scope = APIRoutesEn.class)
  public JAXBElement<String> createAPIRoutesEnDepCountryName(String value) {
    return new JAXBElement<String>(_APIRoutesEnDepCountryName_QNAME, String.class, APIRoutesEn.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrCountryCode", scope = APIRoutesEn.class)
  public JAXBElement<String> createAPIRoutesEnArrCountryCode(String value) {
    return new JAXBElement<String>(_APIRoutesEnArrCountryCode_QNAME, String.class, APIRoutesEn.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DepCountryCode", scope = APIRoutesEn.class)
  public JAXBElement<String> createAPIRoutesEnDepCountryCode(String value) {
    return new JAXBElement<String>(_APIRoutesEnDepCountryCode_QNAME, String.class, APIRoutesEn.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DepCode", scope = APIRoutesEn.class)
  public JAXBElement<String> createAPIRoutesEnDepCode(String value) {
    return new JAXBElement<String>(_APIRoutesEnDepCode_QNAME, String.class, APIRoutesEn.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Status", scope = APIRoutesEn.class)
  public JAXBElement<String> createAPIRoutesEnStatus(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENStatus_QNAME, String.class, APIRoutesEn.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DepAirportName", scope = APIRoutesEn.class)
  public JAXBElement<String> createAPIRoutesEnDepAirportName(String value) {
    return new JAXBElement<String>(_APIRoutesEnDepAirportName_QNAME, String.class, APIRoutesEn.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrAirportName", scope = APIRoutesEn.class)
  public JAXBElement<String> createAPIRoutesEnArrAirportName(String value) {
    return new JAXBElement<String>(_APIRoutesEnArrAirportName_QNAME, String.class, APIRoutesEn.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrCountryName", scope = APIRoutesEn.class)
  public JAXBElement<String> createAPIRoutesEnArrCountryName(String value) {
    return new JAXBElement<String>(_APIRoutesEnArrCountryName_QNAME, String.class, APIRoutesEn.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrCode", scope = APIRoutesEn.class)
  public JAXBElement<String> createAPIRoutesEnArrCode(String value) {
    return new JAXBElement<String>(_APIRoutesEnArrCode_QNAME, String.class, APIRoutesEn.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SpecialServiceType", scope = BookingSpecialServices.class)
  public JAXBElement<String> createBookingSpecialServicesSpecialServiceType(String value) {
    return new JAXBElement<String>(_BookingSpecialServicesSpecialServiceType_QNAME, String.class, BookingSpecialServices.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialService }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SpecialServices", scope = BookingSpecialServices.class)
  public JAXBElement<ArrayOfSpecialService> createBookingSpecialServicesSpecialServices(ArrayOfSpecialService value) {
    return new JAXBElement<ArrayOfSpecialService>(_BookingSpecialServicesSpecialServices_QNAME, ArrayOfSpecialService.class,
        BookingSpecialServices.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "flightReservation", scope = FlightReservationInfo.class)
  public JAXBElement<FlightReservationEN> createFlightReservationInfoFlightReservation(FlightReservationEN value) {
    return new JAXBElement<FlightReservationEN>(_FlightReservationInfoFlightReservation_QNAME, FlightReservationEN.class, FlightReservationInfo.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BookingPriceBreakDownEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightPriceBreakDown", scope = FlightReservationInfo.class)
  public JAXBElement<BookingPriceBreakDownEN> createFlightReservationInfoFlightPriceBreakDown(BookingPriceBreakDownEN value) {
    return new JAXBElement<BookingPriceBreakDownEN>(_FlightReservationInfoFlightPriceBreakDown_QNAME, BookingPriceBreakDownEN.class,
        FlightReservationInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlightReservationSegmentsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "flightReservationSegments", scope = FlightReservationInfo.class)
  public JAXBElement<ArrayOfFlightReservationSegmentsEN> createFlightReservationInfoFlightReservationSegments(ArrayOfFlightReservationSegmentsEN value) {
    return new JAXBElement<ArrayOfFlightReservationSegmentsEN>(_FlightReservationInfoFlightReservationSegments_QNAME,
        ArrayOfFlightReservationSegmentsEN.class, FlightReservationInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ReservationPromoCodesEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PromoCodes", scope = FlightReservationInfo.class)
  public JAXBElement<ReservationPromoCodesEN> createFlightReservationInfoPromoCodes(ReservationPromoCodesEN value) {
    return new JAXBElement<ReservationPromoCodesEN>(_FlightReservationInfoPromoCodes_QNAME, ReservationPromoCodesEN.class,
        FlightReservationInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlightReservationEticketEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "eTicket", scope = FlightReservationInfo.class)
  public JAXBElement<ArrayOfFlightReservationEticketEN> createFlightReservationInfoETicket(ArrayOfFlightReservationEticketEN value) {
    return new JAXBElement<ArrayOfFlightReservationEticketEN>(_FlightReservationInfoETicket_QNAME, ArrayOfFlightReservationEticketEN.class,
        FlightReservationInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightManagementResponseEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ManagementResponse", scope = FlightReservationInfo.class)
  public JAXBElement<FlightManagementResponseEN> createFlightReservationInfoManagementResponse(FlightManagementResponseEN value) {
    return new JAXBElement<FlightManagementResponseEN>(_FlightReservationInfoManagementResponse_QNAME, FlightManagementResponseEN.class,
        FlightReservationInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFareRulesEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "farerules", scope = FlightReservationInfo.class)
  public JAXBElement<ArrayOfFareRulesEN> createFlightReservationInfoFarerules(ArrayOfFareRulesEN value) {
    return new JAXBElement<ArrayOfFareRulesEN>(_FlightReservationInfoFarerules_QNAME, ArrayOfFareRulesEN.class, FlightReservationInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAirlineMLFlightLeg }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AvailableFlights", scope = MultiFlightSearchReponse.class)
  public JAXBElement<ArrayOfAirlineMLFlightLeg> createMultiFlightSearchReponseAvailableFlights(ArrayOfAirlineMLFlightLeg value) {
    return new JAXBElement<ArrayOfAirlineMLFlightLeg>(_MultiFlightSearchReponseAvailableFlights_QNAME, ArrayOfAirlineMLFlightLeg.class,
        MultiFlightSearchReponse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ErrorDetails", scope = MultiFlightSearchReponse.class)
  public JAXBElement<String> createMultiFlightSearchReponseErrorDetails(String value) {
    return new JAXBElement<String>(_MultiFlightSearchReponseErrorDetails_QNAME, String.class, MultiFlightSearchReponse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FareBasisCode", scope = SegmentFareInfoEN.class)
  public JAXBElement<String> createSegmentFareInfoENFareBasisCode(String value) {
    return new JAXBElement<String>(_SegmentFareInfoENFareBasisCode_QNAME, String.class, SegmentFareInfoEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DepCode", scope = SegmentFareInfoEN.class)
  public JAXBElement<String> createSegmentFareInfoENDepCode(String value) {
    return new JAXBElement<String>(_APIRoutesEnDepCode_QNAME, String.class, SegmentFareInfoEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CurrencyCode", scope = SegmentFareInfoEN.class)
  public JAXBElement<String> createSegmentFareInfoENCurrencyCode(String value) {
    return new JAXBElement<String>(_InsuranceReservationENCurrencyCode_QNAME, String.class, SegmentFareInfoEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = SegmentFareInfoEN.class)
  public JAXBElement<Result> createSegmentFareInfoENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, SegmentFareInfoEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrCode", scope = SegmentFareInfoEN.class)
  public JAXBElement<String> createSegmentFareInfoENArrCode(String value) {
    return new JAXBElement<String>(_APIRoutesEnArrCode_QNAME, String.class, SegmentFareInfoEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PaxType", scope = SegmentFareInfoEN.class)
  public JAXBElement<String> createSegmentFareInfoENPaxType(String value) {
    return new JAXBElement<String>(_SegmentFareInfoENPaxType_QNAME, String.class, SegmentFareInfoEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "LocationName", scope = IntermediatePoint.class)
  public JAXBElement<String> createIntermediatePointLocationName(String value) {
    return new JAXBElement<String>(_IntermediatePointLocationName_QNAME, String.class, IntermediatePoint.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Via", scope = IntermediatePoint.class)
  public JAXBElement<String> createIntermediatePointVia(String value) {
    return new JAXBElement<String>(_IntermediatePointVia_QNAME, String.class, IntermediatePoint.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispArrivalDateTime", scope = IntermediatePoint.class)
  public JAXBElement<String> createIntermediatePointDispArrivalDateTime(String value) {
    return new JAXBElement<String>(_IntermediatePointDispArrivalDateTime_QNAME, String.class, IntermediatePoint.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Duration", scope = IntermediatePoint.class)
  public JAXBElement<String> createIntermediatePointDuration(String value) {
    return new JAXBElement<String>(_IntermediatePointDuration_QNAME, String.class, IntermediatePoint.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ElapsedTime", scope = IntermediatePoint.class)
  public JAXBElement<String> createIntermediatePointElapsedTime(String value) {
    return new JAXBElement<String>(_IntermediatePointElapsedTime_QNAME, String.class, IntermediatePoint.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "LocationCode", scope = IntermediatePoint.class)
  public JAXBElement<String> createIntermediatePointLocationCode(String value) {
    return new JAXBElement<String>(_IntermediatePointLocationCode_QNAME, String.class, IntermediatePoint.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AirportName", scope = IntermediatePoint.class)
  public JAXBElement<String> createIntermediatePointAirportName(String value) {
    return new JAXBElement<String>(_IntermediatePointAirportName_QNAME, String.class, IntermediatePoint.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepartureTime", scope = IntermediatePoint.class)
  public JAXBElement<String> createIntermediatePointDepartureTime(String value) {
    return new JAXBElement<String>(_IntermediatePointDepartureTime_QNAME, String.class, IntermediatePoint.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrivalTime", scope = IntermediatePoint.class)
  public JAXBElement<String> createIntermediatePointArrivalTime(String value) {
    return new JAXBElement<String>(_IntermediatePointArrivalTime_QNAME, String.class, IntermediatePoint.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "IntermediatePointTimeZone", scope = IntermediatePoint.class)
  public JAXBElement<String> createIntermediatePointIntermediatePointTimeZone(String value) {
    return new JAXBElement<String>(_IntermediatePointIntermediatePointTimeZone_QNAME, String.class, IntermediatePoint.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrivalDateTime", scope = IntermediatePoint.class)
  public JAXBElement<String> createIntermediatePointArrivalDateTime(String value) {
    return new JAXBElement<String>(_IntermediatePointArrivalDateTime_QNAME, String.class, IntermediatePoint.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepartureDateTime", scope = IntermediatePoint.class)
  public JAXBElement<String> createIntermediatePointDepartureDateTime(String value) {
    return new JAXBElement<String>(_IntermediatePointDepartureDateTime_QNAME, String.class, IntermediatePoint.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispDepartureDateTime", scope = IntermediatePoint.class)
  public JAXBElement<String> createIntermediatePointDispDepartureDateTime(String value) {
    return new JAXBElement<String>(_IntermediatePointDispDepartureDateTime_QNAME, String.class, IntermediatePoint.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "UserName", scope = APICancelBookingRequest.class)
  public JAXBElement<String> createAPICancelBookingRequestUserName(String value) {
    return new JAXBElement<String>(_APICancelBookingRequestUserName_QNAME, String.class, APICancelBookingRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Password", scope = APICancelBookingRequest.class)
  public JAXBElement<String> createAPICancelBookingRequestPassword(String value) {
    return new JAXBElement<String>(_APICancelBookingRequestPassword_QNAME, String.class, APICancelBookingRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PNRNo", scope = APICancelBookingRequest.class)
  public JAXBElement<String> createAPICancelBookingRequestPNRNo(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENPNRNo_QNAME, String.class, APICancelBookingRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPassengersEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Passengers", scope = PaxLoginsEN.class)
  public JAXBElement<ArrayOfPassengersEN> createPaxLoginsENPassengers(ArrayOfPassengersEN value) {
    return new JAXBElement<ArrayOfPassengersEN>(_PaxLoginsENPassengers_QNAME, ArrayOfPassengersEN.class, PaxLoginsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DepCode", scope = PaxLoginsEN.class)
  public JAXBElement<String> createPaxLoginsENDepCode(String value) {
    return new JAXBElement<String>(_APIRoutesEnDepCode_QNAME, String.class, PaxLoginsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "UniqueID", scope = PaxLoginsEN.class)
  public JAXBElement<String> createPaxLoginsENUniqueID(String value) {
    return new JAXBElement<String>(_PaxLoginsENUniqueID_QNAME, String.class, PaxLoginsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "UserName", scope = PaxLoginsEN.class)
  public JAXBElement<String> createPaxLoginsENUserName(String value) {
    return new JAXBElement<String>(_APICancelBookingRequestUserName_QNAME, String.class, PaxLoginsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PassengerDetailsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PassengerDetails", scope = PaxLoginsEN.class)
  public JAXBElement<PassengerDetailsEN> createPaxLoginsENPassengerDetails(PassengerDetailsEN value) {
    return new JAXBElement<PassengerDetailsEN>(_PaxLoginsENPassengerDetails_QNAME, PassengerDetailsEN.class, PaxLoginsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "RegID", scope = PaxLoginsEN.class)
  public JAXBElement<String> createPaxLoginsENRegID(String value) {
    return new JAXBElement<String>(_PaxLoginsENRegID_QNAME, String.class, PaxLoginsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ProfileEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Profile", scope = PaxLoginsEN.class)
  public JAXBElement<ProfileEN> createPaxLoginsENProfile(ProfileEN value) {
    return new JAXBElement<ProfileEN>(_PaxLoginsENProfile_QNAME, ProfileEN.class, PaxLoginsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Password", scope = PaxLoginsEN.class)
  public JAXBElement<String> createPaxLoginsENPassword(String value) {
    return new JAXBElement<String>(_APICancelBookingRequestPassword_QNAME, String.class, PaxLoginsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ConsentEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ConsentInfo", scope = PaxLoginsEN.class)
  public JAXBElement<ConsentEN> createPaxLoginsENConsentInfo(ConsentEN value) {
    return new JAXBElement<ConsentEN>(_PaxLoginsENConsentInfo_QNAME, ConsentEN.class, PaxLoginsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = PaxLoginsEN.class)
  public JAXBElement<Result> createPaxLoginsENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, PaxLoginsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrCode", scope = PaxLoginsEN.class)
  public JAXBElement<String> createPaxLoginsENArrCode(String value) {
    return new JAXBElement<String>(_APIRoutesEnArrCode_QNAME, String.class, PaxLoginsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "NetzSkyMD5ProfileId", scope = PaxLoginsEN.class)
  public JAXBElement<String> createPaxLoginsENNetzSkyMD5ProfileId(String value) {
    return new JAXBElement<String>(_PaxLoginsENNetzSkyMD5ProfileId_QNAME, String.class, PaxLoginsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "TargetCurrency", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryTargetCurrency(String value) {
    return new JAXBElement<String>(_PackageSummaryTargetCurrency_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SummaryErrorMsg", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummarySummaryErrorMsg(String value) {
    return new JAXBElement<String>(_PackageSummarySummaryErrorMsg_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispTotal", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryDispTotal(String value) {
    return new JAXBElement<String>(_PackageSummaryDispTotal_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PaymentCurrency", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryPaymentCurrency(String value) {
    return new JAXBElement<String>(_PackageSummaryPaymentCurrency_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispTotalRedeem", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryDispTotalRedeem(String value) {
    return new JAXBElement<String>(_PackageSummaryDispTotalRedeem_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialPriceSummary }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SPSummary", scope = PackageSummary.class)
  public JAXBElement<ArrayOfSpecialPriceSummary> createPackageSummarySPSummary(ArrayOfSpecialPriceSummary value) {
    return new JAXBElement<ArrayOfSpecialPriceSummary>(_PackageSummarySPSummary_QNAME, ArrayOfSpecialPriceSummary.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Description", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryDescription(String value) {
    return new JAXBElement<String>(_PaxTypeChargeDescription_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PromoID", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryPromoID(String value) {
    return new JAXBElement<String>(_PackageSummaryPromoID_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PaymentCurrencyDesc", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryPaymentCurrencyDesc(String value) {
    return new JAXBElement<String>(_PackageSummaryPaymentCurrencyDesc_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PaymentCurrencyDispTotal", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryPaymentCurrencyDispTotal(String value) {
    return new JAXBElement<String>(_PackageSummaryPaymentCurrencyDispTotal_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispNetAmount", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryDispNetAmount(String value) {
    return new JAXBElement<String>(_PackageSummaryDispNetAmount_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Remarks", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryRemarks(String value) {
    return new JAXBElement<String>(_PackageSummaryRemarks_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "TaxCode", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryTaxCode(String value) {
    return new JAXBElement<String>(_GSTBreakDownInfoTaxCode_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SummaryErrorMsgText", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummarySummaryErrorMsgText(String value) {
    return new JAXBElement<String>(_PackageSummarySummaryErrorMsgText_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CurrencyCode", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryCurrencyCode(String value) {
    return new JAXBElement<String>(_FlightsCurrencyCode_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispTaxnFees", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryDispTaxnFees(String value) {
    return new JAXBElement<String>(_PackageSummaryDispTaxnFees_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispRedeemInUse", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryDispRedeemInUse(String value) {
    return new JAXBElement<String>(_PackageSummaryDispRedeemInUse_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispAmount", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryDispAmount(String value) {
    return new JAXBElement<String>(_PackageSummaryDispAmount_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SourceCurrency", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummarySourceCurrency(String value) {
    return new JAXBElement<String>(_PackageSummarySourceCurrency_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PromoStatus", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryPromoStatus(String value) {
    return new JAXBElement<String>(_PackageSummaryPromoStatus_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SMSSettingsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SMSSettingsInfo", scope = PackageSummary.class)
  public JAXBElement<SMSSettingsEN> createPackageSummarySMSSettingsInfo(SMSSettingsEN value) {
    return new JAXBElement<SMSSettingsEN>(_PackageSummarySMSSettingsInfo_QNAME, SMSSettingsEN.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispRedeemAmount", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryDispRedeemAmount(String value) {
    return new JAXBElement<String>(_PackageSummaryDispRedeemAmount_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PaymentCurrencyDispTaxnFees", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryPaymentCurrencyDispTaxnFees(String value) {
    return new JAXBElement<String>(_PackageSummaryPaymentCurrencyDispTaxnFees_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispCurrencySymbol", scope = PackageSummary.class)
  public JAXBElement<String> createPackageSummaryDispCurrencySymbol(String value) {
    return new JAXBElement<String>(_PackageSummaryDispCurrencySymbol_QNAME, String.class, PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSGDInsurancePackageSummary }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SGDInsurancePackageSummary", scope = PackageSummary.class)
  public JAXBElement<ArrayOfSGDInsurancePackageSummary> createPackageSummarySGDInsurancePackageSummary(ArrayOfSGDInsurancePackageSummary value) {
    return new JAXBElement<ArrayOfSGDInsurancePackageSummary>(_SGDInsurancePackageSummary_QNAME, ArrayOfSGDInsurancePackageSummary.class,
        PackageSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "GroupName", scope = MarkupGroupsEN.class)
  public JAXBElement<String> createMarkupGroupsENGroupName(String value) {
    return new JAXBElement<String>(_MarkupGroupsENGroupName_QNAME, String.class, MarkupGroupsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Status", scope = MarkupGroupsEN.class)
  public JAXBElement<String> createMarkupGroupsENStatus(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENStatus_QNAME, String.class, MarkupGroupsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = MarkupGroupsEN.class)
  public JAXBElement<Result> createMarkupGroupsENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, MarkupGroupsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPIMealInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Meals", scope = APIMealSegment.class)
  public JAXBElement<ArrayOfAPIMealInfo> createAPIMealSegmentMeals(ArrayOfAPIMealInfo value) {
    return new JAXBElement<ArrayOfAPIMealInfo>(_APIAddonAvailabilityResMeals_QNAME, ArrayOfAPIMealInfo.class, APIMealSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrAirCode", scope = APIMealSegment.class)
  public JAXBElement<String> createAPIMealSegmentArrAirCode(String value) {
    return new JAXBElement<String>(_APIMealSegmentArrAirCode_QNAME, String.class, APIMealSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepAirCode", scope = APIMealSegment.class)
  public JAXBElement<String> createAPIMealSegmentDepAirCode(String value) {
    return new JAXBElement<String>(_APIMealSegmentDepAirCode_QNAME, String.class, APIMealSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BreakupType", scope = BookingPriceBreakDownEN.class)
  public JAXBElement<String> createBookingPriceBreakDownENBreakupType(String value) {
    return new JAXBElement<String>(_BookingPriceBreakDownENBreakupType_QNAME, String.class, BookingPriceBreakDownEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaxPriceBreakDown }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PaxPriceBreakup", scope = BookingPriceBreakDownEN.class)
  public JAXBElement<ArrayOfPaxPriceBreakDown> createBookingPriceBreakDownENPaxPriceBreakup(ArrayOfPaxPriceBreakDown value) {
    return new JAXBElement<ArrayOfPaxPriceBreakDown>(_BookingPriceBreakDownENPaxPriceBreakup_QNAME, ArrayOfPaxPriceBreakDown.class,
        BookingPriceBreakDownEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BreakupCurrency", scope = BookingPriceBreakDownEN.class)
  public JAXBElement<String> createBookingPriceBreakDownENBreakupCurrency(String value) {
    return new JAXBElement<String>(_BookingPriceBreakDownENBreakupCurrency_QNAME, String.class, BookingPriceBreakDownEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ImageFileName", scope = CustomerUserCardTypesEN.class)
  public JAXBElement<String> createCustomerUserCardTypesENImageFileName(String value) {
    return new JAXBElement<String>(_CustomerUserCardTypesENImageFileName_QNAME, String.class, CustomerUserCardTypesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Currency", scope = CustomerUserCardTypesEN.class)
  public JAXBElement<String> createCustomerUserCardTypesENCurrency(String value) {
    return new JAXBElement<String>(_LoungeReservationENCurrency_QNAME, String.class, CustomerUserCardTypesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MarkupApplicableCurrency", scope = CustomerUserCardTypesEN.class)
  public JAXBElement<String> createCustomerUserCardTypesENMarkupApplicableCurrency(String value) {
    return new JAXBElement<String>(_CustomerUserCardTypesENMarkupApplicableCurrency_QNAME, String.class, CustomerUserCardTypesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SupportedCurrencies", scope = CustomerUserCardTypesEN.class)
  public JAXBElement<String> createCustomerUserCardTypesENSupportedCurrencies(String value) {
    return new JAXBElement<String>(_CustomerUserCardTypesENSupportedCurrencies_QNAME, String.class, CustomerUserCardTypesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MarkupCurrency", scope = CustomerUserCardTypesEN.class)
  public JAXBElement<String> createCustomerUserCardTypesENMarkupCurrency(String value) {
    return new JAXBElement<String>(_CustomerUserCardTypesENMarkupCurrency_QNAME, String.class, CustomerUserCardTypesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = CustomerUserCardTypesEN.class)
  public JAXBElement<Result> createCustomerUserCardTypesENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, CustomerUserCardTypesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBookingSpecialServices }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "BookingSpecialServices", scope = APIBookingSpecialServices.class)
  public JAXBElement<ArrayOfBookingSpecialServices> createAPIBookingSpecialServicesBookingSpecialServices(ArrayOfBookingSpecialServices value) {
    return new JAXBElement<ArrayOfBookingSpecialServices>(_BookingSpecialServices_QNAME, ArrayOfBookingSpecialServices.class,
        APIBookingSpecialServices.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Error", scope = APIBookingSpecialServices.class)
  public JAXBElement<String> createAPIBookingSpecialServicesError(String value) {
    return new JAXBElement<String>(_APIBookingSpecialServicesError_QNAME, String.class, APIBookingSpecialServices.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPIBaggageSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AvailableBaggages", scope = APIBaggageAvailability.class)
  public JAXBElement<ArrayOfAPIBaggageSegment> createAPIBaggageAvailabilityAvailableBaggages(ArrayOfAPIBaggageSegment value) {
    return new JAXBElement<ArrayOfAPIBaggageSegment>(_APIBaggageAvailabilityAvailableBaggages_QNAME, ArrayOfAPIBaggageSegment.class,
        APIBaggageAvailability.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ErrorDetails", scope = MultiSetSelectedReponse.class)
  public JAXBElement<String> createMultiSetSelectedReponseErrorDetails(String value) {
    return new JAXBElement<String>(_MultiFlightSearchReponseErrorDetails_QNAME, String.class, MultiSetSelectedReponse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link AirlineMLAvail }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SelectedMLFlights", scope = MultiSetSelectedReponse.class)
  public JAXBElement<AirlineMLAvail> createMultiSetSelectedReponseSelectedMLFlights(AirlineMLAvail value) {
    return new JAXBElement<AirlineMLAvail>(_MultiSetSelectedReponseSelectedMLFlights_QNAME, AirlineMLAvail.class, MultiSetSelectedReponse.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "TerminalName", scope = FlightTerminalInfo.class)
  public JAXBElement<String> createFlightTerminalInfoTerminalName(String value) {
    return new JAXBElement<String>(_FlightTerminalInfoTerminalName_QNAME, String.class, FlightTerminalInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "TerminalCode", scope = FlightTerminalInfo.class)
  public JAXBElement<String> createFlightTerminalInfoTerminalCode(String value) {
    return new JAXBElement<String>(_FlightTerminalInfoTerminalCode_QNAME, String.class, FlightTerminalInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DescriptionText", scope = APIAddonPriceInfo.class)
  public JAXBElement<String> createAPIAddonPriceInfoDescriptionText(String value) {
    return new JAXBElement<String>(_APIAddonPriceInfoDescriptionText_QNAME, String.class, APIAddonPriceInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispAdultPrice", scope = APIAddonPriceInfo.class)
  public JAXBElement<String> createAPIAddonPriceInfoDispAdultPrice(String value) {
    return new JAXBElement<String>(_APIAddonPriceInfoDispAdultPrice_QNAME, String.class, APIAddonPriceInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ChildCommercialName", scope = APIAddonPriceInfo.class)
  public JAXBElement<String> createAPIAddonPriceInfoChildCommercialName(String value) {
    return new JAXBElement<String>(_APIAddonPriceInfoChildCommercialName_QNAME, String.class, APIAddonPriceInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispChildPrice", scope = APIAddonPriceInfo.class)
  public JAXBElement<String> createAPIAddonPriceInfoDispChildPrice(String value) {
    return new JAXBElement<String>(_APIAddonPriceInfoDispChildPrice_QNAME, String.class, APIAddonPriceInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AdultCommercialName", scope = APIAddonPriceInfo.class)
  public JAXBElement<String> createAPIAddonPriceInfoAdultCommercialName(String value) {
    return new JAXBElement<String>(_APIAddonPriceInfoAdultCommercialName_QNAME, String.class, APIAddonPriceInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispPrice", scope = APIAddonPriceInfo.class)
  public JAXBElement<String> createAPIAddonPriceInfoDispPrice(String value) {
    return new JAXBElement<String>(_APIAddonPriceInfoDispPrice_QNAME, String.class, APIAddonPriceInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AirportCode", scope = APIAddonPriceInfo.class)
  public JAXBElement<String> createAPIAddonPriceInfoAirportCode(String value) {
    return new JAXBElement<String>(_APIAddonPriceInfoAirportCode_QNAME, String.class, APIAddonPriceInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispTax", scope = APIAddonPriceInfo.class)
  public JAXBElement<String> createAPIAddonPriceInfoDispTax(String value) {
    return new JAXBElement<String>(_APIAddonPriceInfoDispTax_QNAME, String.class, APIAddonPriceInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispTotalPrice", scope = APIAddonPriceInfo.class)
  public JAXBElement<String> createAPIAddonPriceInfoDispTotalPrice(String value) {
    return new JAXBElement<String>(_APIAddonPriceInfoDispTotalPrice_QNAME, String.class, APIAddonPriceInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CurrencyCode", scope = APIAddonPriceInfo.class)
  public JAXBElement<String> createAPIAddonPriceInfoCurrencyCode(String value) {
    return new JAXBElement<String>(_FlightsCurrencyCode_QNAME, String.class, APIAddonPriceInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISeatSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AvailableSeats", scope = APISeatAvailability.class)
  public JAXBElement<ArrayOfAPISeatSegment> createAPISeatAvailabilityAvailableSeats(ArrayOfAPISeatSegment value) {
    return new JAXBElement<ArrayOfAPISeatSegment>(_APISeatAvailabilityAvailableSeats_QNAME, ArrayOfAPISeatSegment.class, APISeatAvailability.class,
        value);
  }

  /**
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SegmentIndex", scope = APISelectedLounge.class)
  public JAXBElement<ArrayOfint> createAPISelectedLoungeSegmentIndex(ArrayOfint value) {
    return new JAXBElement<ArrayOfint>(_APISelectedBaggagesSegmentIndex_QNAME, ArrayOfint.class, APISelectedLounge.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISelectedMeals }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SelectedMeals", scope = APIPaxSelectedAddOn.class)
  public JAXBElement<ArrayOfAPISelectedMeals> createAPIPaxSelectedAddOnSelectedMeals(ArrayOfAPISelectedMeals value) {
    return new JAXBElement<ArrayOfAPISelectedMeals>(_APIPaxSelectedAddOnSelectedMeals_QNAME, ArrayOfAPISelectedMeals.class, APIPaxSelectedAddOn.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISelectedLounge }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SelectedLounges", scope = APIPaxSelectedAddOn.class)
  public JAXBElement<ArrayOfAPISelectedLounge> createAPIPaxSelectedAddOnSelectedLounges(ArrayOfAPISelectedLounge value) {
    return new JAXBElement<ArrayOfAPISelectedLounge>(_APIPaxSelectedAddOnSelectedLounges_QNAME, ArrayOfAPISelectedLounge.class,
        APIPaxSelectedAddOn.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISelectedBaggages }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SelectedBaggages", scope = APIPaxSelectedAddOn.class)
  public JAXBElement<ArrayOfAPISelectedBaggages> createAPIPaxSelectedAddOnSelectedBaggages(ArrayOfAPISelectedBaggages value) {
    return new JAXBElement<ArrayOfAPISelectedBaggages>(_APIPaxSelectedAddOnSelectedBaggages_QNAME, ArrayOfAPISelectedBaggages.class,
        APIPaxSelectedAddOn.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISelectedSeat }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SelectedSeats", scope = APIPaxSelectedAddOn.class)
  public JAXBElement<ArrayOfAPISelectedSeat> createAPIPaxSelectedAddOnSelectedSeats(ArrayOfAPISelectedSeat value) {
    return new JAXBElement<ArrayOfAPISelectedSeat>(_APIPaxSelectedAddOnSelectedSeats_QNAME, ArrayOfAPISelectedSeat.class, APIPaxSelectedAddOn.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PassengerType", scope = APIPaxSelectedAddOn.class)
  public JAXBElement<String> createAPIPaxSelectedAddOnPassengerType(String value) {
    return new JAXBElement<String>(_PassengerType_QNAME, String.class, APIPaxSelectedAddOn.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Currecny", scope = B2BCompanyDetails.class)
  public JAXBElement<String> createB2BCompanyDetailsCurrecny(String value) {
    return new JAXBElement<String>(_B2BCompanyDetailsCurrecny_QNAME, String.class, B2BCompanyDetails.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ErrorDesc", scope = B2BCompanyDetails.class)
  public JAXBElement<String> createB2BCompanyDetailsErrorDesc(String value) {
    return new JAXBElement<String>(_B2BCompanyDetailsErrorDesc_QNAME, String.class, B2BCompanyDetails.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Telephone", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENTelephone(String value) {
    return new JAXBElement<String>(_PassengerDetailsENTelephone_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CountryName", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENCountryName(String value) {
    return new JAXBElement<String>(_PassengerDetailsENCountryName_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EmergContact_SurName", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENEmergContactSurName(String value) {
    return new JAXBElement<String>(_PassengerDetailsENEmergContactSurName_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Email", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENEmail(String value) {
    return new JAXBElement<String>(_PassengersENEmail_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EmergContact_FirstName", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENEmergContactFirstName(String value) {
    return new JAXBElement<String>(_PassengerDetailsENEmergContactFirstName_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "County", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENCounty(String value) {
    return new JAXBElement<String>(_PassengerDetailsENCounty_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BusinessContactNo", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENBusinessContactNo(String value) {
    return new JAXBElement<String>(_PassengerDetailsENBusinessContactNo_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "WorkContactNo", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENWorkContactNo(String value) {
    return new JAXBElement<String>(_PassengerDetailsENWorkContactNo_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EmergContact_Title", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENEmergContactTitle(String value) {
    return new JAXBElement<String>(_PassengerDetailsENEmergContactTitle_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MobileNo", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENMobileNo(String value) {
    return new JAXBElement<String>(_PassengersENMobileNo_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EmergContact_Relationship", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENEmergContactRelationship(String value) {
    return new JAXBElement<String>(_PassengerDetailsENEmergContactRelationship_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link GSTReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "GSTCompanyDetails", scope = PassengerDetailsEN.class)
  public JAXBElement<GSTReservationEN> createPassengerDetailsENGSTCompanyDetails(GSTReservationEN value) {
    return new JAXBElement<GSTReservationEN>(_PassengerDetailsENGSTCompanyDetails_QNAME, GSTReservationEN.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Postcode", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENPostcode(String value) {
    return new JAXBElement<String>(_PassengerDetailsENPostcode_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Address2", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENAddress2(String value) {
    return new JAXBElement<String>(_PassengerDetailsENAddress2_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Address3", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENAddress3(String value) {
    return new JAXBElement<String>(_PassengerDetailsENAddress3_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Address1", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENAddress1(String value) {
    return new JAXBElement<String>(_PassengerDetailsENAddress1_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "City", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENCity(String value) {
    return new JAXBElement<String>(_PassengerDetailsENCity_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ContactNoType", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENContactNoType(String value) {
    return new JAXBElement<String>(_PassengersENContactNoType_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PreferredAddress", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENPreferredAddress(String value) {
    return new JAXBElement<String>(_PassengerDetailsENPreferredAddress_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationID", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENReservationID(String value) {
    return new JAXBElement<String>(_FareRulesENReservationID_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "State", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENState(String value) {
    return new JAXBElement<String>(_PassengerDetailsENState_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Fax", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENFax(String value) {
    return new JAXBElement<String>(_PassengerDetailsENFax_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EmergContact_AreaCode", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENEmergContactAreaCode(String value) {
    return new JAXBElement<String>(_PassengerDetailsENEmergContactAreaCode_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EmergContact_Telephone", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENEmergContactTelephone(String value) {
    return new JAXBElement<String>(_PassengerDetailsENEmergContactTelephone_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Region", scope = PassengerDetailsEN.class)
  public JAXBElement<String> createPassengerDetailsENRegion(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENRegion_QNAME, String.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = PassengerDetailsEN.class)
  public JAXBElement<Result> createPassengerDetailsENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, PassengerDetailsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Status", scope = PaymentMethodsEN.class)
  public JAXBElement<String> createPaymentMethodsENStatus(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENStatus_QNAME, String.class, PaymentMethodsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Name", scope = PaymentMethodsEN.class)
  public JAXBElement<String> createPaymentMethodsENName(String value) {
    return new JAXBElement<String>(_PaymentMethodsENName_QNAME, String.class, PaymentMethodsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = PaymentMethodsEN.class)
  public JAXBElement<Result> createPaymentMethodsENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, PaymentMethodsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SpecialFareType", scope = AirlineMLPaxPrice.class)
  public JAXBElement<String> createAirlineMLPaxPriceSpecialFareType(String value) {
    return new JAXBElement<String>(_PerPaxPriceInfoSpecialFareType_QNAME, String.class, AirlineMLPaxPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispPromotionPerPax", scope = AirlineMLPaxPrice.class)
  public JAXBElement<String> createAirlineMLPaxPriceDispPromotionPerPax(String value) {
    return new JAXBElement<String>(_PerPaxPriceInfoDispPromotionPerPax_QNAME, String.class, AirlineMLPaxPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispPerPaxTotal", scope = AirlineMLPaxPrice.class)
  public JAXBElement<String> createAirlineMLPaxPriceDispPerPaxTotal(String value) {
    return new JAXBElement<String>(_AirlineMLPaxPriceDispPerPaxTotal_QNAME, String.class, AirlineMLPaxPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Currency", scope = AirlineMLPaxPrice.class)
  public JAXBElement<String> createAirlineMLPaxPriceCurrency(String value) {
    return new JAXBElement<String>(_AirlineMLAvailCurrency_QNAME, String.class, AirlineMLPaxPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispPerPaxPrice", scope = AirlineMLPaxPrice.class)
  public JAXBElement<String> createAirlineMLPaxPriceDispPerPaxPrice(String value) {
    return new JAXBElement<String>(_AirlineMLPaxPriceDispPerPaxPrice_QNAME, String.class, AirlineMLPaxPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispPerPaxTax", scope = AirlineMLPaxPrice.class)
  public JAXBElement<String> createAirlineMLPaxPriceDispPerPaxTax(String value) {
    return new JAXBElement<String>(_AirlineMLPaxPriceDispPerPaxTax_QNAME, String.class, AirlineMLPaxPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DisplayCurrency", scope = AirlineMLPaxPrice.class)
  public JAXBElement<String> createAirlineMLPaxPriceDisplayCurrency(String value) {
    return new JAXBElement<String>(_AirlineMLPriceDisplayCurrency_QNAME, String.class, AirlineMLPaxPrice.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PerPaxPriceInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ChildPrice", scope = PriceInformation.class)
  public JAXBElement<PerPaxPriceInfo> createPriceInformationChildPrice(PerPaxPriceInfo value) {
    return new JAXBElement<PerPaxPriceInfo>(_PriceInformationChildPrice_QNAME, PerPaxPriceInfo.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispInsuranceAmt", scope = PriceInformation.class)
  public JAXBElement<String> createPriceInformationDispInsuranceAmt(String value) {
    return new JAXBElement<String>(_PriceInformationDispInsuranceAmt_QNAME, String.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispStrikeoutFarePrice", scope = PriceInformation.class)
  public JAXBElement<String> createPriceInformationDispStrikeoutFarePrice(String value) {
    return new JAXBElement<String>(_PriceInformationDispStrikeoutFarePrice_QNAME, String.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispGSTTotalTax", scope = PriceInformation.class)
  public JAXBElement<String> createPriceInformationDispGSTTotalTax(String value) {
    return new JAXBElement<String>(_PriceInformationDispGSTTotalTax_QNAME, String.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispTotalPrice", scope = PriceInformation.class)
  public JAXBElement<String> createPriceInformationDispTotalPrice(String value) {
    return new JAXBElement<String>(_PriceInformationDispTotalPrice_QNAME, String.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispTotalWithInsurance", scope = PriceInformation.class)
  public JAXBElement<String> createPriceInformationDispTotalWithInsurance(String value) {
    return new JAXBElement<String>(_PriceInformationDispTotalWithInsurance_QNAME, String.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispPkgAmountWithPromotion", scope = PriceInformation.class)
  public JAXBElement<String> createPriceInformationDispPkgAmountWithPromotion(String value) {
    return new JAXBElement<String>(_AirlineMLPriceDispPkgAmountWithPromotion_QNAME, String.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispTotalTaxwithoutGST", scope = PriceInformation.class)
  public JAXBElement<String> createPriceInformationDispTotalTaxwithoutGST(String value) {
    return new JAXBElement<String>(_PriceInformationDispTotalTaxwithoutGST_QNAME, String.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPerPaxPriceInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SpecialPrice", scope = PriceInformation.class)
  public JAXBElement<ArrayOfPerPaxPriceInfo> createPriceInformationSpecialPrice(ArrayOfPerPaxPriceInfo value) {
    return new JAXBElement<ArrayOfPerPaxPriceInfo>(_PriceInformationSpecialPrice_QNAME, ArrayOfPerPaxPriceInfo.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispStrikeoutTotalPrice", scope = PriceInformation.class)
  public JAXBElement<String> createPriceInformationDispStrikeoutTotalPrice(String value) {
    return new JAXBElement<String>(_PriceInformationDispStrikeoutTotalPrice_QNAME, String.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispGSTTax", scope = PriceInformation.class)
  public JAXBElement<String> createPriceInformationDispGSTTax(String value) {
    return new JAXBElement<String>(_PriceInformationDispGSTTax_QNAME, String.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "BaseFareRoundingText", scope = PriceInformation.class)
  public JAXBElement<String> createPriceInformationBaseFareRoundingText(String value) {
    return new JAXBElement<String>(_AirlineMLPriceBaseFareRoundingText_QNAME, String.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PaxPriceDifference }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PerSegPaxPriceDiff", scope = PriceInformation.class)
  public JAXBElement<PaxPriceDifference> createPriceInformationPerSegPaxPriceDiff(PaxPriceDifference value) {
    return new JAXBElement<PaxPriceDifference>(_AirlineMLPricePerSegPaxPriceDiff_QNAME, PaxPriceDifference.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispPromotionTotalAmount", scope = PriceInformation.class)
  public JAXBElement<String> createPriceInformationDispPromotionTotalAmount(String value) {
    return new JAXBElement<String>(_AirlineMLPriceDispPromotionTotalAmount_QNAME, String.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispBaseFareDiff", scope = PriceInformation.class)
  public JAXBElement<String> createPriceInformationDispBaseFareDiff(String value) {
    return new JAXBElement<String>(_PriceInformationDispBaseFareDiff_QNAME, String.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "InsuranceName", scope = PriceInformation.class)
  public JAXBElement<String> createPriceInformationInsuranceName(String value) {
    return new JAXBElement<String>(_PriceInformationInsuranceName_QNAME, String.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PerPaxPriceInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "InfantPrice", scope = PriceInformation.class)
  public JAXBElement<PerPaxPriceInfo> createPriceInformationInfantPrice(PerPaxPriceInfo value) {
    return new JAXBElement<PerPaxPriceInfo>(_PriceInformationInfantPrice_QNAME, PerPaxPriceInfo.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispTotalTax", scope = PriceInformation.class)
  public JAXBElement<String> createPriceInformationDispTotalTax(String value) {
    return new JAXBElement<String>(_PriceInformationDispTotalTax_QNAME, String.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PkgDispAmt", scope = PriceInformation.class)
  public JAXBElement<String> createPriceInformationPkgDispAmt(String value) {
    return new JAXBElement<String>(_PriceInformationPkgDispAmt_QNAME, String.class, PriceInformation.class, value);
  }

  /**
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "LoyaltyPrice", scope = PriceInformation.class)
  public JAXBElement<LoyaltyPriceInfo> createPriceInformationLoyaltyPrice(LoyaltyPriceInfo value) {
    return new JAXBElement<LoyaltyPriceInfo>(_PriceInformationLoyaltyPrice_QNAME, LoyaltyPriceInfo.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PerPaxPriceInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AdultPrice", scope = PriceInformation.class)
  public JAXBElement<PerPaxPriceInfo> createPriceInformationAdultPrice(PerPaxPriceInfo value) {
    return new JAXBElement<PerPaxPriceInfo>(_PriceInformationAdultPrice_QNAME, PerPaxPriceInfo.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispPriceDiff", scope = PriceInformation.class)
  public JAXBElement<String> createPriceInformationDispPriceDiff(String value) {
    return new JAXBElement<String>(_AirlineMLPriceDispPriceDiff_QNAME, String.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispPriceText", scope = PriceInformation.class)
  public JAXBElement<String> createPriceInformationDispPriceText(String value) {
    return new JAXBElement<String>(_PriceInformationDispPriceText_QNAME, String.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispBaseFarePrice", scope = PriceInformation.class)
  public JAXBElement<String> createPriceInformationDispBaseFarePrice(String value) {
    return new JAXBElement<String>(_PriceInformationDispBaseFarePrice_QNAME, String.class, PriceInformation.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DIS", scope = FreeBaggageAllowance.class)
  public JAXBElement<String> createFreeBaggageAllowanceDIS(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceDIS_QNAME, String.class, FreeBaggageAllowance.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "IC", scope = FreeBaggageAllowance.class)
  public JAXBElement<String> createFreeBaggageAllowanceIC(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceIC_QNAME, String.class, FreeBaggageAllowance.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "I", scope = FreeBaggageAllowance.class)
  public JAXBElement<String> createFreeBaggageAllowanceI(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceI_QNAME, String.class, FreeBaggageAllowance.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SRC", scope = FreeBaggageAllowance.class)
  public JAXBElement<String> createFreeBaggageAllowanceSRC(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceSRC_QNAME, String.class, FreeBaggageAllowance.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "STU", scope = FreeBaggageAllowance.class)
  public JAXBElement<String> createFreeBaggageAllowanceSTU(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceSTU_QNAME, String.class, FreeBaggageAllowance.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "GVT", scope = FreeBaggageAllowance.class)
  public JAXBElement<String> createFreeBaggageAllowanceGVT(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceGVT_QNAME, String.class, FreeBaggageAllowance.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "C", scope = FreeBaggageAllowance.class)
  public JAXBElement<String> createFreeBaggageAllowanceC(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceC_QNAME, String.class, FreeBaggageAllowance.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AC", scope = FreeBaggageAllowance.class)
  public JAXBElement<String> createFreeBaggageAllowanceAC(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceAC_QNAME, String.class, FreeBaggageAllowance.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "A", scope = FreeBaggageAllowance.class)
  public JAXBElement<String> createFreeBaggageAllowanceA(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceA_QNAME, String.class, FreeBaggageAllowance.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ADD", scope = FreeBaggageAllowance.class)
  public JAXBElement<String> createFreeBaggageAllowanceADD(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceADD_QNAME, String.class, FreeBaggageAllowance.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CC", scope = FreeBaggageAllowance.class)
  public JAXBElement<String> createFreeBaggageAllowanceCC(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceCC_QNAME, String.class, FreeBaggageAllowance.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SpecialFareType", scope = SpecialPriceSummary.class)
  public JAXBElement<String> createSpecialPriceSummarySpecialFareType(String value) {
    return new JAXBElement<String>(_PerPaxPriceInfoSpecialFareType_QNAME, String.class, SpecialPriceSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispPerPaxPrice", scope = SpecialPriceSummary.class)
  public JAXBElement<String> createSpecialPriceSummaryDispPerPaxPrice(String value) {
    return new JAXBElement<String>(_SpecialPriceSummaryDispPerPaxPrice_QNAME, String.class, SpecialPriceSummary.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PassportIssuedPlace", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENPassportIssuedPlace(String value) {
    return new JAXBElement<String>(_ProfileENPassportIssuedPlace_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "LastUpdateBy", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENLastUpdateBy(String value) {
    return new JAXBElement<String>(_ProfileENLastUpdateBy_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CardStatus", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENCardStatus(String value) {
    return new JAXBElement<String>(_ProfileENCardStatus_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Interests", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENInterests(String value) {
    return new JAXBElement<String>(_ProfileENInterests_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Url", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENUrl(String value) {
    return new JAXBElement<String>(_ProfileENUrl_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Gender", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENGender(String value) {
    return new JAXBElement<String>(_PassengersENGender_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MealPref", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENMealPref(String value) {
    return new JAXBElement<String>(_ProfileENMealPref_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "IDPath1", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENIDPath1(String value) {
    return new JAXBElement<String>(_ProfileENIDPath1_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ExistingUserName", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENExistingUserName(String value) {
    return new JAXBElement<String>(_ProfileENExistingUserName_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "IDPath2", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENIDPath2(String value) {
    return new JAXBElement<String>(_ProfileENIDPath2_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CompanyName", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENCompanyName(String value) {
    return new JAXBElement<String>(_ProfileENCompanyName_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ProfileTitle", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENProfileTitle(String value) {
    return new JAXBElement<String>(_ProfileENProfileTitle_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CountryCode", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENCountryCode(String value) {
    return new JAXBElement<String>(_ProfileENCountryCode_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MemberTier", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENMemberTier(String value) {
    return new JAXBElement<String>(_ProfileENMemberTier_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MailingAddress3", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENMailingAddress3(String value) {
    return new JAXBElement<String>(_ProfileENMailingAddress3_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PreferredLanguage", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENPreferredLanguage(String value) {
    return new JAXBElement<String>(_ProfileENPreferredLanguage_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DocNationality", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENDocNationality(String value) {
    return new JAXBElement<String>(_ProfileENDocNationality_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MailingAddress1", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENMailingAddress1(String value) {
    return new JAXBElement<String>(_ProfileENMailingAddress1_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MailingAddress2", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENMailingAddress2(String value) {
    return new JAXBElement<String>(_ProfileENMailingAddress2_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DefaultCurrency", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENDefaultCurrency(String value) {
    return new JAXBElement<String>(_ProfileENDefaultCurrency_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FirstName", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENFirstName(String value) {
    return new JAXBElement<String>(_PassengersENFirstName_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MobileNo", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENMobileNo(String value) {
    return new JAXBElement<String>(_PassengersENMobileNo_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SurName", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENSurName(String value) {
    return new JAXBElement<String>(_PassengersENSurName_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Nationality", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENNationality(String value) {
    return new JAXBElement<String>(_PassengersENNationality_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SecondaryEmailID", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENSecondaryEmailID(String value) {
    return new JAXBElement<String>(_ProfileENSecondaryEmailID_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DocumentType", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENDocumentType(String value) {
    return new JAXBElement<String>(_ProfileENDocumentType_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FFTypeCode", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENFFTypeCode(String value) {
    return new JAXBElement<String>(_PassengersENFFTypeCode_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Title", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENTitle(String value) {
    return new JAXBElement<String>(_PassengersENTitle_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SeatingPref", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENSeatingPref(String value) {
    return new JAXBElement<String>(_ProfileENSeatingPref_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "City", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENCity(String value) {
    return new JAXBElement<String>(_PassengerDetailsENCity_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PassportCountryCode", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENPassportCountryCode(String value) {
    return new JAXBElement<String>(_PassengersENPassportCountryCode_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PreferredAddress", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENPreferredAddress(String value) {
    return new JAXBElement<String>(_PassengerDetailsENPreferredAddress_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FreqFlyerNum", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENFreqFlyerNum(String value) {
    return new JAXBElement<String>(_ProfileENFreqFlyerNum_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "HomePhone", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENHomePhone(String value) {
    return new JAXBElement<String>(_ProfileENHomePhone_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "IDCardNumber", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENIDCardNumber(String value) {
    return new JAXBElement<String>(_ProfileENIDCardNumber_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PassportNo", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENPassportNo(String value) {
    return new JAXBElement<String>(_PassengersENPassportNo_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "State", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENState(String value) {
    return new JAXBElement<String>(_PassengerDetailsENState_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "IDCardCountry", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENIDCardCountry(String value) {
    return new JAXBElement<String>(_ProfileENIDCardCountry_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Fax", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENFax(String value) {
    return new JAXBElement<String>(_PassengerDetailsENFax_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MemberStatus", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENMemberStatus(String value) {
    return new JAXBElement<String>(_ProfileENMemberStatus_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "NextExpireMiles", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENNextExpireMiles(String value) {
    return new JAXBElement<String>(_ProfileENNextExpireMiles_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PostCode", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENPostCode(String value) {
    return new JAXBElement<String>(_ProfileENPostCode_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PassportCountry", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENPassportCountry(String value) {
    return new JAXBElement<String>(_PassengersENPassportCountry_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EmailVerificationCode", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENEmailVerificationCode(String value) {
    return new JAXBElement<String>(_ProfileENEmailVerificationCode_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Country", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENCountry(String value) {
    return new JAXBElement<String>(_ProfileENCountry_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SeatPreference", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENSeatPreference(String value) {
    return new JAXBElement<String>(_ProfileENSeatPreference_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BusinessPhone", scope = ProfileEN.class)
  public JAXBElement<String> createProfileENBusinessPhone(String value) {
    return new JAXBElement<String>(_ProfileENBusinessPhone_QNAME, String.class, ProfileEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Route", scope = FreeBaggageAllowanceEN.class)
  public JAXBElement<String> createFreeBaggageAllowanceENRoute(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceENRoute_QNAME, String.class, FreeBaggageAllowanceEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Allowance", scope = FreeBaggageAllowanceEN.class)
  public JAXBElement<String> createFreeBaggageAllowanceENAllowance(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceENAllowance_QNAME, String.class, FreeBaggageAllowanceEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrCode", scope = FreeBaggageAllowanceEN.class)
  public JAXBElement<String> createFreeBaggageAllowanceENArrCode(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceENArrCode_QNAME, String.class, FreeBaggageAllowanceEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PaxType", scope = FreeBaggageAllowanceEN.class)
  public JAXBElement<String> createFreeBaggageAllowanceENPaxType(String value) {
    return new JAXBElement<String>(_PaxTypeChargePaxType_QNAME, String.class, FreeBaggageAllowanceEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AllowanceValue", scope = FreeBaggageAllowanceEN.class)
  public JAXBElement<String> createFreeBaggageAllowanceENAllowanceValue(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceENAllowanceValue_QNAME, String.class, FreeBaggageAllowanceEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepCode", scope = FreeBaggageAllowanceEN.class)
  public JAXBElement<String> createFreeBaggageAllowanceENDepCode(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceENDepCode_QNAME, String.class, FreeBaggageAllowanceEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepDate", scope = FreeBaggageAllowanceEN.class)
  public JAXBElement<String> createFreeBaggageAllowanceENDepDate(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceENDepDate_QNAME, String.class, FreeBaggageAllowanceEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Airline", scope = FreeBaggageAllowanceEN.class)
  public JAXBElement<String> createFreeBaggageAllowanceENAirline(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceENAirline_QNAME, String.class, FreeBaggageAllowanceEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "RetDate", scope = FreeBaggageAllowanceEN.class)
  public JAXBElement<String> createFreeBaggageAllowanceENRetDate(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceENRetDate_QNAME, String.class, FreeBaggageAllowanceEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ClassCode", scope = FreeBaggageAllowanceEN.class)
  public JAXBElement<String> createFreeBaggageAllowanceENClassCode(String value) {
    return new JAXBElement<String>(_FlightsClassCode_QNAME, String.class, FreeBaggageAllowanceEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Platform", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENPlatform(String value) {
    return new JAXBElement<String>(_ReservationsENPlatform_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PromoCount", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENPromoCount(String value) {
    return new JAXBElement<String>(_ReservationsENPromoCount_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "B2BUser", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENB2BUser(String value) {
    return new JAXBElement<String>(_ReservationsENB2BUser_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PNRNumber", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENPNRNumber(String value) {
    return new JAXBElement<String>(_ReservationsENPNRNumber_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PassengerName", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENPassengerName(String value) {
    return new JAXBElement<String>(_ReservationsENPassengerName_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SellingCurrency", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENSellingCurrency(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENSellingCurrency_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PromoID", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENPromoID(String value) {
    return new JAXBElement<String>(_ReservationsENPromoID_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "UniqueID", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENUniqueID(String value) {
    return new JAXBElement<String>(_PaxLoginsENUniqueID_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Email", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENEmail(String value) {
    return new JAXBElement<String>(_PassengersENEmail_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PromoAmount", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENPromoAmount(String value) {
    return new JAXBElement<String>(_ReservationsENPromoAmount_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ParentReservationID", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENParentReservationID(String value) {
    return new JAXBElement<String>(_ReservationsENParentReservationID_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PaymentCurrency", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENPaymentCurrency(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENPaymentCurrency_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "AirlineOBPNR", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENAirlineOBPNR(String value) {
    return new JAXBElement<String>(_ReservationsENAirlineOBPNR_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightHostPNR", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENFlightHostPNR(String value) {
    return new JAXBElement<String>(_ReservationsENFlightHostPNR_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Remarks", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENRemarks(String value) {
    return new JAXBElement<String>(_ReservationsENRemarks_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Version", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENVersion(String value) {
    return new JAXBElement<String>(_ReservationsENVersion_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BookingEmail", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENBookingEmail(String value) {
    return new JAXBElement<String>(_ReservationsENBookingEmail_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CurrencyCode", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENCurrencyCode(String value) {
    return new JAXBElement<String>(_InsuranceReservationENCurrencyCode_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "HotelSupplier", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENHotelSupplier(String value) {
    return new JAXBElement<String>(_ReservationsENHotelSupplier_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CancellationDeadline", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENCancellationDeadline(String value) {
    return new JAXBElement<String>(_ReservationsENCancellationDeadline_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SearchLanguageCode", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENSearchLanguageCode(String value) {
    return new JAXBElement<String>(_ReservationsENSearchLanguageCode_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationFrom", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENReservationFrom(String value) {
    return new JAXBElement<String>(_ReservationsENReservationFrom_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PaymentStatus", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENPaymentStatus(String value) {
    return new JAXBElement<String>(_ReservationsENPaymentStatus_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "AccountCode", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENAccountCode(String value) {
    return new JAXBElement<String>(_ReservationsENAccountCode_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PukalNo", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENPukalNo(String value) {
    return new JAXBElement<String>(_ReservationsENPukalNo_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "InternalReferenceNo", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENInternalReferenceNo(String value) {
    return new JAXBElement<String>(_ReservationsENInternalReferenceNo_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "HotelName", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENHotelName(String value) {
    return new JAXBElement<String>(_ReservationsENHotelName_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ConnectionType", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENConnectionType(String value) {
    return new JAXBElement<String>(_ReservationsENConnectionType_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "HoldBookingRefId", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENHoldBookingRefId(String value) {
    return new JAXBElement<String>(_ReservationsENHoldBookingRefId_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PaymentRefId", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENPaymentRefId(String value) {
    return new JAXBElement<String>(_ReservationsENPaymentRefId_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PromoName", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENPromoName(String value) {
    return new JAXBElement<String>(_ReservationsENPromoName_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DeviceModel", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENDeviceModel(String value) {
    return new JAXBElement<String>(_ReservationsENDeviceModel_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SourceCurrency", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENSourceCurrency(String value) {
    return new JAXBElement<String>(_ReservationsENSourceCurrency_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Modifiedby", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENModifiedby(String value) {
    return new JAXBElement<String>(_ReservationsENModifiedby_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrCity", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENArrCity(String value) {
    return new JAXBElement<String>(_LoungeReservationENArrCity_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrivalCities", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENArrivalCities(String value) {
    return new JAXBElement<String>(_ReservationsENArrivalCities_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Acquirer_Bank", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENAcquirerBank(String value) {
    return new JAXBElement<String>(_ReservationsENAcquirerBank_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "B2BCompany", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENB2BCompany(String value) {
    return new JAXBElement<String>(_ReservationsENB2BCompany_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DepCity", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENDepCity(String value) {
    return new JAXBElement<String>(_LoungeReservationENDepCity_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "AirlineIBPNR", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENAirlineIBPNR(String value) {
    return new JAXBElement<String>(_ReservationsENAirlineIBPNR_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CancelledDateTime", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENCancelledDateTime(String value) {
    return new JAXBElement<String>(_ReservationsENCancelledDateTime_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CancellationDateTo", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENCancellationDateTo(String value) {
    return new JAXBElement<String>(_ReservationsENCancellationDateTo_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CheckOutDate", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENCheckOutDate(String value) {
    return new JAXBElement<String>(_ReservationsENCheckOutDate_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MailName", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENMailName(String value) {
    return new JAXBElement<String>(_ReservationsENMailName_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PurchaseOrderId", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENPurchaseOrderId(String value) {
    return new JAXBElement<String>(_ReservationsENPurchaseOrderId_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CheckInDate", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENCheckInDate(String value) {
    return new JAXBElement<String>(_ReservationsENCheckInDate_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Telephone", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENTelephone(String value) {
    return new JAXBElement<String>(_PassengerDetailsENTelephone_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SaveErrorCode", scope = ReservationsEN.class)
  public JAXBElement<ArrayOfint> createReservationsENSaveErrorCode(ArrayOfint value) {
    return new JAXBElement<ArrayOfint>(_ReservationsENSaveErrorCode_QNAME, ArrayOfint.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ProfileEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Profile", scope = ReservationsEN.class)
  public JAXBElement<ProfileEN> createReservationsENProfile(ProfileEN value) {
    return new JAXBElement<ProfileEN>(_PaxLoginsENProfile_QNAME, ProfileEN.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PaymentMethodName", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENPaymentMethodName(String value) {
    return new JAXBElement<String>(_ReservationsENPaymentMethodName_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "TargetCurrency", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENTargetCurrency(String value) {
    return new JAXBElement<String>(_ReservationsENTargetCurrency_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "VATReceiptOption", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENVATReceiptOption(String value) {
    return new JAXBElement<String>(_ReservationsENVATReceiptOption_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "StationCode", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENStationCode(String value) {
    return new JAXBElement<String>(_ReservationsENStationCode_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ExCurrProvider", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENExCurrProvider(String value) {
    return new JAXBElement<String>(_ReservationsENExCurrProvider_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SupplierBookingID2", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENSupplierBookingID2(String value) {
    return new JAXBElement<String>(_ReservationsENSupplierBookingID2_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SupplierBookingID1", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENSupplierBookingID1(String value) {
    return new JAXBElement<String>(_ReservationsENSupplierBookingID1_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "AppVersion", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENAppVersion(String value) {
    return new JAXBElement<String>(_ReservationsENAppVersion_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Card_No_Partial", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENCardNoPartial(String value) {
    return new JAXBElement<String>(_ReservationsENCardNoPartial_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DiscountCurrency", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENDiscountCurrency(String value) {
    return new JAXBElement<String>(_ReservationsENDiscountCurrency_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BCCBookingEmail", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENBCCBookingEmail(String value) {
    return new JAXBElement<String>(_ReservationsENBCCBookingEmail_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Notes", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENNotes(String value) {
    return new JAXBElement<String>(_ReservationsENNotes_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "WarrentSerialNo", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENWarrentSerialNo(String value) {
    return new JAXBElement<String>(_ReservationsENWarrentSerialNo_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResJourneyType", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENResJourneyType(String value) {
    return new JAXBElement<String>(_ReservationsENResJourneyType_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FirstName", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENFirstName(String value) {
    return new JAXBElement<String>(_PassengersENFirstName_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CancellationDateFrom", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENCancellationDateFrom(String value) {
    return new JAXBElement<String>(_ReservationsENCancellationDateFrom_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "UserName", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENUserName(String value) {
    return new JAXBElement<String>(_APICancelBookingRequestUserName_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SurName", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENSurName(String value) {
    return new JAXBElement<String>(_PassengersENSurName_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BookingClass", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENBookingClass(String value) {
    return new JAXBElement<String>(_MarkupFlightENBookingClass_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Title", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENTitle(String value) {
    return new JAXBElement<String>(_PassengersENTitle_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationID", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENReservationID(String value) {
    return new JAXBElement<String>(_FareRulesENReservationID_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationTo", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENReservationTo(String value) {
    return new JAXBElement<String>(_ReservationsENReservationTo_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "RoundingText", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENRoundingText(String value) {
    return new JAXBElement<String>(_ReservationsENRoundingText_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ATMPaymentCode", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENATMPaymentCode(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENATMPaymentCode_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationType", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENReservationType(String value) {
    return new JAXBElement<String>(_ReservationsENReservationType_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CabinClass", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENCabinClass(String value) {
    return new JAXBElement<String>(_CabinClass_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MasterReservationID", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENMasterReservationID(String value) {
    return new JAXBElement<String>(_ReservationsENMasterReservationID_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "McoNo", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENMcoNo(String value) {
    return new JAXBElement<String>(_ReservationsENMcoNo_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Validity", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENValidity(String value) {
    return new JAXBElement<String>(_ReservationsENValidity_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "IPAddress", scope = ReservationsEN.class)
  public JAXBElement<String> createReservationsENIPAddress(String value) {
    return new JAXBElement<String>(_ReservationsENIPAddress_QNAME, String.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = ReservationsEN.class)
  public JAXBElement<Result> createReservationsENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, ReservationsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationId", scope = ReservationPromoCodesEN.class)
  public JAXBElement<String> createReservationPromoCodesENReservationId(String value) {
    return new JAXBElement<String>(_ReservationPromoCodesENReservationId_QNAME, String.class, ReservationPromoCodesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DealManagerPromoCode", scope = ReservationPromoCodesEN.class)
  public JAXBElement<String> createReservationPromoCodesENDealManagerPromoCode(String value) {
    return new JAXBElement<String>(_ReservationPromoCodesENDealManagerPromoCode_QNAME, String.class, ReservationPromoCodesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SpecialPaxPromoCode", scope = ReservationPromoCodesEN.class)
  public JAXBElement<String> createReservationPromoCodesENSpecialPaxPromoCode(String value) {
    return new JAXBElement<String>(_ReservationPromoCodesENSpecialPaxPromoCode_QNAME, String.class, ReservationPromoCodesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ServicePromoCode", scope = ReservationPromoCodesEN.class)
  public JAXBElement<String> createReservationPromoCodesENServicePromoCode(String value) {
    return new JAXBElement<String>(_ReservationPromoCodesENServicePromoCode_QNAME, String.class, ReservationPromoCodesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = ReservationPromoCodesEN.class)
  public JAXBElement<Result> createReservationPromoCodesENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, ReservationPromoCodesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BaggageCommercialName", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENBaggageCommercialName(String value) {
    return new JAXBElement<String>(_BaggageReservationENBaggageCommercialName_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FirstName", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENFirstName(String value) {
    return new JAXBElement<String>(_PassengersENFirstName_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MobileNo", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENMobileNo(String value) {
    return new JAXBElement<String>(_PassengersENMobileNo_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ServiceRequestInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ServiceRequestInformation", scope = BaggageReservationEN.class)
  public JAXBElement<ServiceRequestInfo> createBaggageReservationENServiceRequestInformation(ServiceRequestInfo value) {
    return new JAXBElement<ServiceRequestInfo>(_InsuranceReservationENServiceRequestInformation_QNAME, ServiceRequestInfo.class,
        BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrCity", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENArrCity(String value) {
    return new JAXBElement<String>(_LoungeReservationENArrCity_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "GroupCode", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENGroupCode(String value) {
    return new JAXBElement<String>(_LoungeReservationENGroupCode_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Title", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENTitle(String value) {
    return new JAXBElement<String>(_PassengersENTitle_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EMDNumber", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENEMDNumber(String value) {
    return new JAXBElement<String>(_InsuranceReservationENEMDNumber_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SSRCode", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENSSRCode(String value) {
    return new JAXBElement<String>(_LoungeReservationENSSRCode_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Taxes", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENTaxes(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENTaxes_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationID", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENReservationID(String value) {
    return new JAXBElement<String>(_FareRulesENReservationID_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightCode", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENFlightCode(String value) {
    return new JAXBElement<String>(_BaggageReservationENFlightCode_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BaggageCode", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENBaggageCode(String value) {
    return new JAXBElement<String>(_BaggageReservationENBaggageCode_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CurrencyCode", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENCurrencyCode(String value) {
    return new JAXBElement<String>(_InsuranceReservationENCurrencyCode_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DepCity", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENDepCity(String value) {
    return new JAXBElement<String>(_LoungeReservationENDepCity_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EMDErrorMessage", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENEMDErrorMessage(String value) {
    return new JAXBElement<String>(_BaggageReservationENEMDErrorMessage_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PassengerType", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENPassengerType(String value) {
    return new JAXBElement<String>(_PassengersENPassengerType_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EMDBookingType", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENEMDBookingType(String value) {
    return new JAXBElement<String>(_LoungeReservationENEMDBookingType_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = BaggageReservationEN.class)
  public JAXBElement<Result> createBaggageReservationENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Class", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENClass(String value) {
    return new JAXBElement<String>(_BaggageReservationENClass_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "LastName", scope = BaggageReservationEN.class)
  public JAXBElement<String> createBaggageReservationENLastName(String value) {
    return new JAXBElement<String>(_LoungeReservationENLastName_QNAME, String.class, BaggageReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FareBasisCode", scope = PriceStrikeoutSettingsEN.class)
  public JAXBElement<String> createPriceStrikeoutSettingsENFareBasisCode(String value) {
    return new JAXBElement<String>(_SegmentFareInfoENFareBasisCode_QNAME, String.class, PriceStrikeoutSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "JourneyType", scope = PriceStrikeoutSettingsEN.class)
  public JAXBElement<String> createPriceStrikeoutSettingsENJourneyType(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENJourneyType_QNAME, String.class, PriceStrikeoutSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightNo", scope = PriceStrikeoutSettingsEN.class)
  public JAXBElement<String> createPriceStrikeoutSettingsENFlightNo(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENFlightNo_QNAME, String.class, PriceStrikeoutSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "RoutesRegion", scope = PriceStrikeoutSettingsEN.class)
  public JAXBElement<String> createPriceStrikeoutSettingsENRoutesRegion(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENRoutesRegion_QNAME, String.class, PriceStrikeoutSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ApplicableCurrency", scope = PriceStrikeoutSettingsEN.class)
  public JAXBElement<String> createPriceStrikeoutSettingsENApplicableCurrency(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENApplicableCurrency_QNAME, String.class, PriceStrikeoutSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BookingClass", scope = PriceStrikeoutSettingsEN.class)
  public JAXBElement<String> createPriceStrikeoutSettingsENBookingClass(String value) {
    return new JAXBElement<String>(_MarkupFlightENBookingClass_QNAME, String.class, PriceStrikeoutSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Routes", scope = PriceStrikeoutSettingsEN.class)
  public JAXBElement<String> createPriceStrikeoutSettingsENRoutes(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENRoutes_QNAME, String.class, PriceStrikeoutSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ApplyToAmount", scope = PriceStrikeoutSettingsEN.class)
  public JAXBElement<String> createPriceStrikeoutSettingsENApplyToAmount(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENApplyToAmount_QNAME, String.class, PriceStrikeoutSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BookingChannel", scope = PriceStrikeoutSettingsEN.class)
  public JAXBElement<String> createPriceStrikeoutSettingsENBookingChannel(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENBookingChannel_QNAME, String.class, PriceStrikeoutSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "AirlineCode", scope = PriceStrikeoutSettingsEN.class)
  public JAXBElement<String> createPriceStrikeoutSettingsENAirlineCode(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENAirlineCode_QNAME, String.class, PriceStrikeoutSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CurrencyCode", scope = PriceStrikeoutSettingsEN.class)
  public JAXBElement<String> createPriceStrikeoutSettingsENCurrencyCode(String value) {
    return new JAXBElement<String>(_InsuranceReservationENCurrencyCode_QNAME, String.class, PriceStrikeoutSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ExcludeRoutes", scope = PriceStrikeoutSettingsEN.class)
  public JAXBElement<String> createPriceStrikeoutSettingsENExcludeRoutes(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENExcludeRoutes_QNAME, String.class, PriceStrikeoutSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DepartureDays", scope = PriceStrikeoutSettingsEN.class)
  public JAXBElement<String> createPriceStrikeoutSettingsENDepartureDays(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENDepartureDays_QNAME, String.class, PriceStrikeoutSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PromotionName", scope = PriceStrikeoutSettingsEN.class)
  public JAXBElement<String> createPriceStrikeoutSettingsENPromotionName(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENPromotionName_QNAME, String.class, PriceStrikeoutSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = PriceStrikeoutSettingsEN.class)
  public JAXBElement<Result> createPriceStrikeoutSettingsENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, PriceStrikeoutSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReturnDays", scope = PriceStrikeoutSettingsEN.class)
  public JAXBElement<String> createPriceStrikeoutSettingsENReturnDays(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENReturnDays_QNAME, String.class, PriceStrikeoutSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "TrackingNumber", scope = FlightReservationEticketEN.class)
  public JAXBElement<String> createFlightReservationEticketENTrackingNumber(String value) {
    return new JAXBElement<String>(_FlightReservationEticketENTrackingNumber_QNAME, String.class, FlightReservationEticketEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FirstName", scope = FlightReservationEticketEN.class)
  public JAXBElement<String> createFlightReservationEticketENFirstName(String value) {
    return new JAXBElement<String>(_PassengersENFirstName_QNAME, String.class, FlightReservationEticketEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = FlightReservationEticketEN.class)
  public JAXBElement<Result> createFlightReservationEticketENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, FlightReservationEticketEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "TicketNo", scope = FlightReservationEticketEN.class)
  public JAXBElement<String> createFlightReservationEticketENTicketNo(String value) {
    return new JAXBElement<String>(_FlightReservationEticketENTicketNo_QNAME, String.class, FlightReservationEticketEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PaxName", scope = FlightReservationEticketEN.class)
  public JAXBElement<String> createFlightReservationEticketENPaxName(String value) {
    return new JAXBElement<String>(_FlightReservationEticketENPaxName_QNAME, String.class, FlightReservationEticketEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPILoungeInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "LoungeInfo", scope = APILoungeSegment.class)
  public JAXBElement<ArrayOfAPILoungeInfo> createAPILoungeSegmentLoungeInfo(ArrayOfAPILoungeInfo value) {
    return new JAXBElement<ArrayOfAPILoungeInfo>(_APILoungeSegmentLoungeInfo_QNAME, ArrayOfAPILoungeInfo.class, APILoungeSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrAirCode", scope = APILoungeSegment.class)
  public JAXBElement<String> createAPILoungeSegmentArrAirCode(String value) {
    return new JAXBElement<String>(_APIMealSegmentArrAirCode_QNAME, String.class, APILoungeSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepAirCode", scope = APILoungeSegment.class)
  public JAXBElement<String> createAPILoungeSegmentDepAirCode(String value) {
    return new JAXBElement<String>(_APIMealSegmentDepAirCode_QNAME, String.class, APILoungeSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "IATACode", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENIATACode(String value) {
    return new JAXBElement<String>(_FlightReservationENIATACode_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "IncCode", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENIncCode(String value) {
    return new JAXBElement<String>(_FlightReservationENIncCode_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DepCityCode", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENDepCityCode(String value) {
    return new JAXBElement<String>(_FlightReservationENDepCityCode_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FareType", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENFareType(String value) {
    return new JAXBElement<String>(_MarkupFlightENFareType_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ErrorDescription", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENErrorDescription(String value) {
    return new JAXBElement<String>(_FlightReservationENErrorDescription_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DiscCode", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENDiscCode(String value) {
    return new JAXBElement<String>(_FlightReservationENDiscCode_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SabreAgentCode", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENSabreAgentCode(String value) {
    return new JAXBElement<String>(_FlightReservationENSabreAgentCode_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrCityCode", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENArrCityCode(String value) {
    return new JAXBElement<String>(_FlightReservationENArrCityCode_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FareBasis", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENFareBasis(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENFareBasis_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MarkupApplied", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENMarkupApplied(String value) {
    return new JAXBElement<String>(_FlightReservationENMarkupApplied_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "AirlineLoc", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENAirlineLoc(String value) {
    return new JAXBElement<String>(_FlightReservationENAirlineLoc_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "OfficeID", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENOfficeID(String value) {
    return new JAXBElement<String>(_FlightReservationENOfficeID_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "StationCode", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENStationCode(String value) {
    return new JAXBElement<String>(_ReservationsENStationCode_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationID", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENReservationID(String value) {
    return new JAXBElement<String>(_FareRulesENReservationID_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SourceSite", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENSourceSite(String value) {
    return new JAXBElement<String>(_FlightReservationENSourceSite_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "IPAddress", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENIPAddress(String value) {
    return new JAXBElement<String>(_ReservationsENIPAddress_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "IPCountry", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENIPCountry(String value) {
    return new JAXBElement<String>(_FlightReservationENIPCountry_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Notes", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENNotes(String value) {
    return new JAXBElement<String>(_ReservationsENNotes_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EticketNo", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENEticketNo(String value) {
    return new JAXBElement<String>(_FlightReservationENEticketNo_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PNRNo", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENPNRNo(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENPNRNo_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = FlightReservationEN.class)
  public JAXBElement<Result> createFlightReservationENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ServiceUrl", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENServiceUrl(String value) {
    return new JAXBElement<String>(_FlightReservationENServiceUrl_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BaseCurrency", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENBaseCurrency(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENBaseCurrency_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "InternalReferenceNo", scope = FlightReservationEN.class)
  public JAXBElement<String> createFlightReservationENInternalReferenceNo(String value) {
    return new JAXBElement<String>(_ReservationsENInternalReferenceNo_QNAME, String.class, FlightReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPILoungeSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AvailableLounge", scope = APILoungeAvailability.class)
  public JAXBElement<ArrayOfAPILoungeSegment> createAPILoungeAvailabilityAvailableLounge(ArrayOfAPILoungeSegment value) {
    return new JAXBElement<ArrayOfAPILoungeSegment>(_APILoungeAvailabilityAvailableLounge_QNAME, ArrayOfAPILoungeSegment.class,
        APILoungeAvailability.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaggageReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "baggageReservations", scope = ReservationDetails.class)
  public JAXBElement<ArrayOfBaggageReservationEN> createReservationDetailsBaggageReservations(ArrayOfBaggageReservationEN value) {
    return new JAXBElement<ArrayOfBaggageReservationEN>(_ReservationDetailsBaggageReservations_QNAME, ArrayOfBaggageReservationEN.class,
        ReservationDetails.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ErrorDetails", scope = ReservationDetails.class)
  public JAXBElement<String> createReservationDetailsErrorDetails(String value) {
    return new JAXBElement<String>(_MultiFlightSearchReponseErrorDetails_QNAME, String.class, ReservationDetails.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PassengerDetailsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "passengerDetails", scope = ReservationDetails.class)
  public JAXBElement<PassengerDetailsEN> createReservationDetailsPassengerDetails(PassengerDetailsEN value) {
    return new JAXBElement<PassengerDetailsEN>(_ReservationDetailsPassengerDetails_QNAME, PassengerDetailsEN.class, ReservationDetails.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ReservationsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ReservationInfo", scope = ReservationDetails.class)
  public JAXBElement<ReservationsEN> createReservationDetailsReservationInfo(ReservationsEN value) {
    return new JAXBElement<ReservationsEN>(_ReservationDetailsReservationInfo_QNAME, ReservationsEN.class, ReservationDetails.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInsuranceReservationInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "InsuranceReservationInfo", scope = ReservationDetails.class)
  public JAXBElement<ArrayOfInsuranceReservationInfo> createReservationDetailsInsuranceReservationInfo(ArrayOfInsuranceReservationInfo value) {
    return new JAXBElement<ArrayOfInsuranceReservationInfo>(_ReservationDetailsInsuranceReservationInfo_QNAME, ArrayOfInsuranceReservationInfo.class,
        ReservationDetails.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPassengersEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "passengers", scope = ReservationDetails.class)
  public JAXBElement<ArrayOfPassengersEN> createReservationDetailsPassengers(ArrayOfPassengersEN value) {
    return new JAXBElement<ArrayOfPassengersEN>(_ReservationDetailsPassengers_QNAME, ArrayOfPassengersEN.class, ReservationDetails.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeatReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "seatReservations", scope = ReservationDetails.class)
  public JAXBElement<ArrayOfSeatReservationEN> createReservationDetailsSeatReservations(ArrayOfSeatReservationEN value) {
    return new JAXBElement<ArrayOfSeatReservationEN>(_ReservationDetailsSeatReservations_QNAME, ArrayOfSeatReservationEN.class,
        ReservationDetails.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLoungeReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "loungeReservations", scope = ReservationDetails.class)
  public JAXBElement<ArrayOfLoungeReservationEN> createReservationDetailsLoungeReservations(ArrayOfLoungeReservationEN value) {
    return new JAXBElement<ArrayOfLoungeReservationEN>(_ReservationDetailsLoungeReservations_QNAME, ArrayOfLoungeReservationEN.class,
        ReservationDetails.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAirlineMealSelectionEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "mealReservations", scope = ReservationDetails.class)
  public JAXBElement<ArrayOfAirlineMealSelectionEN> createReservationDetailsMealReservations(ArrayOfAirlineMealSelectionEN value) {
    return new JAXBElement<ArrayOfAirlineMealSelectionEN>(_ReservationDetailsMealReservations_QNAME, ArrayOfAirlineMealSelectionEN.class,
        ReservationDetails.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightReservationInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FlightInfo", scope = ReservationDetails.class)
  public JAXBElement<FlightReservationInfo> createReservationDetailsFlightInfo(FlightReservationInfo value) {
    return new JAXBElement<FlightReservationInfo>(_ReservationDetailsFlightInfo_QNAME, FlightReservationInfo.class, ReservationDetails.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Taxes", scope = SMSPriceEN.class)
  public JAXBElement<String> createSMSPriceENTaxes(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENTaxes_QNAME, String.class, SMSPriceEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "dispCost", scope = SMSPriceEN.class)
  public JAXBElement<String> createSMSPriceENDispCost(String value) {
    return new JAXBElement<String>(_SMSPriceENDispCost_QNAME, String.class, SMSPriceEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Currency", scope = SMSPriceEN.class)
  public JAXBElement<String> createSMSPriceENCurrency(String value) {
    return new JAXBElement<String>(_LoungeReservationENCurrency_QNAME, String.class, SMSPriceEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SettingsCurrency", scope = SMSPriceEN.class)
  public JAXBElement<String> createSMSPriceENSettingsCurrency(String value) {
    return new JAXBElement<String>(_SMSPriceENSettingsCurrency_QNAME, String.class, SMSPriceEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ApplicableToCountry", scope = SMSPriceEN.class)
  public JAXBElement<String> createSMSPriceENApplicableToCountry(String value) {
    return new JAXBElement<String>(_SMSPriceENApplicableToCountry_QNAME, String.class, SMSPriceEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CMFareBasis", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentCMFareBasis(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentCMFareBasis_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FlightNo", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentFlightNo(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentFlightNo_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrTime", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentArrTime(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentArrTime_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "TransTime", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentTransTime(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentTransTime_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrAirPortCountry", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentArrAirPortCountry(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentArrAirPortCountry_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispSegFBCode", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentDispSegFBCode(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentDispSegFBCode_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CabinClassCode", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentCabinClassCode(String value) {
    return new JAXBElement<String>(_BaggagesCabinClassCode_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispDepDate", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentDispDepDate(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentDispDepDate_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AdultFreeBaggageForDisplay", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentAdultFreeBaggageForDisplay(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentAdultFreeBaggageForDisplay_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "TravelTime", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentTravelTime(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentTravelTime_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepAirPort", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentDepAirPort(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentDepAirPort_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Via", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentVia(String value) {
    return new JAXBElement<String>(_IntermediatePointVia_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FlightSegmentRef", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentFlightSegmentRef(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentFlightSegmentRef_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrDate", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentArrDate(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentArrDate_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "BookingClass", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentBookingClass(String value) {
    return new JAXBElement<String>(_FlightSearchCriteriaBookingClass_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepCityName", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentDepCityName(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentDepCityName_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SegFBCode", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentSegFBCode(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentSegFBCode_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ProviderID", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentProviderID(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentProviderID_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FBCode", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentFBCode(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentFBCode_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "OprAirlineName", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentOprAirlineName(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentOprAirlineName_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepDate", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentDepDate(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceENDepDate_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CabinClass", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentCabinClass(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentCabinClass_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepAirPortCountry", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentDepAirPortCountry(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentDepAirPortCountry_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepTime", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentDepTime(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentDepTime_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "JDurationHRS", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentJDurationHRS(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentJDurationHRS_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispArrDate", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentDispArrDate(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentDispArrDate_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrAirName", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentArrAirName(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentArrAirName_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "JDurationText", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentJDurationText(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentJDurationText_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link DisClosureAirline }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DisClosureAirline", scope = GDSFlightSegment.class)
  public JAXBElement<DisClosureAirline> createGDSFlightSegmentDisClosureAirline(DisClosureAirline value) {
    return new JAXBElement<DisClosureAirline>(_DisClosureAirline_QNAME, DisClosureAirline.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AvailSeats", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentAvailSeats(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentAvailSeats_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AirCraft", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentAirCraft(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentAirCraft_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ParentCabinClassCode", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentParentCabinClassCode(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentParentCabinClassCode_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "InfantFreeBaggageForDisplay", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentInfantFreeBaggageForDisplay(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentInfantFreeBaggageForDisplay_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "TDuration", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentTDuration(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentTDuration_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrAirPort", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentArrAirPort(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentArrAirPort_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ActualCabinClassCode", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentActualCabinClassCode(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentActualCabinClassCode_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "JDuration", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentJDuration(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentJDuration_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MarAirLine", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentMarAirLine(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentMarAirLine_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "OprAirline", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentOprAirline(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentOprAirline_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepAirName", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentDepAirName(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentDepAirName_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispCabinClass", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentDispCabinClass(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentDispCabinClass_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FreeBaggageForDisplay", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentFreeBaggageForDisplay(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentFreeBaggageForDisplay_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrCityName", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentArrCityName(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentArrCityName_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link IntermediatePoint }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "IntermediatePoints", scope = GDSFlightSegment.class)
  public JAXBElement<IntermediatePoint> createGDSFlightSegmentIntermediatePoints(IntermediatePoint value) {
    return new JAXBElement<IntermediatePoint>(_GDSFlightSegmentIntermediatePoints_QNAME, IntermediatePoint.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightTerminalInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrivalTerminalInfo", scope = GDSFlightSegment.class)
  public JAXBElement<FlightTerminalInfo> createGDSFlightSegmentArrivalTerminalInfo(FlightTerminalInfo value) {
    return new JAXBElement<FlightTerminalInfo>(_GDSFlightSegmentArrivalTerminalInfo_QNAME, FlightTerminalInfo.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MLFGCode", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentMLFGCode(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentMLFGCode_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispFBCode", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentDispFBCode(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentDispFBCode_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ChildFreeBaggageForDisplay", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentChildFreeBaggageForDisplay(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentChildFreeBaggageForDisplay_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MarAirLineName", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentMarAirLineName(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentMarAirLineName_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightTerminalInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepartureTerminalInfo", scope = GDSFlightSegment.class)
  public JAXBElement<FlightTerminalInfo> createGDSFlightSegmentDepartureTerminalInfo(FlightTerminalInfo value) {
    return new JAXBElement<FlightTerminalInfo>(_GDSFlightSegmentDepartureTerminalInfo_QNAME, FlightTerminalInfo.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "OtherPaxFreeBaggageForDisplay", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentOtherPaxFreeBaggageForDisplay(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentOtherPaxFreeBaggageForDisplay_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ClassCode", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentClassCode(String value) {
    return new JAXBElement<String>(_FlightsClassCode_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ActualCabinClass", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentActualCabinClass(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentActualCabinClass_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "JDurationMin", scope = GDSFlightSegment.class)
  public JAXBElement<String> createGDSFlightSegmentJDurationMin(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentJDurationMin_QNAME, String.class, GDSFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ControlText", scope = MobileAppLangTextEN.class)
  public JAXBElement<String> createMobileAppLangTextENControlText(String value) {
    return new JAXBElement<String>(_MobileAppLangTextENControlText_QNAME, String.class, MobileAppLangTextEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DepCity", scope = MobileAppLangTextEN.class)
  public JAXBElement<String> createMobileAppLangTextENDepCity(String value) {
    return new JAXBElement<String>(_LoungeReservationENDepCity_QNAME, String.class, MobileAppLangTextEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ControlName", scope = MobileAppLangTextEN.class)
  public JAXBElement<String> createMobileAppLangTextENControlName(String value) {
    return new JAXBElement<String>(_MobileAppLangTextENControlName_QNAME, String.class, MobileAppLangTextEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "LangCode", scope = MobileAppLangTextEN.class)
  public JAXBElement<String> createMobileAppLangTextENLangCode(String value) {
    return new JAXBElement<String>(_MobileAppLangTextENLangCode_QNAME, String.class, MobileAppLangTextEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = MobileAppLangTextEN.class)
  public JAXBElement<Result> createMobileAppLangTextENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, MobileAppLangTextEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PromotionCode", scope = PromotionCodesEN.class)
  public JAXBElement<String> createPromotionCodesENPromotionCode(String value) {
    return new JAXBElement<String>(_PromotionCodesENPromotionCode_QNAME, String.class, PromotionCodesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = PromotionCodesEN.class)
  public JAXBElement<Result> createPromotionCodesENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, PromotionCodesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PromotionSettingsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PromotionSettings", scope = PromotionInfo.class)
  public JAXBElement<PromotionSettingsEN> createPromotionInfoPromotionSettings(PromotionSettingsEN value) {
    return new JAXBElement<PromotionSettingsEN>(_PromotionInfoPromotionSettings_QNAME, PromotionSettingsEN.class, PromotionInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MealCode", scope = APISelectedMeals.class)
  public JAXBElement<String> createAPISelectedMealsMealCode(String value) {
    return new JAXBElement<String>(_APISelectedMealsMealCode_QNAME, String.class, APISelectedMeals.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ErrorMessage", scope = TicketingResponse.class)
  public JAXBElement<String> createTicketingResponseErrorMessage(String value) {
    return new JAXBElement<String>(_TicketingResponseErrorMessage_QNAME, String.class, TicketingResponse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ResultMsg", scope = TicketingResponse.class)
  public JAXBElement<Result> createTicketingResponseResultMsg(Result value) {
    return new JAXBElement<Result>(_FlightsResultMsg_QNAME, Result.class, TicketingResponse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ReservationDetails }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ResultReservationDetails", scope = TicketingResponse.class)
  public JAXBElement<ReservationDetails> createTicketingResponseResultReservationDetails(ReservationDetails value) {
    return new JAXBElement<ReservationDetails>(_TicketingResponseResultReservationDetails_QNAME, ReservationDetails.class, TicketingResponse.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FareGroupDesc", scope = FareGroupAirlineFlight.class)
  public JAXBElement<String> createFareGroupAirlineFlightFareGroupDesc(String value) {
    return new JAXBElement<String>(_FareGroupAirlineFlightFareGroupDesc_QNAME, String.class, FareGroupAirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FareGroup", scope = FareGroupAirlineFlight.class)
  public JAXBElement<String> createFareGroupAirlineFlightFareGroup(String value) {
    return new JAXBElement<String>(_FareGroupAirlineFlightFareGroup_QNAME, String.class, FareGroupAirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FareGroupCode", scope = FareGroupAirlineFlight.class)
  public JAXBElement<String> createFareGroupAirlineFlightFareGroupCode(String value) {
    return new JAXBElement<String>(_FareGroupAirlineFlightFareGroupCode_QNAME, String.class, FareGroupAirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link RouteFreeBaggageAllowance }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FreeBaggageAllowance", scope = FareGroupAirlineFlight.class)
  public JAXBElement<RouteFreeBaggageAllowance> createFareGroupAirlineFlightFreeBaggageAllowance(RouteFreeBaggageAllowance value) {
    return new JAXBElement<RouteFreeBaggageAllowance>(_FreeBaggageAllowance_QNAME, RouteFreeBaggageAllowance.class, FareGroupAirlineFlight.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispFareGroup", scope = FareGroupAirlineFlight.class)
  public JAXBElement<String> createFareGroupAirlineFlightDispFareGroup(String value) {
    return new JAXBElement<String>(_FareGroupAirlineFlightDispFareGroup_QNAME, String.class, FareGroupAirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ApplicableCardTypes", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENApplicableCardTypes(String value) {
    return new JAXBElement<String>(_PromotionSettingsENApplicableCardTypes_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightNo", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENFlightNo(String value) {
    return new JAXBElement<String>(_FlightReservationSegmentsENFlightNo_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PromotionCodePrefix", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENPromotionCodePrefix(String value) {
    return new JAXBElement<String>(_PromotionSettingsENPromotionCodePrefix_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PromotionValidationName", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENPromotionValidationName(String value) {
    return new JAXBElement<String>(_PromotionSettingsENPromotionValidationName_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ApplyToAmount", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENApplyToAmount(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENApplyToAmount_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "AirlineCode", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENAirlineCode(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENAirlineCode_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CurrencyCode", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENCurrencyCode(String value) {
    return new JAXBElement<String>(_InsuranceReservationENCurrencyCode_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PromotionName", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENPromotionName(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENPromotionName_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MDBookingClassAmount", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENMDBookingClassAmount(String value) {
    return new JAXBElement<String>(_PromotionSettingsENMDBookingClassAmount_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PromotionCodeList", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENPromotionCodeList(String value) {
    return new JAXBElement<String>(_PromotionSettingsENPromotionCodeList_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ApplicablePaymentMethods", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENApplicablePaymentMethods(String value) {
    return new JAXBElement<String>(_PromotionSettingsENApplicablePaymentMethods_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FareBasisCode", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENFareBasisCode(String value) {
    return new JAXBElement<String>(_SegmentFareInfoENFareBasisCode_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SabreCommercialCode", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENSabreCommercialCode(String value) {
    return new JAXBElement<String>(_PromotionSettingsENSabreCommercialCode_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "JourneyType", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENJourneyType(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENJourneyType_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "RoutesRegion", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENRoutesRegion(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENRoutesRegion_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ApplicableCurrency", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENApplicableCurrency(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENApplicableCurrency_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BuyandGetCategory", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENBuyandGetCategory(String value) {
    return new JAXBElement<String>(_PromotionSettingsENBuyandGetCategory_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BookingClass", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENBookingClass(String value) {
    return new JAXBElement<String>(_MarkupFlightENBookingClass_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Routes", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENRoutes(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENRoutes_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PromotionCategory", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENPromotionCategory(String value) {
    return new JAXBElement<String>(_PromotionSettingsENPromotionCategory_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PromotionValidityType", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENPromotionValidityType(String value) {
    return new JAXBElement<String>(_PromotionSettingsENPromotionValidityType_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BookingChannel", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENBookingChannel(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENBookingChannel_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ExcludeRoutes", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENExcludeRoutes(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENExcludeRoutes_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DepartureDays", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENDepartureDays(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENDepartureDays_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MinBookingAmtCurrency", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENMinBookingAmtCurrency(String value) {
    return new JAXBElement<String>(_PromotionSettingsENMinBookingAmtCurrency_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SabreCommercialName", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENSabreCommercialName(String value) {
    return new JAXBElement<String>(_PromotionSettingsENSabreCommercialName_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SabreRemarks", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENSabreRemarks(String value) {
    return new JAXBElement<String>(_PromotionSettingsENSabreRemarks_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReturnDays", scope = PromotionSettingsEN.class)
  public JAXBElement<String> createPromotionSettingsENReturnDays(String value) {
    return new JAXBElement<String>(_PriceStrikeoutSettingsENReturnDays_QNAME, String.class, PromotionSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MinPurchaseAmt", scope = InstallmentPaymentSettingsEN.class)
  public JAXBElement<String> createInstallmentPaymentSettingsENMinPurchaseAmt(String value) {
    return new JAXBElement<String>(_InstallmentPaymentSettingsENMinPurchaseAmt_QNAME, String.class, InstallmentPaymentSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DisplayText", scope = InstallmentPaymentSettingsEN.class)
  public JAXBElement<String> createInstallmentPaymentSettingsENDisplayText(String value) {
    return new JAXBElement<String>(_InstallmentPaymentSettingsENDisplayText_QNAME, String.class, InstallmentPaymentSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "InterestType", scope = InstallmentPaymentSettingsEN.class)
  public JAXBElement<String> createInstallmentPaymentSettingsENInterestType(String value) {
    return new JAXBElement<String>(_InstallmentPaymentSettingsENInterestType_QNAME, String.class, InstallmentPaymentSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = InstallmentPaymentSettingsEN.class)
  public JAXBElement<Result> createInstallmentPaymentSettingsENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, InstallmentPaymentSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISearchCriteriaParams }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SearchCriteriaParams", scope = APIMultiCitySearchCriteria.class)
  public JAXBElement<ArrayOfAPISearchCriteriaParams> createAPIMultiCitySearchCriteriaSearchCriteriaParams(ArrayOfAPISearchCriteriaParams value) {
    return new JAXBElement<ArrayOfAPISearchCriteriaParams>(_APIMultiCitySearchCriteriaSearchCriteriaParams_QNAME,
        ArrayOfAPISearchCriteriaParams.class, APIMultiCitySearchCriteria.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "TaxCurrency", scope = GSTReservationEN.class)
  public JAXBElement<String> createGSTReservationENTaxCurrency(String value) {
    return new JAXBElement<String>(_GSTReservationENTaxCurrency_QNAME, String.class, GSTReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CountryName", scope = GSTReservationEN.class)
  public JAXBElement<String> createGSTReservationENCountryName(String value) {
    return new JAXBElement<String>(_PassengerDetailsENCountryName_QNAME, String.class, GSTReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MobileNo", scope = GSTReservationEN.class)
  public JAXBElement<String> createGSTReservationENMobileNo(String value) {
    return new JAXBElement<String>(_PassengersENMobileNo_QNAME, String.class, GSTReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Email", scope = GSTReservationEN.class)
  public JAXBElement<String> createGSTReservationENEmail(String value) {
    return new JAXBElement<String>(_PassengersENEmail_QNAME, String.class, GSTReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "GSTID", scope = GSTReservationEN.class)
  public JAXBElement<String> createGSTReservationENGSTID(String value) {
    return new JAXBElement<String>(_GSTReservationENGSTID_QNAME, String.class, GSTReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BRNNumber", scope = GSTReservationEN.class)
  public JAXBElement<String> createGSTReservationENBRNNumber(String value) {
    return new JAXBElement<String>(_GSTReservationENBRNNumber_QNAME, String.class, GSTReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "GSTCountry", scope = GSTReservationEN.class)
  public JAXBElement<String> createGSTReservationENGSTCountry(String value) {
    return new JAXBElement<String>(_GSTReservationENGSTCountry_QNAME, String.class, GSTReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Address2", scope = GSTReservationEN.class)
  public JAXBElement<String> createGSTReservationENAddress2(String value) {
    return new JAXBElement<String>(_PassengerDetailsENAddress2_QNAME, String.class, GSTReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "InvoiceNo", scope = GSTReservationEN.class)
  public JAXBElement<String> createGSTReservationENInvoiceNo(String value) {
    return new JAXBElement<String>(_GSTReservationENInvoiceNo_QNAME, String.class, GSTReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Address1", scope = GSTReservationEN.class)
  public JAXBElement<String> createGSTReservationENAddress1(String value) {
    return new JAXBElement<String>(_PassengerDetailsENAddress1_QNAME, String.class, GSTReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "City", scope = GSTReservationEN.class)
  public JAXBElement<String> createGSTReservationENCity(String value) {
    return new JAXBElement<String>(_PassengerDetailsENCity_QNAME, String.class, GSTReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationID", scope = GSTReservationEN.class)
  public JAXBElement<String> createGSTReservationENReservationID(String value) {
    return new JAXBElement<String>(_FareRulesENReservationID_QNAME, String.class, GSTReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "State", scope = GSTReservationEN.class)
  public JAXBElement<String> createGSTReservationENState(String value) {
    return new JAXBElement<String>(_PassengerDetailsENState_QNAME, String.class, GSTReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CompanyName", scope = GSTReservationEN.class)
  public JAXBElement<String> createGSTReservationENCompanyName(String value) {
    return new JAXBElement<String>(_ProfileENCompanyName_QNAME, String.class, GSTReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BookingCurrency", scope = GSTReservationEN.class)
  public JAXBElement<String> createGSTReservationENBookingCurrency(String value) {
    return new JAXBElement<String>(_GSTReservationENBookingCurrency_QNAME, String.class, GSTReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PostCode", scope = GSTReservationEN.class)
  public JAXBElement<String> createGSTReservationENPostCode(String value) {
    return new JAXBElement<String>(_ProfileENPostCode_QNAME, String.class, GSTReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "District", scope = GSTReservationEN.class)
  public JAXBElement<String> createGSTReservationENDistrict(String value) {
    return new JAXBElement<String>(_GSTReservationENDistrict_QNAME, String.class, GSTReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = GSTReservationEN.class)
  public JAXBElement<Result> createGSTReservationENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, GSTReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPISeatInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Seats", scope = APISeatSegment.class)
  public JAXBElement<ArrayOfAPISeatInfo> createAPISeatSegmentSeats(ArrayOfAPISeatInfo value) {
    return new JAXBElement<ArrayOfAPISeatInfo>(_APIAddonAvailabilityResSeats_QNAME, ArrayOfAPISeatInfo.class, APISeatSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrAirCode", scope = APISeatSegment.class)
  public JAXBElement<String> createAPISeatSegmentArrAirCode(String value) {
    return new JAXBElement<String>(_APIMealSegmentArrAirCode_QNAME, String.class, APISeatSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepAirCode", scope = APISeatSegment.class)
  public JAXBElement<String> createAPISeatSegmentDepAirCode(String value) {
    return new JAXBElement<String>(_APIMealSegmentDepAirCode_QNAME, String.class, APISeatSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Password", scope = GetUpdatedBookingDetailsRequest.class)
  public JAXBElement<String> createGetUpdatedBookingDetailsRequestPassword(String value) {
    return new JAXBElement<String>(_GetUpdatedBookingDetailsRequestPassword_QNAME, String.class, GetUpdatedBookingDetailsRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PNR", scope = GetUpdatedBookingDetailsRequest.class)
  public JAXBElement<String> createGetUpdatedBookingDetailsRequestPNR(String value) {
    return new JAXBElement<String>(_GetUpdatedBookingDetailsRequestPNR_QNAME, String.class, GetUpdatedBookingDetailsRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "UserName", scope = GetUpdatedBookingDetailsRequest.class)
  public JAXBElement<String> createGetUpdatedBookingDetailsRequestUserName(String value) {
    return new JAXBElement<String>(_GetUpdatedBookingDetailsRequestUserName_QNAME, String.class, GetUpdatedBookingDetailsRequest.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PackageSummary }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "InsurancePackageSummary", scope = SGDInsurancePackageSummary.class)
  public JAXBElement<PackageSummary> createSGDInsurancePackageSummaryInsurancePackageSummary(PackageSummary value) {
    return new JAXBElement<PackageSummary>(_SGDInsurancePackageSummaryInsurancePackageSummary_QNAME, PackageSummary.class,
        SGDInsurancePackageSummary.class, value);
  }

  /**
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SegmentIndex", scope = APIBaggageSegment.class)
  public JAXBElement<ArrayOfint> createAPIBaggageSegmentSegmentIndex(ArrayOfint value) {
    return new JAXBElement<ArrayOfint>(_APISelectedBaggagesSegmentIndex_QNAME, ArrayOfint.class, APIBaggageSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrAirCode", scope = APIBaggageSegment.class)
  public JAXBElement<String> createAPIBaggageSegmentArrAirCode(String value) {
    return new JAXBElement<String>(_APIMealSegmentArrAirCode_QNAME, String.class, APIBaggageSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPIBaggageInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Baggages", scope = APIBaggageSegment.class)
  public JAXBElement<ArrayOfAPIBaggageInfo> createAPIBaggageSegmentBaggages(ArrayOfAPIBaggageInfo value) {
    return new JAXBElement<ArrayOfAPIBaggageInfo>(_Baggages_QNAME, ArrayOfAPIBaggageInfo.class, APIBaggageSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepAirCode", scope = APIBaggageSegment.class)
  public JAXBElement<String> createAPIBaggageSegmentDepAirCode(String value) {
    return new JAXBElement<String>(_APIMealSegmentDepAirCode_QNAME, String.class, APIBaggageSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FareGroup", scope = FareGroupFlight.class)
  public JAXBElement<String> createFareGroupFlightFareGroup(String value) {
    return new JAXBElement<String>(_FareGroupAirlineFlightFareGroup_QNAME, String.class, FareGroupFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FareGroupCode", scope = FareGroupFlight.class)
  public JAXBElement<String> createFareGroupFlightFareGroupCode(String value) {
    return new JAXBElement<String>(_FareGroupAirlineFlightFareGroupCode_QNAME, String.class, FareGroupFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Flights }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FGFlight", scope = FareGroupFlight.class)
  public JAXBElement<Flights> createFareGroupFlightFGFlight(Flights value) {
    return new JAXBElement<Flights>(_FareGroupFlightFGFlight_QNAME, Flights.class, FareGroupFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispFareGroup", scope = FareGroupFlight.class)
  public JAXBElement<String> createFareGroupFlightDispFareGroup(String value) {
    return new JAXBElement<String>(_FareGroupAirlineFlightDispFareGroup_QNAME, String.class, FareGroupFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DispMLFareGroup", scope = FareGroupFlight.class)
  public JAXBElement<String> createFareGroupFlightDispMLFareGroup(String value) {
    return new JAXBElement<String>(_FareGroupFlightDispMLFareGroup_QNAME, String.class, FareGroupFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ParentGroupName", scope = FareGroupFlight.class)
  public JAXBElement<String> createFareGroupFlightParentGroupName(String value) {
    return new JAXBElement<String>(_FareGroupFlightParentGroupName_QNAME, String.class, FareGroupFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepTime", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightDepTime(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentDepTime_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DisplayCurrencyCode", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightDisplayCurrencyCode(String value) {
    return new JAXBElement<String>(_AirlineFlightDisplayCurrencyCode_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FlightNo", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightFlightNo(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentFlightNo_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MANameML", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightMANameML(String value) {
    return new JAXBElement<String>(_AirlineFlightMANameML_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "TotalDura", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightTotalDura(String value) {
    return new JAXBElement<String>(_AirlineFlightTotalDura_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrTime", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightArrTime(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentArrTime_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFareGroupFlight }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FareGroupFlights", scope = AirlineFlight.class)
  public JAXBElement<ArrayOfFareGroupFlight> createAirlineFlightFareGroupFlights(ArrayOfFareGroupFlight value) {
    return new JAXBElement<ArrayOfFareGroupFlight>(_AirlineFlightFareGroupFlights_QNAME, ArrayOfFareGroupFlight.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MinFlightClass", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightMinFlightClass(String value) {
    return new JAXBElement<String>(_AirlineFlightMinFlightClass_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AdditionalFareInfo", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightAdditionalFareInfo(String value) {
    return new JAXBElement<String>(_FlightsAdditionalFareInfo_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CurrSymbol", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightCurrSymbol(String value) {
    return new JAXBElement<String>(_AirlineFlightCurrSymbol_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Flights }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "EconomyFlight", scope = AirlineFlight.class)
  public JAXBElement<Flights> createAirlineFlightEconomyFlight(Flights value) {
    return new JAXBElement<Flights>(_AirlineFlightEconomyFlight_QNAME, Flights.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Flights }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PromoFlight", scope = AirlineFlight.class)
  public JAXBElement<Flights> createAirlineFlightPromoFlight(Flights value) {
    return new JAXBElement<Flights>(_AirlineFlightPromoFlight_QNAME, Flights.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Flights }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PremiumEconomyFlight", scope = AirlineFlight.class)
  public JAXBElement<Flights> createAirlineFlightPremiumEconomyFlight(Flights value) {
    return new JAXBElement<Flights>(_AirlineFlightPremiumEconomyFlight_QNAME, Flights.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Currency", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightCurrency(String value) {
    return new JAXBElement<String>(_AirlineMLAvailCurrency_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Flights }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "BusinessFlight", scope = AirlineFlight.class)
  public JAXBElement<Flights> createAirlineFlightBusinessFlight(Flights value) {
    return new JAXBElement<Flights>(_AirlineFlightBusinessFlight_QNAME, Flights.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Flights }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FirstFlight", scope = AirlineFlight.class)
  public JAXBElement<Flights> createAirlineFlightFirstFlight(Flights value) {
    return new JAXBElement<Flights>(_AirlineFlightFirstFlight_QNAME, Flights.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CurrencyName", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightCurrencyName(String value) {
    return new JAXBElement<String>(_AirlineFlightCurrencyName_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlights }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MLFlightList", scope = AirlineFlight.class)
  public JAXBElement<ArrayOfFlights> createAirlineFlightMLFlightList(ArrayOfFlights value) {
    return new JAXBElement<ArrayOfFlights>(_AirlineFlightMLFlightList_QNAME, ArrayOfFlights.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrCityName", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightArrCityName(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentArrCityName_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrDate", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightArrDate(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentArrDate_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Flights }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SuperSaverFlight", scope = AirlineFlight.class)
  public JAXBElement<Flights> createAirlineFlightSuperSaverFlight(Flights value) {
    return new JAXBElement<Flights>(_AirlineFlightSuperSaverFlight_QNAME, Flights.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Flights }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "EconomyFlexiFlight", scope = AirlineFlight.class)
  public JAXBElement<Flights> createAirlineFlightEconomyFlexiFlight(Flights value) {
    return new JAXBElement<Flights>(_AirlineFlightEconomyFlexiFlight_QNAME, Flights.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrCity", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightArrCity(String value) {
    return new JAXBElement<String>(_RouteFreeBaggageAllowanceArrCity_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFareGroupAirlineFlight }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "OBAvailFareGroups", scope = AirlineFlight.class)
  public JAXBElement<ArrayOfFareGroupAirlineFlight> createAirlineFlightOBAvailFareGroups(ArrayOfFareGroupAirlineFlight value) {
    return new JAXBElement<ArrayOfFareGroupAirlineFlight>(_AirlineFlightOBAvailFareGroups_QNAME, ArrayOfFareGroupAirlineFlight.class,
        AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FGKey", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightFGKey(String value) {
    return new JAXBElement<String>(_FlightsFGKey_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Flights }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "BusinessFlexiFlight", scope = AirlineFlight.class)
  public JAXBElement<Flights> createAirlineFlightBusinessFlexiFlight(Flights value) {
    return new JAXBElement<Flights>(_AirlineFlightBusinessFlexiFlight_QNAME, Flights.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepCityName", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightDepCityName(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentDepCityName_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFareGroupAirlineFlight }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "IBAvailFareGroups", scope = AirlineFlight.class)
  public JAXBElement<ArrayOfFareGroupAirlineFlight> createAirlineFlightIBAvailFareGroups(ArrayOfFareGroupAirlineFlight value) {
    return new JAXBElement<ArrayOfFareGroupAirlineFlight>(_AirlineFlightIBAvailFareGroups_QNAME, ArrayOfFareGroupAirlineFlight.class,
        AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AFDirection", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightAFDirection(String value) {
    return new JAXBElement<String>(_AirlineFlightAFDirection_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MAName", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightMAName(String value) {
    return new JAXBElement<String>(_AirlineFlightMAName_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAirlineFlightSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SegmentInformation", scope = AirlineFlight.class)
  public JAXBElement<ArrayOfAirlineFlightSegment> createAirlineFlightSegmentInformation(ArrayOfAirlineFlightSegment value) {
    return new JAXBElement<ArrayOfAirlineFlightSegment>(_AirlineFlightSegmentInformation_QNAME, ArrayOfAirlineFlightSegment.class,
        AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "dispFlightAmount", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightDispFlightAmount(String value) {
    return new JAXBElement<String>(_AirlineMLAvailDispFlightAmount_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Region", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightRegion(String value) {
    return new JAXBElement<String>(_AirlineFlightRegion_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MACode", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightMACode(String value) {
    return new JAXBElement<String>(_AirlineFlightMACode_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepDate", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightDepDate(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceENDepDate_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FuelStopOverCountry", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightFuelStopOverCountry(String value) {
    return new JAXBElement<String>(_AirlineFlightFuelStopOverCountry_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ConnectionCityDetails", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightConnectionCityDetails(String value) {
    return new JAXBElement<String>(_AirlineFlightConnectionCityDetails_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepCity", scope = AirlineFlight.class)
  public JAXBElement<String> createAirlineFlightDepCity(String value) {
    return new JAXBElement<String>(_RouteFreeBaggageAllowanceDepCity_QNAME, String.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link PriceInformation }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MLPriceInformation", scope = AirlineFlight.class)
  public JAXBElement<PriceInformation> createAirlineFlightMLPriceInformation(PriceInformation value) {
    return new JAXBElement<PriceInformation>(_AirlineFlightMLPriceInformation_QNAME, PriceInformation.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SpecialTypePaxCount }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "NoSpecialPax", scope = AirlineFlight.class)
  public JAXBElement<SpecialTypePaxCount> createAirlineFlightNoSpecialPax(SpecialTypePaxCount value) {
    return new JAXBElement<SpecialTypePaxCount>(_AirlineFlightNoSpecialPax_QNAME, SpecialTypePaxCount.class, AirlineFlight.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInsuranceReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "InsuranceReservationResult", scope = ResultPackage.class)
  public JAXBElement<ArrayOfInsuranceReservationEN> createResultPackageInsuranceReservationResult(ArrayOfInsuranceReservationEN value) {
    return new JAXBElement<ArrayOfInsuranceReservationEN>(_ResultPackageInsuranceReservationResult_QNAME, ArrayOfInsuranceReservationEN.class,
        ResultPackage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAirlineMealSelectionEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MealReservationsResult", scope = ResultPackage.class)
  public JAXBElement<ArrayOfAirlineMealSelectionEN> createResultPackageMealReservationsResult(ArrayOfAirlineMealSelectionEN value) {
    return new JAXBElement<ArrayOfAirlineMealSelectionEN>(_ResultPackageMealReservationsResult_QNAME, ArrayOfAirlineMealSelectionEN.class,
        ResultPackage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PaymentFailedMessage", scope = ResultPackage.class)
  public JAXBElement<String> createResultPackagePaymentFailedMessage(String value) {
    return new JAXBElement<String>(_ResultPackagePaymentFailedMessage_QNAME, String.class, ResultPackage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaggageReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BaggageReservationsResult", scope = ResultPackage.class)
  public JAXBElement<ArrayOfBaggageReservationEN> createResultPackageBaggageReservationsResult(ArrayOfBaggageReservationEN value) {
    return new JAXBElement<ArrayOfBaggageReservationEN>(_ResultPackageBaggageReservationsResult_QNAME, ArrayOfBaggageReservationEN.class,
        ResultPackage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMultilegFlightReservation }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Multileg_Flights", scope = ResultPackage.class)
  public JAXBElement<ArrayOfMultilegFlightReservation> createResultPackageMultilegFlights(ArrayOfMultilegFlightReservation value) {
    return new JAXBElement<ArrayOfMultilegFlightReservation>(_ResultPackageMultilegFlights_QNAME, ArrayOfMultilegFlightReservation.class,
        ResultPackage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightReservationResult", scope = ResultPackage.class)
  public JAXBElement<FlightReservationEN> createResultPackageFlightReservationResult(FlightReservationEN value) {
    return new JAXBElement<FlightReservationEN>(_ResultPackageFlightReservationResult_QNAME, FlightReservationEN.class, ResultPackage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlightReservationSegmentsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightReservationSegmentsListResult", scope = ResultPackage.class)
  public JAXBElement<ArrayOfFlightReservationSegmentsEN> createResultPackageFlightReservationSegmentsListResult(ArrayOfFlightReservationSegmentsEN value) {
    return new JAXBElement<ArrayOfFlightReservationSegmentsEN>(_ResultPackageFlightReservationSegmentsListResult_QNAME,
        ArrayOfFlightReservationSegmentsEN.class, ResultPackage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightReservationSegmentsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightReservationSegmentsResult", scope = ResultPackage.class)
  public JAXBElement<FlightReservationSegmentsEN> createResultPackageFlightReservationSegmentsResult(FlightReservationSegmentsEN value) {
    return new JAXBElement<FlightReservationSegmentsEN>(_ResultPackageFlightReservationSegmentsResult_QNAME, FlightReservationSegmentsEN.class,
        ResultPackage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMessage", scope = ResultPackage.class)
  public JAXBElement<String> createResultPackageResultMessage(String value) {
    return new JAXBElement<String>(_ResultPackageResultMessage_QNAME, String.class, ResultPackage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlightReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MultiLegFlightReservationResult", scope = ResultPackage.class)
  public JAXBElement<ArrayOfFlightReservationEN> createResultPackageMultiLegFlightReservationResult(ArrayOfFlightReservationEN value) {
    return new JAXBElement<ArrayOfFlightReservationEN>(_ResultPackageMultiLegFlightReservationResult_QNAME, ArrayOfFlightReservationEN.class,
        ResultPackage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BookedProducts }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "BookingFailedProducts", scope = ResultPackage.class)
  public JAXBElement<BookedProducts> createResultPackageBookingFailedProducts(BookedProducts value) {
    return new JAXBElement<BookedProducts>(_ResultPackageBookingFailedProducts_QNAME, BookedProducts.class, ResultPackage.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeatReservationEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SeatReservationsResult", scope = ResultPackage.class)
  public JAXBElement<ArrayOfSeatReservationEN> createResultPackageSeatReservationsResult(ArrayOfSeatReservationEN value) {
    return new JAXBElement<ArrayOfSeatReservationEN>(_ResultPackageSeatReservationsResult_QNAME, ArrayOfSeatReservationEN.class, ResultPackage.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "UserName", scope = SMSSettingsEN.class)
  public JAXBElement<String> createSMSSettingsENUserName(String value) {
    return new JAXBElement<String>(_APICancelBookingRequestUserName_QNAME, String.class, SMSSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Password", scope = SMSSettingsEN.class)
  public JAXBElement<String> createSMSSettingsENPassword(String value) {
    return new JAXBElement<String>(_APICancelBookingRequestPassword_QNAME, String.class, SMSSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Provider", scope = SMSSettingsEN.class)
  public JAXBElement<String> createSMSSettingsENProvider(String value) {
    return new JAXBElement<String>(_SMSSettingsENProvider_QNAME, String.class, SMSSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = SMSSettingsEN.class)
  public JAXBElement<Result> createSMSSettingsENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, SMSSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ServiceURL", scope = SMSSettingsEN.class)
  public JAXBElement<String> createSMSSettingsENServiceURL(String value) {
    return new JAXBElement<String>(_SMSSettingsENServiceURL_QNAME, String.class, SMSSettingsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMultiCitySetSelectedFlight }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SetSelectedFlights", scope = APIMultiCitySetSelectedFlights.class)
  public JAXBElement<ArrayOfMultiCitySetSelectedFlight> createAPIMultiCitySetSelectedFlightsSetSelectedFlights(ArrayOfMultiCitySetSelectedFlight value) {
    return new JAXBElement<ArrayOfMultiCitySetSelectedFlight>(_APIMultiCitySetSelectedFlightsSetSelectedFlights_QNAME,
        ArrayOfMultiCitySetSelectedFlight.class, APIMultiCitySetSelectedFlights.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPIMealSegment }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AvailableMeals", scope = APIMealAvailability.class)
  public JAXBElement<ArrayOfAPIMealSegment> createAPIMealAvailabilityAvailableMeals(ArrayOfAPIMealSegment value) {
    return new JAXBElement<ArrayOfAPIMealSegment>(_APIMealAvailabilityAvailableMeals_QNAME, ArrayOfAPIMealSegment.class, APIMealAvailability.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAirlineFlight }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AvailableFlights", scope = FlightSearchReponse.class)
  public JAXBElement<ArrayOfAirlineFlight> createFlightSearchReponseAvailableFlights(ArrayOfAirlineFlight value) {
    return new JAXBElement<ArrayOfAirlineFlight>(_MultiFlightSearchReponseAvailableFlights_QNAME, ArrayOfAirlineFlight.class,
        FlightSearchReponse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ErrorDetails", scope = FlightSearchReponse.class)
  public JAXBElement<String> createFlightSearchReponseErrorDetails(String value) {
    return new JAXBElement<String>(_MultiFlightSearchReponseErrorDetails_QNAME, String.class, FlightSearchReponse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBaggages }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AvailableFreeBaggages", scope = FlightSearchReponse.class)
  public JAXBElement<ArrayOfBaggages> createFlightSearchReponseAvailableFreeBaggages(ArrayOfBaggages value) {
    return new JAXBElement<ArrayOfBaggages>(_FlightSearchReponseAvailableFreeBaggages_QNAME, ArrayOfBaggages.class, FlightSearchReponse.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PassengerType", scope = PaxPriceBreakDown.class)
  public JAXBElement<String> createPaxPriceBreakDownPassengerType(String value) {
    return new JAXBElement<String>(_PassengersENPassengerType_QNAME, String.class, PaxPriceBreakDown.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "dispTotalAmount", scope = PaxPriceBreakDown.class)
  public JAXBElement<String> createPaxPriceBreakDownDispTotalAmount(String value) {
    return new JAXBElement<String>(_PaxPriceBreakDownDispTotalAmount_QNAME, String.class, PaxPriceBreakDown.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "dispTax", scope = PaxPriceBreakDown.class)
  public JAXBElement<String> createPaxPriceBreakDownDispTax(String value) {
    return new JAXBElement<String>(_PaxPriceBreakDownDispTax_QNAME, String.class, PaxPriceBreakDown.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "dispAmount", scope = PaxPriceBreakDown.class)
  public JAXBElement<String> createPaxPriceBreakDownDispAmount(String value) {
    return new JAXBElement<String>(_PaxPriceBreakDownDispAmount_QNAME, String.class, PaxPriceBreakDown.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PaxType", scope = PaxPriceBreakDown.class)
  public JAXBElement<String> createPaxPriceBreakDownPaxType(String value) {
    return new JAXBElement<String>(_SegmentFareInfoENPaxType_QNAME, String.class, PaxPriceBreakDown.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Description", scope = TaxBreakDownInfo.class)
  public JAXBElement<String> createTaxBreakDownInfoDescription(String value) {
    return new JAXBElement<String>(_PaxTypeChargeDescription_QNAME, String.class, TaxBreakDownInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DisplayDesc", scope = TaxBreakDownInfo.class)
  public JAXBElement<String> createTaxBreakDownInfoDisplayDesc(String value) {
    return new JAXBElement<String>(_TaxBreakDownInfoDisplayDesc_QNAME, String.class, TaxBreakDownInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DisplayCurrency", scope = TaxBreakDownInfo.class)
  public JAXBElement<String> createTaxBreakDownInfoDisplayCurrency(String value) {
    return new JAXBElement<String>(_AirlineMLPriceDisplayCurrency_QNAME, String.class, TaxBreakDownInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "BreakDownCode", scope = TaxBreakDownInfo.class)
  public JAXBElement<String> createTaxBreakDownInfoBreakDownCode(String value) {
    return new JAXBElement<String>(_TaxBreakDownInfoBreakDownCode_QNAME, String.class, TaxBreakDownInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "CurrencyCode", scope = TaxBreakDownInfo.class)
  public JAXBElement<String> createTaxBreakDownInfoCurrencyCode(String value) {
    return new JAXBElement<String>(_FlightsCurrencyCode_QNAME, String.class, TaxBreakDownInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DisplayAmount", scope = TaxBreakDownInfo.class)
  public JAXBElement<String> createTaxBreakDownInfoDisplayAmount(String value) {
    return new JAXBElement<String>(_TaxBreakDownInfoDisplayAmount_QNAME, String.class, TaxBreakDownInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ApplicableCardTypes", scope = CustomerUserPaymentMethodsEN.class)
  public JAXBElement<String> createCustomerUserPaymentMethodsENApplicableCardTypes(String value) {
    return new JAXBElement<String>(_PromotionSettingsENApplicableCardTypes_QNAME, String.class, CustomerUserPaymentMethodsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "InstructionsInEnglish", scope = CustomerUserPaymentMethodsEN.class)
  public JAXBElement<String> createCustomerUserPaymentMethodsENInstructionsInEnglish(String value) {
    return new JAXBElement<String>(_CustomerUserPaymentMethodsENInstructionsInEnglish_QNAME, String.class, CustomerUserPaymentMethodsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "LangText", scope = CustomerUserPaymentMethodsEN.class)
  public JAXBElement<String> createCustomerUserPaymentMethodsENLangText(String value) {
    return new JAXBElement<String>(_CustomerUserPaymentMethodsENLangText_QNAME, String.class, CustomerUserPaymentMethodsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SellingCurrency", scope = CustomerUserPaymentMethodsEN.class)
  public JAXBElement<String> createCustomerUserPaymentMethodsENSellingCurrency(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENSellingCurrency_QNAME, String.class, CustomerUserPaymentMethodsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MarkupApplicableCurrency", scope = CustomerUserPaymentMethodsEN.class)
  public JAXBElement<String> createCustomerUserPaymentMethodsENMarkupApplicableCurrency(String value) {
    return new JAXBElement<String>(_CustomerUserCardTypesENMarkupApplicableCurrency_QNAME, String.class, CustomerUserPaymentMethodsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SupportedCurrencies", scope = CustomerUserPaymentMethodsEN.class)
  public JAXBElement<String> createCustomerUserPaymentMethodsENSupportedCurrencies(String value) {
    return new JAXBElement<String>(_CustomerUserCardTypesENSupportedCurrencies_QNAME, String.class, CustomerUserPaymentMethodsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerUserCardTypesEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CreditCardList", scope = CustomerUserPaymentMethodsEN.class)
  public JAXBElement<ArrayOfCustomerUserCardTypesEN> createCustomerUserPaymentMethodsENCreditCardList(ArrayOfCustomerUserCardTypesEN value) {
    return new JAXBElement<ArrayOfCustomerUserCardTypesEN>(_CustomerUserPaymentMethodsENCreditCardList_QNAME, ArrayOfCustomerUserCardTypesEN.class,
        CustomerUserPaymentMethodsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MarkupCurrency", scope = CustomerUserPaymentMethodsEN.class)
  public JAXBElement<String> createCustomerUserPaymentMethodsENMarkupCurrency(String value) {
    return new JAXBElement<String>(_CustomerUserCardTypesENMarkupCurrency_QNAME, String.class, CustomerUserPaymentMethodsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "LangCode", scope = CustomerUserPaymentMethodsEN.class)
  public JAXBElement<String> createCustomerUserPaymentMethodsENLangCode(String value) {
    return new JAXBElement<String>(_MobileAppLangTextENLangCode_QNAME, String.class, CustomerUserPaymentMethodsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInstallmentPaymentSettingsEN }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "InsPaymentSettings", scope = CustomerUserPaymentMethodsEN.class)
  public JAXBElement<ArrayOfInstallmentPaymentSettingsEN> createCustomerUserPaymentMethodsENInsPaymentSettings(ArrayOfInstallmentPaymentSettingsEN value) {
    return new JAXBElement<ArrayOfInstallmentPaymentSettingsEN>(_CustomerUserPaymentMethodsENInsPaymentSettings_QNAME,
        ArrayOfInstallmentPaymentSettingsEN.class, CustomerUserPaymentMethodsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PaymentCurrency", scope = CustomerUserPaymentMethodsEN.class)
  public JAXBElement<String> createCustomerUserPaymentMethodsENPaymentCurrency(String value) {
    return new JAXBElement<String>(_FlightManagementResponseENPaymentCurrency_QNAME, String.class, CustomerUserPaymentMethodsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "InstTextInThanksPage", scope = CustomerUserPaymentMethodsEN.class)
  public JAXBElement<String> createCustomerUserPaymentMethodsENInstTextInThanksPage(String value) {
    return new JAXBElement<String>(_CustomerUserPaymentMethodsENInstTextInThanksPage_QNAME, String.class, CustomerUserPaymentMethodsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DisplayPaymentMethodName", scope = CustomerUserPaymentMethodsEN.class)
  public JAXBElement<String> createCustomerUserPaymentMethodsENDisplayPaymentMethodName(String value) {
    return new JAXBElement<String>(_CustomerUserPaymentMethodsENDisplayPaymentMethodName_QNAME, String.class, CustomerUserPaymentMethodsEN.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ImageFileName", scope = CustomerUserPaymentMethodsEN.class)
  public JAXBElement<String> createCustomerUserPaymentMethodsENImageFileName(String value) {
    return new JAXBElement<String>(_CustomerUserCardTypesENImageFileName_QNAME, String.class, CustomerUserPaymentMethodsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ApplicableTo", scope = CustomerUserPaymentMethodsEN.class)
  public JAXBElement<String> createCustomerUserPaymentMethodsENApplicableTo(String value) {
    return new JAXBElement<String>(_CustomerUserPaymentMethodsENApplicableTo_QNAME, String.class, CustomerUserPaymentMethodsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DisplayTextinPricing", scope = CustomerUserPaymentMethodsEN.class)
  public JAXBElement<String> createCustomerUserPaymentMethodsENDisplayTextinPricing(String value) {
    return new JAXBElement<String>(_CustomerUserPaymentMethodsENDisplayTextinPricing_QNAME, String.class, CustomerUserPaymentMethodsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ParentPaymentMethodName", scope = CustomerUserPaymentMethodsEN.class)
  public JAXBElement<String> createCustomerUserPaymentMethodsENParentPaymentMethodName(String value) {
    return new JAXBElement<String>(_CustomerUserPaymentMethodsENParentPaymentMethodName_QNAME, String.class, CustomerUserPaymentMethodsEN.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CVV", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENCVV(String value) {
    return new JAXBElement<String>(_CreditCardsENCVV_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CardName", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENCardName(String value) {
    return new JAXBElement<String>(_CreditCardsENCardName_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Email", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENEmail(String value) {
    return new JAXBElement<String>(_PassengersENEmail_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "TransactionID", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENTransactionID(String value) {
    return new JAXBElement<String>(_ReservationsCardTransactionsENTransactionID_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ChannelCode", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENChannelCode(String value) {
    return new JAXBElement<String>(_CreditCardsENChannelCode_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PurAmount", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENPurAmount(String value) {
    return new JAXBElement<String>(_CreditCardsENPurAmount_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ExpDate", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENExpDate(String value) {
    return new JAXBElement<String>(_CreditCardsENExpDate_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CardType", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENCardType(String value) {
    return new JAXBElement<String>(_CreditCardsENCardType_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Currency", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENCurrency(String value) {
    return new JAXBElement<String>(_LoungeReservationENCurrency_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "StartDate", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENStartDate(String value) {
    return new JAXBElement<String>(_CreditCardsENStartDate_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ContactNo", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENContactNo(String value) {
    return new JAXBElement<String>(_CreditCardsENContactNo_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "IssueCountry", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENIssueCountry(String value) {
    return new JAXBElement<String>(_CreditCardsENIssueCountry_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "TransNoAbout3D", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENTransNoAbout3D(String value) {
    return new JAXBElement<String>(_CreditCardsENTransNoAbout3D_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FirstName", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENFirstName(String value) {
    return new JAXBElement<String>(_PassengersENFirstName_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "MobileNo", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENMobileNo(String value) {
    return new JAXBElement<String>(_PassengersENMobileNo_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SurName", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENSurName(String value) {
    return new JAXBElement<String>(_PassengersENSurName_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Address2", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENAddress2(String value) {
    return new JAXBElement<String>(_PassengerDetailsENAddress2_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Title", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENTitle(String value) {
    return new JAXBElement<String>(_PassengersENTitle_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Address1", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENAddress1(String value) {
    return new JAXBElement<String>(_PassengerDetailsENAddress1_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "City", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENCity(String value) {
    return new JAXBElement<String>(_PassengerDetailsENCity_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "AgentCode", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENAgentCode(String value) {
    return new JAXBElement<String>(_CreditCardsENAgentCode_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "IssueNo", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENIssueNo(String value) {
    return new JAXBElement<String>(_CreditCardsENIssueNo_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationID", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENReservationID(String value) {
    return new JAXBElement<String>(_FareRulesENReservationID_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "State", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENState(String value) {
    return new JAXBElement<String>(_PassengerDetailsENState_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "GatewayPaymentMethod", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENGatewayPaymentMethod(String value) {
    return new JAXBElement<String>(_CreditCardsENGatewayPaymentMethod_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CardNo", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENCardNo(String value) {
    return new JAXBElement<String>(_CreditCardsENCardNo_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PostCode", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENPostCode(String value) {
    return new JAXBElement<String>(_ProfileENPostCode_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "InfoAbout3D", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENInfoAbout3D(String value) {
    return new JAXBElement<String>(_CreditCardsENInfoAbout3D_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "IssueBank", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENIssueBank(String value) {
    return new JAXBElement<String>(_CreditCardsENIssueBank_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Country", scope = CreditCardsEN.class)
  public JAXBElement<String> createCreditCardsENCountry(String value) {
    return new JAXBElement<String>(_ProfileENCountry_QNAME, String.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = CreditCardsEN.class)
  public JAXBElement<Result> createCreditCardsENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, CreditCardsEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ServiceCardType", scope = CardTypesEN.class)
  public JAXBElement<String> createCardTypesENServiceCardType(String value) {
    return new JAXBElement<String>(_CardTypesENServiceCardType_QNAME, String.class, CardTypesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Status", scope = CardTypesEN.class)
  public JAXBElement<String> createCardTypesENStatus(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENStatus_QNAME, String.class, CardTypesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Name", scope = CardTypesEN.class)
  public JAXBElement<String> createCardTypesENName(String value) {
    return new JAXBElement<String>(_PaymentMethodsENName_QNAME, String.class, CardTypesEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "URL", scope = APIInsuranceURL.class)
  public JAXBElement<String> createAPIInsuranceURLURL(String value) {
    return new JAXBElement<String>(_APIInsuranceURLURL_QNAME, String.class, APIInsuranceURL.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link APIAddonPriceInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PriceInfo", scope = APIMealInfo.class)
  public JAXBElement<APIAddonPriceInfo> createAPIMealInfoPriceInfo(APIAddonPriceInfo value) {
    return new JAXBElement<APIAddonPriceInfo>(_APIBaggageInfoPriceInfo_QNAME, APIAddonPriceInfo.class, APIMealInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MealCode", scope = APIMealInfo.class)
  public JAXBElement<String> createAPIMealInfoMealCode(String value) {
    return new JAXBElement<String>(_APISelectedMealsMealCode_QNAME, String.class, APIMealInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MealName", scope = APIMealInfo.class)
  public JAXBElement<String> createAPIMealInfoMealName(String value) {
    return new JAXBElement<String>(_APIMealInfoMealName_QNAME, String.class, APIMealInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpecialPaxPriceDifference }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SplPaxPriceDiff", scope = PaxPriceDifference.class)
  public JAXBElement<ArrayOfSpecialPaxPriceDifference> createPaxPriceDifferenceSplPaxPriceDiff(ArrayOfSpecialPaxPriceDifference value) {
    return new JAXBElement<ArrayOfSpecialPaxPriceDifference>(_PaxPriceDifferenceSplPaxPriceDiff_QNAME, ArrayOfSpecialPaxPriceDifference.class,
        PaxPriceDifference.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepTime", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentDepTime(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentDepTime_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "Via", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentVia(String value) {
    return new JAXBElement<String>(_IntermediatePointVia_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FlightNo", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentFlightNo(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentFlightNo_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MANameML", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentMANameML(String value) {
    return new JAXBElement<String>(_AirlineFlightMANameML_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrCityName", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentArrCityName(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentArrCityName_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrDate", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentArrDate(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentArrDate_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link IntermediatePoint }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "IntermediatePoints", scope = AirlineFlightSegment.class)
  public JAXBElement<IntermediatePoint> createAirlineFlightSegmentIntermediatePoints(IntermediatePoint value) {
    return new JAXBElement<IntermediatePoint>(_GDSFlightSegmentIntermediatePoints_QNAME, IntermediatePoint.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrCity", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentArrCity(String value) {
    return new JAXBElement<String>(_RouteFreeBaggageAllowanceArrCity_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "SegBookingClass", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentSegBookingClass(String value) {
    return new JAXBElement<String>(_AirlineFlightSegmentSegBookingClass_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrTime", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentArrTime(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentArrTime_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link DisClosureAirline }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DisClosureAirline", scope = AirlineFlightSegment.class)
  public JAXBElement<DisClosureAirline> createAirlineFlightSegmentDisClosureAirline(DisClosureAirline value) {
    return new JAXBElement<DisClosureAirline>(_DisClosureAirline_QNAME, DisClosureAirline.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepCityName", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentDepCityName(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentDepCityName_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MAName", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentMAName(String value) {
    return new JAXBElement<String>(_AirlineFlightMAName_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "OprAirlineCode", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentOprAirlineCode(String value) {
    return new JAXBElement<String>(_AirlineFlightSegmentOprAirlineCode_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "ArrAirportCityName", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentArrAirportCityName(String value) {
    return new JAXBElement<String>(_AirlineFlightSegmentArrAirportCityName_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepAirportCityName", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentDepAirportCityName(String value) {
    return new JAXBElement<String>(_AirlineFlightSegmentDepAirportCityName_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "AirCraft", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentAirCraft(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentAirCraft_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "TransTime", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentTransTime(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentTransTime_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "TDuration", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentTDuration(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentTDuration_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MACode", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentMACode(String value) {
    return new JAXBElement<String>(_AirlineFlightMACode_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "OprAirlineName", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentOprAirlineName(String value) {
    return new JAXBElement<String>(_GDSFlightSegmentOprAirlineName_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepDate", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentDepDate(String value) {
    return new JAXBElement<String>(_FreeBaggageAllowanceENDepDate_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FuelStopOver", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentFuelStopOver(String value) {
    return new JAXBElement<String>(_AirlineFlightSegmentFuelStopOver_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DepCity", scope = AirlineFlightSegment.class)
  public JAXBElement<String> createAirlineFlightSegmentDepCity(String value) {
    return new JAXBElement<String>(_RouteFreeBaggageAllowanceDepCity_QNAME, String.class, AirlineFlightSegment.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAPIPaxSelectedAddOn }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "PaxSelectedAddons", scope = APIAddonSetSelectedReq.class)
  public JAXBElement<ArrayOfAPIPaxSelectedAddOn> createAPIAddonSetSelectedReqPaxSelectedAddons(ArrayOfAPIPaxSelectedAddOn value) {
    return new JAXBElement<ArrayOfAPIPaxSelectedAddOn>(_APIAddonSetSelectedReqPaxSelectedAddons_QNAME, ArrayOfAPIPaxSelectedAddOn.class,
        APIAddonSetSelectedReq.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "MemberTier", scope = LoyaltySearchUserInfo.class)
  public JAXBElement<String> createLoyaltySearchUserInfoMemberTier(String value) {
    return new JAXBElement<String>(_LoyaltySearchUserInfoMemberTier_QNAME, String.class, LoyaltySearchUserInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "BinNumber", scope = LoyaltySearchUserInfo.class)
  public JAXBElement<String> createLoyaltySearchUserInfoBinNumber(String value) {
    return new JAXBElement<String>(_LoyaltySearchUserInfoBinNumber_QNAME, String.class, LoyaltySearchUserInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "DiscountCode", scope = LoyaltySearchUserInfo.class)
  public JAXBElement<String> createLoyaltySearchUserInfoDiscountCode(String value) {
    return new JAXBElement<String>(_LoyaltySearchUserInfoDiscountCode_QNAME, String.class, LoyaltySearchUserInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", name = "FFMemberID", scope = LoyaltySearchUserInfo.class)
  public JAXBElement<String> createLoyaltySearchUserInfoFFMemberID(String value) {
    return new JAXBElement<String>(_LoyaltySearchUserInfoFFMemberID_QNAME, String.class, LoyaltySearchUserInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CommercialName", scope = SeatReservationEN.class)
  public JAXBElement<String> createSeatReservationENCommercialName(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENCommercialName_QNAME, String.class, SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FirstName", scope = SeatReservationEN.class)
  public JAXBElement<String> createSeatReservationENFirstName(String value) {
    return new JAXBElement<String>(_PassengersENFirstName_QNAME, String.class, SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SeatCharactericts", scope = SeatReservationEN.class)
  public JAXBElement<String> createSeatReservationENSeatCharactericts(String value) {
    return new JAXBElement<String>(_SeatReservationENSeatCharactericts_QNAME, String.class, SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link ServiceRequestInfo }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ServiceRequestInformation", scope = SeatReservationEN.class)
  public JAXBElement<ServiceRequestInfo> createSeatReservationENServiceRequestInformation(ServiceRequestInfo value) {
    return new JAXBElement<ServiceRequestInfo>(_InsuranceReservationENServiceRequestInformation_QNAME, ServiceRequestInfo.class,
        SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Direction", scope = SeatReservationEN.class)
  public JAXBElement<String> createSeatReservationENDirection(String value) {
    return new JAXBElement<String>(_SeatReservationENDirection_QNAME, String.class, SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link FlightAddOnBookingStatus }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SeatAddOnStatus", scope = SeatReservationEN.class)
  public JAXBElement<FlightAddOnBookingStatus> createSeatReservationENSeatAddOnStatus(FlightAddOnBookingStatus value) {
    return new JAXBElement<FlightAddOnBookingStatus>(_SeatReservationENSeatAddOnStatus_QNAME, FlightAddOnBookingStatus.class, SeatReservationEN.class,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ArrCity", scope = SeatReservationEN.class)
  public JAXBElement<String> createSeatReservationENArrCity(String value) {
    return new JAXBElement<String>(_LoungeReservationENArrCity_QNAME, String.class, SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EMDNumber", scope = SeatReservationEN.class)
  public JAXBElement<String> createSeatReservationENEMDNumber(String value) {
    return new JAXBElement<String>(_InsuranceReservationENEMDNumber_QNAME, String.class, SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Taxes", scope = SeatReservationEN.class)
  public JAXBElement<String> createSeatReservationENTaxes(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENTaxes_QNAME, String.class, SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ReservationID", scope = SeatReservationEN.class)
  public JAXBElement<String> createSeatReservationENReservationID(String value) {
    return new JAXBElement<String>(_FareRulesENReservationID_QNAME, String.class, SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "FlightCode", scope = SeatReservationEN.class)
  public JAXBElement<String> createSeatReservationENFlightCode(String value) {
    return new JAXBElement<String>(_BaggageReservationENFlightCode_QNAME, String.class, SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Currency", scope = SeatReservationEN.class)
  public JAXBElement<String> createSeatReservationENCurrency(String value) {
    return new JAXBElement<String>(_LoungeReservationENCurrency_QNAME, String.class, SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "DepCity", scope = SeatReservationEN.class)
  public JAXBElement<String> createSeatReservationENDepCity(String value) {
    return new JAXBElement<String>(_LoungeReservationENDepCity_QNAME, String.class, SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "EMDErrorMessage", scope = SeatReservationEN.class)
  public JAXBElement<String> createSeatReservationENEMDErrorMessage(String value) {
    return new JAXBElement<String>(_BaggageReservationENEMDErrorMessage_QNAME, String.class, SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "PassengerType", scope = SeatReservationEN.class)
  public JAXBElement<String> createSeatReservationENPassengerType(String value) {
    return new JAXBElement<String>(_PassengersENPassengerType_QNAME, String.class, SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SubCode", scope = SeatReservationEN.class)
  public JAXBElement<String> createSeatReservationENSubCode(String value) {
    return new JAXBElement<String>(_SeatReservationENSubCode_QNAME, String.class, SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Result }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "ResultMsg", scope = SeatReservationEN.class)
  public JAXBElement<Result> createSeatReservationENResultMsg(Result value) {
    return new JAXBElement<Result>(_FareRulesENResultMsg_QNAME, Result.class, SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "SeatNo", scope = SeatReservationEN.class)
  public JAXBElement<String> createSeatReservationENSeatNo(String value) {
    return new JAXBElement<String>(_SeatReservationENSeatNo_QNAME, String.class, SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Class", scope = SeatReservationEN.class)
  public JAXBElement<String> createSeatReservationENClass(String value) {
    return new JAXBElement<String>(_BaggageReservationENClass_QNAME, String.class, SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "LastName", scope = SeatReservationEN.class)
  public JAXBElement<String> createSeatReservationENLastName(String value) {
    return new JAXBElement<String>(_LoungeReservationENLastName_QNAME, String.class, SeatReservationEN.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "CommercialName", scope = ServiceRequestInfo.class)
  public JAXBElement<String> createServiceRequestInfoCommercialName(String value) {
    return new JAXBElement<String>(_AirlineMealSelectionENCommercialName_QNAME, String.class, ServiceRequestInfo.class, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
   */
  @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", name = "Subcode", scope = ServiceRequestInfo.class)
  public JAXBElement<String> createServiceRequestInfoSubcode(String value) {
    return new JAXBElement<String>(_ServiceRequestInfoSubcode_QNAME, String.class, ServiceRequestInfo.class, value);
  }

}
