package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class ClientController {

	
	@Autowired
	private RestTemplate template;
	
	@GetMapping(path = "/client")
	@CircuitBreaker(name ="catalog",fallbackMethod="getCatalogFallBack")
	public String getCatalog()
	{
		return template.getForObject("http://localhost:2020/api/v1/catalogs",String.class);
	}
	
	public String getCatalogFallBack(Exception e) {
		
		e.printStackTrace();
		
		return "From Fall Back";
	}	
}
