package com.ict.prac3;

public class Ex00_test implements Runnable{

	@Override
	public void run() {
		while (true) {
			
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("00000000");
		}
	}

}
