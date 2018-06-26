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
@Table(name = "t_m_motor_owner_optional")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMMotorOwnerOptional.findAll", query = "SELECT t FROM TMMotorOwnerOptional t")
    , @NamedQuery(name = "TMMotorOwnerOptional.findByOwnerLinkId", query = "SELECT t FROM TMMotorOwnerOptional t WHERE t.ownerLinkId = :ownerLinkId")
    , @NamedQuery(name = "TMMotorOwnerOptional.findByTrafficCode", query = "SELECT t FROM TMMotorOwnerOptional t WHERE t.trafficCode = :trafficCode")
    , @NamedQuery(name = "TMMotorOwnerOptional.findByInsuredAddress", query = "SELECT t FROM TMMotorOwnerOptional t WHERE t.insuredAddress = :insuredAddress")
    , @NamedQuery(name = "TMMotorOwnerOptional.findByInsuredNameArabic", query = "SELECT t FROM TMMotorOwnerOptional t WHERE t.insuredNameArabic = :insuredNameArabic")
    , @NamedQuery(name = "TMMotorOwnerOptional.findByPolicyStartDt", query = "SELECT t FROM TMMotorOwnerOptional t WHERE t.policyStartDt = :policyStartDt")
    , @NamedQuery(name = "TMMotorOwnerOptional.findByPolicyEndDt", query = "SELECT t FROM TMMotorOwnerOptional t WHERE t.policyEndDt = :policyEndDt")
    , @NamedQuery(name = "TMMotorOwnerOptional.findByDrivingLicenceNo", query = "SELECT t FROM TMMotorOwnerOptional t WHERE t.drivingLicenceNo = :drivingLicenceNo")
    , @NamedQuery(name = "TMMotorOwnerOptional.findByPoBox", query = "SELECT t FROM TMMotorOwnerOptional t WHERE t.poBox = :poBox")
    , @NamedQuery(name = "TMMotorOwnerOptional.findByCompanyNamedDriver", query = "SELECT t FROM TMMotorOwnerOptional t WHERE t.companyNamedDriver = :companyNamedDriver")
    , @NamedQuery(name = "TMMotorOwnerOptional.findByEmiratesId", query = "SELECT t FROM TMMotorOwnerOptional t WHERE t.emiratesId = :emiratesId")
    , @NamedQuery(name = "TMMotorOwnerOptional.findByInsuredEmirates", query = "SELECT t FROM TMMotorOwnerOptional t WHERE t.insuredEmirates = :insuredEmirates")
    , @NamedQuery(name = "TMMotorOwnerOptional.findByInsuredOccupation", query = "SELECT t FROM TMMotorOwnerOptional t WHERE t.insuredOccupation = :insuredOccupation")
    , @NamedQuery(name = "TMMotorOwnerOptional.findByCustomerLinkId", query = "SELECT t FROM TMMotorOwnerOptional t WHERE t.customerLinkId = :customerLinkId")})
public class TMMotorOwnerOptional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "owner_link_id")
    private Integer ownerLinkId;
    @Size(max = 20)
    @Column(name = "traffic_code")
    private String trafficCode;
    @Size(max = 100)
    @Column(name = "insured_address")
    private String insuredAddress;
    @Size(max = 200)
    @Column(name = "insured_name_arabic")
    private String insuredNameArabic;
    @Column(name = "policy_start_dt")
    @Temporal(TemporalType.DATE)
    private Date policyStartDt;
    @Column(name = "policy_end_dt")
    @Temporal(TemporalType.DATE)
    private Date policyEndDt;
    @Size(max = 20)
    @Column(name = "driving_licence_no")
    private String drivingLicenceNo;
    @Size(max = 10)
    @Column(name = "po_box")
    private String poBox;
    @Size(max = 20)
    @Column(name = "company_named_driver")
    private String companyNamedDriver;
    @Size(max = 20)
    @Column(name = "emirates_id")
    private String emiratesId;
    @Size(max = 50)
    @Column(name = "insured_emirates")
    private String insuredEmirates;
    @Size(max = 50)
    @Column(name = "insured_occupation")
    private String insuredOccupation;
    @Column(name = "customer_link_id")
    private Integer customerLinkId;

    public TMMotorOwnerOptional() {
    }

    public TMMotorOwnerOptional(Integer ownerLinkId) {
        this.ownerLinkId = ownerLinkId;
    }

    public Integer getOwnerLinkId() {
        return ownerLinkId;
    }

    public void setOwnerLinkId(Integer ownerLinkId) {
        this.ownerLinkId = ownerLinkId;
    }

    public String getTrafficCode() {
        return trafficCode;
    }

    public void setTrafficCode(String trafficCode) {
        this.trafficCode = trafficCode;
    }

    public String getInsuredAddress() {
        return insuredAddress;
    }

    public void setInsuredAddress(String insuredAddress) {
        this.insuredAddress = insuredAddress;
    }

    public String getInsuredNameArabic() {
        return insuredNameArabic;
    }

    public void setInsuredNameArabic(String insuredNameArabic) {
        this.insuredNameArabic = insuredNameArabic;
    }

    public Date getPolicyStartDt() {
        return policyStartDt;
    }

    public void setPolicyStartDt(Date policyStartDt) {
        this.policyStartDt = policyStartDt;
    }

    public Date getPolicyEndDt() {
        return policyEndDt;
    }

    public void setPolicyEndDt(Date policyEndDt) {
        this.policyEndDt = policyEndDt;
    }

    public String getDrivingLicenceNo() {
        return drivingLicenceNo;
    }

    public void setDrivingLicenceNo(String drivingLicenceNo) {
        this.drivingLicenceNo = drivingLicenceNo;
    }

    public String getPoBox() {
        return poBox;
    }

    public void setPoBox(String poBox) {
        this.poBox = poBox;
    }

    public String getCompanyNamedDriver() {
        return companyNamedDriver;
    }

    public void setCompanyNamedDriver(String companyNamedDriver) {
        this.companyNamedDriver = companyNamedDriver;
    }

    public String getEmiratesId() {
        return emiratesId;
    }

    public void setEmiratesId(String emiratesId) {
        this.emiratesId = emiratesId;
    }

    public String getInsuredEmirates() {
        return insuredEmirates;
    }

    public void setInsuredEmirates(String insuredEmirates) {
        this.insuredEmirates = insuredEmirates;
    }

    public String getInsuredOccupation() {
        return insuredOccupation;
    }

    public void setInsuredOccupation(String insuredOccupation) {
        this.insuredOccupation = insuredOccupation;
    }

    public Integer getCustomerLinkId() {
        return customerLinkId;
    }

    public void setCustomerLinkId(Integer customerLinkId) {
        this.customerLinkId = customerLinkId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ownerLinkId != null ? ownerLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMMotorOwnerOptional)) {
            return false;
        }
        TMMotorOwnerOptional other = (TMMotorOwnerOptional) object;
        if ((this.ownerLinkId == null && other.ownerLinkId != null) || (this.ownerLinkId != null && !this.ownerLinkId.equals(other.ownerLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMMotorOwnerOptional[ ownerLinkId=" + ownerLinkId + " ]";
    }
    
}
