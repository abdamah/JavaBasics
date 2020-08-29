package com.riigsoft;

public class Main {

	public static void main(String[] args) {
		//Parent Object 
		Parent p= new Parent();
		//by using p reference we can access Parent class members
		
		p.pname="Riig";
		p.page=27;
		p.sayHello();
		System.out.println("******************************");
		//printing pname and page
		System.out.println("Parent Class,Your Name is :"+p.pname);
		System.out.println("Parent Class,Your Age is :"+p.page);
		
		System.out.println("******************************");
		//We can also access all members through Child class by inheritance 
		//creating Child class object
		Child c= new Child();
		
		//access members
		c.pname="Abdallah";
		c.page=28;
		c.sayHello();
		System.out.println("******************************");
		//printing out put
		System.out.println("Child Class,Your Name is :"+c.pname);
		System.out.println("Child Class,Your Age is :"+c.page);
	}

}
