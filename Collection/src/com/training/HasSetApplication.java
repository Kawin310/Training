package com.training;

import com.training.model.Student;
import java.util.*;
public class HasSetApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student ram    =  new Student(101,"ram",78);
		Student shyam =  new Student(102,"shyam",79);
		Student magesh=  new Student(103,"magesh",89);
	    Student chinnaThambi= new Student(101,"ram",78);
		
		Set<Student> set=new HashSet<>();
        set.add(magesh);
        set.add(chinnaThambi);
        set.add(shyam);
        set.add(ram);
        System.out.println(set);

	}

}
