/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmi.springmvc.model;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ganesmad
 */
@Entity
@Table(name = "t_m_admin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMAdmin.findAll", query = "SELECT t FROM TMAdmin t")
    , @NamedQuery(name = "TMAdmin.findByAdminLinkId", query = "SELECT t FROM TMAdmin t WHERE t.adminLinkId = :adminLinkId")
    , @NamedQuery(name = "TMAdmin.findByUsername", query = "SELECT t FROM TMAdmin t WHERE t.username = :username")
    , @NamedQuery(name = "TMAdmin.findByPassword", query = "SELECT t FROM TMAdmin t WHERE t.password = :password")
    , @NamedQuery(name = "TMAdmin.findByName", query = "SELECT t FROM TMAdmin t WHERE t.name = :name")
    , @NamedQuery(name = "TMAdmin.findBySex", query = "SELECT t FROM TMAdmin t WHERE t.sex = :sex")
    , @NamedQuery(name = "TMAdmin.findByCell", query = "SELECT t FROM TMAdmin t WHERE t.cell = :cell")
    , @NamedQuery(name = "TMAdmin.findByPhone", query = "SELECT t FROM TMAdmin t WHERE t.phone = :phone")
    , @NamedQuery(name = "TMAdmin.findByEmail", query = "SELECT t FROM TMAdmin t WHERE t.email = :email")
    , @NamedQuery(name = "TMAdmin.findByAddress", query = "SELECT t FROM TMAdmin t WHERE t.address = :address")
    , @NamedQuery(name = "TMAdmin.findByRole", query = "SELECT t FROM TMAdmin t WHERE t.role = :role")})
