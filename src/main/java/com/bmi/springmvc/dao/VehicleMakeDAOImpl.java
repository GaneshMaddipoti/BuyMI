package com.bmi.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.bmi.springmvc.model.TMVehicleMake;

@Repository("vehicleMakeDAO")
public class VehicleMakeDAOImpl extends AbstractDao<Integer, TMVehicleMake> implements VehicleMakeDAO{

	@SuppressWarnings("unchecked")
	public List<TMVehicleMake> findAllVehicleMakes() {
		Criteria criteria = createEntityCriteria();
		return (List<TMVehicleMake>) criteria.list();
	}
	
	

}
