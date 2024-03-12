package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

// 무한루프 스레드처리
public class Ex06_Server implements Runnable{
	ServerSocket server = null;
	Socket socket = null;
	
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	OutputStreamWriter  osw =  null;
	BufferedWriter bw = null;
	
	public Ex06_Server() {
		try {
			server = new ServerSocket(7001);
			System.out.println("서버 대기중");
			
			new Thread(this).start();
		} catch (Exception e) {
		}
	}
	@Override
	public void run() {
		try {
			while (true) {
				socket = server.accept();
				isr = new InputStreamReader(socket.getInputStream());
				br = new BufferedReader(isr);
				
				String msg = br.readLine();
				
				String ip = socket.getInetAddress().getHostAddress();
				System.out.println(ip + " : " + " 님 접속");
				
				// 클라이언트에게 보내기
				osw = new OutputStreamWriter(socket.getOutputStream());
				bw = new BufferedWriter(osw);
				msg += System.lineSeparator();
				bw.write(msg+System.lineSeparator());
				bw.flush();
				
			}
		} catch (Exception e) {
			System.out.println(e);
			try {
				socket.close();
			} catch (Exception e2) {
			}
		}
	}
	public static void main(String[] args) {
		new Ex06_Server();
		
	}
}
