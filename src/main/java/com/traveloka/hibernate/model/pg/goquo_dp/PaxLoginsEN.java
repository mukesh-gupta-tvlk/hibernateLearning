
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaxLoginsEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxLoginsEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsentInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ConsentEN" minOccurs="0"/>
 *         &lt;element name="CustomerUserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsEmailVerificationReq" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPremierMember" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Lang" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Lat" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NetzSkyMD5ProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassengerDetails" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}PassengerDetailsEN" minOccurs="0"/>
 *         &lt;element name="PassengerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Passengers" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ArrayOfPassengersEN" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxLoginId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PhoneType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Profile" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}ProfileEN" minOccurs="0"/>
 *         &lt;element name="RegID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/>
 *         &lt;element name="UniqueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxLoginsEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "arrCode",
    "consentInfo",
    "customerUserId",
    "depCode",
    "isEmailVerificationReq",
    "isPremierMember",
    "lang",
    "lat",
    "netzSkyMD5ProfileId",
    "passengerDetails",
    "passengerId",
    "passengers",
    "password",
    "paxLoginId",
    "phoneType",
    "profile",
    "regID",
    "resultMsg",
    "status",
    "uniqueID",
    "userName"
})
@XmlSeeAlso({
    ProfileEN.class
})
public class PaxLoginsEN {

    @XmlElementRef(name = "ArrCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrCode;
    @XmlElementRef(name = "ConsentInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ConsentEN> consentInfo;
    @XmlElement(name = "CustomerUserId")
    protected Integer customerUserId;
    @XmlElementRef(name = "DepCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depCode;
    @XmlElement(name = "IsEmailVerificationReq")
    protected Boolean isEmailVerificationReq;
    @XmlElement(name = "IsPremierMember")
    protected Boolean isPremierMember;
    @XmlElement(name = "Lang")
    protected Double lang;
    @XmlElement(name = "Lat")
    protected Double lat;
    @XmlElementRef(name = "NetzSkyMD5ProfileId", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> netzSkyMD5ProfileId;
    @XmlElementRef(name = "PassengerDetails", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<PassengerDetailsEN> passengerDetails;
    @XmlElement(name = "PassengerId")
    protected Integer passengerId;
    @XmlElementRef(name = "Passengers", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPassengersEN> passengers;
    @XmlElementRef(name = "Password", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElement(name = "PaxLoginId")
    protected Integer paxLoginId;
    @XmlElement(name = "PhoneType")
    protected Integer phoneType;
    @XmlElementRef(name = "Profile", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ProfileEN> profile;
    @XmlElementRef(name = "RegID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regID;
    @XmlElementRef(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> resultMsg;
    @XmlElement(name = "STATUS")
    protected Integer status;
    @XmlElementRef(name = "UniqueID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uniqueID;
    @XmlElementRef(name = "UserName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userName;

    /**
     * Gets the value of the arrCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrCode() {
        return arrCode;
    }

    /**
     * Sets the value of the arrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrCode(JAXBElement<String> value) {
        this.arrCode = value;
    }

    /**
     * Gets the value of the consentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConsentEN }{@code >}
     *     
     */
    public JAXBElement<ConsentEN> getConsentInfo() {
        return consentInfo;
    }

    /**
     * Sets the value of the consentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConsentEN }{@code >}
     *     
     */
    public void setConsentInfo(JAXBElement<ConsentEN> value) {
        this.consentInfo = value;
    }

    /**
     * Gets the value of the customerUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerUserId() {
        return customerUserId;
    }

    /**
     * Sets the value of the customerUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerUserId(Integer value) {
        this.customerUserId = value;
    }

    /**
     * Gets the value of the depCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepCode() {
        return depCode;
    }

    /**
     * Sets the value of the depCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepCode(JAXBElement<String> value) {
        this.depCode = value;
    }

    /**
     * Gets the value of the isEmailVerificationReq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEmailVerificationReq() {
        return isEmailVerificationReq;
    }

    /**
     * Sets the value of the isEmailVerificationReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEmailVerificationReq(Boolean value) {
        this.isEmailVerificationReq = value;
    }

    /**
     * Gets the value of the isPremierMember property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPremierMember() {
        return isPremierMember;
    }

    /**
     * Sets the value of the isPremierMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPremierMember(Boolean value) {
        this.isPremierMember = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLang(Double value) {
        this.lang = value;
    }

    /**
     * Gets the value of the lat property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLat() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLat(Double value) {
        this.lat = value;
    }

    /**
     * Gets the value of the netzSkyMD5ProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetzSkyMD5ProfileId() {
        return netzSkyMD5ProfileId;
    }

    /**
     * Sets the value of the netzSkyMD5ProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetzSkyMD5ProfileId(JAXBElement<String> value) {
        this.netzSkyMD5ProfileId = value;
    }

    /**
     * Gets the value of the passengerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PassengerDetailsEN }{@code >}
     *     
     */
    public JAXBElement<PassengerDetailsEN> getPassengerDetails() {
        return passengerDetails;
    }

    /**
     * Sets the value of the passengerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PassengerDetailsEN }{@code >}
     *     
     */
    public void setPassengerDetails(JAXBElement<PassengerDetailsEN> value) {
        this.passengerDetails = value;
    }

    /**
     * Gets the value of the passengerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassengerId() {
        return passengerId;
    }

    /**
     * Sets the value of the passengerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassengerId(Integer value) {
        this.passengerId = value;
    }

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPassengersEN }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPassengersEN> getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPassengersEN }{@code >}
     *     
     */
    public void setPassengers(JAXBElement<ArrayOfPassengersEN> value) {
        this.passengers = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
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
     * Gets the value of the phoneType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhoneType(Integer value) {
        this.phoneType = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProfileEN }{@code >}
     *     
     */
    public JAXBElement<ProfileEN> getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProfileEN }{@code >}
     *     
     */
    public void setProfile(JAXBElement<ProfileEN> value) {
        this.profile = value;
    }

    /**
     * Gets the value of the regID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegID() {
        return regID;
    }

    /**
     * Sets the value of the regID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegID(JAXBElement<String> value) {
        this.regID = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSTATUS(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUniqueID(JAXBElement<String> value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserName(JAXBElement<String> value) {
        this.userName = value;
    }

}
