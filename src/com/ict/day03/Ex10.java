package com.ict.day03;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		// 패키지가 java.lang에 존재하는 클래스를 사용할 때는 import 를 할 필요 없다.
		// java.lang 이외에 존재하는 클래스를 사용하기 위해서는 import 를 해야 한다.
		// import 란 해당 클래스의 위치를 표시하므로 해당 클래스를 사용할 수 있게 한다.
		
		// 키보드에 입력한 정보를 받아서 scan 변수에 저장하자
		Scanner scan = new Scanner(System.in) ;
		System.out.print("이름 : ");
		
		// .next() : 입력한 내용을 String 으로 처리하는 메서드
		String name = scan.next();
		System.out.println("당신의 이름 : " + name);
		
		System.out.print("나이 : " );
		String age = scan.next();
		System.out.println("당신의 나이 : " + (age + 1));
		
		// .nextInt(); : 입력한 내용을 int형으로 처리하는 메서드
		System.out.print("나이2 : " );
		int age2 = scan.nextInt();
		System.out.println("당신의 나이2 : " + (age2 + 1));
		
		System.out.print("키 : ");
		// .nextDouble() : 입력한 내용을 double형으로 처리하는 메서드
		double height = scan.nextDouble();
		System.out.println("당신의 키는 " + height + "입니다.");
		
		

		
	}
}










