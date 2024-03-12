package com.ict.day09;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex10 t = new Ex10();
		
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		System.out.print("수학 : ");
		int math = scan.nextInt();
		
		
		t.play(name, kor, eng, math);
		
		
	}
}
