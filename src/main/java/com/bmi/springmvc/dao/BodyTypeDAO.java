package com.bmi.springmvc.dao;

import java.util.List;

import com.bmi.springmvc.model.TMBodyType;

public interface BodyTypeDAO {
	
	public List<TMBodyType> findAllBodyTypes();

}
