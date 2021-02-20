package com.riigsoft.concurrent;


import java.util.concurrent.ConcurrentHashMap;

public class ChildThread extends Thread {

	 private ConcurrentHashMap<Integer,String> fruits = new ConcurrentHashMap<Integer,String>();

	public  ConcurrentHashMap<Integer, String> getFruits() {
		return fruits;
	}

	public  void setFruits(ConcurrentHashMap<Integer,String> fruits) {
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
		fruits.put(104,"Avacado");
	}
}

