
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PassengersEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengersEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddonMealPaxIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AllPaxIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Assistance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B2BID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CallCenterLoginID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ContactNoType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DocType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentExpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DocumentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFNoErrMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFNoPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GWGovtID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GWOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBMeal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBMealCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBSeating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IBSeatingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImpRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsDocumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsDocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsClientBasedPax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCreateFFNo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDuplicateFFNo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEmailSubscriptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsInfantAssignedPax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsLogPaxInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsNewFFNoCreated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSMSSubscriptionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LoyaltyPrefLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainPassengerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ManualBookingPaxId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Meal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MemUID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModifiedDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NationalityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldPassengerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PassengerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PassengerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassportCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassportCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassportExpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PassportIssuedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PassportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaxLoginId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaxSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxTypeIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaxeTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="Seating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeatingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectedComfyKit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectedExpCheckin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectedLounge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectedMeals" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectedSeats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectedTaxi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravellerProfileID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UpdatedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserLoginID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isNotValidPerson" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="selectedLionFast" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengersEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "addonMealPaxIndex",
    "allPaxIndex",
    "assistance",
    "b2BID",
    "callCenterLoginID",
    "contactNoType",
    "customerUserID",
    "dateOfBirth",
    "docType",
    "documentExpDate",
    "documentID",
    "email",
    "ffNo",
    "ffNoErrMsg",
    "ffNoPassword",
    "ffType",
    "ffTypeCode",
    "firstName",
    "gwGovtID",
    "gwOrganizationName",
    "gender",
    "ibMeal",
    "ibMealCode",
    "ibSeating",
    "ibSeatingCode",
    "impRating",
    "insDocumentId",
    "insDocumentType",
    "isClientBasedPax",
    "isCreateFFNo",
    "isDuplicateFFNo",
    "isEmailSubscriptionEnabled",
    "isInfantAssignedPax",
    "isLogPaxInfo",
    "isNewFFNoCreated",
    "isSMSSubscriptionEnabled",
    "loyaltyPrefLang",
    "mainPassengerID",
    "manualBookingPaxId",
    "meal",
    "mealCode",
    "memUID",
    "mobileNo",
    "modifiedDetails",
    "nameNumber",
    "nationality",
    "nationalityCode",
    "occupation",
    "oldPassengerID",
    "passengerID",
    "passengerType",
    "passportCountry",
    "passportCountryCode",
    "passportExpDate",
    "passportIssuedDate",
    "passportNo",
    "paxID",
    "paxLoginId",
    "paxSuffix",
    "paxTypeIndex",
    "paxeTicket",
    "personID",
    "reservationID",
    "resultMsg",
    "seating",
    "seatingCode",
    "selectedComfyKit",
    "selectedExpCheckin",
    "selectedLounge",
    "selectedMeals",
    "selectedSeats",
    "selectedTaxi",
    "specialType",
    "surName",
    "tel",
    "title",
    "travellerProfileID",
    "updatedDateTime",
    "userLoginID",
    "isNotValidPerson",
    "selectedLionFast"
})
public class PassengersEN {

