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
@Table(name = "t_m_vehicle_make")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMVehicleMake.findAll", query = "SELECT t FROM TMVehicleMake t")
    , @NamedQuery(name = "TMVehicleMake.findByVehicleMakeLinkId", query = "SELECT t FROM TMVehicleMake t WHERE t.vehicleMakeLinkId = :vehicleMakeLinkId")
    , @NamedQuery(name = "TMVehicleMake.findByVehicleMakeName", query = "SELECT t FROM TMVehicleMake t WHERE t.vehicleMakeName = :vehicleMakeName")
    , @NamedQuery(name = "TMVehicleMake.findByCreatedDate", query = "SELECT t FROM TMVehicleMake t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMVehicleMake.findByModifiedDate", query = "SELECT t FROM TMVehicleMake t WHERE t.modifiedDate = :modifiedDate")})
public class TMVehicleMake implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "vehicle_make_link_id")
    private Integer vehicleMakeLinkId;
    @Size(max = 70)
    @Column(name = "vehicle_make_name")
    private String vehicleMakeName;
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

    public TMVehicleMake() {
    }

    public TMVehicleMake(Integer vehicleMakeLinkId) {
        this.vehicleMakeLinkId = vehicleMakeLinkId;
    }

    public Integer getVehicleMakeLinkId() {
        return vehicleMakeLinkId;
    }

    public void setVehicleMakeLinkId(Integer vehicleMakeLinkId) {
        this.vehicleMakeLinkId = vehicleMakeLinkId;
    }

    public String getVehicleMakeName() {
        return vehicleMakeName;
    }

    public void setVehicleMakeName(String vehicleMakeName) {
        this.vehicleMakeName = vehicleMakeName;
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
        hash += (vehicleMakeLinkId != null ? vehicleMakeLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMVehicleMake)) {
            return false;
        }
        TMVehicleMake other = (TMVehicleMake) object;
        if ((this.vehicleMakeLinkId == null && other.vehicleMakeLinkId != null) || (this.vehicleMakeLinkId != null && !this.vehicleMakeLinkId.equals(other.vehicleMakeLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMVehicleMake[ vehicleMakeLinkId=" + vehicleMakeLinkId + " ]";
    }
    
}
