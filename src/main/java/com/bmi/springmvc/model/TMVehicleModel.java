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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "t_m_vehicle_model")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMVehicleModel.findAll", query = "SELECT t FROM TMVehicleModel t")
    , @NamedQuery(name = "TMVehicleModel.findByVehicleModelLinkId", query = "SELECT t FROM TMVehicleModel t WHERE t.vehicleModelLinkId = :vehicleModelLinkId")
    , @NamedQuery(name = "TMVehicleModel.findByVehicleModelName", query = "SELECT t FROM TMVehicleModel t WHERE t.vehicleModelName = :vehicleModelName")
    , @NamedQuery(name = "TMVehicleModel.findByVehicleModelNameAr", query = "SELECT t FROM TMVehicleModel t WHERE t.vehicleModelNameAr = :vehicleModelNameAr")
    , @NamedQuery(name = "TMVehicleModel.findByVehicleMakeLinkId", query = "SELECT t FROM TMVehicleModel t WHERE t.vehicleMakeLinkId = :vehicleMakeLinkId")
    , @NamedQuery(name = "TMVehicleModel.findByBodyTypeLinkId", query = "SELECT t FROM TMVehicleModel t WHERE t.bodyTypeLinkId = :bodyTypeLinkId")
    , @NamedQuery(name = "TMVehicleModel.findByIsReferral", query = "SELECT t FROM TMVehicleModel t WHERE t.isReferral = :isReferral")
    , @NamedQuery(name = "TMVehicleModel.findByVehicleType", query = "SELECT t FROM TMVehicleModel t WHERE t.vehicleType = :vehicleType")
    , @NamedQuery(name = "TMVehicleModel.findByNumberOfSeats", query = "SELECT t FROM TMVehicleModel t WHERE t.numberOfSeats = :numberOfSeats")
    , @NamedQuery(name = "TMVehicleModel.findByCreatedDate", query = "SELECT t FROM TMVehicleModel t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMVehicleModel.findByModifiedDate", query = "SELECT t FROM TMVehicleModel t WHERE t.modifiedDate = :modifiedDate")})
public class TMVehicleModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "vehicle_model_link_id")
    private Integer vehicleModelLinkId;
    @Size(max = 70)
    @Column(name = "vehicle_model_name")
    private String vehicleModelName;
    @Size(max = 140)
    @Column(name = "vehicle_model_name_ar")
    private String vehicleModelNameAr;
    @Column(name = "vehicle_make_link_id")
    private Integer vehicleMakeLinkId;
    @Column(name = "body_type_link_id")
    private Integer bodyTypeLinkId;
    @Column(name = "is_referral")
    private Character isReferral;
    @Column(name = "vehicle_type")
    private Character vehicleType;
    @Column(name = "number_of_seats")
    private Integer numberOfSeats;
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(name = "modified_date")
    @Temporal(TemporalType.DATE)
    private Date modifiedDate;
    @JoinColumn(name = "created_by_id", referencedColumnName = "admin_link_id")
    @ManyToOne
    private TMAdmin createdById;
    @JoinColumn(name = "modified_by_id", referencedColumnName = "admin_link_id")
    @ManyToOne
    private TMAdmin modifiedById;

    public TMVehicleModel() {
    }

    public TMVehicleModel(Integer vehicleModelLinkId) {
        this.vehicleModelLinkId = vehicleModelLinkId;
    }

    public Integer getVehicleModelLinkId() {
        return vehicleModelLinkId;
    }

    public void setVehicleModelLinkId(Integer vehicleModelLinkId) {
        this.vehicleModelLinkId = vehicleModelLinkId;
    }

    public String getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    public String getVehicleModelNameAr() {
        return vehicleModelNameAr;
    }

    public void setVehicleModelNameAr(String vehicleModelNameAr) {
        this.vehicleModelNameAr = vehicleModelNameAr;
    }

    public Integer getVehicleMakeLinkId() {
        return vehicleMakeLinkId;
    }

    public void setVehicleMakeLinkId(Integer vehicleMakeLinkId) {
        this.vehicleMakeLinkId = vehicleMakeLinkId;
    }

    public Integer getBodyTypeLinkId() {
        return bodyTypeLinkId;
    }

    public void setBodyTypeLinkId(Integer bodyTypeLinkId) {
        this.bodyTypeLinkId = bodyTypeLinkId;
    }

    public Character getIsReferral() {
        return isReferral;
    }

    public void setIsReferral(Character isReferral) {
        this.isReferral = isReferral;
    }

    public Character getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Character vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public TMAdmin getCreatedById() {
        return createdById;
    }

    public void setCreatedById(TMAdmin createdById) {
        this.createdById = createdById;
    }

    public TMAdmin getModifiedById() {
        return modifiedById;
    }

    public void setModifiedById(TMAdmin modifiedById) {
        this.modifiedById = modifiedById;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vehicleModelLinkId != null ? vehicleModelLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMVehicleModel)) {
            return false;
        }
        TMVehicleModel other = (TMVehicleModel) object;
        if ((this.vehicleModelLinkId == null && other.vehicleModelLinkId != null) || (this.vehicleModelLinkId != null && !this.vehicleModelLinkId.equals(other.vehicleModelLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMVehicleModel[ vehicleModelLinkId=" + vehicleModelLinkId + " ]";
    }
    
}
