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
@Table(name = "t_t_motor_quotation_benefits")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTMotorQuotationBenefits.findAll", query = "SELECT t FROM TTMotorQuotationBenefits t")
    , @NamedQuery(name = "TTMotorQuotationBenefits.findByMotorQuotationBenefitsLinkId", query = "SELECT t FROM TTMotorQuotationBenefits t WHERE t.motorQuotationBenefitsLinkId = :motorQuotationBenefitsLinkId")
    , @NamedQuery(name = "TTMotorQuotationBenefits.findByQuotationLinkId", query = "SELECT t FROM TTMotorQuotationBenefits t WHERE t.quotationLinkId = :quotationLinkId")
    , @NamedQuery(name = "TTMotorQuotationBenefits.findByBenefitLinkId", query = "SELECT t FROM TTMotorQuotationBenefits t WHERE t.benefitLinkId = :benefitLinkId")
    , @NamedQuery(name = "TTMotorQuotationBenefits.findByBenefitPremium", query = "SELECT t FROM TTMotorQuotationBenefits t WHERE t.benefitPremium = :benefitPremium")
    , @NamedQuery(name = "TTMotorQuotationBenefits.findByMapPlanCompanyLinkId", query = "SELECT t FROM TTMotorQuotationBenefits t WHERE t.mapPlanCompanyLinkId = :mapPlanCompanyLinkId")
    , @NamedQuery(name = "TTMotorQuotationBenefits.findByBasePremium", query = "SELECT t FROM TTMotorQuotationBenefits t WHERE t.basePremium = :basePremium")
    , @NamedQuery(name = "TTMotorQuotationBenefits.findByTotalPremium", query = "SELECT t FROM TTMotorQuotationBenefits t WHERE t.totalPremium = :totalPremium")
    , @NamedQuery(name = "TTMotorQuotationBenefits.findByBenefitRate", query = "SELECT t FROM TTMotorQuotationBenefits t WHERE t.benefitRate = :benefitRate")})
public class TTMotorQuotationBenefits implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "motor_quotation_benefits_link_id")
    private Integer motorQuotationBenefitsLinkId;
    @Column(name = "quotation_link_id")
    private Integer quotationLinkId;
    @Size(max = 20)
    @Column(name = "benefit_link_id")
    private String benefitLinkId;
    @Column(name = "benefit_premium")
    @Temporal(TemporalType.DATE)
    private Date benefitPremium;
    @Column(name = "map_plan_company_link_id")
    private Integer mapPlanCompanyLinkId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "base_premium")
    private Double basePremium;
    @Column(name = "total_premium")
    private Double totalPremium;
    @Column(name = "benefit_rate")
    private Integer benefitRate;

    public TTMotorQuotationBenefits() {
    }

    public TTMotorQuotationBenefits(Integer motorQuotationBenefitsLinkId) {
        this.motorQuotationBenefitsLinkId = motorQuotationBenefitsLinkId;
    }

    public Integer getMotorQuotationBenefitsLinkId() {
        return motorQuotationBenefitsLinkId;
    }

    public void setMotorQuotationBenefitsLinkId(Integer motorQuotationBenefitsLinkId) {
        this.motorQuotationBenefitsLinkId = motorQuotationBenefitsLinkId;
    }

    public Integer getQuotationLinkId() {
        return quotationLinkId;
    }

    public void setQuotationLinkId(Integer quotationLinkId) {
        this.quotationLinkId = quotationLinkId;
    }

    public String getBenefitLinkId() {
        return benefitLinkId;
    }

    public void setBenefitLinkId(String benefitLinkId) {
        this.benefitLinkId = benefitLinkId;
    }

    public Date getBenefitPremium() {
        return benefitPremium;
    }

    public void setBenefitPremium(Date benefitPremium) {
        this.benefitPremium = benefitPremium;
    }

    public Integer getMapPlanCompanyLinkId() {
        return mapPlanCompanyLinkId;
    }

    public void setMapPlanCompanyLinkId(Integer mapPlanCompanyLinkId) {
        this.mapPlanCompanyLinkId = mapPlanCompanyLinkId;
    }

    public Double getBasePremium() {
        return basePremium;
    }

    public void setBasePremium(Double basePremium) {
        this.basePremium = basePremium;
    }

    public Double getTotalPremium() {
        return totalPremium;
    }

    public void setTotalPremium(Double totalPremium) {
        this.totalPremium = totalPremium;
    }

    public Integer getBenefitRate() {
        return benefitRate;
    }

    public void setBenefitRate(Integer benefitRate) {
        this.benefitRate = benefitRate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (motorQuotationBenefitsLinkId != null ? motorQuotationBenefitsLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTMotorQuotationBenefits)) {
            return false;
        }
        TTMotorQuotationBenefits other = (TTMotorQuotationBenefits) object;
        if ((this.motorQuotationBenefitsLinkId == null && other.motorQuotationBenefitsLinkId != null) || (this.motorQuotationBenefitsLinkId != null && !this.motorQuotationBenefitsLinkId.equals(other.motorQuotationBenefitsLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TTMotorQuotationBenefits[ motorQuotationBenefitsLinkId=" + motorQuotationBenefitsLinkId + " ]";
    }
    
}
