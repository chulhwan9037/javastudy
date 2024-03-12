package com.ict.day09;

public class Ex01 {
	// 클래스 : 멤머필드, 멤버메서드, 생성자
	// 멤버필드 : 데이터, 상태값, 속성, 특징
	//          변수 : 언제든지 변할 수 있는 상태값.
	//          상수 : 한번지정되면 변경할 수 없는 상태값, final
	// 인스턴스 변수와 상수는 클래스를 객체로 생성될 때 함께 생성되는 변수와 상수이다. 
	// 호출 : 참조변수.멤버필드,        참조변수.멤버머서드()

	// static 변수와 상수는 객체 생성과 상관없이 먼저 만들어져 있는 변수와 상수이다. (static 표시가 있음)
	// 호출 : 클래스이름.멤버필드,       클래스이름.멤버메서드() 
	
	String name = "홍길동" ;             // instance 변수
	int kor = 80 ;                     // instance 변수
	static int eng = 85 ;              // static 변수
	final int MATH = 90 ;              // instance 상수
	static final int COMPUTER = 95 ;   // static 상수
	
	
	// 메모리
	// - 스태틱(static) : 프로그램이 시작 전부터 끝까지 존재하는 메모리 영역
	// - 힙(heap) : 프로그램이 시작할떄는 있거나 중간에 만들어졌다가
	//             어느 순간에는 없어진다. (동적할당)
	//             자기할일을 다하면 사라진다.
	// - 스택(stack) : heap 영역에 생성된 Object 타입의 데이터의 참조값이 할당된다.
	//                원시타입의 데이터가 값과 함께 할당된다.
	//                원시타임(byte,short,int,log,double,float,boolean,char) 타입의
	//                데이터들이 할당된다. 이때 원시타입의 데이터들에 대해서는 참조값을 지정하는 것이
	//                아니라 실제 값을 stack에 직접 저장 하게 된다.
	
	
	
	
	
	
}
