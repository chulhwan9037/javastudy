package com.ict.prac18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex02 {
	public static void main(String[] args) {
		// 스트림 생성 : 컬렉션이나 배열을 Stream 으로 반환하는 작업
		// 객체, 배열부터 스트림 생성
		// Stream<T> Stream.of(T...values) // 가변인자
		// Stream<T> Stream.of(T[])
		// Stream<T> Arrays.stream(T[])
		// Stream<T> Arrays.stream(T[], 시작index, 끝index포함X)
		
		String[] arr = {"둘리","도우너","마이콜","희동이","공실이","또치"};
		List<String> list = Arrays.asList("마린","메딕","탱크","배슬","일꾼","터렛");
		
		//배열이용
		Stream<String> stream01 = Stream.of("질럿","다크","포토","아둔","아칸","스카웃");
		Stream<String> stream02 = Stream.of(arr);
		Stream<String> stream03 = Arrays.stream(arr);
		Stream<String> stream04 = Arrays.stream(arr,2,5);
		Stream<String> stream05 = list.stream();
		
		stream01.forEach(i->System.out.println(i+" 님"));
		System.out.println();
		stream02.forEach(i->System.out.println(i+" 님"));
		System.out.println();
		stream03.forEach(i->System.out.println(i+" 님"));
		System.out.println();
		stream04.forEach(i->System.out.println(i+" 님"));
		System.out.println();
		stream05.forEach(i->System.out.println(i+" 님"));
		System.out.println();
		
		
		String[] arr1 = {"김","이","박","최","유"};
		List<String> list1 = Arrays.asList("kim","lee","park","choi","you");
		
		
		
		
	}
}





















