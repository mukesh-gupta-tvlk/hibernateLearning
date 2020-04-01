
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAirlineMLFlightLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAirlineMLFlightLeg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirlineMLFlightLeg" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}AirlineMLFlightLeg" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAirlineMLFlightLeg", propOrder = {
    "airlineMLFlightLeg"
})
public class ArrayOfAirlineMLFlightLeg {

    @XmlElement(name = "AirlineMLFlightLeg", nillable = true)
    protected List<AirlineMLFlightLeg> airlineMLFlightLeg;

    /**
     * Gets the value of the airlineMLFlightLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airlineMLFlightLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirlineMLFlightLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlineMLFlightLeg }
     * 
     * 
     */
    public List<AirlineMLFlightLeg> getAirlineMLFlightLeg() {
        if (airlineMLFlightLeg == null) {
            airlineMLFlightLeg = new ArrayList<AirlineMLFlightLeg>();
        }
        return this.airlineMLFlightLeg;
    }

}
