package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.services.EmployeeDetailsService;

@RestController
@RequestMapping(path = "/api/v1/empdetails")
public class EmployeeDetailsController {

	@Autowired
	private EmployeeDetailsService service;
	

	@GetMapping(path = "/findall")
	public List<EmployeeDetails> findAll()
	{
		return this.service.findAll();
	}
	
	@PostMapping(path = "/add")
	public EmployeeDetails add(@RequestBody EmployeeDetails entity)
	{	
		return this.service.add(entity);

	}
	
	@GetMapping(path = "/srch/byname/{name}")
	public EmployeeDetails findByName(@PathVariable("name")String name)
	{
		return this.service.findByName(name);
	}
	

}