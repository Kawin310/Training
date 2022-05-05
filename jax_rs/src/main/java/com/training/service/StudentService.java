package com.training.service;
import java.util.*;
import java.util.stream.*;

import com.example.model.Student;

public class StudentService {

	private List<Student> studentList;

	
	public StudentService() 
	{
		super();
		// TODO Auto-generated constructor stub
		this.studentList = new ArrayList<Student>();
	}
	
	public boolean add(Student student)
	{
		return this.studentList.add(student);
	}
	
	public Optional<Student> findById(int id)
	{
		
		return this.studentList.stream().filter(e-> e.getRollNumber()==id)
				.findFirst();
	}
	
 public boolean remove(int  id) {
		
		return this.studentList.removeIf(e->e.getRollNumber()==id);
	}
	
	
public Student update(int id,Student newValue) {
		
		int idxPos = this.studentList.indexOf(findById(id).get());
		
		return this.studentList.set(idxPos, newValue);
		
	}

	public List<Student> getAll(){
		return studentList;
	}

}
