package com.example.demo.repositiory;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.entity.Employee;

public interface EmployeeRepositiory extends JpaRepository<Employee, Integer> {

	
	
	public List<Employee> findByDateOfBirth(LocalDate date);
	public List<Employee> findByLocation(String place);

	public List<Employee> findBySkillSet(String skill);
	public List<Employee> findBySkillSetAndLocation(String skill,String location);

	
//	@Query(nativeQuery = true,
//value="select employee_id,employee_name,location,phone_number,skillset from rishi_employee" 
//		+ " where skillset=:skill or location=:location")
	@Query(nativeQuery = true,
    value="select * from rishi_employee where skillset=:skill or location=:location")
	 public List<Employee>getBySkillAndLocation(@Param("skill")String skill,@Param("location")String location);

	
}
