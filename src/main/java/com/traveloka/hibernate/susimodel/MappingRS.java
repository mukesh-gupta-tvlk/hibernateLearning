package com.traveloka.hibernate.susimodel;


import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Mapping", namespace = "")
public class MappingRS {

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

  @XmlElement(name = "fare_reduction", namespace = "")
  private Double fareReduction;

  @XmlElement(name = "arrival_date", namespace = "")
  private String arrivalDate;

  @XmlElement(name = "waitlist_flag", namespace = "")
  private Integer waitlistFlag;

  @XmlElement(name = "overbook_flag", namespace = "")
  private Integer overbookFlag;

  @XmlElement(name = "advanced_purchase_flag", namespace = "")
  private Integer advancedPurchaseFlag;

  @XmlElement(name = "journey_time", namespace = "")
  private String journeyTime;

  @XmlElement(name = "arrival_time", namespace = "")
  private String arrivalTime;

  @XmlElement(name = "transit_flight_id", namespace = "")
  private String transitFlightId;

  @XmlElement(name = "transit_fare_id", namespace = "")
  private String transitFareId;

  @XmlElement(name = "transit_departure_date", namespace = "")
  private String transitDepartureDate;

  @XmlElement(name = "transit_arrival_date", namespace = "")
  private String transitArrivalDate;

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

  @XmlElement(name = "exclude_quote_flag", namespace = "")
  private String excludeQuoteFlag;

  @XmlElement(name = "currency_rate", namespace = "")
  private String currencyRate;

  @XmlElement(name = "open_sequence", namespace = "")
  private String openSequence;

  @XmlElement(name = "number_of_stops", namespace = "")
  private String numberOfStops;

  @XmlElement(name = "middlename", namespace = "")
  private String middlename;

  @XmlElement(name = "document_type_rcd", namespace = "")
  private String documentTypeRcd;

  @XmlElement(name = "passport_number", namespace = "")
  private String passportNumber;

  @XmlElement(name = "passport_issue_place", namespace = "")
  private String passportIssuePlace;

  @XmlElement(name = "passport_issue_date", namespace = "")
  private String passportIssueDate;

  @XmlElement(name = "passport_expiry_date", namespace = "")
  private String passportExpiryDate;

  @XmlElement(name = "sendmail", namespace = "")
  private String sendmail;

  @XmlElement(name = "client_number", namespace = "")
  private String clientNumber;

  @XmlElement(name = "passenger_profile_id", namespace = "")
  private String passengerProfileId;

  @XmlElement(name = "client_profile_id", namespace = "")
  private String clientProfileId;

  @XmlElement(name = "nationality_rcd", namespace = "")
  private String nationalityRcd;

  @XmlElement(name = "reservation_fee_amount", namespace = "")
  private Double reservationFeeAmount;

  @XmlElement(name = "commission_amount", namespace = "")
  private Double commissionAmount;

  @XmlElement(name = "fare_vat", namespace = "")
  private Double fareVat;

  @XmlElement(name = "tax_vat", namespace = "")
  private Double taxVat;

  @XmlElement(name = "yq_vat", namespace = "")
  private Double yqVat;

  @XmlElement(name = "ticketing_fee_vat", namespace = "")
  private Double ticketingFeeVat;

  @XmlElement(name = "reservation_fee_at", namespace = "")
  private Double reservationFeeAt;

  @XmlElement(name = "reservation_fee_vat", namespace = "")
  private Double fareAmountIncl;

  @XmlElement(name = "tax_amount_incl", namespace = "")
  private Double taxAmountIncl;

  @XmlElement(name = "yq_amount_incl", namespace = "")
  private Double yqAmountIncl;

  @XmlElement(name = "public_fare_amount_incl", namespace = "")
  private Double publicFareAmountIncl;

  @XmlElement(name = "public_fare_amount", namespace = "")
  private Double publicFareAmount;

  @XmlElement(name = "commission_amount_incl", namespace = "")
  private Double commissionAmountIncl;

  @XmlElement(name = "commission_percentage", namespace = "")
  private Double commissionPercentage;

  @XmlElement(name = "ticketing_fee_amount_incl", namespace = "")
  private Double ticketingFeeAmountIncl;

  @XmlElement(name = "reservation_fee_amount_incl", namespace = "")
  private Double reservationFeeAmountIncl;

  @XmlElement(name = "acct_net_total", namespace = "")
  private Double acctNetTotal;

  @XmlElement(name = "acct_tax_amount", namespace = "")
  private Double acctTaxAmount;

  @XmlElement(name = "acct_fare_amount", namespace = "")
  private Double acctFareAmount;

