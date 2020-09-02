package com.riigsoft.calc;

public class Calculator {

	private int sum=0;
	public void sum(int x,int y) {
		System.out.println(x+y);
	}
	public void sum(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	public void sum(int...x) {
		for(int i:x)
			sum+=i;
		System.out.println(sum);
			
	}
}
