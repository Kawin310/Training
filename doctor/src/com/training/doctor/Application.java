package com.training.doctor;
import java.util.*;
public class Application {

	public static void main(String[] args) {

		Patient patient1=new Patient(10,"Arun","Chennai",9944167);
		Patient patient2=new Patient(11,"varun","madurai",6344167);
		Set<Patient>list1=new HashSet<>();
		
		list1.add(patient1);
		list1.add(patient2);
		Doctor doctor=new Doctor(1,"kawin","Mbbs",list1);
		Doctor doctor1=new Doctor(2,"rishi","bbs",list1);
		
		Set<Patient>list2=new HashSet<>();
		Patient Patient3=new Patient(13,"rishi","Madurai",876);
		list2.add(Patient3);
         Set<Patient> obj1=new HashSet<>(); 
         obj1=doctor.getList();
		for(Patient obj:obj1)
		{
                                                       
		  // System.out.println(obj);	
	}
		
		Map<Doctor, Set<Patient>>map=new HashMap<>();
		map.put(doctor, list1);
		map.put(doctor1,list2);
		Appointment app=new Appointment(map);
	                                             //Set<Appointment>oin=app.getMap();
		Map<Doctor,Set<Patient>>object1=app.getMap();
			

		System.out.println(object1.get(doctor));
		//Appointment app2=new Appointment();
	
		//System.out.println(app2.getMap());
}
	
	}
