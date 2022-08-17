package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDesigination;
import com.example.demo.ifaces.EmployeeDesiginationRepo;

@Service
public class EmployeeDesignationService {

	@Autowired
	private EmployeeDesiginationRepo repo;
	
	public EmployeeDesigination add(EmployeeDesigination entity) {
		
		return this.repo.save(entity);
	}
	
	public List<EmployeeDesigination> findAll(){
		
		return this.repo.findAll();
	}
}
