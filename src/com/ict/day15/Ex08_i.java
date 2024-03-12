package com.ict.day15;

import java.util.HashSet;
import java.util.Scanner;

public class Ex08_i {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashSet<Ex07> set1 = new HashSet<Ex07>();
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
		set1.add(p);
		
		while (true) {
			System.out.println("계속할까요?(y/n");
			String str = scan.next();
			if(str.equalsIgnoreCase("y")) {
				continue esc;
			}else if (str.equalsIgnoreCase("n")) {
				break esc;
			}else {
				continue;
			}
		}
		
		}
		
		
		for (Ex07 k : set1) {
			System.out.print(k.getName()+"\t");
			System.out.print(k.getSum()+"\t");
			System.out.print(k.getAvg()+"\t");
			System.out.print(k.getHak()+"\t");
			System.out.print(k.getRank()+"\n");
		
		
		
		
		
		
		}
		
		
	}
}
