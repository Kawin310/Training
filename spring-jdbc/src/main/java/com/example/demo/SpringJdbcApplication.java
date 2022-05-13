package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepositiory;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringJdbcApplication.class, args);
		   ApplicationContext ctx=SpringApplication.run(SpringJdbcApplication.class, args);
		   ProductRepositiory repo=ctx.getBean(ProductRepositiory.class);
		   Product tv = ctx.getBean(Product.class);
		     
		     //System.out.println("RoWAdded:"+repo.add(tv));
		   repo.findAll().forEach(System.out::println);
		  // System.out.println(repo.findById(292));
		   System.out.println(repo.update(tv));
		 //  System.out.println(repo.remove(869));
	 }
@Bean
public Product tv()
{
	return new Product(705,"Clown",764);
}
}
