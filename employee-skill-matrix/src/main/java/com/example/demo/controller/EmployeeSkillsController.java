package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeSkills;
import com.example.demo.services.EmployeeSkillsService;

@RestController
@RequestMapping(path = "/api/v1/empskills")
public class EmployeeSkillsController {

	@Autowired
	private EmployeeSkillsService service;
	
	@GetMapping(path = "/findall")
	public List<EmployeeSkills> findAll()
	{
		return this.service.findAll();
	}
	
	@PostMapping(path = "/add")
	public EmployeeSkills add(@RequestBody EmployeeSkills entity)
	{
		return this.service.add(entity);
	}
	
	@GetMapping(path = "/byskill/{name}")
	public List<EmployeeSkills> findBySkills(@PathVariable("name")String skillName)
	{
		return this.service.findBySkills(skillName);
	}
	
	@GetMapping(path = "/byexp/{num}")
	public List<EmployeeSkills> findByExp(@PathVariable("num")int skillExp)
	{
		return this.service.findByExperience(skillExp);
	}
	@GetMapping(path = "/srch/{num}/{name}")
	public List<EmployeeSkills> findByExpAndName(@PathVariable("num")int skillExp,@PathVariable("name")String name)
	{
		return this.service.findByExperienceAndName(skillExp, name);
	}
	
	@GetMapping(path = "/srch/approvedby/{approver}")
	public List<EmployeeSkills>findByApprovedBy(@PathVariable("approver")String approver){
		
		return this.service.findByApprovedBy(approver);
	}
	
	@GetMapping(path = "/srch/status/{status}")
	public List<EmployeeSkills> findByStatus(@PathVariable("status")String status){
		
		return this.service.findByStatus(status);
	}
	
	@GetMapping(path = "/srch/name/{name}")
	public EmployeeSkills findByName(@PathVariable("name")String name){
		
		return this.service.findByName(name);
	}
}
