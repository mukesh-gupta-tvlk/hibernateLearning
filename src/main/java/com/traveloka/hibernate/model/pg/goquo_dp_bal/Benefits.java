
package com.traveloka.hibernate.model.pg.goquo_dp_bal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Benefits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Benefits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Benefitid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HtmlUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Benefits", propOrder = {
    "benefitid",
    "description",
    "htmlUrl",
    "name"
})
public class Benefits {

    @XmlElementRef(name = "Benefitid", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> benefitid;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "HtmlUrl", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> htmlUrl;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;

    /**
     * Gets the value of the benefitid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBenefitid() {
        return benefitid;
    }

    /**
     * Sets the value of the benefitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBenefitid(JAXBElement<String> value) {
        this.benefitid = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the htmlUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * Sets the value of the htmlUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHtmlUrl(JAXBElement<String> value) {
        this.htmlUrl = value;
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

}
