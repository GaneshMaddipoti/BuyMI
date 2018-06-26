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
@Table(name = "t_t_wc_insured_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTWcInsuredDetails.findAll", query = "SELECT t FROM TTWcInsuredDetails t")
    , @NamedQuery(name = "TTWcInsuredDetails.findByWcInsuredLinkId", query = "SELECT t FROM TTWcInsuredDetails t WHERE t.wcInsuredLinkId = :wcInsuredLinkId")
    , @NamedQuery(name = "TTWcInsuredDetails.findByEmpName", query = "SELECT t FROM TTWcInsuredDetails t WHERE t.empName = :empName")
    , @NamedQuery(name = "TTWcInsuredDetails.findByEmpDob", query = "SELECT t FROM TTWcInsuredDetails t WHERE t.empDob = :empDob")
    , @NamedQuery(name = "TTWcInsuredDetails.findByEmpMonthSalary", query = "SELECT t FROM TTWcInsuredDetails t WHERE t.empMonthSalary = :empMonthSalary")})
public class TTWcInsuredDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "wc_insured_link_id")
    private Integer wcInsuredLinkId;
    @Size(max = 50)
    @Column(name = "emp_name")
    private String empName;
    @Column(name = "emp_dob")
    @Temporal(TemporalType.DATE)
    private Date empDob;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "emp_month_salary")
    private Double empMonthSalary;
    @JoinColumn(name = "wc_owner_link_id", referencedColumnName = "wc_owner_linkid")
    @ManyToOne
    private TTWcOwner wcOwnerLinkId;
    @JoinColumn(name = "wc_job_category_link_id", referencedColumnName = "job_category_link_id")
    @ManyToOne
    private TMWcJobCategory wcJobCategoryLinkId;

    public TTWcInsuredDetails() {
    }

    public TTWcInsuredDetails(Integer wcInsuredLinkId) {
        this.wcInsuredLinkId = wcInsuredLinkId;
    }

    public Integer getWcInsuredLinkId() {
        return wcInsuredLinkId;
    }

    public void setWcInsuredLinkId(Integer wcInsuredLinkId) {
        this.wcInsuredLinkId = wcInsuredLinkId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDob() {
        return empDob;
    }

    public void setEmpDob(Date empDob) {
        this.empDob = empDob;
    }

    public Double getEmpMonthSalary() {
        return empMonthSalary;
    }

    public void setEmpMonthSalary(Double empMonthSalary) {
        this.empMonthSalary = empMonthSalary;
    }

    public TTWcOwner getWcOwnerLinkId() {
        return wcOwnerLinkId;
    }

    public void setWcOwnerLinkId(TTWcOwner wcOwnerLinkId) {
        this.wcOwnerLinkId = wcOwnerLinkId;
    }

    public TMWcJobCategory getWcJobCategoryLinkId() {
        return wcJobCategoryLinkId;
    }

    public void setWcJobCategoryLinkId(TMWcJobCategory wcJobCategoryLinkId) {
        this.wcJobCategoryLinkId = wcJobCategoryLinkId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wcInsuredLinkId != null ? wcInsuredLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTWcInsuredDetails)) {
            return false;
        }
        TTWcInsuredDetails other = (TTWcInsuredDetails) object;
        if ((this.wcInsuredLinkId == null && other.wcInsuredLinkId != null) || (this.wcInsuredLinkId != null && !this.wcInsuredLinkId.equals(other.wcInsuredLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TTWcInsuredDetails[ wcInsuredLinkId=" + wcInsuredLinkId + " ]";
    }
    
}
