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
@Table(name = "t_m_policy_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMPolicyType.findAll", query = "SELECT t FROM TMPolicyType t")
    , @NamedQuery(name = "TMPolicyType.findByPolicyTypeLinkId", query = "SELECT t FROM TMPolicyType t WHERE t.policyTypeLinkId = :policyTypeLinkId")
    , @NamedQuery(name = "TMPolicyType.findByPolicyTypeName", query = "SELECT t FROM TMPolicyType t WHERE t.policyTypeName = :policyTypeName")
    , @NamedQuery(name = "TMPolicyType.findByPolicyTypeNameArabic", query = "SELECT t FROM TMPolicyType t WHERE t.policyTypeNameArabic = :policyTypeNameArabic")
    , @NamedQuery(name = "TMPolicyType.findByCreatedDate", query = "SELECT t FROM TMPolicyType t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMPolicyType.findByModifiedDate", query = "SELECT t FROM TMPolicyType t WHERE t.modifiedDate = :modifiedDate")})
public class TMPolicyType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "policy_type_link_id")
    private Integer policyTypeLinkId;
    @Size(max = 30)
    @Column(name = "policy_type_name")
    private String policyTypeName;
    @Size(max = 70)
    @Column(name = "policy_type_name_arabic")
    private String policyTypeNameArabic;
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
    @JoinColumn(name = "lob_link_id", referencedColumnName = "lob_link_id")
    @ManyToOne
    private TMLineOfBusiness lobLinkId;

    public TMPolicyType() {
    }

    public TMPolicyType(Integer policyTypeLinkId) {
        this.policyTypeLinkId = policyTypeLinkId;
    }

    public Integer getPolicyTypeLinkId() {
        return policyTypeLinkId;
    }

    public void setPolicyTypeLinkId(Integer policyTypeLinkId) {
        this.policyTypeLinkId = policyTypeLinkId;
    }

    public String getPolicyTypeName() {
        return policyTypeName;
    }

    public void setPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
    }

    public String getPolicyTypeNameArabic() {
        return policyTypeNameArabic;
    }

    public void setPolicyTypeNameArabic(String policyTypeNameArabic) {
        this.policyTypeNameArabic = policyTypeNameArabic;
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

    public TMLineOfBusiness getLobLinkId() {
        return lobLinkId;
    }

    public void setLobLinkId(TMLineOfBusiness lobLinkId) {
        this.lobLinkId = lobLinkId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (policyTypeLinkId != null ? policyTypeLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMPolicyType)) {
            return false;
        }
        TMPolicyType other = (TMPolicyType) object;
        if ((this.policyTypeLinkId == null && other.policyTypeLinkId != null) || (this.policyTypeLinkId != null && !this.policyTypeLinkId.equals(other.policyTypeLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMPolicyType[ policyTypeLinkId=" + policyTypeLinkId + " ]";
    }
    
}
