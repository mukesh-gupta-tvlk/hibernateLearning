
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGDS_FlightSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGDS_FlightSegment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GDS_FlightSegment" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}GDS_FlightSegment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGDS_FlightSegment", propOrder = {
    "gdsFlightSegment"
})
public class ArrayOfGDSFlightSegment {

    @XmlElement(name = "GDS_FlightSegment", nillable = true)
    protected List<GDSFlightSegment> gdsFlightSegment;

    /**
     * Gets the value of the gdsFlightSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gdsFlightSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGDSFlightSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GDSFlightSegment }
     * 
     * 
     */
    public List<GDSFlightSegment> getGDSFlightSegment() {
        if (gdsFlightSegment == null) {
            gdsFlightSegment = new ArrayList<GDSFlightSegment>();
        }
        return this.gdsFlightSegment;
    }

}
