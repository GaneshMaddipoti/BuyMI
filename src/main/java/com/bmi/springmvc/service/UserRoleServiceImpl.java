package com.bmi.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bmi.springmvc.dao.UserRoleDAO;
import com.bmi.springmvc.model.TMUserRole;

@Service("userRoleService")
@Transactional
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	private UserRoleDAO dao;
	
	public List<TMUserRole> findAllUserRoles() {
		return dao.findAllUserRoles();
	}
	
}
