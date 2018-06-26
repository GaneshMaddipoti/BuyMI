package com.bmi.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.bmi.springmvc.model.TMBodyType;

@Repository("bodyTypeDAO")
public class BodyTypeDAOImpl extends AbstractDao<Integer, TMBodyType> implements BodyTypeDAO{

	@SuppressWarnings("unchecked")
	public List<TMBodyType> findAllBodyTypes() {
		Criteria criteria = createEntityCriteria();
		return (List<TMBodyType>) criteria.list();
	}
	
	

}
