package com.training;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.model.Student;


public class HashMapApp2 {

	public static void main(String[] args) {


		Student ram =  new Student(101,"ram",78);
		Student shyam =  new Student(102,"shyam",79);
		Student magesh =  new Student(103,"magesh",78);

		
		HashMap<Integer, Student>map=new HashMap<>();
		map.put(900, ram);
		map.put(902,magesh);
		map.put(904,shyam);
		
		
		System.out.println(map.get(904));
		System.out.println(map.get(902));
		System.out.println(map.get(900));

      Set<Integer>keys=map.keySet();
      System.out.println(keys);
      for(Integer key:keys)
      {
    	  System.out.println(map.get(key));
      }
      System.out.println("________________");
      
      Collection<Student>list=map.values();
      
      for(Student eachValue:list)
      {
    	  System.out.println(eachValue);
      }
      
      Set<Map.Entry<Integer, Student>> list2=map.entrySet();
      
      for(Map.Entry<Integer,Student> eachEntry:list2)//To get both the vlaue and key 
      {
    	  System.out.println(eachEntry.getKey());
    	  System.out.println(eachEntry.getValue());
      }
	}

}
