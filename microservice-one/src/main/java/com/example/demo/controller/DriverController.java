package com.example.demo.controller;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;
import com.example.demo.service.DriverService;
@RestController
@RequestMapping(value = "/api/v1")
public class DriverController {

	
	private DriverService service;
	@Autowired
	public DriverController(DriverService service) {
		super();
		this.service = service;
	}
	@GetMapping(path="/drivers")
	public List<Driver> getAllDrivers()
	{
		
		return this.service.findAll();
	}	
//	@PostMapping(path = "/drivers")
//	public Driver addDriver(@RequestBody Driver entity)
//	{
//		return this.service.addDriver(entity);
//	}	
	@GetMapping(path="/drivers/{id}")
	public Driver getDriverById(@PathVariable("id")int id)
	{
		return this.service.findById(id);
	}	
	@PostMapping(path="/drivers")
	public ResponseEntity<Driver> addDriver(@RequestBody Driver entity) {
		
		Driver driver = this.service.addDriver(entity);
		URI location= ServletUriComponentsBuilder
				.fromCurrentRequest()//http://localhost:8080/api/v1/drivers
					.path("/{id}")//http://localhost:8080/api/v1/drivers/{id}
						.buildAndExpand(entity.getDriverId())//http:localhost:8080/api/v1/drivers/103
							.toUri();
		
		return ResponseEntity.created(location).body(driver);

		//return ResponseEntity.status(HttpStatus.CREATED).body(driver);
	}
	@DeleteMapping(path="/drivers/{id}")  
	public ResponseEntity<String> deleteById(@PathVariable int id){
		
		try {
			this.service.deleteById(id);
			//return ResponseEntity.status(204).build();
			return ResponseEntity.status(HttpStatus.CREATED).body("One Record Deleted "+id);
			}
			catch(Exception e){
				return ResponseEntity.status(400).build();
			}
	}
	@GetMapping(path="/drivers/srch/{mobileNumber}")
	public List<Driver> getDriverBymobileNumber(@PathVariable("mobileNumber")long id)
	{
		return this.service.srchByMobileNumber(id);
	}
	@PutMapping(path = "/drivers/update/{id}/{rating}")
	public ResponseEntity<String> updateRating(@PathVariable("id")int id,@PathVariable("rating")double updatedRating)
	{
		int update=this.service.updateRating(id, updatedRating);
		return ResponseEntity.status(HttpStatus.OK).body(" Record updated "+update);
	}	
	@GetMapping(path="/drivers/srch/name/{name}")
	public List<Driver> findByDriverName(@PathVariable("name")String srchName)
	{
		return this.service.findByDriverName(srchName);
	}		
	@GetMapping(path="/drivers/srch/rating/{rating}")
	public List<Driver> getDriverByRating(@PathVariable("rating")double id)
	{
		return this.service.srchByDriverRating(id);
	}	
}			