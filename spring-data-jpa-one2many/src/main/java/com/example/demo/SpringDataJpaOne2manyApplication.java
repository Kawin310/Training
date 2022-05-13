package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.utils.DoctorUtils;

@SpringBootApplication
public class SpringDataJpaOne2manyApplication {

	public static void main(String[] args) {
		
   ConfigurableApplicationContext ctx=	SpringApplication.run(SpringDataJpaOne2manyApplication.class, args);
//	Patient patient=ctx.getBean(Patient.class);
//	Doctor doc=ctx.getBean(Doctor.class);
   DoctorUtils util=ctx.getBean(DoctorUtils.class);
  // util.create();
   util.findAll();

   ctx.close();
	}

	@Bean
	public Doctor munna()
	{
		Doctor doc=new Doctor();
		doc.setDoctorId(2020);
		doc.setDoctorName("manna");
		doc.setPhoneNumber(6374010);
		doc.setDepartment("ent");
		return doc;		
	}
	
	@Bean
	public Patient magi()
	{
		return new Patient(200,"kavitha",9944);
	}
	
	@Bean
	public Patient kawin()
	{
		return new Patient(201,"kawin",6374);
	}
	
	@Bean
	public Patient rishi()
	{
		return new Patient(202,"rishi",99944);
	}
	
}
