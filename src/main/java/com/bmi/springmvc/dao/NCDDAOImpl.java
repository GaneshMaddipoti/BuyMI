package com.bmi.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.bmi.springmvc.model.TMNcd;

@Repository("ncdDAO")
public class NCDDAOImpl extends AbstractDao<Integer, TMNcd> implements NCDDAO{

	@SuppressWarnings("unchecked")
	public List<TMNcd> findAllNCD() {
		Criteria criteria = createEntityCriteria();
		return (List<TMNcd>) criteria.list();
	}

}
