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
@Table(name = "t_m_partners")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMPartners.findAll", query = "SELECT t FROM TMPartners t")
    , @NamedQuery(name = "TMPartners.findByPartnersLinkId", query = "SELECT t FROM TMPartners t WHERE t.partnersLinkId = :partnersLinkId")
    , @NamedQuery(name = "TMPartners.findByPartnerName", query = "SELECT t FROM TMPartners t WHERE t.partnerName = :partnerName")
    , @NamedQuery(name = "TMPartners.findByPartnerType", query = "SELECT t FROM TMPartners t WHERE t.partnerType = :partnerType")
    , @NamedQuery(name = "TMPartners.findByPatnerCode", query = "SELECT t FROM TMPartners t WHERE t.patnerCode = :patnerCode")
    , @NamedQuery(name = "TMPartners.findByCompanyLogo", query = "SELECT t FROM TMPartners t WHERE t.companyLogo = :companyLogo")
    , @NamedQuery(name = "TMPartners.findByPatnerStatus", query = "SELECT t FROM TMPartners t WHERE t.patnerStatus = :patnerStatus")
    , @NamedQuery(name = "TMPartners.findByCreatedDate", query = "SELECT t FROM TMPartners t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMPartners.findByModifiedDate", query = "SELECT t FROM TMPartners t WHERE t.modifiedDate = :modifiedDate")
    , @NamedQuery(name = "TMPartners.findByContactPersonName", query = "SELECT t FROM TMPartners t WHERE t.contactPersonName = :contactPersonName")
    , @NamedQuery(name = "TMPartners.findByContactPersonEmailId", query = "SELECT t FROM TMPartners t WHERE t.contactPersonEmailId = :contactPersonEmailId")
    , @NamedQuery(name = "TMPartners.findByContactPersonMobileNo", query = "SELECT t FROM TMPartners t WHERE t.contactPersonMobileNo = :contactPersonMobileNo")
    , @NamedQuery(name = "TMPartners.findByPartnerDbString", query = "SELECT t FROM TMPartners t WHERE t.partnerDbString = :partnerDbString")})
public class TMPartners implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "partners_link_id")
    private Integer partnersLinkId;
    @Size(max = 100)
    @Column(name = "partner_name")
    private String partnerName;
    @Size(max = 20)
    @Column(name = "partner_type")
    private String partnerType;
    @Size(max = 10)
    @Column(name = "patner_code")
    private String patnerCode;
    @Size(max = 10)
    @Column(name = "company_logo")
    private String companyLogo;
    @Size(max = 10)
    @Column(name = "patner_status")
    private String patnerStatus;
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(name = "modified_date")
    @Temporal(TemporalType.DATE)
    private Date modifiedDate;
    @Size(max = 50)
    @Column(name = "contact_person_name")
    private String contactPersonName;
    @Size(max = 100)
    @Column(name = "contact_person_email_id")
    private String contactPersonEmailId;
    @Size(max = 25)
    @Column(name = "contact_person_mobile_no")
    private String contactPersonMobileNo;
    @Size(max = 150)
    @Column(name = "partner_db_string")
    private String partnerDbString;
    @OneToMany(mappedBy = "partnerLinkId")
    private Collection<TMAdmin> tMAdminCollection;
    @JoinColumn(name = "created_by_id", referencedColumnName = "admin_link_id")
    @ManyToOne
    private TMAdmin createdById;
    @JoinColumn(name = "modified_by_id", referencedColumnName = "admin_link_id")
    @ManyToOne
    private TMAdmin modifiedById;

    public TMPartners() {
    }

    public TMPartners(Integer partnersLinkId) {
        this.partnersLinkId = partnersLinkId;
    }

    public Integer getPartnersLinkId() {
        return partnersLinkId;
    }

    public void setPartnersLinkId(Integer partnersLinkId) {
        this.partnersLinkId = partnersLinkId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType;
    }

    public String getPatnerCode() {
        return patnerCode;
    }

    public void setPatnerCode(String patnerCode) {
        this.patnerCode = patnerCode;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public String getPatnerStatus() {
        return patnerStatus;
    }

    public void setPatnerStatus(String patnerStatus) {
        this.patnerStatus = patnerStatus;
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

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public String getContactPersonEmailId() {
        return contactPersonEmailId;
    }

    public void setContactPersonEmailId(String contactPersonEmailId) {
        this.contactPersonEmailId = contactPersonEmailId;
    }

    public String getContactPersonMobileNo() {
        return contactPersonMobileNo;
    }

    public void setContactPersonMobileNo(String contactPersonMobileNo) {
        this.contactPersonMobileNo = contactPersonMobileNo;
    }

    public String getPartnerDbString() {
        return partnerDbString;
    }

    public void setPartnerDbString(String partnerDbString) {
        this.partnerDbString = partnerDbString;
    }

    @XmlTransient
    public Collection<TMAdmin> getTMAdminCollection() {
        return tMAdminCollection;
    }

    public void setTMAdminCollection(Collection<TMAdmin> tMAdminCollection) {
        this.tMAdminCollection = tMAdminCollection;
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
        hash += (partnersLinkId != null ? partnersLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMPartners)) {
            return false;
        }
        TMPartners other = (TMPartners) object;
        if ((this.partnersLinkId == null && other.partnersLinkId != null) || (this.partnersLinkId != null && !this.partnersLinkId.equals(other.partnersLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMPartners[ partnersLinkId=" + partnersLinkId + " ]";
    }
    
}
