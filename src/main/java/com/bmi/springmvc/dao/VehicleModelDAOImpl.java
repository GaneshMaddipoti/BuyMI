package com.bmi.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.bmi.springmvc.model.TMVehicleMake;
import com.bmi.springmvc.model.TMVehicleModel;

@Repository("vehicleModelDAO")
public class VehicleModelDAOImpl extends AbstractDao<Integer, TMVehicleModel> implements VehicleModelDAO{

	@SuppressWarnings("unchecked")
	public List<TMVehicleModel> findAllVehicleModels() {
		Criteria criteria = createEntityCriteria();
		return (List<TMVehicleModel>) criteria.list();
	}
	
	

}
