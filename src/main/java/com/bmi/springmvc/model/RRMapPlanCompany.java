/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmi.springmvc.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ganesmad
 */
@Entity
@Table(name = "r_r_map_plan_company")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RRMapPlanCompany.findAll", query = "SELECT r FROM RRMapPlanCompany r")
    , @NamedQuery(name = "RRMapPlanCompany.findByMapPlanCompanyLinkId", query = "SELECT r FROM RRMapPlanCompany r WHERE r.mapPlanCompanyLinkId = :mapPlanCompanyLinkId")
    , @NamedQuery(name = "RRMapPlanCompany.findByMapLobPolicyPlanLinkId", query = "SELECT r FROM RRMapPlanCompany r WHERE r.mapLobPolicyPlanLinkId = :mapLobPolicyPlanLinkId")
    , @NamedQuery(name = "RRMapPlanCompany.findByInsuranceCompanyId", query = "SELECT r FROM RRMapPlanCompany r WHERE r.insuranceCompanyId = :insuranceCompanyId")
    , @NamedQuery(name = "RRMapPlanCompany.findByBrokerId", query = "SELECT r FROM RRMapPlanCompany r WHERE r.brokerId = :brokerId")
    , @NamedQuery(name = "RRMapPlanCompany.findByActive", query = "SELECT r FROM RRMapPlanCompany r WHERE r.active = :active")})
public class RRMapPlanCompany implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "map_plan_company_link_id")
    private Integer mapPlanCompanyLinkId;
    @Column(name = "map_lob_policy_plan_link_id")
    private Integer mapLobPolicyPlanLinkId;
    @Column(name = "insurance_company_id")
    private Integer insuranceCompanyId;
    @Column(name = "broker_id")
    private Integer brokerId;
    @Column(name = "active")
    private Integer active;

    public RRMapPlanCompany() {
    }

    public RRMapPlanCompany(Integer mapPlanCompanyLinkId) {
        this.mapPlanCompanyLinkId = mapPlanCompanyLinkId;
    }

    public Integer getMapPlanCompanyLinkId() {
        return mapPlanCompanyLinkId;
    }

    public void setMapPlanCompanyLinkId(Integer mapPlanCompanyLinkId) {
        this.mapPlanCompanyLinkId = mapPlanCompanyLinkId;
    }

    public Integer getMapLobPolicyPlanLinkId() {
        return mapLobPolicyPlanLinkId;
    }

    public void setMapLobPolicyPlanLinkId(Integer mapLobPolicyPlanLinkId) {
        this.mapLobPolicyPlanLinkId = mapLobPolicyPlanLinkId;
    }

    public Integer getInsuranceCompanyId() {
        return insuranceCompanyId;
    }

    public void setInsuranceCompanyId(Integer insuranceCompanyId) {
        this.insuranceCompanyId = insuranceCompanyId;
    }

    public Integer getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(Integer brokerId) {
        this.brokerId = brokerId;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mapPlanCompanyLinkId != null ? mapPlanCompanyLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RRMapPlanCompany)) {
            return false;
        }
        RRMapPlanCompany other = (RRMapPlanCompany) object;
        if ((this.mapPlanCompanyLinkId == null && other.mapPlanCompanyLinkId != null) || (this.mapPlanCompanyLinkId != null && !this.mapPlanCompanyLinkId.equals(other.mapPlanCompanyLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.RRMapPlanCompany[ mapPlanCompanyLinkId=" + mapPlanCompanyLinkId + " ]";
    }
    
}
