package com.ict.prac4;

public class Ex06_Main {
	public static void main(String[] args) {
		Ex06 test = new Ex06();
		Thread thread = new Thread(test, "1번");
		Thread thread1 = new Thread(test, "2번");
		thread.start();
		thread1.start();
	}
}
