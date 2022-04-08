package com.training;

import java.util.Arrays;

public class CreditCardService {

	
	CreditCard array[]=new CreditCard[2];

	public boolean addCard(CreditCard card,int count)
	{
     
		boolean value=false;
		if(count<=1)
		{
		array[count]=card;
		System.out.println(array[count].getAountDue());
		value=true;
		
		}
		else {
			 value=false;
			 return value;
		}
		return value;
	}
	
		public CreditCard[] getCards()
	{
		return array;
		
		
	}

		@Override
		public String toString() {
			return "CreditCardService [getCards()=" + Arrays.toString(getCards()) + "]";
		}
	
}
