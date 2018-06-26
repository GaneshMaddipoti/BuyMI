package com.bmi.springmvc.dao;

import java.util.List;

import com.bmi.springmvc.model.TMPlanMaster;

public interface PlanMasterDAO {
	
	public List<TMPlanMaster> findAllPlanMasters();

}
