package com.training;

import java.util.List;

import com.training.ifaces.CrudRepositiory;
import com.training.model.Book;
import com.training.services.BookServices;

public class Application {

	public static void print(List<Book> args)
	{
		for(Book eachBook:args)
		{
			System.out.println(eachBook);
			


		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Book java=new Book(101,"java","Kaiwn",450);
		  Book spring=new Book(1012,"spring","Mad",550);
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
		print(bookList);
		
		System.out.println("_____");
		
		
		Book books=service.finById(101);
		System.out.println(books);
		
	}

}
