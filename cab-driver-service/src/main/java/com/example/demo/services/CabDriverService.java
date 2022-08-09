package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CabDriver;
import com.example.demo.repositiory.CabDriverRepositiory;

@Service
public class CabDriverService {

	private CabDriverRepositiory repo;
	
	@Autowired
	public CabDriverService(CabDriverRepositiory repo)
	{
		super();
		this.repo=repo;
	}
	
	public Optional<CabDriver> findById(int id)
	{
		return repo.findById(id);
	}
	
	public CabDriver save(CabDriver entity)
	{
		return repo.save(entity);
	}
	public List<CabDriver> findAll()
	{
		return repo.findAll();
	}
	
	public void remove(int id)
	{
		Optional<CabDriver> foundElement=repo.findById(id);
		if(foundElement.isPresent())
		{
		 repo.deleteById(id);
		}
		else {
			throw new RuntimeException("Element with "+id+"Not present");
		}
	}

	public CabDriver findByDriverName(String qryName){
		
		return repo.findByDriverName(qryName);
	}
}
