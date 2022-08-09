package com.example.demo.controler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProdcutService;

@RestController
public class ProductController {
	
	@Autowired
	private ProdcutService service;
		
	@GetMapping(path = "/products/findall")
	public List<Product> findAll()
	{
		return service.findAll();
	}
	
	@PostMapping(path = "/products/add")
	public ResponseEntity<Product> add(@RequestBody Product entity)
	{
		Product added=service.add(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(added);
	}

}
