package com.example.demo.entity;

import org.springframework.stereotype.Component;

//import com.example.demo.model.Customer;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Product {

	int productId;
	String productName;
	double price;
	
}
