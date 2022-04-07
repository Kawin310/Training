package com.training;

public class Application {

	public static void main(String[] args) {

		ObjectFactory factory=new ObjectFactory();
		Automobile maruti=factory.getobject(1);
		Automobile toyota=factory.getobject(2);
		
		factory.printQuote(maruti);
		System.out.println("--------------------"+Automobile.showRoom+"--------");
		factory.printQuote(toyota);

	}

}
