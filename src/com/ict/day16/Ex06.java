package com.ict.day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장시키고
		// 원하는 나라가 Key 값이 되어, 화면에서 나라를 물어보면 수도가
		// 출력되는 프로그램 작성
		
		Map<String, String> map1 = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		map1.put("대한민국", "서울");
		map1.put("캐나다", "오타와");
		map1.put("영국", "런던");
		map1.put("스위스", "취리히");
		
		esc : while (true) {
			System.out.print("나라이름 : ");
			String country = scan.next();
			if (!map1.containsKey(country)) {
				System.out.println("데이터에 없는 나라");
				continue;
			}
		//	Iterator<String> it = map1.keySet().iterator();
	//		while (it.hasNext()) {
		//		String k = it.next(); // k = Key 값
				System.out.println(country+"의 수도는"+ map1.get(country)); // value 값
		//		break;
				
		//	}
			while (true) {
				System.out.println("계속? (y/n)");
				String str = scan.next();
				if (str.equalsIgnoreCase("y")) {
					continue esc;
				}else if (str.equalsIgnoreCase("n")) {
					break esc;
				}
		}
		}
		System.out.println("수고하셨음");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
















