package com.sandeepFirstRestApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/GreetController")
public class GreetController {

	@GetMapping ("/greet")
	public  String greetMsg() {
		
		String msg= "Good Evening All";
		
		return msg;
		
	}
		@GetMapping ("/welcome")
		public  String welcomeMsg() {
			
			String msg= "welcome to  BiikkadIT pune ";
			
			return msg;
		
		
		
	}
	
	
	

}
