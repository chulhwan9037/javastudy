package com.ict.prac18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex05 {
	public static void main(String[] args) {
		// ArrayList 를 Stream 으로
		
		List<String> sList = new ArrayList<String>();
		sList.add("Totti");
		sList.add("DeRossi");
		sList.add("Gatusso");
		sList.add("Marchisio");
		
		Stream<String> stream = sList.stream();
		stream.forEach(i->System.out.println(i));
	}
}
