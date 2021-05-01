package com.india.crud.entity;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeDAO {

	private EntityManager entityManager;
	
	public EmployeeDAOImpl(EntityManager theentityManager){
		
		entityManager=theentityManager;
	}
	
	@Override
	public void saveTheData() {
		entityManager.persist(new );
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
