package com.riigsoft.calc;

public class CalcApp {

	public static void main(String[] args) {
		Calculator calc= new Calculator();
		calc.sum(20,30);
		calc.sum(20,30,40);
		calc.sum(20,30,40,60,90);
		
	}
}
