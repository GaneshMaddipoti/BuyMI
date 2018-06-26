package com.bmi.springmvc.dao;

import java.util.List;

import com.bmi.springmvc.model.TMVehicleColor;

public interface VehicleColorDAO {
	
	public List<TMVehicleColor> findAllVehicleColors();

}
