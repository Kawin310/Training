package com.example.demo.servcice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TripDetail;
import com.example.demo.repositiory.TripDetailRepositiory;

@Service
public class TripService {

	@Autowired
	private TripDetailRepositiory repo;
	
	
	public List<TripDetail> findAll()
	{
		return repo.findAll();
	}
	
	public TripDetail save(TripDetail entity)
	{
		
		return repo.save(entity);
	}
	public List<TripDetail> findByDriverId(int id)
	{
		return repo.findByDriverId(id);
	}
}
