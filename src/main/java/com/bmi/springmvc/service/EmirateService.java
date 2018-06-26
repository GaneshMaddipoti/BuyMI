package com.bmi.springmvc.service;

import java.util.List;
import java.util.Map;

import com.bmi.springmvc.model.TMEmirates;

public interface EmirateService {


	public List<TMEmirates> findAllEmirates(); 
	
	public Map<Integer, String> getAllVehicleMakeMap();
	
}
