package com.riigsoft.components;

public class LockOne {
	public synchronized void one(LockTwo lockTwo) {
		System.out.println("Thread1 start execution one() method");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thead1 trying to call last() method in LockTwo");
		lockTwo.last();
	}

	public synchronized void last() {
		System.out.println("last() method inside LockOne ");
	}
}
