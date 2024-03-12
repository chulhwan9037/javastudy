package com.ict.prac;

import java.util.*;

public class ssss {
		
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] a= {"가위","주먹","보"};
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<10;i++) {
			int num= (int)(Math.random()*3);
			System.out.println("가위,바위,보 중 하나를 선택");
			System.out.print(">>>");
			String b=scan.next();
			System.out.println();
			if(b.equals("가위")) {
				if(num==0) {
					System.out.println("나:가위");
					System.out.println("상대편:바위");
					System.out.println("졌습니다");
				}
				if(num==1) {
					System.out.println("나:가위");
					System.out.println("상대편:보");
					System.out.println("이겼습니다");
				}
				if(num==2) {
					System.out.println("나:가위");
					System.out.println("상대편:가위");
					System.out.println("비겼습니다");
				}
				System.out.println();
			}
			if(b.equals("바위")) {
				if(num==0) {
					System.out.println("나:바위");
					System.out.println("상대편:바위");
					System.out.println("비겼습니다");
				}
				if(num==1) {
					System.out.println("나:바위");
					System.out.println("상대편:보");
					System.out.println("졌습니다");
				}
				if(num==2) {
					System.out.println("나:바위");
					System.out.println("상대편:가위");
					System.out.println("이겼습니다");
				}
				System.out.println();
			}
			if(b.equals("보")) {
				if(num==0) {
					System.out.println("나:보");
					System.out.println("상대편:바위");
					System.out.println("이겼습니다");
				}
				if(num==1) {
					System.out.println("나:보");
					System.out.println("상대편:보");
					System.out.println("비겼습니다");
				}
				if(num==2) {
					System.out.println("나:보");
					System.out.println("상대편:가위");
					System.out.println("졌습니다");
				}
				System.out.println();
			}
			
			
			
		}//for(int i=0;i<10;i++)
		
		
		

	}

}
