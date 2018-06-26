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
@Table(name = "t_m_vehicle_color")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMVehicleColor.findAll", query = "SELECT t FROM TMVehicleColor t")
    , @NamedQuery(name = "TMVehicleColor.findByVehicleColorLinkId", query = "SELECT t FROM TMVehicleColor t WHERE t.vehicleColorLinkId = :vehicleColorLinkId")
    , @NamedQuery(name = "TMVehicleColor.findByColorName", query = "SELECT t FROM TMVehicleColor t WHERE t.colorName = :colorName")
    , @NamedQuery(name = "TMVehicleColor.findByColorNameAr", query = "SELECT t FROM TMVehicleColor t WHERE t.colorNameAr = :colorNameAr")
    , @NamedQuery(name = "TMVehicleColor.findByCreatedDate", query = "SELECT t FROM TMVehicleColor t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMVehicleColor.findByModifiedDate", query = "SELECT t FROM TMVehicleColor t WHERE t.modifiedDate = :modifiedDate")
    , @NamedQuery(name = "TMVehicleColor.findByActive", query = "SELECT t FROM TMVehicleColor t WHERE t.active = :active")})
public class TMVehicleColor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "vehicle_color_link_id")
    private Integer vehicleColorLinkId;
    @Size(max = 30)
    @Column(name = "color_name")
    private String colorName;
    @Size(max = 60)
    @Column(name = "color_name_ar")
    private String colorNameAr;
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(name = "modified_date")
    @Temporal(TemporalType.DATE)
    private Date modifiedDate;
    @Column(name = "active")
    private Integer active;
    @JoinColumn(name = "created_by_id", referencedColumnName = "admin_link_id")
    @ManyToOne
    private TMAdmin createdById;
    @JoinColumn(name = "modified_by_id", referencedColumnName = "admin_link_id")
    @ManyToOne
    private TMAdmin modifiedById;

    public TMVehicleColor() {
    }

    public TMVehicleColor(Integer vehicleColorLinkId) {
        this.vehicleColorLinkId = vehicleColorLinkId;
    }

    public Integer getVehicleColorLinkId() {
        return vehicleColorLinkId;
    }

    public void setVehicleColorLinkId(Integer vehicleColorLinkId) {
        this.vehicleColorLinkId = vehicleColorLinkId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getColorNameAr() {
        return colorNameAr;
    }

    public void setColorNameAr(String colorNameAr) {
        this.colorNameAr = colorNameAr;
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

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
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
        hash += (vehicleColorLinkId != null ? vehicleColorLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMVehicleColor)) {
            return false;
        }
        TMVehicleColor other = (TMVehicleColor) object;
        if ((this.vehicleColorLinkId == null && other.vehicleColorLinkId != null) || (this.vehicleColorLinkId != null && !this.vehicleColorLinkId.equals(other.vehicleColorLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMVehicleColor[ vehicleColorLinkId=" + vehicleColorLinkId + " ]";
    }
    
}
