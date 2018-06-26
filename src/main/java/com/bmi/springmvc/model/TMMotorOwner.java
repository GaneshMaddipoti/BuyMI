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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ganesmad
 */
@Entity
@Table(name = "t_m_motor_owner")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMMotorOwner.findAll", query = "SELECT t FROM TMMotorOwner t")
    , @NamedQuery(name = "TMMotorOwner.findByOwnerLinkId", query = "SELECT t FROM TMMotorOwner t WHERE t.ownerLinkId = :ownerLinkId")
    , @NamedQuery(name = "TMMotorOwner.findByInsuredType", query = "SELECT t FROM TMMotorOwner t WHERE t.insuredType = :insuredType")
    , @NamedQuery(name = "TMMotorOwner.findByInsuredName", query = "SELECT t FROM TMMotorOwner t WHERE t.insuredName = :insuredName")
    , @NamedQuery(name = "TMMotorOwner.findByInsuredGender", query = "SELECT t FROM TMMotorOwner t WHERE t.insuredGender = :insuredGender")
    , @NamedQuery(name = "TMMotorOwner.findByInsuredDob", query = "SELECT t FROM TMMotorOwner t WHERE t.insuredDob = :insuredDob")
    , @NamedQuery(name = "TMMotorOwner.findByInsuredMobileNo", query = "SELECT t FROM TMMotorOwner t WHERE t.insuredMobileNo = :insuredMobileNo")
    , @NamedQuery(name = "TMMotorOwner.findByInsuredEmailId", query = "SELECT t FROM TMMotorOwner t WHERE t.insuredEmailId = :insuredEmailId")
    , @NamedQuery(name = "TMMotorOwner.findByNationalityLinkId", query = "SELECT t FROM TMMotorOwner t WHERE t.nationalityLinkId = :nationalityLinkId")
    , @NamedQuery(name = "TMMotorOwner.findByAgeDrivingLicence", query = "SELECT t FROM TMMotorOwner t WHERE t.ageDrivingLicence = :ageDrivingLicence")
    , @NamedQuery(name = "TMMotorOwner.findByNoNcdyears", query = "SELECT t FROM TMMotorOwner t WHERE t.noNcdyears = :noNcdyears")
    , @NamedQuery(name = "TMMotorOwner.findByNcdDocsSupport", query = "SELECT t FROM TMMotorOwner t WHERE t.ncdDocsSupport = :ncdDocsSupport")
    , @NamedQuery(name = "TMMotorOwner.findByCountryFirstDrivingLicence", query = "SELECT t FROM TMMotorOwner t WHERE t.countryFirstDrivingLicence = :countryFirstDrivingLicence")
    , @NamedQuery(name = "TMMotorOwner.findByCustomerLinkId", query = "SELECT t FROM TMMotorOwner t WHERE t.customerLinkId = :customerLinkId")
    , @NamedQuery(name = "TMMotorOwner.findByRegistrationPlaceLinkId", query = "SELECT t FROM TMMotorOwner t WHERE t.registrationPlaceLinkId = :registrationPlaceLinkId")})
