package com.ict.homework;

public class Ex01 {
	public static void main(String[] args) {
		// 1+(-2)+3(-4)+....... 과 같은식으로 계속 더해갔을 때, 몇까지 더해야 총합이 100 이상이 되는지 구해라.
		int sum = 0;
		int cnt = 0;
		for (int i = 1;  sum <=99  ; i++) {
			if(i%2==0) {
				sum = sum - i;
			}else {
				sum = sum + i;
			}
			cnt = i ;
		}
		System.out.println(cnt);
		
	}
}




















