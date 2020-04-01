
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAPI_SelectedLounge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAPI_SelectedLounge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="API_SelectedLounge" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}API_SelectedLounge" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAPI_SelectedLounge", propOrder = {
    "apiSelectedLounge"
})
public class ArrayOfAPISelectedLounge {

    @XmlElement(name = "API_SelectedLounge", nillable = true)
    protected List<APISelectedLounge> apiSelectedLounge;

    /**
     * Gets the value of the apiSelectedLounge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apiSelectedLounge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAPISelectedLounge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APISelectedLounge }
     * 
     * 
     */
    public List<APISelectedLounge> getAPISelectedLounge() {
        if (apiSelectedLounge == null) {
            apiSelectedLounge = new ArrayList<APISelectedLounge>();
        }
        return this.apiSelectedLounge;
    }

}
