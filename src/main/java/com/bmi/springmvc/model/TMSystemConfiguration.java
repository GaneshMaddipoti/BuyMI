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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "t_m_system_configuration")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMSystemConfiguration.findAll", query = "SELECT t FROM TMSystemConfiguration t")
    , @NamedQuery(name = "TMSystemConfiguration.findBySystemConfigLinkId", query = "SELECT t FROM TMSystemConfiguration t WHERE t.systemConfigLinkId = :systemConfigLinkId")
    , @NamedQuery(name = "TMSystemConfiguration.findByInsurancecompanyLinkId", query = "SELECT t FROM TMSystemConfiguration t WHERE t.insurancecompanyLinkId = :insurancecompanyLinkId")
    , @NamedQuery(name = "TMSystemConfiguration.findByConfigurationType", query = "SELECT t FROM TMSystemConfiguration t WHERE t.configurationType = :configurationType")
    , @NamedQuery(name = "TMSystemConfiguration.findByConfigurationCode", query = "SELECT t FROM TMSystemConfiguration t WHERE t.configurationCode = :configurationCode")
    , @NamedQuery(name = "TMSystemConfiguration.findByConfigurationValue", query = "SELECT t FROM TMSystemConfiguration t WHERE t.configurationValue = :configurationValue")
    , @NamedQuery(name = "TMSystemConfiguration.findByConfigurationValueType", query = "SELECT t FROM TMSystemConfiguration t WHERE t.configurationValueType = :configurationValueType")
    , @NamedQuery(name = "TMSystemConfiguration.findByAddtionalremarks", query = "SELECT t FROM TMSystemConfiguration t WHERE t.addtionalremarks = :addtionalremarks")
    , @NamedQuery(name = "TMSystemConfiguration.findByEditableByBroker", query = "SELECT t FROM TMSystemConfiguration t WHERE t.editableByBroker = :editableByBroker")
    , @NamedQuery(name = "TMSystemConfiguration.findByEditableByInsurance", query = "SELECT t FROM TMSystemConfiguration t WHERE t.editableByInsurance = :editableByInsurance")
    , @NamedQuery(name = "TMSystemConfiguration.findByFromDate", query = "SELECT t FROM TMSystemConfiguration t WHERE t.fromDate = :fromDate")
    , @NamedQuery(name = "TMSystemConfiguration.findByToDate", query = "SELECT t FROM TMSystemConfiguration t WHERE t.toDate = :toDate")
    , @NamedQuery(name = "TMSystemConfiguration.findByCreatedDate", query = "SELECT t FROM TMSystemConfiguration t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMSystemConfiguration.findByModifiedDate", query = "SELECT t FROM TMSystemConfiguration t WHERE t.modifiedDate = :modifiedDate")
    , @NamedQuery(name = "TMSystemConfiguration.findByActive", query = "SELECT t FROM TMSystemConfiguration t WHERE t.active = :active")})
public class TMSystemConfiguration implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "system_config_link_id")
    private Integer systemConfigLinkId;
    @Column(name = "insurancecompany_link_id")
    private Integer insurancecompanyLinkId;
    @Size(max = 50)
    @Column(name = "configuration_type")
    private String configurationType;
    @Size(max = 10)
    @Column(name = "configuration_code")
    private String configurationCode;
    @Size(max = 10)
    @Column(name = "configuration_value")
    private String configurationValue;
    @Size(max = 20)
    @Column(name = "configuration_value_type")
    private String configurationValueType;
    @Size(max = 200)
    @Column(name = "Addtional_remarks")
    private String addtionalremarks;
    @Column(name = "editable_by_broker")
    private Integer editableByBroker;
    @Column(name = "editable_by_insurance")
    private Integer editableByInsurance;
    @Column(name = "from_date")
    @Temporal(TemporalType.DATE)
    private Date fromDate;
    @Column(name = "to_date")
    @Temporal(TemporalType.DATE)
    private Date toDate;
    @Column(name = "created_date")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @Column(name = "modified_date")
    @Temporal(TemporalType.DATE)
    private Date modifiedDate;
    @Column(name = "active")
    private Integer active;
    @JoinColumn(name = "created_by_id", referencedColumnName = "admin_link_id")
    @ManyToOne
    private TMAdmin createdById;
    @JoinColumn(name = "modified_by_id", referencedColumnName = "admin_link_id")
    @ManyToOne
    private TMAdmin modifiedById;

    public TMSystemConfiguration() {
    }

    public TMSystemConfiguration(Integer systemConfigLinkId) {
        this.systemConfigLinkId = systemConfigLinkId;
    }

    public Integer getSystemConfigLinkId() {
        return systemConfigLinkId;
    }

    public void setSystemConfigLinkId(Integer systemConfigLinkId) {
        this.systemConfigLinkId = systemConfigLinkId;
    }

    public Integer getInsurancecompanyLinkId() {
        return insurancecompanyLinkId;
    }

    public void setInsurancecompanyLinkId(Integer insurancecompanyLinkId) {
        this.insurancecompanyLinkId = insurancecompanyLinkId;
    }

    public String getConfigurationType() {
        return configurationType;
    }

    public void setConfigurationType(String configurationType) {
        this.configurationType = configurationType;
    }

    public String getConfigurationCode() {
        return configurationCode;
    }

    public void setConfigurationCode(String configurationCode) {
        this.configurationCode = configurationCode;
    }

    public String getConfigurationValue() {
        return configurationValue;
    }

    public void setConfigurationValue(String configurationValue) {
        this.configurationValue = configurationValue;
    }

    public String getConfigurationValueType() {
        return configurationValueType;
    }

    public void setConfigurationValueType(String configurationValueType) {
        this.configurationValueType = configurationValueType;
    }

    public String getAddtionalremarks() {
        return addtionalremarks;
    }

    public void setAddtionalremarks(String addtionalremarks) {
        this.addtionalremarks = addtionalremarks;
    }

    public Integer getEditableByBroker() {
        return editableByBroker;
    }

    public void setEditableByBroker(Integer editableByBroker) {
        this.editableByBroker = editableByBroker;
    }

    public Integer getEditableByInsurance() {
        return editableByInsurance;
    }

    public void setEditableByInsurance(Integer editableByInsurance) {
        this.editableByInsurance = editableByInsurance;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
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

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
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
        hash += (systemConfigLinkId != null ? systemConfigLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMSystemConfiguration)) {
            return false;
        }
        TMSystemConfiguration other = (TMSystemConfiguration) object;
        if ((this.systemConfigLinkId == null && other.systemConfigLinkId != null) || (this.systemConfigLinkId != null && !this.systemConfigLinkId.equals(other.systemConfigLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMSystemConfiguration[ systemConfigLinkId=" + systemConfigLinkId + " ]";
    }
    
}
