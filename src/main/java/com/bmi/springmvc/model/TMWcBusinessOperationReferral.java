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
@Table(name = "t_m_wc_ business_operation_referral")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMWcBusinessOperationReferral.findAll", query = "SELECT t FROM TMWcBusinessOperationReferral t")
    , @NamedQuery(name = "TMWcBusinessOperationReferral.findByBusinessOperationReferralLinkId", query = "SELECT t FROM TMWcBusinessOperationReferral t WHERE t.businessOperationReferralLinkId = :businessOperationReferralLinkId")
    , @NamedQuery(name = "TMWcBusinessOperationReferral.findByBusinessOperationId", query = "SELECT t FROM TMWcBusinessOperationReferral t WHERE t.businessOperationId = :businessOperationId")
    , @NamedQuery(name = "TMWcBusinessOperationReferral.findByInsuranceCompanyId", query = "SELECT t FROM TMWcBusinessOperationReferral t WHERE t.insuranceCompanyId = :insuranceCompanyId")
    , @NamedQuery(name = "TMWcBusinessOperationReferral.findByIsreferral", query = "SELECT t FROM TMWcBusinessOperationReferral t WHERE t.isreferral = :isreferral")
    , @NamedQuery(name = "TMWcBusinessOperationReferral.findByActive", query = "SELECT t FROM TMWcBusinessOperationReferral t WHERE t.active = :active")
    , @NamedQuery(name = "TMWcBusinessOperationReferral.findByFromToDate", query = "SELECT t FROM TMWcBusinessOperationReferral t WHERE t.fromToDate = :fromToDate")
    , @NamedQuery(name = "TMWcBusinessOperationReferral.findByCreatedModified", query = "SELECT t FROM TMWcBusinessOperationReferral t WHERE t.createdModified = :createdModified")
    , @NamedQuery(name = "TMWcBusinessOperationReferral.findByCreatedDate", query = "SELECT t FROM TMWcBusinessOperationReferral t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMWcBusinessOperationReferral.findByModifiedDate", query = "SELECT t FROM TMWcBusinessOperationReferral t WHERE t.modifiedDate = :modifiedDate")})
public class TMWcBusinessOperationReferral implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "business_operation_referral_link_id")
    private Integer businessOperationReferralLinkId;
    @Column(name = "business_operation_id")
    private Integer businessOperationId;
    @Size(max = 20)
    @Column(name = "insurance_company_id")
    private String insuranceCompanyId;
    @Size(max = 20)
    @Column(name = "isreferral")
    private String isreferral;
    @Column(name = "active")
    private Integer active;
    @Column(name = "from_to_date")
    @Temporal(TemporalType.DATE)
    private Date fromToDate;
    @Column(name = "created_modified")
    private Integer createdModified;
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

    public TMWcBusinessOperationReferral() {
    }

    public TMWcBusinessOperationReferral(Integer businessOperationReferralLinkId) {
        this.businessOperationReferralLinkId = businessOperationReferralLinkId;
    }

    public Integer getBusinessOperationReferralLinkId() {
        return businessOperationReferralLinkId;
    }

    public void setBusinessOperationReferralLinkId(Integer businessOperationReferralLinkId) {
        this.businessOperationReferralLinkId = businessOperationReferralLinkId;
    }

    public Integer getBusinessOperationId() {
        return businessOperationId;
    }

    public void setBusinessOperationId(Integer businessOperationId) {
        this.businessOperationId = businessOperationId;
    }

    public String getInsuranceCompanyId() {
        return insuranceCompanyId;
    }

    public void setInsuranceCompanyId(String insuranceCompanyId) {
        this.insuranceCompanyId = insuranceCompanyId;
    }

    public String getIsreferral() {
        return isreferral;
    }

    public void setIsreferral(String isreferral) {
        this.isreferral = isreferral;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Date getFromToDate() {
        return fromToDate;
    }

    public void setFromToDate(Date fromToDate) {
        this.fromToDate = fromToDate;
    }

    public Integer getCreatedModified() {
        return createdModified;
    }

    public void setCreatedModified(Integer createdModified) {
        this.createdModified = createdModified;
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
        hash += (businessOperationReferralLinkId != null ? businessOperationReferralLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMWcBusinessOperationReferral)) {
            return false;
        }
        TMWcBusinessOperationReferral other = (TMWcBusinessOperationReferral) object;
        if ((this.businessOperationReferralLinkId == null && other.businessOperationReferralLinkId != null) || (this.businessOperationReferralLinkId != null && !this.businessOperationReferralLinkId.equals(other.businessOperationReferralLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMWcBusinessOperationReferral[ businessOperationReferralLinkId=" + businessOperationReferralLinkId + " ]";
    }
    
}
