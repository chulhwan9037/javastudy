package com.ict.day04;

public class Ex05 {
	public static void main(String[] args) {
		// if ~ else 문 
		// 삼항연산자와 비슷하게 처리
		// 즉, 조건식이 참일 때와 거짓일때 각각 나눠서 처리한다. 
		// 주의사항 한줄은 {}(블록)생략 가능
		// if(조건식){
		//     조건식이 참일때 실행 ;
		//     조건식이 참일때 실행 ;
		//     조건식이 참일때 실행 ;
		// } else {
		//     조건식이 거짓일 때 실행 ;
		//     조건식이 거짓일 때 실행 ;
		//     조건식이 거짓일 때 실행 ;
		// }
		
		// int k1이 홀수인지 짝수인지 판별 
		// 힌트) 어떤 수를 2 나눈 나머지가 0이면 짝수, 1이면 홀수.
		int k1 = 17 ;
		String result ;
		if (k1 % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";			
		}
		System.out.println("k1 : " + result + "입니다." );
		
		
		// int k2가 60이상이면 합격, 아니면 불합격 k2 = 70
		int k2 = 900 ;
		String result1 ;
		if (k2 >= 60) {
			result1 = " 합격 ";
		} else {
			result1 = " 불합격 ";
		}
		System.out.println("k2 : " + result1 + "입니다.");
		
		
		// int k3가 1이면 가격의 10퍼센트를 할인 판매한다. k3 = 1, price = 1000
		int k3 = 2;
		int price = 1000 ;
		int result2 = 0 ;
		if (k3 == 1) {
			result2 = (int)(price*0.9); // price - (int)(price*0.1);
		} else {
			result2 = price ;
		}
		System.out.println("판매가 : " + result2);
	
		// char k4 = 대문자인지 아닌지 판별하라. char k4 = 'A'
		char k4 = 'c' ;
		String result3 ;
		if (k4 >= 'A' && k4 <= 'Z') {
			result3 = "대문자 입니다.";
		} else {
			result3 = "대문자가 아닙니다.";
		}
		System.out.println("결과 : " + result3);
		
		// 근무시간이 8시간까지는 시간당 9860원이고 
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10시간이다. 
		// 얼마를 받아야 하는가?
		int time = 10;
		int dan = 9860;
		int lmit = 8 ;
		int result4 = 0 ;
		if (time <= 8) {                 // (time > 8)
			result4 = time*dan ;         // result4 = (time-lmit)*(int)(1.5*dan) + lmit*dan ; 
		} else {
			result4 = (time-lmit)*(int)(1.5*dan) + lmit*dan ; // result4 = time*dan ; 
		}
		System.out.println("수입 : " + result4);	
	}
}

















