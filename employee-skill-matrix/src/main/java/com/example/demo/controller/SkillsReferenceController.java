package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SkillsReference;
import com.example.demo.services.SkillReferenceService;

@RestController
@RequestMapping(path = "/api/v1/skillref")
public class SkillsReferenceController {

	@Autowired
	private SkillReferenceService service;
	
	@GetMapping(path = "/findall")
	public List<SkillsReference> findAll()
	{
		return this.service.findAll();
	}
	
	@PostMapping(path = "/add")
	public SkillsReference add(@RequestBody SkillsReference entity)
	{	
		return this.service.add(entity);

	}
}
