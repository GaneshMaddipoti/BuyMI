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
@Table(name = "t_m_plan_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMPlanMaster.findAll", query = "SELECT t FROM TMPlanMaster t")
    , @NamedQuery(name = "TMPlanMaster.findByPlanMasterLinkId", query = "SELECT t FROM TMPlanMaster t WHERE t.planMasterLinkId = :planMasterLinkId")
    , @NamedQuery(name = "TMPlanMaster.findByPlanName", query = "SELECT t FROM TMPlanMaster t WHERE t.planName = :planName")
    , @NamedQuery(name = "TMPlanMaster.findByCreatedDate", query = "SELECT t FROM TMPlanMaster t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMPlanMaster.findByModifiedDate", query = "SELECT t FROM TMPlanMaster t WHERE t.modifiedDate = :modifiedDate")})
public class TMPlanMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "plan_master_link_id")
    private Integer planMasterLinkId;
    @Size(max = 40)
    @Column(name = "plan_name")
    private String planName;
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

    public TMPlanMaster() {
    }

    public TMPlanMaster(Integer planMasterLinkId) {
        this.planMasterLinkId = planMasterLinkId;
    }

    public Integer getPlanMasterLinkId() {
        return planMasterLinkId;
    }

    public void setPlanMasterLinkId(Integer planMasterLinkId) {
        this.planMasterLinkId = planMasterLinkId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
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
        hash += (planMasterLinkId != null ? planMasterLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMPlanMaster)) {
            return false;
        }
        TMPlanMaster other = (TMPlanMaster) object;
        if ((this.planMasterLinkId == null && other.planMasterLinkId != null) || (this.planMasterLinkId != null && !this.planMasterLinkId.equals(other.planMasterLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMPlanMaster[ planMasterLinkId=" + planMasterLinkId + " ]";
    }
    
}
