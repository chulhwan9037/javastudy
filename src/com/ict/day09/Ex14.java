package com.ict.day09;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex12 t1 = new Ex12();
		System.out.print("이름 : ");
		String name1 = scan.next();
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		System.out.print("수학 : ");
		int math = scan.nextInt();
		t1.play02(name1, kor, eng, math);
		
		Ex13 t2 = new Ex13();
		System.out.print("이름 : ");
		String name2 = scan.next();
		System.out.print("국어 : ");
		int kor1 = scan.nextInt();
		System.out.print("영어 : ");
		int eng1 = scan.nextInt();
		System.out.print("수학 : ");
		int math1 = scan.nextInt();
		t2.play02(name2, kor1, eng1, math1);
		
		
		
		
		
		
		
	}
	
	
	
}
