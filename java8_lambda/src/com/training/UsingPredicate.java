package com.training;
import java.util.function.*;
import java.util.*;
public class UsingPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>names=Arrays.asList("India","Srilanka","Indonesia","Bhutan");
		Predicate<String>ContainsChar=
				
			(country)->country.toUpperCase().startsWith("I");
				
		Consumer<String>consumer=(value)->
		{
			if(ContainsChar.test(value)) {
				System.out.println(value);
			}
		};
		names.forEach(consumer);
		
	}

}
