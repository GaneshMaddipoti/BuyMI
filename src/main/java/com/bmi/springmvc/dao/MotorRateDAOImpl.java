package com.bmi.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.bmi.springmvc.model.RPlanBenefitsMapping;
import com.bmi.springmvc.model.RRMapPlanCompany;
import com.bmi.springmvc.model.RRMotorRate;
import com.bmi.springmvc.model.RRPlanLoadingDiscount;
import com.bmi.springmvc.model.TMBenefit;
import com.bmi.springmvc.model.TMMotorOwner;
import com.bmi.springmvc.model.TMPartners;
import com.bmi.springmvc.model.TMSystemConfiguration;
import com.bmi.springmvc.model.TMVechicleInsured;

@Repository("motorRateDAO")
public class MotorRateDAOImpl extends AbstractDao<Integer, RRMotorRate> implements MotorRateDAO {

	@SuppressWarnings("unchecked")
	public List<RRMotorRate> findAllMotorRates() {
		Criteria criteria = createEntityCriteria();
		return (List<RRMotorRate>) criteria.list();
	}

	@SuppressWarnings("unchecked")
	public List<RRMotorRate> getMotorRate(TMMotorOwner motorOwner, TMVechicleInsured vehicleInsured) {
		Criteria criteria = createEntityCriteria();

//		criteria.add(Restrictions.eq("gender", motorOwner.getInsuredGender()));
//
//		criteria.add(Restrictions.le("driverMinAge", motorOwner.getAge()));
//		criteria.add(Restrictions.ge("driverMaxAge", motorOwner.getAge()));
//
//		criteria.add(Restrictions.eq("bodyTypeLinkId", vehicleInsured.getBodyTypeLinkId()));

		criteria.add(Restrictions.le("vehicleMinValue", vehicleInsured.getSumInsured()));
		criteria.add(Restrictions.ge("vehicleMaxValue", vehicleInsured.getSumInsured()));

//		criteria.add(Restrictions.le("vechicleAgeFrom", vehicleInsured.getAge()));
//		criteria.add(Restrictions.ge("vechicleAgeTo", vehicleInsured.getAge()));
//
//		criteria.add(Restrictions.le("minSeat", vehicleInsured.getNoPassenger()));
//		criteria.add(Restrictions.ge("maxSeat", vehicleInsured.getNoPassenger()));
//
//		criteria.add(Restrictions.le("validUaeLicenseMin", motorOwner.getAgeDrivingLicence()));
//		criteria.add(Restrictions.ge("validUaeLicenseMax", motorOwner.getAgeDrivingLicence()));

		return (List<RRMotorRate>) criteria.list();
	}

	public List<RPlanBenefitsMapping> getPlanBenifitMaps(RRMotorRate motorRate) {
		String queryString = "select planBenifit from RRMotorRate motorRate, RPlanBenefitsMapping planBenifit"
				+ " where motorRate.motorRateLinkId = " + motorRate.getMotorRateLinkId()
				+ " and motorRate.mapPlanCompanyLinkId = planBenifit.mapPlanCompanyLinkId and motorRate.mapPlanCompanyLinkId = "
				+ motorRate.getMapPlanCompanyLinkId();
		return getSession().createQuery(queryString).list();
	}

	public TMSystemConfiguration getSystemConfiguration(TMPartners company) {
		Criteria criteria = createEntityCriteria(TMSystemConfiguration.class);
		criteria.add(Restrictions.eq("insurancecompanyLinkId", company.getPartnersLinkId()));
		criteria.add(Restrictions.eq("configurationValueType", "DISPLAY_ORDER"));
		List resultSet = criteria.list();
		if (resultSet != null && !resultSet.isEmpty()) {
			return (TMSystemConfiguration) resultSet.get(0);
		}
		return null;
	}

	public TMPartners getPlanCompany(RRMotorRate motorRate) {
		String queryString = "select company from RRMotorRate motorRate, RRMapPlanCompany planCompany, TMPartners company"
				+ " where motorRate.mapPlanCompanyLinkId = planCompany.mapPlanCompanyLinkId and planCompany.insuranceCompanyId = "
				+ " company.partnersLinkId and motorRate.mapPlanCompanyLinkId = " + motorRate.getMapPlanCompanyLinkId();
		List resultSet = getSession().createQuery(queryString).list();
		return (resultSet != null) ? (TMPartners) resultSet.get(0) : null;
	}
	
	public RRPlanLoadingDiscount getLoadingDiscounts(RRMotorRate motorRate) {
		String queryString = "select loadingDiscount from RRMotorRate motorRate, RRPlanLoadingDiscount loadingDiscount"
				+ " where motorRate.mapPlanCompanyLinkId = loadingDiscount.mapPlanCompanyLinkId ";
		List resultSet = getSession().createQuery(queryString).list();
		return (resultSet != null) ? (RRPlanLoadingDiscount) resultSet.get(0) : null;
	}

}
