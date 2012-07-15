//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.09 at 10:44:27 AM MST 
//


package com.lo9ic.research.noaa.jaxb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for valueListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="valueListType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>numberValueListType">
 *       &lt;attribute name="median" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="confidenceInterval50" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="confidenceInterval80" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="skew80" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueListType", propOrder = {
    "value"
})
public class ValueListType {

    @XmlValue
    protected List<String> value;
    @XmlAttribute
    protected BigDecimal median;
    @XmlAttribute
    protected BigDecimal confidenceInterval50;
    @XmlAttribute
    protected BigDecimal confidenceInterval80;
    @XmlAttribute
    protected BigDecimal skew80;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return this.value;
    }

    /**
     * Gets the value of the median property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMedian() {
        return median;
    }

    /**
     * Sets the value of the median property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMedian(BigDecimal value) {
        this.median = value;
    }

    /**
     * Gets the value of the confidenceInterval50 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConfidenceInterval50() {
        return confidenceInterval50;
    }

    /**
     * Sets the value of the confidenceInterval50 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConfidenceInterval50(BigDecimal value) {
        this.confidenceInterval50 = value;
    }

    /**
     * Gets the value of the confidenceInterval80 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConfidenceInterval80() {
        return confidenceInterval80;
    }

    /**
     * Sets the value of the confidenceInterval80 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConfidenceInterval80(BigDecimal value) {
        this.confidenceInterval80 = value;
    }

    /**
     * Gets the value of the skew80 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSkew80() {
        return skew80;
    }

    /**
     * Sets the value of the skew80 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSkew80(BigDecimal value) {
        this.skew80 = value;
    }

}
