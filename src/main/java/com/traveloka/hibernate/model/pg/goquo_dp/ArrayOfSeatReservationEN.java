
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSeatReservationEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSeatReservationEN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeatReservationEN" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}SeatReservationEN" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSeatReservationEN", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "seatReservationEN"
})
public class ArrayOfSeatReservationEN {

    @XmlElement(name = "SeatReservationEN", nillable = true)
    protected List<SeatReservationEN> seatReservationEN;

    /**
     * Gets the value of the seatReservationEN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatReservationEN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatReservationEN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatReservationEN }
     * 
     * 
     */
    public List<SeatReservationEN> getSeatReservationEN() {
        if (seatReservationEN == null) {
            seatReservationEN = new ArrayList<SeatReservationEN>();
        }
        return this.seatReservationEN;
    }

}
