package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class MyController {
    
	@GetMapping("/")
	public String home() {
		System.out.println("Home");
		return "home";
	}
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
}
