package com.bmi.springmvc.service;

import java.util.List;
import java.util.Map;

import com.bmi.springmvc.model.TMVehicleModel;

public interface VehicleModelService {


	public List<TMVehicleModel> findAllVehicleModels();
	
	public Map<Integer, String> getAllVehicleModelMap();
	
}
