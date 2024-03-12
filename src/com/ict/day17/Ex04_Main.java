package com.ict.day17;

public class Ex04_Main {
	public static void main(String[] args) {
		Ex04 test = new Ex04();
		Thread thread = new Thread(test,"첫번째");
		Thread thread1 = new Thread(test,"두번째");
		thread.start();
		thread1.start();
		
		System.out.println("main : " + Thread.currentThread().getName());
		
		
	}
}










