package com.training;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.training.model.Student;

public class TreeSetApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student ram    =  new Student(101,"ram",78);
		Student shyam =  new Student(102,"shyam",79);
		Student magesh=  new Student(103,"magesh",89);
	    Student chinnaThambi= new Student(101,"ram",78);
		
		Set<Student> set=new TreeSet<>();
        set.add(magesh);
        set.add(chinnaThambi);
        set.add(shyam);
        set.add(ram);
       for (Student student : set) 
       {
    	   System.out.println(student.getFirstName());
	      }
	}
}
