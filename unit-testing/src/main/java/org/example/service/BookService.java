package org.example.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import org.example.Book;
/**
 * 
 * @author Kawin.M
 *
 */
public class BookService {
/**
 * 
 */
	private Set<Book> bookList;
	
	public BookService() {
		super();
		// TODO Auto-generated constructor stub
	this.bookList=new HashSet<>();
	}

	public Set<Book> getBookList(){
		
		return this.bookList;
	}
	
	public int addBook(Book book)
	{
		boolean value=this.bookList.add(book);
		int i=0;
		if(value)
		{
			i=1;
		}
		return i;
	}
public boolean removeBook(Book book) {
		
		boolean result = false;
		if(this.bookList.contains(book)) {
			
			this.bookList.remove(book);
			result = true;
		}else {
			
			throw new RuntimeException("Element Not Found");
		}
		return result;
	}
public List<String> getBestBooks(){

	List<String> list=Arrays.asList("FaceBook","PassBook","CookBook");
	
	return list;
}


}
