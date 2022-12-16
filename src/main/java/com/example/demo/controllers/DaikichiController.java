package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	
	@RequestMapping("/")
	public String index() {
		return "Hello World";
	}
	
	@RequestMapping("/daikichi")
	public String welcome() {
		return "Welcome";
	}
	
	@GetMapping("/daikichi/today")
	public String lucky() {
		return  "Today you will find luck in all your endeavors!";
	}

}
