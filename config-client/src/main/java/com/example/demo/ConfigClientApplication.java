package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repositiory.EmployeeRepositiory;

@SpringBootApplication

@EnableDiscoveryClient
public class ConfigClientApplication {

//	@Autowired
//	EmployeeRepositiory repo;
//	@GetMapping(path = "/names")
//	public List<Employee> findAll()
//	{
//		return this.repo.findAll();
//	}
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(ConfigClientApplication.class, args);
		EmployeeRepositiory repo=ctx.getBean(EmployeeRepositiory.class);
		repo.findAll().forEach(System.out::println);
	}

}
