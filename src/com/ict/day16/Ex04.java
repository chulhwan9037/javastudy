package com.ict.day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {
		
		// Map 인터페이스 : Key 와 Value 를 1 : 1 매칭하는 구조 
		//               Key 는 중복 될 수 없다. (기존 Value 삭제 해버린다.)
		//               Value 는 중복 가능하다. 
		//               Key 를 호출하면 Value 가 나온다. 
		//               Key 를 별도로 관리 = > KeySet();
		//               add() 로 추가 못함
		//               put(Key, Value) 사용해서 추가
		//   관련 클래스  : HashMap
		
		// Key 가 숫자인 경우
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(0, "한국");
		map1.put(1, "중국");
		map1.put(2, "미국");
		map1.put(3, "태국");
		map1.put(10, "영국");
		map1.put(13, "일본");
		// Key 중복 => 덮어쓰기가 된다.
		map1.put(1, "호주");
		// Value 중복 => 괜찮음
		map1.put(16, "한국");

		System.out.println(map1);
		System.out.println();
		
		// 꺼내기
		// 무조건 KeySet(); 사용해야 한다.
		for (Integer k : map1.keySet()) {
			// Key 를 호출하면 Value 값이 나온다.
			System.out.println(map1.get(k));
		}
		System.out.println();
		
		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) {
			// k = Key 값
			Integer k = it.next();
			System.out.println(map1.get(k));
		}
		System.out.println("=========");
		
		// value만 구하기
		Collection<String> var = map1.values();
		System.out.println(var);
		
		System.out.println("===========");
		
		// entrySet(); Key 와 Value 모두 필요한 경우
		Set<Entry<Integer, String>> set1 = map1.entrySet();
		Iterator<Entry<Integer, String>> it2 = set1.iterator();
		while (it2.hasNext()) {
			Entry<Integer, String> entry =  it2.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}
		
	}
}
















