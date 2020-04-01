package com.traveloka.hibernate.susimodel;


import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OD", namespace = "")
public class OdRS {

  @XmlElement(name = "tax_amount", namespace = "")
  private Double taxAmount;

  @XmlElement(name = "booking_segment_id", namespace = "")
  private String bookingSegmentId;

  @XmlElement(name = "charge_type", namespace = "")
  private String chargeType;

  @XmlElement(name = "passenger_type_rcd", namespace = "")
  private String passengerTypeRcd;

  @XmlElement(name = "redemption_points", namespace = "")
  private Double redemptionPoints;

  @XmlElement(name = "charge_amount_incl", namespace = "")
  private Double chargeAmountIncl;

  @XmlElement(name = "flight_number", namespace = "")
  private String flightNumber;

  @XmlElement(name = "departure_date", namespace = "")
  private String departureDate;

  @XmlElement(name = "passenger_count", namespace = "")
  private Integer passengerCount;

  @XmlElement(name = "origin_rcd", namespace = "")
  private String originRcd;

  @XmlElement(name = "airline_rcd", namespace = "")
  private String airlineRcd;

  @XmlElement(name = "charge_name", namespace = "")
  private String chargeName;

  @XmlElement(name = "destination_rcd", namespace = "")
  private String destinationRcd;

  @XmlElement(name = "currency_rcd", namespace = "")
  private String currencyRcd;

  @XmlElement(name = "total_amount", namespace = "")
  private Double totalAmount;

  @XmlElement(name = "sort_sequence", namespace = "")
  private String sortSequence;

  @XmlElement(name = "charge_amount", namespace = "")
  private Double chargeAmount;

  @XmlElement(name = "create_by", namespace = "")
  private String createBy;

  @XmlElement(name = "update_by", namespace = "")
  private String updateBy;

  @XmlElement(name = "create_date_time", namespace = "")
  private String createDateTime;

  @XmlElement(name = "update_date_time", namespace = "")
  private String updateDateTime;

}


