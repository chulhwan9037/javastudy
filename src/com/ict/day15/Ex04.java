package com.ict.day15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		// 배열을 컬렉션으로 변경 
		String[] str = {"java", "Java", "JAVA", "자바"};
		
		// List 를 안배웠다.
		// List<String> list = Arrays.asList(str);
		// System.out.println(list);
		
		// HashSet 만들기
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		
		// 배열의 요소를 하나씩 꺼내서 set1 에 넣자
		for (int i = 0; i < str.length; i++) {
			set1.add(str[i]); 
		}
		System.out.println(set1);
		System.out.println();
		
		set2.add("태권브이");
		set2.add("마징가Z");
		System.out.println(set2);
		System.out.println();
		
		// set2 에서 set1 모든 내용 받기 (addAll) 같은 제네릭 타입일 경우
		set2.addAll(set1);
		System.out.println(set2);
		System.out.println();
		
		// set2 에서 삭제해보기 
		// clear(), remove(Object o)
		set2.remove("태권브이");
		System.out.println(set2);
		System.out.println();
		
		set2.clear();
		System.out.println(set2);
		System.out.println();
		
		System.out.println(set2.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
