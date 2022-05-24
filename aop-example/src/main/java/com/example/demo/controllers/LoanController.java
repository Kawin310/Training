package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.LoanService;

@RestController
@RequestMapping("/api/v1")
 public class LoanController {
 	@Autowired
  private LoanService service;
	
	@GetMapping(path ="/loans")
  public ResponseEntity<String> getLoanDetails()
  {
		//logger.info("GET Accounts Method Called");
		double val=this.service.getInterestRate(600);
		return ResponseEntity.ok(val+"per Annum");
   }

}
