package com.training;

public class CreditCard {

	private double cardNumber;
	private String cardHolderName;
	private int aountDue;
	
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCard(double cardNumber, String cardHolderName, int aountDue) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.aountDue = aountDue;
	}
	public double getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(double cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public int getAountDue() {
		return aountDue;
	}
	public void setAountDue(int aountDue) {
		this.aountDue = aountDue;
	}
		
}
