package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "kawin_book")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	@Id
	@Column(name="id")
	int id;
	
	@Column(name="book_name")
	String bookName;
	
	@Column(name="author")
	String author;
	
	@Column(name="price")
	double price;
}
