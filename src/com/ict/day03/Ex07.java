package com.ict.day03;

public class Ex07 {
	public static void main(String[] args) {
		// 2시간 40분 30초를 초로 환산 하여라. (몇 초일까요?)
		
		int si = 2 * 60 * 60 ;
		int bun = 40 * 60 ;
		int cho = 30 ;
		int res = si + bun + cho ;
		System.out.println(res + "초") ;
		System.out.println();
		
				
		// 풀이
		// 입력정보
		int h = 2 * 60 * 60 ;
		int m = 40 * 60 ;
		int s = 30 ;
		int sec = h + m + s ;
		System.out.println("2시간 40분 30초는 " + sec + "초");
	}
}
