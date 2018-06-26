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
@Table(name = "t_m_emirates")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMEmirates.findAll", query = "SELECT t FROM TMEmirates t")
    , @NamedQuery(name = "TMEmirates.findByEmirateLinkId", query = "SELECT t FROM TMEmirates t WHERE t.emirateLinkId = :emirateLinkId")
    , @NamedQuery(name = "TMEmirates.findByEmirateCode", query = "SELECT t FROM TMEmirates t WHERE t.emirateCode = :emirateCode")
    , @NamedQuery(name = "TMEmirates.findByEmirateName", query = "SELECT t FROM TMEmirates t WHERE t.emirateName = :emirateName")
    , @NamedQuery(name = "TMEmirates.findByEmirateArabic", query = "SELECT t FROM TMEmirates t WHERE t.emirateArabic = :emirateArabic")
    , @NamedQuery(name = "TMEmirates.findByCreatedDate", query = "SELECT t FROM TMEmirates t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMEmirates.findByModifiedDate", query = "SELECT t FROM TMEmirates t WHERE t.modifiedDate = :modifiedDate")})
public class TMEmirates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "emirate_link_id")
    private Integer emirateLinkId;
    @Size(max = 20)
    @Column(name = "emirate_code")
    private String emirateCode;
    @Size(max = 50)
    @Column(name = "emirate_name")
    private String emirateName;
    @Size(max = 200)
    @Column(name = "emirate_arabic")
    private String emirateArabic;
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

    public TMEmirates() {
    }

    public TMEmirates(Integer emirateLinkId) {
        this.emirateLinkId = emirateLinkId;
    }

    public Integer getEmirateLinkId() {
        return emirateLinkId;
    }

    public void setEmirateLinkId(Integer emirateLinkId) {
        this.emirateLinkId = emirateLinkId;
    }

    public String getEmirateCode() {
        return emirateCode;
    }

    public void setEmirateCode(String emirateCode) {
        this.emirateCode = emirateCode;
    }

    public String getEmirateName() {
        return emirateName;
    }

    public void setEmirateName(String emirateName) {
        this.emirateName = emirateName;
    }

    public String getEmirateArabic() {
        return emirateArabic;
    }

    public void setEmirateArabic(String emirateArabic) {
        this.emirateArabic = emirateArabic;
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
        hash += (emirateLinkId != null ? emirateLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMEmirates)) {
            return false;
        }
        TMEmirates other = (TMEmirates) object;
        if ((this.emirateLinkId == null && other.emirateLinkId != null) || (this.emirateLinkId != null && !this.emirateLinkId.equals(other.emirateLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMEmirates[ emirateLinkId=" + emirateLinkId + " ]";
    }
    
}
