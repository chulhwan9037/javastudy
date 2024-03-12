package com.ict.day11;

public class Ex06 {
	private String name = " ";
	private int price = 0;

	public Ex06(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// getter / setter
	// 변수에 접근제한자 private 이므로 외부에서는 접근 불가 하다.
	// 내부에서는 접근이 가능하다는 부분을 이용해서
	// 메서드를 만들어서 접근하거나 접근해서 데이터를 삽입하거나 가져올 수 있다.

	// setter
	public void sName(String k) {
		name = k;
	}

	public void sPrice(int k) {
		price = k;
	}

	// getter
	public String gName() {
		return name;
	}

	public int gPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
