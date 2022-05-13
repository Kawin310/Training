package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.utils.SeminarUtil;

@SpringBootApplication
public class SpringDataJpaOne2one1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpaOne2one1Application.class, args);
		
		SeminarUtil util=ctx.getBean(SeminarUtil.class);
		//util.add();
		util.findAll();
	}
	
	
	@Bean
	public Seminar seimnar() {
		
		Seminar semi=new Seminar();
		semi.setDuration(30);
		semi.setId(200);
		semi.setName("Rishi");
		return semi;
	}
	
	
@Bean
public Speaker speaker()
{
	return new Speaker(100,"kawin", "IAS");
	
}
}
