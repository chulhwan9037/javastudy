package com.ict.day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex06_1 {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장시키고
		// 원하는 나라가 Key 값이 되어, 화면에서 나라를 물어보면 수도가
		// 출력되는 프로그램 작성
		
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		
		Set<String> keys = map.keySet();
		
		esc : while (true) {
			System.out.print("나라이름 : ");
			String country = scan.next();
			
			if (keys.contains(country)) {
				String res = map.get(country);
				System.out.println(country + " 의 수도는 " + res + "입니다.");
			}else {
				System.out.println("데이터가 없는 나라입니다.");
			}
			while (true) {
				System.out.print("계속할까요?(y/n)");
				String msg = scan.next();
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				}else if (msg.equalsIgnoreCase("n")) {
					break esc;
				}else {
					System.out.println("제대로 입력하세요");
					continue;
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
