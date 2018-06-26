package com.bmi.springmvc.service;

import java.util.List;
import java.util.Map;

import com.bmi.springmvc.model.TMBodyType;

public interface BodyTypeService {


	public List<TMBodyType> findAllBodyTypes();
	
	public Map<Integer, String> getAllBodyTypeMap();
	
}
