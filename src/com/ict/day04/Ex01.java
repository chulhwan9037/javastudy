package com.ict.day04;


public class Ex01 {
	public static void main(String[] args) {
		// 삼항 연산자 
		// 형식) 자료형 변수 = (조건식) ? 참일 때 실행할 문장 : 거짓일 때 실행할 문장 ; 
		
		// int k1 이 홀수인지 짝수인지 판별하자. 
		// 힌트) 어떤 수를 2로 나눈 나머지가 0이면 짝수, 1이면 홀수가 된다. 
		
		int k1 = 111 ;
		int res = k1 % 2 ;
		
		// 자료형 변수 = (res == 1) ? "홀수" : "짝수" ; 
		String result = (res == 0) ? "짝수" : "홀수" ;
		System.out.println(k1 + " : " + result);
		
		// 한줄로(현업)
		result = (k1 % 2 == 0)? "짝수" : "홀수" ;
		System.out.println(k1 + " : " + result);
		
		// int k2 가 60 이상이면 합격, 아니면 불합격
		int s1 = 55 ;
		result = (s1 >= 60)? "합격" : "불합격" ; // 스트링 또 쓸필요 x 
		System.out.println(s1 +" : " + result );
		
		int k2 = 80 ;
		result =(k2 >= 60)? "합격" : "불합격" ;
		System.out.println(k2 + " : " + result);
		
		// k3가 1이면 원가 가격에 0.1(10%) 할인 한다.
		int k3 = 3 ;
		int price = 1000 ;
		int res2 = (k3 == 1) ? price - (int)(price*0.1) : price  ; 
		// result = (k3 == 1) ? price - (price/10) : price  ; 
		// result = (k3 == 1) ? (int)(price*0.9) : price  ; 
		System.out.println("결과 : " + res2);
		 
		// char k4 = 대문자인지, 대문자가 아닌지 판별하자.
		
		char k4 = 'C' ;
		result = (k4 >= 'A' && k4 <='Z') ? "대문자" : "대문자아님" ;
		System.out.println("결과 : " + result);		
				
		// 근무시간이 8시간 까지는 시간당 9,860원 
		// 8시간 초과한 시간 부터는 1.5 배 지급한다.
		// 현재 근무한 시간이 10시간 이다. 
		// 얼마를 받아야 하는가?
		
		//int si = 9860 ;
		//int si1 = (int)(9860*1.5) ;
		//int h = 10 ;
				
		//자료형 변수 = (h > 8) ? si1 : si ; 
		
		int time = 10 ;
		int dan = 9860 ;
		int don = (time > 8) ? 8*dan + (time-8) * (int)(dan*1.5) : time*dan ;
		System.out.println("결과 : " + don);
		
		
		
	}
}





































