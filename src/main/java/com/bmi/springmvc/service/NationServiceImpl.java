package com.bmi.springmvc.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bmi.springmvc.dao.NationDAO;
import com.bmi.springmvc.model.TMNationality;

@Service("nationService")
@Transactional
public class NationServiceImpl implements NationService {

	@Autowired
	private NationDAO dao;
	
	public List<TMNationality> findAllNations() {
		return dao.findAllNations();
	}
	
	public Map<Integer, String> getAllNationsMap(){
		Map<Integer, String> nations = new HashMap<>();
		for(TMNationality nationality : findAllNations()){
			nations.put(nationality.getNationalityLinkId(), nationality.getNation());
		}
		return nations;
	}
	
}
