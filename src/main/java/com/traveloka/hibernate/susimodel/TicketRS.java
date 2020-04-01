package com.traveloka.hibernate.susimodel;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Ticket", namespace = "")
public class TicketRS {
  @XmlElement(name = "booking_segment_id", namespace = "")
  private String bookingSegmentId;

  @XmlElement(name = "acct_yq_amount", namespace = "")
  private String acctYqAmount;

  @XmlElement(name = "ticketing_by", namespace = "")
  private String ticketingBy;

  @XmlElement(name = "agency_code", namespace = "")
  private String agencyCode;

  @XmlElement(name = "excess_baggage_weight", namespace = "")
  private String excessBaggageWeight;

  @XmlElement(name = "refund_agency_code", namespace = "")
  private String refundAgencyCode;

  @XmlElement(name = "origin_rcd", namespace = "")
  private String originRcd;

  @XmlElement(name = "bsp_year", namespace = "")
  private String bspYear;

  @XmlElement(name = "coupon_number", namespace = "")
  private String couponNumber;

  @XmlElement(name = "inventory_class_rcd", namespace = "")
  private String inventoryClassRcd;

  @XmlElement(name = "gender_type_rcd", namespace = "")
  private String genderTypeRcd;

  @XmlElement(name = "piece_allowance", namespace = "")
  private String pieceAllowance;

  @XmlElement(name = "fim_flag", namespace = "")
  private String fimFlag;

  @XmlElement(name = "fee_baggage_count", namespace = "")
  private String feeBaggageCount;

  @XmlElement(name = "check_in_by", namespace = "")
  private String checkInBy;

  @XmlElement(name = "ticketing_fee_amount_incl", namespace = "")
  private Double ticketingFeeAmountIncl;

  @XmlElement(name = "exchanged_segment_id", namespace = "")
  private String exchangedSegmentId;

  @XmlElement(name = "not_valid_before_date", namespace = "")
  private String notValidBeforeDate;

  @XmlElement(name = "present_flag", namespace = "")
  private String presentFlag;

  @XmlElement(name = "standby_flag", namespace = "")
  private String standbyFlag;

  @XmlElement(name = "bsp_checked_flag", namespace = "")
  private String bspCheckedFlag;

  @XmlElement(name = "unload_date_time", namespace = "")
  private String unloadDateTime;

  @XmlElement(name = "baggage_count_fee_rcd", namespace = "")
  private String baggageCountFeeRcd;

  @XmlElement(name = "advanced_seating_flag", namespace = "")
  private String advancedSeatingFlag;

  @XmlElement(name = "group_name", namespace = "")
  private String groupName;

  @XmlElement(name = "not_valid_after_date", namespace = "")
  private String notValidAfterDate;

  @XmlElement(name = "fare_date_time", namespace = "")
  private String fareDateTime;

  @XmlElement(name = "acct_refundable_amount", namespace = "")
  private String acctRefundableAmount;

  @XmlElement(name = "baggage_weight", namespace = "")
  private String baggageWeight;

  @XmlElement(name = "payment_amount", namespace = "")
  private Double paymentAmount;

  @XmlElement(name = "boarded_class_rcd", namespace = "")
  private String boardedClassRcd;

  @XmlElement(name = "boarding_class_rcd", namespace = "")
  private String boardingClassRcd;

  @XmlElement(name = "exchanged_date_time", namespace = "")
  private String exchangedDateTime;

  @XmlElement(name = "flight_id", namespace = "")
  private String flightId;

  @XmlElement(name = "lastname", namespace = "")
  private String lastname;

  @XmlElement(name = "refundable_flag", namespace = "")
  private String refundableFlag;

  @XmlElement(name = "onward_flight_number", namespace = "")
  private String onwardFlightNumber;

  @XmlElement(name = "destination_sequence", namespace = "")
  private String destinationSequence;

  @XmlElement(name = "base_ticketing_fee_amount", namespace = "")
  private Double baseTicketingFeeAmount;

  @XmlElement(name = "refundable_amount", namespace = "")
  private Double refundableAmount;

  @XmlElement(name = "tax_vat", namespace = "")
  private String taxVat;

  @XmlElement(name = "fare_amount_incl", namespace = "")
  private Double fareAmountIncl;

  @XmlElement(name = "check_in_baggage_weight", namespace = "")
  private String checkInBaggageWeight;

  @XmlElement(name = "public_fare_amount_incl", namespace = "")
  private Double publicFareAmountIncl;

