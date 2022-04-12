package com.training;

import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentService;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Student kawin=null;
	try {

		kawin = new Student(101,"kawin",-98);
	} catch (RangeCheckException e1) {
		// TODO Auto-generated catch block
		//e1.printStackTrace();
	}
      StudentService service=new StudentService(kawin);
      System.out.println(service.printDetails());
  
      StudentService service2=new StudentService(kawin);
      try {
		System.out.println(service2.findRank());
	} 
      catch (Exception e) {

		System.out.println("Name is not passed");
      //  e.printStackTrace();
}
      
      ExceptionHandling exHandling=new ExceptionHandling();
    //  exHandling.usingArrayIndexException(args);
      // exHandling.usingNumberFormatException("45");
       
    //  exHandling.uisngFinallyBlock();
     try {
		System.out.println( exHandling.understandFinallyBlock());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.err.println("ERROR");
		//e.printStackTrace();
	}
     
    try( Scanner scanner=new Scanner(System.in)){
    	System.out.println("Enter Number");
    	int num=scanner.nextInt();
    	System.out.println(num);
    	
    }
     catch(Exception e)
    {
    	 System.err.println("Error");
    }
     
      
	}

}
