package com.bmi.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.bmi.springmvc.model.TMBankMortgage;

@Repository("bankMortgageDAO")
public class BankMortgageDAOImpl extends AbstractDao<Integer, TMBankMortgage> implements BankMortgageDAO{

	@SuppressWarnings("unchecked")
	public List<TMBankMortgage> findAllBankMortgages() {
		Criteria criteria = createEntityCriteria();
		return (List<TMBankMortgage>) criteria.list();
	}
	
	

}
