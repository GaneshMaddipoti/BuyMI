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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "t_t_travel_emergency")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTTravelEmergency.findAll", query = "SELECT t FROM TTTravelEmergency t")
    , @NamedQuery(name = "TTTravelEmergency.findByTravelEmergencyLinkId", query = "SELECT t FROM TTTravelEmergency t WHERE t.travelEmergencyLinkId = :travelEmergencyLinkId")
    , @NamedQuery(name = "TTTravelEmergency.findByOwnerRelationship", query = "SELECT t FROM TTTravelEmergency t WHERE t.ownerRelationship = :ownerRelationship")
    , @NamedQuery(name = "TTTravelEmergency.findByContactName", query = "SELECT t FROM TTTravelEmergency t WHERE t.contactName = :contactName")
    , @NamedQuery(name = "TTTravelEmergency.findByContactAddress", query = "SELECT t FROM TTTravelEmergency t WHERE t.contactAddress = :contactAddress")
    , @NamedQuery(name = "TTTravelEmergency.findByContactMobile", query = "SELECT t FROM TTTravelEmergency t WHERE t.contactMobile = :contactMobile")
    , @NamedQuery(name = "TTTravelEmergency.findByContactPhone", query = "SELECT t FROM TTTravelEmergency t WHERE t.contactPhone = :contactPhone")})
public class TTTravelEmergency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "travel_emergency_link_id")
    private Integer travelEmergencyLinkId;
    @Size(max = 50)
    @Column(name = "owner_relationship")
    private String ownerRelationship;
    @Size(max = 50)
    @Column(name = "contact_name")
    private String contactName;
    @Size(max = 100)
    @Column(name = "contact_address")
    private String contactAddress;
    @Size(max = 20)
    @Column(name = "contact_mobile")
    private String contactMobile;
    @Size(max = 20)
    @Column(name = "contact_phone")
    private String contactPhone;
    @JoinColumn(name = "travel_owner_link_id", referencedColumnName = "travel_owner_link_id")
    @ManyToOne
    private TTTravelOwner travelOwnerLinkId;

    public TTTravelEmergency() {
    }

    public TTTravelEmergency(Integer travelEmergencyLinkId) {
        this.travelEmergencyLinkId = travelEmergencyLinkId;
    }

    public Integer getTravelEmergencyLinkId() {
        return travelEmergencyLinkId;
    }

    public void setTravelEmergencyLinkId(Integer travelEmergencyLinkId) {
        this.travelEmergencyLinkId = travelEmergencyLinkId;
    }

    public String getOwnerRelationship() {
        return ownerRelationship;
    }

    public void setOwnerRelationship(String ownerRelationship) {
        this.ownerRelationship = ownerRelationship;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public TTTravelOwner getTravelOwnerLinkId() {
        return travelOwnerLinkId;
    }

    public void setTravelOwnerLinkId(TTTravelOwner travelOwnerLinkId) {
        this.travelOwnerLinkId = travelOwnerLinkId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (travelEmergencyLinkId != null ? travelEmergencyLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTTravelEmergency)) {
            return false;
        }
        TTTravelEmergency other = (TTTravelEmergency) object;
        if ((this.travelEmergencyLinkId == null && other.travelEmergencyLinkId != null) || (this.travelEmergencyLinkId != null && !this.travelEmergencyLinkId.equals(other.travelEmergencyLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TTTravelEmergency[ travelEmergencyLinkId=" + travelEmergencyLinkId + " ]";
    }
    
}
