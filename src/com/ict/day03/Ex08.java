package com.ict.day03;

public class Ex08 {
	public static void main(String[] args) {
		// 3989초 몇시간, 몇분, 몇초일까?
		
		int cho = 3989 ;
		int si = cho/(60*60) ;
		int bun = cho/60 - 60 ;
		int res = cho - (si*60*60 + bun*60) ;
		int res1 = si ;
		int res2 = bun ;
				
		System.out.println(res1 +"시"+ res2 + "분" + res + "초");
		
		// 풀이
		int sec = 3989 ;
		int h = 0 ;
		int m = 0 ;
		int s = 0 ;
		int res5 = 0 ; // 나머지 저장
		
		// 시간을 구하자
		h = sec/(60*60) ;
		res5 = sec% (60*60) ;
		m = res5 /(60);
		s = res5%(60);
		
		System.out.println(h);
		System.out.println(m);
		System.out.println(s);
		
		
	}
}







