package com.bmi.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bmi.springmvc.dao.BenifitDAO;
import com.bmi.springmvc.dao.BodyTypeDAO;
import com.bmi.springmvc.model.TMBenefit;
import com.bmi.springmvc.model.TMBodyType;

@Service("benifitService")
@Transactional
public class BenifitServiceImpl implements BenifitService {

	@Autowired
	private BenifitDAO dao;
	
	public List<TMBenefit> findAllBenifits() {
		return dao.findAllBenifits();
	}
	
}
