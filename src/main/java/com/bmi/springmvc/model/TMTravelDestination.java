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
@Table(name = "t_m_travel_destination")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMTravelDestination.findAll", query = "SELECT t FROM TMTravelDestination t")
    , @NamedQuery(name = "TMTravelDestination.findByTravelDestLinkId", query = "SELECT t FROM TMTravelDestination t WHERE t.travelDestLinkId = :travelDestLinkId")
    , @NamedQuery(name = "TMTravelDestination.findByTravelDestName", query = "SELECT t FROM TMTravelDestination t WHERE t.travelDestName = :travelDestName")
    , @NamedQuery(name = "TMTravelDestination.findByTravelDestNameArabic", query = "SELECT t FROM TMTravelDestination t WHERE t.travelDestNameArabic = :travelDestNameArabic")
    , @NamedQuery(name = "TMTravelDestination.findByCreatedDate", query = "SELECT t FROM TMTravelDestination t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMTravelDestination.findByCreatedById", query = "SELECT t FROM TMTravelDestination t WHERE t.createdById = :createdById")
    , @NamedQuery(name = "TMTravelDestination.findByModifiedDate", query = "SELECT t FROM TMTravelDestination t WHERE t.modifiedDate = :modifiedDate")
    , @NamedQuery(name = "TMTravelDestination.findByModifiedById", query = "SELECT t FROM TMTravelDestination t WHERE t.modifiedById = :modifiedById")})
public class TMTravelDestination implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "travel_dest_link_id")
    private Integer travelDestLinkId;
    @Size(max = 100)
    @Column(name = "travel_dest_name")
    private String travelDestName;
    @Size(max = 100)
    @Column(name = "travel_dest_name_arabic")
    private String travelDestNameArabic;
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

    public TMTravelDestination() {
    }

    public TMTravelDestination(Integer travelDestLinkId) {
        this.travelDestLinkId = travelDestLinkId;
    }

    public Integer getTravelDestLinkId() {
        return travelDestLinkId;
    }

    public void setTravelDestLinkId(Integer travelDestLinkId) {
        this.travelDestLinkId = travelDestLinkId;
    }

    public String getTravelDestName() {
        return travelDestName;
    }

    public void setTravelDestName(String travelDestName) {
        this.travelDestName = travelDestName;
    }

    public String getTravelDestNameArabic() {
        return travelDestNameArabic;
    }

    public void setTravelDestNameArabic(String travelDestNameArabic) {
        this.travelDestNameArabic = travelDestNameArabic;
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
        hash += (travelDestLinkId != null ? travelDestLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMTravelDestination)) {
            return false;
        }
        TMTravelDestination other = (TMTravelDestination) object;
        if ((this.travelDestLinkId == null && other.travelDestLinkId != null) || (this.travelDestLinkId != null && !this.travelDestLinkId.equals(other.travelDestLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMTravelDestination[ travelDestLinkId=" + travelDestLinkId + " ]";
    }
    
}
