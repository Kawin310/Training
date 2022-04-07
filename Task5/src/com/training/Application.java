package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		Customer object=new Customer(990,"Kawin",7876,"k310.com.org");
//		try {
//			object.checkEmailid();
//		} catch (InvalidEmailException e) {
//			// TODO Auto-generated catch block
//      System.out.println("Invalid mail id");
//      e.printStackTrace();
//		}
		try {
			object.checkEmailid();
		} catch (InvalidEmailException e) {
			// TODO Auto-generated catch block
	      System.out.println("Invalid mail id");

			e.printStackTrace();
		}
		
		
	}

}
