package com.india.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import junit.framework.Assert;

public class RestClinet {
	
	public static void main(String[] args) {
		
		RestTemplate rs= new RestTemplate();
		//String result=rs.getForObject("http://localhost:8007/SpringMvcRest/student.json", String.class);
		
		//List<Student> lsstu=rs.getForObject("http://localhost:8007/SpringMvcRest/student/2",ArrayList.class);
		
		/*String result=rs.getForObject("http://localhost:8007/SpringMvcRest/student/2", String.class);
		System.out.println(result);*/
		
		//post method example...
		Student st= new Student(101,"mohan","singh");
		/*ResponseEntity<String> responseE=rs.postForEntity("http://localhost:8007/SpringMvcRest/ss", st, String.class);
		System.out.println(responseE.getStatusCodeValue());
		System.out.println(responseE.getBody());
		Assert.assertEquals(201, responseE.getStatusCodeValue());*/
		String result=rs.postForObject("http://localhost:8007/SpringMvcRest/ss", st, String.class);
		System.out.println(result);
		
		
		
	}
	
	
}
