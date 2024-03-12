package com.ict.day10;

public class AnimalTest {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		System.out.println("이름 : " + animal.getName());
		System.out.println("나이 : " + animal.getAge());
		if(animal.isLive()) {
			System.out.println("살아있음");
		}else {
			System.out.println("죽어잇음");
		}
		System.out.println();
		
		animal.setName("펭귄");
		System.out.println("이름 : " + animal.getName());
		System.out.println("나이 : " + animal.getAge());
		if(animal.isLive()) {
			System.out.println("살아있음");
		}else {
			System.out.println("죽어잇음");
		}
		System.out.println();
		
		Animal animal2 = new Animal();
		
		System.out.println("이름 : " + animal2.getName());
		System.out.println("나이 : " + animal2.getAge());
		if(animal2.isLive()) {
			System.out.println("살아있음");
		}else {
			System.out.println("죽어잇음");
		}
		System.out.println();
		
		
	}
}


















