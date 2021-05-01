package com.india.controller;

import java.util.ArrayList;
import java.util.List;
import com.india.rest.*;
import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.india.entity.Student;
import com.india.entity.StudentErrorResponse;

@RestController
@RequestMapping("/api")
public class ExcpectionController {

	private List<Student> studentList;
	
	@PostConstruct
	public void loadData(){
		
		studentList= new ArrayList<>();
		studentList.add(new Student(101, "mohan", "singh"));
		studentList.add(new Student(104, "sadhvi", "singh"));
		studentList.add(new Student(105, "shalu", "singh"));
		
	}
		
	@GetMapping("/studentload/{studentid}")
	public Student getstudentid(@PathVariable int studentid){
		
		if((studentid>=studentList.size()|| studentid<0)){
			throw new StudentNotFoundException("Student not found :"+studentid);
		}
		return studentList.get(studentid);
		
	}
	
	/*@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException sf){
		
		StudentErrorResponse ser =new StudentErrorResponse();
		ser.setStatus(HttpStatus.NOT_FOUND.value());
		ser.setMessage(sf.getMessage());
		ser.setTimeStamp(System.currentTimeMillis());
		
		
		return new ResponseEntity<>(ser,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException2(Exception sf){
		
		StudentErrorResponse ser =new StudentErrorResponse();
		ser.setStatus(HttpStatus.BAD_REQUEST.value());
		ser.setMessage(sf.getMessage());
		ser.setTimeStamp(System.currentTimeMillis());
		
		
		return new ResponseEntity<>(ser,HttpStatus.BAD_REQUEST);
		
	}*/
}
