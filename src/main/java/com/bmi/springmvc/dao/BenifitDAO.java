package com.bmi.springmvc.dao;

import java.util.List;

import com.bmi.springmvc.model.TMBenefit;

public interface BenifitDAO {
	
	public List<TMBenefit> findAllBenifits();

}
