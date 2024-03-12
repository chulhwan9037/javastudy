package com.ict.prac18;

public class Ex09_Main {
	public static void main(String[] args) {
		Ex09 test = new Ex09();
		Thread thread = new Thread(test,"첫번째");
		Thread thread2 = new Thread(test,"두번째");
		thread.start();
		thread2.start();
		
		System.out.println("main : " + thread.currentThread().getName());
	}
}
