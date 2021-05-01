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
		return"Hello World time on server is from 2nd project "+LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public  String sayWorkOut(){
		System.out.println("helloo called...");
		return"work hard ";
	}
	
}
