
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsentEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsentEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsAddressEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCallCenterEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsNewsLetterMailEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsOffersEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSMSMMSEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSurvayEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTermsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsentEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "isAddressEnabled",
    "isCallCenterEnabled",
    "isNewsLetterMailEnabled",
    "isOffersEnabled",
    "isSMSMMSEnabled",
    "isSurvayEnabled",
    "isTermsEnabled"
})
public class ConsentEN {

    @XmlElement(name = "IsAddressEnabled")
    protected Boolean isAddressEnabled;
    @XmlElement(name = "IsCallCenterEnabled")
    protected Boolean isCallCenterEnabled;
    @XmlElement(name = "IsNewsLetterMailEnabled")
    protected Boolean isNewsLetterMailEnabled;
    @XmlElement(name = "IsOffersEnabled")
    protected Boolean isOffersEnabled;
    @XmlElement(name = "IsSMSMMSEnabled")
    protected Boolean isSMSMMSEnabled;
    @XmlElement(name = "IsSurvayEnabled")
    protected Boolean isSurvayEnabled;
    @XmlElement(name = "IsTermsEnabled")
    protected Boolean isTermsEnabled;

    /**
     * Gets the value of the isAddressEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAddressEnabled() {
        return isAddressEnabled;
    }

    /**
     * Sets the value of the isAddressEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAddressEnabled(Boolean value) {
        this.isAddressEnabled = value;
    }

    /**
     * Gets the value of the isCallCenterEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCallCenterEnabled() {
        return isCallCenterEnabled;
    }

    /**
     * Sets the value of the isCallCenterEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCallCenterEnabled(Boolean value) {
        this.isCallCenterEnabled = value;
    }

    /**
     * Gets the value of the isNewsLetterMailEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNewsLetterMailEnabled() {
        return isNewsLetterMailEnabled;
    }

    /**
     * Sets the value of the isNewsLetterMailEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNewsLetterMailEnabled(Boolean value) {
        this.isNewsLetterMailEnabled = value;
    }

    /**
     * Gets the value of the isOffersEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOffersEnabled() {
        return isOffersEnabled;
    }

    /**
     * Sets the value of the isOffersEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOffersEnabled(Boolean value) {
        this.isOffersEnabled = value;
    }

    /**
     * Gets the value of the isSMSMMSEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSMSMMSEnabled() {
        return isSMSMMSEnabled;
    }

    /**
     * Sets the value of the isSMSMMSEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSMSMMSEnabled(Boolean value) {
        this.isSMSMMSEnabled = value;
    }

    /**
     * Gets the value of the isSurvayEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSurvayEnabled() {
        return isSurvayEnabled;
    }

    /**
     * Sets the value of the isSurvayEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSurvayEnabled(Boolean value) {
        this.isSurvayEnabled = value;
    }

    /**
     * Gets the value of the isTermsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTermsEnabled() {
        return isTermsEnabled;
    }

    /**
     * Sets the value of the isTermsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTermsEnabled(Boolean value) {
        this.isTermsEnabled = value;
    }

}
