
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAPIRoutesEn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAPIRoutesEn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APIRoutesEn" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}APIRoutesEn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAPIRoutesEn", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "apiRoutesEn"
})
public class ArrayOfAPIRoutesEn {

    @XmlElement(name = "APIRoutesEn", nillable = true)
    protected List<APIRoutesEn> apiRoutesEn;

    /**
     * Gets the value of the apiRoutesEn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apiRoutesEn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAPIRoutesEn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIRoutesEn }
     * 
     * 
     */
    public List<APIRoutesEn> getAPIRoutesEn() {
        if (apiRoutesEn == null) {
            apiRoutesEn = new ArrayList<APIRoutesEn>();
        }
        return this.apiRoutesEn;
    }

}
