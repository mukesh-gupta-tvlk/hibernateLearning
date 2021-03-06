
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InvalidAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InvalidBookingID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTicketMailSent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTicketingDeadlineTimeExpired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="ResultReservationDetails" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ReservationDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingResponse", propOrder = {
    "errorMessage",
    "invalidAccount",
    "invalidBookingID",
    "isSuccess",
    "isTicketMailSent",
    "isTicketingDeadlineTimeExpired",
    "resultMsg",
    "resultReservationDetails"
})
public class TicketingResponse {

    @XmlElementRef(name = "ErrorMessage", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorMessage;
    @XmlElement(name = "InvalidAccount")
    protected Boolean invalidAccount;
    @XmlElement(name = "InvalidBookingID")
    protected Boolean invalidBookingID;
    @XmlElement(name = "IsSuccess")
    protected Boolean isSuccess;
    @XmlElement(name = "IsTicketMailSent")
    protected Boolean isTicketMailSent;
    @XmlElement(name = "IsTicketingDeadlineTimeExpired")
    protected Boolean isTicketingDeadlineTimeExpired;
    @XmlElementRef(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> resultMsg;
    @XmlElementRef(name = "ResultReservationDetails", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ReservationDetails> resultReservationDetails;

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMessage(JAXBElement<String> value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the invalidAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvalidAccount() {
        return invalidAccount;
    }

    /**
     * Sets the value of the invalidAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvalidAccount(Boolean value) {
        this.invalidAccount = value;
    }

    /**
     * Gets the value of the invalidBookingID property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvalidBookingID() {
        return invalidBookingID;
    }

    /**
     * Sets the value of the invalidBookingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvalidBookingID(Boolean value) {
        this.invalidBookingID = value;
    }

    /**
     * Gets the value of the isSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSuccess() {
        return isSuccess;
    }

    /**
     * Sets the value of the isSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSuccess(Boolean value) {
        this.isSuccess = value;
    }

    /**
     * Gets the value of the isTicketMailSent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTicketMailSent() {
        return isTicketMailSent;
    }

    /**
     * Sets the value of the isTicketMailSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTicketMailSent(Boolean value) {
        this.isTicketMailSent = value;
    }

    /**
     * Gets the value of the isTicketingDeadlineTimeExpired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTicketingDeadlineTimeExpired() {
        return isTicketingDeadlineTimeExpired;
    }

    /**
     * Sets the value of the isTicketingDeadlineTimeExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTicketingDeadlineTimeExpired(Boolean value) {
        this.isTicketingDeadlineTimeExpired = value;
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
     * Gets the value of the resultReservationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReservationDetails }{@code >}
     *     
     */
    public JAXBElement<ReservationDetails> getResultReservationDetails() {
        return resultReservationDetails;
    }

    /**
     * Sets the value of the resultReservationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReservationDetails }{@code >}
     *     
     */
    public void setResultReservationDetails(JAXBElement<ReservationDetails> value) {
        this.resultReservationDetails = value;
    }

}
