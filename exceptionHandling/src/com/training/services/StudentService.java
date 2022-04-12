package com.training.services;

import com.training.model.Student;

public class StudentService {
                        
	private Student student;

	public StudentService(Student student) {
		super();
		this.student = student;
	}


	public StudentService() {
		super();

	}
	
	
	
	//Applying the handle rule of Exception handling
	public String printDetails()
	{
		String name=null;
		try {
			name= this.student.getFirstName();

		}
		catch(NullPointerException e)
		{
			System.err.println("Student object is not passed");
		}
		return name;
	}
	
	public String findRank()throws Exception{
		
		String grade="A";
		if(student.getMarkScored()>99)
		{
			
			grade="O";
		}
		
		return grade;
	}
	
}
