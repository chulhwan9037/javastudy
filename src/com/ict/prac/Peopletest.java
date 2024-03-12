package com.ict.prac;

public class Peopletest {
	public static void main(String[] args) {
		
		People people = new People();
		System.out.println("기본생성자 : "+people);
		System.out.println(people.getName());
		System.out.println(people.getAge());
		System.out.println(people.getAddr());
		
		People people2 = new People("김세하", 1, "창원");
		System.out.println("이름 : " + people2.getName());
		System.out.println("나이 : " + people2.getAge());
		System.out.println("주소 : " + people2.getAddr());
		
		
	}
}
