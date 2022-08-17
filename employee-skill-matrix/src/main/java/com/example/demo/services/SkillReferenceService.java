package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SkillsReference;
import com.example.demo.ifaces.SkillsReferenceRepo;

@Service
public class SkillReferenceService {

	@Autowired
	private SkillsReferenceRepo repo;
	
	public SkillsReference add(SkillsReference entity)
	{
		return this.repo.save(entity);
	}
	
	public List<SkillsReference> findAll()
	{
		return this.repo.findAll();
	}
}
