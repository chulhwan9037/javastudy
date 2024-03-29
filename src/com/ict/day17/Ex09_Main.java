package com.ict.day17;

public class Ex09_Main {
	public static void main(String[] args) {
		// 두 수 중에 큰값을 리턴하는 코딩 구현.
		Ex09 t1 = new Ex09() {
			@Override
			public int getMax(int num1, int num2) {
				int k;
				if (num1 > num2) {
					k = num1;
				} else {
					k = num2;
				}
				return k;
			}
		};
		Ex09 t2 = new Ex09() {
			@Override
			public int getMax(int num1, int num2) {
				if (num1 > num2) {
					return num1;
				} else {
					return num2;
				}
			}
		};

		System.out.println(t1.getMax(100, 200));
		System.out.println(t2.getMax(200, 100));
		System.out.println();
		
		// 람다식으로 
		Ex09 t3 = (int num1, int num2) -> {
			if(num1 > num2) {
				return num1;
			}else {
				return num2;
			}
		};
		System.out.println(t3.getMax(5000, 1000));
		
		// 한번더 축약
		Ex09 t4 = (num1, num2) -> num1 > num2 ? num1 :num2; 
		System.out.println(t4.getMax(1000, 5000));
	}
}

































