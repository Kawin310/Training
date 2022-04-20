package com.training;

import java.util.function.Predicate;

import com.training.ifaces.Converter;
import com.training.services.CurrencyConverter;

public class Application {
	
	public static void print(Converter<Double,Double>conv)
	{
		System.out.println(conv.convert(100.0));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Converter<Double,Double> obj=new CurrencyConverter();
		System.out.println(obj.convert(20.0));
		
		Converter<Double,Double> lambda=(val)->val * 200.0;
		lambda.convert(20.0);
//		Predicate<Double>predi=(i)->i>200.0;
//		if(predi.test(300.00))
//		{
//			System.out.println("the value of i is greater");
//		}
		//System.out.println(lambda.convert(20.0));
		                                                                                                                                             
		Converter<String,Integer> strLength=(str)-> str.length();
		System.out.println(strLength.convert("Chennai"));
		print(lambda);
		
		
	}

}
//		Converter<Double,Double> lambda=(val)->val * 200.0;

