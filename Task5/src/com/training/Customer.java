package com.training;

public class Customer {

	private double customerId;
	private String customerName;
	private double phoneNumber;
	private String email;
	
	public Customer(double customerId, String customerName, double phoneNumber, String email) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getCustomerId() {
		return customerId;
	}

	public void setCustomerId(double customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void checkEmailid() throws InvalidEmailException
	{
		if(email.contains("@") && email.contains(".com")&&email.contains("org"))
		{
			System.out.println("Email is valid");
		}
		else {
			
		 throw new InvalidEmailException("Error");
		}
		
	}
	
	
}
