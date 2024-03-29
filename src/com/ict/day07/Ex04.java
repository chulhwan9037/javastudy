package com.ict.day07;

import java.util.Arrays;
import java.util.Collections;

public class Ex04 {
	public static void main(String[] args) {
		// Arrays 클래스 : 배열을 다루기 위한 다양한 메서드가 포함 되어 있는 클래스
		int[] arr = new int[100] ;
		// 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 5 ;
			System.out.println("arr[" + i +"] = " + (i*5));
		}
		

		// binarySearch(배열, 찾을값) : 해당 배열에서 찾을값을 검색 한 후에  찾은값의 위치값을 반환. 
		// 위치값이 -값이 나오면 무시(값을 찾지 못했음)
		int res = Arrays.binarySearch(arr, 10);
		System.out.println("결과 : " + res);
		
		// copyOf(배열, 새로만든 배열의 길이);
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = Arrays.copyOf(arr1, 3);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		
		int[] arr3 = Arrays.copyOf(arr1, 10);
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println();
		
		// copyOfRange("배열",시작위치,끝위치); // 끝위치 포함 안함.
		int[] arr4 = Arrays.copyOfRange(arr1, 2, 8);
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		System.out.println();
		
		// fill(배열, 초기값) : 배열의 초기값을 지정 // 왜 3이지
		int[] arr5 = new int[10];
		Arrays.fill(arr5, 3);
		for (int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}
		System.out.println();
		
		// sort(배열) : 해당 배열을 오름차순 정렬, 내림차순 정렬은 없음
		int[] arr6 = {7,4,3,1,5,6,2};
		Arrays.sort(arr6);
		System.out.println("arr6 오름차순");
		for (int i = 0; i < arr6.length; i++) {
			System.out.println(arr6[i]);
		}
		System.out.println();
		
		// 위에서 정렬을 끝낸다음 오름차순 후 끝에서부터 가져오기
		System.out.println("정렬된 arr6을 내림차순으로 출력");
		for (int i = arr6.length -1 ; i>=0 ; i--) {
			System.out.println(arr6[i]);
		}
		System.out.println();
		
		
		// 내림차순 Integer 라는 Wrapper 클래스사용
		// **주의사항 : int => Integer 
		System.out.println("Collection 사용해서 내림차순 만들기");
		Integer[] arr7 = {7,4,3,1,5,6,2};
		Arrays.sort(arr7, Collections.reverseOrder());
		for (int i = 0; i < arr7.length; i++) {
			System.out.println(arr7[i]);
		}
		System.out.println();
		
		System.out.println("문자열 정렬 순서: 숫자, 특수문자, 대문자, 소문자, 한글");
		String[] arr8 = {"Mango", "Apple", "가나다", "8","apple", "mango", "나바사", "1", "@", "banana", "Banana" };
		Arrays.sort(arr8);
		for (int i = 0; i < arr8.length; i++) {
			System.out.println(arr8[i]);
		}
		System.out.println();
		
		// Arrays.asList() : 배열을 리스트라는 컬렉션으로 변경할 때 사용합니다. 
		// List의 toArrays() : 리스트를 배열로 변경할 때 사용.
		
		
		
		
		
		
	}
}



















