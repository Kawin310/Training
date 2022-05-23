package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CreditCard;
import com.example.demo.repo.CreditCardRepository;

@Service
public class CreditCardService {

	@Autowired
	private CreditCardRepository repo;
	
	@Cacheable("cards")
	public List<CreditCard> getAll()
	{
		return this.repo.findAll();
	}
	
	@Cacheable(value = "cards",key="#cardNumber")
	public CreditCard getById(long cardNumber)
	{
		return this.repo.findById(cardNumber)
				.orElseThrow(()-> new RuntimeException("Not Found"));
	}
	
	@CachePut(value = "card" , key="#entity.cardNumber")
	public CreditCard addCard(CreditCard entity)
	{
		return this.repo.save(entity);
	}
	@CacheEvict(value = "card" , key="#entity.cardNumber	")
	public void remove(CreditCard entity)
	{
		this.repo.deleteById(entity.getCardNumber());
	}
	
}
