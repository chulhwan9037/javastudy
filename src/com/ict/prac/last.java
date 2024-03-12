package com.ict.prac;

import java.util.Scanner;

public class last {

	public static void main(String[] args) {
		int num1 = 0;
        int num2 = 0;
        int sum = 0 ;
        for (int i = 1; i > 0; i ++) {
            if(i%2==0) {
                num1 = num1 - i;
            }
            else {
                num2 = num2 + i;
            }
            sum = num1 + num2;
            if (sum == 100) {
            System.out.println(i +"까지 갔습니다. " + sum +"값이 나왔습니다." );
            
        }
    }
	}
}
