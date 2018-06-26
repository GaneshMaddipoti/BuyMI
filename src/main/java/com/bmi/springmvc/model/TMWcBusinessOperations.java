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
@Table(name = "t_m_wc_ business_operations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMWcBusinessOperations.findAll", query = "SELECT t FROM TMWcBusinessOperations t")
    , @NamedQuery(name = "TMWcBusinessOperations.findByBusinessOperationsLinkId", query = "SELECT t FROM TMWcBusinessOperations t WHERE t.businessOperationsLinkId = :businessOperationsLinkId")
    , @NamedQuery(name = "TMWcBusinessOperations.findByBusinessOperation", query = "SELECT t FROM TMWcBusinessOperations t WHERE t.businessOperation = :businessOperation")
    , @NamedQuery(name = "TMWcBusinessOperations.findByCategoryId", query = "SELECT t FROM TMWcBusinessOperations t WHERE t.categoryId = :categoryId")
    , @NamedQuery(name = "TMWcBusinessOperations.findByDescription", query = "SELECT t FROM TMWcBusinessOperations t WHERE t.description = :description")
    , @NamedQuery(name = "TMWcBusinessOperations.findByActive", query = "SELECT t FROM TMWcBusinessOperations t WHERE t.active = :active")
    , @NamedQuery(name = "TMWcBusinessOperations.findByFromToDate", query = "SELECT t FROM TMWcBusinessOperations t WHERE t.fromToDate = :fromToDate")
    , @NamedQuery(name = "TMWcBusinessOperations.findByCreatedModified", query = "SELECT t FROM TMWcBusinessOperations t WHERE t.createdModified = :createdModified")
    , @NamedQuery(name = "TMWcBusinessOperations.findByCreatedDate", query = "SELECT t FROM TMWcBusinessOperations t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMWcBusinessOperations.findByModifiedDate", query = "SELECT t FROM TMWcBusinessOperations t WHERE t.modifiedDate = :modifiedDate")})
public class TMWcBusinessOperations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = " business_operations_link_id")
    private Integer businessOperationsLinkId;
    @Size(max = 50)
    @Column(name = "business_operation")
    private String businessOperation;
    @Size(max = 20)
    @Column(name = "category_id")
    private String categoryId;
    @Size(max = 50)
    @Column(name = "description")
    private String description;
    @Column(name = "active")
    private Integer active;
    @Column(name = "from_to_date")
    @Temporal(TemporalType.DATE)
    private Date fromToDate;
    @Column(name = "created_modified")
    private Integer createdModified;
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

    public TMWcBusinessOperations() {
    }

    public TMWcBusinessOperations(Integer businessOperationsLinkId) {
        this.businessOperationsLinkId = businessOperationsLinkId;
    }

    public Integer getBusinessOperationsLinkId() {
        return businessOperationsLinkId;
    }

    public void setBusinessOperationsLinkId(Integer businessOperationsLinkId) {
        this.businessOperationsLinkId = businessOperationsLinkId;
    }

    public String getBusinessOperation() {
        return businessOperation;
    }

    public void setBusinessOperation(String businessOperation) {
        this.businessOperation = businessOperation;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Date getFromToDate() {
        return fromToDate;
    }

    public void setFromToDate(Date fromToDate) {
        this.fromToDate = fromToDate;
    }

    public Integer getCreatedModified() {
        return createdModified;
    }

    public void setCreatedModified(Integer createdModified) {
        this.createdModified = createdModified;
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
        hash += (businessOperationsLinkId != null ? businessOperationsLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMWcBusinessOperations)) {
            return false;
        }
        TMWcBusinessOperations other = (TMWcBusinessOperations) object;
        if ((this.businessOperationsLinkId == null && other.businessOperationsLinkId != null) || (this.businessOperationsLinkId != null && !this.businessOperationsLinkId.equals(other.businessOperationsLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMWcBusinessOperations[ businessOperationsLinkId=" + businessOperationsLinkId + " ]";
    }
    
}
