package com.ict.day04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력 : ");
		int k1 = scan.nextInt();
		//k1 홀수 짝수 판별
		String result = (k1 % 2 == 0) ? "짝수" : "홀수" ;
		
		System.out.println(k1 + " : " + result);

		
		System.out.print("점수 : ");
		int k2 = scan.nextInt();
		// k2가 60 이상이면 합격, 아니면 불합격
		result = (k2 >= 60) ? "합격" : "불합격" ;
		
		System.out.println(k2 + " : " + result);
		
		System.out.print("점수2 : ");
		int k3 = scan.nextInt();
		String result2 = (k3 >= 60) ? "합격" : "불합격" ;
		System.out.println(k3 + " : " + result2);
		
		
		
		
		
		
	}
}
