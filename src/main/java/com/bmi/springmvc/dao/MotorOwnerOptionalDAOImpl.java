package com.bmi.springmvc.dao;

import org.springframework.stereotype.Repository;

import com.bmi.springmvc.model.TMMotorOwnerOptional;

@Repository("motorOwnerOptionalDAO")
public class MotorOwnerOptionalDAOImpl extends AbstractDao<Integer, TMMotorOwnerOptional> implements MotorOwnerOptionalDAO{

	public TMMotorOwnerOptional saveMotorOwnerOptional(TMMotorOwnerOptional motorOwnerOptional) {
		return merge(motorOwnerOptional);
	}

}
