package com.traveloka.hibernate.susimodel;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "FlightSegment", namespace = "")
public class FlightSegmentRS {

  @XmlElement(name = "number_of_stops", namespace = "")
  private String numberOfStops;

  @XmlElement(name = "transit_arrival_date", namespace = "")
  private String transitArrivalDate;

  @XmlElement(name = "booking_segment_id", namespace = "")
  private String bookingSegmentId;

  @XmlElement(name = "departure_date", namespace = "")
  private String departureDate;

  @XmlElement(name = "exclude_quote_flag", namespace = "")
  private String excludeQuoteFlag;

  @XmlElement(name = "fare_reduction", namespace = "")
  private String fareReduction;

  @XmlElement(name = "non_revenue_flag", namespace = "")
  private String nonRevenueFlag;

  @XmlElement(name = "transit_airport_rcd", namespace = "")
  private String transitAirportRcd;

  @XmlElement(name = "od_destination_rcd", namespace = "")
  private String odDestinationRcd;

  @XmlElement(name = "origin_rcd", namespace = "")
  private String originRcd;

  @XmlElement(name = "airline_rcd", namespace = "")
  private String airlineRcd;

  @XmlElement(name = "create_by", namespace = "")
  private String createBy;

  @XmlElement(name = "transit_departure_date", namespace = "")
  private String transitDepartureDate;

  @XmlElement(name = "create_date_time", namespace = "")
  private String createDateTime;

  @XmlElement(name = "transit_boarding_class_rcd", namespace = "")
  private String transitBoardingClassRcd;

  @XmlElement(name = "transit_booking_class_rcd", namespace = "")
  private String transitBookingClassRcd;

  @XmlElement(name = "destination_rcd", namespace = "")
  private String destinationRcd;

  @XmlElement(name = "waitlist_flag", namespace = "")
  private String waitlistFlag;

  @XmlElement(name = "exchanged_segment_id", namespace = "")
  private String exchangedSegmentId;

  @XmlElement(name = "advanced_purchase_flag", namespace = "")
  private String advancedPurchaseFlag;

  @XmlElement(name = "update_by", namespace = "")
  private String updateBy;

  @XmlElement(name = "update_date_time", namespace = "")
  private String updateDateTime;

  @XmlElement(name = "flight_connection_id", namespace = "")
  private String flightConnectionId;

  @XmlElement(name = "overbook_flag", namespace = "")
  private String overbookFlag;

  @XmlElement(name = "flight_number", namespace = "")
  private String flightNumber;

  @XmlElement(name = "eticket_flag", namespace = "")
  private String eticketFlag;

  @XmlElement(name = "boarding_class_rcd", namespace = "")
  private String boardingClassRcd;

  @XmlElement(name = "booking_class_rcd", namespace = "")
  private String bookingClassRcd;

  @XmlElement(name = "od_origin_rcd", namespace = "")
  private String odOriginRcd;

  @XmlElement(name = "flight_id", namespace = "")
  private String flightId;

  @XmlElement(name = "refundable_flag", namespace = "")
  private String refundableFlag;

  @XmlElement(name = "transit_fare_id", namespace = "")
  private String transitFareId;

  @XmlElement(name = "transit_points", namespace = "")
  private String transitPoints;

  @XmlElement(name = "priority_rcd", namespace = "")
  private String priorityRcd;

  @XmlElement(name = "segment_status_rcd", namespace = "")
  private String segmentStatusRcd;

  @XmlElement(name = "fare_id", namespace = "")
  private String fareId;

  @XmlElement(name = "group_flag", namespace = "")
  private String groupFlag;

  @XmlElement(name = "transit_flight_id", namespace = "")
  private String transitFlightId;

  @XmlElement(name = "routes_tot", namespace = "")
  private String routesTot;

  @XmlElement(name = "routes_avl", namespace = "")
  private String routesAvl;

  @XmlElement(name = "routes_b2c", namespace = "")
  private String routesB2c;

