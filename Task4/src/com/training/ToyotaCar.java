package com.training;

public class ToyotaCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		String color="blue";
		return color;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		String model="suv";
		return model;
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		double price=9000;
		return price;
	}

	
}
