package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeDesigination;
import com.example.demo.services.EmployeeDesignationService;

@RestController
@RequestMapping(path = "/api/v1/empdesigi")
public class EmployeeDesiginationController {

	@Autowired
	private EmployeeDesignationService service;
	
	@GetMapping(path = "/findall")
	public EmployeeDesigination add(EmployeeDesigination entity) {
		
		return this.service.add(entity);
	}
	
	@PostMapping(path = "/add")
	public List<EmployeeDesigination> findAll(){
		
		return this.service.findAll();
	}

}