  @XmlElement(name = "acct_tax_amount_incl", namespace = "")
  private Double acctTaxAmountIncl;

  @XmlElement(name = "booking_class_rcd", namespace = "")
  private String bookingClassRcd;

  @XmlElement(name = "onward_airline_rcd", namespace = "")
  private String onwardAirlineRcd;

  @XmlElement(name = "passenger_type_rcd", namespace = "")
  private String passengerTypeRcd;

  @XmlElement(name = "date_of_birth", namespace = "")
  private String dateOfBirth;

  @XmlElement(name = "prorate_sales_fare_amount", namespace = "")
  private String prorateSalesFareAmount;

  @XmlElement(name = "check_in_date_time", namespace = "")
  private String checkInDateTime;

  @XmlElement(name = "yq_amount_incl", namespace = "")
  private Double yqAmountIncl;

  @XmlElement(name = "yq_amount_incl", namespace = "")
  private String refundNotPossibleHours;

  @XmlElement(name = "acct_yq_amount_incl", namespace = "")
  private String acctYqAmountIncl;

  @XmlElement(name = "check_in_comment", namespace = "")
  private String checkInComment;

  @XmlElement(name = "ticketing_date_time", namespace = "")
  private String ticketingDateTime;

  @XmlElement(name = "create_date_time", namespace = "")
  private String createDateTime;

  @XmlElement(name = "phone_home", namespace = "")
  private String phoneHome;

  @XmlElement(name = "destination_rcd", namespace = "")
  private String destinationRcd;

  @XmlElement(name = "title_rcd", namespace = "")
  private String titleRcd;

  @XmlElement(name = "it_fare_flag", namespace = "")
  private String itFareFlag;

  @XmlElement(name = "cancel_by", namespace = "")
  private String cancelBy;

  @XmlElement(name = "update_by", namespace = "")
  private String updateBy;

  @XmlElement(name = "yq_vat", namespace = "")
  private String yqVat;

  @XmlElement(name = "approval_flag", namespace = "")
  private String approvalFlag;

  @XmlElement(name = "acct_reservation_fee_amount_incl", namespace = "")
  private String acctReservationFeeAmountIncl;

  @XmlElement(name = "flight_connection_id", namespace = "")
  private String flightConnectionId;

  @XmlElement(name = "exclude_pricing_flag", namespace = "")
  private String excludePricingFlag;

  @XmlElement(name = "contact_name", namespace = "")
  private String contactName;

  @XmlElement(name = "through_fare_flag", namespace = "")
  private String throughFareFlag;

  @XmlElement(name = "phone_fax", namespace = "")
  private String phoneFax;

  @XmlElement(name = "day_of_year", namespace = "")
  private String dayOfYear;

  @XmlElement(name = "net_total", namespace = "")
  private String netTotal;

  @XmlElement(name = "refund_with_charge_hours", namespace = "")
  private String refundWithChargeHours;

  @XmlElement(name = "public_fare_amount", namespace = "")
  private Double publicFareAmount;

  @XmlElement(name = "refund_date_time", namespace = "")
  private String refundDateTime;

  @XmlElement(name = "tour_operator_locator", namespace = "")
  private String tourOperatorLocator;

  @XmlElement(name = "bsp_period", namespace = "")
  private String bspPeriod;

  @XmlElement(name = "fare_column", namespace = "")
  private String fareColumn;

  @XmlElement(name = "acct_net_total", namespace = "")
  private Double acctNetTotal;

  @XmlElement(name = "void_date_time", namespace = "")
  private String voidDateTime;

  @XmlElement(name = "fare_id", namespace = "")
  private String fareId;

  @XmlElement(name = "adm_raised_flag", namespace = "")
  private String admRaisedFlag;

  @XmlElement(name = "fare_quote_amount", namespace = "")
  private Double fareQuoteAmount;

  @XmlElement(name = "create_name", namespace = "")
  private String createName;

  @XmlElement(name = "baggage_weight_fee_rcd", namespace = "")
  private String baggageWeightFeeRcd;

  @XmlElement(name = "tax_amount", namespace = "")
  private Double taxAmount;

  @XmlElement(name = "reservation_fee_amount", namespace = "")
  private Double reservationFeeAmount;

  @XmlElement(name = "fare_code", namespace = "")
  private String fareCode;

  @XmlElement(name = "onward_booking_class_rcd", namespace = "")
  private String onwardBookingClassRcd;

