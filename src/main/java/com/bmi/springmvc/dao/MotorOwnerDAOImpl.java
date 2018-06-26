package com.bmi.springmvc.dao;

import org.springframework.stereotype.Repository;

import com.bmi.springmvc.model.TMMotorOwner;

@Repository("motorOwnerDAO")
public class MotorOwnerDAOImpl extends AbstractDao<Integer, TMMotorOwner> implements MotorOwnerDAO{

	public TMMotorOwner saveMotorOwner(TMMotorOwner motorOwner) {
		return merge(motorOwner);
	}
	
}
