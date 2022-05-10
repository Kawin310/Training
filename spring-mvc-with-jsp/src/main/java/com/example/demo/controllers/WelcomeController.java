package com.example.demo.controllers;

import java.util.List;

//import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepositiory;
@Controller
@RequestMapping("/mvc")
public class WelcomeController {

	private ModelAndView mdlView;
	private ProductRepositiory repo;
	
	@Autowired
	public WelcomeController(ModelAndView mdlView,ProductRepositiory repo) 
	{
		super();
		this.mdlView = mdlView;
		this.repo=repo;
	}
	@RequestMapping(value="/first",method=RequestMethod.GET)
	public String getFirst()
	{
		return "welcome";
	}	
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView getHomePage()
	{
		List<Product>list=repo.findAll();
	    mdlView.addObject("msg",list);
		mdlView.setViewName("home");
		return mdlView;
	}
}

