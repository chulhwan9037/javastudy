package com.ict.prac2;

public class Rank1 {
	public static void main(String[] args) {
		int[] su = {90,80,70,95,65,85,75};
		int[] rank = {1,1,1,1,1,1,1};
		
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(su[i]==su[j])continue;
				if(su[i]<su[j]) {
					rank[i]++;
				}
			}
		}
		for (int i = 0; i < rank.length; i++) {
			System.out.println(rank[i]);
			
		}
	}
	
}
