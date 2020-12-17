package com.riigsoft.test;

import com.riigsoft.thread.Dead;

public class DeadLock {
	public static void main(String[] args) throws InterruptedException {
		Dead d = new Dead();
		d.starts();
	}
}
