
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_AddonSetSelectedRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_AddonSetSelectedRes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SelectedAddons" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}API_AddonSetSelectedReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_AddonSetSelectedRes", propOrder = {
    "errorMsg",
    "isError",
    "selectedAddons"
})
public class APIAddonSetSelectedRes {

    @XmlElementRef(name = "ErrorMsg", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorMsg;
    @XmlElement(name = "IsError")
    protected Boolean isError;
    @XmlElementRef(name = "SelectedAddons", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<APIAddonSetSelectedReq> selectedAddons;

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMsg(JAXBElement<String> value) {
        this.errorMsg = value;
    }

    /**
     * Gets the value of the isError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsError() {
        return isError;
    }

    /**
     * Sets the value of the isError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsError(Boolean value) {
        this.isError = value;
    }

    /**
     * Gets the value of the selectedAddons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APIAddonSetSelectedReq }{@code >}
     *     
     */
    public JAXBElement<APIAddonSetSelectedReq> getSelectedAddons() {
        return selectedAddons;
    }

    /**
     * Sets the value of the selectedAddons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APIAddonSetSelectedReq }{@code >}
     *     
     */
    public void setSelectedAddons(JAXBElement<APIAddonSetSelectedReq> value) {
        this.selectedAddons = value;
    }

}
