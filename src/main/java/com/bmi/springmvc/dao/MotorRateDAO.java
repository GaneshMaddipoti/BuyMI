package com.bmi.springmvc.dao;

import java.util.List;

import com.bmi.springmvc.model.RPlanBenefitsMapping;
import com.bmi.springmvc.model.RRMotorRate;
import com.bmi.springmvc.model.RRPlanLoadingDiscount;
import com.bmi.springmvc.model.TMBenefit;
import com.bmi.springmvc.model.TMMotorOwner;
import com.bmi.springmvc.model.TMPartners;
import com.bmi.springmvc.model.TMSystemConfiguration;
import com.bmi.springmvc.model.TMVechicleInsured;

public interface MotorRateDAO {
	
	public List<RRMotorRate> findAllMotorRates();
	
	public List<RRMotorRate> getMotorRate(TMMotorOwner motorOwner, TMVechicleInsured vehicleInsured);
	
	public List<RPlanBenefitsMapping> getPlanBenifitMaps(RRMotorRate motorRate);
	
	public TMSystemConfiguration getSystemConfiguration(TMPartners company);
	
	public RRPlanLoadingDiscount getLoadingDiscounts(RRMotorRate motorRate);
	
	public TMPartners getPlanCompany(RRMotorRate motorRate);

}
