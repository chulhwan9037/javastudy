package com.ict.prac;

import java.util.Scanner;

import com.ict.day10.Ex09;

public class Ex10d {
	public static void main(String[] args) {
	Ex09 coffee = new Ex09();
	coffee.sName("아메");
	coffee.sPrice(3000);
	
	Ex09 ion = new Ex09();
	ion.sName("포카");
	ion.sPrice(4300);
	
	Ex09 cola = new Ex09();
	cola.sName("스프");
	cola.sPrice(3700);
	
	Ex09 juice = new Ex09();
	juice.sName("자몽");
	juice.sPrice(4700);
	
	Ex09[] arr = {coffee, ion, cola, juice};
	
	Scanner scan = new Scanner(System.in);
	System.out.print("금액을 투입하세요>>");
	int input = scan.nextInt();
	int output=0 ;
	esc : while (true) {
		if (input < 1500) {
			System.out.print("돈 부족해");
			System.out.println("잔돈 : " + input);
			break;
		}else {
			System.out.println("아메\t포카\t스프\t자몽\t반환");
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].gPrice() <= input) {
					System.out.print("O\t");
				}else {
					System.out.print("X\t");
				}
			}
			System.out.println();
			System.out.print("선택 ㄱㄱ");
			String drink = scan.next();
			
			switch(drink) {
			case "아메": output = input -arr[0].gPrice();break;
			case "포카": output = input -arr[1].gPrice();break;
			case "스프": output = input -arr[2].gPrice();break;
			case "자몽": output = input -arr[3].gPrice();break;
			case "반환": output = input -arr[4].gPrice();break esc;
			
			}
			System.out.println("잔돈 : " +output);
			input = output;
		}
		continue esc;
	}
		
	}
}
