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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ganesmad
 */
@Entity
@Table(name = "t_t_motor_proposal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTMotorProposal.findAll", query = "SELECT t FROM TTMotorProposal t")
    , @NamedQuery(name = "TTMotorProposal.findByMotorProposalLinkId", query = "SELECT t FROM TTMotorProposal t WHERE t.motorProposalLinkId = :motorProposalLinkId")
    , @NamedQuery(name = "TTMotorProposal.findByQuotationLinkId", query = "SELECT t FROM TTMotorProposal t WHERE t.quotationLinkId = :quotationLinkId")
    , @NamedQuery(name = "TTMotorProposal.findByProposalLinkId", query = "SELECT t FROM TTMotorProposal t WHERE t.proposalLinkId = :proposalLinkId")
    , @NamedQuery(name = "TTMotorProposal.findByTrafficCode", query = "SELECT t FROM TTMotorProposal t WHERE t.trafficCode = :trafficCode")
    , @NamedQuery(name = "TTMotorProposal.findByDrivingLicense", query = "SELECT t FROM TTMotorProposal t WHERE t.drivingLicense = :drivingLicense")
    , @NamedQuery(name = "TTMotorProposal.findByCompanyNamedDriver", query = "SELECT t FROM TTMotorProposal t WHERE t.companyNamedDriver = :companyNamedDriver")
    , @NamedQuery(name = "TTMotorProposal.findByChassisNumber", query = "SELECT t FROM TTMotorProposal t WHERE t.chassisNumber = :chassisNumber")
    , @NamedQuery(name = "TTMotorProposal.findByEngineNumber", query = "SELECT t FROM TTMotorProposal t WHERE t.engineNumber = :engineNumber")
    , @NamedQuery(name = "TTMotorProposal.findByMapPlanCompanyLinkId", query = "SELECT t FROM TTMotorProposal t WHERE t.mapPlanCompanyLinkId = :mapPlanCompanyLinkId")})
public class TTMotorProposal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "motor_proposal_link_id")
    private Integer motorProposalLinkId;
    @Column(name = "quotation_link_id")
    private Integer quotationLinkId;
    @Column(name = "proposal_link_id")
    private Integer proposalLinkId;
    @Column(name = "traffic_code")
    private Integer trafficCode;
    @Size(max = 20)
    @Column(name = "driving_license")
    private String drivingLicense;
    @Size(max = 20)
    @Column(name = "company_named_driver")
    private String companyNamedDriver;
    @Size(max = 20)
    @Column(name = "chassis_number")
    private String chassisNumber;
    @Size(max = 20)
    @Column(name = "engine_number")
    private String engineNumber;
    @Column(name = "map_plan_company_link_id")
    private Integer mapPlanCompanyLinkId;

    public TTMotorProposal() {
    }

    public TTMotorProposal(Integer motorProposalLinkId) {
        this.motorProposalLinkId = motorProposalLinkId;
    }

    public Integer getMotorProposalLinkId() {
        return motorProposalLinkId;
    }

    public void setMotorProposalLinkId(Integer motorProposalLinkId) {
        this.motorProposalLinkId = motorProposalLinkId;
    }

    public Integer getQuotationLinkId() {
        return quotationLinkId;
    }

    public void setQuotationLinkId(Integer quotationLinkId) {
        this.quotationLinkId = quotationLinkId;
    }

    public Integer getProposalLinkId() {
        return proposalLinkId;
    }

    public void setProposalLinkId(Integer proposalLinkId) {
        this.proposalLinkId = proposalLinkId;
    }

    public Integer getTrafficCode() {
        return trafficCode;
    }

    public void setTrafficCode(Integer trafficCode) {
        this.trafficCode = trafficCode;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public String getCompanyNamedDriver() {
        return companyNamedDriver;
    }

    public void setCompanyNamedDriver(String companyNamedDriver) {
        this.companyNamedDriver = companyNamedDriver;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
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
        hash += (motorProposalLinkId != null ? motorProposalLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTMotorProposal)) {
            return false;
        }
        TTMotorProposal other = (TTMotorProposal) object;
        if ((this.motorProposalLinkId == null && other.motorProposalLinkId != null) || (this.motorProposalLinkId != null && !this.motorProposalLinkId.equals(other.motorProposalLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TTMotorProposal[ motorProposalLinkId=" + motorProposalLinkId + " ]";
    }
    
}
