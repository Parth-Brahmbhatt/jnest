//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.09 at 10:44:27 AM MST 
//


package com.lo9ic.research.noaa.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for valueForRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="valueForRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{}percentageValType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{}gt" minOccurs="0"/>
 *           &lt;element ref="{}ge" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{}lt" minOccurs="0"/>
 *           &lt;element ref="{}le" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{}eq" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueForRangeType", propOrder = {
    "value",
    "gt",
    "ge",
    "lt",
    "le",
    "eq"
})
public class ValueForRangeType {

    @XmlElement(nillable = true)
    protected List<PercentageValType> value;
    @XmlList
    protected List<String> gt;
    @XmlList
    protected List<String> ge;
    @XmlList
    protected List<String> lt;
    @XmlList
    protected List<String> le;
    @XmlList
    protected List<String> eq;

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
     * {@link PercentageValType }
     * 
     * 
     */
    public List<PercentageValType> getValue() {
        if (value == null) {
            value = new ArrayList<PercentageValType>();
        }
        return this.value;
    }

    /**
     * Gets the value of the gt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGt() {
        if (gt == null) {
            gt = new ArrayList<String>();
        }
        return this.gt;
    }

    /**
     * Gets the value of the ge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGe() {
        if (ge == null) {
            ge = new ArrayList<String>();
        }
        return this.ge;
    }

    /**
     * Gets the value of the lt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLt() {
        if (lt == null) {
            lt = new ArrayList<String>();
        }
        return this.lt;
    }

    /**
     * Gets the value of the le property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the le property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLe() {
        if (le == null) {
            le = new ArrayList<String>();
        }
        return this.le;
    }

    /**
     * Gets the value of the eq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEq() {
        if (eq == null) {
            eq = new ArrayList<String>();
        }
        return this.eq;
    }

}
