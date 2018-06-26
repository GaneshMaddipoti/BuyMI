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
@Table(name = "t_t_travel_insured")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTTravelInsured.findAll", query = "SELECT t FROM TTTravelInsured t")
    , @NamedQuery(name = "TTTravelInsured.findByTravelInsuredLinkId", query = "SELECT t FROM TTTravelInsured t WHERE t.travelInsuredLinkId = :travelInsuredLinkId")
    , @NamedQuery(name = "TTTravelInsured.findByTravellerName", query = "SELECT t FROM TTTravelInsured t WHERE t.travellerName = :travellerName")
    , @NamedQuery(name = "TTTravelInsured.findByTravellerDob", query = "SELECT t FROM TTTravelInsured t WHERE t.travellerDob = :travellerDob")
    , @NamedQuery(name = "TTTravelInsured.findByTravellerPassport", query = "SELECT t FROM TTTravelInsured t WHERE t.travellerPassport = :travellerPassport")
    , @NamedQuery(name = "TTTravelInsured.findByTravellerEmirites", query = "SELECT t FROM TTTravelInsured t WHERE t.travellerEmirites = :travellerEmirites")
    , @NamedQuery(name = "TTTravelInsured.findByTravellerType", query = "SELECT t FROM TTTravelInsured t WHERE t.travellerType = :travellerType")})
public class TTTravelInsured implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "travel_insured_link_id")
    private Integer travelInsuredLinkId;
    @Size(max = 50)
    @Column(name = "traveller_name")
    private String travellerName;
    @Column(name = "traveller_dob")
    @Temporal(TemporalType.DATE)
    private Date travellerDob;
    @Size(max = 50)
    @Column(name = "traveller_passport")
    private String travellerPassport;
    @Size(max = 50)
    @Column(name = "traveller_emirites")
    private String travellerEmirites;
    @Size(max = 50)
    @Column(name = "traveller_type")
    private String travellerType;
    @JoinColumn(name = "travel_owner_link_id", referencedColumnName = "travel_owner_link_id")
    @ManyToOne
    private TTTravelOwner travelOwnerLinkId;

    public TTTravelInsured() {
    }

    public TTTravelInsured(Integer travelInsuredLinkId) {
        this.travelInsuredLinkId = travelInsuredLinkId;
    }

    public Integer getTravelInsuredLinkId() {
        return travelInsuredLinkId;
    }

    public void setTravelInsuredLinkId(Integer travelInsuredLinkId) {
        this.travelInsuredLinkId = travelInsuredLinkId;
    }

    public String getTravellerName() {
        return travellerName;
    }

    public void setTravellerName(String travellerName) {
        this.travellerName = travellerName;
    }

    public Date getTravellerDob() {
        return travellerDob;
    }

    public void setTravellerDob(Date travellerDob) {
        this.travellerDob = travellerDob;
    }

    public String getTravellerPassport() {
        return travellerPassport;
    }

    public void setTravellerPassport(String travellerPassport) {
        this.travellerPassport = travellerPassport;
    }

    public String getTravellerEmirites() {
        return travellerEmirites;
    }

    public void setTravellerEmirites(String travellerEmirites) {
        this.travellerEmirites = travellerEmirites;
    }

    public String getTravellerType() {
        return travellerType;
    }

    public void setTravellerType(String travellerType) {
        this.travellerType = travellerType;
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
        hash += (travelInsuredLinkId != null ? travelInsuredLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTTravelInsured)) {
            return false;
        }
        TTTravelInsured other = (TTTravelInsured) object;
        if ((this.travelInsuredLinkId == null && other.travelInsuredLinkId != null) || (this.travelInsuredLinkId != null && !this.travelInsuredLinkId.equals(other.travelInsuredLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TTTravelInsured[ travelInsuredLinkId=" + travelInsuredLinkId + " ]";
    }
    
}
