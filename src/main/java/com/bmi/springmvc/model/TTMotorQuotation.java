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
@Table(name = "t_t_motor_quotation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTMotorQuotation.findAll", query = "SELECT t FROM TTMotorQuotation t")
    , @NamedQuery(name = "TTMotorQuotation.findByMotorQuotationLinkId", query = "SELECT t FROM TTMotorQuotation t WHERE t.motorQuotationLinkId = :motorQuotationLinkId")
    , @NamedQuery(name = "TTMotorQuotation.findByQuotationLinkId", query = "SELECT t FROM TTMotorQuotation t WHERE t.quotationLinkId = :quotationLinkId")
    , @NamedQuery(name = "TTMotorQuotation.findByVehicleMakeLinkId", query = "SELECT t FROM TTMotorQuotation t WHERE t.vehicleMakeLinkId = :vehicleMakeLinkId")
    , @NamedQuery(name = "TTMotorQuotation.findByVehicleModelLinkId", query = "SELECT t FROM TTMotorQuotation t WHERE t.vehicleModelLinkId = :vehicleModelLinkId")
    , @NamedQuery(name = "TTMotorQuotation.findByBodyTypeLinkId", query = "SELECT t FROM TTMotorQuotation t WHERE t.bodyTypeLinkId = :bodyTypeLinkId")
    , @NamedQuery(name = "TTMotorQuotation.findByPolicyTypeLinkId", query = "SELECT t FROM TTMotorQuotation t WHERE t.policyTypeLinkId = :policyTypeLinkId")
    , @NamedQuery(name = "TTMotorQuotation.findByInsuredType", query = "SELECT t FROM TTMotorQuotation t WHERE t.insuredType = :insuredType")
    , @NamedQuery(name = "TTMotorQuotation.findByNationalityLinkId", query = "SELECT t FROM TTMotorQuotation t WHERE t.nationalityLinkId = :nationalityLinkId")})
public class TTMotorQuotation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "motor_quotation_link_id")
    private Integer motorQuotationLinkId;
    @Column(name = "quotation_link_id")
    private Integer quotationLinkId;
    @Size(max = 30)
    @Column(name = "vehicle_make_link_id")
    private String vehicleMakeLinkId;
    @Size(max = 30)
    @Column(name = "vehicle_model_link_id")
    private String vehicleModelLinkId;
    @Size(max = 30)
    @Column(name = "body_type_link_id")
    private String bodyTypeLinkId;
    @Size(max = 30)
    @Column(name = "policy_type_link_id")
    private String policyTypeLinkId;
    @Size(max = 15)
    @Column(name = "insured_type")
    private String insuredType;
    @Column(name = "nationality_link_id")
    private Integer nationalityLinkId;

    public TTMotorQuotation() {
    }

    public TTMotorQuotation(Integer motorQuotationLinkId) {
        this.motorQuotationLinkId = motorQuotationLinkId;
    }

    public Integer getMotorQuotationLinkId() {
        return motorQuotationLinkId;
    }

    public void setMotorQuotationLinkId(Integer motorQuotationLinkId) {
        this.motorQuotationLinkId = motorQuotationLinkId;
    }

    public Integer getQuotationLinkId() {
        return quotationLinkId;
    }

    public void setQuotationLinkId(Integer quotationLinkId) {
        this.quotationLinkId = quotationLinkId;
    }

    public String getVehicleMakeLinkId() {
        return vehicleMakeLinkId;
    }

    public void setVehicleMakeLinkId(String vehicleMakeLinkId) {
        this.vehicleMakeLinkId = vehicleMakeLinkId;
    }

    public String getVehicleModelLinkId() {
        return vehicleModelLinkId;
    }

    public void setVehicleModelLinkId(String vehicleModelLinkId) {
        this.vehicleModelLinkId = vehicleModelLinkId;
    }

    public String getBodyTypeLinkId() {
        return bodyTypeLinkId;
    }

    public void setBodyTypeLinkId(String bodyTypeLinkId) {
        this.bodyTypeLinkId = bodyTypeLinkId;
    }

    public String getPolicyTypeLinkId() {
        return policyTypeLinkId;
    }

    public void setPolicyTypeLinkId(String policyTypeLinkId) {
        this.policyTypeLinkId = policyTypeLinkId;
    }

    public String getInsuredType() {
        return insuredType;
    }

    public void setInsuredType(String insuredType) {
        this.insuredType = insuredType;
    }

    public Integer getNationalityLinkId() {
        return nationalityLinkId;
    }

    public void setNationalityLinkId(Integer nationalityLinkId) {
        this.nationalityLinkId = nationalityLinkId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (motorQuotationLinkId != null ? motorQuotationLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTMotorQuotation)) {
            return false;
        }
        TTMotorQuotation other = (TTMotorQuotation) object;
        if ((this.motorQuotationLinkId == null && other.motorQuotationLinkId != null) || (this.motorQuotationLinkId != null && !this.motorQuotationLinkId.equals(other.motorQuotationLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TTMotorQuotation[ motorQuotationLinkId=" + motorQuotationLinkId + " ]";
    }
    
}
