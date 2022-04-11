package com.training.ifaces;
import java.util.*;
import com.training.model.Book;

public interface CrudRepositiory {
	
	public boolean add(Book book);
	public Book finById(int id);
	public boolean removeBook(Book book);
	public List<Book> findAll();
	public Book update(Book book,Book recentBook);
	
	

}
