package com.ict.day02;

public class Ex02 {
	public static void main(String[] args) {
		// 문자형 : char 0-65,535 개의 숫자로 저장된다.(연산이 가능하다.)
		//        그러나 우리는 숫자 대신에 ''(홑따옴표)를 사용한다.('a', 'A', '가'...)
		
		// 선언 
		// char 변수이름 ; (선언)
		// 변수이름 = 데이터('a', 'A', '가'...)
		
		// ch1 이라는 변수에 a를 저장하자
		char ch1 ;
		ch1 = 'a';
		
		// ch1을 화면에 출력하자
		System.out.println(ch1);
		
		ch1 = 'A';
		System.out.println(ch1);
		
		ch1 = 100;
		System.out.println(ch1);
		
		ch1 = 100-32;
		System.out.println(ch1);
		System.out.println(ch1+32);  // 변수에 저장하지 않았으므로 숫자 100이 나온다.
		
		
	}
}


















