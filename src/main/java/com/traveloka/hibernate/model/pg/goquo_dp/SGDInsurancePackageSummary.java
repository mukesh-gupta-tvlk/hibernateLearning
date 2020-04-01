
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SGDInsurancePackageSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SGDInsurancePackageSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsurancePackageSummary" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}PackageSummary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SGDInsurancePackageSummary", propOrder = {
    "insurancePackageSummary"
})
public class SGDInsurancePackageSummary {

    @XmlElementRef(name = "InsurancePackageSummary", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<PackageSummary> insurancePackageSummary;

    /**
     * Gets the value of the insurancePackageSummary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PackageSummary }{@code >}
     *     
     */
    public JAXBElement<PackageSummary> getInsurancePackageSummary() {
        return insurancePackageSummary;
    }

    /**
     * Sets the value of the insurancePackageSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PackageSummary }{@code >}
     *     
     */
    public void setInsurancePackageSummary(JAXBElement<PackageSummary> value) {
        this.insurancePackageSummary = value;
    }

}
