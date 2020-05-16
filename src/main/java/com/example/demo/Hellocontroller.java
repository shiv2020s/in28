package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/api")
public class Hellocontroller {

	@RequestMapping(value="timezone")
	public String timezone() {
		return "time";
	}
	
	
}
