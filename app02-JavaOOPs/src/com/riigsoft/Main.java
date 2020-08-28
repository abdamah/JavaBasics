package com.riigsoft;

public class Main {

	public static void main(String[] args) {
		//create Account class object 
		Account acc= new Account();
		//call the method using acc reference
		acc.deposit(4000);
		acc.withdraw(3000);
		//get balance 
		System.out.println(acc.getBalance());
		
		System.out.println("-------------------");
		
		//calling static method
		
		//uising class name[recommended]
		Account.display();
		//or using reference [real time not good]
		acc.display();
	}

}
