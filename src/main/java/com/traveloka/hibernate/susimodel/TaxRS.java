package com.traveloka.hibernate.susimodel;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Tax", namespace = "")
public class TaxRS {

  @XmlElement(name = "tax_amount", namespace = "")
  private double taxAmount;

  @XmlElement(name = "booking_segment_id", namespace = "")
  private String bookingSegmentId;

  @XmlElement(name = "passenger_id", namespace = "")
  private String passengerId;

  @XmlElement(name = "sales_currency_rcd", namespace = "")
  private String salesCurrencyRcd;

  @XmlElement(name = "update_name", namespace = "")
  private String updateName;

  @XmlElement(name = "booking_id", namespace = "")
  private String bookingId;

  @XmlElement(name = "create_by", namespace = "")
  private String createBy;

  @XmlElement(name = "create_date_time", namespace = "")
  private String createDateTime;

  @XmlElement(name = "acct_amount_incl", namespace = "")
  private double acctAmountIncl;

  @XmlElement(name = "sales_amount_incl", namespace = "")
  private double salesAmountIncl;

  @XmlElement(name = "tax_amount_incl", namespace = "")
  private double taxAmountIncl;

  @XmlElement(name = "update_by", namespace = "")
  private String updateBy;

  @XmlElement(name = "void_by", namespace = "")
  private String voidBy;

  @XmlElement(name = "update_date_time", namespace = "")
  private String updateDateTime;

  @XmlElement(name = "tax_rcd", namespace = "")
  private String taxRcd;

  @XmlElement(name = "accounting_add_batch", namespace = "")
  private String accountingAddBatch;

  @XmlElement(name = "agency_amount", namespace = "")
  private double agencyAmount;

  @XmlElement(name = "sales_amount", namespace = "")
  private double salesAmount;

  @XmlElement(name = "display_name", namespace = "")
  private String displayName;

  @XmlElement(name = "tax_id", namespace = "")
  private String taxId;

  @XmlElement(name = "passenger_segment_tax_id", namespace = "")
  private String passengerSegmentTaxId;

  @XmlElement(name = "accounting_void_batch", namespace = "")
  private String accountingVoidBatch;

  @XmlElement(name = "void_name", namespace = "")
  private String voidName;

  @XmlElement(name = "void_date_time", namespace = "")
  private String voidDateTime;

  @XmlElement(name = "agency_amount_incl", namespace = "")
  private double agencyAmountIncl;

  @XmlElement(name = "vat_percentage", namespace = "")
  private double vatPercentage;

  @XmlElement(name = "tax_currency_rcd", namespace = "")
  private String taxCurrencyRcd;

  @XmlElement(name = "acct_amount", namespace = "")
  private double acctAmount;

  @XmlElement(name = "summarize_up", namespace = "")
  private String summarizeUp;

  @XmlElement(name = "coverage_type", namespace = "")
  private String coverageType;

  @XmlElement(name = "create_name", namespace = "")
  private String createName;

  @XmlElement(name = "passenger_type_rcd", namespace = "")
  private String passengerTypeRcd;
}
