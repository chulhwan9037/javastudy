package com.ict.prac;

public class People {

	private String name = "김철환" ;
	private int age = 35 ;
	private int number = 86709037 ;
	private String addr = "김포" ; 
	
	public People() {
		name = "김찬이" ;
	}

	public People(String name, int age, String addr ) {
		this.name = name ;
		this.age = age ;
		this.addr = addr ;
				
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
	
}
