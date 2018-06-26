package com.bmi.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.bmi.springmvc.model.TMEmirates;
import com.bmi.springmvc.model.TMPlanMaster;

@Repository("planMasterDAO")
public class PlanMasterDAOImpl extends AbstractDao<Integer, TMPlanMaster> implements PlanMasterDAO{

	@SuppressWarnings("unchecked")
	public List<TMPlanMaster> findAllPlanMasters() {
		Criteria criteria = createEntityCriteria();
		return (List<TMPlanMaster>) criteria.list();
	}
	
	

}
