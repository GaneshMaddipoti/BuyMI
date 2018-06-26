package com.bmi.springmvc.service;

import java.util.List;
import java.util.Map;

import com.bmi.springmvc.model.TMVehicleMake;

public interface VehicleMakeService {


	public List<TMVehicleMake> findAllVehicleMakes();
	
	public Map<Integer, String> getAllVehicleMakeMap();
	
}
