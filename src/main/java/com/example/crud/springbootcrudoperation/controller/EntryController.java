package com.example.crud.springbootcrudoperation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {
	
	
	@GetMapping("/")
	public String welcome() {
		return "<h1>Welecome to spring</h1>";
	}

}
