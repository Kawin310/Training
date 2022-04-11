package com.training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.training.ifaces.CrudRepositiory;
import com.training.model.Book;
import com.training.services.BookServices;
import com.training.utils.BookNameComparator;

public class App {

	
	
	public static void print(Collection<Book> args)
	{
		for(Book eachBook:args)
		{
			System.out.println(eachBook);
			
		}

	}
	public static void main(String[] args) {
		

		List<String> names=new ArrayList<>();
		
		names.add("Ramesh");
		names.add("Anand");
		names.add("Chandru");
		names.add("Zahir");
		names.add("Pavan");

		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		

		  Book java=new Book(101,"java","Kawin",450);
		  Book spring=new Book(102,"spring","Mad",550);
		  Book maven=new Book(103,"maven","Harish",650);
		  Book html=new Book(104,"Html","priya",750);
		  Book python=new Book(105,"Python","Sathya",850);
		  
		  CrudRepositiory service=new BookServices();
		  
			 System.out.println("Is added :" +service.add(java));
			 System.out.println( service.add(spring));
			 System.out.println( service.add(maven));
			 System.out.println( service.add(html));
			 System.out.println( service.add(python));	
		 
		List<Book> bookList=service.findAll(); 
		Collections.sort(bookList);
		System.out.println(bookList);
		BookNameComparator name=new BookNameComparator();
		Collections.sort(bookList, name);
		System.out.println("_______");
		print(bookList);
          
	}

}
