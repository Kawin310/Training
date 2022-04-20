package com.training.services;

import static java.util.stream.Collectors.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Comparator;

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
		return booklist.remove(book);	
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
public List<Book>findBooksGrtThan(double price)
{
	return this.booklist
	.stream()
	.filter( (e)->e.getPrice()>price).collect(toList());	
}

public List<String>getBookName()
{
	return this.booklist.stream().map(e->e.getBookName()).collect(toList());
		
}

public List<String>getBookNameGrtThanPrice(double price)
{
	
	return this.booklist.stream().filter((e)->e.getPrice()>price)
			.map(e->e.getBookName())
			.collect(toList());
	
}
public List<Book>sortedByName()
{

	return this.booklist.stream()
			.sorted(Comparator.comparing(Book::getBookName))
			.collect(toList());
	
	
}

public List<Book>sortedByBookNames()
{
	
	return this.booklist.stream()
			.sorted(Comparator.reverseOrder())
			.collect(toList());
	
	
}

public List<Book>getBooksGrtThan(double price)
{
	List<Book>list=new ArrayList<>();
	Predicate<Double>grtThan=(value)-> value>price;
	//Consumer<Predicate<T>>
	this.booklist.forEach(book->
	{
		Double bookPrice=book.getPrice();
		if(grtThan.test(bookPrice))
		{
			list.add(book);
		}
		
	});
	return list;
	
}

}
