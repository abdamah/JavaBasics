package com.riigsoft.thread;

import com.riigsoft.components.LockOne;
import com.riigsoft.components.LockTwo;

public class Dead extends Thread {

	LockOne lockOne = new LockOne();
	LockTwo lockTwo = new LockTwo();

	public void starts() {
		this.start();
		lockOne.one(lockTwo);
	}

	public void run() {
		lockTwo.two(lockOne);
	}
}
