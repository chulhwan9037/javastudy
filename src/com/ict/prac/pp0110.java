package com.ict.prac;

import java.util.Random;
import java.util.Scanner;

public class pp0110 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int total = 0;
		int win = 0;
		int lose = 0;
		int draw = 0;
		double score = 0;
		
		while (true) {
			System.out.print("가위//바위//보");
			int user = scan.nextInt();
			String uc = "";
			
			if (user==1) {
				uc ="가위";
			}else if (user==2) {
				uc="바위";
			}else if (user==3) {
				uc="보";
			}
			System.out.println(uc);
			System.out.println();
			
			int com =ran.nextInt(3);
			int resultc= 0;
			String cc= "";
			
			if (com==0) {
				resultc = 1;
				cc="가위";
			}else if (com==1) {
				resultc =2;
				cc="바위";
			}else if (com==2) {
				resultc=3;
				cc="보";
			}
			System.out.println("컴"+cc);
			System.out.println();
			
			if(user ==1 &&resultc==1) {
				System.out.println("비김");
				draw++;
			}else if(user ==1 &&resultc==2) {
				System.out.println("패배");
				lose++;
			}else if(user ==1 &&resultc==3) {
				System.out.println("승리");
				win++;
			}
			if(user ==2 &&resultc==1) {
				System.out.println("승리");
				draw++;
			}else if(user ==2 &&resultc==2) {
				System.out.println("비김");
				lose++;
			}else if(user ==2 &&resultc==3) {
				System.out.println("패배");
				win++;
			}
			
		}
		
		
	}
}
