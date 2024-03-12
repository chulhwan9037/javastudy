package com.ict.day06;

import java.util.Scanner;

public class Ex07_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//전체횟수, 짝수횟수, 퍼센트
		
		int count = 0;
		int even = 0;
		esc : while (true) {
			count++;
			System.out.print("숫자입력");
			int su = scan.nextInt();
			String result = "";
			if (su%2==0) {
				result = "짝수";
				even++;
			} else {
				result="홀수";
			}
			System.out.println(su +"는 "+result+" 입니다.");
			while (true) {
				System.out.print("계속 할까요? (1.Yes 2.No)>>>");
				int res = scan.nextInt();
				if(res == 1 ) continue esc;
				if(res == 2 ) break esc;
				
				System.out.println("다시 입력해주세요.");
			}
		}
		System.out.println("수고하셨습니다.");
		double per = even/(count*1.0)*100;
		System.out.println("전체횟수 : "+ count);
		System.out.println("짝수횟수 : "+ even);
		System.out.println((int)(per*100)/100.0+"%");
		
		
		
		
	}
}
