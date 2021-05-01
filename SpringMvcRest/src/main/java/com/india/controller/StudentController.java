package com.india.controller;

import java.util.ArrayList;
import java.util.*;

import com.india.entity.*;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

	
	@GetMapping("/students")
	public List<Student>getStudents(){
		List<Student> st1= new ArrayList<>();
		st1.add(new Student(101, "Sanny", "kumar"));
		st1.add(new Student(102, "sadhvi", "singh"));
		st1.add(new Student(103, "roshan", "singh"));
		return st1;
	}
}
