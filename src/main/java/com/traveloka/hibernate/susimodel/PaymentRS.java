package com.traveloka.hibernate.susimodel;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Payment", namespace = "")
public class PaymentRS {

  @XmlElement(name = "form_of_payment", namespace = "")
  private String formOfPayment;

  @XmlElement(name = "agency_code", namespace = "")
  private String agencyCode;

  @XmlElement(name = "form_of_payment_subtype", namespace = "")
  private String formOfPaymentSubtype;

  @XmlElement(name = "payment_date_time", namespace = "")
  private String paymentDateTime;

  @XmlElement(name = "document_amount", namespace = "")
  private String documentAmount;

  @XmlElement(name = "update_name", namespace = "")
  private String updateName;

  @XmlElement(name = "booking_id", namespace = "")
  private String bookingId;

  @XmlElement(name = "create_by", namespace = "")
  private String createBy;

  @XmlElement(name = "expiry_month", namespace = "")
  private String expiryMonth;

  @XmlElement(name = "payment_by", namespace = "")
  private String paymentBy;

  @XmlElement(name = "create_date_time", namespace = "")
  private String createDateTime;

  @XmlElement(name = "issue_date", namespace = "")
  private String issueDate;

  @XmlElement(name = "currency_rcd", namespace = "")
  private String currencyRcd;

  @XmlElement(name = "acct_payment_amount", namespace = "")
  private String acctPaymentAmount;

  @XmlElement(name = "payment_number", namespace = "")
  private String paymentNumber;

  @XmlElement(name = "issue_by", namespace = "")
  private String issueBy;

  @XmlElement(name = "update_by", namespace = "")
  private String updateBy;

  @XmlElement(name = "form_of_payment_rcd", namespace = "")
  private String formOfPaymentRcd;

  @XmlElement(name = "void_by", namespace = "")
  private String voidBy;

  @XmlElement(name = "update_date_time", namespace = "")
  private String updateDateTime;

  @XmlElement(name = "debit_agency_code", namespace = "")
  private String debitAgencyCode;

  @XmlElement(name = "approval_code", namespace = "")
  private String approvalCode;

  @XmlElement(name = "document_number", namespace = "")
  private String documentNumber;

  @XmlElement(name = "form_of_payment_subtype_rcd", namespace = "")
  private String formOfPaymentSubtypeRcd;

  @XmlElement(name = "booking_payment_id", namespace = "")
  private String bookingPaymentId;

  @XmlElement(name = "payment_amount", namespace = "")
  private String paymentAmount;

  @XmlElement(name = "booking_reference", namespace = "")
  private String bookingReference;

  @XmlElement(name = "payment_reference", namespace = "")
  private String paymentReference;

  @XmlElement(name = "due_date_flag", namespace = "")
  private String dueDateFlag;

  @XmlElement(name = "payment_due_date_time", namespace = "")
  private String paymentDueDateTime;

  @XmlElement(name = "expiry_year", namespace = "")
  private String expiryYear;

  @XmlElement(name = "ticket_booking_id", namespace = "")
  private String ticketBookingId;

  @XmlElement(name = "payment_remark", namespace = "")
  private String paymentRemark;

  @XmlElement(name = "fee_amount", namespace = "")
  private String feeAmount;

  @XmlElement(name = "void_name", namespace = "")
  private String voidName;

  @XmlElement(name = "void_date_time", namespace = "")
  private String voidDateTime;

  @XmlElement(name = "name_on_card", namespace = "")
  private String nameOnCard;

  @XmlElement(name = "create_name", namespace = "")
  private String createName;

}
