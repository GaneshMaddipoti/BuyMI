package com.bmi.springmvc.dao;

import java.util.List;

import com.bmi.springmvc.model.TMPartners;

public interface PartnerDAO {

	List<TMPartners> findAllPartners();

}
