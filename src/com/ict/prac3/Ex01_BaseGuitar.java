package com.ict.prac3;

public class Ex01_BaseGuitar extends Ex01_Guitar implements Ex01_Behavior{

	@Override
	public void play() {
		System.out.println("연주 시작");
	}

}
