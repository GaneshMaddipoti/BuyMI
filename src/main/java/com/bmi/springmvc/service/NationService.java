package com.bmi.springmvc.service;

import java.util.List;
import java.util.Map;

import com.bmi.springmvc.model.TMNationality;

public interface NationService {


	public List<TMNationality> findAllNations();
	
	public Map<Integer, String> getAllNationsMap();	
	
}
