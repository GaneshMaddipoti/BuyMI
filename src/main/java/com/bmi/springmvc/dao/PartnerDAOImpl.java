package com.bmi.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.bmi.springmvc.model.TMPartners;

@Repository("partnerDAO")
public class PartnerDAOImpl extends AbstractDao<Integer, TMPartners> implements PartnerDAO {

	@SuppressWarnings("unchecked")
	public List<TMPartners> findAllPartners() {
		Criteria criteria = createEntityCriteria();
		return (List<TMPartners>) criteria.list();
	}

}
