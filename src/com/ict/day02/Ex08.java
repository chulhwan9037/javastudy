package com.ict.day02;

public class Ex08 {
	public static void main(String[] args) {
		// 산술연산자 : + , - , * , /
		// 대상연산자 : char, int, long, float, double
		//           문자형,    정수형,       실수형
		
		int su1 = 9 ;
		int su2 = 4 ;
		int result = 0 ; // 결과를 저장하는 놈
		result = su1 + su2 ;
		System.out.println("결과 : " + result);
		System.out.println("결과 : 9 + 4 =" + result); // 오답
		System.out.println("결과 : 9 + 4 = 13"); // 오답
	    System.out.println("결과 : 'su1 + su2' = " + result); // 오답
		// 데이터를 직접 출력하거나 호출하지 말고 변수를 이용해서 출력하거나 호출 하자
	    System.out.println("결과 : " + su1 + "+" + su2 + "=" + result); // 정답
		
		result = su1 - su2 ;
		System.out.println("결과 : " + result);
		System.out.println("결과 : " + su1 + "-" + su2 + "=" + result); // 정답
		
		result = su1 * su2 ;
		System.out.println("결과 : " + su1 + "*" + su2 + "=" + result); // 정답
		
		double result2 = su1 / su2 ;
		System.out.println("결과 : " + su1 + "/" + su2 + "=" + result2);  // 오답
		
		// 정수와 정수가 산술연산을 하면 결과는 정수가 된다.
		// 정수와 실수가 산술연산을 하면 결과는 실수가 된다.
				
		double result3 = su1 / (su2 * 1.0) ;
		System.out.println("결과 : " + su1 + "/" + su2 + "=" + result3); //정답
		
		
		double su3 = 9.0 ;
		double su4 = 4.0 ;
		double result4 = su3 / su4 ;
		System.out.println("결과 : " + su3 + "/" + su4 + "=" + result4); //오답
		
		// 나머지
		result = su1 % su2 ;
		System.out.println("결과 : " + su1 + "&" + su2 + "=" + result); 
		
	}
}

















