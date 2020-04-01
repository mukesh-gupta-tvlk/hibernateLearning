
package com.traveloka.hibernate.model.pg.goquo_dp_bal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLoyaltyPaxSectorPriceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLoyaltyPaxSectorPriceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyPaxSectorPriceInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Loyalty}LoyaltyPaxSectorPriceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLoyaltyPaxSectorPriceInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL.Loyalty", propOrder = {
    "loyaltyPaxSectorPriceInfo"
})
public class ArrayOfLoyaltyPaxSectorPriceInfo {

    @XmlElement(name = "LoyaltyPaxSectorPriceInfo", nillable = true)
    protected List<LoyaltyPaxSectorPriceInfo> loyaltyPaxSectorPriceInfo;

    /**
     * Gets the value of the loyaltyPaxSectorPriceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyPaxSectorPriceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyPaxSectorPriceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyPaxSectorPriceInfo }
     * 
     * 
     */
    public List<LoyaltyPaxSectorPriceInfo> getLoyaltyPaxSectorPriceInfo() {
        if (loyaltyPaxSectorPriceInfo == null) {
            loyaltyPaxSectorPriceInfo = new ArrayList<LoyaltyPaxSectorPriceInfo>();
        }
        return this.loyaltyPaxSectorPriceInfo;
    }

}
