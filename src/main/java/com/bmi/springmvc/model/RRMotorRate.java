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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ganesmad
 */
@Entity
@Table(name = "r_r_motor_rate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RRMotorRate.findAll", query = "SELECT r FROM RRMotorRate r")
    , @NamedQuery(name = "RRMotorRate.findByMotorRateLinkId", query = "SELECT r FROM RRMotorRate r WHERE r.motorRateLinkId = :motorRateLinkId")
    , @NamedQuery(name = "RRMotorRate.findByMapPlanCompanyLinkId", query = "SELECT r FROM RRMotorRate r WHERE r.mapPlanCompanyLinkId = :mapPlanCompanyLinkId")
    , @NamedQuery(name = "RRMotorRate.findByVehicleMinValue", query = "SELECT r FROM RRMotorRate r WHERE r.vehicleMinValue = :vehicleMinValue")
    , @NamedQuery(name = "RRMotorRate.findByVehicleMaxValue", query = "SELECT r FROM RRMotorRate r WHERE r.vehicleMaxValue = :vehicleMaxValue")
    , @NamedQuery(name = "RRMotorRate.findByNcdLinkId", query = "SELECT r FROM RRMotorRate r WHERE r.ncdLinkId = :ncdLinkId")
    , @NamedQuery(name = "RRMotorRate.findByIsBrandNew", query = "SELECT r FROM RRMotorRate r WHERE r.isBrandNew = :isBrandNew")
    , @NamedQuery(name = "RRMotorRate.findByBodyTypeLinkId", query = "SELECT r FROM RRMotorRate r WHERE r.bodyTypeLinkId = :bodyTypeLinkId")
    , @NamedQuery(name = "RRMotorRate.findByGender", query = "SELECT r FROM RRMotorRate r WHERE r.gender = :gender")
    , @NamedQuery(name = "RRMotorRate.findByDriverMinAge", query = "SELECT r FROM RRMotorRate r WHERE r.driverMinAge = :driverMinAge")
    , @NamedQuery(name = "RRMotorRate.findByDriverMaxAge", query = "SELECT r FROM RRMotorRate r WHERE r.driverMaxAge = :driverMaxAge")
    , @NamedQuery(name = "RRMotorRate.findByMinSeat", query = "SELECT r FROM RRMotorRate r WHERE r.minSeat = :minSeat")
    , @NamedQuery(name = "RRMotorRate.findByMaxSeat", query = "SELECT r FROM RRMotorRate r WHERE r.maxSeat = :maxSeat")
    , @NamedQuery(name = "RRMotorRate.findByBaseRate", query = "SELECT r FROM RRMotorRate r WHERE r.baseRate = :baseRate")
    , @NamedQuery(name = "RRMotorRate.findByEmiratiBaseRate", query = "SELECT r FROM RRMotorRate r WHERE r.emiratiBaseRate = :emiratiBaseRate")
    , @NamedQuery(name = "RRMotorRate.findByMinimumPremium", query = "SELECT r FROM RRMotorRate r WHERE r.minimumPremium = :minimumPremium")
    , @NamedQuery(name = "RRMotorRate.findByDeductible", query = "SELECT r FROM RRMotorRate r WHERE r.deductible = :deductible")
    , @NamedQuery(name = "RRMotorRate.findByInsuredType", query = "SELECT r FROM RRMotorRate r WHERE r.insuredType = :insuredType")
    , @NamedQuery(name = "RRMotorRate.findByValidUaeLicenseMin", query = "SELECT r FROM RRMotorRate r WHERE r.validUaeLicenseMin = :validUaeLicenseMin")
    , @NamedQuery(name = "RRMotorRate.findByValidUaeLicenseMax", query = "SELECT r FROM RRMotorRate r WHERE r.validUaeLicenseMax = :validUaeLicenseMax")
    , @NamedQuery(name = "RRMotorRate.findByFromDate", query = "SELECT r FROM RRMotorRate r WHERE r.fromDate = :fromDate")
    , @NamedQuery(name = "RRMotorRate.findByToDate", query = "SELECT r FROM RRMotorRate r WHERE r.toDate = :toDate")
    , @NamedQuery(name = "RRMotorRate.findByActive", query = "SELECT r FROM RRMotorRate r WHERE r.active = :active")
    , @NamedQuery(name = "RRMotorRate.findByVechicleAgeFrom", query = "SELECT r FROM RRMotorRate r WHERE r.vechicleAgeFrom = :vechicleAgeFrom")
    , @NamedQuery(name = "RRMotorRate.findByVechicleAgeTo", query = "SELECT r FROM RRMotorRate r WHERE r.vechicleAgeTo = :vechicleAgeTo")})
