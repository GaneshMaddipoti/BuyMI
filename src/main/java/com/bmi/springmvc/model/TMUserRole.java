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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ganesmad
 */
@Entity
@Table(name = "t_m_user_role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMUserRole.findAll", query = "SELECT t FROM TMUserRole t")
    , @NamedQuery(name = "TMUserRole.findByUserRoleLinkId", query = "SELECT t FROM TMUserRole t WHERE t.userRoleLinkId = :userRoleLinkId")
    , @NamedQuery(name = "TMUserRole.findByRoleCode", query = "SELECT t FROM TMUserRole t WHERE t.roleCode = :roleCode")
    , @NamedQuery(name = "TMUserRole.findByPartnerId", query = "SELECT t FROM TMUserRole t WHERE t.partnerId = :partnerId")
    , @NamedQuery(name = "TMUserRole.findByName", query = "SELECT t FROM TMUserRole t WHERE t.name = :name")
    , @NamedQuery(name = "TMUserRole.findByDescription", query = "SELECT t FROM TMUserRole t WHERE t.description = :description")
    , @NamedQuery(name = "TMUserRole.findByActive", query = "SELECT t FROM TMUserRole t WHERE t.active = :active")
    , @NamedQuery(name = "TMUserRole.findByCreatedDate", query = "SELECT t FROM TMUserRole t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMUserRole.findByCreatedById", query = "SELECT t FROM TMUserRole t WHERE t.createdById = :createdById")
    , @NamedQuery(name = "TMUserRole.findByModifiedDate", query = "SELECT t FROM TMUserRole t WHERE t.modifiedDate = :modifiedDate")
    , @NamedQuery(name = "TMUserRole.findByModifiedById", query = "SELECT t FROM TMUserRole t WHERE t.modifiedById = :modifiedById")})
public class TMUserRole implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_role_link_id")
    private Integer userRoleLinkId;
    @Size(max = 30)
    @Column(name = "role_code")
    private String roleCode;
    @Size(max = 40)
    @Column(name = "partner_id")
    private String partnerId;
    @Size(max = 30)
    @Column(name = "name")
    private String name;
    @Size(max = 40)
    @Column(name = "description")
    private String description;
    @Size(max = 40)
    @Column(name = "active")
    private String active;
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
    @OneToMany(mappedBy = "userroleLinkId")
    private Collection<TMAdmin> tMAdminCollection;

    public TMUserRole() {
    }

    public TMUserRole(Integer userRoleLinkId) {
        this.userRoleLinkId = userRoleLinkId;
    }

    public Integer getUserRoleLinkId() {
        return userRoleLinkId;
    }

    public void setUserRoleLinkId(Integer userRoleLinkId) {
        this.userRoleLinkId = userRoleLinkId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
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

    @XmlTransient
    public Collection<TMAdmin> getTMAdminCollection() {
        return tMAdminCollection;
    }

    public void setTMAdminCollection(Collection<TMAdmin> tMAdminCollection) {
        this.tMAdminCollection = tMAdminCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userRoleLinkId != null ? userRoleLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMUserRole)) {
            return false;
        }
        TMUserRole other = (TMUserRole) object;
        if ((this.userRoleLinkId == null && other.userRoleLinkId != null) || (this.userRoleLinkId != null && !this.userRoleLinkId.equals(other.userRoleLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMUserRole[ userRoleLinkId=" + userRoleLinkId + " ]";
    }
    
}
