package com.bmi.springmvc.dao;

import java.util.List;

import com.bmi.springmvc.model.TMNationality;

public interface NationDAO {
	
	public List<TMNationality> findAllNations();

}
