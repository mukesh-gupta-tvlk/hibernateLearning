
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdultPerPaxPromo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ChildPerPaxPromo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrencyRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DisabledPerPaxPromo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GovernmentPerPaxPromo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InfantPerPaxPromo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PromotionSettings" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}PromotionSettingsEN" minOccurs="0"/>
 *         &lt;element name="SnrCitizenPerPaxPromo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StudentPerPaxPromo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WomenPerPaxPromo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionInfo", propOrder = {
    "adultPerPaxPromo",
    "childPerPaxPromo",
    "currencyRatio",
    "disabledPerPaxPromo",
    "governmentPerPaxPromo",
    "infantPerPaxPromo",
    "promotionSettings",
    "snrCitizenPerPaxPromo",
    "studentPerPaxPromo",
    "womenPerPaxPromo"
})
public class PromotionInfo {

    @XmlElement(name = "AdultPerPaxPromo")
    protected BigDecimal adultPerPaxPromo;
    @XmlElement(name = "ChildPerPaxPromo")
    protected BigDecimal childPerPaxPromo;
    @XmlElement(name = "CurrencyRatio")
    protected BigDecimal currencyRatio;
    @XmlElement(name = "DisabledPerPaxPromo")
    protected BigDecimal disabledPerPaxPromo;
    @XmlElement(name = "GovernmentPerPaxPromo")
    protected BigDecimal governmentPerPaxPromo;
    @XmlElement(name = "InfantPerPaxPromo")
    protected BigDecimal infantPerPaxPromo;
    @XmlElementRef(name = "PromotionSettings", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<PromotionSettingsEN> promotionSettings;
    @XmlElement(name = "SnrCitizenPerPaxPromo")
    protected BigDecimal snrCitizenPerPaxPromo;
    @XmlElement(name = "StudentPerPaxPromo")
    protected BigDecimal studentPerPaxPromo;
    @XmlElement(name = "WomenPerPaxPromo")
    protected BigDecimal womenPerPaxPromo;

    /**
     * Gets the value of the adultPerPaxPromo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdultPerPaxPromo() {
        return adultPerPaxPromo;
    }

    /**
     * Sets the value of the adultPerPaxPromo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdultPerPaxPromo(BigDecimal value) {
        this.adultPerPaxPromo = value;
    }

    /**
     * Gets the value of the childPerPaxPromo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChildPerPaxPromo() {
        return childPerPaxPromo;
    }

    /**
     * Sets the value of the childPerPaxPromo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChildPerPaxPromo(BigDecimal value) {
        this.childPerPaxPromo = value;
    }

    /**
     * Gets the value of the currencyRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyRatio() {
        return currencyRatio;
    }

    /**
     * Sets the value of the currencyRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyRatio(BigDecimal value) {
        this.currencyRatio = value;
    }

    /**
     * Gets the value of the disabledPerPaxPromo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisabledPerPaxPromo() {
        return disabledPerPaxPromo;
    }

    /**
     * Sets the value of the disabledPerPaxPromo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisabledPerPaxPromo(BigDecimal value) {
        this.disabledPerPaxPromo = value;
    }

    /**
     * Gets the value of the governmentPerPaxPromo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGovernmentPerPaxPromo() {
        return governmentPerPaxPromo;
    }

    /**
     * Sets the value of the governmentPerPaxPromo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGovernmentPerPaxPromo(BigDecimal value) {
        this.governmentPerPaxPromo = value;
    }

    /**
     * Gets the value of the infantPerPaxPromo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInfantPerPaxPromo() {
        return infantPerPaxPromo;
    }

    /**
     * Sets the value of the infantPerPaxPromo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInfantPerPaxPromo(BigDecimal value) {
        this.infantPerPaxPromo = value;
    }

    /**
     * Gets the value of the promotionSettings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PromotionSettingsEN }{@code >}
     *     
     */
    public JAXBElement<PromotionSettingsEN> getPromotionSettings() {
        return promotionSettings;
    }

    /**
     * Sets the value of the promotionSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PromotionSettingsEN }{@code >}
     *     
     */
    public void setPromotionSettings(JAXBElement<PromotionSettingsEN> value) {
        this.promotionSettings = value;
    }

    /**
     * Gets the value of the snrCitizenPerPaxPromo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSnrCitizenPerPaxPromo() {
        return snrCitizenPerPaxPromo;
    }

    /**
     * Sets the value of the snrCitizenPerPaxPromo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSnrCitizenPerPaxPromo(BigDecimal value) {
        this.snrCitizenPerPaxPromo = value;
    }

    /**
     * Gets the value of the studentPerPaxPromo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStudentPerPaxPromo() {
        return studentPerPaxPromo;
    }

    /**
     * Sets the value of the studentPerPaxPromo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStudentPerPaxPromo(BigDecimal value) {
        this.studentPerPaxPromo = value;
    }

    /**
     * Gets the value of the womenPerPaxPromo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWomenPerPaxPromo() {
        return womenPerPaxPromo;
    }

    /**
     * Sets the value of the womenPerPaxPromo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWomenPerPaxPromo(BigDecimal value) {
        this.womenPerPaxPromo = value;
    }

}
