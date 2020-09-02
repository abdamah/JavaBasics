package com.riigsoft;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Calculator calc= new Calculator();	
		double d;
		float f;
		
		System.out.println("Enter First Number:");
		d= sc.nextDouble();
		System.out.println("Enter Second Number:");
		f= sc.nextFloat();
		
		System.out.println("Sum is :"+calc.calc(d, f));
	}

}
