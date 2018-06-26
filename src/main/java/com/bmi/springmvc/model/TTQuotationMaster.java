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
@Table(name = "t_t_quotation_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTQuotationMaster.findAll", query = "SELECT t FROM TTQuotationMaster t")
    , @NamedQuery(name = "TTQuotationMaster.findByQuotationLinkId", query = "SELECT t FROM TTQuotationMaster t WHERE t.quotationLinkId = :quotationLinkId")
    , @NamedQuery(name = "TTQuotationMaster.findByQuotationNumber", query = "SELECT t FROM TTQuotationMaster t WHERE t.quotationNumber = :quotationNumber")
    , @NamedQuery(name = "TTQuotationMaster.findByQuotationCreatedDate", query = "SELECT t FROM TTQuotationMaster t WHERE t.quotationCreatedDate = :quotationCreatedDate")
    , @NamedQuery(name = "TTQuotationMaster.findByCreatedById", query = "SELECT t FROM TTQuotationMaster t WHERE t.createdById = :createdById")
    , @NamedQuery(name = "TTQuotationMaster.findByLobLinkId", query = "SELECT t FROM TTQuotationMaster t WHERE t.lobLinkId = :lobLinkId")
    , @NamedQuery(name = "TTQuotationMaster.findByInsuranceCompanyLinkId", query = "SELECT t FROM TTQuotationMaster t WHERE t.insuranceCompanyLinkId = :insuranceCompanyLinkId")
    , @NamedQuery(name = "TTQuotationMaster.findByBrokerLinkId", query = "SELECT t FROM TTQuotationMaster t WHERE t.brokerLinkId = :brokerLinkId")
    , @NamedQuery(name = "TTQuotationMaster.findByQuotationStatus", query = "SELECT t FROM TTQuotationMaster t WHERE t.quotationStatus = :quotationStatus")
    , @NamedQuery(name = "TTQuotationMaster.findByPlanLinkId", query = "SELECT t FROM TTQuotationMaster t WHERE t.planLinkId = :planLinkId")
    , @NamedQuery(name = "TTQuotationMaster.findByOwnerLinkId", query = "SELECT t FROM TTQuotationMaster t WHERE t.ownerLinkId = :ownerLinkId")
    , @NamedQuery(name = "TTQuotationMaster.findByCustomerLinkId", query = "SELECT t FROM TTQuotationMaster t WHERE t.customerLinkId = :customerLinkId")
    , @NamedQuery(name = "TTQuotationMaster.findByMapPlanCompanyLinkId", query = "SELECT t FROM TTQuotationMaster t WHERE t.mapPlanCompanyLinkId = :mapPlanCompanyLinkId")})
public class TTQuotationMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "quotation_link_id")
    private Integer quotationLinkId;
    @Size(max = 10)
    @Column(name = "quotation_number")
    private String quotationNumber;
    @Column(name = "quotation_created_date")
    @Temporal(TemporalType.DATE)
    private Date quotationCreatedDate;
    @Column(name = "created_by_id")
    private Integer createdById;
    @Column(name = "lob_link_id")
    private Integer lobLinkId;
    @Column(name = "insurance_company_link_id")
    private Integer insuranceCompanyLinkId;
    @Column(name = "broker_link_id")
    private Integer brokerLinkId;
    @Column(name = "quotation_status")
    private Integer quotationStatus;
    @Column(name = "plan_link_id")
    private Integer planLinkId;
    @Column(name = "owner_link_id")
    private Integer ownerLinkId;
    @Column(name = "customer_link_id")
    private Integer customerLinkId;
    @Column(name = "map_plan_company_link_id")
    private Integer mapPlanCompanyLinkId;

    public TTQuotationMaster() {
    }

    public TTQuotationMaster(Integer quotationLinkId) {
        this.quotationLinkId = quotationLinkId;
    }

    public Integer getQuotationLinkId() {
        return quotationLinkId;
    }

    public void setQuotationLinkId(Integer quotationLinkId) {
        this.quotationLinkId = quotationLinkId;
    }

    public String getQuotationNumber() {
        return quotationNumber;
    }

    public void setQuotationNumber(String quotationNumber) {
        this.quotationNumber = quotationNumber;
    }

    public Date getQuotationCreatedDate() {
        return quotationCreatedDate;
    }

    public void setQuotationCreatedDate(Date quotationCreatedDate) {
        this.quotationCreatedDate = quotationCreatedDate;
    }

    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    public Integer getLobLinkId() {
        return lobLinkId;
    }

    public void setLobLinkId(Integer lobLinkId) {
        this.lobLinkId = lobLinkId;
    }

    public Integer getInsuranceCompanyLinkId() {
        return insuranceCompanyLinkId;
    }

    public void setInsuranceCompanyLinkId(Integer insuranceCompanyLinkId) {
        this.insuranceCompanyLinkId = insuranceCompanyLinkId;
    }

    public Integer getBrokerLinkId() {
        return brokerLinkId;
    }

    public void setBrokerLinkId(Integer brokerLinkId) {
        this.brokerLinkId = brokerLinkId;
    }

    public Integer getQuotationStatus() {
        return quotationStatus;
    }

    public void setQuotationStatus(Integer quotationStatus) {
        this.quotationStatus = quotationStatus;
    }

    public Integer getPlanLinkId() {
        return planLinkId;
    }

    public void setPlanLinkId(Integer planLinkId) {
        this.planLinkId = planLinkId;
    }

    public Integer getOwnerLinkId() {
        return ownerLinkId;
    }

    public void setOwnerLinkId(Integer ownerLinkId) {
        this.ownerLinkId = ownerLinkId;
    }

    public Integer getCustomerLinkId() {
        return customerLinkId;
    }

    public void setCustomerLinkId(Integer customerLinkId) {
        this.customerLinkId = customerLinkId;
    }

    public Integer getMapPlanCompanyLinkId() {
        return mapPlanCompanyLinkId;
    }

    public void setMapPlanCompanyLinkId(Integer mapPlanCompanyLinkId) {
        this.mapPlanCompanyLinkId = mapPlanCompanyLinkId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quotationLinkId != null ? quotationLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTQuotationMaster)) {
            return false;
        }
        TTQuotationMaster other = (TTQuotationMaster) object;
        if ((this.quotationLinkId == null && other.quotationLinkId != null) || (this.quotationLinkId != null && !this.quotationLinkId.equals(other.quotationLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TTQuotationMaster[ quotationLinkId=" + quotationLinkId + " ]";
    }
    
}
