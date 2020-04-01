
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_InsuranceAvailability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_InsuranceAvailability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsDefaultSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}API_AddonPriceInfo" minOccurs="0"/>
 *         &lt;element name="URLs" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfAPI_InsuranceURL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_InsuranceAvailability", propOrder = {
    "isDefaultSelected",
    "name",
    "priceInfo",
    "urLs"
})
public class APIInsuranceAvailability {

    @XmlElement(name = "IsDefaultSelected")
    protected Boolean isDefaultSelected;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "PriceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<APIAddonPriceInfo> priceInfo;
    @XmlElementRef(name = "URLs", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAPIInsuranceURL> urLs;

    /**
     * Gets the value of the isDefaultSelected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefaultSelected() {
        return isDefaultSelected;
    }

    /**
     * Sets the value of the isDefaultSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefaultSelected(Boolean value) {
        this.isDefaultSelected = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
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
     * Gets the value of the urLs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPIInsuranceURL }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAPIInsuranceURL> getURLs() {
        return urLs;
    }

    /**
     * Sets the value of the urLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPIInsuranceURL }{@code >}
     *     
     */
    public void setURLs(JAXBElement<ArrayOfAPIInsuranceURL> value) {
        this.urLs = value;
    }

}
