package com.ict.prac18;

import java.util.stream.IntStream;

public class Ex06 {
	public static void main(String[] args) {
		int[] arr = {1,6,8,4,6,2,8,7,6,2,5};
		
		IntStream intStream = IntStream.of(arr);
		intStream.forEach(i->System.out.print(i));
		System.out.println();
		
		IntStream intStream1 = IntStream.of(arr);
		intStream1.distinct().forEach(i->System.out.print(i));
		
		
		
		
	}
}
