package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepositiory;

@Controller
public class ProductController {

	@Autowired
    private Product entity;	
	@Autowired
	private ProductRepositiory repo;
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String initForm(Model model)
	{
		model.addAttribute("title","Add products");
		model.addAttribute("command",entity);
		return "addProduct";
	}
	
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("command")Product entity)
	{
		int rowAdded;
		try{
			rowAdded=this.repo.add(entity);
		
					return "success";	
		}catch(Exception e)
		{
			e.printStackTrace();
			return "failure";
		}	
	}
	@RequestMapping(value="/search",method=RequestMethod.GET)

	public String searchById(Model model)
	{
		//int id=0;
		model.addAttribute("command","Search product");
	//	System.out.println(id);
		//repo.findById(id)
		return "search";
		
	}
	@RequestMapping(value="/search",method=RequestMethod.POST)
	public String searchForm(@RequestParam("id")int id ,Model model)
	{
		
		Product prod=repo.findById(id);
		
		model.addAttribute("object",prod);
		return "display";
		
		
	}
}
