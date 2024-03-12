package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<Ex07> set = new HashSet<Ex07>();
		esc : while (true) {
			
		System.out.print("이름");
		String name = scan.next();
		
		System.out.print("kor");
		int kor = scan.nextInt();

		System.out.print("eng");
		int eng = scan.nextInt();
		
		System.out.print("math");
		int math = scan.nextInt();
		
		Ex07 p = new Ex07(name, kor, eng, math);
		set.add(p);
		
		while (true) {
				System.out.println("계속?");
				String str = scan.next();
				if (str.equalsIgnoreCase("y")) {
					continue esc;
				}else if (str.equalsIgnoreCase("n")) {
					break esc;
				}else {
					continue;
				}
		}
		}
			for (Ex07 t : set) {
				System.out.print(t.getName()+"\t");
				System.out.print(t.getSum()+"\t");
				System.out.print(t.getAvg()+"\t");
				System.out.print(t.getHak()+"\t");
				System.out.print(t.getRank()+"\n");
		}
		
		
	}
}
