
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationPromoCodesEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationPromoCodesEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerUserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DealManagerPromoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationPromoCodeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ResultMsg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}Result" minOccurs="0"/>
 *         &lt;element name="ServicePromoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialPaxPromoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationPromoCodesEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "customerUserId",
    "dealManagerPromoCode",
    "reservationId",
    "reservationPromoCodeId",
    "resultMsg",
    "servicePromoCode",
    "specialPaxPromoCode"
})
public class ReservationPromoCodesEN {

    @XmlElement(name = "CustomerUserId")
    protected Integer customerUserId;
    @XmlElementRef(name = "DealManagerPromoCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dealManagerPromoCode;
    @XmlElementRef(name = "ReservationId", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reservationId;
    @XmlElement(name = "ReservationPromoCodeId")
    protected Long reservationPromoCodeId;
    @XmlElementRef(name = "ResultMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<Result> resultMsg;
    @XmlElementRef(name = "ServicePromoCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> servicePromoCode;
    @XmlElementRef(name = "SpecialPaxPromoCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialPaxPromoCode;

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
     * Gets the value of the dealManagerPromoCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDealManagerPromoCode() {
        return dealManagerPromoCode;
    }

    /**
     * Sets the value of the dealManagerPromoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDealManagerPromoCode(JAXBElement<String> value) {
        this.dealManagerPromoCode = value;
    }

    /**
     * Gets the value of the reservationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReservationId() {
        return reservationId;
    }

    /**
     * Sets the value of the reservationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReservationId(JAXBElement<String> value) {
        this.reservationId = value;
    }

    /**
     * Gets the value of the reservationPromoCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReservationPromoCodeId() {
        return reservationPromoCodeId;
    }

    /**
     * Sets the value of the reservationPromoCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReservationPromoCodeId(Long value) {
        this.reservationPromoCodeId = value;
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
     * Gets the value of the servicePromoCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServicePromoCode() {
        return servicePromoCode;
    }

    /**
     * Sets the value of the servicePromoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServicePromoCode(JAXBElement<String> value) {
        this.servicePromoCode = value;
    }

    /**
     * Gets the value of the specialPaxPromoCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialPaxPromoCode() {
        return specialPaxPromoCode;
    }

    /**
     * Sets the value of the specialPaxPromoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialPaxPromoCode(JAXBElement<String> value) {
        this.specialPaxPromoCode = value;
    }

}
