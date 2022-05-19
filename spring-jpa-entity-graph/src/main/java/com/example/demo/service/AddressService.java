package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.repos.AddressRepositiory;
@Service
public class AddressService {

    @Autowired
	private AddressRepositiory repo;
	
	public void task1()
	{
		List<Address> addressList=repo.findAll();
		
		for(Address eachAddress: addressList)
		{
			
			System.out.println(eachAddress.getTitle());
			System.out.println(eachAddress.getCity());
            System.out.println(eachAddress.getUser());		
            
		}
	}
	public void task2()
	{
		List<Address> addressList=repo.findAll();
		
		for(Address eachAddress: addressList)
		{
			
			System.out.println(eachAddress.getTitle());
			//System.out.println(eachAddress.getCity());
            System.out.println(eachAddress.getUser());		
            
		}
	}
	
	public void task3()
	{
		List<Address> addressList=repo.findAll();
		
		addressList.forEach(System.out::println);
	}
}
