package com.riigsoft.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		ChildThread ct = new ChildThread();
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Blueberries");
		ct.setFruits(fruits);

		
		ct.start();
		Iterator<String> i = fruits.iterator();
		while (i.hasNext()) {
			String fruit = (String) i.next();
			System.out.println("Main Thread List Object is :" + fruit);
			Thread.sleep(3000);
		}
		System.out.println(fruits);
	}

}
