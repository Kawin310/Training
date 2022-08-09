package com.example.demo.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CabDriver;

public interface CabDriverRepositiory extends JpaRepository<CabDriver, Integer> {
	
	CabDriver findByDriverName(String driverName);
	

}
