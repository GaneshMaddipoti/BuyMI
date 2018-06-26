package com.bmi.springmvc.dao;

import java.util.List;

import com.bmi.springmvc.model.TMPartners;
import com.bmi.springmvc.model.TMUserRole;

public interface UserRoleDAO {

	List<TMUserRole> findAllUserRoles();

}
