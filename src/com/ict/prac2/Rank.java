package com.ict.prac2;

public class Rank {
	public static void main(String[] args) {
		int[] su = { 1, 7, 5, 9, 13 };
		int tmp = 0;
		for (int i = 0; i < su.length - 1; i++) {
			for (int j = i + 1; j < su.length; j++) {
				if (su[i] > su[j]) {
					tmp = su[i];
					su[i] = su[j];
					su[j] = tmp;
				}
			}
		}
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);

		}

		
		
	}
}
