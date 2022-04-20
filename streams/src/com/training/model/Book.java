package com.training.model;

import java.util.logging.Logger;

//import com.example.model.Book;

public class Book implements Comparable<Book> {
	
	//public static Object log;
	private int bookNumber;
	private String bookName;
	private String author;
	private double price;
	public static Logger log=Logger.getLogger(Book.class.getName());

	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
		log.info("Book with 0 argument");

	}
	
	public Book(int bookNumber, String bookName, String author, double price) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				+ "]";
	}

	@Override
	public int compareTo(Book otherObj) {
		// TODO Auto-generated method stub
	if(otherObj.bookNumber<this.bookNumber)return 1;
	if(otherObj.bookNumber>this.bookNumber)return -1;
	return 0;
	}
	
	

}
