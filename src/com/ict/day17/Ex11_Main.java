package com.ict.day17;

public class Ex11_Main {
	public static void main(String[] args) {
		Ex11 t = s -> System.out.println(s);
		
		t.showString("Hello lamda1");
		// static 메서드는 static만 호출 할 수 있다.
		showMyString(t);
		
		showMyString(new Ex11() {
			@Override
			public void showString(String str) {
				System.out.println("Hello Lamda3");
			}
		});
	}
	
	public static void showMyString(Ex11 k) {
		k.showString("Hello lamda2");
	}
	
	
}













