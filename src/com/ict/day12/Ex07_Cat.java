package com.ict.day12;

public class Ex07_Cat extends Ex07_Animal{
	int id = 124123 ;
	
	public Ex07_Cat() {
		// super([인자]); 생략되어 있음.
		// super : 부모클래스의 주소를 참조한다.
		// super([인자]) : 부모클래스의 생성자
		super("짜오", 3);
		System.out.println("자식생성자");
	}
	// 모든 자식 클래스는 부모클래스의 생성자를 참조해야 한다.
	// super([인자]), this([인자])는 둘다 첫줄에만 사용가능
	// 즉, 둘중에 하나만 사용 가능하다. 
	public Ex07_Cat(String name) {
		super(name, 7);
		// this () ;
	}
	public Ex07_Cat(int age) {
		this();
	}
	
}







