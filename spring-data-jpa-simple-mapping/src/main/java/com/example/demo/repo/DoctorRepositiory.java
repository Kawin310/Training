package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Doctor;

public interface DoctorRepositiory extends JpaRepository<Doctor,Integer> {

	public List<Doctor> findByDepartment(String srch);
	
	public Doctor findByDoctorName(String name);
	
	public Doctor findByDoctorNameAndDepartment(String name,String dept);
	


		@Query(nativeQuery = true,
		value="select doctor_id,department,doctor_name,phone_number from kawins_doctor" 
		+ " where doctor_name=:docName or department=:dept")

 public List<Doctor>getByNameDept(@Param("docName")String docName,@Param("dept")String dept);

}