public class TMAdmin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "admin_link_id")
    private Integer adminLinkId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "sex")
    private String sex;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cell")
    private String cell;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "phone")
    private String phone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "address")
    private String address;
    @Size(max = 40)
    @Column(name = "role")
    private String role;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMWcBusinessOperations> tMWcBusinessOperationsCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMWcBusinessOperations> tMWcBusinessOperationsCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMLineOfBusiness> tMLineOfBusinessCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMLineOfBusiness> tMLineOfBusinessCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMBodyType> tMBodyTypeCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMBodyType> tMBodyTypeCollection1;
    @JoinColumn(name = "partner_link_id", referencedColumnName = "partners_link_id")
    @ManyToOne
    private TMPartners partnerLinkId;
    @JoinColumn(name = "userrole_link_id", referencedColumnName = "user_role_link_id")
    @ManyToOne
    private TMUserRole userroleLinkId;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMPartners> tMPartnersCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMPartners> tMPartnersCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMVehicleColor> tMVehicleColorCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMVehicleColor> tMVehicleColorCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMWcJobCategory> tMWcJobCategoryCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMWcJobCategory> tMWcJobCategoryCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMStatus> tMStatusCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMStatus> tMStatusCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMSystemConfiguration> tMSystemConfigurationCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMSystemConfiguration> tMSystemConfigurationCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMMapLobPolicyPlan> tMMapLobPolicyPlanCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMMapLobPolicyPlan> tMMapLobPolicyPlanCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMNationality> tMNationalityCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMNationality> tMNationalityCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMEmirates> tMEmiratesCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMEmirates> tMEmiratesCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMWcBusinessCategory> tMWcBusinessCategoryCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMWcBusinessCategory> tMWcBusinessCategoryCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMVehicleMake> tMVehicleMakeCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMVehicleMake> tMVehicleMakeCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMVehicleModel> tMVehicleModelCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMVehicleModel> tMVehicleModelCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TRWcRate> tRWcRateCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TRWcRate> tRWcRateCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMPolicyType> tMPolicyTypeCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMPolicyType> tMPolicyTypeCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMBankMortgage> tMBankMortgageCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMBankMortgage> tMBankMortgageCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMNcd> tMNcdCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMNcd> tMNcdCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMBenefit> tMBenefitCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMBenefit> tMBenefitCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMWcBusinessOperationReferral> tMWcBusinessOperationReferralCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMWcBusinessOperationReferral> tMWcBusinessOperationReferralCollection1;
    @OneToMany(mappedBy = "createdById")
    private Collection<TMPlanMaster> tMPlanMasterCollection;
    @OneToMany(mappedBy = "modifiedById")
    private Collection<TMPlanMaster> tMPlanMasterCollection1;

    public TMAdmin() {
    }

    public TMAdmin(Integer adminLinkId) {
        this.adminLinkId = adminLinkId;
    }

    public TMAdmin(Integer adminLinkId, String username, String password, String name, String sex, String cell, String phone, String email, String address) {
        this.adminLinkId = adminLinkId;
        this.username = username;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.cell = cell;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Integer getAdminLinkId() {
        return adminLinkId;
    }

    public void setAdminLinkId(Integer adminLinkId) {
        this.adminLinkId = adminLinkId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @XmlTransient
    public Collection<TMWcBusinessOperations> getTMWcBusinessOperationsCollection() {
        return tMWcBusinessOperationsCollection;
    }

    public void setTMWcBusinessOperationsCollection(Collection<TMWcBusinessOperations> tMWcBusinessOperationsCollection) {
        this.tMWcBusinessOperationsCollection = tMWcBusinessOperationsCollection;
    }

    @XmlTransient
    public Collection<TMWcBusinessOperations> getTMWcBusinessOperationsCollection1() {
        return tMWcBusinessOperationsCollection1;
    }

    public void setTMWcBusinessOperationsCollection1(Collection<TMWcBusinessOperations> tMWcBusinessOperationsCollection1) {
        this.tMWcBusinessOperationsCollection1 = tMWcBusinessOperationsCollection1;
    }

    @XmlTransient
    public Collection<TMLineOfBusiness> getTMLineOfBusinessCollection() {
        return tMLineOfBusinessCollection;
    }

    public void setTMLineOfBusinessCollection(Collection<TMLineOfBusiness> tMLineOfBusinessCollection) {
        this.tMLineOfBusinessCollection = tMLineOfBusinessCollection;
    }

    @XmlTransient
    public Collection<TMLineOfBusiness> getTMLineOfBusinessCollection1() {
        return tMLineOfBusinessCollection1;
    }

    public void setTMLineOfBusinessCollection1(Collection<TMLineOfBusiness> tMLineOfBusinessCollection1) {
        this.tMLineOfBusinessCollection1 = tMLineOfBusinessCollection1;
    }

    @XmlTransient
    public Collection<TMBodyType> getTMBodyTypeCollection() {
        return tMBodyTypeCollection;
    }

    public void setTMBodyTypeCollection(Collection<TMBodyType> tMBodyTypeCollection) {
        this.tMBodyTypeCollection = tMBodyTypeCollection;
    }

    @XmlTransient
    public Collection<TMBodyType> getTMBodyTypeCollection1() {
        return tMBodyTypeCollection1;
    }

    public void setTMBodyTypeCollection1(Collection<TMBodyType> tMBodyTypeCollection1) {
        this.tMBodyTypeCollection1 = tMBodyTypeCollection1;
    }

    public TMPartners getPartnerLinkId() {
        return partnerLinkId;
    }

    public void setPartnerLinkId(TMPartners partnerLinkId) {
        this.partnerLinkId = partnerLinkId;
    }

    public TMUserRole getUserroleLinkId() {
        return userroleLinkId;
    }

    public void setUserroleLinkId(TMUserRole userroleLinkId) {
        this.userroleLinkId = userroleLinkId;
    }

    @XmlTransient
    public Collection<TMPartners> getTMPartnersCollection() {
        return tMPartnersCollection;
    }

    public void setTMPartnersCollection(Collection<TMPartners> tMPartnersCollection) {
        this.tMPartnersCollection = tMPartnersCollection;
    }

    @XmlTransient
    public Collection<TMPartners> getTMPartnersCollection1() {
        return tMPartnersCollection1;
    }

    public void setTMPartnersCollection1(Collection<TMPartners> tMPartnersCollection1) {
        this.tMPartnersCollection1 = tMPartnersCollection1;
    }

    @XmlTransient
    public Collection<TMVehicleColor> getTMVehicleColorCollection() {
        return tMVehicleColorCollection;
    }

    public void setTMVehicleColorCollection(Collection<TMVehicleColor> tMVehicleColorCollection) {
        this.tMVehicleColorCollection = tMVehicleColorCollection;
    }

    @XmlTransient
    public Collection<TMVehicleColor> getTMVehicleColorCollection1() {
        return tMVehicleColorCollection1;
    }

    public void setTMVehicleColorCollection1(Collection<TMVehicleColor> tMVehicleColorCollection1) {
        this.tMVehicleColorCollection1 = tMVehicleColorCollection1;
    }

    @XmlTransient
    public Collection<TMWcJobCategory> getTMWcJobCategoryCollection() {
        return tMWcJobCategoryCollection;
    }

    public void setTMWcJobCategoryCollection(Collection<TMWcJobCategory> tMWcJobCategoryCollection) {
        this.tMWcJobCategoryCollection = tMWcJobCategoryCollection;
    }

    @XmlTransient
    public Collection<TMWcJobCategory> getTMWcJobCategoryCollection1() {
        return tMWcJobCategoryCollection1;
    }

    public void setTMWcJobCategoryCollection1(Collection<TMWcJobCategory> tMWcJobCategoryCollection1) {
        this.tMWcJobCategoryCollection1 = tMWcJobCategoryCollection1;
    }

    @XmlTransient
    public Collection<TMStatus> getTMStatusCollection() {
        return tMStatusCollection;
    }

    public void setTMStatusCollection(Collection<TMStatus> tMStatusCollection) {
        this.tMStatusCollection = tMStatusCollection;
    }

    @XmlTransient
    public Collection<TMStatus> getTMStatusCollection1() {
        return tMStatusCollection1;
    }

    public void setTMStatusCollection1(Collection<TMStatus> tMStatusCollection1) {
        this.tMStatusCollection1 = tMStatusCollection1;
    }

    @XmlTransient
    public Collection<TMSystemConfiguration> getTMSystemConfigurationCollection() {
        return tMSystemConfigurationCollection;
    }

    public void setTMSystemConfigurationCollection(Collection<TMSystemConfiguration> tMSystemConfigurationCollection) {
        this.tMSystemConfigurationCollection = tMSystemConfigurationCollection;
    }

    @XmlTransient
    public Collection<TMSystemConfiguration> getTMSystemConfigurationCollection1() {
        return tMSystemConfigurationCollection1;
    }

    public void setTMSystemConfigurationCollection1(Collection<TMSystemConfiguration> tMSystemConfigurationCollection1) {
        this.tMSystemConfigurationCollection1 = tMSystemConfigurationCollection1;
    }

    @XmlTransient
    public Collection<TMMapLobPolicyPlan> getTMMapLobPolicyPlanCollection() {
        return tMMapLobPolicyPlanCollection;
    }

    public void setTMMapLobPolicyPlanCollection(Collection<TMMapLobPolicyPlan> tMMapLobPolicyPlanCollection) {
        this.tMMapLobPolicyPlanCollection = tMMapLobPolicyPlanCollection;
    }

    @XmlTransient
    public Collection<TMMapLobPolicyPlan> getTMMapLobPolicyPlanCollection1() {
        return tMMapLobPolicyPlanCollection1;
    }

    public void setTMMapLobPolicyPlanCollection1(Collection<TMMapLobPolicyPlan> tMMapLobPolicyPlanCollection1) {
        this.tMMapLobPolicyPlanCollection1 = tMMapLobPolicyPlanCollection1;
    }

    @XmlTransient
    public Collection<TMNationality> getTMNationalityCollection() {
        return tMNationalityCollection;
    }

    public void setTMNationalityCollection(Collection<TMNationality> tMNationalityCollection) {
        this.tMNationalityCollection = tMNationalityCollection;
    }

    @XmlTransient
    public Collection<TMNationality> getTMNationalityCollection1() {
        return tMNationalityCollection1;
    }

    public void setTMNationalityCollection1(Collection<TMNationality> tMNationalityCollection1) {
        this.tMNationalityCollection1 = tMNationalityCollection1;
    }

    @XmlTransient
    public Collection<TMEmirates> getTMEmiratesCollection() {
        return tMEmiratesCollection;
    }

    public void setTMEmiratesCollection(Collection<TMEmirates> tMEmiratesCollection) {
        this.tMEmiratesCollection = tMEmiratesCollection;
    }

    @XmlTransient
    public Collection<TMEmirates> getTMEmiratesCollection1() {
        return tMEmiratesCollection1;
    }

    public void setTMEmiratesCollection1(Collection<TMEmirates> tMEmiratesCollection1) {
        this.tMEmiratesCollection1 = tMEmiratesCollection1;
    }

    @XmlTransient
    public Collection<TMWcBusinessCategory> getTMWcBusinessCategoryCollection() {
        return tMWcBusinessCategoryCollection;
    }

    public void setTMWcBusinessCategoryCollection(Collection<TMWcBusinessCategory> tMWcBusinessCategoryCollection) {
        this.tMWcBusinessCategoryCollection = tMWcBusinessCategoryCollection;
    }

    @XmlTransient
    public Collection<TMWcBusinessCategory> getTMWcBusinessCategoryCollection1() {
        return tMWcBusinessCategoryCollection1;
    }

    public void setTMWcBusinessCategoryCollection1(Collection<TMWcBusinessCategory> tMWcBusinessCategoryCollection1) {
        this.tMWcBusinessCategoryCollection1 = tMWcBusinessCategoryCollection1;
    }

    @XmlTransient
    public Collection<TMVehicleMake> getTMVehicleMakeCollection() {
        return tMVehicleMakeCollection;
    }

    public void setTMVehicleMakeCollection(Collection<TMVehicleMake> tMVehicleMakeCollection) {
        this.tMVehicleMakeCollection = tMVehicleMakeCollection;
    }

    @XmlTransient
    public Collection<TMVehicleMake> getTMVehicleMakeCollection1() {
        return tMVehicleMakeCollection1;
    }

    public void setTMVehicleMakeCollection1(Collection<TMVehicleMake> tMVehicleMakeCollection1) {
        this.tMVehicleMakeCollection1 = tMVehicleMakeCollection1;
    }

    @XmlTransient
    public Collection<TMVehicleModel> getTMVehicleModelCollection() {
        return tMVehicleModelCollection;
    }

    public void setTMVehicleModelCollection(Collection<TMVehicleModel> tMVehicleModelCollection) {
        this.tMVehicleModelCollection = tMVehicleModelCollection;
    }

    @XmlTransient
    public Collection<TMVehicleModel> getTMVehicleModelCollection1() {
        return tMVehicleModelCollection1;
    }

    public void setTMVehicleModelCollection1(Collection<TMVehicleModel> tMVehicleModelCollection1) {
        this.tMVehicleModelCollection1 = tMVehicleModelCollection1;
    }

    @XmlTransient
    public Collection<TRWcRate> getTRWcRateCollection() {
        return tRWcRateCollection;
    }

    public void setTRWcRateCollection(Collection<TRWcRate> tRWcRateCollection) {
        this.tRWcRateCollection = tRWcRateCollection;
    }

    @XmlTransient
    public Collection<TRWcRate> getTRWcRateCollection1() {
        return tRWcRateCollection1;
    }

    public void setTRWcRateCollection1(Collection<TRWcRate> tRWcRateCollection1) {
        this.tRWcRateCollection1 = tRWcRateCollection1;
    }

    @XmlTransient
    public Collection<TMPolicyType> getTMPolicyTypeCollection() {
        return tMPolicyTypeCollection;
    }

    public void setTMPolicyTypeCollection(Collection<TMPolicyType> tMPolicyTypeCollection) {
        this.tMPolicyTypeCollection = tMPolicyTypeCollection;
    }

    @XmlTransient
    public Collection<TMPolicyType> getTMPolicyTypeCollection1() {
        return tMPolicyTypeCollection1;
    }

    public void setTMPolicyTypeCollection1(Collection<TMPolicyType> tMPolicyTypeCollection1) {
        this.tMPolicyTypeCollection1 = tMPolicyTypeCollection1;
    }

    @XmlTransient
    public Collection<TMBankMortgage> getTMBankMortgageCollection() {
        return tMBankMortgageCollection;
    }

    public void setTMBankMortgageCollection(Collection<TMBankMortgage> tMBankMortgageCollection) {
        this.tMBankMortgageCollection = tMBankMortgageCollection;
    }

    @XmlTransient
    public Collection<TMBankMortgage> getTMBankMortgageCollection1() {
        return tMBankMortgageCollection1;
    }

    public void setTMBankMortgageCollection1(Collection<TMBankMortgage> tMBankMortgageCollection1) {
        this.tMBankMortgageCollection1 = tMBankMortgageCollection1;
    }

    @XmlTransient
    public Collection<TMNcd> getTMNcdCollection() {
        return tMNcdCollection;
    }

    public void setTMNcdCollection(Collection<TMNcd> tMNcdCollection) {
        this.tMNcdCollection = tMNcdCollection;
    }

    @XmlTransient
    public Collection<TMNcd> getTMNcdCollection1() {
        return tMNcdCollection1;
    }

    public void setTMNcdCollection1(Collection<TMNcd> tMNcdCollection1) {
        this.tMNcdCollection1 = tMNcdCollection1;
    }

    @XmlTransient
    public Collection<TMBenefit> getTMBenefitCollection() {
        return tMBenefitCollection;
    }

    public void setTMBenefitCollection(Collection<TMBenefit> tMBenefitCollection) {
        this.tMBenefitCollection = tMBenefitCollection;
    }

    @XmlTransient
    public Collection<TMBenefit> getTMBenefitCollection1() {
        return tMBenefitCollection1;
    }

    public void setTMBenefitCollection1(Collection<TMBenefit> tMBenefitCollection1) {
        this.tMBenefitCollection1 = tMBenefitCollection1;
    }

    @XmlTransient
    public Collection<TMWcBusinessOperationReferral> getTMWcBusinessOperationReferralCollection() {
        return tMWcBusinessOperationReferralCollection;
    }

    public void setTMWcBusinessOperationReferralCollection(Collection<TMWcBusinessOperationReferral> tMWcBusinessOperationReferralCollection) {
        this.tMWcBusinessOperationReferralCollection = tMWcBusinessOperationReferralCollection;
    }

    @XmlTransient
    public Collection<TMWcBusinessOperationReferral> getTMWcBusinessOperationReferralCollection1() {
        return tMWcBusinessOperationReferralCollection1;
    }

    public void setTMWcBusinessOperationReferralCollection1(Collection<TMWcBusinessOperationReferral> tMWcBusinessOperationReferralCollection1) {
        this.tMWcBusinessOperationReferralCollection1 = tMWcBusinessOperationReferralCollection1;
    }

    @XmlTransient
    public Collection<TMPlanMaster> getTMPlanMasterCollection() {
        return tMPlanMasterCollection;
    }

    public void setTMPlanMasterCollection(Collection<TMPlanMaster> tMPlanMasterCollection) {
        this.tMPlanMasterCollection = tMPlanMasterCollection;
    }

    @XmlTransient
    public Collection<TMPlanMaster> getTMPlanMasterCollection1() {
        return tMPlanMasterCollection1;
    }

    public void setTMPlanMasterCollection1(Collection<TMPlanMaster> tMPlanMasterCollection1) {
        this.tMPlanMasterCollection1 = tMPlanMasterCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adminLinkId != null ? adminLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMAdmin)) {
            return false;
        }
        TMAdmin other = (TMAdmin) object;
        if ((this.adminLinkId == null && other.adminLinkId != null) || (this.adminLinkId != null && !this.adminLinkId.equals(other.adminLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMAdmin[ adminLinkId=" + adminLinkId + " ]";
    }
    
}
