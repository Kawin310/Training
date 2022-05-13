package com.example.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Doctor;

@Service
public class DoctorService {

	private DoctorRepositiory repo;

	@Autowired
	public DoctorService(DoctorRepositiory repo) {
		super();
		this.repo = repo;
	}
	
	public Doctor add(Doctor entity)
	{
		return this.repo.save(entity);
	}
	
	public List<Doctor>findAll()
	{
		return this.repo.findAll();
	}
	
	public List<Doctor> findByDept(String srchString)
	{
		return this.repo.findByDepartment(srchString);
	}
	
	public Doctor findByDoctorName(String name)
	{
		return this.repo.findByDoctorName(name);
	}
	
	public Doctor findByDoctorNameAndDepartment(String name,String dept) {
		
		return this.repo.findByDoctorNameAndDepartment(name, dept);
	}
	
	public List<Doctor>getByNameDept(String name,String dept)
	{
		return this.repo.getByNameDept(name,dept);
	}
}