  @XmlElement(name = "acct_yq_amount", namespace = "")
  private Double acctYqAmount;

  @XmlElement(name = "acct_ticketing_fee_amount", namespace = "")
  private String acctTicketingFeeAmount;

  @XmlElement(name = "acct_reservation_fee_amount", namespace = "")
  private Double acctReservationFeeAmount;

  @XmlElement(name = "acct_commission_amount", namespace = "")
  private Double acctCommissionAmount;

  @XmlElement(name = "acct_fare_amount_incl", namespace = "")
  private Double acctFareAmountIncl;

  @XmlElement(name = "acct_tax_amount_incl", namespace = "")
  private Double acctTaxAmountIncl;

  @XmlElement(name = "acct_yq_amount_incl", namespace = "")
  private Double acctYqAmountIncl;

  @XmlElement(name = "acct_commission_amount_incl", namespace = "")
  private Double acctCommissionAmountIncl;

  @XmlElement(name = "acct_ticketing_fee_amount_incl", namespace = "")
  private Double acctTicketingFeeAmountIncl;

  @XmlElement(name = "acct_reservation_fee_amount_incl", namespace = "")
  private Double acctReservationFeeAmountIncl;

  @XmlElement(name = "fare_code", namespace = "")
  private String fareCode;

  @XmlElement(name = "fare_date_time", namespace = "")
  private String fareDateTime;

  @XmlElement(name = "e_ticket_flag", namespace = "")
  private String eTicketFlag;

  @XmlElement(name = "standby_flag", namespace = "")
  private String standbyFlag;

  @XmlElement(name = "transferable_fare_flag", namespace = "")
  private String transferableFareFlag;

  @XmlElement(name = "ticket_number", namespace = "")
  private String ticketNumber;

  @XmlElement(name = "ticketing_date_time", namespace = "")
  private String ticketingDateTime;

  @XmlElement(name = "ticketing_by", namespace = "")
  private String ticketingBy;

  @XmlElement(name = "check_in_sequence", namespace = "")
  private String checkInSequence;

  @XmlElement(name = "group_sequence", namespace = "")
  private String groupSequence;

  @XmlElement(name = "unload_by", namespace = "")
  private String unloadBy;

  @XmlElement(name = "unload_date_time", namespace = "")
  private String unloadDateTime;

  @XmlElement(name = "number_of_pieces", namespace = "")
  private String numberOfPieces;

  @XmlElement(name = "baggage_weight", namespace = "")
  private String baggageWeight;

  @XmlElement(name = "excess_baggage_weight", namespace = "")
  private String excessBaggageWeight;

  @XmlElement(name = "check_in_baggage_weight", namespace = "")
  private String checkInBaggageWeight;

  @XmlElement(name = "check_in_by", namespace = "")
  private String checkInBy;

  @XmlElement(name = "cancel_by", namespace = "")
  private String cancelBy;

  @XmlElement(name = "exchanged_date_time", namespace = "")
  private String exchangedDateTime;

  @XmlElement(name = "cancel_date_time", namespace = "")
  private String cancelDateTime;

  @XmlElement(name = "restriction_text", namespace = "")
  private String restrictionText;

  @XmlElement(name = "endorsement_text", namespace = "")
  private String endorsementText;

  @XmlElement(name = "exclude_pricing_flag", namespace = "")
  private String excludePricingFlag;

  @XmlElement(name = "void_date_time", namespace = "")
  private String voidDateTime;

  @XmlElement(name = "refund_charge", namespace = "")
  private String refundCharge;

  @XmlElement(name = "refundable_amount", namespace = "")
  private String refundableAmount;

  @XmlElement(name = "refund_date_time", namespace = "")
  private String refundSateTime;

  @XmlElement(name = "payment_amount", namespace = "")
  private String paymentAmount;

  @XmlElement(name = "MappingSort", namespace = "")
  private String MappingSort;

  @XmlElement(name = "check_in_date_time", namespace = "")
  private String checkInDateTime;

  @XmlElement(name = "onward_departure_date", namespace = "")
  private String onwardDepartureDate;

  @XmlElement(name = "hand_luggage_flag", namespace = "")
  private String handLuggageFlag;

  @XmlElement(name = "hand_number_of_pieces", namespace = "")
  private String handNumberOfPieces;

  @XmlElement(name = "hand_baggage_weight", namespace = "")
  private String handBaggageWeight;

  @XmlElement(name = "free_seating_flag", namespace = "")
  private String freeSeatingFlag;

  @XmlElement(name = "fare_type_rcd", namespace = "")
  private String fareTypeRcd;

  @XmlElement(name = "redemption_points", namespace = "")
  private String redemptionPoints;

