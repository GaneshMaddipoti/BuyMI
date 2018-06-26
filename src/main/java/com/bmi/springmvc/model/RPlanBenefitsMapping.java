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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ganesmad
 */
@Entity
@Table(name = "r_plan_benefits_mapping")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RPlanBenefitsMapping.findAll", query = "SELECT r FROM RPlanBenefitsMapping r")
    , @NamedQuery(name = "RPlanBenefitsMapping.findByPlanBenefitsMappingLinkId", query = "SELECT r FROM RPlanBenefitsMapping r WHERE r.planBenefitsMappingLinkId = :planBenefitsMappingLinkId")
    , @NamedQuery(name = "RPlanBenefitsMapping.findByMapPlanCompanyLinkId", query = "SELECT r FROM RPlanBenefitsMapping r WHERE r.mapPlanCompanyLinkId = :mapPlanCompanyLinkId")
    , @NamedQuery(name = "RPlanBenefitsMapping.findByBenefitLinkId", query = "SELECT r FROM RPlanBenefitsMapping r WHERE r.benefitLinkId = :benefitLinkId")
    , @NamedQuery(name = "RPlanBenefitsMapping.findByPrice", query = "SELECT r FROM RPlanBenefitsMapping r WHERE r.price = :price")
    , @NamedQuery(name = "RPlanBenefitsMapping.findByPercentage", query = "SELECT r FROM RPlanBenefitsMapping r WHERE r.percentage = :percentage")
    , @NamedQuery(name = "RPlanBenefitsMapping.findByIncluded", query = "SELECT r FROM RPlanBenefitsMapping r WHERE r.included = :included")
    , @NamedQuery(name = "RPlanBenefitsMapping.findByPerSeat", query = "SELECT r FROM RPlanBenefitsMapping r WHERE r.perSeat = :perSeat")
    , @NamedQuery(name = "RPlanBenefitsMapping.findByLoadDiscount", query = "SELECT r FROM RPlanBenefitsMapping r WHERE r.loadDiscount = :loadDiscount")
    , @NamedQuery(name = "RPlanBenefitsMapping.findByMinimumCoverPremium", query = "SELECT r FROM RPlanBenefitsMapping r WHERE r.minimumCoverPremium = :minimumCoverPremium")})
public class RPlanBenefitsMapping implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "plan_benefits_mapping_link_id")
    private Integer planBenefitsMappingLinkId;
    @Column(name = "map_plan_company_link_id")
    private Integer mapPlanCompanyLinkId;
    @JoinColumn(name = "benefit_link_id", referencedColumnName = "benefit_link_id")
    @ManyToOne
    private TMBenefit benefitLinkId;
    @Column(name = "price")
    private Integer price;
    @Column(name = "percentage")
    private Integer percentage;
    @Column(name = "included")
    private Integer included;
    @Column(name = "per_seat")
    private Integer perSeat;
    @Column(name = "load_discount")
    private Integer loadDiscount;
    @Column(name = "minimum_cover_premium")
    private Integer minimumCoverPremium;

    public RPlanBenefitsMapping() {
    }

    public RPlanBenefitsMapping(Integer planBenefitsMappingLinkId) {
        this.planBenefitsMappingLinkId = planBenefitsMappingLinkId;
    }

    public Integer getPlanBenefitsMappingLinkId() {
        return planBenefitsMappingLinkId;
    }

    public void setPlanBenefitsMappingLinkId(Integer planBenefitsMappingLinkId) {
        this.planBenefitsMappingLinkId = planBenefitsMappingLinkId;
    }

    public Integer getMapPlanCompanyLinkId() {
        return mapPlanCompanyLinkId;
    }

    public void setMapPlanCompanyLinkId(Integer mapPlanCompanyLinkId) {
        this.mapPlanCompanyLinkId = mapPlanCompanyLinkId;
    }

    public TMBenefit getBenefitLinkId() {
        return benefitLinkId;
    }

    public void setBenefitLinkId(TMBenefit benefitLinkId) {
        this.benefitLinkId = benefitLinkId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public Integer getIncluded() {
        return included;
    }

    public void setIncluded(Integer included) {
        this.included = included;
    }

    public Integer getPerSeat() {
        return perSeat;
    }

    public void setPerSeat(Integer perSeat) {
        this.perSeat = perSeat;
    }

    public Integer getLoadDiscount() {
        return loadDiscount;
    }

    public void setLoadDiscount(Integer loadDiscount) {
        this.loadDiscount = loadDiscount;
    }

    public Integer getMinimumCoverPremium() {
        return minimumCoverPremium;
    }

    public void setMinimumCoverPremium(Integer minimumCoverPremium) {
        this.minimumCoverPremium = minimumCoverPremium;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (planBenefitsMappingLinkId != null ? planBenefitsMappingLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RPlanBenefitsMapping)) {
            return false;
        }
        RPlanBenefitsMapping other = (RPlanBenefitsMapping) object;
        if ((this.planBenefitsMappingLinkId == null && other.planBenefitsMappingLinkId != null) || (this.planBenefitsMappingLinkId != null && !this.planBenefitsMappingLinkId.equals(other.planBenefitsMappingLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.RPlanBenefitsMapping[ planBenefitsMappingLinkId=" + planBenefitsMappingLinkId + " ]";
    }
    
}
