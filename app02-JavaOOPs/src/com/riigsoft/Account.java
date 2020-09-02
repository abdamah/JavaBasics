package com.riigsoft;

public class Account {

	private double balance;
	
	public void deposit(double amount) {
		if(amount>0)
		balance+=amount;
	}
	public void withdraw(double amount) {
		if(amount>0)
			balance-=amount;
	}
	public double getBalance() {
		return balance;
	}
	
	//static --only example
	public static void display() {
		System.out.println("From display() static method");
	}
}
