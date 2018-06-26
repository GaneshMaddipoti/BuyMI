package com.bmi.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bmi.springmvc.dao.MotorRateDAO;
import com.bmi.springmvc.model.RPlanBenefitsMapping;
import com.bmi.springmvc.model.RRMotorRate;
import com.bmi.springmvc.model.RRPlanLoadingDiscount;
import com.bmi.springmvc.model.TMBenefit;
import com.bmi.springmvc.model.TMMotorOwner;
import com.bmi.springmvc.model.TMPartners;
import com.bmi.springmvc.model.TMSystemConfiguration;
import com.bmi.springmvc.model.TMVechicleInsured;

@Service("motorRateService")
@Transactional
public class MotorRateServiceImpl implements MotorRateService {

	@Autowired
	private MotorRateDAO dao;
	
	public List<RRMotorRate> findAllMotorRates(){
		return dao.findAllMotorRates();
	}
	
	public List<RRMotorRate> getMotorRate(TMMotorOwner motorOwner, TMVechicleInsured vehicleInsured){
		return dao.getMotorRate(motorOwner, vehicleInsured);
	}
	
	public List<RPlanBenefitsMapping> getPlanBenifitMaps(RRMotorRate motorRate){
		return dao.getPlanBenifitMaps(motorRate);
	}
	
	public TMSystemConfiguration getSystemConfiguration(TMPartners company){
		return dao.getSystemConfiguration(company);
	}
	
	public RRPlanLoadingDiscount getLoadingDiscounts(RRMotorRate motorRate){
		return dao.getLoadingDiscounts(motorRate);
	}
	
	public TMPartners getPlanCompany(RRMotorRate motorRate){
		return dao.getPlanCompany(motorRate);
	}
	
}
