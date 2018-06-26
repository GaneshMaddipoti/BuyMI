package com.bmi.springmvc.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bmi.springmvc.dao.VehicleMakeDAO;
import com.bmi.springmvc.model.TMVehicleMake;

@Service("vehicleMakeService")
@Transactional
public class VehicleMakeServiceImpl implements VehicleMakeService {

	@Autowired
	private VehicleMakeDAO dao;

	private Map<Integer, String> vehicleMakeMap;

	public List<TMVehicleMake> findAllVehicleMakes() {
		return dao.findAllVehicleMakes();
	}

	public Map<Integer, String> getAllVehicleMakeMap() {
		if (vehicleMakeMap == null) {
			vehicleMakeMap = new HashMap<>();
			for (TMVehicleMake vehicleMake : findAllVehicleMakes()) {
				vehicleMakeMap.put(vehicleMake.getVehicleMakeLinkId(), vehicleMake.getVehicleMakeName());
			}
		}
		return vehicleMakeMap;
	}

}
