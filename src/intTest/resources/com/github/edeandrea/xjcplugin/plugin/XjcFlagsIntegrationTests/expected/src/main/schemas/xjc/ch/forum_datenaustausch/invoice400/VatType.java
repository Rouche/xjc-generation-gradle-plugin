//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.10 at 11:25:14 AM EST 
//


package ch.forum_datenaustausch.invoice400;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vatType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vat_rate" type="{http://www.forum-datenaustausch.ch/de}vatRateType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="vat_number" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="vat" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vatType", propOrder = {
    "vatRate"
})
public class VatType {

    @XmlElement(name = "vat_rate", required = true)
    protected List<VatRateType> vatRate;
    @XmlAttribute(name = "vat_number")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger vatNumber;
    @XmlAttribute(name = "vat", required = true)
    protected double vat;

    /**
     * Gets the value of the vatRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vatRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVatRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VatRateType }
     * 
     * 
     */
    public List<VatRateType> getVatRate() {
        if (vatRate == null) {
            vatRate = new ArrayList<VatRateType>();
        }
        return this.vatRate;
    }

    /**
     * Gets the value of the vatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVatNumber() {
        return vatNumber;
    }

    /**
     * Sets the value of the vatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVatNumber(BigInteger value) {
        this.vatNumber = value;
    }

    /**
     * Gets the value of the vat property.
     * 
     */
    public double getVat() {
        return vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     */
    public void setVat(double value) {
        this.vat = value;
    }

}
