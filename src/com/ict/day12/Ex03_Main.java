package com.ict.day12;

public class Ex03_Main {
	public static void main(String[] args) {
		// 자식클래스를 객체생성하면 부모클래스가 먼저 생성 된다. 
		Ex03_Sub t = new Ex03_Sub();
		
		// 부모              자식
		Ex03_Sup t2 = new Ex03_Sub(); // Sub(자식) is a Sup(부모) (O) 사람은 포유류이다.O
		//   자식              부모   =>  컴파일 오류
		//Ex03_Sub t3 = new Ex01_Sup(); // Sup(부모) is a Sub(자식) (X) 포유류는 사람이다.X
		
	}
}















