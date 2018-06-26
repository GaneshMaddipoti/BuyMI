package com.bmi.springmvc.dao;

import org.springframework.stereotype.Repository;

import com.bmi.springmvc.model.TMVechicleInsuredOptional;

@Repository("vehicleInsuredOptionalDAO")
public class VehicleInsuredOptionalDAOImpl extends AbstractDao<Integer, TMVechicleInsuredOptional> implements VehicleInsuredOptionalDAO{

	public TMVechicleInsuredOptional saveVehicleInsuredOptional(TMVechicleInsuredOptional vechicleInsuredOptional) {
		return merge(vechicleInsuredOptional);
	}

}
