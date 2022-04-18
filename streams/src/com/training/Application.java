package com.training;

import java.util.List;

import com.training.ifaces.CrudRepositiory;
import com.training.model.Book;
import com.training.services.BookServices;

public class Application {

	public static void print(List<Book> args)
	{
//		for(Book eachBook:args)
//		{
//			System.out.println(eachBook);
//
//
//		}
		args.forEach(System.out::println);

	}
	public static void main(String[] args) {

		
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
		print(bookList);
		
		System.out.println("_____");
		
		
		Book books=service.finById(101);
		System.out.println(books);
		
		Book react=new Book(205,"Reactjs","Rahul",6850);
		Book reactNew=new Book(205,"Reactjs","Rahul.M",7850);

		service.update(react, reactNew);
		//service.update(react);
		System.out.println("After Update");
		print(service.findAll());
		
		System.out.println("_______________");
		List<Book>list3=((BookServices)service).getBooksGrtThan(600);
		list3.forEach(System.out::println);
		
		
		System.out.println("______________________");
		System.out.println("using Streams");
		
	((BookServices)service).findBooksGrtThan(100).forEach(System.out::println);
	System.out.println("++++++++++++++++++++++++");
		
	}

}
