/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2013 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.19 at 01:44:12 PM BST 
//

package org.orcid.jaxb.model.message;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}name"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}type" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}address"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}department-name" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}role-title" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}start-date" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}end-date" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}source" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}disambiguated-affiliation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}put-code"/>
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}visibility"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "putCode", "affiliationName", "affiliationType", "affiliationAddress", "departmentName", "roleTitle", "startDate", "endDate", "source",
        "disambiguatedAffiliation" })
@XmlRootElement(name = "affiliation")
public class Affiliation implements Serializable, VisibilityType {

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "name", required = true)
    protected String affiliationName;
    @XmlElement(name = "type")
    protected AffiliationType affiliationType;
    @XmlElement(name = "address", required = true)
    protected AffiliationAddress affiliationAddress;
    @XmlElement(name = "department-name")
    protected String departmentName;
    @XmlElement(name = "role-title")
    protected String roleTitle;
    @XmlElement(name = "start-date")
    protected FuzzyDate startDate;
    @XmlElement(name = "end-date")
    protected FuzzyDate endDate;
    protected Source source;
    @XmlElement(name = "disambiguated-affiliation")
    protected DisambiguatedAffiliation disambiguatedAffiliation;
    @XmlAttribute(name = "put-code")
    protected String putCode;
    @XmlAttribute(name = "visibility")
    protected Visibility visibility;

    /**
     * Gets the value of the affiliationName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAffiliationName() {
        return affiliationName;
    }

    /**
     * Sets the value of the affiliationName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAffiliationName(String value) {
        this.affiliationName = value;
    }

    /**
     * Gets the value of the affiliationType property.
     * 
     * @return possible object is {@link AffiliationType }
     * 
     */
    public AffiliationType getAffiliationType() {
        return affiliationType;
    }

    /**
     * Sets the value of the affiliationType property.
     * 
     * @param value
     *            allowed object is {@link AffiliationType }
     * 
     */
    public void setAffiliationType(AffiliationType value) {
        this.affiliationType = value;
    }

    /**
     * Gets the value of the affiliationAddress property.
     * 
     * @return possible object is {@link AffiliationAddress }
     * 
     */
    public AffiliationAddress getAffiliationAddress() {
        return affiliationAddress;
    }

    /**
     * Sets the value of the affiliationAddress property.
     * 
     * @param value
     *            allowed object is {@link AffiliationAddress }
     * 
     */
    public void setAffiliationAddress(AffiliationAddress value) {
        this.affiliationAddress = value;
    }

    /**
     * Gets the value of the departmentName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets the value of the departmentName property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDepartmentName(String value) {
        this.departmentName = value;
    }

    /**
     * Gets the value of the roleTitle property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRoleTitle() {
        return roleTitle;
    }

    /**
     * Sets the value of the roleTitle property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRoleTitle(String value) {
        this.roleTitle = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return possible object is {@link FuzzyDate }
     * 
     */
    public FuzzyDate getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *            allowed object is {@link FuzzyDate }
     * 
     */
    public void setStartDate(FuzzyDate value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return possible object is {@link FuzzyDate }
     * 
     */
    public FuzzyDate getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *            allowed object is {@link FuzzyDate }
     * 
     */
    public void setEndDate(FuzzyDate value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return possible object is {@link Source }
     * 
     */
    public Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *            allowed object is {@link Source }
     * 
     */
    public void setSource(Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the disambiguatedAffiliation property.
     * 
     * @return possible object is {@link DisambiguatedAffiliation }
     * 
     */
    public DisambiguatedAffiliation getDisambiguatedAffiliation() {
        return disambiguatedAffiliation;
    }

    /**
     * Sets the value of the disambiguatedAffiliation property.
     * 
     * @param value
     *            allowed object is {@link DisambiguatedAffiliation }
     * 
     */
    public void setDisambiguatedAffiliation(DisambiguatedAffiliation value) {
        this.disambiguatedAffiliation = value;
    }

    /**
     * Gets the value of the putCode property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public String getPutCode() {
        return putCode;
    }

    /**
     * Sets the value of the putCode property.
     * 
     * @param value
     *            allowed object is {@link Object }
     * 
     */
    public void setPutCode(String value) {
        this.putCode = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return possible object is {@link Visibility }
     * 
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *            allowed object is {@link Visibility }
     * 
     */
    public void setVisibility(Visibility value) {
        this.visibility = value;
    }

    /**
     * 
     * Note that put-code is not part of hashCode or equals! This is to allow
     * better de-duplication.
     * 
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((affiliationAddress == null) ? 0 : affiliationAddress.hashCode());
        result = prime * result + ((affiliationName == null) ? 0 : affiliationName.hashCode());
        result = prime * result + ((affiliationType == null) ? 0 : affiliationType.hashCode());
        result = prime * result + ((departmentName == null) ? 0 : departmentName.hashCode());
        result = prime * result + ((disambiguatedAffiliation == null) ? 0 : disambiguatedAffiliation.hashCode());
        result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
        result = prime * result + ((roleTitle == null) ? 0 : roleTitle.hashCode());
        result = prime * result + ((source == null) ? 0 : source.hashCode());
        result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
        result = prime * result + ((visibility == null) ? 0 : visibility.hashCode());
        return result;
    }

    /**
     * 
     * Note that put-code is not part of hashCode or equals! This is to allow
     * better de-duplication.
     * 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Affiliation other = (Affiliation) obj;
        if (affiliationAddress == null) {
            if (other.affiliationAddress != null)
                return false;
        } else if (!affiliationAddress.equals(other.affiliationAddress))
            return false;
        if (affiliationName == null) {
            if (other.affiliationName != null)
                return false;
        } else if (!affiliationName.equals(other.affiliationName))
            return false;
        if (affiliationType != other.affiliationType)
            return false;
        if (departmentName == null) {
            if (other.departmentName != null)
                return false;
        } else if (!departmentName.equals(other.departmentName))
            return false;
        if (disambiguatedAffiliation == null) {
            if (other.disambiguatedAffiliation != null)
                return false;
        } else if (!disambiguatedAffiliation.equals(other.disambiguatedAffiliation))
            return false;
        if (endDate == null) {
            if (other.endDate != null)
                return false;
        } else if (!endDate.equals(other.endDate))
            return false;
        if (roleTitle == null) {
            if (other.roleTitle != null)
                return false;
        } else if (!roleTitle.equals(other.roleTitle))
            return false;
        if (source == null) {
            if (other.source != null)
                return false;
        } else if (!source.equals(other.source))
            return false;
        if (startDate == null) {
            if (other.startDate != null)
                return false;
        } else if (!startDate.equals(other.startDate))
            return false;
        if (visibility != other.visibility)
            return false;
        return true;
    }

}
