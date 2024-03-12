package com.ict.homeworki;

import java.util.Random;
import java.util.Scanner;

public class baseball2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] com = new int[3];
		int[] user = new int[3];
		int total = 0 ;
		int out = 0 ;
		for (int i = 0; i < com.length; i++) {
			com[i] = ran.nextInt(10);
			for (int j = 0; j < i; j++) {
				if(com[i] == com[j]) {
					i--;
				}
			}
		}
			
		for (int i = 0; i < user.length; i++) {
			System.out.print(com[i] + " ");
		}
		esc : while (true) {
		System.out.println();
		for (int i = 0; i < user.length; i++) {
			total++;
			System.out.print("숫자를입력");
			user[i] = scan.nextInt();
			System.out.print(user[i]+ " ");
			
		}
		System.out.println();
		if (com[0] == user[0]) {
			System.out.println("스트라이크");
		}else if (com[0] == user[1]) {
			System.out.println("볼");
		}else if (com[0] == user[2]) {
			System.out.println("볼");
		}
		if (com[1] == user[1]) {
			System.out.println("스트라이크");
		}else if (com[1] == user[0]) {
			System.out.println("볼");
		}else if (com[1] == user[2]) {
			System.out.println("볼");
		}
		if (com[2] == user[2]) {
			System.out.println("스트라이크");
		}else if (com[2] == user[0]) {
			System.out.println("볼");
		}else if (com[2] == user[1]) {
			System.out.println("볼");
		}
		if (com[0] == user[0] && com[1] == user[1] && com[2] == user[2]) {
			break esc;
		}else if (com[0] != user[0] && com[1] != user[1] && com[2] != user[2] &&
				com[0] != user[1]&& com[0] != user[2]&& com[1] != user[0]&& com[1] != user[2]
				&&com[2] != user[0] &&com[2] != user[1]) {
			System.out.println("아웃");
			out ++ ;
		}
		
		}
		System.out.println("총:"+total/3+"번째에 성공"+"  " + out+"아웃");
	}
}
