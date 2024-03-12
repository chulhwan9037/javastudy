package com.ict.day09;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex08 t = new Ex08();

		// 이름
		System.out.println("이름 : ");
		String name = scan.next();
		t.play01(name);
		
		// 점수
		System.out.println("국어 : ");
		int kor = scan.nextInt();

		System.out.println("영어 : ");
		int eng = scan.nextInt();
		
		System.out.println("수학 : ");
		int math = scan.nextInt();
		
		t.play02(kor, eng, math);
		
		t.play03();
		
		t.play04();
		
		// 출력하기
		t.play05();
		
		
		
		
	}
}
