package com.ict.day16;

public class Ex08_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());
		
		Ex08_TestA testA = new Ex08_TestA();
		testA.start();
		Ex08_testB testB = new Ex08_testB();
		testB.start();
		Ex08_testC testC = new Ex08_testC();
		testC.start();
		System.out.println("수고하셨습니다.");
		
		
	}
}






















