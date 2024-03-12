package com.ict.day09;

public class Ex16 {
	public static void main(String[] args) {
		
		Ex15 t = new Ex15();
		String name = t.play01("홍길동");
		System.out.println("이름 : " + name);
		System.out.println(t.name);
		int res = t.play02(80, 90, 97);
		System.out.println("총점 : " + res);
		System.out.println(t.sum);
		int res2 =t.play03(88, 97, 89);
		System.out.println("총점 : " + res2);
		System.out.println(t.sum);
		
	}
}
