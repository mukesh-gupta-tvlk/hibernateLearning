
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_SelectedSeat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_SelectedSeat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsSelectionSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SeatNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentDirection" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SegmentIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_SelectedSeat", propOrder = {
    "errorType",
    "isSelectionSuccess",
    "seatNo",
    "segmentDirection",
    "segmentIndex"
})
public class APISelectedSeat {

    @XmlElement(name = "ErrorType")
    protected Integer errorType;
    @XmlElement(name = "IsSelectionSuccess")
    protected Boolean isSelectionSuccess;
    @XmlElementRef(name = "SeatNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seatNo;
    @XmlElement(name = "SegmentDirection")
    protected Integer segmentDirection;
    @XmlElement(name = "SegmentIndex")
    protected Integer segmentIndex;

    /**
     * Gets the value of the errorType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorType() {
        return errorType;
    }

    /**
     * Sets the value of the errorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorType(Integer value) {
        this.errorType = value;
    }

    /**
     * Gets the value of the isSelectionSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSelectionSuccess() {
        return isSelectionSuccess;
    }

    /**
     * Sets the value of the isSelectionSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSelectionSuccess(Boolean value) {
        this.isSelectionSuccess = value;
    }

    /**
     * Gets the value of the seatNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeatNo() {
        return seatNo;
    }

    /**
     * Sets the value of the seatNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeatNo(JAXBElement<String> value) {
        this.seatNo = value;
    }

    /**
     * Gets the value of the segmentDirection property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentDirection() {
        return segmentDirection;
    }

    /**
     * Sets the value of the segmentDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentDirection(Integer value) {
        this.segmentDirection = value;
    }

    /**
     * Gets the value of the segmentIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentIndex() {
        return segmentIndex;
    }

    /**
     * Sets the value of the segmentIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentIndex(Integer value) {
        this.segmentIndex = value;
    }

}
