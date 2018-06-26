package com.bmi.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bmi.springmvc.dao.PartnerDAO;
import com.bmi.springmvc.model.TMPartners;

@Service("partnerService")
@Transactional
public class PartnerServiceImpl implements PartnerService {

	@Autowired
	private PartnerDAO dao;
	
	public List<TMPartners> findAllPartners() {
		return dao.findAllPartners();
	}

}
