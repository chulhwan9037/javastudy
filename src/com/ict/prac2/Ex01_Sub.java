package com.ict.prac2;

// 상속관계 (is a 관계) : 자식클래스가 부모 클래스에 멤버필드와 멤버메서드를 마음대로 사용할 수 있는 클래스들 간의 관계
//		 포유류 (부모)
// 			|
//	사람, 강아지, 고양이, 고래 (자식)
// 이때 사람은 포유류이다. (is a 관계) O
// 포유류는 사람이다. X
// 형식) 자식클래스 extends 부모클래스
// 특징) 모든 클래스는 하나의 부모클래스를 갖는드ㅏ. 
//      없으면 Object가 부모 클래스이다.
//      모든 클래스는 Object를 부모클래스로 가지고 있따.
//      다중 상속을 지원하지 않는다. (부모클래스가 하나만 존재)
//
//자식 클래스
public class Ex01_Sub extends Ex01_Sup {
	String name = "홍반장" ;
	int age = 13 ;
	private double weight = 25.1 ;
	
	public Ex01_Sub() {
		System.out.println("자식 생성자 : " + this);
	}
	public void play() {
		// 변수우선 순위
		// 지역변수 > 전역변수(this) > 부모변수(supuer)
		String name = "홍두깨" ;
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		System.out.println();
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
		System.out.println();
		System.out.println(addr);
		System.out.println(this.addr);
		System.out.println(super.addr);
		System.out.println();
		System.out.println(weight);
		
	}
}
