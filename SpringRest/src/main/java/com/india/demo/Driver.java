package com.india.demo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.india.rest.Address;
import com.india.rest.Student;

public class Driver {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
	
		
		ObjectMapper mapper =new ObjectMapper();
		Student theStudent=mapper.readValue(new File("data/jtest.json"), Student.class);
		System.out.println(theStudent.getFirstName());
		System.out.println(theStudent.getLastName());
		
		Address ad=theStudent.getAddress();
		System.out.println(ad.getCity());
		/*mapper.enable(SerializationFeature.INDENT_OUTPUT);
		Student s= new Student(101,"sanny","kumar","active");
		
		 String json = mapper.writeValueAsString(s);
		 System.out.println(json);
		 */
		// mapper.writeValue(new File("C:/cp/dataOne.json"), s);
		//mapper.writeValue(new File("data/jtest.json"), s);
	}
}
