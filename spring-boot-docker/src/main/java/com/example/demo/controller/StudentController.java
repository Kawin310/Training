package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentController {

	@GetMapping(path = "/students/{name}")
	public String getMessage(@PathVariable("name") String name)
	{
		return "Welcome :"+name;
	}
	
	
}
