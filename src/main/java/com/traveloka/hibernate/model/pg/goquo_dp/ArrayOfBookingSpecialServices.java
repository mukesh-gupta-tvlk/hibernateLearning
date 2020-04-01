
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBookingSpecialServices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBookingSpecialServices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingSpecialServices" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}BookingSpecialServices" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBookingSpecialServices", propOrder = {
    "bookingSpecialServices"
})
public class ArrayOfBookingSpecialServices {

    @XmlElement(name = "BookingSpecialServices", nillable = true)
    protected List<BookingSpecialServices> bookingSpecialServices;

    /**
     * Gets the value of the bookingSpecialServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingSpecialServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingSpecialServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingSpecialServices }
     * 
     * 
     */
    public List<BookingSpecialServices> getBookingSpecialServices() {
        if (bookingSpecialServices == null) {
            bookingSpecialServices = new ArrayList<BookingSpecialServices>();
        }
        return this.bookingSpecialServices;
    }

}