  @XmlElement(name = "redemption_points", namespace = "")
  private String unavailableFlag;

  @XmlElement(name = "", namespace = "")
  private String redemptionPoints;

  @XmlElement(name = "group_count", namespace = "")
  private String groupCount;

  @XmlElement(name = "fare_line", namespace = "")
  private String fareLine;

  @XmlElement(name = "passenger_id", namespace = "")
  private String passengerId;

  @XmlElement(name = "departure_date", namespace = "")
  private String departureDate;

  @XmlElement(name = "fare_note", namespace = "")
  private String fareNote;

  @XmlElement(name = "record_locator_display", namespace = "")
  private String recordLocatorDisplay;

  @XmlElement(name = "acct_commission_amount", namespace = "")
  private String acctCommissionAmount;

  @XmlElement(name = "seat_column", namespace = "")
  private String seatColumn;

  @XmlElement(name = "od_destination_rcd", namespace = "")
  private String odDestinationRcd;

  @XmlElement(name = "group_baggage_weight", namespace = "")
  private String groupBaggageWeight;

  @XmlElement(name = "acct_ticketing_fee_amount", namespace = "")
  private String acctTicketingFeeAmount;

  @XmlElement(name = "boarding_pass_number", namespace = "")
  private String boardingPassNumber;

  @XmlElement(name = "update_name", namespace = "")
  private String updateName;

  @XmlElement(name = "accounting_refund_batch", namespace = "")
  private String accountingRefundBatch;

  @XmlElement(name = "unload_by", namespace = "")
  private String unloadBy;

  @XmlElement(name = "refund_by", namespace = "")
  private String refundBy;

  @XmlElement(name = "number_of_pieces", namespace = "")
  private String numberOfPieces;

  @XmlElement(name = "unload_comment", namespace = "")
  private String unloadComment;

  @XmlElement(name = "refund_charge", namespace = "")
  private String refundCharge;

  @XmlElement(name = "group_sequence", namespace = "")
  private String groupSequence;

  @XmlElement(name = "departure_time", namespace = "")
  private String departureTime;

  @XmlElement(name = "void_by", namespace = "")
  private String voidBy;

  @XmlElement(name = "fare_vat", namespace = "")
  private String fareVat;

  @XmlElement(name = "acct_reservation_fee_amount", namespace = "")
  private Double acctReservationFeeAmount;

  @XmlElement(name = "document_number", namespace = "")
  private String documentNumber;

  @XmlElement(name = "check_in_user_code", namespace = "")
  private String checkInUserCode;

  @XmlElement(name = "commission_percentage", namespace = "")
  private String commissionPercentage;

  @XmlElement(name = "e_ticket_status", namespace = "")
  private String eTicketStatus;

  @XmlElement(name = "od_origin_rcd", namespace = "")
  private String odOriginRcd;

  @XmlElement(name = "prorate_acct_yq_amount", namespace = "")
  private Double prorateAcctYqAmount;

  @XmlElement(name = "seat_row", namespace = "")
  private String seatRow;

  @XmlElement(name = "acct_ticketing_fee_amount_incl", namespace = "")
  private Double acctTicketingFeeAmountIncl;

  @XmlElement(name = "fare_description", namespace = "")
  private String fareDescription;

  @XmlElement(name = "seat_number", namespace = "")
  private String seatNumber;

  @XmlElement(name = "reservation_fee_vat", namespace = "")
  private String reservationFeeVat;

  @XmlElement(name = "priority_code", namespace = "")
  private String priorityCode;

  @XmlElement(name = "yq_amount", namespace = "")
  private String yqAmount;

  @XmlElement(name = "cancel_date_time", namespace = "")
  private String cancelDateTime;

  @XmlElement(name = "language_rcd", namespace = "")
  private String languageRcd;

  @XmlElement(name = "tour_code", namespace = "")
  private String tourCode;

  @XmlElement(name = "vendor_rcd", namespace = "")
  private String vendorRcd;

  @XmlElement(name = "", namespace = "")
  private String admDocument;

  @XmlElement(name = "duty_travel_flag", namespace = "")
  private String dutyTravelFlag;

  @XmlElement(name = "changed_baggage_weight", namespace = "")
  private String changedBaggageWeight;

  @XmlElement(name = "check_in_code", namespace = "")
  private String checkInCode;

