package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.entity.EmployeeSkills;
import com.example.demo.ifaces.EmployeeSkillsRepo;

@Service
public class EmployeeSkillsService {

	@Autowired
	private EmployeeSkillsRepo repo;
	
	@Autowired
	private EmployeeDetailsService service;
	
	public List<EmployeeSkills> findAll()
	{
		return this.repo.findAll();
	}
	
	public EmployeeSkills add(EmployeeSkills entity)
	{
		return this.repo.save(entity);
	}
		
	public List<EmployeeSkills> findBySkills(String skillName)
	{
		return this.repo.findBySkillName(skillName);
	}
	
	public List<EmployeeSkills> findByExperience(int experience)
	{
		return this.repo.findBySkillExperience(experience);
	}
	
	public List<EmployeeSkills> findByExperienceAndName(int experience,String name)
	{
		return this.repo.findBySkillExpAndName(experience, name);
	}

   public List<EmployeeSkills> findByApprovedBy(String approve){
		
		return this.repo.findByApprovedBy(approve);
	}

	public List<EmployeeSkills> findByStatus(String status){
		
		return this.repo.findByStatus(status);
	}
	
	public EmployeeSkills findByName(String name)
	{
		EmployeeDetails emp= service.findByName(name);
		EmployeeSkills skill=null;
		
		List<EmployeeSkills>list=findAll();
		for(EmployeeSkills empl:list)
		{
			if(empl.getEmpId()==emp.getEmpId())
			{
				skill= empl;
			}
		}
		return skill;
	}

}
