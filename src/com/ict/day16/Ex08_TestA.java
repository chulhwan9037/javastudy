package com.ict.day16;

public class Ex08_TestA extends Thread {

	// start => start 새로운 스레드 생성 안됨 메인 스레드가 모든 일처리
//	@Override
//	public void start() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println("aaa : " + i + Thread.currentThread().getName());
//		}
//	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaa : " + i + Thread.currentThread().getName());
		}
	}

	
	
}
