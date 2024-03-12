package com.ict.day13;

public class Ex10_Main {
	public static void main(String[] args) {
		// 인터페이스는 객체 생성 안됨.
		// Ex06_Add t1 = new Ex06_Add();
		
		// 추상클래스도 객체 생성 안됨.
		// Ex08_Oper t2 = new Ex08_Oper(); 
			
		// 일반 클래스 가능
		Ex09_Calc t3 = new Ex09_Calc(); 
		double res = t3.plus(10, 4)  ;
		double res1 = t3.minus(40, 22);
		double res2 = t3.mul(2, 6);
		double res4 = t3.div(15, 5);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res4);
		
	}
}


















