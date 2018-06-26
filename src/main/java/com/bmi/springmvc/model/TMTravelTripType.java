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
@Table(name = "t_m_travel_trip_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMTravelTripType.findAll", query = "SELECT t FROM TMTravelTripType t")
    , @NamedQuery(name = "TMTravelTripType.findByTravelTripTypeLinkId", query = "SELECT t FROM TMTravelTripType t WHERE t.travelTripTypeLinkId = :travelTripTypeLinkId")
    , @NamedQuery(name = "TMTravelTripType.findByTravelTripTypeName", query = "SELECT t FROM TMTravelTripType t WHERE t.travelTripTypeName = :travelTripTypeName")
    , @NamedQuery(name = "TMTravelTripType.findByTravleTripTypeNameArabic", query = "SELECT t FROM TMTravelTripType t WHERE t.travleTripTypeNameArabic = :travleTripTypeNameArabic")
    , @NamedQuery(name = "TMTravelTripType.findByCreatedDate", query = "SELECT t FROM TMTravelTripType t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMTravelTripType.findByCreatedById", query = "SELECT t FROM TMTravelTripType t WHERE t.createdById = :createdById")
    , @NamedQuery(name = "TMTravelTripType.findByModifiedDate", query = "SELECT t FROM TMTravelTripType t WHERE t.modifiedDate = :modifiedDate")
    , @NamedQuery(name = "TMTravelTripType.findByModifiedById", query = "SELECT t FROM TMTravelTripType t WHERE t.modifiedById = :modifiedById")})
public class TMTravelTripType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "travel_trip_type_link_id")
    private Integer travelTripTypeLinkId;
    @Size(max = 50)
    @Column(name = "travel_trip_type_name")
    private String travelTripTypeName;
    @Size(max = 50)
    @Column(name = "travle_trip_type_name_arabic")
    private String travleTripTypeNameArabic;
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(name = "created_by_id")
    private Integer createdById;
    @Column(name = "modified_date")
    @Temporal(TemporalType.DATE)
    private Date modifiedDate;
    @Column(name = "modified_by_id")
    private Integer modifiedById;

    public TMTravelTripType() {
    }

    public TMTravelTripType(Integer travelTripTypeLinkId) {
        this.travelTripTypeLinkId = travelTripTypeLinkId;
    }

    public Integer getTravelTripTypeLinkId() {
        return travelTripTypeLinkId;
    }

    public void setTravelTripTypeLinkId(Integer travelTripTypeLinkId) {
        this.travelTripTypeLinkId = travelTripTypeLinkId;
    }

    public String getTravelTripTypeName() {
        return travelTripTypeName;
    }

    public void setTravelTripTypeName(String travelTripTypeName) {
        this.travelTripTypeName = travelTripTypeName;
    }

    public String getTravleTripTypeNameArabic() {
        return travleTripTypeNameArabic;
    }

    public void setTravleTripTypeNameArabic(String travleTripTypeNameArabic) {
        this.travleTripTypeNameArabic = travleTripTypeNameArabic;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getModifiedById() {
        return modifiedById;
    }

    public void setModifiedById(Integer modifiedById) {
        this.modifiedById = modifiedById;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (travelTripTypeLinkId != null ? travelTripTypeLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMTravelTripType)) {
            return false;
        }
        TMTravelTripType other = (TMTravelTripType) object;
        if ((this.travelTripTypeLinkId == null && other.travelTripTypeLinkId != null) || (this.travelTripTypeLinkId != null && !this.travelTripTypeLinkId.equals(other.travelTripTypeLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMTravelTripType[ travelTripTypeLinkId=" + travelTripTypeLinkId + " ]";
    }
    
}
