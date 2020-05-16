package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/api")
public class Hellocontroller {

	@RequestMapping(value="timezone")
	public String timezone() {
		return "time";
	}
	@GetMapping()
	public String name() {
		return "index.html";
	}
	
	
}
