package com.traveloka.hibernate.susimodel;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BookingHeader", namespace = "")
public class BookingHeaderRS {

  @XmlElement(name = "own_agency_flag", namespace = "")
  protected Integer ownAgencyFlag;

  @XmlElement(name = "booking_id", namespace = "")
  protected String bookingId;

  @XmlElement(name = "currency_rcd", namespace = "")
  private String currencyRcd;

  @XmlElement(name = "client_profile_id", namespace = "")
  private String clientProfileId;

  @XmlElement(name = "booking_number", namespace = "")
  private String bookingNumber;

  @XmlElement(name = "record_locator", namespace = "")
  private String recordLocator;

  @XmlElement(name = "number_of_adults", namespace = "")
  private String numberOfAdults;

  @XmlElement(name = "number_of_children", namespace = "")
  private String numberOfChildren;

  @XmlElement(name = "number_of_infants", namespace = "")
  private String numberOfInfants;

  @XmlElement(name = "language_rcd", namespace = "")
  private String languageRcd;

  @XmlElement(name = "agency_code", namespace = "")
  private String agencyCode;

  @XmlElement(name = "contact_name", namespace = "")
  private String contactName;

  @XmlElement(name = "contact_email", namespace = "")
  private String contactEmail;

  @XmlElement(name = "phone_mobile", namespace = "")
  private String phoneMobile;

  @XmlElement(name = "phone_home", namespace = "")
  private String phoneHome;

  @XmlElement(name = "phone_business", namespace = "")
  private String phoneBusiness;

  @XmlElement(name = "received_from", namespace = "")
  private String receivedFrom;

  @XmlElement(name = "phone_fax", namespace = "")
  private String phoneFax;

  @XmlElement(name = "phone_search", namespace = "")
  private String phoneSearch;

  @XmlElement(name = "comment", namespace = "")
  private String comment;

  @XmlElement(name = "notify_by_email_flag", namespace = "")
  private String notifyByEmailFlag;

  @XmlElement(name = "notify_by_sms_flag", namespace = "")
  private String notifyBySmsFlag;

  @XmlElement(name = "groupName", namespace = "")
  private String groupName;

  @XmlElement(name = "group_booking_flag", namespace = "")
  private String groupBookingFlag;

  @XmlElement(name = "agency_name", namespace = "")
  private String agencyName;

  @XmlElement(name = "web_agency_flag", namespace = "")
  private String webAgencyFlag;

  @XmlElement(name = "client_number", namespace = "")
  private String clientNumber;

  @XmlElement(name = "lastname", namespace = "")
  private String lastname;

  @XmlElement(name = "firstname", namespace = "")
  private String firstname;

  @XmlElement(name = "city", namespace = "")
  private String city;

  @XmlElement(name = "create_name", namespace = "")
  private String createName;

  @XmlElement(name = "street", namespace = "")
  private String street;

  @XmlElement(name = "lock_date_time", namespace = "")
  private String lockDateTime;

  @XmlElement(name = "middlename", namespace = "")
  private String middlename;

  @XmlElement(name = "address_line1", namespace = "")
  private String addressLine1;

  @XmlElement(name = "address_line2", namespace = "")
  private String addressLine2;

  @XmlElement(name = "state", namespace = "")
  private String state;

  @XmlElement(name = "district", namespace = "")
  private String district;

  @XmlElement(name = "province", namespace = "")
  private String province;

  @XmlElement(name = "zip_code", namespace = "")
  private String zipCode;

  @XmlElement(name = "po_box", namespace = "")
  private String poBox;

  @XmlElement(name = "country_rcd", namespace = "")
  private String countryRcd;

  @XmlElement(name = "title_rcd", namespace = "")
  private String titleRcd;

  @XmlElement(name = "external_payment_reference", namespace = "")
  private String externalPaymentReference;

  @XmlElement(name = "create_by", namespace = "")
  private String createBy;

  @XmlElement(name = "update_by", namespace = "")
  private String updateBy;

  @XmlElement(name = "create_date_time", namespace = "")
  private String createDateTime;

  @XmlElement(name = "update_date_time", namespace = "")
  private String updateDateTime;

  @XmlElement(name = "cost_center", namespace = "")
  private String costCenter;

