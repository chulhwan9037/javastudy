package com.ict.prac18;

public class Ex09 implements Runnable {
	int x = 0;

	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(++x + " : " + Thread.currentThread().getName());
			if (x % 50 == 0) {

				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				notify();
			}
		}

	}
}
