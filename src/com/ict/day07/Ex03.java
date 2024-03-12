package com.ict.day07;

public class Ex03 {
	public static void main(String[] args) {
		// char[] ch ;              = 선언
		// ch = new char[4];        = 생성
		// 선언과 생성을 한번에 
		// char[] ch = new char[4];
		char[] ch = new char[4];
		
		// 초기값 넣기
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 65;   // 0~65,535(char의 크기) 안에서는 저장 가능
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		// 선언과 생성과 초기값 넣기를 한번에
		char[] ch2 = {'j','a','v',97};
		int[] k2 = {100,200,300,'a'};
		double[] d2 = {7.15,7.16,7.0,7};
		// 자료형 클래스 이므로 참조자료형 배열 (객체형 배열)  
		String[] s1 = {"홍길동", "이길동", "고길동", "박길동"};
		
		// for문 생성시 가장 최근값을 기본값으로 자동 생성 (xx.length)
		for (int i = 0; i < d2.length; i++) {
		System.out.println(d2[i]);	
		}
		
		
		
	}
}
















