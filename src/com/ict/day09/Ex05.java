package com.ict.day09;

public class Ex05 {
	public static void main(String[] args) {
		// Ex04 클래스를 객체로 만들어야 사용가능
		// Ex04가 가지고 있는 필드와 메서드를 사용할 수 있다.
		
		// Ex04 클래스를 객체로 만들기 (전역변수, 메서드 생성 but 지역변수 생성은 안됨)
		Ex04 t = new Ex04();
		
		System.out.println(t.name);
		
		// Ex04 에 있는 play01 메서드를 호출하자. 
		// play01 이 void 이기 때문에 데이터를 가져오지는 않는다. 
		//System.out.println(1);
		System.out.println(t.total);
		t.play01();
		System.out.println(t.total);
		//System.out.println(4);
		
		t.play02();
		//System.out.println(t.sum); // void 지역변수 값을 반환 할 수 없다.
		
		int k = t.play03(); // 반환형이 있으면 반드시 반환형을 받아 저장해줘야 한다. 
		System.out.println(k);
		
		int k1 = t.play04();
		System.out.println(k1);
		
		
		
	}
}
