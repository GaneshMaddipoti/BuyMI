package com.bmi.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.bmi.springmvc.model.TMEmirates;

@Repository("emiratesDAO")
public class EmiratesDAOImpl extends AbstractDao<Integer, TMEmirates> implements EmiratesDAO{

	@SuppressWarnings("unchecked")
	public List<TMEmirates> findAllEmirates() {
		Criteria criteria = createEntityCriteria();
		return (List<TMEmirates>) criteria.list();
	}
	
	

}
