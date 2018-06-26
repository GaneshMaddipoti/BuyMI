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
@Table(name = "t_m_ncd")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMNcd.findAll", query = "SELECT t FROM TMNcd t")
    , @NamedQuery(name = "TMNcd.findByNcdLinkId", query = "SELECT t FROM TMNcd t WHERE t.ncdLinkId = :ncdLinkId")
    , @NamedQuery(name = "TMNcd.findByNcdCode", query = "SELECT t FROM TMNcd t WHERE t.ncdCode = :ncdCode")
    , @NamedQuery(name = "TMNcd.findByNcdDescription", query = "SELECT t FROM TMNcd t WHERE t.ncdDescription = :ncdDescription")
    , @NamedQuery(name = "TMNcd.findByNcdDesAr", query = "SELECT t FROM TMNcd t WHERE t.ncdDesAr = :ncdDesAr")
    , @NamedQuery(name = "TMNcd.findByCreatedDate", query = "SELECT t FROM TMNcd t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMNcd.findByModifiedDate", query = "SELECT t FROM TMNcd t WHERE t.modifiedDate = :modifiedDate")})
public class TMNcd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ncd_link_id")
    private Integer ncdLinkId;
    @Column(name = "ncd_code")
    private Integer ncdCode;
    @Size(max = 100)
    @Column(name = "ncd_description")
    private String ncdDescription;
    @Size(max = 200)
    @Column(name = "ncd_des_ar")
    private String ncdDesAr;
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

    public TMNcd() {
    }

    public TMNcd(Integer ncdLinkId) {
        this.ncdLinkId = ncdLinkId;
    }

    public Integer getNcdLinkId() {
        return ncdLinkId;
    }

    public void setNcdLinkId(Integer ncdLinkId) {
        this.ncdLinkId = ncdLinkId;
    }

    public Integer getNcdCode() {
        return ncdCode;
    }

    public void setNcdCode(Integer ncdCode) {
        this.ncdCode = ncdCode;
    }

    public String getNcdDescription() {
        return ncdDescription;
    }

    public void setNcdDescription(String ncdDescription) {
        this.ncdDescription = ncdDescription;
    }

    public String getNcdDesAr() {
        return ncdDesAr;
    }

    public void setNcdDesAr(String ncdDesAr) {
        this.ncdDesAr = ncdDesAr;
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
        hash += (ncdLinkId != null ? ncdLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMNcd)) {
            return false;
        }
        TMNcd other = (TMNcd) object;
        if ((this.ncdLinkId == null && other.ncdLinkId != null) || (this.ncdLinkId != null && !this.ncdLinkId.equals(other.ncdLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMNcd[ ncdLinkId=" + ncdLinkId + " ]";
    }
    
}
