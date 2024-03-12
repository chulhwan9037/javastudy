package com.ict.prac3;

import java.util.Random;

public class rrrran {
	public static void main(String[] args) {
		int a[] = new int[3];
		Random r = new Random();
		
		for (int i = 0; i < 3; i++) {
			a[i] = r.nextInt(10);
			for (int j = 0; j < i; j++) {
				if(a[i]==a[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
