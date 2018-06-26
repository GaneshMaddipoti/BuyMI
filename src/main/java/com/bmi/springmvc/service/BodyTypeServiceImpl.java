package com.bmi.springmvc.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bmi.springmvc.dao.BodyTypeDAO;
import com.bmi.springmvc.model.TMBodyType;

@Service("bodyTypeService")
@Transactional
public class BodyTypeServiceImpl implements BodyTypeService {

	@Autowired
	private BodyTypeDAO dao;
	
	public List<TMBodyType> findAllBodyTypes() {
		return dao.findAllBodyTypes();
	}
	
	public Map<Integer, String> getAllBodyTypeMap(){
		Map<Integer, String> bodyTypeMap = new HashMap<>();
		for(TMBodyType bodyType : findAllBodyTypes()){
			bodyTypeMap.put(bodyType.getBodyTypeLinkId(), bodyType.getBodyTypeName());
		}
		return bodyTypeMap;
	}
	
}
