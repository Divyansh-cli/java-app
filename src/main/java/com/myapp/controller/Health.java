package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {

	@GetMapping(value = "/health")
	public String health() {
		return "This page is up and running!!";
	}

}
