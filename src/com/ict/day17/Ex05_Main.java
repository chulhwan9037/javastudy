package com.ict.day17;

public class Ex05_Main {
	public static void main(String[] args) {
		Ex05 test = new Ex05();
		Thread thread = new Thread(test,"첫번째");
		//new Thread(test, "첫번째").start();
		Thread thread1 = new Thread(test,"두번째");
		thread.start();
		thread1.start();
		
		System.out.println("main : " + Thread.currentThread().getName());
	}
}









