package com.riigsoft.collection;

import java.util.ArrayList;

public class ChildThread extends Thread {

	 private ArrayList<String> fruits = new ArrayList<String>();

	public  ArrayList<String> getFruits() {
		return fruits;
	}

	public  void setFruits(ArrayList<String> fruits) {
		this.fruits = fruits;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		System.out.println("Child updating List. ");
		fruits.add("Avacado");
	}
}
