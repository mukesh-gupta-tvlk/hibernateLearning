
package com.traveloka.hibernate.model.pg.goquo_dp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightSegment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefaultSelected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSelected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Segments" type="{http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL}ArrayOfGDS_FlightSegment" minOccurs="0"/>
 *         &lt;element name="Selected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TotalDurInMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegment", propOrder = {
    "defaultSelected",
    "index",
    "isSelected",
    "segments",
    "selected",
    "totalDurInMin",
    "totalDuration"
})
public class FlightSegment {

    @XmlElementRef(name = "DefaultSelected", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultSelected;
    @XmlElementRef(name = "Index", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> index;
    @XmlElement(name = "IsSelected")
    protected Boolean isSelected;
    @XmlElementRef(name = "Segments", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGDSFlightSegment> segments;
    @XmlElement(name = "Selected")
    protected Boolean selected;
    @XmlElement(name = "TotalDurInMin")
    protected Integer totalDurInMin;
    @XmlElementRef(name = "TotalDuration", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalDuration;

    /**
     * Gets the value of the defaultSelected property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultSelected() {
        return defaultSelected;
    }

    /**
     * Sets the value of the defaultSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultSelected(JAXBElement<String> value) {
        this.defaultSelected = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndex(JAXBElement<String> value) {
        this.index = value;
    }

    /**
     * Gets the value of the isSelected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSelected() {
        return isSelected;
    }

    /**
     * Sets the value of the isSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSelected(Boolean value) {
        this.isSelected = value;
    }

    /**
     * Gets the value of the segments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGDSFlightSegment }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGDSFlightSegment> getSegments() {
        return segments;
    }

    /**
     * Sets the value of the segments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGDSFlightSegment }{@code >}
     *     
     */
    public void setSegments(JAXBElement<ArrayOfGDSFlightSegment> value) {
        this.segments = value;
    }

    /**
     * Gets the value of the selected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelected() {
        return selected;
    }

    /**
     * Sets the value of the selected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelected(Boolean value) {
        this.selected = value;
    }

    /**
     * Gets the value of the totalDurInMin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalDurInMin() {
        return totalDurInMin;
    }

    /**
     * Sets the value of the totalDurInMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalDurInMin(Integer value) {
        this.totalDurInMin = value;
    }

    /**
     * Gets the value of the totalDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalDuration() {
        return totalDuration;
    }

    /**
     * Sets the value of the totalDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalDuration(JAXBElement<String> value) {
        this.totalDuration = value;
    }

}
