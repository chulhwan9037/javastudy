package com.ict.day03;

public class Ex06 {
	public static void main(String[] args) {
		// 이름이 홍길동인 사람의 점수가 
		// 국어는 90점 영어는 80점 수학은 80점 이다.
		// 총점과 평균을 구하자
		// 출력은 이름, 총점, 평균만 출력하자.(단, 평균은 소숫점 첫째자리 까지 구하자.)
		
		
	    
		int kor = 90 ;
		int eng = 80 ;
		int math = 80 ;
		int res = kor + eng + math ;
		double res1 = (kor + eng + math) / 3.0 ;
		System.out.println("이름 : 홍길동" );
		System.out.println("총점 : " + res + '점');
		System.out.println("평균 : " + res1 + '점');
				
		String res1_s = String.format("%.1f",res1); // 반올림
		System.out.println("평균 : " + res1_s + '점');
		System.out.println();
		
		// 풀이
		// 입력정보
		String name ="홍길동" ;
		int kor1 = 90 ;
		int eng1 = 80 ;
		int math1 = 60 ;
		
		// 요구사항 (처리 = 비지스로직) 
		// 총점과 평균
		int sum = kor1 + eng1 + math1 ;
		double avg = (int) (sum / 3.0 * 10)/10.0 ;
		double avg2 = (int) (sum / 3.0 * 100)/100.0 ;
		
		//출력
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("평균 : " + avg2);
		
		// 끝자리 버리기
		int k1 = 198745/10 *10 ;
		int k2 = 198745/100 *100;
		System.out.println(k1);
		System.out.println(k2);
		
				
	}
}


















