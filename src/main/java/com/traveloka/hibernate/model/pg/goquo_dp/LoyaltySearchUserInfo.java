
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltySearchUserInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltySearchUserInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BinNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DiscountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FFMemberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoyaltySearchSettingsID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MemberTier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MilesType" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Utils}MilesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltySearchUserInfo", propOrder = {
    "availBalance",
    "binNumber",
    "discountCode",
    "ffMemberID",
    "loyaltySearchSettingsID",
    "memberTier",
    "milesType"
})
public class LoyaltySearchUserInfo {

    @XmlElement(name = "AvailBalance")
    protected BigDecimal availBalance;
    @XmlElementRef(name = "BinNumber", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> binNumber;
    @XmlElementRef(name = "DiscountCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> discountCode;
    @XmlElementRef(name = "FFMemberID", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ffMemberID;
    @XmlElement(name = "LoyaltySearchSettingsID")
    protected Long loyaltySearchSettingsID;
    @XmlElementRef(name = "MemberTier", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memberTier;
    @XmlElement(name = "MilesType")
    @XmlSchemaType(name = "string")
    protected MilesType milesType;

    /**
     * Gets the value of the availBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailBalance() {
        return availBalance;
    }

    /**
     * Sets the value of the availBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailBalance(BigDecimal value) {
        this.availBalance = value;
    }

    /**
     * Gets the value of the binNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBinNumber() {
        return binNumber;
    }

    /**
     * Sets the value of the binNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBinNumber(JAXBElement<String> value) {
        this.binNumber = value;
    }

    /**
     * Gets the value of the discountCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDiscountCode() {
        return discountCode;
    }

    /**
     * Sets the value of the discountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDiscountCode(JAXBElement<String> value) {
        this.discountCode = value;
    }

    /**
     * Gets the value of the ffMemberID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFFMemberID() {
        return ffMemberID;
    }

    /**
     * Sets the value of the ffMemberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFFMemberID(JAXBElement<String> value) {
        this.ffMemberID = value;
    }

    /**
     * Gets the value of the loyaltySearchSettingsID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLoyaltySearchSettingsID() {
        return loyaltySearchSettingsID;
    }

    /**
     * Sets the value of the loyaltySearchSettingsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLoyaltySearchSettingsID(Long value) {
        this.loyaltySearchSettingsID = value;
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
     * Gets the value of the milesType property.
     * 
     * @return
     *     possible object is
     *     {@link MilesType }
     *     
     */
    public MilesType getMilesType() {
        return milesType;
    }

    /**
     * Sets the value of the milesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MilesType }
     *     
     */
    public void setMilesType(MilesType value) {
        this.milesType = value;
    }

}
