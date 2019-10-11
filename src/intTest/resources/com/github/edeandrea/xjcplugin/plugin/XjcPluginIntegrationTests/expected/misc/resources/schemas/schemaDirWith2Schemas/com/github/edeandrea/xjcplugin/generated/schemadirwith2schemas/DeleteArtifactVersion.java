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
 * <p>Java class for deleteArtifactVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteArtifactVersion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}baseArtifact"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="directoriesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repoPaths" type="{}repoKeyPath" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteArtifactVersion", propOrder = {
    "directoriesCount",
    "groupId",
    "repoPaths",
    "version"
})
public class DeleteArtifactVersion
    extends BaseArtifact
    implements Serializable
{

    protected Integer directoriesCount;
    protected String groupId;
    @XmlElement(nillable = true)
    protected List<RepoKeyPath> repoPaths;
    protected String version;

    /**
     * Gets the value of the directoriesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirectoriesCount() {
        return directoriesCount;
    }

    /**
     * Sets the value of the directoriesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirectoriesCount(Integer value) {
        this.directoriesCount = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the repoPaths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repoPaths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepoPaths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepoKeyPath }
     * 
     * 
     */
    public List<RepoKeyPath> getRepoPaths() {
        if (repoPaths == null) {
            repoPaths = new ArrayList<RepoKeyPath>();
        }
        return this.repoPaths;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
