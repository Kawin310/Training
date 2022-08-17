package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.ifaces.EmployeeDetailsRepo;

@Service
public class EmployeeDetailsService {

	@Autowired
	private EmployeeDetailsRepo repo;
	
	public List<EmployeeDetails> findAll()
	{
		return this.repo.findAll();
	}
	
	public EmployeeDetails add(EmployeeDetails entity)
	{
		return this.repo.save(entity);
	}
	public EmployeeDetails findByName(String name)
	{
		return this.repo.findByEmpName(name);
	}
	
         
}
