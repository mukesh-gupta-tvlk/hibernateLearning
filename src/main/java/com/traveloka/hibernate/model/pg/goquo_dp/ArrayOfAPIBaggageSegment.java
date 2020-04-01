
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAPI_BaggageSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAPI_BaggageSegment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="API_BaggageSegment" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}API_BaggageSegment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAPI_BaggageSegment", propOrder = {
    "apiBaggageSegment"
})
public class ArrayOfAPIBaggageSegment {

    @XmlElement(name = "API_BaggageSegment", nillable = true)
    protected List<APIBaggageSegment> apiBaggageSegment;

    /**
     * Gets the value of the apiBaggageSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apiBaggageSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAPIBaggageSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIBaggageSegment }
     * 
     * 
     */
    public List<APIBaggageSegment> getAPIBaggageSegment() {
        if (apiBaggageSegment == null) {
            apiBaggageSegment = new ArrayList<APIBaggageSegment>();
        }
        return this.apiBaggageSegment;
    }

}
