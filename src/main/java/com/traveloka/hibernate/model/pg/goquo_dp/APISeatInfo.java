
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_SeatInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_SeatInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CabinClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ColumnNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAisleSeat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsBlockCISeat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsBlockInfantAssignedPax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsExitRow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsHideRow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsHotSeat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsReserved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsWingArea" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PriceInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}API_AddonPriceInfo" minOccurs="0"/>
 *         &lt;element name="RowNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeatType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_SeatInfo", propOrder = {
    "cabinClassCode",
    "cabinClassName",
    "columnNo",
    "isAisleSeat",
    "isAvailable",
    "isBlockCISeat",
    "isBlockInfantAssignedPax",
    "isBlocked",
    "isExitRow",
    "isHideRow",
    "isHotSeat",
    "isReserved",
    "isWingArea",
    "priceInfo",
    "rowNo",
    "seatType"
})
public class APISeatInfo {

    @XmlElementRef(name = "CabinClassCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cabinClassCode;
    @XmlElementRef(name = "CabinClassName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cabinClassName;
    @XmlElementRef(name = "ColumnNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> columnNo;
    @XmlElement(name = "IsAisleSeat")
    protected Boolean isAisleSeat;
    @XmlElement(name = "IsAvailable")
    protected Boolean isAvailable;
    @XmlElement(name = "IsBlockCISeat")
    protected Boolean isBlockCISeat;
    @XmlElement(name = "IsBlockInfantAssignedPax")
    protected Boolean isBlockInfantAssignedPax;
    @XmlElement(name = "IsBlocked")
    protected Boolean isBlocked;
    @XmlElement(name = "IsExitRow")
    protected Boolean isExitRow;
    @XmlElement(name = "IsHideRow")
    protected Boolean isHideRow;
    @XmlElement(name = "IsHotSeat")
    protected Boolean isHotSeat;
    @XmlElement(name = "IsReserved")
    protected Boolean isReserved;
    @XmlElement(name = "IsWingArea")
    protected Boolean isWingArea;
    @XmlElementRef(name = "PriceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<APIAddonPriceInfo> priceInfo;
    @XmlElementRef(name = "RowNo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rowNo;
    @XmlElement(name = "SeatType")
    protected Integer seatType;

    /**
     * Gets the value of the cabinClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCabinClassCode() {
        return cabinClassCode;
    }

    /**
     * Sets the value of the cabinClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCabinClassCode(JAXBElement<String> value) {
        this.cabinClassCode = value;
    }

    /**
     * Gets the value of the cabinClassName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCabinClassName() {
        return cabinClassName;
    }

    /**
     * Sets the value of the cabinClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCabinClassName(JAXBElement<String> value) {
        this.cabinClassName = value;
    }

    /**
     * Gets the value of the columnNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getColumnNo() {
        return columnNo;
    }

    /**
     * Sets the value of the columnNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setColumnNo(JAXBElement<String> value) {
        this.columnNo = value;
    }

    /**
     * Gets the value of the isAisleSeat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAisleSeat() {
        return isAisleSeat;
    }

    /**
     * Sets the value of the isAisleSeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAisleSeat(Boolean value) {
        this.isAisleSeat = value;
    }

    /**
     * Gets the value of the isAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * Sets the value of the isAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAvailable(Boolean value) {
        this.isAvailable = value;
    }

    /**
     * Gets the value of the isBlockCISeat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBlockCISeat() {
        return isBlockCISeat;
    }

    /**
     * Sets the value of the isBlockCISeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBlockCISeat(Boolean value) {
        this.isBlockCISeat = value;
    }

    /**
     * Gets the value of the isBlockInfantAssignedPax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBlockInfantAssignedPax() {
        return isBlockInfantAssignedPax;
    }

    /**
     * Sets the value of the isBlockInfantAssignedPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBlockInfantAssignedPax(Boolean value) {
        this.isBlockInfantAssignedPax = value;
    }

    /**
     * Gets the value of the isBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBlocked() {
        return isBlocked;
    }

    /**
     * Sets the value of the isBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBlocked(Boolean value) {
        this.isBlocked = value;
    }

    /**
     * Gets the value of the isExitRow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExitRow() {
        return isExitRow;
    }

    /**
     * Sets the value of the isExitRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExitRow(Boolean value) {
        this.isExitRow = value;
    }

    /**
     * Gets the value of the isHideRow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHideRow() {
        return isHideRow;
    }

    /**
     * Sets the value of the isHideRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHideRow(Boolean value) {
        this.isHideRow = value;
    }

    /**
     * Gets the value of the isHotSeat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHotSeat() {
        return isHotSeat;
    }

    /**
     * Sets the value of the isHotSeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHotSeat(Boolean value) {
        this.isHotSeat = value;
    }

    /**
     * Gets the value of the isReserved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReserved() {
        return isReserved;
    }

    /**
     * Sets the value of the isReserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReserved(Boolean value) {
        this.isReserved = value;
    }

    /**
     * Gets the value of the isWingArea property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWingArea() {
        return isWingArea;
    }

    /**
     * Sets the value of the isWingArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWingArea(Boolean value) {
        this.isWingArea = value;
    }

    /**
     * Gets the value of the priceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APIAddonPriceInfo }{@code >}
     *     
     */
    public JAXBElement<APIAddonPriceInfo> getPriceInfo() {
        return priceInfo;
    }

    /**
     * Sets the value of the priceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APIAddonPriceInfo }{@code >}
     *     
     */
    public void setPriceInfo(JAXBElement<APIAddonPriceInfo> value) {
        this.priceInfo = value;
    }

    /**
     * Gets the value of the rowNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRowNo() {
        return rowNo;
    }

    /**
     * Sets the value of the rowNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRowNo(JAXBElement<String> value) {
        this.rowNo = value;
    }

    /**
     * Gets the value of the seatType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeatType() {
        return seatType;
    }

    /**
     * Sets the value of the seatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeatType(Integer value) {
        this.seatType = value;
    }

}
