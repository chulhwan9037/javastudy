package com.ict.day06;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 숫자를 받아서 홀수 인지 짝수인지 출력하자.
		esc : while (true) {
			System.out.print("숫자를 입력하세요");
			int su = scan.nextInt();
			String result1 = "";
			if (su % 2 == 0) {
				result1 = "짝수";
			} else {
				result1 = "홀수";
			}
			System.out.println(su + "는" + result1 + "입니다.");
			while (true) {
				System.out.print("계속 할까요?(1.yes, 2.no) >> ");
				int res = scan.nextInt();
				if (res == 1)continue esc ;
				if (res == 2)break esc ;
				System.out.println("제대로 입력하세요.");
			}// 안쪽 while
		}// 바깥족 while
		System.out.println("수고하셨습니다.");
	}
}




