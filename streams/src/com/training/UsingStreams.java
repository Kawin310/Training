package com.training;
import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import com.training.model.Book;

public class UsingStreams {

	public static void useDistinct(List<Book> bookList)
	{
		
		bookList.stream().distinct().forEach(System.out::println);
		
	}
	
	public static void collectToSet(List<Book>bookList)
	{
		Set<Book>bookSet=bookList.stream().filter(e-> e.getPrice()>500)
				.collect(toSet());
		bookSet.forEach(System.out::println);
	}
	
	public static void collectTomap(List<Book>bookList)
	{
		
		//We can also use distinct method to Avoid duplicate element in the key
		Set<Book>bookSet=bookList.stream().collect(toSet());
		
		Map<String,Double>values=bookSet.stream()
				.filter(e->e.getPrice()>500) 
				.collect(toMap(Book::getBookName,Book::getPrice));
		values.forEach((key,value)->System.out.println(key+","+value));
	}
	
	public static void findMaxPrice(List<Book>bookList)
	{
		
		Optional<Book>optional=bookList.stream()
				.max(Comparator.comparing(Book::getPrice));
		
		if(optional.isPresent()) {
			
			System.out.println("Maximum price:="+optional.get().getPrice());
		}
	}
	
public static void findMinPrice(List<Book>booklist)
{
	
	Optional<Book>optional=booklist.stream()
			.min(Comparator.comparing(Book::getPrice));
	

	if(optional.isPresent()) {
		
		System.out.println("Manimum price:="+optional.get().getPrice());
	}
	
	
}
public static void getBookNameByv(List<Book>bookList)
{
	
	long set=bookList.stream().distinct()
			.filter(e->e.getBookName().contains("v"))
			.count();
	
	Set<String> set1=bookList.stream().filter(e->e.getBookName()
			.contains("v")).map((e)->e.getBookName())
			.collect(toSet());
	
	System.out.println(set);
	set1.forEach(System.out::println);
	
}
	
	public static void main(String[] args) {
		
		  Book java=new Book(101,"java","Kawin",450);
		  Book spring=new Book(102,"spring","Mad",550);
		  Book maven=new Book(103,"maven","Harish",650);
		  Book html=new Book(104,"Html","priya",750);
		  Book python=new Book(105,"Python","Sathya",850);
		  Book mavenNew=new Book(103,"maven","Harish",650);
		  Book htmlNew=new Book(104,"Html","priya",750);
		  
		  List<Book>bookList=
		 Arrays.asList(java,spring,maven,html,python,mavenNew,htmlNew);
		  
		  useDistinct(bookList);
		  System.out.println("------------------");
		  //collectToSet(bookList);
		  collectTomap(bookList);
		  System.out.println("------------------");

		  findMaxPrice(bookList);
		  	  System.out.println("------------------");

		  findMinPrice(bookList);
	  	  System.out.println("------------------");

		  getBookNameByv(bookList);

	}

}
