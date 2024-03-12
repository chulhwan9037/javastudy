package com.ict.day06;

public class Ex02 {
	public static void main(String[] args) {
		// break 와 continue
		// break : 현재 위치의 블록(while,for,switch)을 탈출할 때 사용 예약어.
		// continue : continue문 이하 수행문을 포기하고 다음 회차로 진행하는 예약어.
		//            for문인 경우는 증감식으로 이동, while문인 경우는 조건식으로 이동.
		//            보통 if문과 함께 사용한다.
		
		// 1~10 까지 출력
		for (int i = 1; i < 11; i++) {
			// 이스케이프문자(제어문자)
			// \n => 줄바꿈 , \t => 탭, \' => ', \" => ". (쌍따옴표 안에 작성 ("\t")
			System.out.print(i + " ");   // "\t" 			
		}
		System.out.println();
		
		// 1~10 까지 출력 6에서 break 사용
		for (int i = 1; i < 11; i++) {
			if(i == 6) break;
			System.out.print(i + " "); 
		}
		System.out.println();
		
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " "); 
			if(i == 6) break;
		}
		System.out.println();
		
		// 1~10 까지 출력 6에서 continue 사용 // continue 사용 회차 점프;
		for (int i = 1; i < 11; i++) {
			if(i == 6) continue;
			System.out.print(i + " "); 
		}
		System.out.println();
		// 의미없음
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " "); 
			if(i == 6) continue;
		}
		System.out.println();
		
		// 짝수만
		for (int i = 0; i < 11; i++) {
			if(i%2==1) continue;
			System.out.print(i + " ");
		}
		System.out.println();
	}
}











