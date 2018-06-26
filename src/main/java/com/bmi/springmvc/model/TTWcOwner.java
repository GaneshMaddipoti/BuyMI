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
@Table(name = "t_t_wc_owner")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTWcOwner.findAll", query = "SELECT t FROM TTWcOwner t")
    , @NamedQuery(name = "TTWcOwner.findByWcOwnerLinkid", query = "SELECT t FROM TTWcOwner t WHERE t.wcOwnerLinkid = :wcOwnerLinkid")
    , @NamedQuery(name = "TTWcOwner.findByNameOfInsuredcompany", query = "SELECT t FROM TTWcOwner t WHERE t.nameOfInsuredcompany = :nameOfInsuredcompany")
    , @NamedQuery(name = "TTWcOwner.findByBusinessCategoryLinkid", query = "SELECT t FROM TTWcOwner t WHERE t.businessCategoryLinkid = :businessCategoryLinkid")
    , @NamedQuery(name = "TTWcOwner.findByBusinessOperationLinkId", query = "SELECT t FROM TTWcOwner t WHERE t.businessOperationLinkId = :businessOperationLinkId")
    , @NamedQuery(name = "TTWcOwner.findByEmiratesLinkid", query = "SELECT t FROM TTWcOwner t WHERE t.emiratesLinkid = :emiratesLinkid")
    , @NamedQuery(name = "TTWcOwner.findByCommercialLicNo", query = "SELECT t FROM TTWcOwner t WHERE t.commercialLicNo = :commercialLicNo")
    , @NamedQuery(name = "TTWcOwner.findByClExpDate", query = "SELECT t FROM TTWcOwner t WHERE t.clExpDate = :clExpDate")
    , @NamedQuery(name = "TTWcOwner.findByEstCardNo", query = "SELECT t FROM TTWcOwner t WHERE t.estCardNo = :estCardNo")
    , @NamedQuery(name = "TTWcOwner.findByEcExpDate", query = "SELECT t FROM TTWcOwner t WHERE t.ecExpDate = :ecExpDate")
    , @NamedQuery(name = "TTWcOwner.findByClaimLossRatio", query = "SELECT t FROM TTWcOwner t WHERE t.claimLossRatio = :claimLossRatio")
    , @NamedQuery(name = "TTWcOwner.findByContOfInsurance", query = "SELECT t FROM TTWcOwner t WHERE t.contOfInsurance = :contOfInsurance")
    , @NamedQuery(name = "TTWcOwner.findByMobile", query = "SELECT t FROM TTWcOwner t WHERE t.mobile = :mobile")
    , @NamedQuery(name = "TTWcOwner.findByEMail", query = "SELECT t FROM TTWcOwner t WHERE t.eMail = :eMail")
    , @NamedQuery(name = "TTWcOwner.findByCustomerLinkId", query = "SELECT t FROM TTWcOwner t WHERE t.customerLinkId = :customerLinkId")})
public class TTWcOwner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "wc_owner_linkid")
    private Integer wcOwnerLinkid;
    @Size(max = 50)
    @Column(name = "name_of_insuredcompany")
    private String nameOfInsuredcompany;
    @Size(max = 50)
    @Column(name = "business_category_linkid")
    private String businessCategoryLinkid;
    @Size(max = 50)
    @Column(name = "business_operation_link_id")
    private String businessOperationLinkId;
    @Size(max = 50)
    @Column(name = "emirates_linkid")
    private String emiratesLinkid;
    @Size(max = 50)
    @Column(name = "commercial_lic_no")
    private String commercialLicNo;
    @Column(name = "cl_exp_date")
    @Temporal(TemporalType.DATE)
    private Date clExpDate;
    @Size(max = 50)
    @Column(name = "est_card_no")
    private String estCardNo;
    @Column(name = "ec_exp_date")
    @Temporal(TemporalType.DATE)
    private Date ecExpDate;
    @Size(max = 50)
    @Column(name = "claim_loss_ratio")
    private String claimLossRatio;
    @Size(max = 40)
    @Column(name = "cont_of_insurance")
    private String contOfInsurance;
    @Size(max = 20)
    @Column(name = "mobile")
    private String mobile;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "e_mail")
    private String eMail;
    @Size(max = 50)
    @Column(name = "customer_link_id")
    private String customerLinkId;
    @OneToMany(mappedBy = "wcOwnerLinkId")
    private Collection<TTWcInsuredDetails> tTWcInsuredDetailsCollection;

    public TTWcOwner() {
    }

    public TTWcOwner(Integer wcOwnerLinkid) {
        this.wcOwnerLinkid = wcOwnerLinkid;
    }

    public Integer getWcOwnerLinkid() {
        return wcOwnerLinkid;
    }

    public void setWcOwnerLinkid(Integer wcOwnerLinkid) {
        this.wcOwnerLinkid = wcOwnerLinkid;
    }

    public String getNameOfInsuredcompany() {
        return nameOfInsuredcompany;
    }

    public void setNameOfInsuredcompany(String nameOfInsuredcompany) {
        this.nameOfInsuredcompany = nameOfInsuredcompany;
    }

    public String getBusinessCategoryLinkid() {
        return businessCategoryLinkid;
    }

    public void setBusinessCategoryLinkid(String businessCategoryLinkid) {
        this.businessCategoryLinkid = businessCategoryLinkid;
    }

    public String getBusinessOperationLinkId() {
        return businessOperationLinkId;
    }

    public void setBusinessOperationLinkId(String businessOperationLinkId) {
        this.businessOperationLinkId = businessOperationLinkId;
    }

    public String getEmiratesLinkid() {
        return emiratesLinkid;
    }

    public void setEmiratesLinkid(String emiratesLinkid) {
        this.emiratesLinkid = emiratesLinkid;
    }

    public String getCommercialLicNo() {
        return commercialLicNo;
    }

    public void setCommercialLicNo(String commercialLicNo) {
        this.commercialLicNo = commercialLicNo;
    }

    public Date getClExpDate() {
        return clExpDate;
    }

    public void setClExpDate(Date clExpDate) {
        this.clExpDate = clExpDate;
    }

    public String getEstCardNo() {
        return estCardNo;
    }

    public void setEstCardNo(String estCardNo) {
        this.estCardNo = estCardNo;
    }

    public Date getEcExpDate() {
        return ecExpDate;
    }

    public void setEcExpDate(Date ecExpDate) {
        this.ecExpDate = ecExpDate;
    }

    public String getClaimLossRatio() {
        return claimLossRatio;
    }

    public void setClaimLossRatio(String claimLossRatio) {
        this.claimLossRatio = claimLossRatio;
    }

    public String getContOfInsurance() {
        return contOfInsurance;
    }

    public void setContOfInsurance(String contOfInsurance) {
        this.contOfInsurance = contOfInsurance;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getCustomerLinkId() {
        return customerLinkId;
    }

    public void setCustomerLinkId(String customerLinkId) {
        this.customerLinkId = customerLinkId;
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
        hash += (wcOwnerLinkid != null ? wcOwnerLinkid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTWcOwner)) {
            return false;
        }
        TTWcOwner other = (TTWcOwner) object;
        if ((this.wcOwnerLinkid == null && other.wcOwnerLinkid != null) || (this.wcOwnerLinkid != null && !this.wcOwnerLinkid.equals(other.wcOwnerLinkid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TTWcOwner[ wcOwnerLinkid=" + wcOwnerLinkid + " ]";
    }
    
}
