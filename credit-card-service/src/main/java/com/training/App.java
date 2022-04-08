package com.training;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	 CreditCardService service=new CreditCardService();
    	 CreditCard card=new CreditCard(767,"kawin",2000);
    	 CreditCard car=new CreditCard(77,"Rishi",657);

    	 System.out.println(service.addCard(card,0));
    	System.out.println( service.addCard(car, 1));
    	Object[] k=service.getCards();
    	System.out.println(service.toString());
    	for(Object i:k)
    	{
    		System.out.println(i);
    	}
    	
    }
}
