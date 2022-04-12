package com.training.services;

public class ExceptionHandling {

	public void usingArrayIndexException(String [] args)
	{
		
		
		try {
			System.out.println(args[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("method requires three values to passed");
			e.printStackTrace();
		}
		
	}
	
	public void usingNumberFormatException(String value)
	{
		int age=0;
		try {
			age = Integer.parseInt(value);
			System.out.println(age);

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Enter the number to type cast");
			//e.printStackTrace();
		}
	}
	
	public void uisngFinallyBlock()
	{
		int denominator=0;
		
		try {
			
			System.out.println(4/denominator);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator Should not be Zero");
			
		}
		finally {
			
			System.out.println("Inside FINALLY==");
		}
		
		System.out.println("Thanks,bye,bye");
	}
	
	public String understandFinallyBlock() throws Exception
	{
		int denominator=0;
		
		try {
			
			System.out.println(4/denominator);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator Should not be Zero");
			throw new Exception();
			//return "Wlecome";
		}
		finally {
			
			System.out.println("Inside FINALLY==");
		}
		
		System.out.println("Thanks,bye,bye");
		return "thanks";
	}

}

