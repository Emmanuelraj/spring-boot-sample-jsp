package com.java.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	
	@GetMapping("/hi")
	public String onFormWelcome() {
		// TODO Auto-generated constructor stub
		return "hi";
	}

}
