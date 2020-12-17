package com.riigsoft.components;

public class LockTwo {
	public synchronized void two(LockOne lockOne) {
		System.out.println("Thread2 start execution Two() method");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thead2 trying to call last() method in LockOne");
		lockOne.last();
	}

	public synchronized void last() {
		System.out.println("last() method inside LockTwo ");
	}
}
