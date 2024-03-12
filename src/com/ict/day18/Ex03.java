package com.ict.day18;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		// 스트림 생성 : 기본자료형 배열로 부터 스트림 생성하기
		//            IntStream, DoubleStream, LongStream
		// 스트림 생성 : 컬렉션이나 배열을 Stream 으로 반환하는 작업
		// 객체, 배열부터 스트림 생성
		// IntStream<T> IntStream.of(Int...values) // 가변인자.
		// IntStream<T> IntStream.of(Int[])
		// IntStream<T> Arrays.stream(Int[])
		// IntStream<T> Arrays.stream(Int[], 시작index, 끝index(포함안됨))
		
		Integer[] integersArr = {1,2,3,4,5};
		Stream<Integer> integerStream = Arrays.stream(integersArr);
		// 메서드 참조
		//integerStream.forEach(System.out::print);
		integerStream.forEach(i->System.out.print(i+"님 "));
		System.out.println();
		//System.out.print(integerStream.count()); //최종처리에 사용한 후에는 다시 다시 호출 못함.
		// 다시 사용하고 싶으면 같은 이름의 Stream 을 다시 만들어야 한다.
		
		integerStream = Arrays.stream(integersArr);
		System.out.print("총 개수 : " + integerStream.count()); //최종처리에 사용한 후에는 다시 다시 호출 못함.
		System.out.println();
		
		// Stream<T> : count() O but sum() X, average() X
		//integerStream = Arrays.stream(integersArr);
		//System.out.print("총 합 : " + integerStream.sum()); 
		//System.out.print("평균 : " + integerStream.average()); 
		
		// 기본자료형 배열을 스트림으로
		// IntStream : count() O, sum() O, average() O
		int[] intArr = {10,20,30,40,50};
		IntStream intStream1 = IntStream.of(10,20,30,40,50);
		IntStream intStream2 = IntStream.of(intArr);
		IntStream intStream3 = Arrays.stream(intArr);
		IntStream intStream4 = Arrays.stream(intArr,2,5);
		
		intStream1.forEach(i->System.out.print(i+" "));
		System.out.println();
		
		System.out.println("총갯수 : " + intStream2.count());
		System.out.println("총 합 : " + intStream3.sum());
		System.out.println("평 균 : " + intStream4.average());
		System.out.println();
		
		
		
		
		
		
	}
}




















