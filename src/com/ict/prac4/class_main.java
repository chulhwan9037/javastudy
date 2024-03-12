package com.ict.prac4;

public class class_main {
	public static void main(String[] args) {
	
		// class 클래스에 static 변수와 상수가 있다. 
		// 객체 생성 없이 호출 할 수 있다. 
		int k1 = calss.eng ;
		int k2 = calss.COMPUTER;
		
		System.out.println("영어 : " + k1);
		System.out.println("컴퓨터 : " + k2);
		
		// calss 클래스를 객체로
		// 해당 클래스에 생성자가 없으면 기본 생성자
		// 클래스이름() => 인자가 없는 생성자를 기본생성자
		calss t = new calss();
		System.out.println(t);
		
		System.out.println("국어 : " + t.kor);
		System.out.println(t.name);
		System.out.println(t.MATH);
		System.out.println();
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println();
		
		t.kor = 90 ;
		System.out.println("국어 : "  + t.kor);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

