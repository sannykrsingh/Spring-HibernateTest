package com.india.MyFirstSpringBoot;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${sanny.name}")
	private String name;
	
	@Value("${sanny.city}")
	private String city;
	
	@GetMapping("/details")
	public String getdetails(){
		
		return "Details is Name :"+name+"city : "+city;
	}
	
	@GetMapping("/")
	public  String sayHello(){
		System.out.println("helloo called...");
		return"actuator example "+LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public  String sayWorkOut(){
		
		return"work hard with actuator called ";
	}
	
}
