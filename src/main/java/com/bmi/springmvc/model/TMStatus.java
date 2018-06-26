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
@Table(name = "t_m_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMStatus.findAll", query = "SELECT t FROM TMStatus t")
    , @NamedQuery(name = "TMStatus.findByStatusLinkTypeId", query = "SELECT t FROM TMStatus t WHERE t.statusLinkTypeId = :statusLinkTypeId")
    , @NamedQuery(name = "TMStatus.findByStatusCode", query = "SELECT t FROM TMStatus t WHERE t.statusCode = :statusCode")
    , @NamedQuery(name = "TMStatus.findByStatusDescription", query = "SELECT t FROM TMStatus t WHERE t.statusDescription = :statusDescription")
    , @NamedQuery(name = "TMStatus.findByCreatedDate", query = "SELECT t FROM TMStatus t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMStatus.findByModifiedDate", query = "SELECT t FROM TMStatus t WHERE t.modifiedDate = :modifiedDate")})
public class TMStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "status_link_type_id")
    private Integer statusLinkTypeId;
    @Size(max = 10)
    @Column(name = "status_code")
    private String statusCode;
    @Size(max = 30)
    @Column(name = "status_description")
    private String statusDescription;
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

    public TMStatus() {
    }

    public TMStatus(Integer statusLinkTypeId) {
        this.statusLinkTypeId = statusLinkTypeId;
    }

    public Integer getStatusLinkTypeId() {
        return statusLinkTypeId;
    }

    public void setStatusLinkTypeId(Integer statusLinkTypeId) {
        this.statusLinkTypeId = statusLinkTypeId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
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
        hash += (statusLinkTypeId != null ? statusLinkTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMStatus)) {
            return false;
        }
        TMStatus other = (TMStatus) object;
        if ((this.statusLinkTypeId == null && other.statusLinkTypeId != null) || (this.statusLinkTypeId != null && !this.statusLinkTypeId.equals(other.statusLinkTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMStatus[ statusLinkTypeId=" + statusLinkTypeId + " ]";
    }
    
}
