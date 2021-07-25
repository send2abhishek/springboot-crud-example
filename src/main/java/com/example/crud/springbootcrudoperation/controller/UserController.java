package com.example.crud.springbootcrudoperation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/user")
	public String user() {
		
		return "All user";
	}
	
	@GetMapping("/admin")
	public String userAdmin() {
		
		return "admin";
	}

}
