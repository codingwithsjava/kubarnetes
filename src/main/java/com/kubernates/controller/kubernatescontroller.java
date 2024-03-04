package com.kubernates.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kubernatescontroller {
	
	@GetMapping("/test-docker")
	public String getdata() {
		return "in docker contsainer";
	}

}
