package com.ict.day16;

public class Ex09_Main {
	public static void main(String[] args) {
		Ex09_testA testA = new Ex09_testA();
		Ex09_testB testB = new Ex09_testB();
		
		// Runnable 는 start() 가 없으므로 사용 못합
		// testA.start();
		
		// Runnable 을 상속 받은 클래스를 인자로 넣자. 
		Thread t1 = new Thread(testA);
		t1.start();
		
		// 익명 선언을 안했으니까 한번 쓰고 사라짐
		new Thread(testB).start();
		
		// 익명 : 안드로이드식
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("111 : "  + Thread.currentThread().getName());
				}
			}
		}).start();
		
	}
}














