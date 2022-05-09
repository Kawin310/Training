package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.training.model.Author;

import com.example.demo.model.Bill;
import com.example.demo.model.Customer;
import com.example.demo.model.CustomerList;
import com.example.demo.model.Invoice;
import com.training.model.Book;

@SpringBootApplication
@ComponentScan(basePackages = {"com.training","com.example","org.training"})

public class DemoApplication {

	public static void main(String[] args) 
	{
   ApplicationContext ctx=SpringApplication.run(DemoApplication.class, args);
   
   System.out.println(ctx.getBean(Book.class));
   System.out.println("Author:="+ctx.getBean(Author.class));
   
   Invoice inv=ctx.getBean(Invoice.class);
   System.out.println(inv);
  // Customer cust=(Customer) ctx.getBean("magesh");
   
   Bill bill=ctx.getBean(Bill.class);
  // System.out.println(cust);
   System.out.println("Customer:="+bill.getCustomer());
   System.out.println("product:="+bill.getProduct());
   
   CustomerList list=ctx.getBean(CustomerList.class);
   list.getCustList().forEach(System.out::println);
   
   
   	}

	@Bean
	public Author rishi()
	{
		return new Author(101,"Harish kumar");
	}
	@Bean
	@Primary
	public Author mani()
	{
		return new Author(102,"kandan");
	}
	
	
	
	public static void dummy()
	{
//		System.out.println(ctx.getBean("ram")); 
//		   //When using id need to cast to specific bean since
//		   //return type of getBean method is object
//		    Student ram=(Student)ctx.getBean("ram");
//		    
//		    //casting not required,but there should be only one bean of that type
//		    //will throw Exception
//		    Student kawin=(Student)ctx.getBean(Student.class);
//
//		    //When more than one bean of the same type available
//		    //should use id and class name
//		   Teacher stella= ctx.getBean("stella",Teacher.class);
//		   Teacher harish=(Teacher) ctx.getBean("harish");   
//		   stella.setId(490);
//		   stella.setName("kawin");
//		   stella.setSubject("Fluid Mech");
//		   System.out.println(ctx.getBean("stella"));
//		   System.out.println(harish);
//
	}
}
