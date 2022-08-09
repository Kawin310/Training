package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreetingTest {

	@Test
	@DisplayName(value = "Test the Get Message return a String of Length 8 Characters")
	void testMaxLength()
	{
		Greeting grtObj= new Greeting();
		
		int actual=grtObj.getMessage().length();
		int expected=5;
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName(value = "Test the Birthday wish method does not return null")
	void testBirthdayWish()
	{
		Greeting grtObj=new Greeting();
		String  actual=grtObj.birthdayWish("Kawin");
		assertNotNull(actual);
	}
	@Test
	@DisplayName(value = "Test Birthday wish Method should return Happy Birthday with user name suffixed")
	void testBirthdayWishWithArg()
	{
		Greeting grtObj=new Greeting();
		String name="kawin";
		String  actual=grtObj.birthdayWish(name);
        String expected="Happy Birthday"+name;
		assertEquals(expected, actual);
	}
}