  @XmlElement(name = "purchase_order", namespace = "")
  private String purchaseOrder;

  @XmlElement(name = "project_number", namespace = "")
  private String projectNumber;

  @XmlElement(name = "lock_name", namespace = "")
  private String lockName;

  @XmlElement(name = "ip_address", namespace = "")
  private String ipAddress;

  @XmlElement(name = "approval_flag", namespace = "")
  private String approvalFlag;

  @XmlElement(name = "invoice_receiver", namespace = "")
  private String invoiceReceiver;

  @XmlElement(name = "tax_id", namespace = "")
  private String taxId;

  @XmlElement(name = "newsletter_flag", namespace = "")
  private String newsletterFlag;

  @XmlElement(name = "contact_email_cc", namespace = "")
  private String contactEmailCc;

  @XmlElement(name = "mobile_email", namespace = "")
  private String mobileEmail;

  @XmlElement(name = "vendor_rcd", namespace = "")
  private String vendorRcd;

  @XmlElement(name = "booking_date_time", namespace = "")
  private String bookingDateTime;

  @XmlElement(name = "notify_by_rcd", namespace = "")
  private String notifyByRcd;

  @XmlElement(name = "no_vat_flag", namespace = "")
  private String noVatFlag;

  @XmlElement(name = "company_name", namespace = "")
  private String companyName;

  @XmlElement(name = "business_flag", namespace = "")
  private String businessFlag;

  @XmlElement(name = "disable_changes_through_b2c_flag", namespace = "")
  private String disableChangesThroughB2cFlag;

  @XmlElement(name = "ticket_total", namespace = "")
  private double ticketTotal;

  @XmlElement(name = "utc_date_time", namespace = "")
  private String utcDateTime;

  @XmlElement(name = "client_lastname", namespace = "")
  private String clientLastname;

  @XmlElement(name = "client_firstname", namespace = "")
  private String clientFirstname;

  @XmlElement(name = "client_middlename", namespace = "")
  private String clientMiddlename;

  @XmlElement(name = "client_member_number", namespace = "")
  private String clientMemberNumber;

  @XmlElement(name = "client_contact_name", namespace = "")
  private String clientContactName;

  @XmlElement(name = "client_address_line1", namespace = "")
  private String clientAddressLine1;

  @XmlElement(name = "client_address_line2", namespace = "")
  private String clientAddressLine2;

  @XmlElement(name = "client_street", namespace = "")
  private String clientStreet;

  @XmlElement(name = "client_state", namespace = "")
  private String clientState;

  @XmlElement(name = "client_district", namespace = "")
  private String clientDistrict;

  @XmlElement(name = "client_province", namespace = "")
  private String clientProvince;

  @XmlElement(name = "client_city", namespace = "")
  private String clientCity;

  @XmlElement(name = "client_zip_code", namespace = "")
  private String clientZipCode;

  @XmlElement(name = "client_po_box", namespace = "")
  private String clientPoBox;

  @XmlElement(name = "client_country_rcd", namespace = "")
  private String clientCountryRcd;

  @XmlElement(name = "client_title_rcd", namespace = "")
  private String clientTitleRcd;

  @XmlElement(name = "client_company_flag", namespace = "")
  private String clientCompanyFlag;

  @XmlElement(name = "client_number_of_children", namespace = "")
  private String clientNumberOfChildren;

  @XmlElement(name = "client_phone_home", namespace = "")
  private String clientPhoneHome;

  @XmlElement(name = "client_phone_business", namespace = "")
  private String clientPhoneBusiness;

  @XmlElement(name = "client_phone_mobile", namespace = "")
  private String clientPhoneMobile;

  @XmlElement(name = "client_phone_fax", namespace = "")
  private String clientPhoneFax;

  @XmlElement(name = "client_contact_email", namespace = "")
  private String clientContactEmail;

  @XmlElement(name = "client_language_rcd", namespace = "")
  private String clientLanguageRcd;

  @XmlElement(name = "client_member_since_date", namespace = "")
  private String clientMemberSinceDate;

  @XmlElement(name = "client_member_level_rcd", namespace = "")
  private String clientMemberLevelRcd;

  @XmlElement(name = "update_name", namespace = "")
  private String updateName;

}