  @XmlElement(name = "routes_b2b", namespace = "")
  private String routesB2b;

  @XmlElement(name = "routes_b2s", namespace = "")
  private String routesB2s;

  @XmlElement(name = "routes_api", namespace = "")
  private String routesApi;

  @XmlElement(name = "routes_b2t", namespace = "")
  private String routesB2t;

  @XmlElement(name = "segment_change_fee_flag", namespace = "")
  private Boolean segmentChangeFeeFlag;

  @XmlElement(name = "transit_flag", namespace = "")
  private Boolean transitFlag;

  @XmlElement(name = "direct_flag", namespace = "")
  private Boolean directFlag;

  @XmlElement(name = "avl_flag", namespace = "")
  private Boolean avlFlag;

  @XmlElement(name = "b2c_flag", namespace = "")
  private Boolean b2cFlag;

  @XmlElement(name = "b2b_flag", namespace = "")
  private Boolean b2bFlag;

  @XmlElement(name = "b2t_flag", namespace = "")
  private Boolean b2tFlag;

  @XmlElement(name = "day_range", namespace = "")
  private Integer dayRange;

  @XmlElement(name = "show_redress_number_flag", namespace = "")
  private Boolean showRedressNumberFlag;

  @XmlElement(name = "require_passenger_title_flag", namespace = "")
  private Boolean requirePassengerTitleFlag;

  @XmlElement(name = "require_passenger_gender_flag", namespace = "")
  private Boolean requirePassengerGenderFlag;

  @XmlElement(name = "require_date_of_birth_flag", namespace = "")
  private Boolean requireDateOfBirthFlag;

  @XmlElement(name = "require_document_details_flag", namespace = "")
  private Boolean requireDocumentDetailsFlag;

  @XmlElement(name = "require_passenger_weight_flag", namespace = "")
  private Boolean requirePassengerWeightFlag;

  @XmlElement(name = "special_service_fee_flag", namespace = "")
  private Boolean specialServiceFeeFlag;

  @XmlElement(name = "show_insurance_on_web_flag", namespace = "")
  private Boolean showInsuranceOnWebFlag;

  @XmlElement(name = "arrival_date", namespace = "")
  private String arrivalDate;

  @XmlElement(name = "journey_time", namespace = "")
  private String journeyTime;

  @XmlElement(name = "arrival_time", namespace = "")
  private String arrivalTime;

  @XmlElement(name = "departure_time", namespace = "")
  private String departureTime;

  @XmlElement(name = "planned_departure_time", namespace = "")
  private String plannedDepartureTime;

  @XmlElement(name = "planned_arrival_time", namespace = "")
  private String plannedArrivalTime;

  @XmlElement(name = "departure_dayOfWeek", namespace = "")
  private String departureDayOfWeek;

  @XmlElement(name = "arrival_dayOfWeek", namespace = "")
  private String arrivalDayOfWeek;

  @XmlElement(name = "departure_month", namespace = "")
  private String departureMonth;

  @XmlElement(name = "number_of_units", namespace = "")
  private Integer numberOfUnits;

  @XmlElement(name = "info_segment_flag", namespace = "")
  private String infoSegmentFlag;

  @XmlElement(name = "high_priority_waitlist_flag", namespace = "")
  private String highPriorityWaitlistFlag;

  @XmlElement(name = "seatmap_flag", namespace = "")
  private String seatmapFlag;

  @XmlElement(name = "temp_seatmap_flag", namespace = "")
  private String tempSeatmapFlag;

  @XmlElement(name = "allow_web_checkin_flag", namespace = "")
  private String allowWebCheckinFlag;

  @XmlElement(name = "close_web_sales_flag", namespace = "")
  private String closeWebSalesFlag;

  @XmlElement(name = "booking_id", namespace = "")
  private String bookingId;

  @XmlElement(name = "currency_rate", namespace = "")
  private String currencyRate;

  @XmlElement(name = "open_sequence", namespace = "")
  private String openSequence;

}
