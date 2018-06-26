package com.bmi.springmvc.dao;

import java.util.List;

import com.bmi.springmvc.model.TMVehicleMake;

public interface VehicleMakeDAO {
	
	public List<TMVehicleMake> findAllVehicleMakes();

}
