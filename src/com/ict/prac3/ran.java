package com.ict.prac3;

import java.util.Random;

public class ran {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int [] ch = new int[3];
		
		for (int i = 0; i < 3; i++) {
			int su = (int)(Math.random()*10);
			ch[i] = su;
			for (int j = 0; j < i; j++) {
				if(ch[j] == su) {
					i--;
				}
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+" ");
		}
		
	}
}
