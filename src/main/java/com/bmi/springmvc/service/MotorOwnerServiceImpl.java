package com.bmi.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bmi.springmvc.dao.MotorOwnerDAO;
import com.bmi.springmvc.dao.MotorOwnerOptionalDAO;
import com.bmi.springmvc.model.TMMotorOwner;
import com.bmi.springmvc.model.TMMotorOwnerOptional;

@Service("motorOwnerService")
@Transactional
public class MotorOwnerServiceImpl implements MotorOwnerService {

	@Autowired
	private MotorOwnerDAO dao;
	
	@Autowired
	private MotorOwnerOptionalDAO optionalDao;
	
	public TMMotorOwner saveMotorOwner(TMMotorOwner motorOwner) {
		return dao.saveMotorOwner(motorOwner);
	}
	
	public TMMotorOwnerOptional saveMotorOwnerOptional(TMMotorOwnerOptional motorOwnerOptional) {
		return optionalDao.saveMotorOwnerOptional(motorOwnerOptional);
	}
	
}
