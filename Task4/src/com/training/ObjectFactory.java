package com.training;

public class ObjectFactory {
	
	public Automobile getobject(int key)
	{
		switch (key)
		{
		case 1:
			   return new MarutiCar();
			
		case 2:
			return new ToyotaCar();
			
		default:
			  return null;
		}
		
		
	}
	
	public void printQuote(Automobile obj)
	{
		if(obj!=null)
		{
		System.out.println(obj.getColor());
		System.out.println(obj.getModel());
		System.out.println(obj.getPrice());
		}
		else
		{
			System.out.println("invalid Choice");
		}
		//System.out.println(obj.getColor());
		//System.out.println(obj.getModel());
		//System.out.println(obj.getPrice());
	}
	
	
	

}
