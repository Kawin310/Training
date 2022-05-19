package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;
import com.example.demo.repositiory.EmployeeService;

@SpringBootApplication
public class SpringJpaTaskApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(SpringJpaTaskApplication.class, args);
		Employee emp=ctx.getBean(Employee.class);
		EmployeeService service=ctx.getBean(EmployeeService.class);
		
//		service.add(emp);
//		Employee added=service.add(emp);
//	if(added!=null)
//		{
//			System.out.println("One Employee Added");
//		}
		service.findAll().forEach(System.out::println);
   System.out.println(service.findByDateOfBirth(LocalDate.of(2001, 10,03)));
    System.out.println("______");
   service.findByLocation("madurai").forEach(System.out::println);
   System.out.println("______");

   service.findBySkillset("java").forEach(System.out::println);
   System.out.println("______");

   service.getBySkillAndPlace("c++","madurai").forEach(System.out::println);
   System.out.println("______");

   service.findBySkillSetAndLocation("c++","chennai").forEach(System.out::println);
   
	}
@Bean
public Employee kawin()
	{
	return new Employee(104,"kumar",LocalDate.of(2031,12,12),"madurai","c++",374080);
	}


}
