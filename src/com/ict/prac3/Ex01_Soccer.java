package com.ict.prac3;

class Ex01_Soccer extends Ex01_Sports implements Ex01_Behavior{

	@Override
	public void play() {
		System.out.println("경기시작");
	}
	Ex01_Sports spo = new Ex01_Sports();
	
}
