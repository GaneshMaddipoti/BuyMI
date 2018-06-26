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
@Table(name = "t_m_wc_job_category")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMWcJobCategory.findAll", query = "SELECT t FROM TMWcJobCategory t")
    , @NamedQuery(name = "TMWcJobCategory.findByJobCategoryLinkId", query = "SELECT t FROM TMWcJobCategory t WHERE t.jobCategoryLinkId = :jobCategoryLinkId")
    , @NamedQuery(name = "TMWcJobCategory.findByCategoryCode", query = "SELECT t FROM TMWcJobCategory t WHERE t.categoryCode = :categoryCode")
    , @NamedQuery(name = "TMWcJobCategory.findByCategoryName", query = "SELECT t FROM TMWcJobCategory t WHERE t.categoryName = :categoryName")
    , @NamedQuery(name = "TMWcJobCategory.findByDescription", query = "SELECT t FROM TMWcJobCategory t WHERE t.description = :description")
    , @NamedQuery(name = "TMWcJobCategory.findByActive", query = "SELECT t FROM TMWcJobCategory t WHERE t.active = :active")
    , @NamedQuery(name = "TMWcJobCategory.findByFromToDate", query = "SELECT t FROM TMWcJobCategory t WHERE t.fromToDate = :fromToDate")
    , @NamedQuery(name = "TMWcJobCategory.findByCreatedModified", query = "SELECT t FROM TMWcJobCategory t WHERE t.createdModified = :createdModified")
    , @NamedQuery(name = "TMWcJobCategory.findByCreatedDate", query = "SELECT t FROM TMWcJobCategory t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMWcJobCategory.findByModifiedDate", query = "SELECT t FROM TMWcJobCategory t WHERE t.modifiedDate = :modifiedDate")})
public class TMWcJobCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "job_category_link_id")
    private Integer jobCategoryLinkId;
    @Size(max = 20)
    @Column(name = "category_code")
    private String categoryCode;
    @Size(max = 40)
    @Column(name = "category_name")
    private String categoryName;
    @Size(max = 40)
    @Column(name = "description")
    private String description;
    @Column(name = "active")
    private Integer active;
    @Column(name = "from_to date")
    @Temporal(TemporalType.DATE)
    private Date fromToDate;
    @Size(max = 40)
    @Column(name = "created_modified")
    private String createdModified;
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
    @OneToMany(mappedBy = "wcJobCategoryLinkId")
    private Collection<TTWcInsuredDetails> tTWcInsuredDetailsCollection;

    public TMWcJobCategory() {
    }

    public TMWcJobCategory(Integer jobCategoryLinkId) {
        this.jobCategoryLinkId = jobCategoryLinkId;
    }

    public Integer getJobCategoryLinkId() {
        return jobCategoryLinkId;
    }

    public void setJobCategoryLinkId(Integer jobCategoryLinkId) {
        this.jobCategoryLinkId = jobCategoryLinkId;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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

    public String getCreatedModified() {
        return createdModified;
    }

    public void setCreatedModified(String createdModified) {
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

    @XmlTransient
    public Collection<TTWcInsuredDetails> getTTWcInsuredDetailsCollection() {
        return tTWcInsuredDetailsCollection;
    }

    public void setTTWcInsuredDetailsCollection(Collection<TTWcInsuredDetails> tTWcInsuredDetailsCollection) {
        this.tTWcInsuredDetailsCollection = tTWcInsuredDetailsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobCategoryLinkId != null ? jobCategoryLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMWcJobCategory)) {
            return false;
        }
        TMWcJobCategory other = (TMWcJobCategory) object;
        if ((this.jobCategoryLinkId == null && other.jobCategoryLinkId != null) || (this.jobCategoryLinkId != null && !this.jobCategoryLinkId.equals(other.jobCategoryLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMWcJobCategory[ jobCategoryLinkId=" + jobCategoryLinkId + " ]";
    }
    
}
