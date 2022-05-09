package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.Student;
import com.example.demo.Teacher;
import com.example.demo.model.Customer;
import com.example.demo.model.Product;

@Configuration
public class AppConfig {

	//Id of the Bean as the method name
  @Bean
  public Student ram()
  {
	return new Student(101,"Kawin",90.0);		
  }
  @Bean
	public Teacher harish()
	{
		return new Teacher(465,"kawin","Cse");
	}

	@Bean
	public Product tv()
	{
		return new Product(101,"Sony Tv");
	}
	@Bean
	public Customer kawin()
	{
		return new Customer(202,"Kawin");
	}
	@Bean
	public Customer magesh()
	{
		return new Customer(203,"Magesh");
	}
	
	@Bean
	public Customer rajesh()
	{
		return new Customer(204,"rajesh");
	}
	}
