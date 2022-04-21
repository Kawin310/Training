package com.training;

import java.io.File;

import com.training.model.Book;
import com.training.services.BookService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book java=new Book(101,"Head First Java","rak",780);

		
		BookService service=new BookService();
		boolean result=service.writeToFile(new File("Book.txt"),java);
		if(result)
		{
			
			System.out.println("One Record Added to file");
		}
      service.readFromFile(new File("Book.txt")).forEach(System.out::println);;
	}

}
