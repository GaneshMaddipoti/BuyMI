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
@Table(name = "t_m_vechicle_insured_optional")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMVechicleInsuredOptional.findAll", query = "SELECT t FROM TMVechicleInsuredOptional t")
    , @NamedQuery(name = "TMVechicleInsuredOptional.findByOwnerLinkId", query = "SELECT t FROM TMVechicleInsuredOptional t WHERE t.ownerLinkId = :ownerLinkId")
    , @NamedQuery(name = "TMVechicleInsuredOptional.findByVehicleChassisNo", query = "SELECT t FROM TMVechicleInsuredOptional t WHERE t.vehicleChassisNo = :vehicleChassisNo")
    , @NamedQuery(name = "TMVechicleInsuredOptional.findByVehicleColourLinkId", query = "SELECT t FROM TMVechicleInsuredOptional t WHERE t.vehicleColourLinkId = :vehicleColourLinkId")
    , @NamedQuery(name = "TMVechicleInsuredOptional.findByVehicleEngineNo", query = "SELECT t FROM TMVechicleInsuredOptional t WHERE t.vehicleEngineNo = :vehicleEngineNo")
    , @NamedQuery(name = "TMVechicleInsuredOptional.findByVehicleRegNo", query = "SELECT t FROM TMVechicleInsuredOptional t WHERE t.vehicleRegNo = :vehicleRegNo")
    , @NamedQuery(name = "TMVechicleInsuredOptional.findByIsMortgage", query = "SELECT t FROM TMVechicleInsuredOptional t WHERE t.isMortgage = :isMortgage")
    , @NamedQuery(name = "TMVechicleInsuredOptional.findByBankMortgageLinkId", query = "SELECT t FROM TMVechicleInsuredOptional t WHERE t.bankMortgageLinkId = :bankMortgageLinkId")
    , @NamedQuery(name = "TMVechicleInsuredOptional.findByCustomerLinkId", query = "SELECT t FROM TMVechicleInsuredOptional t WHERE t.customerLinkId = :customerLinkId")})
public class TMVechicleInsuredOptional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "owner_link_id")
    private Integer ownerLinkId;
    @Size(max = 20)
    @Column(name = "vehicle_chassis_no")
    private String vehicleChassisNo;
    @Size(max = 10)
    @Column(name = "vehicle_colour_link_id")
    private String vehicleColourLinkId;
    @Size(max = 50)
    @Column(name = "vehicle_engine_no")
    private String vehicleEngineNo;
    @Size(max = 50)
    @Column(name = "vehicle_reg_no")
    private String vehicleRegNo;
    @Size(max = 4)
    @Column(name = "is_mortgage")
    private String isMortgage;
    @Column(name = "bank_mortgage_link_id")
    private Integer bankMortgageLinkId;
    @Column(name = "customer_link_id")
    private Integer customerLinkId;

    public TMVechicleInsuredOptional() {
    }

    public TMVechicleInsuredOptional(Integer ownerLinkId) {
        this.ownerLinkId = ownerLinkId;
    }

    public Integer getOwnerLinkId() {
        return ownerLinkId;
    }

    public void setOwnerLinkId(Integer ownerLinkId) {
        this.ownerLinkId = ownerLinkId;
    }

    public String getVehicleChassisNo() {
        return vehicleChassisNo;
    }

    public void setVehicleChassisNo(String vehicleChassisNo) {
        this.vehicleChassisNo = vehicleChassisNo;
    }

    public String getVehicleColourLinkId() {
        return vehicleColourLinkId;
    }

    public void setVehicleColourLinkId(String vehicleColourLinkId) {
        this.vehicleColourLinkId = vehicleColourLinkId;
    }

    public String getVehicleEngineNo() {
        return vehicleEngineNo;
    }

    public void setVehicleEngineNo(String vehicleEngineNo) {
        this.vehicleEngineNo = vehicleEngineNo;
    }

    public String getVehicleRegNo() {
        return vehicleRegNo;
    }

    public void setVehicleRegNo(String vehicleRegNo) {
        this.vehicleRegNo = vehicleRegNo;
    }

    public String getIsMortgage() {
        return isMortgage;
    }

    public void setIsMortgage(String isMortgage) {
        this.isMortgage = isMortgage;
    }

    public Integer getBankMortgageLinkId() {
        return bankMortgageLinkId;
    }

    public void setBankMortgageLinkId(Integer bankMortgageLinkId) {
        this.bankMortgageLinkId = bankMortgageLinkId;
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
        if (!(object instanceof TMVechicleInsuredOptional)) {
            return false;
        }
        TMVechicleInsuredOptional other = (TMVechicleInsuredOptional) object;
        if ((this.ownerLinkId == null && other.ownerLinkId != null) || (this.ownerLinkId != null && !this.ownerLinkId.equals(other.ownerLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMVechicleInsuredOptional[ ownerLinkId=" + ownerLinkId + " ]";
    }
    
}
