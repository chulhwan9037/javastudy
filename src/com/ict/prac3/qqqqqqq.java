package com.ict.prac3;

import static java.lang.System.out;

public class qqqqqqq {
	public static void main(String[] args) {
		int[] var = {10,200,30};
			   for(int i=0 ; i < 3 ; i++){
				try{
				out.println("var["+i+"] : "+var[i]);
			}catch(ArrayIndexOutOfBoundsException ae){
				out.println("배열을 넘었습니다.");
				}
			   }
		
			   out.println("프로그램 끝!");

	}
}
