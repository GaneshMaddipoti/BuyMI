package com.bmi.springmvc.dao;

import java.io.Serializable;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao<PK extends Serializable, T> {
	
	private final Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		this.persistentClass =(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}
	
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public T getByKey(PK key) {
		return (T) getSession().get(persistentClass, key);
	}

	public void persist(T entity) {
		getSession().persist(entity);
	}
	
	public T merge(T entity) {
		return (T)getSession().merge(entity);
	}

	public void delete(T entity) {
		getSession().delete(entity);
	}
	
	public Criteria createEntityCriteria(){
		return getSession().createCriteria(persistentClass);
	}
	
	public Criteria createEntityCriteria(Class persistClass){
		return getSession().createCriteria(persistClass);
	}

}
