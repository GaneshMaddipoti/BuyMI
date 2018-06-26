package com.bmi.springmvc.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bmi.springmvc.dao.VehicleModelDAO;
import com.bmi.springmvc.model.TMVehicleModel;

@Service("vehicleModelService")
@Transactional
public class VehicleModelServiceImpl implements VehicleModelService {

	@Autowired
	private VehicleModelDAO dao;
	private Map<Integer, String> vehicleModelMap;

	public List<TMVehicleModel> findAllVehicleModels() {
		return dao.findAllVehicleModels();
	}

	public Map<Integer, String> getAllVehicleModelMap() {
		if (vehicleModelMap == null) {
			vehicleModelMap = new HashMap<>();
			for (TMVehicleModel vehicleModel : findAllVehicleModels()) {
				vehicleModelMap.put(vehicleModel.getVehicleModelLinkId(), vehicleModel.getVehicleModelName());
			}
		}
		return vehicleModelMap;
	}

}
