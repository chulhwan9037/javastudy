package com.ict.day18;

import java.util.stream.IntStream;

public class Ex06 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,1,2,3,4,5,1,2,3};
		
		IntStream intStream1 = IntStream.of(arr);
		intStream1.forEach(i->System.out.print(i+" "));
		System.out.println();
		
		// distinct() => 중복제거
		IntStream intStream2 = IntStream.of(arr);
		intStream2.distinct().forEach(i->System.out.print(i+" "));
		System.out.println();
		
		// filter(짝수만) => 조건에 안 맞는 요소 제외
		IntStream intStream3 = IntStream.range(0, 10);  // 마지막 포함 X
		intStream3.filter(i->i%2==0).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		// limit(수) => 잘라내기 수만큼만 나와라.
		IntStream intStream4 = IntStream.rangeClosed(0, 10); // 마지막 포함 O
		intStream4.limit(3).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		// skip(수) = > 수만큼 제외시켜라. 
		IntStream intStream5 = IntStream.rangeClosed(0, 10); 
		intStream5.skip(3).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		
		
		
		
		
	}
}


















































