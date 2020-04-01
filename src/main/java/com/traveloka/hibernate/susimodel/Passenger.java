package com.traveloka.hibernate.susimodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for BasePassengerProfileMessage complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BasePassengerProfileMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="document_type_rcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title_rcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Middlename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language_rcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality_rcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger_weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender_type_rcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger_type_rcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passport_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passport_issue_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passport_expiry_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passport_issue_place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passport_birth_place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date_of_birth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passport_issue_country_rcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employee_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wheelchair_flag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="vip_flag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="member_level_rcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="member_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="window_seat_flag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="redress_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passenger_role_rcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Passenger", namespace = "")
public class Passenger {

  @XmlElement(name = "document_type_rcd", namespace = "")
  protected String documentTypeRcd;
  @XmlElement(name = "title_rcd", namespace = "")
  protected String titleRcd;
  @XmlElement(name = "Lastname", namespace = "")
  protected String lastname;
  @XmlElement(name = "Firstname", namespace = "")
  protected String firstname;
  @XmlElement(name = "Middlename", namespace = "")
  protected String middlename;
  @XmlElement(name = "language_rcd", namespace = "")
  protected String languageRcd;
  @XmlElement(name = "nationality_rcd", namespace = "")
  protected String nationalityRcd;
  @XmlElement(name = "passenger_weight", namespace = "")
  protected String passengerWeight;
  @XmlElement(name = "gender_type_rcd", namespace = "")
  protected String genderTypeRcd;
  @XmlElement(name = "passenger_type_rcd", namespace = "")
  protected String passengerTypeRcd;
  @XmlElement(name = "passport_number", namespace = "")
  protected String passportNumber;
  @XmlElement(name = "passport_issue_date", namespace = "")
  protected String passportIssueDate;
  @XmlElement(name = "passport_expiry_date", namespace = "")
  protected String passportExpiryDate;
  @XmlElement(name = "passport_issue_place", namespace = "")
  protected String passportIssuePlace;
  @XmlElement(name = "passport_birth_place", namespace = "")
  protected String passportBirthPlace;
  @XmlElement(name = "date_of_birth", namespace = "")
  protected String dateOfBirth;
  @XmlElement(name = "passport_issue_country_rcd", namespace = "")
  protected String passportIssueCountryRcd;
  @XmlElement(name = "employee_number", namespace = "")
  protected String employeeNumber;
  @XmlElement(name = "wheelchair_flag", namespace = "")
  protected boolean wheelchairFlag;
  @XmlElement(name = "vip_flag", namespace = "")
  protected boolean vipFlag;
  @XmlElement(name = "member_level_rcd", namespace = "")
  protected String memberLevelRcd;
  @XmlElement(name = "member_number", namespace = "")
  protected String memberNumber;
  @XmlElement(name = "window_seat_flag", namespace = "")
  protected boolean windowSeatFlag;
  @XmlElement(name = "redress_number", namespace = "")
  protected String redressNumber;
  @XmlElement(name = "passenger_role_rcd", namespace = "")
  protected String passengerRoleRcd;

  @XmlElement(name = "client_profile_id", namespace = "")
  protected String clientProfileId;
  @XmlElement(name = "client_number", namespace = "")
  protected String clientNumber;
  @XmlElement(name = "address_line1", namespace = "")
  protected String addressLine1;
  @XmlElement(name = "address_line2", namespace = "")
  protected String addressLine2;
  @XmlElement(name = "state", namespace = "")
  protected String state;
  @XmlElement(name = "district", namespace = "")
  protected String district;
  @XmlElement(name = "province", namespace = "")
  protected String province;
  @XmlElement(name = "zip_code", namespace = "")
  protected String zipCode;
  @XmlElement(name = "po_box", namespace = "")
  protected String poBox;
  @XmlElement(name = "country_rcd", namespace = "")
  protected String countryRcd;
  @XmlElement(name = "street", namespace = "")
  protected String street;
  @XmlElement(name = "city", namespace = "")
  protected String city;
  @XmlElement(name = "document_number", namespace = "")
  protected String documentNumber;
  @XmlElement(name = "residence_country_rcd", namespace = "")
  protected String residenceCountryRcd;
  @XmlElement(name = "contact_name", namespace = "")
  protected String contactName;
  @XmlElement(name = "contact_email", namespace = "")
  protected String contactEmail;
  @XmlElement(name = "phone_mobile", namespace = "")
  protected String phoneMobile;
  @XmlElement(name = "phone_home", namespace = "")
  protected String phoneHome;
  @XmlElement(name = "phone_fax", namespace = "")
  protected String phoneFax;
  @XmlElement(name = "phone_business", namespace = "")
  protected String phoneBusiness;
  @XmlElement(name = "received_from", namespace = "")
  protected String receivedFrom;
  @XmlElement(name = "create_date_time", namespace = "")
  protected String createDateTime;
  @XmlElement(name = "update_by", namespace = "")
  protected String updateBy;
  @XmlElement(name = "update_date_time", namespace = "")
  protected String updateDateTime;
  @XmlElement(name = "passenger_id", namespace = "")
  protected String passengerId;
  @XmlElement(name = "booking_id", namespace = "")
  protected String bookingId;
  @XmlElement(name = "passenger_profile_id", namespace = "")
  protected String passengerProfileId;
}
