
package com.traveloka.hibernate.model.pg.goquo_dp_bal;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyPriceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyPriceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalAwardFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalBookingFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalCashTobePaid" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalLoyaltyPoints" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalYQ" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lstPaxSectorPriceInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Loyalty}ArrayOfLoyaltyPaxSectorPriceInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyPriceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Loyalty", propOrder = {
    "totalAwardFee",
    "totalBookingFee",
    "totalCashTobePaid",
    "totalLoyaltyPoints",
    "totalYQ",
    "lstPaxSectorPriceInfo"
})
public class LoyaltyPriceInfo {

    @XmlElement(name = "TotalAwardFee")
    protected BigDecimal totalAwardFee;
    @XmlElement(name = "TotalBookingFee")
    protected BigDecimal totalBookingFee;
    @XmlElement(name = "TotalCashTobePaid")
    protected BigDecimal totalCashTobePaid;
    @XmlElement(name = "TotalLoyaltyPoints")
    protected BigDecimal totalLoyaltyPoints;
    @XmlElement(name = "TotalYQ")
    protected BigDecimal totalYQ;
    @XmlElementRef(name = "lstPaxSectorPriceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Loyalty", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLoyaltyPaxSectorPriceInfo> lstPaxSectorPriceInfo;

    /**
     * Gets the value of the totalAwardFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAwardFee() {
        return totalAwardFee;
    }

    /**
     * Sets the value of the totalAwardFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAwardFee(BigDecimal value) {
        this.totalAwardFee = value;
    }

    /**
     * Gets the value of the totalBookingFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalBookingFee() {
        return totalBookingFee;
    }

    /**
     * Sets the value of the totalBookingFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalBookingFee(BigDecimal value) {
        this.totalBookingFee = value;
    }

    /**
     * Gets the value of the totalCashTobePaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCashTobePaid() {
        return totalCashTobePaid;
    }

    /**
     * Sets the value of the totalCashTobePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCashTobePaid(BigDecimal value) {
        this.totalCashTobePaid = value;
    }

    /**
     * Gets the value of the totalLoyaltyPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLoyaltyPoints() {
        return totalLoyaltyPoints;
    }

    /**
     * Sets the value of the totalLoyaltyPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalLoyaltyPoints(BigDecimal value) {
        this.totalLoyaltyPoints = value;
    }

    /**
     * Gets the value of the totalYQ property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalYQ() {
        return totalYQ;
    }

    /**
     * Sets the value of the totalYQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalYQ(BigDecimal value) {
        this.totalYQ = value;
    }

    /**
     * Gets the value of the lstPaxSectorPriceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLoyaltyPaxSectorPriceInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLoyaltyPaxSectorPriceInfo> getLstPaxSectorPriceInfo() {
        return lstPaxSectorPriceInfo;
    }

    /**
     * Sets the value of the lstPaxSectorPriceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLoyaltyPaxSectorPriceInfo }{@code >}
     *     
     */
    public void setLstPaxSectorPriceInfo(JAXBElement<ArrayOfLoyaltyPaxSectorPriceInfo> value) {
        this.lstPaxSectorPriceInfo = value;
    }

}
