package com.ict.prac3;

import java.util.Scanner;

public class ddddddddddd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
			System.out.print("입력");
			int su = scan.nextInt();
			break;
			} catch (Exception e) {
				System.out.println("다시");
				scan.next();
			}
		}
		System.out.println("벗어남");
		
	}
}
