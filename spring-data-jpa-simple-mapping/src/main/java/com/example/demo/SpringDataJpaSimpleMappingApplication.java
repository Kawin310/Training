package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.repo.DoctorService;

@SpringBootApplication
public class SpringDataJpaSimpleMappingApplication {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext ctx=	SpringApplication
			.run(SpringDataJpaSimpleMappingApplication.class,args);
	
	Doctor siva=ctx.getBean(Doctor.class);
	DoctorService service=ctx.getBean(DoctorService.class);
//	Doctor added=service.add(siva);
//	if(added!=null)
//	{
//		System.out.println("One Doctor Added");
//	}
	service.findAll().forEach(System.out::println);
	System.out.println("____________");
	//System.out.println(service.findByDept("ktm"));
	System.out.println("____________");

	//System.out.println(service.findByDoctorName("Rishi"));
	System.out.println("____________");
System.out.println(service.getByNameDept("Kawin","ktm"));

	ctx.close();
	}

	@Bean
	public Doctor siva()
	{
		return new Doctor(2023,"Rishi","pubg",63740);
	}
}
