package com.sandeepFirstRestApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/WelcomeController")
public class WelcomeController {
	
	@GetMapping ("/welcome")
	public  String welcomeMsg() {
		
		String msg= "welcome to  BiikkadIT";
		
		return msg;
		
		
		
	}
	
	
	

}


