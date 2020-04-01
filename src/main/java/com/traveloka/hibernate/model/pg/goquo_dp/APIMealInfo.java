
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for API_MealInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="API_MealInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MealCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MealId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MealName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}API_AddonPriceInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "API_MealInfo", propOrder = {
    "mealCode",
    "mealId",
    "mealName",
    "priceInfo"
})
public class APIMealInfo {

    @XmlElementRef(name = "MealCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mealCode;
    @XmlElement(name = "MealId")
    protected Integer mealId;
    @XmlElementRef(name = "MealName", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mealName;
    @XmlElementRef(name = "PriceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<APIAddonPriceInfo> priceInfo;

    /**
     * Gets the value of the mealCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMealCode() {
        return mealCode;
    }

    /**
     * Sets the value of the mealCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMealCode(JAXBElement<String> value) {
        this.mealCode = value;
    }

    /**
     * Gets the value of the mealId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMealId() {
        return mealId;
    }

    /**
     * Sets the value of the mealId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMealId(Integer value) {
        this.mealId = value;
    }

    /**
     * Gets the value of the mealName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMealName() {
        return mealName;
    }

    /**
     * Sets the value of the mealName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMealName(JAXBElement<String> value) {
        this.mealName = value;
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

}
