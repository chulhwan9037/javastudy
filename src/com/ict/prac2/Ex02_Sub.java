package com.ict.prac2;

import java.util.Random;

public class Ex02_Sub extends Random	 {

	int su = 0;
	
	public void play() {
		su = nextInt(10) + 1 ;
		System.out.println(su);
	}
}
