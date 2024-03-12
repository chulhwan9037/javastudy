package com.ict.day09;

public class Ex03 {
	public static void main(String[] args) {
		// Math 클래스 주요 메서드
		//   : 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스
		
		// E, Pi 
		System.out.println(Math.E); // 자연 로그의 밑 값 2.718....
		System.out.println(Math.PI); // 원주율 3.14...........
		
		// 메서드 모두 static 이다. 
		// 생성자는 없다. => 객체 생성으로 할 수 없다.  Math.메서드() 로 접근이 가능하다. 
		
		// 1. random() : 0.0 ~ 1.0 미만의 정해지지 않은 임의의 난수 발생
		System.out.println(Math.random());
		int k1 = (int)(Math.random()); // 무조건 0;
		int k2 = (int)(Math.random()*10); // 0 ~ 9;
		int k3 = (int)(Math.random()*100); // 0 ~ 99;
		int k4 = (int)(Math.random()*3); // 0 ~ 2;
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
		System.out.println(k4);
		
		// 2. ceil() : 올림, round() : 반올림, floor() : 버림.
		System.out.println("ceil : 올림");
		System.out.println(Math.ceil(10.0));        // 10
		System.out.println(Math.ceil(10.1231));     // 11
		System.out.println(Math.ceil(-10.0));       // -10
		System.out.println(Math.ceil(-10.1231));    // -10
		System.out.println();
		System.out.println("floor : 버림");
		System.out.println(Math.floor(10.0));        // 10
		System.out.println(Math.floor(10.9872));     // 10
		System.out.println(Math.floor(-10.0));       // -10
		System.out.println(Math.floor(-10.1231));    // -11
		System.out.println();
		System.out.println("round : 소수점 첫째자리 기준 반올림 =>> 정수로 나온다");
		System.out.println(Math.round(10.0));        // 10
		System.out.println(Math.round(10.3453));     // 10
		System.out.println(Math.round(10.9872));     // 11
		System.out.println(Math.round(-10.0));       // -10
		System.out.println(Math.round(-10.2231));    // -10
		System.out.println(Math.round(-10.7231));    // -11
		System.out.println();
		
		// 3. abs() : 절대값 (양수 => 양수,  음수 => 양수)
		System.out.println("abs : 절대값");
		System.out.println(Math.abs(10));       // 10
 		System.out.println(Math.abs(-10));      // 10
 		System.out.println(Math.abs(-10.0123)); // 10.0123
		System.out.println();
		
		// 4. max(su1,su2) : 큰 값, min(su1,su2) : 작은 값     // 변수 2개만 받을 수 있다.
		System.out.println(Math.max(7, 9.32015)); // 둘다 double로 
		System.out.println(Math.min(7.1215, 9));
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}























