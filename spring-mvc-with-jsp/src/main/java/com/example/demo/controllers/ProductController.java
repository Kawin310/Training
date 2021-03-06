package com.example.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepositiory;

@Controller
public class ProductController
{

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
	    //System.out.println(id);
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
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String deleteById(Model model)
	{
		//int id=0;
		model.addAttribute("command","Search product");
	   //System.out.println(id);
		//repo.findById(id)
		return "delete";	
	}
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String deleteForm(@RequestParam("id")int id ,Model model)
	{
		repo.remove(id);
		model.addAttribute("object","One row deleted");
		return "display";			
	}	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String indexForm(Model model)
	{
		model.addAttribute("object","Index Page");
		return "index";		
	}	
}