  @XmlElement(name = "seat_fee_rcd", namespace = "")
  private String seatFeeRcd;

  @XmlElement(name = "refund_with_charge_hours", namespace = "")
  private String refundWithChargeHours;

  @XmlElement(name = "refund_not_possible_hours", namespace = "")
  private String refundNotPossibleHours;

  @XmlElement(name = "duty_travel_flag", namespace = "")
  private String dutyTravelFlag;

  @XmlElement(name = "not_valid_after_date", namespace = "")
  private String notValidAfterDate;

  @XmlElement(name = "not_valid_before_date", namespace = "")
  private String notValidBeforeDate;

  @XmlElement(name = "advanced_seating_flag", namespace = "")
  private String advancedSeatingFlag;

  @XmlElement(name = "fare_column", namespace = "")
  private String fareColumn;

  @XmlElement(name = "boarding_time", namespace = "")
  private String pieceAllowance;

  @XmlElement(name = "", namespace = "")
  private String boardingTime;

  @XmlElement(name = "it_fare_flag", namespace = "")
  private String itFareFlag;

  @XmlElement(name = "currency_rcd", namespace = "")
  private String currencyRcd;

  @XmlElement(name = "create_date_time", namespace = "")
  private String createDateTime;

  @XmlElement(name = "update_date_time", namespace = "")
  private String updateDateTime;

  @XmlElement(name = "create_by", namespace = "")
  private String createBy;

  @XmlElement(name = "update_by", namespace = "")
  private String updateBy;

  @XmlElement(name = "destination_rcd", namespace = "")
  private String destinationRcd;

  @XmlElement(name = "origin_rcd", namespace = "")
  private String originRcd;

  @XmlElement(name = "ticketing_fee_amount", namespace = "")
  private double ticketingFeeAmount;

  @XmlElement(name = "base_ticketing_fee_amount", namespace = "")
  private double baseTicketingFeeAmount;

  @XmlElement(name = "yq_amount", namespace = "")
  private double yqAmount;

  @XmlElement(name = "fare_amount", namespace = "")
  private double fareAmount;

  @XmlElement(name = "od_origin_rcd", namespace = "")
  private String odOriginRcd;

  @XmlElement(name = "flight_id", namespace = "")
  private String flightId;

  @XmlElement(name = "exchanged_segment_id", namespace = "")
  private String exchangedSegmentId;

  @XmlElement(name = "airline_rcd", namespace = "")
  private String airlineRcd;

  @XmlElement(name = "flight_number", namespace = "")
  private String flightNumber;

  @XmlElement(name = "refundable_flag", namespace = "")
  private Integer refundableFlag;

  @XmlElement(name = "group_flag", namespace = "")
  private Integer groupFlag;

  @XmlElement(name = "non_revenue_flag", namespace = "")
  private Integer nonRevenueFlag;

  @XmlElement(name = "eticket_flag", namespace = "")
  private Integer eticketFlag;

  @XmlElement(name = "departure_date", namespace = "")
  private String departureDate;

  @XmlElement(name = "od_destination_rcd", namespace = "")
  private String odDestinationRcd;

  @XmlElement(name = "flight_connection_id", namespace = "")
  private String flightConnectionId;

  @XmlElement(name = "departure_time", namespace = "")
  private String departureTime;

  @XmlElement(name = "fare_id", namespace = "")
  private String fareId;

  @XmlElement(name = "booking_class_rcd", namespace = "")
  private String bookingClassRcd;

  @XmlElement(name = "boarding_class_rcd", namespace = "")
  private String boardingClassRcd;

  @XmlElement(name = "booking_id", namespace = "")
  private String bookingId;

  @XmlElement(name = "booking_segment_id", namespace = "")
  private String bookingSegmentId;

  @XmlElement(name = "passenger_id", namespace = "")
  private String passengerId;

  @XmlElement(name = "passenger_type_rcd", namespace = "")
  private String passengerTypeRcd;

  @XmlElement(name = "date_of_birth", namespace = "")
  private String dateOfBirth;

  @XmlElement(name = "passenger_status_rcd", namespace = "")
  private String passengerStatusRcd;

  @XmlElement(name = "contact_email", namespace = "")
  private String contactEmail;

  @XmlElement(name = "inventory_class_rcd", namespace = "")
  private Character inventoryClassRcd;

  @XmlElement(name = "seat_number", namespace = "")
  private String seatNumber;

  @XmlElement(name = "seat_row", namespace = "")
  private String seatRow;

  @XmlElement(name = "seat_column", namespace = "")
  private String seatColumn;

  @XmlElement(name = "net_total", namespace = "")
  private double netTotal;

}
