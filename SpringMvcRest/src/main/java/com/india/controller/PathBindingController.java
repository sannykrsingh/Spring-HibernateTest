package com.india.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import com.india.entity.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/api")
@RestController
public class PathBindingController {

	private List<Student> studentList;
	
	@PostConstruct
	public void loadData(){
		
		studentList= new ArrayList<>();
		studentList.add(new Student(101, "mohan", "singh"));
		studentList.add(new Student(104, "sadhvi", "singh"));
		studentList.add(new Student(105, "shalu", "singh"));
		
	}

	
	
	@GetMapping("/student/{sid}")
	public Student getStudentbyid(@PathVariable int sid){
		return studentList.get(sid);
	}
	
	
	@GetMapping("/student/reqparam")
	public Student getStudentbyRequestParam(@RequestParam(value="sid") int sid){
		return studentList.get(sid);
	}
	
	
	@GetMapping("/student")
	public List<Student> getstudentlist(){
		return studentList;
	}
	
	/*
	@GetMapping("/studentload/{studentid}")
	public Student getstudentid(@PathVariable int studentid){
		return studentList.get(studentid);
		
	}*/
	
	
	
	
	
	
}
