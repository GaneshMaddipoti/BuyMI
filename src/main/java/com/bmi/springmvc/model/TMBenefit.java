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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "t_m_benefit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMBenefit.findAll", query = "SELECT t FROM TMBenefit t")
    , @NamedQuery(name = "TMBenefit.findByBenefitLinkId", query = "SELECT t FROM TMBenefit t WHERE t.benefitLinkId = :benefitLinkId")
    , @NamedQuery(name = "TMBenefit.findByBenefitName", query = "SELECT t FROM TMBenefit t WHERE t.benefitName = :benefitName")
    , @NamedQuery(name = "TMBenefit.findByBenefitNameAr", query = "SELECT t FROM TMBenefit t WHERE t.benefitNameAr = :benefitNameAr")
    , @NamedQuery(name = "TMBenefit.findByLob", query = "SELECT t FROM TMBenefit t WHERE t.lob = :lob")
    , @NamedQuery(name = "TMBenefit.findByDescription", query = "SELECT t FROM TMBenefit t WHERE t.description = :description")
    , @NamedQuery(name = "TMBenefit.findByCreatedDate", query = "SELECT t FROM TMBenefit t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMBenefit.findByModifiedDate", query = "SELECT t FROM TMBenefit t WHERE t.modifiedDate = :modifiedDate")})
public class TMBenefit implements Serializable {

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
    @Column(name = "lob")
    private Integer lob;
    @Size(max = 300)
    @Column(name = "description")
    private String description;
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(name = "modified_date")
    @Temporal(TemporalType.DATE)
    private Date modifiedDate;
    @JoinColumn(name = "created_by_id", referencedColumnName = "admin_link_id")
    @ManyToOne
    private TMAdmin createdById;
    @JoinColumn(name = "modified_by_id", referencedColumnName = "admin_link_id")
    @ManyToOne
    private TMAdmin modifiedById;

    public TMBenefit() {
    }

    public TMBenefit(Integer benefitLinkId) {
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

    public Integer getLob() {
        return lob;
    }

    public void setLob(Integer lob) {
        this.lob = lob;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public TMAdmin getCreatedById() {
        return createdById;
    }

    public void setCreatedById(TMAdmin createdById) {
        this.createdById = createdById;
    }

    public TMAdmin getModifiedById() {
        return modifiedById;
    }

    public void setModifiedById(TMAdmin modifiedById) {
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
        if (!(object instanceof TMBenefit)) {
            return false;
        }
        TMBenefit other = (TMBenefit) object;
        if ((this.benefitLinkId == null && other.benefitLinkId != null) || (this.benefitLinkId != null && !this.benefitLinkId.equals(other.benefitLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMBenefit[ benefitLinkId=" + benefitLinkId + " ]";
    }
    
}
