package com.india.MyFirstSpringBoot;

import java.time.LocalDateTime;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	 

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
