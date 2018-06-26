/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmi.springmvc.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ganesmad
 */
@Entity
@Table(name = "t_t_wc_rate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTWcRate.findAll", query = "SELECT t FROM TTWcRate t")
    , @NamedQuery(name = "TTWcRate.findByTTWcRateLinkId", query = "SELECT t FROM TTWcRate t WHERE t.tTWcRateLinkId = :tTWcRateLinkId")
    , @NamedQuery(name = "TTWcRate.findByMapPlanCompanyLinkId", query = "SELECT t FROM TTWcRate t WHERE t.mapPlanCompanyLinkId = :mapPlanCompanyLinkId")
    , @NamedQuery(name = "TTWcRate.findByWcJobCategoryLinkId", query = "SELECT t FROM TTWcRate t WHERE t.wcJobCategoryLinkId = :wcJobCategoryLinkId")
    , @NamedQuery(name = "TTWcRate.findByWcSalaryMin", query = "SELECT t FROM TTWcRate t WHERE t.wcSalaryMin = :wcSalaryMin")
    , @NamedQuery(name = "TTWcRate.findByWcSalaryMax", query = "SELECT t FROM TTWcRate t WHERE t.wcSalaryMax = :wcSalaryMax")
    , @NamedQuery(name = "TTWcRate.findByWcBaserate", query = "SELECT t FROM TTWcRate t WHERE t.wcBaserate = :wcBaserate")})
public class TTWcRate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "t_t_wc_rate_link_id")
    private Integer tTWcRateLinkId;
    @Column(name = "map_plan_company_link_id")
    private Integer mapPlanCompanyLinkId;
    @Column(name = "wc_job_category_link_id")
    private Integer wcJobCategoryLinkId;
    @Column(name = "wc_salary_min")
    private Integer wcSalaryMin;
    @Column(name = "wc_salary_max")
    private Integer wcSalaryMax;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "wc_baserate")
    private Double wcBaserate;

    public TTWcRate() {
    }

    public TTWcRate(Integer tTWcRateLinkId) {
        this.tTWcRateLinkId = tTWcRateLinkId;
    }

    public Integer getTTWcRateLinkId() {
        return tTWcRateLinkId;
    }

    public void setTTWcRateLinkId(Integer tTWcRateLinkId) {
        this.tTWcRateLinkId = tTWcRateLinkId;
    }

    public Integer getMapPlanCompanyLinkId() {
        return mapPlanCompanyLinkId;
    }

    public void setMapPlanCompanyLinkId(Integer mapPlanCompanyLinkId) {
        this.mapPlanCompanyLinkId = mapPlanCompanyLinkId;
    }

    public Integer getWcJobCategoryLinkId() {
        return wcJobCategoryLinkId;
    }

    public void setWcJobCategoryLinkId(Integer wcJobCategoryLinkId) {
        this.wcJobCategoryLinkId = wcJobCategoryLinkId;
    }

    public Integer getWcSalaryMin() {
        return wcSalaryMin;
    }

    public void setWcSalaryMin(Integer wcSalaryMin) {
        this.wcSalaryMin = wcSalaryMin;
    }

    public Integer getWcSalaryMax() {
        return wcSalaryMax;
    }

    public void setWcSalaryMax(Integer wcSalaryMax) {
        this.wcSalaryMax = wcSalaryMax;
    }

    public Double getWcBaserate() {
        return wcBaserate;
    }

    public void setWcBaserate(Double wcBaserate) {
        this.wcBaserate = wcBaserate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tTWcRateLinkId != null ? tTWcRateLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTWcRate)) {
            return false;
        }
        TTWcRate other = (TTWcRate) object;
        if ((this.tTWcRateLinkId == null && other.tTWcRateLinkId != null) || (this.tTWcRateLinkId != null && !this.tTWcRateLinkId.equals(other.tTWcRateLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TTWcRate[ tTWcRateLinkId=" + tTWcRateLinkId + " ]";
    }
    
}
