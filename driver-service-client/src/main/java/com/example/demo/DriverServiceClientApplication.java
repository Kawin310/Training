package com.example.demo;

import org.aopalliance.intercept.Interceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Driver;

@SpringBootApplication
public class DriverServiceClientApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(DriverServiceClientApplication.class, args);
		Client client=ctx.getBean(Client.class);
		System.out.println(client.invokeGetAll());
//		for(Driver eachDriver:list)
//		{
//			System.out.println("driver Id:="+eachDriver.getDriverId());
//			System.out.println("driver name:="+eachDriver.getDriverName());
//			System.out.println("driver Rating:="+eachDriver.getRating());
//
//		}
//		client.add();
		ctx.close();
	}

	@Bean
	public RestTemplate template()
	{
		RestTemplate template= new RestTemplate();
		template.getInterceptors().add(interceptor());
		return template;
	}
	@Bean
	public BasicAuthenticationInterceptor interceptor()
	{
		return new BasicAuthenticationInterceptor("india","india");
	}
}
