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
@Table(name = "t_m_wc_ business_category")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMWcBusinessCategory.findAll", query = "SELECT t FROM TMWcBusinessCategory t")
    , @NamedQuery(name = "TMWcBusinessCategory.findByBusinessCategoryLinkId", query = "SELECT t FROM TMWcBusinessCategory t WHERE t.businessCategoryLinkId = :businessCategoryLinkId")
    , @NamedQuery(name = "TMWcBusinessCategory.findByCategoryName", query = "SELECT t FROM TMWcBusinessCategory t WHERE t.categoryName = :categoryName")
    , @NamedQuery(name = "TMWcBusinessCategory.findByCategoryNameArabic", query = "SELECT t FROM TMWcBusinessCategory t WHERE t.categoryNameArabic = :categoryNameArabic")
    , @NamedQuery(name = "TMWcBusinessCategory.findByActive", query = "SELECT t FROM TMWcBusinessCategory t WHERE t.active = :active")
    , @NamedQuery(name = "TMWcBusinessCategory.findByCreatedDate", query = "SELECT t FROM TMWcBusinessCategory t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMWcBusinessCategory.findByModifiedDate", query = "SELECT t FROM TMWcBusinessCategory t WHERE t.modifiedDate = :modifiedDate")})
public class TMWcBusinessCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "business_category_link_id")
    private Integer businessCategoryLinkId;
    @Size(max = 50)
    @Column(name = "category_name")
    private String categoryName;
    @Size(max = 70)
    @Column(name = "category_name_arabic")
    private String categoryNameArabic;
    @Column(name = "active")
    private Integer active;
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

    public TMWcBusinessCategory() {
    }

    public TMWcBusinessCategory(Integer businessCategoryLinkId) {
        this.businessCategoryLinkId = businessCategoryLinkId;
    }

    public Integer getBusinessCategoryLinkId() {
        return businessCategoryLinkId;
    }

    public void setBusinessCategoryLinkId(Integer businessCategoryLinkId) {
        this.businessCategoryLinkId = businessCategoryLinkId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryNameArabic() {
        return categoryNameArabic;
    }

    public void setCategoryNameArabic(String categoryNameArabic) {
        this.categoryNameArabic = categoryNameArabic;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
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
        hash += (businessCategoryLinkId != null ? businessCategoryLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMWcBusinessCategory)) {
            return false;
        }
        TMWcBusinessCategory other = (TMWcBusinessCategory) object;
        if ((this.businessCategoryLinkId == null && other.businessCategoryLinkId != null) || (this.businessCategoryLinkId != null && !this.businessCategoryLinkId.equals(other.businessCategoryLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMWcBusinessCategory[ businessCategoryLinkId=" + businessCategoryLinkId + " ]";
    }
    
}
