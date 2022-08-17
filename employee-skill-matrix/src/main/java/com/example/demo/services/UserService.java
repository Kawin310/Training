package com.example.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserInfo;
import com.example.demo.ifaces.UserRepository;

@Service
public class UserService {

	private UserRepository repo;
	
	@Autowired
	public UserService(UserRepository repo) {
		super();
		this.repo = repo;
	}

	public UserInfo add(UserInfo entity)
	{
		return this.repo.save(entity);
	}
	
	
}
