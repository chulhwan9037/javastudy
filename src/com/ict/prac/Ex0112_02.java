package com.ict.prac;

public class Ex0112_02 {
	public static void main(String[] args) {
		
		// Ex0112_01 객체 생성
		// 생성자가 없어서 기본 생성자를 사용
		// Ex0112_01 에 생성자를 만들자.
		Ex0112_01 ex0112_01 = new Ex0112_01("도우너", 11);
		
		// 이름, 나이, 주소 출력
		System.out.println(ex0112_01.getName());
		System.out.println(ex0112_01.getAge());
		System.out.println(ex0112_01.getAddr());
		System.out.println();

		
		// 이름을 임꺽정, 나이를 34, 주소를 함경도로 변경
		ex0112_01.setName("임꺽정");
		ex0112_01.setAge(34);
		ex0112_01.setAddr("함경도");
		System.out.println(ex0112_01.getName());
		System.out.println(ex0112_01.getAge());
		System.out.println(ex0112_01.getAddr());
		System.out.println();
	}
}