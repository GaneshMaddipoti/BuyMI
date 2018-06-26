package com.bmi.springmvc.service;

import java.util.List;

import com.bmi.springmvc.model.TMPartners;
import com.bmi.springmvc.model.TMUserRole;

public interface UserRoleService {


	List<TMUserRole> findAllUserRoles(); 
	
}
