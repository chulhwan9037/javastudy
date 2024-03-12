package com.ict.day18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ex05 {
	public static void main(String[] args) {
		// ArrayList 를 Stream 으로 
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(i->System.out.print(i+" "));
		System.out.println();
		
		// 중간처리 : 정렬 sorted(); 알파벳 순서로 정렬 
		Stream<String> stream2 = sList.stream();
		stream2.sorted().forEach(i->System.out.print(i+" "));
		System.out.println();
		
		// 반대로 정렬 sorted(Comparator.reverseOrder())
		Stream<String> stream3 = sList.stream();
		stream3.sorted(Comparator.reverseOrder()).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		// 정렬 : 숫자 -> 대문자 -> 소문자 -> 한글
		Stream<String> stream4 = Stream.of(new String[] {"bb","a","cc","dd","BB","aaa"});
		stream4.sorted().forEach(i->System.out.print(i+" "));
		System.out.println();
		//반대정렬
		Stream<String> stream5 = Stream.of(new String[] {"bb","a","cc","dd","BB","aaa"});
		stream5.sorted(Comparator.reverseOrder()).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		// 알파벳 순서대로 정렬 (String.CASE_INSESITIVE_ORDER) 같은 문자의 대소문자는 입력순서 대로 나옴.
		Stream<String> stream6 = Stream.of(new String[] {"bb","aaa","cc","dd","BB","a"});
		stream6.sorted(String.CASE_INSENSITIVE_ORDER).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		// 알파벳 순서 반대로 대로 정렬 (String.CASE_INSESITIVE_ORDER.reversed) 같은 문자의 대소문자는 입력순서 대로 나옴.
		Stream<String> stream7 = Stream.of(new String[] {"BB","a","cc","dd","bb","aaa"});
		stream7.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		
		
		
	}
}





























