package com.bmi.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.bmi.springmvc.model.TMBenefit;

@Repository("benifitDAO")
public class BenifitDAOImpl extends AbstractDao<Integer, TMBenefit> implements BenifitDAO{

	@SuppressWarnings("unchecked")
	public List<TMBenefit> findAllBenifits() {
		Criteria criteria = createEntityCriteria();
		return (List<TMBenefit>) criteria.list();
	}
	
	

}
