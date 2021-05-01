	package com.india.MyFirstSpringBoot;

import java.util.List;

public interface EmployeDAO {

		public List<Employee> findAll();
		
		public void save();
}
