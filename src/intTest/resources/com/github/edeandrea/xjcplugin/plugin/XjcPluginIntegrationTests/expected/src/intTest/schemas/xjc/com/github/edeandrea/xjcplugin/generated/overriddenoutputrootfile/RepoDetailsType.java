//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.04 at 02:26:25 PM EST 
//


package com.github.edeandrea.xjcplugin.generated.overriddenoutputrootfile;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for repoDetailsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="repoDetailsType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOCAL"/&gt;
 *     &lt;enumeration value="REMOTE"/&gt;
 *     &lt;enumeration value="VIRTUAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "repoDetailsType")
@XmlEnum
public enum RepoDetailsType {

    LOCAL,
    REMOTE,
    VIRTUAL;

    public String value() {
        return name();
    }

    public static RepoDetailsType fromValue(String v) {
        return valueOf(v);
    }

}