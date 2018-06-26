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
@Table(name = "t_r_wc_rate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TRWcRate.findAll", query = "SELECT t FROM TRWcRate t")
    , @NamedQuery(name = "TRWcRate.findByWcRateLinkId", query = "SELECT t FROM TRWcRate t WHERE t.wcRateLinkId = :wcRateLinkId")
    , @NamedQuery(name = "TRWcRate.findByMapPlanCompanyLinkId", query = "SELECT t FROM TRWcRate t WHERE t.mapPlanCompanyLinkId = :mapPlanCompanyLinkId")
    , @NamedQuery(name = "TRWcRate.findByJobCategory", query = "SELECT t FROM TRWcRate t WHERE t.jobCategory = :jobCategory")
    , @NamedQuery(name = "TRWcRate.findByLiabilityLimitFrom", query = "SELECT t FROM TRWcRate t WHERE t.liabilityLimitFrom = :liabilityLimitFrom")
    , @NamedQuery(name = "TRWcRate.findByLiabilityLimitTo", query = "SELECT t FROM TRWcRate t WHERE t.liabilityLimitTo = :liabilityLimitTo")
    , @NamedQuery(name = "TRWcRate.findByCalculationType", query = "SELECT t FROM TRWcRate t WHERE t.calculationType = :calculationType")
    , @NamedQuery(name = "TRWcRate.findByRate", query = "SELECT t FROM TRWcRate t WHERE t.rate = :rate")
    , @NamedQuery(name = "TRWcRate.findByFixed", query = "SELECT t FROM TRWcRate t WHERE t.fixed = :fixed")
    , @NamedQuery(name = "TRWcRate.findByDeductible", query = "SELECT t FROM TRWcRate t WHERE t.deductible = :deductible")
    , @NamedQuery(name = "TRWcRate.findByEmployeeCountFrom", query = "SELECT t FROM TRWcRate t WHERE t.employeeCountFrom = :employeeCountFrom")
    , @NamedQuery(name = "TRWcRate.findByEmployeeCountTo", query = "SELECT t FROM TRWcRate t WHERE t.employeeCountTo = :employeeCountTo")
    , @NamedQuery(name = "TRWcRate.findByActive", query = "SELECT t FROM TRWcRate t WHERE t.active = :active")
    , @NamedQuery(name = "TRWcRate.findByFromToDate", query = "SELECT t FROM TRWcRate t WHERE t.fromToDate = :fromToDate")
    , @NamedQuery(name = "TRWcRate.findByCreateModify", query = "SELECT t FROM TRWcRate t WHERE t.createModify = :createModify")
    , @NamedQuery(name = "TRWcRate.findByCreatedDate", query = "SELECT t FROM TRWcRate t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TRWcRate.findByModifiedDate", query = "SELECT t FROM TRWcRate t WHERE t.modifiedDate = :modifiedDate")})
public class TRWcRate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "wc_rate_link_id")
    private Integer wcRateLinkId;
    @Column(name = "map_plan_company_link_id")
    private Integer mapPlanCompanyLinkId;
    @Column(name = "job_category")
    private Integer jobCategory;
    @Column(name = "liability_limit_from")
    private Integer liabilityLimitFrom;
    @Column(name = "liability_limit_to")
    private Integer liabilityLimitTo;
    @Size(max = 30)
    @Column(name = "calculation_type")
    private String calculationType;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "rate")
    private Double rate;
    @Column(name = "fixed")
    private Integer fixed;
    @Column(name = "deductible")
    private Integer deductible;
    @Column(name = "employee_count_from")
    private Integer employeeCountFrom;
    @Column(name = "employee_count_to")
    private Integer employeeCountTo;
    @Column(name = "active")
    private Integer active;
    @Column(name = "from_to_date")
    @Temporal(TemporalType.DATE)
    private Date fromToDate;
    @Column(name = "create_modify")
    private Integer createModify;
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

    public TRWcRate() {
    }

    public TRWcRate(Integer wcRateLinkId) {
        this.wcRateLinkId = wcRateLinkId;
    }

    public Integer getWcRateLinkId() {
        return wcRateLinkId;
    }

    public void setWcRateLinkId(Integer wcRateLinkId) {
        this.wcRateLinkId = wcRateLinkId;
    }

    public Integer getMapPlanCompanyLinkId() {
        return mapPlanCompanyLinkId;
    }

    public void setMapPlanCompanyLinkId(Integer mapPlanCompanyLinkId) {
        this.mapPlanCompanyLinkId = mapPlanCompanyLinkId;
    }

    public Integer getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(Integer jobCategory) {
        this.jobCategory = jobCategory;
    }

    public Integer getLiabilityLimitFrom() {
        return liabilityLimitFrom;
    }

    public void setLiabilityLimitFrom(Integer liabilityLimitFrom) {
        this.liabilityLimitFrom = liabilityLimitFrom;
    }

    public Integer getLiabilityLimitTo() {
        return liabilityLimitTo;
    }

    public void setLiabilityLimitTo(Integer liabilityLimitTo) {
        this.liabilityLimitTo = liabilityLimitTo;
    }

    public String getCalculationType() {
        return calculationType;
    }

    public void setCalculationType(String calculationType) {
        this.calculationType = calculationType;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Integer getFixed() {
        return fixed;
    }

    public void setFixed(Integer fixed) {
        this.fixed = fixed;
    }

    public Integer getDeductible() {
        return deductible;
    }

    public void setDeductible(Integer deductible) {
        this.deductible = deductible;
    }

    public Integer getEmployeeCountFrom() {
        return employeeCountFrom;
    }

    public void setEmployeeCountFrom(Integer employeeCountFrom) {
        this.employeeCountFrom = employeeCountFrom;
    }

    public Integer getEmployeeCountTo() {
        return employeeCountTo;
    }

    public void setEmployeeCountTo(Integer employeeCountTo) {
        this.employeeCountTo = employeeCountTo;
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

    public Integer getCreateModify() {
        return createModify;
    }

    public void setCreateModify(Integer createModify) {
        this.createModify = createModify;
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
        hash += (wcRateLinkId != null ? wcRateLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TRWcRate)) {
            return false;
        }
        TRWcRate other = (TRWcRate) object;
        if ((this.wcRateLinkId == null && other.wcRateLinkId != null) || (this.wcRateLinkId != null && !this.wcRateLinkId.equals(other.wcRateLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TRWcRate[ wcRateLinkId=" + wcRateLinkId + " ]";
    }
    
}
