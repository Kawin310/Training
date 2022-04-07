package com.task3;

public class SavingsAccount extends BankAccount {

	double balance=25000;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(double minimumBalance, double deposit) {
		super(minimumBalance, deposit);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		
		if(amount<getMinimumBalance())
		{
			System.out.println("Maintain the amount >5000");
		}
		return balance-amount;
	}

	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount>getDeposit())
		{
		System.out.println("withdraw Maximum amount is 10000");	
		}
		return balance-amount;
	}

}
