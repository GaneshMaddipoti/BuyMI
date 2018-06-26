/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmi.springmvc.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ganesmad
 */
@Entity
@Table(name = "t_t_travel_owner")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTTravelOwner.findAll", query = "SELECT t FROM TTTravelOwner t")
    , @NamedQuery(name = "TTTravelOwner.findByTravelOwnerLinkId", query = "SELECT t FROM TTTravelOwner t WHERE t.travelOwnerLinkId = :travelOwnerLinkId")
    , @NamedQuery(name = "TTTravelOwner.findByCustomerLinkId", query = "SELECT t FROM TTTravelOwner t WHERE t.customerLinkId = :customerLinkId")
    , @NamedQuery(name = "TTTravelOwner.findByTravleTripTypeLinkId", query = "SELECT t FROM TTTravelOwner t WHERE t.travleTripTypeLinkId = :travleTripTypeLinkId")
    , @NamedQuery(name = "TTTravelOwner.findByPolicyTypeLinkId", query = "SELECT t FROM TTTravelOwner t WHERE t.policyTypeLinkId = :policyTypeLinkId")
    , @NamedQuery(name = "TTTravelOwner.findByTravelDestinationLinkId", query = "SELECT t FROM TTTravelOwner t WHERE t.travelDestinationLinkId = :travelDestinationLinkId")
    , @NamedQuery(name = "TTTravelOwner.findByCoverStartDate", query = "SELECT t FROM TTTravelOwner t WHERE t.coverStartDate = :coverStartDate")
    , @NamedQuery(name = "TTTravelOwner.findByCoverEndDate", query = "SELECT t FROM TTTravelOwner t WHERE t.coverEndDate = :coverEndDate")
    , @NamedQuery(name = "TTTravelOwner.findByTravelDays", query = "SELECT t FROM TTTravelOwner t WHERE t.travelDays = :travelDays")
    , @NamedQuery(name = "TTTravelOwner.findByNoOfTravellers", query = "SELECT t FROM TTTravelOwner t WHERE t.noOfTravellers = :noOfTravellers")
    , @NamedQuery(name = "TTTravelOwner.findByNoOfChildren", query = "SELECT t FROM TTTravelOwner t WHERE t.noOfChildren = :noOfChildren")
    , @NamedQuery(name = "TTTravelOwner.findByTotalTraveller", query = "SELECT t FROM TTTravelOwner t WHERE t.totalTraveller = :totalTraveller")})
public class TTTravelOwner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "travel_owner_link_id")
    private Integer travelOwnerLinkId;
    @Column(name = "customer_link_id")
    private Integer customerLinkId;
    @Column(name = "travle_trip_type_link_id")
    private Integer travleTripTypeLinkId;
    @Column(name = "policy_type_link_id")
    private Integer policyTypeLinkId;
    @Column(name = "travel_destination_link_id")
    private Integer travelDestinationLinkId;
    @Column(name = "cover_start_date")
    @Temporal(TemporalType.DATE)
    private Date coverStartDate;
    @Column(name = "cover_end_date")
    @Temporal(TemporalType.DATE)
    private Date coverEndDate;
    @Column(name = "travel_days")
    private Integer travelDays;
    @Column(name = "no_of_travellers")
    private Integer noOfTravellers;
    @Column(name = "no_of_children")
    private Integer noOfChildren;
    @Column(name = "total_traveller")
    private Integer totalTraveller;
    @OneToMany(mappedBy = "travelOwnerLinkId")
    private Collection<TTTravelInsured> tTTravelInsuredCollection;
    @OneToMany(mappedBy = "travelOwnerLinkId")
    private Collection<TTTravelEmergency> tTTravelEmergencyCollection;

    public TTTravelOwner() {
    }

    public TTTravelOwner(Integer travelOwnerLinkId) {
        this.travelOwnerLinkId = travelOwnerLinkId;
    }

    public Integer getTravelOwnerLinkId() {
        return travelOwnerLinkId;
    }

    public void setTravelOwnerLinkId(Integer travelOwnerLinkId) {
        this.travelOwnerLinkId = travelOwnerLinkId;
    }

    public Integer getCustomerLinkId() {
        return customerLinkId;
    }

    public void setCustomerLinkId(Integer customerLinkId) {
        this.customerLinkId = customerLinkId;
    }

    public Integer getTravleTripTypeLinkId() {
        return travleTripTypeLinkId;
    }

    public void setTravleTripTypeLinkId(Integer travleTripTypeLinkId) {
        this.travleTripTypeLinkId = travleTripTypeLinkId;
    }

    public Integer getPolicyTypeLinkId() {
        return policyTypeLinkId;
    }

    public void setPolicyTypeLinkId(Integer policyTypeLinkId) {
        this.policyTypeLinkId = policyTypeLinkId;
    }

    public Integer getTravelDestinationLinkId() {
        return travelDestinationLinkId;
    }

    public void setTravelDestinationLinkId(Integer travelDestinationLinkId) {
        this.travelDestinationLinkId = travelDestinationLinkId;
    }

    public Date getCoverStartDate() {
        return coverStartDate;
    }

    public void setCoverStartDate(Date coverStartDate) {
        this.coverStartDate = coverStartDate;
    }

    public Date getCoverEndDate() {
        return coverEndDate;
    }

    public void setCoverEndDate(Date coverEndDate) {
        this.coverEndDate = coverEndDate;
    }

    public Integer getTravelDays() {
        return travelDays;
    }

    public void setTravelDays(Integer travelDays) {
        this.travelDays = travelDays;
    }

    public Integer getNoOfTravellers() {
        return noOfTravellers;
    }

    public void setNoOfTravellers(Integer noOfTravellers) {
        this.noOfTravellers = noOfTravellers;
    }

    public Integer getNoOfChildren() {
        return noOfChildren;
    }

    public void setNoOfChildren(Integer noOfChildren) {
        this.noOfChildren = noOfChildren;
    }

    public Integer getTotalTraveller() {
        return totalTraveller;
    }

    public void setTotalTraveller(Integer totalTraveller) {
        this.totalTraveller = totalTraveller;
    }

    @XmlTransient
    public Collection<TTTravelInsured> getTTTravelInsuredCollection() {
        return tTTravelInsuredCollection;
    }

    public void setTTTravelInsuredCollection(Collection<TTTravelInsured> tTTravelInsuredCollection) {
        this.tTTravelInsuredCollection = tTTravelInsuredCollection;
    }

    @XmlTransient
    public Collection<TTTravelEmergency> getTTTravelEmergencyCollection() {
        return tTTravelEmergencyCollection;
    }

    public void setTTTravelEmergencyCollection(Collection<TTTravelEmergency> tTTravelEmergencyCollection) {
        this.tTTravelEmergencyCollection = tTTravelEmergencyCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (travelOwnerLinkId != null ? travelOwnerLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTTravelOwner)) {
            return false;
        }
        TTTravelOwner other = (TTTravelOwner) object;
        if ((this.travelOwnerLinkId == null && other.travelOwnerLinkId != null) || (this.travelOwnerLinkId != null && !this.travelOwnerLinkId.equals(other.travelOwnerLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TTTravelOwner[ travelOwnerLinkId=" + travelOwnerLinkId + " ]";
    }
    
}
