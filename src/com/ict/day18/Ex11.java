package com.ict.day18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ex11 {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("딸기","바나나","가지","멜론","수박");
		// naturalOrder() : 기본정렬을 뜻한다.
		Optional<String> o_min = str.stream().min(Comparator.naturalOrder());
		Optional<String> o_max = str.stream().max(Comparator.naturalOrder());
		// findAny : 요소 중 하나의 요소를 반환 
		Optional<String> o_findAny = str.stream().findAny();
		// findFirst : 요소 중 첫번째 요소를 반환 
		Optional<String> o_findFirst = str.stream().findFirst();
		
		System.out.println(o_min.get());
		System.out.println(o_max.get());
		System.out.println(o_findAny.get());
		System.out.println(o_findFirst.get());
		
		List<Integer> num = Arrays.asList(5,8,6,2,8,7,3,21,5,9);
		Optional<Integer> o_min1 = num.stream().min(Comparator.naturalOrder());
		Optional<Integer> o_max1 = num.stream().max(Comparator.naturalOrder());
		Optional<Integer> o_findAny1 = num.stream().findAny();
		Optional<Integer> o_findFirst1 = num.stream().findFirst();
		
		System.out.println(o_min1.get());
		System.out.println(o_max1.get());
		System.out.println(o_findAny1.get());
		System.out.println(o_findFirst1.get());
		
		
		
		
		
		
		
		
	}
}






















