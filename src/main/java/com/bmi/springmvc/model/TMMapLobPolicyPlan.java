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
@Table(name = "t_m_map_lob_policy_plan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMMapLobPolicyPlan.findAll", query = "SELECT t FROM TMMapLobPolicyPlan t")
    , @NamedQuery(name = "TMMapLobPolicyPlan.findByMapLobPolicyPlanLinkId", query = "SELECT t FROM TMMapLobPolicyPlan t WHERE t.mapLobPolicyPlanLinkId = :mapLobPolicyPlanLinkId")
    , @NamedQuery(name = "TMMapLobPolicyPlan.findByLobLinkId", query = "SELECT t FROM TMMapLobPolicyPlan t WHERE t.lobLinkId = :lobLinkId")
    , @NamedQuery(name = "TMMapLobPolicyPlan.findByPolicyTypeLinkId", query = "SELECT t FROM TMMapLobPolicyPlan t WHERE t.policyTypeLinkId = :policyTypeLinkId")
    , @NamedQuery(name = "TMMapLobPolicyPlan.findByPlanMasterLinkId", query = "SELECT t FROM TMMapLobPolicyPlan t WHERE t.planMasterLinkId = :planMasterLinkId")
    , @NamedQuery(name = "TMMapLobPolicyPlan.findByLobPolicyPlanName", query = "SELECT t FROM TMMapLobPolicyPlan t WHERE t.lobPolicyPlanName = :lobPolicyPlanName")
    , @NamedQuery(name = "TMMapLobPolicyPlan.findByCreatedDate", query = "SELECT t FROM TMMapLobPolicyPlan t WHERE t.createdDate = :createdDate")
    , @NamedQuery(name = "TMMapLobPolicyPlan.findByModifiedDate", query = "SELECT t FROM TMMapLobPolicyPlan t WHERE t.modifiedDate = :modifiedDate")})
public class TMMapLobPolicyPlan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "map_lob_policy_plan_link_id")
    private Integer mapLobPolicyPlanLinkId;
    @Column(name = "lob_link_id")
    private Integer lobLinkId;
    @Column(name = "policy_type_link_id")
    private Integer policyTypeLinkId;
    @Column(name = "plan_master_link_id")
    private Integer planMasterLinkId;
    @Size(max = 40)
    @Column(name = "lob_policy_plan_name")
    private String lobPolicyPlanName;
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

    public TMMapLobPolicyPlan() {
    }

    public TMMapLobPolicyPlan(Integer mapLobPolicyPlanLinkId) {
        this.mapLobPolicyPlanLinkId = mapLobPolicyPlanLinkId;
    }

    public Integer getMapLobPolicyPlanLinkId() {
        return mapLobPolicyPlanLinkId;
    }

    public void setMapLobPolicyPlanLinkId(Integer mapLobPolicyPlanLinkId) {
        this.mapLobPolicyPlanLinkId = mapLobPolicyPlanLinkId;
    }

    public Integer getLobLinkId() {
        return lobLinkId;
    }

    public void setLobLinkId(Integer lobLinkId) {
        this.lobLinkId = lobLinkId;
    }

    public Integer getPolicyTypeLinkId() {
        return policyTypeLinkId;
    }

    public void setPolicyTypeLinkId(Integer policyTypeLinkId) {
        this.policyTypeLinkId = policyTypeLinkId;
    }

    public Integer getPlanMasterLinkId() {
        return planMasterLinkId;
    }

    public void setPlanMasterLinkId(Integer planMasterLinkId) {
        this.planMasterLinkId = planMasterLinkId;
    }

    public String getLobPolicyPlanName() {
        return lobPolicyPlanName;
    }

    public void setLobPolicyPlanName(String lobPolicyPlanName) {
        this.lobPolicyPlanName = lobPolicyPlanName;
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
        hash += (mapLobPolicyPlanLinkId != null ? mapLobPolicyPlanLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMMapLobPolicyPlan)) {
            return false;
        }
        TMMapLobPolicyPlan other = (TMMapLobPolicyPlan) object;
        if ((this.mapLobPolicyPlanLinkId == null && other.mapLobPolicyPlanLinkId != null) || (this.mapLobPolicyPlanLinkId != null && !this.mapLobPolicyPlanLinkId.equals(other.mapLobPolicyPlanLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMMapLobPolicyPlan[ mapLobPolicyPlanLinkId=" + mapLobPolicyPlanLinkId + " ]";
    }
    
}
