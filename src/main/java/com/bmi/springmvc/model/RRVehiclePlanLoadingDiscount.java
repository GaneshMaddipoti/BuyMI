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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ganesmad
 */
@Entity
@Table(name = "r_r_vehicle_plan_loading_discount")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RRVehiclePlanLoadingDiscount.findAll", query = "SELECT r FROM RRVehiclePlanLoadingDiscount r")
    , @NamedQuery(name = "RRVehiclePlanLoadingDiscount.findByVehiclePlanLoadingDiscountLinkId", query = "SELECT r FROM RRVehiclePlanLoadingDiscount r WHERE r.vehiclePlanLoadingDiscountLinkId = :vehiclePlanLoadingDiscountLinkId")
    , @NamedQuery(name = "RRVehiclePlanLoadingDiscount.findByVehicleMakeLinkId", query = "SELECT r FROM RRVehiclePlanLoadingDiscount r WHERE r.vehicleMakeLinkId = :vehicleMakeLinkId")
    , @NamedQuery(name = "RRVehiclePlanLoadingDiscount.findByMapPlanCompanyLinkId", query = "SELECT r FROM RRVehiclePlanLoadingDiscount r WHERE r.mapPlanCompanyLinkId = :mapPlanCompanyLinkId")
    , @NamedQuery(name = "RRVehiclePlanLoadingDiscount.findByLoadingPercent", query = "SELECT r FROM RRVehiclePlanLoadingDiscount r WHERE r.loadingPercent = :loadingPercent")
    , @NamedQuery(name = "RRVehiclePlanLoadingDiscount.findByDiscountPercent", query = "SELECT r FROM RRVehiclePlanLoadingDiscount r WHERE r.discountPercent = :discountPercent")
    , @NamedQuery(name = "RRVehiclePlanLoadingDiscount.findByFromDate", query = "SELECT r FROM RRVehiclePlanLoadingDiscount r WHERE r.fromDate = :fromDate")
    , @NamedQuery(name = "RRVehiclePlanLoadingDiscount.findByToDate", query = "SELECT r FROM RRVehiclePlanLoadingDiscount r WHERE r.toDate = :toDate")
    , @NamedQuery(name = "RRVehiclePlanLoadingDiscount.findByActive", query = "SELECT r FROM RRVehiclePlanLoadingDiscount r WHERE r.active = :active")})
public class RRVehiclePlanLoadingDiscount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "vehicle_plan_loading_discount_link_id")
    private Integer vehiclePlanLoadingDiscountLinkId;
    @Column(name = "vehicle_make_link_id")
    private Integer vehicleMakeLinkId;
    @Column(name = "map_plan_company_link_id")
    private Integer mapPlanCompanyLinkId;
    @Column(name = "loading_percent")
    private Integer loadingPercent;
    @Column(name = "discount_percent")
    private Integer discountPercent;
    @Column(name = "from_date")
    @Temporal(TemporalType.DATE)
    private Date fromDate;
    @Column(name = "to_date")
    @Temporal(TemporalType.DATE)
    private Date toDate;
    @Column(name = "active")
    private Integer active;

    public RRVehiclePlanLoadingDiscount() {
    }

    public RRVehiclePlanLoadingDiscount(Integer vehiclePlanLoadingDiscountLinkId) {
        this.vehiclePlanLoadingDiscountLinkId = vehiclePlanLoadingDiscountLinkId;
    }

    public Integer getVehiclePlanLoadingDiscountLinkId() {
        return vehiclePlanLoadingDiscountLinkId;
    }

    public void setVehiclePlanLoadingDiscountLinkId(Integer vehiclePlanLoadingDiscountLinkId) {
        this.vehiclePlanLoadingDiscountLinkId = vehiclePlanLoadingDiscountLinkId;
    }

    public Integer getVehicleMakeLinkId() {
        return vehicleMakeLinkId;
    }

    public void setVehicleMakeLinkId(Integer vehicleMakeLinkId) {
        this.vehicleMakeLinkId = vehicleMakeLinkId;
    }

    public Integer getMapPlanCompanyLinkId() {
        return mapPlanCompanyLinkId;
    }

    public void setMapPlanCompanyLinkId(Integer mapPlanCompanyLinkId) {
        this.mapPlanCompanyLinkId = mapPlanCompanyLinkId;
    }

    public Integer getLoadingPercent() {
        return loadingPercent;
    }

    public void setLoadingPercent(Integer loadingPercent) {
        this.loadingPercent = loadingPercent;
    }

    public Integer getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Integer discountPercent) {
        this.discountPercent = discountPercent;
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
        hash += (vehiclePlanLoadingDiscountLinkId != null ? vehiclePlanLoadingDiscountLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RRVehiclePlanLoadingDiscount)) {
            return false;
        }
        RRVehiclePlanLoadingDiscount other = (RRVehiclePlanLoadingDiscount) object;
        if ((this.vehiclePlanLoadingDiscountLinkId == null && other.vehiclePlanLoadingDiscountLinkId != null) || (this.vehiclePlanLoadingDiscountLinkId != null && !this.vehiclePlanLoadingDiscountLinkId.equals(other.vehiclePlanLoadingDiscountLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.RRVehiclePlanLoadingDiscount[ vehiclePlanLoadingDiscountLinkId=" + vehiclePlanLoadingDiscountLinkId + " ]";
    }
    
}
