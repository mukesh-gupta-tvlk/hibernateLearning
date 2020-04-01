
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialTypePaxCount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialTypePaxCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NoDisabled" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoGovtCompPax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoGovtPax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoSnrCitizens" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoStudents" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoWomens" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialTypePaxCount", propOrder = {
    "noDisabled",
    "noGovtCompPax",
    "noGovtPax",
    "noSnrCitizens",
    "noStudents",
    "noWomens"
})
public class SpecialTypePaxCount {

    @XmlElement(name = "NoDisabled")
    protected Integer noDisabled;
    @XmlElement(name = "NoGovtCompPax")
    protected Integer noGovtCompPax;
    @XmlElement(name = "NoGovtPax")
    protected Integer noGovtPax;
    @XmlElement(name = "NoSnrCitizens")
    protected Integer noSnrCitizens;
    @XmlElement(name = "NoStudents")
    protected Integer noStudents;
    @XmlElement(name = "NoWomens")
    protected Integer noWomens;

    /**
     * Gets the value of the noDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoDisabled() {
        return noDisabled;
    }

    /**
     * Sets the value of the noDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoDisabled(Integer value) {
        this.noDisabled = value;
    }

    /**
     * Gets the value of the noGovtCompPax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoGovtCompPax() {
        return noGovtCompPax;
    }

    /**
     * Sets the value of the noGovtCompPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoGovtCompPax(Integer value) {
        this.noGovtCompPax = value;
    }

    /**
     * Gets the value of the noGovtPax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoGovtPax() {
        return noGovtPax;
    }

    /**
     * Sets the value of the noGovtPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoGovtPax(Integer value) {
        this.noGovtPax = value;
    }

    /**
     * Gets the value of the noSnrCitizens property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoSnrCitizens() {
        return noSnrCitizens;
    }

    /**
     * Sets the value of the noSnrCitizens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoSnrCitizens(Integer value) {
        this.noSnrCitizens = value;
    }

    /**
     * Gets the value of the noStudents property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoStudents() {
        return noStudents;
    }

    /**
     * Sets the value of the noStudents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoStudents(Integer value) {
        this.noStudents = value;
    }

    /**
     * Gets the value of the noWomens property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoWomens() {
        return noWomens;
    }

    /**
     * Sets the value of the noWomens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoWomens(Integer value) {
        this.noWomens = value;
    }

}
