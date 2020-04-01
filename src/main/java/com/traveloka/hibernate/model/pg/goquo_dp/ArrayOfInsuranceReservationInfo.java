
package com.traveloka.hibernate.model.pg.goquo_dp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInsuranceReservationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInsuranceReservationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuranceReservationInfo" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}InsuranceReservationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInsuranceReservationInfo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", propOrder = {
    "insuranceReservationInfo"
})
public class ArrayOfInsuranceReservationInfo {

    @XmlElement(name = "InsuranceReservationInfo", nillable = true)
    protected List<InsuranceReservationInfo> insuranceReservationInfo;

    /**
     * Gets the value of the insuranceReservationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuranceReservationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuranceReservationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceReservationInfo }
     * 
     * 
     */
    public List<InsuranceReservationInfo> getInsuranceReservationInfo() {
        if (insuranceReservationInfo == null) {
            insuranceReservationInfo = new ArrayList<InsuranceReservationInfo>();
        }
        return this.insuranceReservationInfo;
    }

}
