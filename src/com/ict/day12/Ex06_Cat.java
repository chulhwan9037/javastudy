package com.ict.day12;

public class Ex06_Cat extends Ex06_Animal{
	public void play() {
		age = age + 10 ;
		System.out.println(age); // 12
	}
	public void play2() {
		// 사용하는 것은 가능
		age = month + 10 ;
		// 데이터를 변경하는 것은 불가능
		// month = month + 10 ;
	}
	
	@Override
	public void sound() {
		System.out.println("야옹~ 야옹~");
	}
	// 부모클래스의 sleep()에 final 있으므로
	// 오버라이딩 할수 없다.
//	@Override 
//	public final void sleep() {
//		System.out.println("15시간 이상 잠을 잔다.");
//	}
	
	
	
}






