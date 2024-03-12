package com.ict.day07;

public class Ex02 {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 데이터들을 한 곳에 모아둔 묶음
		//       ** 같은 자료형이어야 한다. 
		//       생성할 때 크기를 지정해야 된다.(지정하지 않으면 생성 안됨.)
		//       한번 지정한 크기는 변경이 안됨.
		//       배열 안에 데이터를 가져오기 위해서는 일반적으로 for문을 사용.
		
		
		// 배열 생성 순서 : 선언 => 생성 => 초기화(데이터 저장)
		// 1. 선언 : 자료형 이름[] ; 또는 자료형 [] 이름;
		int su[] ; // int[] su ;
		
		
		// 2. 생성 : 이름 = new 자료형[배열크기=갯수]
		//        new 예약어 : 메모리에 데이터를 저장할 공간을 만들어 달라. 
		//                   => 인스턴스, 객체 생성 // 방순서는 0번 부터
		su = new int[4];
		
		
		// 3. 데이터 저장 : 이름[index = 위치값] = 0부터 시작 
		//               데이터는 같은 자료형이어야 한다. (프로모션 가능 : 작은 자료형이 큰 자료형으로 변경 되는 것)
		su[0] = 100 ; 
		su[1] = 'a' ; // 프로모션
		// su[2] = 3.14 ;
		su[2] = (int)(3.14) ; // 3만 들어간다. 디모션 강제 형변환
		su[3] = 100 ; // 값은 겹쳐도 상관없다.
		// su[4] = 107 ; 런타임(실행)오류 발생, 만들어 놓은 방이 4개 뿐이라 생성 불가.
		
		su[2] = 107 ; // 나중에 생성한 데이터가 전에 데이터를 덮어쓴다.
		
		// 배열을 호출하면 주소(생성ID) 가 출력 
		System.out.println(su);
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		System.out.println();
		
		// 배열의 전체를 출력할 때는 보통 for문 사용.
		
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		
		
		
		
		
	}
}






















