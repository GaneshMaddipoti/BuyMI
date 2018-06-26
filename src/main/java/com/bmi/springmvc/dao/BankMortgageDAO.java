package com.bmi.springmvc.dao;

import java.util.List;

import com.bmi.springmvc.model.TMBankMortgage;

public interface BankMortgageDAO {
	
	List<TMBankMortgage> findAllBankMortgages();

}
