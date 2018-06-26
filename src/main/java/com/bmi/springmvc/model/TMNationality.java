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
@Table(name = "t_m_nationality")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMNationality.findAll", query = "SELECT t FROM TMNationality t")
    , @NamedQuery(name = "TMNationality.findByNationalityLinkId", query = "SELECT t FROM TMNationality t WHERE t.nationalityLinkId = :nationalityLinkId")
    , @NamedQuery(name = "TMNationality.findByNation", query = "SELECT t FROM TMNationality t WHERE t.nation = :nation")
    , @NamedQuery(name = "TMNationality.findByNationAr", query = "SELECT t FROM TMNationality t WHERE t.nationAr = :nationAr")
    , @NamedQuery(name = "TMNationality.findByTransferableLicence", query = "SELECT t FROM TMNationality t WHERE t.transferableLicence = :transferableLicence")
    , @NamedQuery(name = "TMNationality.findByCreatedDate", query = "SELECT t FROM TMNationality t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMNationality.findByModifiedDate", query = "SELECT t FROM TMNationality t WHERE t.modifiedDate = :modifiedDate")})
public class TMNationality implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "nationality_link_id")
    private Integer nationalityLinkId;
    @Size(max = 50)
    @Column(name = "nation")
    private String nation;
    @Size(max = 100)
    @Column(name = "nation_ar")
    private String nationAr;
    @Column(name = "transferable_licence")
    private Integer transferableLicence;
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

    public TMNationality() {
    }

    public TMNationality(Integer nationalityLinkId) {
        this.nationalityLinkId = nationalityLinkId;
    }

    public Integer getNationalityLinkId() {
        return nationalityLinkId;
    }

    public void setNationalityLinkId(Integer nationalityLinkId) {
        this.nationalityLinkId = nationalityLinkId;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNationAr() {
        return nationAr;
    }

    public void setNationAr(String nationAr) {
        this.nationAr = nationAr;
    }

    public Integer getTransferableLicence() {
        return transferableLicence;
    }

    public void setTransferableLicence(Integer transferableLicence) {
        this.transferableLicence = transferableLicence;
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
        hash += (nationalityLinkId != null ? nationalityLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMNationality)) {
            return false;
        }
        TMNationality other = (TMNationality) object;
        if ((this.nationalityLinkId == null && other.nationalityLinkId != null) || (this.nationalityLinkId != null && !this.nationalityLinkId.equals(other.nationalityLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMNationality[ nationalityLinkId=" + nationalityLinkId + " ]";
    }
    
}
