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
@Table(name = "t_t_wc_benefits_mapping")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTWcBenefitsMapping.findAll", query = "SELECT t FROM TTWcBenefitsMapping t")
    , @NamedQuery(name = "TTWcBenefitsMapping.findByPlanBenefitsMappingLinkId", query = "SELECT t FROM TTWcBenefitsMapping t WHERE t.planBenefitsMappingLinkId = :planBenefitsMappingLinkId")
    , @NamedQuery(name = "TTWcBenefitsMapping.findByMapPlanCompanyLinkId", query = "SELECT t FROM TTWcBenefitsMapping t WHERE t.mapPlanCompanyLinkId = :mapPlanCompanyLinkId")
    , @NamedQuery(name = "TTWcBenefitsMapping.findByBenefitLinkId", query = "SELECT t FROM TTWcBenefitsMapping t WHERE t.benefitLinkId = :benefitLinkId")
    , @NamedQuery(name = "TTWcBenefitsMapping.findByPrice", query = "SELECT t FROM TTWcBenefitsMapping t WHERE t.price = :price")
    , @NamedQuery(name = "TTWcBenefitsMapping.findByPercentage", query = "SELECT t FROM TTWcBenefitsMapping t WHERE t.percentage = :percentage")
    , @NamedQuery(name = "TTWcBenefitsMapping.findByIncluded", query = "SELECT t FROM TTWcBenefitsMapping t WHERE t.included = :included")
    , @NamedQuery(name = "TTWcBenefitsMapping.findByLoadDiscount", query = "SELECT t FROM TTWcBenefitsMapping t WHERE t.loadDiscount = :loadDiscount")
    , @NamedQuery(name = "TTWcBenefitsMapping.findByMinimumCoverPremium", query = "SELECT t FROM TTWcBenefitsMapping t WHERE t.minimumCoverPremium = :minimumCoverPremium")})
public class TTWcBenefitsMapping implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "plan_benefits_mapping_link_id")
    private Integer planBenefitsMappingLinkId;
    @Column(name = "map_plan_company_link_id")
    private Integer mapPlanCompanyLinkId;
    @Column(name = "benefit_link_id")
    private Integer benefitLinkId;
    @Column(name = "price")
    private Integer price;
    @Column(name = "percentage")
    private Integer percentage;
    @Column(name = "included")
    private Integer included;
    @Column(name = "load_discount")
    private Integer loadDiscount;
    @Column(name = "minimum_cover_premium")
    private Integer minimumCoverPremium;

    public TTWcBenefitsMapping() {
    }

    public TTWcBenefitsMapping(Integer planBenefitsMappingLinkId) {
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

    public Integer getBenefitLinkId() {
        return benefitLinkId;
    }

    public void setBenefitLinkId(Integer benefitLinkId) {
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
        if (!(object instanceof TTWcBenefitsMapping)) {
            return false;
        }
        TTWcBenefitsMapping other = (TTWcBenefitsMapping) object;
        if ((this.planBenefitsMappingLinkId == null && other.planBenefitsMappingLinkId != null) || (this.planBenefitsMappingLinkId != null && !this.planBenefitsMappingLinkId.equals(other.planBenefitsMappingLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TTWcBenefitsMapping[ planBenefitsMappingLinkId=" + planBenefitsMappingLinkId + " ]";
    }
    
}
