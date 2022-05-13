package com.example.demo.enttity.ifaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Doctor;

public interface DoctorRepositiory extends JpaRepository<Doctor, Integer> {

	
	
}
