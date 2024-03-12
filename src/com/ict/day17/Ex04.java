package com.ict.day17;


	
	// 두개의 스레드를 생성하여 첫번째 스레드에 출력을 1~100까지 출력하고,
	// 두번째 스레드가 출력을 101~200 까지 출력하라(synchronized 사용)
public class Ex04 implements Runnable {
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 1; i < 101; i++) {
			System.out.println(++x + " : " + Thread.currentThread().getName());
		}
	}
	
}
