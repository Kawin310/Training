package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Driver;
import com.example.demo.ifaces.DriverRepository;

@Service
public class DriverService {

//	@Autowired
//	private Driver driver;
	@Autowired
	private DriverRepository repo;
	
	@Autowired
	public DriverService(DriverRepository repo) {
		super();
		this.repo = repo;
	}

	public List<Driver> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	public Driver addDriver(Driver entity)
	{
		return this.repo.save(entity);
	}
	public Driver findById(int id)
	{
		return this.repo.findById(id)
				.orElseThrow(()->new RuntimeException(id +" not found"));
	}
	public void deleteById(int id)
	{	
		this.repo.deleteById(id);					
	}	
	public List<Driver> findByDriverName(String srchName)
	{
		return this.repo.findByDriverName(srchName);
	}
	public List<Driver> srchByMobileNumber(long mobileNumber)
	{
		return this.repo.findByMobileNumber(mobileNumber);
	}
	public List<Driver> srchByDriverRating(double rating)
	{
		return this.repo.searchByRating(rating);
	}
	public int updateRating(int id,double updatedRating)
	{
		return this.repo.modifyRating(id,updatedRating);
	}	
}
