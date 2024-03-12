package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Ex06_Client1 implements Runnable{
	Socket socket;
	
	OutputStreamWriter  osw =  null;
	BufferedWriter bw = null;
	BufferedReader keyboard = null;
	
	
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	public Ex06_Client1() {
		
		try {
			socket = new Socket("192.168.0.21",7001); // ip주소는 String
			isr = new InputStreamReader(socket.getInputStream());
			br = new BufferedReader(isr);
			
			osw = new OutputStreamWriter(socket.getOutputStream());
			bw = new BufferedWriter(osw);
			keyboard = new BufferedReader(new InputStreamReader(System.in));

			new Thread(this).start();
			
			while (true) {
				
			System.out.print("데이터 입력 : ");
			String msg = keyboard.readLine();
			
			// 서버에 접속
			bw.write(msg+"\n"); // 라인 끝표시
			bw.flush();
			
			
			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				String msg = br.readLine();
				System.out.println("서버로 부터 받은 메세지 : " + msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Ex06_Client1();
		
		
	}

}

















