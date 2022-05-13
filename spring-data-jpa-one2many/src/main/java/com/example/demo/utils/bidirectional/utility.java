package com.example.demo.utils.bidirectional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.enttity.ifaces.DoctorRepositiory;

public class utility {

	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepositiory repo;
	
	public void create()
	{
		doc.setPatientList(patientList);
		
		Doctor added= repo.save(doc);
		
		if(added!=null)
		{
			System.out.println("One Recorded Added");
		}
	}
	
	public void findAll()
	{
	 repo.findAll().forEach(System.out::println);
	}
	

}
