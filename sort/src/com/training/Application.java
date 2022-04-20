package com.training;

import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		Set<String>set=new TreeSet<>();
		
		set.add("apple");
		set.add("orange");
		set.add("apple");
		set.add("pineapple");
		set.add("orange");
		set.add("banana");
		int pos=0;

		for(String s:set)
	{
			System.out.println(s.toString() +"  "+"Index Position "+pos);
			pos++;
		
	}

}
	}
