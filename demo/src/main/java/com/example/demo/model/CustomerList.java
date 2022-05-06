package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
@Component

public class CustomerList {

	List<Customer>custList;

	
//	@Autowired
//	public List<Customer> getCustList() {
//		return custList;
//	}

//@Autowired
//	public CustomerList(List<Customer> custList) {
//		super();
//		this.custList = custList;
//	}
	
}
