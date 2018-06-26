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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ganesmad
 */
@Entity
@Table(name = "t_m_line_of_business")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMLineOfBusiness.findAll", query = "SELECT t FROM TMLineOfBusiness t")
    , @NamedQuery(name = "TMLineOfBusiness.findByLobLinkId", query = "SELECT t FROM TMLineOfBusiness t WHERE t.lobLinkId = :lobLinkId")
    , @NamedQuery(name = "TMLineOfBusiness.findByLobCode", query = "SELECT t FROM TMLineOfBusiness t WHERE t.lobCode = :lobCode")
    , @NamedQuery(name = "TMLineOfBusiness.findByLobName", query = "SELECT t FROM TMLineOfBusiness t WHERE t.lobName = :lobName")
    , @NamedQuery(name = "TMLineOfBusiness.findByCreatedDate", query = "SELECT t FROM TMLineOfBusiness t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMLineOfBusiness.findByModifiedDate", query = "SELECT t FROM TMLineOfBusiness t WHERE t.modifiedDate = :modifiedDate")})
public class TMLineOfBusiness implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "lob_link_id")
    private Integer lobLinkId;
    @Size(max = 30)
    @Column(name = "lob_code")
    private String lobCode;
    @Size(max = 40)
    @Column(name = "lob_name")
    private String lobName;
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
    @OneToMany(mappedBy = "lobLinkId")
    private Collection<TMPolicyType> tMPolicyTypeCollection;

    public TMLineOfBusiness() {
    }

    public TMLineOfBusiness(Integer lobLinkId) {
        this.lobLinkId = lobLinkId;
    }

    public Integer getLobLinkId() {
        return lobLinkId;
    }

    public void setLobLinkId(Integer lobLinkId) {
        this.lobLinkId = lobLinkId;
    }

    public String getLobCode() {
        return lobCode;
    }

    public void setLobCode(String lobCode) {
        this.lobCode = lobCode;
    }

    public String getLobName() {
        return lobName;
    }

    public void setLobName(String lobName) {
        this.lobName = lobName;
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

    @XmlTransient
    public Collection<TMPolicyType> getTMPolicyTypeCollection() {
        return tMPolicyTypeCollection;
    }

    public void setTMPolicyTypeCollection(Collection<TMPolicyType> tMPolicyTypeCollection) {
        this.tMPolicyTypeCollection = tMPolicyTypeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lobLinkId != null ? lobLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMLineOfBusiness)) {
            return false;
        }
        TMLineOfBusiness other = (TMLineOfBusiness) object;
        if ((this.lobLinkId == null && other.lobLinkId != null) || (this.lobLinkId != null && !this.lobLinkId.equals(other.lobLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMLineOfBusiness[ lobLinkId=" + lobLinkId + " ]";
    }
    
}
