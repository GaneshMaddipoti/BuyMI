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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ganesmad
 */
@Entity
@Table(name = "t_m_vechicle_insured")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMVechicleInsured.findAll", query = "SELECT t FROM TMVechicleInsured t")
    , @NamedQuery(name = "TMVechicleInsured.findByOwnerLinkId", query = "SELECT t FROM TMVechicleInsured t WHERE t.ownerLinkId = :ownerLinkId")
    , @NamedQuery(name = "TMVechicleInsured.findByVehicleRegType", query = "SELECT t FROM TMVechicleInsured t WHERE t.vehicleRegType = :vehicleRegType")
    , @NamedQuery(name = "TMVechicleInsured.findByVehicleMakeLinkId", query = "SELECT t FROM TMVechicleInsured t WHERE t.vehicleMakeLinkId = :vehicleMakeLinkId")
    , @NamedQuery(name = "TMVechicleInsured.findByVehicleManufacturingYear", query = "SELECT t FROM TMVechicleInsured t WHERE t.vehicleManufacturingYear = :vehicleManufacturingYear")
    , @NamedQuery(name = "TMVechicleInsured.findByFirstRegDate", query = "SELECT t FROM TMVechicleInsured t WHERE t.firstRegDate = :firstRegDate")
    , @NamedQuery(name = "TMVechicleInsured.findByVehicleModelLinkId", query = "SELECT t FROM TMVechicleInsured t WHERE t.vehicleModelLinkId = :vehicleModelLinkId")
    , @NamedQuery(name = "TMVechicleInsured.findByNoPassenger", query = "SELECT t FROM TMVechicleInsured t WHERE t.noPassenger = :noPassenger")
    , @NamedQuery(name = "TMVechicleInsured.findByVehicleModelSpec", query = "SELECT t FROM TMVechicleInsured t WHERE t.vehicleModelSpec = :vehicleModelSpec")
    , @NamedQuery(name = "TMVechicleInsured.findByNonGCCSpec", query = "SELECT t FROM TMVechicleInsured t WHERE t.nonGCCSpec = :nonGCCSpec")
    , @NamedQuery(name = "TMVechicleInsured.findByBodyTypeLinkId", query = "SELECT t FROM TMVechicleInsured t WHERE t.bodyTypeLinkId = :bodyTypeLinkId")
    , @NamedQuery(name = "TMVechicleInsured.findBySumInsured", query = "SELECT t FROM TMVechicleInsured t WHERE t.sumInsured = :sumInsured")
    , @NamedQuery(name = "TMVechicleInsured.findByCustomerLinkId", query = "SELECT t FROM TMVechicleInsured t WHERE t.customerLinkId = :customerLinkId")
    , @NamedQuery(name = "TMVechicleInsured.findByRegistrationPlaceLinkId", query = "SELECT t FROM TMVechicleInsured t WHERE t.registrationPlaceLinkId = :registrationPlaceLinkId")})
