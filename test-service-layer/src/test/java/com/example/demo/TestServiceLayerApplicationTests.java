package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class TestServiceLayerApplicationTests {

	@Autowired
	CabDriverService service;
	
	@BeforeAll
	void setUp()
	{
		CabDriver driver=new CabDriver(122,"kawin",9934,"MAdurai", LocalDate.of(2001,10,10), 4.5)	;
	service.save(driver);
	}
	@Test
	@DisplayName(value = "Find all method Should Return a empty Array")
	void testFindAll() {
		
		assertTrue(service.findAll().isEmpty());
	}
	@Test
	@DisplayName(value = "Find all method Should Return a Array")
	void testFindAllSuccess() {
		
		assertFalse(service.findAll().isEmpty());
	}

     @Test
     @DisplayName(value = "find by id Method should return an element With the given Id")
     void testFindById()
 
     {
    	assertEquals("kawin",service.findById(122).get().getDriverName());
    	 
     }   	 
	

}