    @XmlElement(name = "AddonMealPaxIndex")
    protected Integer addonMealPaxIndex;
    @XmlElement(name = "AllPaxIndex")
    protected Integer allPaxIndex;
    @XmlElementRef(name = "Assistance", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assistance;
    @XmlElement(name = "B2BID")
    protected Integer b2BID;
    @XmlElement(name = "CallCenterLoginID")
    protected Integer callCenterLoginID;
    @XmlElementRef(name = "ContactNoType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactNoType;
    @XmlElement(name = "CustomerUserID")
    protected Integer customerUserID;
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElementRef(name = "DocType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> docType;
    @XmlElement(name = "DocumentExpDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentExpDate;
    @XmlElementRef(name = "DocumentID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentID;
    @XmlElementRef(name = "Email", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "FFNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ffNo;
    @XmlElementRef(name = "FFNoErrMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ffNoErrMsg;
    @XmlElementRef(name = "FFNoPassword", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ffNoPassword;
    @XmlElementRef(name = "FFType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ffType;
    @XmlElementRef(name = "FFTypeCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ffTypeCode;
    @XmlElementRef(name = "FirstName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "GWGovtID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gwGovtID;
    @XmlElementRef(name = "GWOrganizationName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gwOrganizationName;
    @XmlElementRef(name = "Gender", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gender;
    @XmlElementRef(name = "IBMeal", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ibMeal;
    @XmlElementRef(name = "IBMealCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ibMealCode;
    @XmlElementRef(name = "IBSeating", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ibSeating;
    @XmlElementRef(name = "IBSeatingCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ibSeatingCode;
    @XmlElementRef(name = "ImpRating", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> impRating;
    @XmlElementRef(name = "InsDocumentId", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insDocumentId;
    @XmlElementRef(name = "InsDocumentType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insDocumentType;
    @XmlElement(name = "IsClientBasedPax")
    protected Boolean isClientBasedPax;
    @XmlElement(name = "IsCreateFFNo")
    protected Boolean isCreateFFNo;
    @XmlElement(name = "IsDuplicateFFNo")
    protected Boolean isDuplicateFFNo;
    @XmlElement(name = "IsEmailSubscriptionEnabled")
    protected Boolean isEmailSubscriptionEnabled;
    @XmlElement(name = "IsInfantAssignedPax")
    protected Boolean isInfantAssignedPax;
    @XmlElement(name = "IsLogPaxInfo")
    protected Boolean isLogPaxInfo;
    @XmlElement(name = "IsNewFFNoCreated")
    protected Boolean isNewFFNoCreated;
    @XmlElement(name = "IsSMSSubscriptionEnabled")
    protected Boolean isSMSSubscriptionEnabled;
    @XmlElementRef(name = "LoyaltyPrefLang", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loyaltyPrefLang;
    @XmlElement(name = "MainPassengerID")
    protected Integer mainPassengerID;
    @XmlElement(name = "ManualBookingPaxId")
    protected Long manualBookingPaxId;
    @XmlElementRef(name = "Meal", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> meal;
    @XmlElementRef(name = "MealCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mealCode;
    @XmlElement(name = "MemUID")
    protected Integer memUID;
    @XmlElementRef(name = "MobileNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileNo;
    @XmlElementRef(name = "ModifiedDetails", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modifiedDetails;
    @XmlElementRef(name = "NameNumber", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nameNumber;
    @XmlElementRef(name = "Nationality", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nationality;
    @XmlElementRef(name = "NationalityCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nationalityCode;
    @XmlElementRef(name = "Occupation", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> occupation;
    @XmlElement(name = "OldPassengerID")
    protected Integer oldPassengerID;
    @XmlElement(name = "PassengerID")
    protected Integer passengerID;
    @XmlElementRef(name = "PassengerType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passengerType;
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
    @XmlElementRef(name = "PassportNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passportNo;
    @XmlElement(name = "PaxID")
    protected Integer paxID;
    @XmlElement(name = "PaxLoginId")
    protected Integer paxLoginId;
    @XmlElementRef(name = "PaxSuffix", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paxSuffix;
    @XmlElement(name = "PaxTypeIndex")
    protected Integer paxTypeIndex;
    @XmlElementRef(name = "PaxeTicket", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paxeTicket;
    @XmlElement(name = "PersonID")
    protected Integer personID;
    @XmlElementRef(name = "ReservationID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reservationID;
    @XmlElementRef(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> resultMsg;
    @XmlElementRef(name = "Seating", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seating;
    @XmlElementRef(name = "SeatingCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seatingCode;
    @XmlElementRef(name = "SelectedComfyKit", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> selectedComfyKit;
    @XmlElementRef(name = "SelectedExpCheckin", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> selectedExpCheckin;
    @XmlElementRef(name = "SelectedLounge", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> selectedLounge;
    @XmlElementRef(name = "SelectedMeals", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> selectedMeals;
    @XmlElementRef(name = "SelectedSeats", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> selectedSeats;
    @XmlElementRef(name = "SelectedTaxi", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> selectedTaxi;
    @XmlElementRef(name = "SpecialType", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialType;
    @XmlElementRef(name = "SurName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surName;
    @XmlElementRef(name = "Tel", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tel;
    @XmlElementRef(name = "Title", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElement(name = "TravellerProfileID")
    protected Long travellerProfileID;
    @XmlElement(name = "UpdatedDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDateTime;
    @XmlElement(name = "UserLoginID")
    protected Integer userLoginID;
    protected Boolean isNotValidPerson;
    @XmlElementRef(name = "selectedLionFast", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> selectedLionFast;

    /**
     * Gets the value of the addonMealPaxIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddonMealPaxIndex() {
        return addonMealPaxIndex;
    }

    /**
     * Sets the value of the addonMealPaxIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddonMealPaxIndex(Integer value) {
        this.addonMealPaxIndex = value;
    }

    /**
     * Gets the value of the allPaxIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAllPaxIndex() {
        return allPaxIndex;
    }

    /**
     * Sets the value of the allPaxIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAllPaxIndex(Integer value) {
        this.allPaxIndex = value;
    }

    /**
     * Gets the value of the assistance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssistance() {
        return assistance;
    }

    /**
     * Sets the value of the assistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssistance(JAXBElement<String> value) {
        this.assistance = value;
    }

    /**
     * Gets the value of the b2BID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getB2BID() {
        return b2BID;
    }

    /**
     * Sets the value of the b2BID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setB2BID(Integer value) {
        this.b2BID = value;
    }

    /**
     * Gets the value of the callCenterLoginID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCallCenterLoginID() {
        return callCenterLoginID;
    }

    /**
     * Sets the value of the callCenterLoginID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCallCenterLoginID(Integer value) {
        this.callCenterLoginID = value;
    }

    /**
     * Gets the value of the contactNoType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactNoType() {
        return contactNoType;
    }

    /**
     * Sets the value of the contactNoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactNoType(JAXBElement<String> value) {
        this.contactNoType = value;
    }

    /**
     * Gets the value of the customerUserID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerUserID() {
        return customerUserID;
    }

    /**
     * Sets the value of the customerUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerUserID(Integer value) {
        this.customerUserID = value;
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
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocType(JAXBElement<String> value) {
        this.docType = value;
    }

    /**
     * Gets the value of the documentExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentExpDate() {
        return documentExpDate;
    }

    /**
     * Sets the value of the documentExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentExpDate(XMLGregorianCalendar value) {
        this.documentExpDate = value;
    }

    /**
     * Gets the value of the documentID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentID(JAXBElement<String> value) {
        this.documentID = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the ffNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFFNo() {
        return ffNo;
    }

    /**
     * Sets the value of the ffNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFFNo(JAXBElement<String> value) {
        this.ffNo = value;
    }

    /**
     * Gets the value of the ffNoErrMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFFNoErrMsg() {
        return ffNoErrMsg;
    }

    /**
     * Sets the value of the ffNoErrMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFFNoErrMsg(JAXBElement<String> value) {
        this.ffNoErrMsg = value;
    }

    /**
     * Gets the value of the ffNoPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFFNoPassword() {
        return ffNoPassword;
    }

    /**
     * Sets the value of the ffNoPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFFNoPassword(JAXBElement<String> value) {
        this.ffNoPassword = value;
    }

    /**
     * Gets the value of the ffType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFFType() {
        return ffType;
    }

    /**
     * Sets the value of the ffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFFType(JAXBElement<String> value) {
        this.ffType = value;
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
     * Gets the value of the gwGovtID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGWGovtID() {
        return gwGovtID;
    }

    /**
     * Sets the value of the gwGovtID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGWGovtID(JAXBElement<String> value) {
        this.gwGovtID = value;
    }

    /**
     * Gets the value of the gwOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGWOrganizationName() {
        return gwOrganizationName;
    }

    /**
     * Sets the value of the gwOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGWOrganizationName(JAXBElement<String> value) {
        this.gwOrganizationName = value;
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
     * Gets the value of the ibMeal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIBMeal() {
        return ibMeal;
    }

    /**
     * Sets the value of the ibMeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIBMeal(JAXBElement<String> value) {
        this.ibMeal = value;
    }

    /**
     * Gets the value of the ibMealCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIBMealCode() {
        return ibMealCode;
    }

    /**
     * Sets the value of the ibMealCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIBMealCode(JAXBElement<String> value) {
        this.ibMealCode = value;
    }

    /**
     * Gets the value of the ibSeating property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIBSeating() {
        return ibSeating;
    }

    /**
     * Sets the value of the ibSeating property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIBSeating(JAXBElement<String> value) {
        this.ibSeating = value;
    }

    /**
     * Gets the value of the ibSeatingCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIBSeatingCode() {
        return ibSeatingCode;
    }

    /**
     * Sets the value of the ibSeatingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIBSeatingCode(JAXBElement<String> value) {
        this.ibSeatingCode = value;
    }

    /**
     * Gets the value of the impRating property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImpRating() {
        return impRating;
    }

    /**
     * Sets the value of the impRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImpRating(JAXBElement<String> value) {
        this.impRating = value;
    }

    /**
     * Gets the value of the insDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsDocumentId() {
        return insDocumentId;
    }

    /**
     * Sets the value of the insDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsDocumentId(JAXBElement<String> value) {
        this.insDocumentId = value;
    }

    /**
     * Gets the value of the insDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsDocumentType() {
        return insDocumentType;
    }

    /**
     * Sets the value of the insDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsDocumentType(JAXBElement<String> value) {
        this.insDocumentType = value;
    }

    /**
     * Gets the value of the isClientBasedPax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsClientBasedPax() {
        return isClientBasedPax;
    }

    /**
     * Sets the value of the isClientBasedPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsClientBasedPax(Boolean value) {
        this.isClientBasedPax = value;
    }

    /**
     * Gets the value of the isCreateFFNo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCreateFFNo() {
        return isCreateFFNo;
    }

    /**
     * Sets the value of the isCreateFFNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCreateFFNo(Boolean value) {
        this.isCreateFFNo = value;
    }

    /**
     * Gets the value of the isDuplicateFFNo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDuplicateFFNo() {
        return isDuplicateFFNo;
    }

    /**
     * Sets the value of the isDuplicateFFNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDuplicateFFNo(Boolean value) {
        this.isDuplicateFFNo = value;
    }

    /**
     * Gets the value of the isEmailSubscriptionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEmailSubscriptionEnabled() {
        return isEmailSubscriptionEnabled;
    }

    /**
     * Sets the value of the isEmailSubscriptionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEmailSubscriptionEnabled(Boolean value) {
        this.isEmailSubscriptionEnabled = value;
    }

    /**
     * Gets the value of the isInfantAssignedPax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInfantAssignedPax() {
        return isInfantAssignedPax;
    }

    /**
     * Sets the value of the isInfantAssignedPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInfantAssignedPax(Boolean value) {
        this.isInfantAssignedPax = value;
    }

    /**
     * Gets the value of the isLogPaxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLogPaxInfo() {
        return isLogPaxInfo;
    }

    /**
     * Sets the value of the isLogPaxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLogPaxInfo(Boolean value) {
        this.isLogPaxInfo = value;
    }

    /**
     * Gets the value of the isNewFFNoCreated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNewFFNoCreated() {
        return isNewFFNoCreated;
    }

    /**
     * Sets the value of the isNewFFNoCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNewFFNoCreated(Boolean value) {
        this.isNewFFNoCreated = value;
    }

    /**
     * Gets the value of the isSMSSubscriptionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSMSSubscriptionEnabled() {
        return isSMSSubscriptionEnabled;
    }

    /**
     * Sets the value of the isSMSSubscriptionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSMSSubscriptionEnabled(Boolean value) {
        this.isSMSSubscriptionEnabled = value;
    }

    /**
     * Gets the value of the loyaltyPrefLang property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoyaltyPrefLang() {
        return loyaltyPrefLang;
    }

    /**
     * Sets the value of the loyaltyPrefLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoyaltyPrefLang(JAXBElement<String> value) {
        this.loyaltyPrefLang = value;
    }

    /**
     * Gets the value of the mainPassengerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMainPassengerID() {
        return mainPassengerID;
    }

    /**
     * Sets the value of the mainPassengerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMainPassengerID(Integer value) {
        this.mainPassengerID = value;
    }

    /**
     * Gets the value of the manualBookingPaxId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManualBookingPaxId() {
        return manualBookingPaxId;
    }

    /**
     * Sets the value of the manualBookingPaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManualBookingPaxId(Long value) {
        this.manualBookingPaxId = value;
    }

    /**
     * Gets the value of the meal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMeal() {
        return meal;
    }

    /**
     * Sets the value of the meal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMeal(JAXBElement<String> value) {
        this.meal = value;
    }

    /**
     * Gets the value of the mealCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMealCode() {
        return mealCode;
    }

    /**
     * Sets the value of the mealCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMealCode(JAXBElement<String> value) {
        this.mealCode = value;
    }

    /**
     * Gets the value of the memUID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemUID() {
        return memUID;
    }

    /**
     * Sets the value of the memUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemUID(Integer value) {
        this.memUID = value;
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
     * Gets the value of the modifiedDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModifiedDetails() {
        return modifiedDetails;
    }

    /**
     * Sets the value of the modifiedDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModifiedDetails(JAXBElement<String> value) {
        this.modifiedDetails = value;
    }

    /**
     * Gets the value of the nameNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNameNumber() {
        return nameNumber;
    }

    /**
     * Sets the value of the nameNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNameNumber(JAXBElement<String> value) {
        this.nameNumber = value;
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
     * Gets the value of the nationalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNationalityCode() {
        return nationalityCode;
    }

    /**
     * Sets the value of the nationalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNationalityCode(JAXBElement<String> value) {
        this.nationalityCode = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOccupation(JAXBElement<String> value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the oldPassengerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOldPassengerID() {
        return oldPassengerID;
    }

    /**
     * Sets the value of the oldPassengerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOldPassengerID(Integer value) {
        this.oldPassengerID = value;
    }

    /**
     * Gets the value of the passengerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassengerID() {
        return passengerID;
    }

    /**
     * Sets the value of the passengerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassengerID(Integer value) {
        this.passengerID = value;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassengerType(JAXBElement<String> value) {
        this.passengerType = value;
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
     * Gets the value of the paxID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaxID() {
        return paxID;
    }

    /**
     * Sets the value of the paxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaxID(Integer value) {
        this.paxID = value;
    }

    /**
     * Gets the value of the paxLoginId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaxLoginId() {
        return paxLoginId;
    }

    /**
     * Sets the value of the paxLoginId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaxLoginId(Integer value) {
        this.paxLoginId = value;
    }

    /**
     * Gets the value of the paxSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaxSuffix() {
        return paxSuffix;
    }

    /**
     * Sets the value of the paxSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaxSuffix(JAXBElement<String> value) {
        this.paxSuffix = value;
    }

    /**
     * Gets the value of the paxTypeIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaxTypeIndex() {
        return paxTypeIndex;
    }

    /**
     * Sets the value of the paxTypeIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaxTypeIndex(Integer value) {
        this.paxTypeIndex = value;
    }

    /**
     * Gets the value of the paxeTicket property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaxeTicket() {
        return paxeTicket;
    }

    /**
     * Sets the value of the paxeTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaxeTicket(JAXBElement<String> value) {
        this.paxeTicket = value;
    }

    /**
     * Gets the value of the personID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPersonID() {
        return personID;
    }

    /**
     * Sets the value of the personID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPersonID(Integer value) {
        this.personID = value;
    }

    /**
     * Gets the value of the reservationID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReservationID() {
        return reservationID;
    }

    /**
     * Sets the value of the reservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReservationID(JAXBElement<String> value) {
        this.reservationID = value;
    }

    /**
     * Gets the value of the resultMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public JAXBElement<Result> getResultMsg() {
        return resultMsg;
    }

    /**
     * Sets the value of the resultMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Result }{@code >}
     *     
     */
    public void setResultMsg(JAXBElement<Result> value) {
        this.resultMsg = value;
    }

    /**
     * Gets the value of the seating property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeating() {
        return seating;
    }

    /**
     * Sets the value of the seating property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeating(JAXBElement<String> value) {
        this.seating = value;
    }

    /**
     * Gets the value of the seatingCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeatingCode() {
        return seatingCode;
    }

    /**
     * Sets the value of the seatingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeatingCode(JAXBElement<String> value) {
        this.seatingCode = value;
    }

    /**
     * Gets the value of the selectedComfyKit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelectedComfyKit() {
        return selectedComfyKit;
    }

    /**
     * Sets the value of the selectedComfyKit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelectedComfyKit(JAXBElement<String> value) {
        this.selectedComfyKit = value;
    }

    /**
     * Gets the value of the selectedExpCheckin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelectedExpCheckin() {
        return selectedExpCheckin;
    }

    /**
     * Sets the value of the selectedExpCheckin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelectedExpCheckin(JAXBElement<String> value) {
        this.selectedExpCheckin = value;
    }

    /**
     * Gets the value of the selectedLounge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelectedLounge() {
        return selectedLounge;
    }

    /**
     * Sets the value of the selectedLounge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelectedLounge(JAXBElement<String> value) {
        this.selectedLounge = value;
    }

    /**
     * Gets the value of the selectedMeals property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelectedMeals() {
        return selectedMeals;
    }

    /**
     * Sets the value of the selectedMeals property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelectedMeals(JAXBElement<String> value) {
        this.selectedMeals = value;
    }

    /**
     * Gets the value of the selectedSeats property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelectedSeats() {
        return selectedSeats;
    }

    /**
     * Sets the value of the selectedSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelectedSeats(JAXBElement<String> value) {
        this.selectedSeats = value;
    }

    /**
     * Gets the value of the selectedTaxi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelectedTaxi() {
        return selectedTaxi;
    }

    /**
     * Sets the value of the selectedTaxi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelectedTaxi(JAXBElement<String> value) {
        this.selectedTaxi = value;
    }

    /**
     * Gets the value of the specialType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialType() {
        return specialType;
    }

    /**
     * Sets the value of the specialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialType(JAXBElement<String> value) {
        this.specialType = value;
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
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTel(JAXBElement<String> value) {
        this.tel = value;
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
     * Gets the value of the travellerProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTravellerProfileID() {
        return travellerProfileID;
    }

    /**
     * Sets the value of the travellerProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTravellerProfileID(Long value) {
        this.travellerProfileID = value;
    }

    /**
     * Gets the value of the updatedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedDateTime() {
        return updatedDateTime;
    }

    /**
     * Sets the value of the updatedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedDateTime(XMLGregorianCalendar value) {
        this.updatedDateTime = value;
    }

    /**
     * Gets the value of the userLoginID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserLoginID() {
        return userLoginID;
    }

    /**
     * Sets the value of the userLoginID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserLoginID(Integer value) {
        this.userLoginID = value;
    }

    /**
     * Gets the value of the isNotValidPerson property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNotValidPerson() {
        return isNotValidPerson;
    }

    /**
     * Sets the value of the isNotValidPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNotValidPerson(Boolean value) {
        this.isNotValidPerson = value;
    }

    /**
     * Gets the value of the selectedLionFast property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelectedLionFast() {
        return selectedLionFast;
    }

    /**
     * Sets the value of the selectedLionFast property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelectedLionFast(JAXBElement<String> value) {
        this.selectedLionFast = value;
    }

}
