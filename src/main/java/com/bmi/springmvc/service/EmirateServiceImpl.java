package com.bmi.springmvc.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bmi.springmvc.dao.EmiratesDAO;
import com.bmi.springmvc.model.TMEmirates;

@Service("emirateService")
@Transactional
public class EmirateServiceImpl implements EmirateService {

	@Autowired
	private EmiratesDAO dao;
	
	public List<TMEmirates> findAllEmirates() {
		return dao.findAllEmirates();
	}
	
	public Map<Integer, String> getAllVehicleMakeMap(){
		Map<Integer, String> emiratesMap = new HashMap<>();
		for(TMEmirates emirates : findAllEmirates()){
			emiratesMap.put(emirates.getEmirateLinkId(), emirates.getEmirateName());
		}
		return emiratesMap;
	}
	
}
