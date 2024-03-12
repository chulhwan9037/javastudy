package com.ict.prac18;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		// 스트림 생성 : 기본자료형 배열로 부터 스트림 생성하기 
		//            IntStream, DoubleStream, LongStream
		// 스트림 생성 : 컬렉션이나 배열을 Stream 으로 반환하는 작업
		// 객체, 배열부터 스트림 생성
		// IntStream<T> IntStream.of(Int...value) //가변인자. 인자를 직접 입력
		// IntStream<T> IntStream.of(Int[])
		// IntStream<T> Arrays.stream(Int[])
		// IntStream<T> Arrays.stream(Int[],시작index,끝index포함X)
		
		Integer[] integerArr = {1,2,3,4,5};
		Stream<Integer> integerStream = Arrays.stream(integerArr);
		// 메서드 참조
		// integerStream.forEach(System.out::print);
		integerStream.forEach(i->System.out.println(i));
		System.out.println();
		
		integerStream = Arrays.stream(integerArr);
		System.out.println("총 개수 : " + integerStream.count());
		System.out.println();
		
		// Stream<T> : count() O /// sum,average X 
		// integerStream = Arrays.stream(integerArr);
		// System.out.print("총 합 : " + integerStream.sum());
		// System.out.print("평 균 : " + integerStream.average());
		
		// 기본자룧ㅇ 배열을 스트림으로 
		// IntStream : count,sum,average 모두 사용가능
		
		int[] intArr = {10,20,30,40,50};
		IntStream intStream1 = IntStream.of(20,40,60,80,100);
		IntStream intStream2 = IntStream.of(intArr);
		IntStream intStream3 = Arrays.stream(intArr);
		IntStream intStream4 = Arrays.stream(intArr, 2, 5);
		
		intStream1.forEach(i->System.out.println(i));
		System.out.println();
		
		System.out.println("카운트 : " + intStream2.count());
		System.out.println("총 합 : " + intStream3.sum());
		System.out.println("평 균 : " + intStream4.average());
		
		
	}
}



























