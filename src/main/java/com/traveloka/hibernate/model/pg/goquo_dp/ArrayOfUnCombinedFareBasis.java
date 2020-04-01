
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUnCombinedFareBasis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnCombinedFareBasis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnCombinedFareBasis" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}UnCombinedFareBasis" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUnCombinedFareBasis", propOrder = {
    "unCombinedFareBasis"
})
public class ArrayOfUnCombinedFareBasis {

    @XmlElement(name = "UnCombinedFareBasis", nillable = true)
    protected List<UnCombinedFareBasis> unCombinedFareBasis;

    /**
     * Gets the value of the unCombinedFareBasis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unCombinedFareBasis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnCombinedFareBasis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnCombinedFareBasis }
     * 
     * 
     */
    public List<UnCombinedFareBasis> getUnCombinedFareBasis() {
        if (unCombinedFareBasis == null) {
            unCombinedFareBasis = new ArrayList<UnCombinedFareBasis>();
        }
        return this.unCombinedFareBasis;
    }

}
