package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
	@FieldDefaults(level = AccessLevel.PRIVATE)
	@Component
	@Getter
	@ToString
	@NoArgsConstructor


public class Bill {
	Customer Customer;
	Product product;
	
	@Autowired
	public void setCustomer(@Qualifier("kawin")Customer customer) {
			Customer = customer;
		}
	@Autowired
		public void setProduct(Product product) {
			this.product = product;
		}

}
