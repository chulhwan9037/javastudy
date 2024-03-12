package com.ict.day09;

public class Ex07 {
	public static void main(String[] args) {
		// static 객체 생성과 상관없이 호출 한다.
		// 호출방법 : 클래스이름.멤버필드, 클래스이름.멤버머서드
		System.out.println(Ex06.kor);
		System.out.println(Ex06.eng);
		System.out.println(Ex06.math);
		System.out.println();
		
		// 메서드도 같다.
		Ex06.play01();
		
		int k = Ex06.play02();
		System.out.println(k);
	}
}