public class TMVechicleInsured implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "owner_link_id")
    private Integer ownerLinkId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "vehicle_reg_type")
    private String vehicleRegType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vehicle_make_link_id")
    private int vehicleMakeLinkId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vehicle_manufacturing_year")
    private int vehicleManufacturingYear;
    @Column(name = "first_reg_date")
    @Temporal(TemporalType.DATE)
    private Date firstRegDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vehicle_model_link_id")
    private int vehicleModelLinkId;
    @Column(name = "no_passenger")
    private Integer noPassenger;
    @Size(max = 20)
    @Column(name = "vehicle_model_spec")
    private String vehicleModelSpec;
    @Size(max = 10)
    @Column(name = "non_GCC_Spec")
    private String nonGCCSpec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "body_type_link_id")
    private int bodyTypeLinkId;
    @Column(name = "sum_insured")
    private Integer sumInsured;
    @Column(name = "customer_link_id")
    private Integer customerLinkId;
    @Column(name = "registration_place_link_id")
    private Integer registrationPlaceLinkId;

    public TMVechicleInsured() {
    }

    public TMVechicleInsured(Integer ownerLinkId) {
        this.ownerLinkId = ownerLinkId;
    }

    public TMVechicleInsured(Integer ownerLinkId, String vehicleRegType, int vehicleMakeLinkId, int vehicleManufacturingYear, int vehicleModelLinkId, int bodyTypeLinkId) {
        this.ownerLinkId = ownerLinkId;
        this.vehicleRegType = vehicleRegType;
        this.vehicleMakeLinkId = vehicleMakeLinkId;
        this.vehicleManufacturingYear = vehicleManufacturingYear;
        this.vehicleModelLinkId = vehicleModelLinkId;
        this.bodyTypeLinkId = bodyTypeLinkId;
    }

    public Integer getOwnerLinkId() {
        return ownerLinkId;
    }

    public void setOwnerLinkId(Integer ownerLinkId) {
        this.ownerLinkId = ownerLinkId;
    }

    public String getVehicleRegType() {
        return vehicleRegType;
    }

    public void setVehicleRegType(String vehicleRegType) {
        this.vehicleRegType = vehicleRegType;
    }

    public int getVehicleMakeLinkId() {
        return vehicleMakeLinkId;
    }

    public void setVehicleMakeLinkId(int vehicleMakeLinkId) {
        this.vehicleMakeLinkId = vehicleMakeLinkId;
    }

    public int getVehicleManufacturingYear() {
        return vehicleManufacturingYear;
    }

    public void setVehicleManufacturingYear(int vehicleManufacturingYear) {
        this.vehicleManufacturingYear = vehicleManufacturingYear;
    }

    public Date getFirstRegDate() {
        return firstRegDate;
    }

    public void setFirstRegDate(Date firstRegDate) {
        this.firstRegDate = firstRegDate;
    }

    public int getVehicleModelLinkId() {
        return vehicleModelLinkId;
    }

    public void setVehicleModelLinkId(int vehicleModelLinkId) {
        this.vehicleModelLinkId = vehicleModelLinkId;
    }

    public Integer getNoPassenger() {
        return noPassenger;
    }

    public void setNoPassenger(Integer noPassenger) {
        this.noPassenger = noPassenger;
    }

    public String getVehicleModelSpec() {
        return vehicleModelSpec;
    }

    public void setVehicleModelSpec(String vehicleModelSpec) {
        this.vehicleModelSpec = vehicleModelSpec;
    }

    public String getNonGCCSpec() {
        return nonGCCSpec;
    }

    public void setNonGCCSpec(String nonGCCSpec) {
        this.nonGCCSpec = nonGCCSpec;
    }

    public int getBodyTypeLinkId() {
        return bodyTypeLinkId;
    }

    public void setBodyTypeLinkId(int bodyTypeLinkId) {
        this.bodyTypeLinkId = bodyTypeLinkId;
    }

    public Integer getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(Integer sumInsured) {
        this.sumInsured = sumInsured;
    }

    public Integer getCustomerLinkId() {
        return customerLinkId;
    }

    public void setCustomerLinkId(Integer customerLinkId) {
        this.customerLinkId = customerLinkId;
    }

    public Integer getRegistrationPlaceLinkId() {
        return registrationPlaceLinkId;
    }

    public void setRegistrationPlaceLinkId(Integer registrationPlaceLinkId) {
        this.registrationPlaceLinkId = registrationPlaceLinkId;
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
        if (!(object instanceof TMVechicleInsured)) {
            return false;
        }
        TMVechicleInsured other = (TMVechicleInsured) object;
        if ((this.ownerLinkId == null && other.ownerLinkId != null) || (this.ownerLinkId != null && !this.ownerLinkId.equals(other.ownerLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMVechicleInsured[ ownerLinkId=" + ownerLinkId + " ]";
    }
    
}
