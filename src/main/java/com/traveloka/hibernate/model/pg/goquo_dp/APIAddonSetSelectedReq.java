
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_AddonSetSelectedReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_AddonSetSelectedReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuranceSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsInsuranceSelectionSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaxSelectedAddons" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfAPI_PaxSelectedAddOn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_AddonSetSelectedReq", propOrder = {
    "insuranceSelected",
    "isInsuranceSelectionSuccess",
    "paxSelectedAddons"
})
public class APIAddonSetSelectedReq {

    @XmlElement(name = "InsuranceSelected")
    protected Boolean insuranceSelected;
    @XmlElement(name = "IsInsuranceSelectionSuccess")
    protected Boolean isInsuranceSelectionSuccess;
    @XmlElementRef(name = "PaxSelectedAddons", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAPIPaxSelectedAddOn> paxSelectedAddons;

    /**
     * Gets the value of the insuranceSelected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsuranceSelected() {
        return insuranceSelected;
    }

    /**
     * Sets the value of the insuranceSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsuranceSelected(Boolean value) {
        this.insuranceSelected = value;
    }

    /**
     * Gets the value of the isInsuranceSelectionSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInsuranceSelectionSuccess() {
        return isInsuranceSelectionSuccess;
    }

    /**
     * Sets the value of the isInsuranceSelectionSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInsuranceSelectionSuccess(Boolean value) {
        this.isInsuranceSelectionSuccess = value;
    }

    /**
     * Gets the value of the paxSelectedAddons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPIPaxSelectedAddOn }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAPIPaxSelectedAddOn> getPaxSelectedAddons() {
        return paxSelectedAddons;
    }

    /**
     * Sets the value of the paxSelectedAddons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPIPaxSelectedAddOn }{@code >}
     *     
     */
    public void setPaxSelectedAddons(JAXBElement<ArrayOfAPIPaxSelectedAddOn> value) {
        this.paxSelectedAddons = value;
    }

}
