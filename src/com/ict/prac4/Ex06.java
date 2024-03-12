package com.ict.prac4;


	// 두개의 스레드를 생성 첫번째 1~50
	// 두번째 51~100
	// 다시 첫번째 101~150
	// 두번째 151~200 syncronized 사용


public class Ex06 implements Runnable{
		
		int x = 0;
		@Override
		public synchronized void run() {
			for (int i = 0; i < 100; i++) {
				System.out.println(++x + " : " + Thread.currentThread().getName());
				if(x%50==0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else {
					notify();
				}
			}
		}

	
}
