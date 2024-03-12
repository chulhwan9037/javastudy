package com.ict.day10;

public class Ex12 {
	public static void main(String[] args) {
		Ex11 t = new Ex11();
		// 변경전 이름 가져오기 
		System.out.println(t.getName());
		// 홍길동 이름을 둘리로 변경하자 
		t.setName("둘리");
		System.out.println(t.getName());
		
		t.setAge(15000);
		System.out.println(t.getAge());
		
		
		
	}
}
