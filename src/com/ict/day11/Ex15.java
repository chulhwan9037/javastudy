package com.ict.day11;

public class Ex15 {
	// 인스턴스는 객체 생성할 때 인수를 통해 초기화
	
	// static 초기화
	/*
        static {
         	초기화 내용;
 		}
	 */
	
	int s1 = 100 ;
	private int p1 = 300 ;
	static int s2 ;         // 50000
	static int s3 ;         // 0
	
	public static int k2 = 300 ; // 20000
	static int k3 = 300 ;
	private static int k4 = 500 ;
	
	static {
		k2 = 20000 ;
		s2 = 50000 ;
		j2 = 40000 ;
		m2 = 60000 ;
	} // 기본적으로 static 블록 위의 값을 초기화 한다.  
	
	static int m2 ;            // 30000 static 블록 밑에 위치했지만 선언만 했으므로 초기값을 가져온다.
	static int j2 = 400 ;      // 400 static 블록 밑에 위치했지만 값을 가지고 있으므로 자신의 값을 낸다.
	
	
	
	
}









