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
@Table(name = "t_t_proposal_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTProposalMaster.findAll", query = "SELECT t FROM TTProposalMaster t")
    , @NamedQuery(name = "TTProposalMaster.findByProposalLinkId", query = "SELECT t FROM TTProposalMaster t WHERE t.proposalLinkId = :proposalLinkId")
    , @NamedQuery(name = "TTProposalMaster.findByQuotationLinkId", query = "SELECT t FROM TTProposalMaster t WHERE t.quotationLinkId = :quotationLinkId")
    , @NamedQuery(name = "TTProposalMaster.findByProposalNumber", query = "SELECT t FROM TTProposalMaster t WHERE t.proposalNumber = :proposalNumber")
    , @NamedQuery(name = "TTProposalMaster.findByCreatedById", query = "SELECT t FROM TTProposalMaster t WHERE t.createdById = :createdById")
    , @NamedQuery(name = "TTProposalMaster.findByBasePremium", query = "SELECT t FROM TTProposalMaster t WHERE t.basePremium = :basePremium")
    , @NamedQuery(name = "TTProposalMaster.findByServiceFees", query = "SELECT t FROM TTProposalMaster t WHERE t.serviceFees = :serviceFees")
    , @NamedQuery(name = "TTProposalMaster.findByAdminFees", query = "SELECT t FROM TTProposalMaster t WHERE t.adminFees = :adminFees")
    , @NamedQuery(name = "TTProposalMaster.findByProposalTax", query = "SELECT t FROM TTProposalMaster t WHERE t.proposalTax = :proposalTax")
    , @NamedQuery(name = "TTProposalMaster.findByTotalPremium", query = "SELECT t FROM TTProposalMaster t WHERE t.totalPremium = :totalPremium")
    , @NamedQuery(name = "TTProposalMaster.findByCreatedDate", query = "SELECT t FROM TTProposalMaster t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TTProposalMaster.findByStartDate", query = "SELECT t FROM TTProposalMaster t WHERE t.startDate = :startDate")
    , @NamedQuery(name = "TTProposalMaster.findByExpiryDate", query = "SELECT t FROM TTProposalMaster t WHERE t.expiryDate = :expiryDate")
    , @NamedQuery(name = "TTProposalMaster.findByLobLinkId", query = "SELECT t FROM TTProposalMaster t WHERE t.lobLinkId = :lobLinkId")})
public class TTProposalMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "proposal_link_id")
    private Integer proposalLinkId;
    @Column(name = "quotation_link_id")
    private Integer quotationLinkId;
    @Size(max = 20)
    @Column(name = "proposal_number")
    private String proposalNumber;
    @Size(max = 20)
    @Column(name = "created_by_id")
    private String createdById;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "base_premium")
    private Double basePremium;
    @Column(name = "service_fees")
    private Double serviceFees;
    @Column(name = "admin_fees")
    private Double adminFees;
    @Column(name = "proposal_tax")
    private Double proposalTax;
    @Column(name = "total_premium")
    private Integer totalPremium;
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "expiry_date")
    @Temporal(TemporalType.DATE)
    private Date expiryDate;
    @Column(name = "lob_link_id")
    private Integer lobLinkId;

    public TTProposalMaster() {
    }

    public TTProposalMaster(Integer proposalLinkId) {
        this.proposalLinkId = proposalLinkId;
    }

    public Integer getProposalLinkId() {
        return proposalLinkId;
    }

    public void setProposalLinkId(Integer proposalLinkId) {
        this.proposalLinkId = proposalLinkId;
    }

    public Integer getQuotationLinkId() {
        return quotationLinkId;
    }

    public void setQuotationLinkId(Integer quotationLinkId) {
        this.quotationLinkId = quotationLinkId;
    }

    public String getProposalNumber() {
        return proposalNumber;
    }

    public void setProposalNumber(String proposalNumber) {
        this.proposalNumber = proposalNumber;
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    public Double getBasePremium() {
        return basePremium;
    }

    public void setBasePremium(Double basePremium) {
        this.basePremium = basePremium;
    }

    public Double getServiceFees() {
        return serviceFees;
    }

    public void setServiceFees(Double serviceFees) {
        this.serviceFees = serviceFees;
    }

    public Double getAdminFees() {
        return adminFees;
    }

    public void setAdminFees(Double adminFees) {
        this.adminFees = adminFees;
    }

    public Double getProposalTax() {
        return proposalTax;
    }

    public void setProposalTax(Double proposalTax) {
        this.proposalTax = proposalTax;
    }

    public Integer getTotalPremium() {
        return totalPremium;
    }

    public void setTotalPremium(Integer totalPremium) {
        this.totalPremium = totalPremium;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getLobLinkId() {
        return lobLinkId;
    }

    public void setLobLinkId(Integer lobLinkId) {
        this.lobLinkId = lobLinkId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proposalLinkId != null ? proposalLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTProposalMaster)) {
            return false;
        }
        TTProposalMaster other = (TTProposalMaster) object;
        if ((this.proposalLinkId == null && other.proposalLinkId != null) || (this.proposalLinkId != null && !this.proposalLinkId.equals(other.proposalLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TTProposalMaster[ proposalLinkId=" + proposalLinkId + " ]";
    }
    
}
