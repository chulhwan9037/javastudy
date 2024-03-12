package com.ict.prac3;

public class Ex00_main {
	public static void main(String[] args) {
		
		Ex00_test tes = new Ex00_test();
		Thread thread = new Thread(tes);
		thread.setDaemon(true);
		thread.start();
		while (true) {
			for (int i = 0; i < 15; i++) {
				System.out.println(i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}break;
			}
		
		
	}
}
