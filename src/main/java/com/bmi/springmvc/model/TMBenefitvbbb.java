/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmi.springmvc.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ganesmad
 */
@Entity
@Table(name = "t_m_benefitvbbb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMBenefitvbbb.findAll", query = "SELECT t FROM TMBenefitvbbb t")
    , @NamedQuery(name = "TMBenefitvbbb.findByBenefitLinkId", query = "SELECT t FROM TMBenefitvbbb t WHERE t.benefitLinkId = :benefitLinkId")
    , @NamedQuery(name = "TMBenefitvbbb.findByBenefitName", query = "SELECT t FROM TMBenefitvbbb t WHERE t.benefitName = :benefitName")
    , @NamedQuery(name = "TMBenefitvbbb.findByBenefitNameAr", query = "SELECT t FROM TMBenefitvbbb t WHERE t.benefitNameAr = :benefitNameAr")
    , @NamedQuery(name = "TMBenefitvbbb.findByCreatedDate", query = "SELECT t FROM TMBenefitvbbb t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMBenefitvbbb.findByCreatedById", query = "SELECT t FROM TMBenefitvbbb t WHERE t.createdById = :createdById")
    , @NamedQuery(name = "TMBenefitvbbb.findByModifiedDate", query = "SELECT t FROM TMBenefitvbbb t WHERE t.modifiedDate = :modifiedDate")
    , @NamedQuery(name = "TMBenefitvbbb.findByModifiedById", query = "SELECT t FROM TMBenefitvbbb t WHERE t.modifiedById = :modifiedById")})
public class TMBenefitvbbb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "benefit_link_id")
    private Integer benefitLinkId;
    @Size(max = 300)
    @Column(name = "benefit_name")
    private String benefitName;
    @Size(max = 300)
    @Column(name = "benefit_name_ar")
    private String benefitNameAr;
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(name = "created_by_id")
    private Integer createdById;
    @Column(name = "modified_date")
    @Temporal(TemporalType.DATE)
    private Date modifiedDate;
    @Column(name = "modified_by_id")
    private Integer modifiedById;

    public TMBenefitvbbb() {
    }

    public TMBenefitvbbb(Integer benefitLinkId) {
        this.benefitLinkId = benefitLinkId;
    }

    public Integer getBenefitLinkId() {
        return benefitLinkId;
    }

    public void setBenefitLinkId(Integer benefitLinkId) {
        this.benefitLinkId = benefitLinkId;
    }

    public String getBenefitName() {
        return benefitName;
    }

    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
    }

    public String getBenefitNameAr() {
        return benefitNameAr;
    }

    public void setBenefitNameAr(String benefitNameAr) {
        this.benefitNameAr = benefitNameAr;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getModifiedById() {
        return modifiedById;
    }

    public void setModifiedById(Integer modifiedById) {
        this.modifiedById = modifiedById;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (benefitLinkId != null ? benefitLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMBenefitvbbb)) {
            return false;
        }
        TMBenefitvbbb other = (TMBenefitvbbb) object;
        if ((this.benefitLinkId == null && other.benefitLinkId != null) || (this.benefitLinkId != null && !this.benefitLinkId.equals(other.benefitLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMBenefitvbbb[ benefitLinkId=" + benefitLinkId + " ]";
    }
    
}
