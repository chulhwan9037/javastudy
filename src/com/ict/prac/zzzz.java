package com.ict.prac;

import java.util.Scanner;


public class zzzz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수 : ");
		int su = scan.nextInt();

		// 학생 수 만큼 배열을 만들자.
		// 해당 배열안에는 클래스가 들어간다. 
		// Ex05 클래스로 만든 객체를 배열에 자료형으로 사용
		// 즉, 해당 배열안에는 Ex05 로 만든 객체의 주소만 존재
		
		Ex05[] arr = new Ex05[su];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름 : ");
			String name = scan.next();
			
			System.out.print("국어 : ");
			int kor = scan.nextInt();

			System.out.print("영어 : ");
			int eng = scan.nextInt();
			
			System.out.print("수학 : ");
			int math = scan.nextInt();
			
			Ex05 p = new Ex05();
			p.process(name, kor, eng, math);
			
			arr[i] = p ;
						
		}
		
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == j)continue;
			    if(arr[i].sum < arr[j].sum) {
			    arr[i].rank++;	
			    
			    }
			}
		}
		
		// 정렬
		Ex05 tmp = new Ex05();
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].rank > arr[j].rank) {
					tmp= arr[i];
					arr[i] = arr[j];
					arr[j] = tmp ;
				}
			}
		}
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name+"\t");
			System.out.print(arr[i].sum+"\t");
			System.out.print(arr[i].avg+"\t");
			System.out.print(arr[i].hak+"\t");
			System.out.print(arr[i].rank+"\n");
		}
		
	}
		
				
	
}
