package com.ict.day10;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Ex09 coffee = new Ex09();
		coffee.sName("커피음료");
		coffee.sPrice(1500);
		
		Ex09 ion = new Ex09();
		ion.sName("이온음료");
		ion.sPrice(2300);

		Ex09 cola = new Ex09();
		cola.sName("탄산음료");
		cola.sPrice(2000);
		
		Ex09 juice = new Ex09();
		juice.sName("과일쥬스");
		juice.sPrice(1800);
		
		Ex09 exit = new Ex09();
		exit.sName("반환");
		exit.sPrice(0);
		
		
		Ex09[] arr = {coffee, ion, cola, juice, exit};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입하세요>>");
		int input = scan.nextInt();
		int output = 0;
		esc : while (true) {
			
			if(input < 1500) {
				System.out.print("금액이 부족합니다.");
				System.out.println("잔돈 : " + input);
				break;
			}else {
				System.out.println("커피\t이온\t탄산\t과일\t반환");
				
				// 각 음료수의 가격을 가져와서 비교하자.
				for (int i = 0; i < arr.length; i++) {
					if(arr[i].gPrice() <= input) {
						System.out.print("O\t");
					}else {
						System.out.print("X\t");
					}
				}
				System.out.println();
				System.out.print("선택 하세요 >>");
				String drink = scan.next();
				
				
				
				switch (drink) {
				case "커피":	output = input - arr[0].gPrice(); break;
				case "이온":	output = input - arr[1].gPrice(); break;
				case "탄산":	output = input - arr[2].gPrice(); break;
				case "과일":	output = input - arr[3].gPrice(); break;
				case "반환": output = input - arr[4].gPrice(); break esc;
				
				}
				System.out.println("잔돈 : " + output );
				input = output;
			}
			continue esc;
		}
		
	}
}