  @XmlElement(name = "ticketing_fee_amount", namespace = "")
  private Double ticketingFeeAmount;

  @XmlElement(name = "form_of_payment", namespace = "")
  private String formOfPayment;

  @XmlElement(name = "e_ticket_flag", namespace = "")
  private String eTicketFlag;

  @XmlElement(name = "acct_fare_amount", namespace = "")
  private Double acctFareAmount;

  @XmlElement(name = "firstname", namespace = "")
  private String firstname;

  @XmlElement(name = "acct_tax_amount", namespace = "")
  private Double acctTaxAmount;

  @XmlElement(name = "acct_commission_amount_incl", namespace = "")
  private String acctCommissionAmountIncl;

  @XmlElement(name = "fee_baggage_weight_kgs", namespace = "")
  private Double feeBaggageWeightKgs;

  @XmlElement(name = "title", namespace = "")
  private String title;

  @XmlElement(name = "airline_rcd", namespace = "")
  private String airlineRcd;

  @XmlElement(name = "check_in_sequence", namespace = "")
  private String checkInSequence;

  @XmlElement(name = "contact_email", namespace = "")
  private String contactEmail;

  @XmlElement(name = "booking_id", namespace = "")
  private String bookingId;

  @XmlElement(name = "create_by", namespace = "")
  private String createBy;

  @XmlElement(name = "fare_type_rcd", namespace = "")
  private String fareTypeRcd;

  @XmlElement(name = "received_from", namespace = "")
  private String receivedFrom;

  @XmlElement(name = "record_locator", namespace = "")
  private String recordLocator;

  @XmlElement(name = "currency_rcd", namespace = "")
  private String currencyRcd;

  @XmlElement(name = "transferable_fare_flag", namespace = "")
  private String transferableFareFlag;

  @XmlElement(name = "prorate_acct_fare_amount", namespace = "")
  private Double prorateAcctFareAmount;

  @XmlElement(name = "onward_destination_rcd", namespace = "")
  private String onwardDestinationRcd;

  @XmlElement(name = "ticketing_fee_vat", namespace = "")
  private Double ticketingFeeVat;

  @XmlElement(name = "commission_amount_incl", namespace = "")
  private Double commissionAmountincl;

  @XmlElement(name = "tax_amount_incl", namespace = "")
  private Double taxAmountIncl;

  @XmlElement(name = "seat_fee_rcd", namespace = "")
  private String seatFeeRcd;

  @XmlElement(name = "update_date_time", namespace = "")
  private String updateDateTime;

  @XmlElement(name = "phone_business", namespace = "")
  private String phoneBusiness;

  @XmlElement(name = "passenger_check_in_status_rcd", namespace = "")
  private String passengerCheckInStatusRcd;

  @XmlElement(name = "phone_mobile", namespace = "")
  private String phoneMobile;

  @XmlElement(name = "fare_amount", namespace = "")
  private Double fareAmount;

  @XmlElement(name = "bsp_month", namespace = "")
  private String bspMonth;

  @XmlElement(name = "commission_amount", namespace = "")
  private Double commissionAmount;

  @XmlElement(name = "flight_number", namespace = "")
  private String flightNumber;

  @XmlElement(name = "promotion_code", namespace = "")
  private String promotionCode;

  @XmlElement(name = "ticket_number", namespace = "")
  private String ticketNumber;

  @XmlElement(name = "ticket_id", namespace = "")
  private String ticketId;

  @XmlElement(name = "restriction_text", namespace = "")
  private String restrictionText;

  @XmlElement(name = "fee_baggage_weight_lbs", namespace = "")
  private String feeBaggageWeightLbs;

  @XmlElement(name = "reservation_fee_amount_incl", namespace = "")
  private Double reservationFeeAmountIncl;

  @XmlElement(name = "bsp_comment", namespace = "")
  private String bspComment;

  @XmlElement(name = "acct_fare_amount_incl", namespace = "")
  private Double acctFareAmountIncl;

  @XmlElement(name = "prorate_sales_yq_amount", namespace = "")
  private Double prorateSalesYqAmount;

  @XmlElement(name = "origin_sequence", namespace = "")
  private String originSequence;

  @XmlElement(name = "passenger_status_rcd", namespace = "")
  private String passengerStatusRcd;

  @XmlElement(name = "endorsement_text", namespace = "")
  private String endorsementText;

  @XmlElement(name = "onward_departure_date", namespace = "")
  private String onwardDepartureDate;

}
