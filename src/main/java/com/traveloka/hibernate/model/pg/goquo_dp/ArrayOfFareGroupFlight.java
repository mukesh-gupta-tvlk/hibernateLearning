
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFareGroupFlight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFareGroupFlight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FareGroupFlight" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}FareGroupFlight" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFareGroupFlight", propOrder = {
    "fareGroupFlight"
})
public class ArrayOfFareGroupFlight {

    @XmlElement(name = "FareGroupFlight", nillable = true)
    protected List<FareGroupFlight> fareGroupFlight;

    /**
     * Gets the value of the fareGroupFlight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareGroupFlight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareGroupFlight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareGroupFlight }
     * 
     * 
     */
    public List<FareGroupFlight> getFareGroupFlight() {
        if (fareGroupFlight == null) {
            fareGroupFlight = new ArrayList<FareGroupFlight>();
        }
        return this.fareGroupFlight;
    }

}
