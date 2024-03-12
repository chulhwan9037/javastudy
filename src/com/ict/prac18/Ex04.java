package com.ict.prac18;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Ex04 {
	public static void main(String[] args) {
		// 정수 배열을 스트림으로 활용하기
		int[] arr= {1,2,3,4,5};
		int sumVal = Arrays.stream(arr).sum();
		OptionalDouble count = Arrays.stream(arr).average();
		System.out.println("합계 : " + sumVal);
		System.out.println("평균 : " + count);
		
		
	}
}













