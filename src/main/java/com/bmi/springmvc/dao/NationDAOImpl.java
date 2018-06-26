package com.bmi.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.bmi.springmvc.model.TMNationality;

@Repository("nationDAO")
public class NationDAOImpl extends AbstractDao<Integer, TMNationality> implements NationDAO{

	@SuppressWarnings("unchecked")
	public List<TMNationality> findAllNations() {
		Criteria criteria = createEntityCriteria();
		return (List<TMNationality>) criteria.list();
	}

}
