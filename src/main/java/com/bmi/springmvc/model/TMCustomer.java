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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ganesmad
 */
@Entity
@Table(name = "t_m_customer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMCustomer.findAll", query = "SELECT t FROM TMCustomer t")
    , @NamedQuery(name = "TMCustomer.findByCustomerLinkId", query = "SELECT t FROM TMCustomer t WHERE t.customerLinkId = :customerLinkId")
    , @NamedQuery(name = "TMCustomer.findByCustomerName", query = "SELECT t FROM TMCustomer t WHERE t.customerName = :customerName")
    , @NamedQuery(name = "TMCustomer.findByCustomerMobile", query = "SELECT t FROM TMCustomer t WHERE t.customerMobile = :customerMobile")
    , @NamedQuery(name = "TMCustomer.findByCustomerEmail", query = "SELECT t FROM TMCustomer t WHERE t.customerEmail = :customerEmail")})
public class TMCustomer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customer_link_id")
    private Integer customerLinkId;
    @Size(max = 50)
    @Column(name = "customer_name")
    private String customerName;
    @Size(max = 20)
    @Column(name = "customer_mobile")
    private String customerMobile;
    @Size(max = 100)
    @Column(name = "customer_email")
    private String customerEmail;

    public TMCustomer() {
    }

    public TMCustomer(Integer customerLinkId) {
        this.customerLinkId = customerLinkId;
    }

    public Integer getCustomerLinkId() {
        return customerLinkId;
    }

    public void setCustomerLinkId(Integer customerLinkId) {
        this.customerLinkId = customerLinkId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerLinkId != null ? customerLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMCustomer)) {
            return false;
        }
        TMCustomer other = (TMCustomer) object;
        if ((this.customerLinkId == null && other.customerLinkId != null) || (this.customerLinkId != null && !this.customerLinkId.equals(other.customerLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.TMCustomer[ customerLinkId=" + customerLinkId + " ]";
    }
    
}
