package com.bmi.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.bmi.springmvc.model.TMVehicleColor;

@Repository("vehicleColorDAO")
public class VehicleColorDAOImpl extends AbstractDao<Integer, TMVehicleColor> implements VehicleColorDAO{

	@SuppressWarnings("unchecked")
	public List<TMVehicleColor> findAllVehicleColors() {
		Criteria criteria = createEntityCriteria();
		return (List<TMVehicleColor>) criteria.list();
	}
	
	

}
