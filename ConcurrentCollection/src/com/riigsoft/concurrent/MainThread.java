package com.riigsoft.concurrent;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		ChildThread ct = new ChildThread();
		ConcurrentHashMap<Integer, String> fruits = new ConcurrentHashMap<Integer, String>();
		fruits.put(101, "Banana");
		fruits.put(102, "Apple");
		fruits.put(103, "Blueberries");
		ct.setFruits(fruits);
		
		ct.start();
		Set<Integer> setkey = fruits.keySet();
		Iterator<Integer> i = setkey.iterator();
		while (i.hasNext()) {
			Integer key = (Integer) i.next();
			System.out.println("Main Thread List Object is :" + key +" = "+fruits.get(key));
			Thread.sleep(3000);
		}
		System.out.println("Fruits are : "+fruits);
	}

}