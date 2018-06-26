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
@Table(name = "t_m_body_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMBodyType.findAll", query = "SELECT t FROM TMBodyType t")
    , @NamedQuery(name = "TMBodyType.findByBodyTypeLinkId", query = "SELECT t FROM TMBodyType t WHERE t.bodyTypeLinkId = :bodyTypeLinkId")
    , @NamedQuery(name = "TMBodyType.findByBodyTypeName", query = "SELECT t FROM TMBodyType t WHERE t.bodyTypeName = :bodyTypeName")
    , @NamedQuery(name = "TMBodyType.findByBodyTypeNameAr", query = "SELECT t FROM TMBodyType t WHERE t.bodyTypeNameAr = :bodyTypeNameAr")
    , @NamedQuery(name = "TMBodyType.findByUsedForComprehensive", query = "SELECT t FROM TMBodyType t WHERE t.usedForComprehensive = :usedForComprehensive")
    , @NamedQuery(name = "TMBodyType.findByUserForTpl", query = "SELECT t FROM TMBodyType t WHERE t.userForTpl = :userForTpl")
    , @NamedQuery(name = "TMBodyType.findByCreatedDate", query = "SELECT t FROM TMBodyType t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMBodyType.findByModifiedDate", query = "SELECT t FROM TMBodyType t WHERE t.modifiedDate = :modifiedDate")})
public class TMBodyType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "body_type_link_id")
    private Integer bodyTypeLinkId;
    @Size(max = 30)
    @Column(name = "body_type_name")
    private String bodyTypeName;
    @Size(max = 60)
    @Column(name = "body_type_name_ar")
    private String bodyTypeNameAr;
    @Column(name = "used_for_comprehensive")
    private Integer usedForComprehensive;
    @Column(name = "user_for_tpl")
    private Integer userForTpl;
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

    public TMBodyType() {
    }

    public TMBodyType(Integer bodyTypeLinkId) {
        this.bodyTypeLinkId = bodyTypeLinkId;
    }

    public Integer getBodyTypeLinkId() {
        return bodyTypeLinkId;
    }

    public void setBodyTypeLinkId(Integer bodyTypeLinkId) {
        this.bodyTypeLinkId = bodyTypeLinkId;
    }

    public String getBodyTypeName() {
        return bodyTypeName;
    }

    public void setBodyTypeName(String bodyTypeName) {
        this.bodyTypeName = bodyTypeName;
    }

    public String getBodyTypeNameAr() {
        return bodyTypeNameAr;
    }

    public void setBodyTypeNameAr(String bodyTypeNameAr) {
        this.bodyTypeNameAr = bodyTypeNameAr;
    }

    public Integer getUsedForComprehensive() {
        return usedForComprehensive;
    }

    public void setUsedForComprehensive(Integer usedForComprehensive) {
        this.usedForComprehensive = usedForComprehensive;
    }

    public Integer getUserForTpl() {
        return userForTpl;
    }

    public void setUserForTpl(Integer userForTpl) {
        this.userForTpl = userForTpl;
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
        hash += (bodyTypeLinkId != null ? bodyTypeLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMBodyType)) {
            return false;
        }
        TMBodyType other = (TMBodyType) object;
        if ((this.bodyTypeLinkId == null && other.bodyTypeLinkId != null) || (this.bodyTypeLinkId != null && !this.bodyTypeLinkId.equals(other.bodyTypeLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMBodyType[ bodyTypeLinkId=" + bodyTypeLinkId + " ]";
    }
    
}
