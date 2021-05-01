package com.india.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.india.entity.Student;

@RestController
public class PostController {

	
	@RequestMapping("/ss")
	@PostMapping("/add")
	public Student addStudnet(@RequestBody Student stu){
		
		System.out.println("postMapping called..........");
		stu.setId(800);
		List<Student> st1= new ArrayList<>();
		st1.add(stu);
		System.out.println(st1);
		return stu;
	}
	
	
}
