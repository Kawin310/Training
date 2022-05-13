package com.example.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.ifaces.SeminarRepository;

@Component
public class SeminarUtil {

	
	@Autowired
	SeminarRepository repo;
	
	@Autowired
	Seminar semi;
	
	@Autowired
	Speaker speaker;
	
	
	public void add()
	{
		semi.setSpeaker(speaker);
    Seminar added= repo.save(semi);
		
		if(added!=null)
		{
			System.out.println("One Recorded Added");
		}
	}
	public void findAll()
	{
		repo.findAll().forEach(System.out::println);
	}
	
}
