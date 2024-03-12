package com.ict.day18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex12 {
	public static void main(String[] args) {
		// collect : 스트림을 컬렉션으로 변환하자.
		Stream<String> s = Stream.of("a", "b", "c", "b", "z");
		TreeSet<String> set = s.collect(Collectors.toCollection(() -> new TreeSet<String>()));
		set.add("h");
		set.add("w");
		System.out.println(set);

		// Map
		Stream<String> str = Stream.of("나", "우리", "너", "모두", "노래해요");
		Map<Integer, String> res01 =
				// 길이가 같은것끼리 연결 해서 만듦
				str.collect(Collectors.groupingBy(i -> i.length(), Collectors.joining())); // Map 만드는 공식
		System.out.println(res01);
		System.out.println();
		
		int[] index = {1};
		str = Stream.of("나", "우리", "너", "모두", "노래해요");
		Map<Integer, String> res02 = str.collect(Collectors.toMap(i -> index[0]++, j -> j)); // Map 만드는 공식
		System.out.print(res02);
		System.out.println();
		
		str = Stream.of("나", "우리", "너", "모두", "노래해요");
		Map<Object, Object> res03 = str.collect(Collectors.toMap(i->i, j->j));
		System.out.print(res03);
		System.out.println();
		
		// 홀수와 짝수 묶어서 합계 구하기
		List<Integer> list = Arrays.asList(new Integer[] {1,2,3,4,5,6,8,11,13,14,15,17,18,19,20});
		Map<String, Integer> map = list.stream()
					// 홀수와 짝수를 각각 그룹으로 나누는 작업 => key 키값이 된다.
				.collect(Collectors.groupingBy(i->(i%2==0)?"even":"odd",
						// 누적합 => value 벨류값 
						Collectors.reducing(0, (i1, i2)->i1+i2)));
			System.out.println(map);
		
	}
}
























