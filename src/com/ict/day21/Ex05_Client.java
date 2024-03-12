package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
	// 클라이언트 출력스트림부터
public class Ex05_Client {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		
		try {
			// 서버에 접속
			System.out.print("입력 : ");
			String msg = scan.next();
			socket = new Socket("192.168.0.21",7000); // ip주소는 String
			
			// 출력스트림 얻고 문자열 보내기
			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			bw.write(msg+"\n");
			bw.flush();
			
			// 입력스트림 얻고 서버에서 보낸 정보 받기.
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String remsg = br.readLine();
			System.out.println("받은 정보 : " + remsg);
			
			
			
		} catch (Exception e) {
			System.out.println("클라이언트 오류");
		} finally {
			try {
				br.close();
				isr.close();
				is.close();
				bw.close();
				osw.close();
				os.close();
				socket.close();
			} catch (Exception e) {
			}
		}
		
		
	}
}
































