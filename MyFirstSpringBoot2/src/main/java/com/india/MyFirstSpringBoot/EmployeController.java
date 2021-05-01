package com.india.MyFirstSpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empapi")
public class EmployeController {

	private EmployeDAO employeDAO;
	
	@Autowired
	public EmployeController(EmployeDAO themployeDAO){
		this.employeDAO=themployeDAO;
	}
	
	@GetMapping("/employees")
	public List<Employee> findAll()
	{
	
		return employeDAO.findAll();
	}
}
