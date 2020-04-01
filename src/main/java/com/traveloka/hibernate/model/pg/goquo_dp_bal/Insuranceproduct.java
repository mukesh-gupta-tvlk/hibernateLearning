
package com.traveloka.hibernate.model.pg.goquo_dp_bal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Insuranceproduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Insuranceproduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuoteReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VariantCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Insuranceproduct", propOrder = {
    "id",
    "offerId",
    "productCode",
    "quoteReference",
    "variantCode"
})
public class Insuranceproduct {

    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "OfferId", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> offerId;
    @XmlElementRef(name = "ProductCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productCode;
    @XmlElementRef(name = "QuoteReference", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quoteReference;
    @XmlElementRef(name = "VariantCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Insurances", type = JAXBElement.class, required = false)
    protected JAXBElement<String> variantCode;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = value;
    }

    /**
     * Gets the value of the offerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfferId(JAXBElement<String> value) {
        this.offerId = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductCode(JAXBElement<String> value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the quoteReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuoteReference() {
        return quoteReference;
    }

    /**
     * Sets the value of the quoteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuoteReference(JAXBElement<String> value) {
        this.quoteReference = value;
    }

    /**
     * Gets the value of the variantCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVariantCode() {
        return variantCode;
    }

    /**
     * Sets the value of the variantCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVariantCode(JAXBElement<String> value) {
        this.variantCode = value;
    }

}
