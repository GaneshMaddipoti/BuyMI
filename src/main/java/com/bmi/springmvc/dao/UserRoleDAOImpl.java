package com.bmi.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.bmi.springmvc.model.TMUserRole;

@Repository("userRoleDAO")
public class UserRoleDAOImpl extends AbstractDao<Integer, TMUserRole> implements UserRoleDAO {

	@SuppressWarnings("unchecked")
	public List<TMUserRole> findAllUserRoles() {
		Criteria criteria = createEntityCriteria();
		return (List<TMUserRole>) criteria.list();
	}

}
