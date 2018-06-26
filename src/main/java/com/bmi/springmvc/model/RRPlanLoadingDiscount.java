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
@Table(name = "r_r_plan_loading_discount")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RRPlanLoadingDiscount.findAll", query = "SELECT r FROM RRPlanLoadingDiscount r")
    , @NamedQuery(name = "RRPlanLoadingDiscount.findByPlanLoadingDiscountLinkId", query = "SELECT r FROM RRPlanLoadingDiscount r WHERE r.planLoadingDiscountLinkId = :planLoadingDiscountLinkId")
    , @NamedQuery(name = "RRPlanLoadingDiscount.findByMapPlanCompanyLinkId", query = "SELECT r FROM RRPlanLoadingDiscount r WHERE r.mapPlanCompanyLinkId = :mapPlanCompanyLinkId")
    , @NamedQuery(name = "RRPlanLoadingDiscount.findByPldDescription", query = "SELECT r FROM RRPlanLoadingDiscount r WHERE r.pldDescription = :pldDescription")
    , @NamedQuery(name = "RRPlanLoadingDiscount.findByPldtype", query = "SELECT r FROM RRPlanLoadingDiscount r WHERE r.pldtype = :pldtype")
    , @NamedQuery(name = "RRPlanLoadingDiscount.findByLoadingPercent", query = "SELECT r FROM RRPlanLoadingDiscount r WHERE r.loadingPercent = :loadingPercent")
    , @NamedQuery(name = "RRPlanLoadingDiscount.findByLoadingAmount", query = "SELECT r FROM RRPlanLoadingDiscount r WHERE r.loadingAmount = :loadingAmount")
    , @NamedQuery(name = "RRPlanLoadingDiscount.findByDiscountPercent", query = "SELECT r FROM RRPlanLoadingDiscount r WHERE r.discountPercent = :discountPercent")
    , @NamedQuery(name = "RRPlanLoadingDiscount.findByDiscountAmount", query = "SELECT r FROM RRPlanLoadingDiscount r WHERE r.discountAmount = :discountAmount")
    , @NamedQuery(name = "RRPlanLoadingDiscount.findByFromDate", query = "SELECT r FROM RRPlanLoadingDiscount r WHERE r.fromDate = :fromDate")
    , @NamedQuery(name = "RRPlanLoadingDiscount.findByToDate", query = "SELECT r FROM RRPlanLoadingDiscount r WHERE r.toDate = :toDate")
    , @NamedQuery(name = "RRPlanLoadingDiscount.findByActive", query = "SELECT r FROM RRPlanLoadingDiscount r WHERE r.active = :active")})
public class RRPlanLoadingDiscount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "plan_loading_discount_link_id")
    private Integer planLoadingDiscountLinkId;
    @Column(name = "map_plan_company_link_id")
    private Integer mapPlanCompanyLinkId;
    @Size(max = 20)
    @Column(name = "pld_description")
    private String pldDescription;
    @Size(max = 20)
    @Column(name = "Pld_type")
    private String pldtype;
    @Column(name = "loading_percent")
    private Integer loadingPercent;
    @Column(name = "loading_amount")
    private Integer loadingAmount;
    @Column(name = "discount_percent")
    private Integer discountPercent;
    @Column(name = "discount_amount")
    private Integer discountAmount;
    @Column(name = "from_date")
    @Temporal(TemporalType.DATE)
    private Date fromDate;
    @Column(name = "to_date")
    @Temporal(TemporalType.DATE)
    private Date toDate;
    @Column(name = "active")
    private Integer active;

    public RRPlanLoadingDiscount() {
    }

    public RRPlanLoadingDiscount(Integer planLoadingDiscountLinkId) {
        this.planLoadingDiscountLinkId = planLoadingDiscountLinkId;
    }

    public Integer getPlanLoadingDiscountLinkId() {
        return planLoadingDiscountLinkId;
    }

    public void setPlanLoadingDiscountLinkId(Integer planLoadingDiscountLinkId) {
        this.planLoadingDiscountLinkId = planLoadingDiscountLinkId;
    }

    public Integer getMapPlanCompanyLinkId() {
        return mapPlanCompanyLinkId;
    }

    public void setMapPlanCompanyLinkId(Integer mapPlanCompanyLinkId) {
        this.mapPlanCompanyLinkId = mapPlanCompanyLinkId;
    }

    public String getPldDescription() {
        return pldDescription;
    }

    public void setPldDescription(String pldDescription) {
        this.pldDescription = pldDescription;
    }

    public String getPldtype() {
        return pldtype;
    }

    public void setPldtype(String pldtype) {
        this.pldtype = pldtype;
    }

    public Integer getLoadingPercent() {
        return loadingPercent;
    }

    public void setLoadingPercent(Integer loadingPercent) {
        this.loadingPercent = loadingPercent;
    }

    public Integer getLoadingAmount() {
        return loadingAmount;
    }

    public void setLoadingAmount(Integer loadingAmount) {
        this.loadingAmount = loadingAmount;
    }

    public Integer getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Integer discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
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
        hash += (planLoadingDiscountLinkId != null ? planLoadingDiscountLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RRPlanLoadingDiscount)) {
            return false;
        }
        RRPlanLoadingDiscount other = (RRPlanLoadingDiscount) object;
        if ((this.planLoadingDiscountLinkId == null && other.planLoadingDiscountLinkId != null) || (this.planLoadingDiscountLinkId != null && !this.planLoadingDiscountLinkId.equals(other.planLoadingDiscountLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.RRPlanLoadingDiscount[ planLoadingDiscountLinkId=" + planLoadingDiscountLinkId + " ]";
    }
    
}
