package com.training.services;

import java.util.List;
import java.util.ArrayList;
import com.training.ifaces.CrudRepositiory;
import com.training.model.Book;
import com.training.ifaces.CrudRepositiory;
import com.training.model.Book;

public class BookServices implements CrudRepositiory {
	
	private ArrayList<Book> booklist;

	@Override
	public Book finById(int id) {

		Book value=null;

		for(Book get:booklist)
		{			
			if(get.getBookNumber()==id)
			{
				value=get;
			}
		}
			return value;
	}
	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub
		return booklist.add(book);
	}

	public BookServices() {
		super();
		// TODO Auto-generated constructor stub
		this.booklist=new ArrayList<Book>();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public boolean removeBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}
  @Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.booklist;
	}
@Override
		public Book update(Book oldbook, Book recentBook)
		{
			// TODO Auto-generated method stub
			if(this.booklist.contains(oldbook))
				
			{
				int idxPos=this.booklist.indexOf(oldbook);
				this.booklist.set(idxPos, recentBook);
			}
			
			return recentBook;
		}

}