public class RRMotorRate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "motor_rate_link_id")
    private Integer motorRateLinkId;
    @Column(name = "map_plan_company_link_id")
    private Integer mapPlanCompanyLinkId;
    @Column(name = "vehicle_min_value")
    private Integer vehicleMinValue;
    @Column(name = "vehicle_max_value")
    private Integer vehicleMaxValue;
    @Column(name = "ncd_link_id")
    private Integer ncdLinkId;
    @Column(name = "is_brand_new")
    private Integer isBrandNew;
    @Column(name = "body_type_link_id")
    private Integer bodyTypeLinkId;
    @Size(max = 20)
    @Column(name = "gender")
    private String gender;
    @Column(name = "driver_min_age")
    private Integer driverMinAge;
    @Column(name = "driver_max_age")
    private Integer driverMaxAge;
    @Column(name = "min_seat")
    private Integer minSeat;
    @Column(name = "max_seat")
    private Integer maxSeat;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "base_rate")
    private Double baseRate;
    @Column(name = "emirati_base_rate")
    private Double emiratiBaseRate;
    @Column(name = "minimum_premium")
    private Integer minimumPremium;
    @Column(name = "deductible")
    private Integer deductible;
    @Size(max = 20)
    @Column(name = "insured_type")
    private String insuredType;
    @Column(name = "valid_uae_license_min")
    private Integer validUaeLicenseMin;
    @Column(name = "valid_uae_license_max")
    private Integer validUaeLicenseMax;
    @Column(name = "from_date")
    @Temporal(TemporalType.DATE)
    private Date fromDate;
    @Column(name = "to_date")
    @Temporal(TemporalType.DATE)
    private Date toDate;
    @Column(name = "active")
    private Integer active;
    @Column(name = "vechicle_age_from")
    private Integer vechicleAgeFrom;
    @Column(name = "vechicle_age_to")
    private Integer vechicleAgeTo;

    public RRMotorRate() {
    }

    public RRMotorRate(Integer motorRateLinkId) {
        this.motorRateLinkId = motorRateLinkId;
    }

    public Integer getMotorRateLinkId() {
        return motorRateLinkId;
    }

    public void setMotorRateLinkId(Integer motorRateLinkId) {
        this.motorRateLinkId = motorRateLinkId;
    }

    public Integer getMapPlanCompanyLinkId() {
        return mapPlanCompanyLinkId;
    }

    public void setMapPlanCompanyLinkId(Integer mapPlanCompanyLinkId) {
        this.mapPlanCompanyLinkId = mapPlanCompanyLinkId;
    }

    public Integer getVehicleMinValue() {
        return vehicleMinValue;
    }

    public void setVehicleMinValue(Integer vehicleMinValue) {
        this.vehicleMinValue = vehicleMinValue;
    }

    public Integer getVehicleMaxValue() {
        return vehicleMaxValue;
    }

    public void setVehicleMaxValue(Integer vehicleMaxValue) {
        this.vehicleMaxValue = vehicleMaxValue;
    }

    public Integer getNcdLinkId() {
        return ncdLinkId;
    }

    public void setNcdLinkId(Integer ncdLinkId) {
        this.ncdLinkId = ncdLinkId;
    }

    public Integer getIsBrandNew() {
        return isBrandNew;
    }

    public void setIsBrandNew(Integer isBrandNew) {
        this.isBrandNew = isBrandNew;
    }

    public Integer getBodyTypeLinkId() {
        return bodyTypeLinkId;
    }

    public void setBodyTypeLinkId(Integer bodyTypeLinkId) {
        this.bodyTypeLinkId = bodyTypeLinkId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getDriverMinAge() {
        return driverMinAge;
    }

    public void setDriverMinAge(Integer driverMinAge) {
        this.driverMinAge = driverMinAge;
    }

    public Integer getDriverMaxAge() {
        return driverMaxAge;
    }

    public void setDriverMaxAge(Integer driverMaxAge) {
        this.driverMaxAge = driverMaxAge;
    }

    public Integer getMinSeat() {
        return minSeat;
    }

    public void setMinSeat(Integer minSeat) {
        this.minSeat = minSeat;
    }

    public Integer getMaxSeat() {
        return maxSeat;
    }

    public void setMaxSeat(Integer maxSeat) {
        this.maxSeat = maxSeat;
    }

    public Double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(Double baseRate) {
        this.baseRate = baseRate;
    }

    public Double getEmiratiBaseRate() {
        return emiratiBaseRate;
    }

    public void setEmiratiBaseRate(Double emiratiBaseRate) {
        this.emiratiBaseRate = emiratiBaseRate;
    }

    public Integer getMinimumPremium() {
        return minimumPremium;
    }

    public void setMinimumPremium(Integer minimumPremium) {
        this.minimumPremium = minimumPremium;
    }

    public Integer getDeductible() {
        return deductible;
    }

    public void setDeductible(Integer deductible) {
        this.deductible = deductible;
    }

    public String getInsuredType() {
        return insuredType;
    }

    public void setInsuredType(String insuredType) {
        this.insuredType = insuredType;
    }

    public Integer getValidUaeLicenseMin() {
        return validUaeLicenseMin;
    }

    public void setValidUaeLicenseMin(Integer validUaeLicenseMin) {
        this.validUaeLicenseMin = validUaeLicenseMin;
    }

    public Integer getValidUaeLicenseMax() {
        return validUaeLicenseMax;
    }

    public void setValidUaeLicenseMax(Integer validUaeLicenseMax) {
        this.validUaeLicenseMax = validUaeLicenseMax;
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

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getVechicleAgeFrom() {
        return vechicleAgeFrom;
    }

    public void setVechicleAgeFrom(Integer vechicleAgeFrom) {
        this.vechicleAgeFrom = vechicleAgeFrom;
    }

    public Integer getVechicleAgeTo() {
        return vechicleAgeTo;
    }

    public void setVechicleAgeTo(Integer vechicleAgeTo) {
        this.vechicleAgeTo = vechicleAgeTo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (motorRateLinkId != null ? motorRateLinkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RRMotorRate)) {
            return false;
        }
        RRMotorRate other = (RRMotorRate) object;
        if ((this.motorRateLinkId == null && other.motorRateLinkId != null) || (this.motorRateLinkId != null && !this.motorRateLinkId.equals(other.motorRateLinkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "in.co.jtechy.ejb.mdb.beans1.RRMotorRate[ motorRateLinkId=" + motorRateLinkId + " ]";
    }
    
}
