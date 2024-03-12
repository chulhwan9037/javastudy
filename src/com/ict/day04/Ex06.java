package com.ict.day04;

public class Ex06 {
	public static void main(String[] args) {
		// 다중 if 문 
		// 형식) if(조건식1){
		//          조건식1이 참일때 실행; 
		//          조건식1이 참일때 실행; 
		//     }else if(조건식2){
		//          조건식1이 거짓이고 조건식2가 참일때 실행 ;
		//          조건식1이 거짓이고 조건식2가 참일때 실행 ;
		//     }else
		//     }else if(조건식3){
		//          조건식1,2가 거짓이고 조건식3이 참일때 실행 ;
		//          조건식1,2가 거짓이고 조건식3이 참일때 실행 ;
		//     }else{
		//          조건식 1,2,3 모두가 거짓일 때 실행 ; => 조건식 1,2,3 을 제외한 나머지 전부다. 
		//     } 
		
		// int k1의 점수가 90이상이면, A 80이상이면 B 70이상이면 C, 나머지 F
		int k1 = 98 ;
		String res ="" ;
		if (k1>=90) {
				res = "A";
		} else if (k1>=80){
			res = "B";
		} else if (k1>=70){
			res = "C";
		} else {
			res = "F";
		}
		System.out.println("점수 : " + res);
		
		// char k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별
		char k2 = '5';
		String res1 ="0";
		if (k2 >= 'A'&& k2<='z') {
			res1 = "대문자";
		} else if(k2 >= 'a'&& k2 <= 'z'){
			res1 = "소문자";
		} else if(k2 >='0'&& k2 <='9' ){
			res1 = "숫자";
		} else {
			res1 = "기타문자";
		}
		System.out.println(res1);
		// char k3가 A,a이면 아프리카 B,b이면 브라질 C,c이면 캐나다 나머지 한국
		char k3 = 'k';
		String res2 = "0";
		if (k3 == 'A' || k3 == 'a') {
			res2 = "아프리카";
		} else if(k3 =='B'|| k3=='b') {
			res2 = "브라질";
		} else if(k3 =='C'|| k3=='c') {
			res2 = "캐나다";
		} else {
			res2 = "한국";
		}
		System.out.println(res2);
				
		// menu가 1이면 카페모카 3500, 2이면 카페라테 4000, 3이면 아메리카노 3000, 4이면 과일쥬스 3500이다.
		// 친구와 2잔을 10000을 내고 먹었다. 잔돈은 얼마인가? (단, 부가세 10%포함, 친구와 같은 음료만 선택 가능)
		
		int menu = 4 ;
		int input = 10000 ;
		int su = 2 ;
		int dan = 0 ;
		int total = 0;
		int vat = 0 ;
		int output ;
		String drink = "";
		
		if (menu ==1) {
			drink = "카페모카";
			dan = 3500;
		}else if (menu ==2) {
			drink = "카페라떼";
			dan = 4000;
		}else if (menu ==3) {
			drink = "아메리카노";
			dan = 3000;
		}else if (menu==4) {
			drink = "과일주스";
			dan = 3500;
		}
		total = dan * su ;
		vat = (int)(total * 0.1) ;
		output = input - (total + vat) ;
		System.out.println("선택 메뉴 : " + drink);
		System.out.println("지불 금액 : " + input);
		System.out.println("음료 단가 : " + dan);
		System.out.println("음료 개수 : " + su);
		System.out.println("부가세포함금액: " + (total+vat));
		System.out.println("거스름돈 : " + output);
	
	}
}












