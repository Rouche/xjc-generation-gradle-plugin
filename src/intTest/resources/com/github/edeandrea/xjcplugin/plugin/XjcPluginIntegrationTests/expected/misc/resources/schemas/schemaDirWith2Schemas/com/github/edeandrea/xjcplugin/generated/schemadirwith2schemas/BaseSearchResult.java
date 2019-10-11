//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.11 at 03:49:13 PM EDT 
//


package com.github.edeandrea.xjcplugin.generated.schemadirwith2schemas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseSearchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}baseModel"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="downloadLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="modifiedString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repoKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseSearchResult", propOrder = {
    "actions",
    "downloadLink",
    "modifiedDate",
    "modifiedString",
    "name",
    "repoKey"
})
public abstract class BaseSearchResult
    extends BaseModel
    implements Serializable
{

    @XmlElement(nillable = true)
    protected List<String> actions;
    protected String downloadLink;
    protected long modifiedDate;
    protected String modifiedString;
    protected String name;
    protected String repoKey;

    /**
     * Gets the value of the actions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getActions() {
        if (actions == null) {
            actions = new ArrayList<String>();
        }
        return this.actions;
    }

    /**
     * Gets the value of the downloadLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadLink() {
        return downloadLink;
    }

    /**
     * Sets the value of the downloadLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadLink(String value) {
        this.downloadLink = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     */
    public long getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     */
    public void setModifiedDate(long value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the modifiedString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedString() {
        return modifiedString;
    }

    /**
     * Sets the value of the modifiedString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedString(String value) {
        this.modifiedString = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the repoKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepoKey() {
        return repoKey;
    }

    /**
     * Sets the value of the repoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepoKey(String value) {
        this.repoKey = value;
    }

}
