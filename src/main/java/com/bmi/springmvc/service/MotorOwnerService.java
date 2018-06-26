package com.bmi.springmvc.service;

import com.bmi.springmvc.model.TMMotorOwner;
import com.bmi.springmvc.model.TMMotorOwnerOptional;

public interface MotorOwnerService {

	public TMMotorOwner saveMotorOwner(TMMotorOwner motorOwner);
	
	public TMMotorOwnerOptional saveMotorOwnerOptional(TMMotorOwnerOptional motorOwnerOptional);
	
}
