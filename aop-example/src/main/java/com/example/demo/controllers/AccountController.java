package com.example.demo.controllers;

import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.services.AccountService;
import lombok.extern.java.Log;
@RestController
@RequestMapping("/api/v1")
public class AccountController {
	
	private AccountService service;
	
	Logger logger=Logger.getAnonymousLogger();

	@Autowired
	public AccountController(AccountService service) {
		super();
		//logger.info("Accounts Controller Constructor called");
		this.service = service;
	}
	
	
	@GetMapping(path ="/accounts")
  public List<String> getAccounts()
{
		//logger.info("GET Accounts Method Called");
		return this.service.getAccounts();
}
	
}
