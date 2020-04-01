
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_MultiCitySearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_MultiCitySearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Adult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Infants" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SearchCriteriaParams" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfAPI_SearchCriteriaParams" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_MultiCitySearchCriteria", propOrder = {
    "adult",
    "children",
    "infants",
    "searchCriteriaParams"
})
public class APIMultiCitySearchCriteria {

    @XmlElement(name = "Adult")
    protected Integer adult;
    @XmlElement(name = "Children")
    protected Integer children;
    @XmlElement(name = "Infants")
    protected Integer infants;
    @XmlElementRef(name = "SearchCriteriaParams", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAPISearchCriteriaParams> searchCriteriaParams;

    /**
     * Gets the value of the adult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdult() {
        return adult;
    }

    /**
     * Sets the value of the adult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdult(Integer value) {
        this.adult = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildren(Integer value) {
        this.children = value;
    }

    /**
     * Gets the value of the infants property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInfants() {
        return infants;
    }

    /**
     * Sets the value of the infants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInfants(Integer value) {
        this.infants = value;
    }

    /**
     * Gets the value of the searchCriteriaParams property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPISearchCriteriaParams }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAPISearchCriteriaParams> getSearchCriteriaParams() {
        return searchCriteriaParams;
    }

    /**
     * Sets the value of the searchCriteriaParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAPISearchCriteriaParams }{@code >}
     *     
     */
    public void setSearchCriteriaParams(JAXBElement<ArrayOfAPISearchCriteriaParams> value) {
        this.searchCriteriaParams = value;
    }

}
