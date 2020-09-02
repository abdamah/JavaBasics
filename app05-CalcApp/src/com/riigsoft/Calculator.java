package com.riigsoft;

public class Calculator {

	private int sum=0;
	public int sum(int x, int y) {
		return x+y;
	}
	public int sum(int x, int y,int z) {
		return x+y+z;
	}
	public int sum(int...args) {
		for(int x:args)
			sum+=x;//sum = sum+x;
		return sum;
	}
}
