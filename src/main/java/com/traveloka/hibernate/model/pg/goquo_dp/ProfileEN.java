
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProfileEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileEN">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}PaxLoginsEN">
 *       &lt;sequence>
 *         &lt;element name="ApprovedBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BusinessPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DefaultCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocNationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailVerificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailVerifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ExistingUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpiredDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FFTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreqFlyerNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDCardCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDPath1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDPath2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interests" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAlreadyExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsApproved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEmailVerified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsExpired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsFFPApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsJounior" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsLoayltyMemberChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsLoyaltyUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRegistrationEmailVerified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsStudent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsVIPProfile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsValPassIssDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastUpdateBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoyaltyPoints" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MailingAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailingAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailingAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MealPref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MemberStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MemberTier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewsLetterEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NextExpireMiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextMilesExpireOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PassportCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassportCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassportExpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PassportIssuedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PassportIssuedPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxInfoID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegisteredDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReservationMilesEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SeatPreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeatingPref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryEmailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TierBalancePoints" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalMilesEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalPointsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserLoginId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VerifiedBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VerifiedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "approvedBy",
    "businessPhone",
    "cardStatus",
    "city",
    "companyName",
    "country",
    "countryCode",
    "dateOfBirth",
    "defaultCurrency",
    "docNationality",
    "documentType",
    "emailVerificationCode",
    "emailVerifiedDate",
    "existingUserName",
    "expiredDateTime",
    "ffTypeCode",
    "fax",
    "firstName",
    "freqFlyerNum",
    "gender",
    "homePhone",
    "idCardCountry",
    "idCardNumber",
    "idPath1",
    "idPath2",
    "interests",
    "isAlreadyExists",
    "isApproved",
    "isEmailVerified",
    "isExpired",
    "isFFPApplicable",
    "isJounior",
    "isLoayltyMemberChange",
    "isLoyaltyUser",
    "isRegistrationEmailVerified",
    "isStudent",
    "isVIPProfile",
    "isValPassIssDetails",
    "isVerified",
    "lastUpdateBy",
    "loyaltyPoints",
    "mailingAddress1",
    "mailingAddress2",
    "mailingAddress3",
    "mealPref",
    "memberStatus",
    "memberTier",
    "mobileNo",
    "nationality",
    "newsLetterEnabled",
    "nextExpireMiles",
    "nextMilesExpireOn",
    "passportCountry",
    "passportCountryCode",
    "passportExpDate",
    "passportIssuedDate",
    "passportIssuedPlace",
    "passportNo",
    "paxInfoID",
    "postCode",
    "preferredAddress",
    "preferredLanguage",
    "profileTitle",
    "registeredDate",
    "reservationMilesEarned",
    "seatPreference",
    "seatingPref",
    "secondaryEmailID",
    "state",
    "surName",
    "tierBalancePoints",
    "title",
    "totalMilesEarned",
    "totalPointsEarned",
    "url",
    "userLoginId",
    "verifiedBy",
    "verifiedDateTime"
})
public class ProfileEN
    extends PaxLoginsEN
{

    @XmlElement(name = "ApprovedBy")
    protected Integer approvedBy;
    @XmlElementRef(name = "BusinessPhone", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessPhone;
    @XmlElementRef(name = "CardStatus", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardStatus;
    @XmlElementRef(name = "City", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "CompanyName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyName;
    @XmlElementRef(name = "Country", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "CountryCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryCode;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElementRef(name = "DefaultCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultCurrency;
    @XmlElementRef(name = "DocNationality", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> docNationality;
    @XmlElementRef(name = "DocumentType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentType;
    @XmlElementRef(name = "EmailVerificationCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailVerificationCode;
    @XmlElement(name = "EmailVerifiedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar emailVerifiedDate;
    @XmlElementRef(name = "ExistingUserName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> existingUserName;
    @XmlElement(name = "ExpiredDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiredDateTime;
    @XmlElementRef(name = "FFTypeCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ffTypeCode;
    @XmlElementRef(name = "Fax", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fax;
    @XmlElementRef(name = "FirstName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "FreqFlyerNum", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> freqFlyerNum;
    @XmlElementRef(name = "Gender", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gender;
    @XmlElementRef(name = "HomePhone", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> homePhone;
    @XmlElementRef(name = "IDCardCountry", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idCardCountry;
    @XmlElementRef(name = "IDCardNumber", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idCardNumber;
    @XmlElementRef(name = "IDPath1", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idPath1;
    @XmlElementRef(name = "IDPath2", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idPath2;
    @XmlElementRef(name = "Interests", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interests;
    @XmlElement(name = "IsAlreadyExists")
    protected Boolean isAlreadyExists;
    @XmlElement(name = "IsApproved")
    protected Boolean isApproved;
    @XmlElement(name = "IsEmailVerified")
    protected Boolean isEmailVerified;
    @XmlElement(name = "IsExpired")
    protected Boolean isExpired;
    @XmlElement(name = "IsFFPApplicable")
    protected Boolean isFFPApplicable;
    @XmlElement(name = "IsJounior")
    protected Integer isJounior;
    @XmlElement(name = "IsLoayltyMemberChange")
    protected Boolean isLoayltyMemberChange;
    @XmlElement(name = "IsLoyaltyUser")
    protected Boolean isLoyaltyUser;
    @XmlElement(name = "IsRegistrationEmailVerified")
    protected Boolean isRegistrationEmailVerified;
    @XmlElement(name = "IsStudent")
    protected Boolean isStudent;
    @XmlElement(name = "IsVIPProfile")
    protected Boolean isVIPProfile;
    @XmlElement(name = "IsValPassIssDetails")
    protected Boolean isValPassIssDetails;
    @XmlElement(name = "IsVerified")
    protected Boolean isVerified;
    @XmlElementRef(name = "LastUpdateBy", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateBy;
    @XmlElement(name = "LoyaltyPoints")
    protected Integer loyaltyPoints;
    @XmlElementRef(name = "MailingAddress1", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailingAddress1;
    @XmlElementRef(name = "MailingAddress2", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailingAddress2;
    @XmlElementRef(name = "MailingAddress3", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailingAddress3;
    @XmlElementRef(name = "MealPref", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mealPref;
    @XmlElementRef(name = "MemberStatus", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memberStatus;
    @XmlElementRef(name = "MemberTier", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memberTier;
    @XmlElementRef(name = "MobileNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileNo;
    @XmlElementRef(name = "Nationality", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nationality;
    @XmlElement(name = "NewsLetterEnabled")
    protected Boolean newsLetterEnabled;
    @XmlElementRef(name = "NextExpireMiles", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nextExpireMiles;
    @XmlElement(name = "NextMilesExpireOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextMilesExpireOn;
    @XmlElementRef(name = "PassportCountry", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passportCountry;
    @XmlElementRef(name = "PassportCountryCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passportCountryCode;
    @XmlElement(name = "PassportExpDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passportExpDate;
    @XmlElement(name = "PassportIssuedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passportIssuedDate;
    @XmlElementRef(name = "PassportIssuedPlace", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passportIssuedPlace;
    @XmlElementRef(name = "PassportNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passportNo;
    @XmlElement(name = "PaxInfoID")
    protected Long paxInfoID;
    @XmlElementRef(name = "PostCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postCode;
    @XmlElementRef(name = "PreferredAddress", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredAddress;
    @XmlElementRef(name = "PreferredLanguage", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredLanguage;
    @XmlElementRef(name = "ProfileTitle", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profileTitle;
    @XmlElement(name = "RegisteredDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registeredDate;
    @XmlElement(name = "ReservationMilesEarned")
    protected BigDecimal reservationMilesEarned;
    @XmlElementRef(name = "SeatPreference", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seatPreference;
    @XmlElementRef(name = "SeatingPref", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seatingPref;
    @XmlElementRef(name = "SecondaryEmailID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secondaryEmailID;
    @XmlElementRef(name = "State", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "SurName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surName;
    @XmlElement(name = "TierBalancePoints")
    protected Integer tierBalancePoints;
    @XmlElementRef(name = "Title", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElement(name = "TotalMilesEarned")
    protected BigDecimal totalMilesEarned;
    @XmlElement(name = "TotalPointsEarned")
    protected BigDecimal totalPointsEarned;
    @XmlElementRef(name = "Url", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> url;
    @XmlElement(name = "UserLoginId")
    protected Integer userLoginId;
    @XmlElement(name = "VerifiedBy")
    protected Integer verifiedBy;
    @XmlElement(name = "VerifiedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar verifiedDateTime;

    /**
     * Gets the value of the approvedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApprovedBy() {
        return approvedBy;
    }

    /**
     * Sets the value of the approvedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApprovedBy(Integer value) {
        this.approvedBy = value;
    }

    /**
     * Gets the value of the businessPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessPhone() {
        return businessPhone;
    }

    /**
     * Sets the value of the businessPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessPhone(JAXBElement<String> value) {
        this.businessPhone = value;
    }

    /**
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardStatus(JAXBElement<String> value) {
        this.cardStatus = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyName(JAXBElement<String> value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryCode(JAXBElement<String> value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the defaultCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultCurrency() {
        return defaultCurrency;
    }

    /**
     * Sets the value of the defaultCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultCurrency(JAXBElement<String> value) {
        this.defaultCurrency = value;
    }

    /**
     * Gets the value of the docNationality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocNationality() {
        return docNationality;
    }

    /**
     * Sets the value of the docNationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocNationality(JAXBElement<String> value) {
        this.docNationality = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentType(JAXBElement<String> value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the emailVerificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailVerificationCode() {
        return emailVerificationCode;
    }

    /**
     * Sets the value of the emailVerificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailVerificationCode(JAXBElement<String> value) {
        this.emailVerificationCode = value;
    }

    /**
     * Gets the value of the emailVerifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmailVerifiedDate() {
        return emailVerifiedDate;
    }

    /**
     * Sets the value of the emailVerifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmailVerifiedDate(XMLGregorianCalendar value) {
        this.emailVerifiedDate = value;
    }

    /**
     * Gets the value of the existingUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExistingUserName() {
        return existingUserName;
    }

    /**
     * Sets the value of the existingUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExistingUserName(JAXBElement<String> value) {
        this.existingUserName = value;
    }

    /**
     * Gets the value of the expiredDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiredDateTime() {
        return expiredDateTime;
    }

    /**
     * Sets the value of the expiredDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiredDateTime(XMLGregorianCalendar value) {
        this.expiredDateTime = value;
    }

    /**
     * Gets the value of the ffTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFFTypeCode() {
        return ffTypeCode;
    }

    /**
     * Sets the value of the ffTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFFTypeCode(JAXBElement<String> value) {
        this.ffTypeCode = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFax(JAXBElement<String> value) {
        this.fax = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the freqFlyerNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreqFlyerNum() {
        return freqFlyerNum;
    }

    /**
     * Sets the value of the freqFlyerNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreqFlyerNum(JAXBElement<String> value) {
        this.freqFlyerNum = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGender(JAXBElement<String> value) {
        this.gender = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHomePhone(JAXBElement<String> value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the idCardCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDCardCountry() {
        return idCardCountry;
    }

    /**
     * Sets the value of the idCardCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDCardCountry(JAXBElement<String> value) {
        this.idCardCountry = value;
    }

    /**
     * Gets the value of the idCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDCardNumber() {
        return idCardNumber;
    }

    /**
     * Sets the value of the idCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDCardNumber(JAXBElement<String> value) {
        this.idCardNumber = value;
    }

    /**
     * Gets the value of the idPath1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDPath1() {
        return idPath1;
    }

    /**
     * Sets the value of the idPath1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDPath1(JAXBElement<String> value) {
        this.idPath1 = value;
    }

    /**
     * Gets the value of the idPath2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDPath2() {
        return idPath2;
    }

    /**
     * Sets the value of the idPath2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDPath2(JAXBElement<String> value) {
        this.idPath2 = value;
    }

    /**
     * Gets the value of the interests property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInterests() {
        return interests;
    }

    /**
     * Sets the value of the interests property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInterests(JAXBElement<String> value) {
        this.interests = value;
    }

    /**
     * Gets the value of the isAlreadyExists property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAlreadyExists() {
        return isAlreadyExists;
    }

    /**
     * Sets the value of the isAlreadyExists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAlreadyExists(Boolean value) {
        this.isAlreadyExists = value;
    }

    /**
     * Gets the value of the isApproved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsApproved() {
        return isApproved;
    }

    /**
     * Sets the value of the isApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsApproved(Boolean value) {
        this.isApproved = value;
    }

    /**
     * Gets the value of the isEmailVerified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEmailVerified() {
        return isEmailVerified;
    }

    /**
     * Sets the value of the isEmailVerified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEmailVerified(Boolean value) {
        this.isEmailVerified = value;
    }

    /**
     * Gets the value of the isExpired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExpired() {
        return isExpired;
    }

    /**
     * Sets the value of the isExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExpired(Boolean value) {
        this.isExpired = value;
    }

    /**
     * Gets the value of the isFFPApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFFPApplicable() {
        return isFFPApplicable;
    }

    /**
     * Sets the value of the isFFPApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFFPApplicable(Boolean value) {
        this.isFFPApplicable = value;
    }

    /**
     * Gets the value of the isJounior property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsJounior() {
        return isJounior;
    }

    /**
     * Sets the value of the isJounior property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsJounior(Integer value) {
        this.isJounior = value;
    }

    /**
     * Gets the value of the isLoayltyMemberChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLoayltyMemberChange() {
        return isLoayltyMemberChange;
    }

    /**
     * Sets the value of the isLoayltyMemberChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLoayltyMemberChange(Boolean value) {
        this.isLoayltyMemberChange = value;
    }

    /**
     * Gets the value of the isLoyaltyUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLoyaltyUser() {
        return isLoyaltyUser;
    }

    /**
     * Sets the value of the isLoyaltyUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLoyaltyUser(Boolean value) {
        this.isLoyaltyUser = value;
    }

    /**
     * Gets the value of the isRegistrationEmailVerified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRegistrationEmailVerified() {
        return isRegistrationEmailVerified;
    }

    /**
     * Sets the value of the isRegistrationEmailVerified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRegistrationEmailVerified(Boolean value) {
        this.isRegistrationEmailVerified = value;
    }

    /**
     * Gets the value of the isStudent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStudent() {
        return isStudent;
    }

    /**
     * Sets the value of the isStudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStudent(Boolean value) {
        this.isStudent = value;
    }

    /**
     * Gets the value of the isVIPProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVIPProfile() {
        return isVIPProfile;
    }

    /**
     * Sets the value of the isVIPProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVIPProfile(Boolean value) {
        this.isVIPProfile = value;
    }

    /**
     * Gets the value of the isValPassIssDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValPassIssDetails() {
        return isValPassIssDetails;
    }

    /**
     * Sets the value of the isValPassIssDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValPassIssDetails(Boolean value) {
        this.isValPassIssDetails = value;
    }

    /**
     * Gets the value of the isVerified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVerified() {
        return isVerified;
    }

    /**
     * Sets the value of the isVerified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVerified(Boolean value) {
        this.isVerified = value;
    }

    /**
     * Gets the value of the lastUpdateBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * Sets the value of the lastUpdateBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdateBy(JAXBElement<String> value) {
        this.lastUpdateBy = value;
    }

    /**
     * Gets the value of the loyaltyPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoyaltyPoints() {
        return loyaltyPoints;
    }

    /**
     * Sets the value of the loyaltyPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoyaltyPoints(Integer value) {
        this.loyaltyPoints = value;
    }

    /**
     * Gets the value of the mailingAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailingAddress1() {
        return mailingAddress1;
    }

    /**
     * Sets the value of the mailingAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailingAddress1(JAXBElement<String> value) {
        this.mailingAddress1 = value;
    }

    /**
     * Gets the value of the mailingAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailingAddress2() {
        return mailingAddress2;
    }

    /**
     * Sets the value of the mailingAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailingAddress2(JAXBElement<String> value) {
        this.mailingAddress2 = value;
    }

    /**
     * Gets the value of the mailingAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailingAddress3() {
        return mailingAddress3;
    }

    /**
     * Sets the value of the mailingAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailingAddress3(JAXBElement<String> value) {
        this.mailingAddress3 = value;
    }

    /**
     * Gets the value of the mealPref property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMealPref() {
        return mealPref;
    }

    /**
     * Sets the value of the mealPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMealPref(JAXBElement<String> value) {
        this.mealPref = value;
    }

    /**
     * Gets the value of the memberStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemberStatus() {
        return memberStatus;
    }

    /**
     * Sets the value of the memberStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemberStatus(JAXBElement<String> value) {
        this.memberStatus = value;
    }

    /**
     * Gets the value of the memberTier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemberTier() {
        return memberTier;
    }

    /**
     * Sets the value of the memberTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemberTier(JAXBElement<String> value) {
        this.memberTier = value;
    }

    /**
     * Gets the value of the mobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileNo() {
        return mobileNo;
    }

    /**
     * Sets the value of the mobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileNo(JAXBElement<String> value) {
        this.mobileNo = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNationality(JAXBElement<String> value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the newsLetterEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewsLetterEnabled() {
        return newsLetterEnabled;
    }

    /**
     * Sets the value of the newsLetterEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewsLetterEnabled(Boolean value) {
        this.newsLetterEnabled = value;
    }

    /**
     * Gets the value of the nextExpireMiles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNextExpireMiles() {
        return nextExpireMiles;
    }

    /**
     * Sets the value of the nextExpireMiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNextExpireMiles(JAXBElement<String> value) {
        this.nextExpireMiles = value;
    }

    /**
     * Gets the value of the nextMilesExpireOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextMilesExpireOn() {
        return nextMilesExpireOn;
    }

    /**
     * Sets the value of the nextMilesExpireOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextMilesExpireOn(XMLGregorianCalendar value) {
        this.nextMilesExpireOn = value;
    }

    /**
     * Gets the value of the passportCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassportCountry() {
        return passportCountry;
    }

    /**
     * Sets the value of the passportCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassportCountry(JAXBElement<String> value) {
        this.passportCountry = value;
    }

    /**
     * Gets the value of the passportCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassportCountryCode() {
        return passportCountryCode;
    }

    /**
     * Sets the value of the passportCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassportCountryCode(JAXBElement<String> value) {
        this.passportCountryCode = value;
    }

    /**
     * Gets the value of the passportExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPassportExpDate() {
        return passportExpDate;
    }

    /**
     * Sets the value of the passportExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPassportExpDate(XMLGregorianCalendar value) {
        this.passportExpDate = value;
    }

    /**
     * Gets the value of the passportIssuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPassportIssuedDate() {
        return passportIssuedDate;
    }

    /**
     * Sets the value of the passportIssuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPassportIssuedDate(XMLGregorianCalendar value) {
        this.passportIssuedDate = value;
    }

    /**
     * Gets the value of the passportIssuedPlace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassportIssuedPlace() {
        return passportIssuedPlace;
    }

    /**
     * Sets the value of the passportIssuedPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassportIssuedPlace(JAXBElement<String> value) {
        this.passportIssuedPlace = value;
    }

    /**
     * Gets the value of the passportNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassportNo() {
        return passportNo;
    }

    /**
     * Sets the value of the passportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassportNo(JAXBElement<String> value) {
        this.passportNo = value;
    }

    /**
     * Gets the value of the paxInfoID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaxInfoID() {
        return paxInfoID;
    }

    /**
     * Sets the value of the paxInfoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaxInfoID(Long value) {
        this.paxInfoID = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostCode(JAXBElement<String> value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the preferredAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredAddress() {
        return preferredAddress;
    }

    /**
     * Sets the value of the preferredAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredAddress(JAXBElement<String> value) {
        this.preferredAddress = value;
    }

    /**
     * Gets the value of the preferredLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * Sets the value of the preferredLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredLanguage(JAXBElement<String> value) {
        this.preferredLanguage = value;
    }

    /**
     * Gets the value of the profileTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfileTitle() {
        return profileTitle;
    }

    /**
     * Sets the value of the profileTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfileTitle(JAXBElement<String> value) {
        this.profileTitle = value;
    }

    /**
     * Gets the value of the registeredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegisteredDate() {
        return registeredDate;
    }

    /**
     * Sets the value of the registeredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegisteredDate(XMLGregorianCalendar value) {
        this.registeredDate = value;
    }

    /**
     * Gets the value of the reservationMilesEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReservationMilesEarned() {
        return reservationMilesEarned;
    }

    /**
     * Sets the value of the reservationMilesEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReservationMilesEarned(BigDecimal value) {
        this.reservationMilesEarned = value;
    }

    /**
     * Gets the value of the seatPreference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeatPreference() {
        return seatPreference;
    }

    /**
     * Sets the value of the seatPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeatPreference(JAXBElement<String> value) {
        this.seatPreference = value;
    }

    /**
     * Gets the value of the seatingPref property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeatingPref() {
        return seatingPref;
    }

    /**
     * Sets the value of the seatingPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeatingPref(JAXBElement<String> value) {
        this.seatingPref = value;
    }

    /**
     * Gets the value of the secondaryEmailID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecondaryEmailID() {
        return secondaryEmailID;
    }

    /**
     * Sets the value of the secondaryEmailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecondaryEmailID(JAXBElement<String> value) {
        this.secondaryEmailID = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = value;
    }

    /**
     * Gets the value of the surName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurName() {
        return surName;
    }

    /**
     * Sets the value of the surName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurName(JAXBElement<String> value) {
        this.surName = value;
    }

    /**
     * Gets the value of the tierBalancePoints property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTierBalancePoints() {
        return tierBalancePoints;
    }

    /**
     * Sets the value of the tierBalancePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTierBalancePoints(Integer value) {
        this.tierBalancePoints = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the totalMilesEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalMilesEarned() {
        return totalMilesEarned;
    }

    /**
     * Sets the value of the totalMilesEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalMilesEarned(BigDecimal value) {
        this.totalMilesEarned = value;
    }

    /**
     * Gets the value of the totalPointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPointsEarned() {
        return totalPointsEarned;
    }

    /**
     * Sets the value of the totalPointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPointsEarned(BigDecimal value) {
        this.totalPointsEarned = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrl(JAXBElement<String> value) {
        this.url = value;
    }

    /**
     * Gets the value of the userLoginId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserLoginId() {
        return userLoginId;
    }

    /**
     * Sets the value of the userLoginId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserLoginId(Integer value) {
        this.userLoginId = value;
    }

    /**
     * Gets the value of the verifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVerifiedBy() {
        return verifiedBy;
    }

    /**
     * Sets the value of the verifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVerifiedBy(Integer value) {
        this.verifiedBy = value;
    }

    /**
     * Gets the value of the verifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVerifiedDateTime() {
        return verifiedDateTime;
    }

    /**
     * Sets the value of the verifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVerifiedDateTime(XMLGregorianCalendar value) {
        this.verifiedDateTime = value;
    }

}
