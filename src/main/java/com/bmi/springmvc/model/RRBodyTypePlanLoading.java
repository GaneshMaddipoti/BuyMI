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
@Table(name = "r_r_body_type_plan_loading")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RRBodyTypePlanLoading.findAll", query = "SELECT r FROM RRBodyTypePlanLoading r")
    , @NamedQuery(name = "RRBodyTypePlanLoading.findByBodyTypePlanLoadingLinkId", query = "SELECT r FROM RRBodyTypePlanLoading r WHERE r.bodyTypePlanLoadingLinkId = :bodyTypePlanLoadingLinkId")
    , @NamedQuery(name = "RRBodyTypePlanLoading.findByBodyTypeLinkId", query = "SELECT r FROM RRBodyTypePlanLoading r WHERE r.bodyTypeLinkId = :bodyTypeLinkId")
    , @NamedQuery(name = "RRBodyTypePlanLoading.findByMapPlanCompanyLinkId", query = "SELECT r FROM RRBodyTypePlanLoading r WHERE r.mapPlanCompanyLinkId = :mapPlanCompanyLinkId")
    , @NamedQuery(name = "RRBodyTypePlanLoading.findByLoadingPercent", query = "SELECT r FROM RRBodyTypePlanLoading r WHERE r.loadingPercent = :loadingPercent")
    , @NamedQuery(name = "RRBodyTypePlanLoading.findByFromDate", query = "SELECT r FROM RRBodyTypePlanLoading r WHERE r.fromDate = :fromDate")
    , @NamedQuery(name = "RRBodyTypePlanLoading.findByToDate", query = "SELECT r FROM RRBodyTypePlanLoading r WHERE r.toDate = :toDate")
    , @NamedQuery(name = "RRBodyTypePlanLoading.findByActive", query = "SELECT r FROM RRBodyTypePlanLoading r WHERE r.active = :active")})
public class RRBodyTypePlanLoading implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "body_type_plan_loading_link_id")
    private Integer bodyTypePlanLoadingLinkId;
    @Column(name = "body_type_link_id")
    private Integer bodyTypeLinkId;
    @Column(name = "map_plan_company_link_id")
    private Integer mapPlanCompanyLinkId;
    @Size(max = 20)
    @Column(name = "loading_percent")
    private String loadingPercent;
    @Column(name = "from_date")
    @Temporal(TemporalType.DATE)
    private Date fromDate;
    @Column(name = "to_date")
    @Temporal(TemporalType.DATE)
    private Date toDate;
    @Column(name = "active")
    private Integer active;

    public RRBodyTypePlanLoading() {
    }

    public RRBodyTypePlanLoading(Integer bodyTypePlanLoadingLinkId) {
        this.bodyTypePlanLoadingLinkId = bodyTypePlanLoadingLinkId;
    }

    public Integer getBodyTypePlanLoadingLinkId() {
        return bodyTypePlanLoadingLinkId;
    }

    public void setBodyTypePlanLoadingLinkId(Integer bodyTypePlanLoadingLinkId) {
        this.bodyTypePlanLoadingLinkId = bodyTypePlanLoadingLinkId;
    }

    public Integer getBodyTypeLinkId() {
        return bodyTypeLinkId;
    }

    public void setBodyTypeLinkId(Integer bodyTypeLinkId) {
        this.bodyTypeLinkId = bodyTypeLinkId;
    }

    public Integer getMapPlanCompanyLinkId() {
        return mapPlanCompanyLinkId;
    }

    public void setMapPlanCompanyLinkId(Integer mapPlanCompanyLinkId) {
        this.mapPlanCompanyLinkId = mapPlanCompanyLinkId;
    }

    public String getLoadingPercent() {
        return loadingPercent;
    }

    public void setLoadingPercent(String loadingPercent) {
        this.loadingPercent = loadingPercent;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bodyTypePlanLoadingLinkId != null ? bodyTypePlanLoadingLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RRBodyTypePlanLoading)) {
            return false;
        }
        RRBodyTypePlanLoading other = (RRBodyTypePlanLoading) object;
        if ((this.bodyTypePlanLoadingLinkId == null && other.bodyTypePlanLoadingLinkId != null) || (this.bodyTypePlanLoadingLinkId != null && !this.bodyTypePlanLoadingLinkId.equals(other.bodyTypePlanLoadingLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.RRBodyTypePlanLoading[ bodyTypePlanLoadingLinkId=" + bodyTypePlanLoadingLinkId + " ]";
    }
    
}
