package com.bmi.springmvc.service;

import java.util.List;
import java.util.Map;

import com.bmi.springmvc.model.TMVechicleInsured;
import com.bmi.springmvc.model.TMVechicleInsuredOptional;
import com.bmi.springmvc.model.TMVehicleColor;

public interface VehicleInsuredService {

	public TMVechicleInsured saveVehicleInsured(TMVechicleInsured vechicleInsured);
	
	public TMVechicleInsuredOptional saveVehicleInsuredOptional(TMVechicleInsuredOptional vechicleInsuredOptional);
	
	public Map<Integer, String> getAllBankMortgageMap();
	
	public Map<Integer, String> getAllVehicleColorMap();
	
}
