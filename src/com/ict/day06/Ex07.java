package com.ict.day06;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 전체횟수, 짝수횟수, 퍼센트(소수점 첫째자리까지)
		
		int total= 0;
		int jnum =0;
		double jper = 0;
		esc : while (true) {
			System.out.print("숫자를 입력하세요");
			int su = scan.nextInt();
			String result1 = "";
			if (su%2==0) {
				result1 = "짝수.";
				jnum ++ ;
			} else {
				result1 = "홀수.";
			}
			System.out.println(su + "는 " +  result1 + "입니다.");
			total ++;
			while (true) {
				System.out.print("계속할까요?(1.Yes, 2.No)>>>>");
				int res = scan.nextInt();
				if(res ==1 ) continue esc;
				if(res ==2 ) break esc;
				
				System.out.println("제대로 입력하세요.");
			}
		
		}
		jper = (int)(jnum*1.0/total*100*10)/10.0;
		
		System.out.println("전체횟수는 : "+ total +"번 입니다.");
		System.out.println("짝수횟수는 : "+ jnum +"번 입니다.");
		System.out.println("짝수확률은 : "+ jper +"퍼센트 입니다.");
		System.out.println("수고하셨습니다.");
	}
}











