package com.training.product;

public class Product implements Comparable<Product>{

	private int productId;
	private String productName;
	private double ratePerUnit;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, double ratePerUnit) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", ratePerUnit=" + ratePerUnit
				+ "]";
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		if(o.ratePerUnit>this.ratePerUnit)return 1;
		if(o.ratePerUnit<this.ratePerUnit)return -1;
		

		return 0;
	}
	
}
