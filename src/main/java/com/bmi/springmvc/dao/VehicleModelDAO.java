package com.bmi.springmvc.dao;

import java.util.List;

import com.bmi.springmvc.model.TMVehicleModel;

public interface VehicleModelDAO {
	
	public List<TMVehicleModel> findAllVehicleModels();

}
