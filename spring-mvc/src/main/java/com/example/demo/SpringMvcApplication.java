package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controllers.WelcomeControllers;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		
    SpringApplication.run(SpringMvcApplication.class, args);
    
    List<String> list = new ArrayList<String>();
    WelcomeControllers k = new WelcomeControllers();
	}

}
