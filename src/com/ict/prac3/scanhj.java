package com.ict.prac3;

import java.util.Scanner;

public class scanhj {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 숫자를 받아서 홀수 인지 짝수인지 출력하자.
		esc: while (true) {
			int su = 0;
			System.out.println("숫자 입력");
			su = scan.nextInt();

			if (su % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
			while (true) {
				System.out.println("또함? 1.y 2.n ");
				su = scan.nextInt();
				if (su == 1) {
					break;
				} else {
					if (su == 2)
						break esc;
				}
			}

		}
		System.out.println("끝");
	}
}
