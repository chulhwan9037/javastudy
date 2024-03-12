package com.ict.prac;

//저정하는 관점 : 변수 => 배열 => 클래스
public class Ex05 {
	String name = " " ;
	int kor = 0;
	int eng = 0;
	int math = 0;
	int sum = 0 ;
	double avg = 0.0 ;
	String hak = " " ;
	int rank = 1 ;
	
	
	
	// 1. 총점, 평균 , 학점을 구하는 메서드를 각각 만들 수 있다. 
	public int plus(int s1, int s2, int s3) {
		int sum = s1 + s2 + s3 ;
		return sum;
	}
	
	// 2. 하나의 메서드에 총점, 평균, 학점을 구하는 메서드를 만들 수 있다. 
	public void process(String n, int k1, int k2, int k3) {
		name = n ;
		kor = k1 ;
		eng = k2 ;
		math = k3 ;
		sum = kor + eng + math ;  // k1 + k2 + k3 
		avg = (int)((sum)/3.0*10)/10.0;
		if(avg >= 90) {
			hak = "A학점";
		}else if (avg >= 80) {
			hak = "B학점";
		}else if (avg >= 70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
		
		
	}
	
	
	
	// 3. 총점, 평균 , 학점을 구하는 메서드를 각각 만들어서 호출 할 수 있다.
	

}
