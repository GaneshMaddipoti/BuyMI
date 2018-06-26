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
@Table(name = "t_t_travel_rate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTTravelRate.findAll", query = "SELECT t FROM TTTravelRate t")
    , @NamedQuery(name = "TTTravelRate.findByTTTravelRateLinkId", query = "SELECT t FROM TTTravelRate t WHERE t.tTTravelRateLinkId = :tTTravelRateLinkId")
    , @NamedQuery(name = "TTTravelRate.findByMapPlanCompanyLinkId", query = "SELECT t FROM TTTravelRate t WHERE t.mapPlanCompanyLinkId = :mapPlanCompanyLinkId")
    , @NamedQuery(name = "TTTravelRate.findByTravelTripTypeLinkId", query = "SELECT t FROM TTTravelRate t WHERE t.travelTripTypeLinkId = :travelTripTypeLinkId")
    , @NamedQuery(name = "TTTravelRate.findByTravelDestLinkId", query = "SELECT t FROM TTTravelRate t WHERE t.travelDestLinkId = :travelDestLinkId")
    , @NamedQuery(name = "TTTravelRate.findByTravelMinage", query = "SELECT t FROM TTTravelRate t WHERE t.travelMinage = :travelMinage")
    , @NamedQuery(name = "TTTravelRate.findByTravelMaxage", query = "SELECT t FROM TTTravelRate t WHERE t.travelMaxage = :travelMaxage")
    , @NamedQuery(name = "TTTravelRate.findByMinDay", query = "SELECT t FROM TTTravelRate t WHERE t.minDay = :minDay")
    , @NamedQuery(name = "TTTravelRate.findByMaxDay", query = "SELECT t FROM TTTravelRate t WHERE t.maxDay = :maxDay")
    , @NamedQuery(name = "TTTravelRate.findByBaseRate", query = "SELECT t FROM TTTravelRate t WHERE t.baseRate = :baseRate")
    , @NamedQuery(name = "TTTravelRate.findByMinimumPremium", query = "SELECT t FROM TTTravelRate t WHERE t.minimumPremium = :minimumPremium")})
public class TTTravelRate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "t_t_travel_rate_link_id")
    private Integer tTTravelRateLinkId;
    @Column(name = "map_plan_company_link_id")
    private Integer mapPlanCompanyLinkId;
    @Column(name = "travel_trip_type_link_id")
    private Integer travelTripTypeLinkId;
    @Column(name = "travel_dest_link_id")
    private Integer travelDestLinkId;
    @Column(name = "travel_minage")
    private Integer travelMinage;
    @Column(name = "travel_maxage")
    private Integer travelMaxage;
    @Column(name = "min_day")
    private Integer minDay;
    @Column(name = "max_day")
    private Integer maxDay;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "base_rate")
    private Double baseRate;
    @Column(name = "minimum_premium")
    private Integer minimumPremium;

    public TTTravelRate() {
    }

    public TTTravelRate(Integer tTTravelRateLinkId) {
        this.tTTravelRateLinkId = tTTravelRateLinkId;
    }

    public Integer getTTTravelRateLinkId() {
        return tTTravelRateLinkId;
    }

    public void setTTTravelRateLinkId(Integer tTTravelRateLinkId) {
        this.tTTravelRateLinkId = tTTravelRateLinkId;
    }

    public Integer getMapPlanCompanyLinkId() {
        return mapPlanCompanyLinkId;
    }

    public void setMapPlanCompanyLinkId(Integer mapPlanCompanyLinkId) {
        this.mapPlanCompanyLinkId = mapPlanCompanyLinkId;
    }

    public Integer getTravelTripTypeLinkId() {
        return travelTripTypeLinkId;
    }

    public void setTravelTripTypeLinkId(Integer travelTripTypeLinkId) {
        this.travelTripTypeLinkId = travelTripTypeLinkId;
    }

    public Integer getTravelDestLinkId() {
        return travelDestLinkId;
    }

    public void setTravelDestLinkId(Integer travelDestLinkId) {
        this.travelDestLinkId = travelDestLinkId;
    }

    public Integer getTravelMinage() {
        return travelMinage;
    }

    public void setTravelMinage(Integer travelMinage) {
        this.travelMinage = travelMinage;
    }

    public Integer getTravelMaxage() {
        return travelMaxage;
    }

    public void setTravelMaxage(Integer travelMaxage) {
        this.travelMaxage = travelMaxage;
    }

    public Integer getMinDay() {
        return minDay;
    }

    public void setMinDay(Integer minDay) {
        this.minDay = minDay;
    }

    public Integer getMaxDay() {
        return maxDay;
    }

    public void setMaxDay(Integer maxDay) {
        this.maxDay = maxDay;
    }

    public Double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(Double baseRate) {
        this.baseRate = baseRate;
    }

    public Integer getMinimumPremium() {
        return minimumPremium;
    }

    public void setMinimumPremium(Integer minimumPremium) {
        this.minimumPremium = minimumPremium;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tTTravelRateLinkId != null ? tTTravelRateLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTTravelRate)) {
            return false;
        }
        TTTravelRate other = (TTTravelRate) object;
        if ((this.tTTravelRateLinkId == null && other.tTTravelRateLinkId != null) || (this.tTTravelRateLinkId != null && !this.tTTravelRateLinkId.equals(other.tTTravelRateLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TTTravelRate[ tTTravelRateLinkId=" + tTTravelRateLinkId + " ]";
    }
    
}
