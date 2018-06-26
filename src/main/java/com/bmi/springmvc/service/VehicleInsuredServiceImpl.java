package com.bmi.springmvc.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bmi.springmvc.dao.BankMortgageDAO;
import com.bmi.springmvc.dao.VehicleColorDAO;
import com.bmi.springmvc.dao.VehicleInsuredDAO;
import com.bmi.springmvc.dao.VehicleInsuredOptionalDAO;
import com.bmi.springmvc.model.TMBankMortgage;
import com.bmi.springmvc.model.TMVechicleInsured;
import com.bmi.springmvc.model.TMVechicleInsuredOptional;
import com.bmi.springmvc.model.TMVehicleColor;

@Service("vehicleInsuredService")
@Transactional
public class VehicleInsuredServiceImpl implements VehicleInsuredService {

	@Autowired
	private VehicleInsuredDAO dao;
	
	@Autowired
	private VehicleInsuredOptionalDAO optionalDAO;
	
	@Autowired
	private BankMortgageDAO bankMortgageDAO;
	
	@Autowired
	private VehicleColorDAO colorDAO;
			
	public TMVechicleInsured saveVehicleInsured(TMVechicleInsured vechicleInsured) {
		return dao.saveVehicleInsured(vechicleInsured);
	}
	
	public TMVechicleInsuredOptional saveVehicleInsuredOptional(TMVechicleInsuredOptional vechicleInsuredOptional) {
		return optionalDAO.saveVehicleInsuredOptional(vechicleInsuredOptional);
	}
	
	public List<TMBankMortgage> findAllBankMortgages() {
		return bankMortgageDAO.findAllBankMortgages();
	}
	
	public List<TMVehicleColor> findAllVehicleColors() {
		return colorDAO.findAllVehicleColors();
	}
	
	public Map<Integer, String> getAllBankMortgageMap(){
		Map<Integer, String> emiratesMap = new HashMap<>();
		for(TMBankMortgage bankMortgage : findAllBankMortgages()){
			emiratesMap.put(bankMortgage.getBankMortgageLinkId(), bankMortgage.getBankName());
		}
		return emiratesMap;
	}
	
	public Map<Integer, String> getAllVehicleColorMap(){
		Map<Integer, String> vehicleColorMap = new HashMap<>();
		for(TMVehicleColor vehicleColor : findAllVehicleColors()){
			vehicleColorMap.put(vehicleColor.getVehicleColorLinkId(), vehicleColor.getColorName());
		}
		return vehicleColorMap;
	}
	
}
