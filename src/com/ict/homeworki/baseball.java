package com.ict.homeworki;

import java.util.Random;
import java.util.Scanner;

public class baseball {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int total = 0;
		int[] com = new int[3];
		int[] user = new int[3];
		for (int i = 0; i < com.length; i++) {
			com[i] = ran.nextInt(10);
			for (int j = 0; j < i; j++) {
				if(com[i] == com[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < user.length; i++) {
			System.out.print(com[i]);
		}
		System.out.println();
		esc : while (true) {
			total++;
			for (int i = 0; i < user.length; i++) {
				System.out.print("숫자를입력");
				user[i] = scan.nextInt();
				System.out.print(user[i]+"\t");
				System.out.println();
			}
			for (int i = 0; i < user.length; i++) {
				for (int j = 0; j < user.length; j++) {
					if (com[i]==user[i] && i == j) {
						System.out.println("strike");
						break;
					}else if (com[i]==user[i] && i != j) {
						System.out.println("ball");
						break;
					}else {
						
					}
				}
			}
						
			System.out.println("총 : " + total);
			
		}
	}
}
