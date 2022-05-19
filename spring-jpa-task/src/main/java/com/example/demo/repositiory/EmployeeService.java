package com.example.demo.repositiory;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.example.demo.Doctor;
import com.example.demo.entity.Employee;

@Service
public class EmployeeService {

	private EmployeeRepositiory repo;

	@Autowired
	public EmployeeService(EmployeeRepositiory repo) {
		super();
		this.repo = repo;	
		System.out.println("Repo Implementation Class:="+repo.getClass().getName());
	}
	
	public List<Employee>findAll()
	{
		return this.repo.findAll();
	}
	public Employee add(Employee entity)
	{
		return this.repo.save(entity);
	}
	
	
	public List<Employee> findByDateOfBirth(LocalDate date){
		
		return this.repo.findByDateOfBirth(date);
	}
	
	public List<Employee> findByLocation(String place)
	{
		return this.repo.findByLocation(place);
	}
	
	public List<Employee> findBySkillset(String skill){
		
		return this.repo.findBySkillSet(skill);
	}

	public List<Employee>getBySkillAndPlace(String skill,String place)
	{
		return this.repo.getBySkillAndLocation(skill, place);
	}
	public List<Employee> findBySkillSetAndLocation(String skill,String location)
	{
		return this.repo.findBySkillSetAndLocation(skill, location);
	}
}				
