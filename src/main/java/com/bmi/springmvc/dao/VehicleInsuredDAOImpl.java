package com.bmi.springmvc.dao;

import org.springframework.stereotype.Repository;

import com.bmi.springmvc.model.TMVechicleInsured;

@Repository("vehicleInsuredDAO")
public class VehicleInsuredDAOImpl extends AbstractDao<Integer, TMVechicleInsured> implements VehicleInsuredDAO{

	public TMVechicleInsured saveVehicleInsured(TMVechicleInsured vechicleInsured) {
		return merge(vechicleInsured);
	}

}
