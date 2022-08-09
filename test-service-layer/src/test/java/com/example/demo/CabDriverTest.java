package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.BDDMockito.*;
import static org.hamcrest.Matchers.hasSize;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@AutoConfigureMockMvc
public class CabDriverTest {

	@Autowired
	MockMvc mock;
	
	@Autowired
	ObjectMapper mapper;
	
	@MockBean
	CabDriverService service;
	
	private CabDriver driver;
	
    private CabDriver kawin;
	
    private CabDriver rishi;
     
	@BeforeAll
	void init()
	{
		 driver=new CabDriver(123,"kawin",9934,"MAdurai", LocalDate.of(2001,10,10), 4.5);
		 kawin=new CabDriver(129,"Rishi",9934,"Madurai", LocalDate.of(2001,10,10), 4.5);
		 rishi=new CabDriver(121,"karthi",9934,"Madurai", LocalDate.of(2001,10,10), 4.5);

	}
		
	@DisplayName(value = "Test find All Method return a array")
	@Test
	void testFindAll() throws Exception
	{
		List<CabDriver> list =new ArrayList<CabDriver>();
		list.add(driver);
		list.add(rishi);
		list.add(kawin);
		
		given(service.findAll()).willReturn(list);
		
		mock.perform(MockMvcRequestBuilders
                .get("/api/v1/drivers")
               .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$[2].driverName", is("Rishi")));  		
	}
		
	@DisplayName("Test Add method return status code 201 and return the element added")
	@Test
	void testAdd() throws Exception
	{
		CabDriver parth=new CabDriver(133,"kawin",9934,"MAdurai", LocalDate.of(2001,10,10), 4.5);
		given(service.save(parth)).willReturn(parth);
		
		mock.perform(MockMvcRequestBuilders.post("/api/v1/drivers")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(parth)))
		.andExpect(status().isCreated())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.driverName",is("kawin")));


	}
	public  String asJsonString(CabDriver obj) {
		try {

		//ObjectMapper objectMapper = new ObjectMapper();
			 
		return mapper.writeValueAsString(obj);

		}
		catch(Exception e) {
		throw new RuntimeException(e);
		}
		}
	
	@DisplayName("Test deleteById  Method return a deletedelement")
	@Test
	void testDeleteById() throws Exception {

		Optional<CabDriver> element=Optional.of(kawin);
		
		given(service.remove(123)).willReturn(element);
		
		
		mock.perform(MockMvcRequestBuilders
                .delete("/api/v1/drivers/del/123")
               .contentType(MediaType.APPLICATION_JSON))
              .andExpect(status().isNoContent());
               // .andExpect(jsonPath("$", hasSize(3)))
                //.andExpect(jsonPath("$.driverName", is("kanna")));
                
	}
	

}
