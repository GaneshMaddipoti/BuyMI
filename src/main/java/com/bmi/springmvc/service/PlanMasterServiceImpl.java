package com.bmi.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bmi.springmvc.dao.PlanMasterDAO;
import com.bmi.springmvc.model.TMPlanMaster;

@Service("planMasterService")
@Transactional
public class PlanMasterServiceImpl implements PlanMasterService {

	@Autowired
	private PlanMasterDAO dao;
	
	public List<TMPlanMaster> findAllPlanMasters(){
		return dao.findAllPlanMasters();
	}
	
}
