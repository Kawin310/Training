 package com.training;

import java.util.Arrays;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<String>names=Arrays.asList("India","Srilanka","Indonesia","Bhutan");

	names.forEach(value->System.out.println(value));
	
	names.forEach(System.out::println);//Method reference.
	
	

		
	}

}
