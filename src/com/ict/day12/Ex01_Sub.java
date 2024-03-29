package com.ict.day12;

// 상속관계 (is a 관계) : 자식클래스가 부모 클래스에 멤버필드와 멤버메서드를
//                    마음대로 사용할 수 있는 클래스들 간의 관계
//         포유류 (부모)
//           |
// 사람, 강아지, 고양이, 고래. (자식)
// 이때 사람은 포유류이다. (is a 관계) O
//    포유류는 사람이다. X
// 형식) 자식클래스 extends 부모클래스 
// 특징) 모든 클래스는 하나의 부모클래스를 갖는다. 
//     없으면 Object가 부모 클래스이다. 
//     모든 클래스는 Object를 부모클래스로 가지고 있다. 
//     다중 상속을 지원하지 않는다.(부모클래스가 하나만 존재한다.)
//
// 자식 클래스
public class Ex01_Sub extends Ex01_Sup {
	String name = "홍반장" ;
	int age = 13 ;
	private double weight = 81.9 ;
	
	public Ex01_Sub() {
		System.out.println("자식 생성자 : " + this );
	}
	public void play() {
		// 변수 우선 순위
		// 지역변수 > 전역변수(this) > 부모변수(super)
		String name = "홍두깨" ; 
		System.out.println(name);       // 홍두깨
		System.out.println(this.name);  // 홍반장
		System.out.println(super.name); // 홍길동
		
		System.out.println(age);        // 지역변수 없으니까 전역변수
		System.out.println(this.age);   // 전역변수
		
		System.out.println(addr);       // 지역,전역 없음 부모꺼
		System.out.println(this.addr);  // 부모꺼
		System.out.println(super.addr); // 부모꺼
		
		// 자기자신의 private 접근 가능
		System.out.println(weight);       // 자기 private 사용함
		// 부모의 private 접근 불가
		// System.out.println(super.dog); // 부모private 사용못함
		
		
		
		
	}
}











