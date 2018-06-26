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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ganesmad
 */
@Entity
@Table(name = "t_m_bank_mortgage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMBankMortgage.findAll", query = "SELECT t FROM TMBankMortgage t")
    , @NamedQuery(name = "TMBankMortgage.findByBankMortgageLinkId", query = "SELECT t FROM TMBankMortgage t WHERE t.bankMortgageLinkId = :bankMortgageLinkId")
    , @NamedQuery(name = "TMBankMortgage.findByBankNameCode", query = "SELECT t FROM TMBankMortgage t WHERE t.bankNameCode = :bankNameCode")
    , @NamedQuery(name = "TMBankMortgage.findByBankName", query = "SELECT t FROM TMBankMortgage t WHERE t.bankName = :bankName")
    , @NamedQuery(name = "TMBankMortgage.findByBankNameArabic", query = "SELECT t FROM TMBankMortgage t WHERE t.bankNameArabic = :bankNameArabic")
    , @NamedQuery(name = "TMBankMortgage.findByCreatedDate", query = "SELECT t FROM TMBankMortgage t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMBankMortgage.findByModifiedDate", query = "SELECT t FROM TMBankMortgage t WHERE t.modifiedDate = :modifiedDate")})
public class TMBankMortgage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bank_mortgage_link_id")
    private Integer bankMortgageLinkId;
    @Column(name = "bank_name_code")
    private String bankNameCode;
    @Column(name = "bank_name")
    private String bankName;
    @Column(name = "bank_name_arabic")
    private String bankNameArabic;
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

    public TMBankMortgage() {
    }

    public TMBankMortgage(Integer bankMortgageLinkId) {
        this.bankMortgageLinkId = bankMortgageLinkId;
    }

    public Integer getBankMortgageLinkId() {
        return bankMortgageLinkId;
    }

    public void setBankMortgageLinkId(Integer bankMortgageLinkId) {
        this.bankMortgageLinkId = bankMortgageLinkId;
    }

    public String getBankNameCode() {
        return bankNameCode;
    }

    public void setBankNameCode(String bankNameCode) {
        this.bankNameCode = bankNameCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankNameArabic() {
        return bankNameArabic;
    }

    public void setBankNameArabic(String bankNameArabic) {
        this.bankNameArabic = bankNameArabic;
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

    public TMUserRole getCreatedById() {
        return createdById;
    }

    public void setCreatedById(TMUserRole createdById) {
        this.createdById = createdById;
    }

    public TMUserRole getModifiedById() {
        return modifiedById;
    }

    public void setModifiedById(TMUserRole modifiedById) {
        this.modifiedById = modifiedById;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bankMortgageLinkId != null ? bankMortgageLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMBankMortgage)) {
            return false;
        }
        TMBankMortgage other = (TMBankMortgage) object;
        if ((this.bankMortgageLinkId == null && other.bankMortgageLinkId != null) || (this.bankMortgageLinkId != null && !this.bankMortgageLinkId.equals(other.bankMortgageLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bmi.springmvc.model.TMBankMortgage[ bankMortgageLinkId=" + bankMortgageLinkId + " ]";
    }
    
}