public class TMMotorOwner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "owner_link_id")
    private Integer ownerLinkId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "insured_type")
    private String insuredType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "insured_name")
    private String insuredName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "insured_gender")
    private String insuredGender;
    @Basic(optional = false)
    @NotNull
    @Column(name = "insured_dob")
    @Temporal(TemporalType.DATE)
    private Date insuredDob;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "insured_mobile_no")
    private String insuredMobileNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "insured_email_id")
    private String insuredEmailId;
    @Column(name = "nationality_link_id")
    private Integer nationalityLinkId;
    @Column(name = "age_driving_licence")
    private Integer ageDrivingLicence;
    @Column(name = "no_Ncd_years")
    private Integer noNcdyears;
    @Size(max = 4)
    @Column(name = "ncd_docs_support")
    private String ncdDocsSupport;
    @Column(name = "country_first_driving_licence")
    private Integer countryFirstDrivingLicence;
    @Column(name = "customer_link_id")
    private Integer customerLinkId;
    @Column(name = "registration_place_link_id")
    private Integer registrationPlaceLinkId;

    public TMMotorOwner() {
    }

    public TMMotorOwner(Integer ownerLinkId) {
        this.ownerLinkId = ownerLinkId;
    }

    public TMMotorOwner(Integer ownerLinkId, String insuredType, String insuredName, String insuredGender, Date insuredDob, String insuredMobileNo, String insuredEmailId) {
        this.ownerLinkId = ownerLinkId;
        this.insuredType = insuredType;
        this.insuredName = insuredName;
        this.insuredGender = insuredGender;
        this.insuredDob = insuredDob;
        this.insuredMobileNo = insuredMobileNo;
        this.insuredEmailId = insuredEmailId;
    }

    public Integer getOwnerLinkId() {
        return ownerLinkId;
    }

    public void setOwnerLinkId(Integer ownerLinkId) {
        this.ownerLinkId = ownerLinkId;
    }

    public String getInsuredType() {
        return insuredType;
    }

    public void setInsuredType(String insuredType) {
        this.insuredType = insuredType;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public String getInsuredGender() {
        return insuredGender;
    }

    public void setInsuredGender(String insuredGender) {
        this.insuredGender = insuredGender;
    }

    public Date getInsuredDob() {
        return insuredDob;
    }

    public void setInsuredDob(Date insuredDob) {
        this.insuredDob = insuredDob;
    }

    public String getInsuredMobileNo() {
        return insuredMobileNo;
    }

    public void setInsuredMobileNo(String insuredMobileNo) {
        this.insuredMobileNo = insuredMobileNo;
    }

    public String getInsuredEmailId() {
        return insuredEmailId;
    }

    public void setInsuredEmailId(String insuredEmailId) {
        this.insuredEmailId = insuredEmailId;
    }

    public Integer getNationalityLinkId() {
        return nationalityLinkId;
    }

    public void setNationalityLinkId(Integer nationalityLinkId) {
        this.nationalityLinkId = nationalityLinkId;
    }

    public Integer getAgeDrivingLicence() {
        return ageDrivingLicence;
    }

    public void setAgeDrivingLicence(Integer ageDrivingLicence) {
        this.ageDrivingLicence = ageDrivingLicence;
    }

    public Integer getNoNcdyears() {
        return noNcdyears;
    }

    public void setNoNcdyears(Integer noNcdyears) {
        this.noNcdyears = noNcdyears;
    }

    public String getNcdDocsSupport() {
        return ncdDocsSupport;
    }

    public void setNcdDocsSupport(String ncdDocsSupport) {
        this.ncdDocsSupport = ncdDocsSupport;
    }

    public Integer getCountryFirstDrivingLicence() {
        return countryFirstDrivingLicence;
    }

    public void setCountryFirstDrivingLicence(Integer countryFirstDrivingLicence) {
        this.countryFirstDrivingLicence = countryFirstDrivingLicence;
    }

    public Integer getCustomerLinkId() {
        return customerLinkId;
    }

    public void setCustomerLinkId(Integer customerLinkId) {
        this.customerLinkId = customerLinkId;
    }

    public Integer getRegistrationPlaceLinkId() {
        return registrationPlaceLinkId;
    }

    public void setRegistrationPlaceLinkId(Integer registrationPlaceLinkId) {
        this.registrationPlaceLinkId = registrationPlaceLinkId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ownerLinkId != null ? ownerLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMMotorOwner)) {
            return false;
        }
        TMMotorOwner other = (TMMotorOwner) object;
        if ((this.ownerLinkId == null && other.ownerLinkId != null) || (this.ownerLinkId != null && !this.ownerLinkId.equals(other.ownerLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMMotorOwner[ ownerLinkId=" + ownerLinkId + " ]";
    }

	public String getAge() {
		// TODO Auto-generated method stub
		return "22";
	}
    
}
