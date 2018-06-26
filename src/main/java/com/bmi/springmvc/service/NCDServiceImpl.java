package com.bmi.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bmi.springmvc.dao.NCDDAO;
import com.bmi.springmvc.model.TMNcd;

@Service("ncdService")
@Transactional
public class NCDServiceImpl implements NCDService {

	@Autowired
	private NCDDAO dao;
	
	public List<TMNcd> findAllNCD(){
		return dao.findAllNCD();
	}
	
}
