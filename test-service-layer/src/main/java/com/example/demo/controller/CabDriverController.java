package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;

@RestController
@RequestMapping(path = "/api/v1/drivers")
@CrossOrigin(origins = "*")
public class CabDriverController {

	@Autowired
	private CabDriverService service;
	
	@Value("${server.port}")
	private String port;
	
	@PostMapping
	public ResponseEntity<CabDriver> add(@RequestBody CabDriver entity){

	CabDriver driver = this.service.save(entity);

	return ResponseEntity.status(HttpStatus.CREATED).body(driver);

	}
		
	

	
//	@PostMapping
//	public CabDriver add(@RequestBody CabDriver entity)
//	{
//		return this.service.save(entity);
//		
//	}
	@GetMapping
	public List<CabDriver> findAll()
	{
		return this.service.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public CabDriver findById(@PathVariable("id") int id)
	{
		return this.service.findById(id).orElseThrow(()-> new RuntimeException("Element not found"));
	}
	
	@GetMapping(path = "/srch/{name}")
	public CabDriver findByDriverName(@PathVariable("name")String qryName){
		CabDriver found =  this.service.findByDriverName(qryName);
		found.setLocation(found.getLocation()+":"+port);
		return found;
	}
	
	@DeleteMapping(path="/del/{id}")
	 public Optional<CabDriver> delete(@PathVariable("id") int id) {
	   return service.remove(id);

	}

}
