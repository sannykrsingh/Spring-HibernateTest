package com.india.MyFirstSpringBoot;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpHib implements EmployeDAO {

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOImpHib(EntityManager theentityManager){
		entityManager=theentityManager;
	}
	
	
	@Transactional
	public List<Employee> findAll() {
		Session session=entityManager.unwrap(Session.class);
		System.out.println(session);
		Query<Employee> thequery=session.createQuery("from Employee",Employee.class);
		System.out.println(thequery);
		List<Employee> emp=thequery.getResultList();
		System.out.println(emp);
		return emp;
	}

	@Transactional
	public void save() {
	/*	Session session=entityManager.unwrap(Session.class);
		Employee emp= new Employee("sanny","Bangalore");
		session.save(emp);*/

	}

}
