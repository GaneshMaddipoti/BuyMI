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
@Table(name = "t_t_quote_plan_selected_rates")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTQuotePlanSelectedRates.findAll", query = "SELECT t FROM TTQuotePlanSelectedRates t")
    , @NamedQuery(name = "TTQuotePlanSelectedRates.findByQuotePlanSelectedRatesLinkId", query = "SELECT t FROM TTQuotePlanSelectedRates t WHERE t.quotePlanSelectedRatesLinkId = :quotePlanSelectedRatesLinkId")
    , @NamedQuery(name = "TTQuotePlanSelectedRates.findByQuotationLinkId", query = "SELECT t FROM TTQuotePlanSelectedRates t WHERE t.quotationLinkId = :quotationLinkId")
    , @NamedQuery(name = "TTQuotePlanSelectedRates.findByMapPlanCompanyLinkId", query = "SELECT t FROM TTQuotePlanSelectedRates t WHERE t.mapPlanCompanyLinkId = :mapPlanCompanyLinkId")
    , @NamedQuery(name = "TTQuotePlanSelectedRates.findByPremium", query = "SELECT t FROM TTQuotePlanSelectedRates t WHERE t.premium = :premium")
    , @NamedQuery(name = "TTQuotePlanSelectedRates.findByRate", query = "SELECT t FROM TTQuotePlanSelectedRates t WHERE t.rate = :rate")
    , @NamedQuery(name = "TTQuotePlanSelectedRates.findByLoadingDiscount", query = "SELECT t FROM TTQuotePlanSelectedRates t WHERE t.loadingDiscount = :loadingDiscount")
    , @NamedQuery(name = "TTQuotePlanSelectedRates.findByCoverCode", query = "SELECT t FROM TTQuotePlanSelectedRates t WHERE t.coverCode = :coverCode")
    , @NamedQuery(name = "TTQuotePlanSelectedRates.findByLobId", query = "SELECT t FROM TTQuotePlanSelectedRates t WHERE t.lobId = :lobId")})
public class TTQuotePlanSelectedRates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "quote_plan_selected_rates_link_id")
    private Integer quotePlanSelectedRatesLinkId;
    @Column(name = "quotation_link_id")
    private Integer quotationLinkId;
    @Column(name = "map_plan_company_link_id")
    private Integer mapPlanCompanyLinkId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "premium")
    private Double premium;
    @Column(name = "rate")
    private Double rate;
    @Column(name = "loading_discount")
    private Integer loadingDiscount;
    @Column(name = "cover_code")
    private Integer coverCode;
    @Column(name = "lob_id")
    private Integer lobId;

    public TTQuotePlanSelectedRates() {
    }

    public TTQuotePlanSelectedRates(Integer quotePlanSelectedRatesLinkId) {
        this.quotePlanSelectedRatesLinkId = quotePlanSelectedRatesLinkId;
    }

    public Integer getQuotePlanSelectedRatesLinkId() {
        return quotePlanSelectedRatesLinkId;
    }

    public void setQuotePlanSelectedRatesLinkId(Integer quotePlanSelectedRatesLinkId) {
        this.quotePlanSelectedRatesLinkId = quotePlanSelectedRatesLinkId;
    }

    public Integer getQuotationLinkId() {
        return quotationLinkId;
    }

    public void setQuotationLinkId(Integer quotationLinkId) {
        this.quotationLinkId = quotationLinkId;
    }

    public Integer getMapPlanCompanyLinkId() {
        return mapPlanCompanyLinkId;
    }

    public void setMapPlanCompanyLinkId(Integer mapPlanCompanyLinkId) {
        this.mapPlanCompanyLinkId = mapPlanCompanyLinkId;
    }

    public Double getPremium() {
        return premium;
    }

    public void setPremium(Double premium) {
        this.premium = premium;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Integer getLoadingDiscount() {
        return loadingDiscount;
    }

    public void setLoadingDiscount(Integer loadingDiscount) {
        this.loadingDiscount = loadingDiscount;
    }

    public Integer getCoverCode() {
        return coverCode;
    }

    public void setCoverCode(Integer coverCode) {
        this.coverCode = coverCode;
    }

    public Integer getLobId() {
        return lobId;
    }

    public void setLobId(Integer lobId) {
        this.lobId = lobId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quotePlanSelectedRatesLinkId != null ? quotePlanSelectedRatesLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTQuotePlanSelectedRates)) {
            return false;
        }
        TTQuotePlanSelectedRates other = (TTQuotePlanSelectedRates) object;
        if ((this.quotePlanSelectedRatesLinkId == null && other.quotePlanSelectedRatesLinkId != null) || (this.quotePlanSelectedRatesLinkId != null && !this.quotePlanSelectedRatesLinkId.equals(other.quotePlanSelectedRatesLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TTQuotePlanSelectedRates[ quotePlanSelectedRatesLinkId=" + quotePlanSelectedRatesLinkId + " ]";
    }
    
}
