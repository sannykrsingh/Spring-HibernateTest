package com.india.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.india.entity.StudentErrorResponse;
import com.india.rest.StudentNotFoundException;

@ControllerAdvice
public class StudentRestExceptionHandler {

	@ExceptionHandler
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
		
	}
}
