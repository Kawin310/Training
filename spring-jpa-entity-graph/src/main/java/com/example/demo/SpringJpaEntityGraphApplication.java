package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Address;
import com.example.demo.entity.City;
import com.example.demo.entity.User;
import com.example.demo.repos.AddressRepositiory;
import com.example.demo.service.AddressService;

@SpringBootApplication
public class SpringJpaEntityGraphApplication {

	public static void main(String[] args) 
	{
 ConfigurableApplicationContext ctx=SpringApplication.run(SpringJpaEntityGraphApplication.class, args);


		AddressService service=ctx.getBean(AddressService.class);
		service.task2();
		ctx.close();
	}
//	@Bean
//	public CommandLineRunner runner()
//	{
//		return new CommandLineRunner() {
//			@Autowired
//			AddressRepositiory repo;
//			@Override
//			public void run(String... args) throws Exception {
//				// TODO Auto-generated method stub
//				City chennai=new City(980,"Chennai");
//				City madurai=new City(982,"Madurai");
//				
//				User ram=new User(700,"Ramesh",48843);
//				
//				User suresh=new User(701,"Suresh",78843);
//				
//				Address address=new Address(101,"Mr.",madurai,suresh);
//				Address address1=new Address(102,"Dr.",chennai,ram);
//
//				this.repo.save(address);
//				this.repo.save(address1);
//			}
//		};
//		
//	}
}
