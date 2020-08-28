package com.riigsoft;

public class Account {

	public double balance;
	
	public void deposit(double amount) {
		if(amount>0)
		balance= balance+amount;
	}
	public void withdraw(double amount) {
		if(amount>0)
			balance= balance-amount;
	}
	public double getBalance() {
		return balance;
	}
	
	//static --only example
	public static void display() {
		System.out.println("From display static method");
	}
}
