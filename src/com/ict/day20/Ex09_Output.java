package com.ict.day20;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// ObjectOutputStream : 객체 출력 스트림
	// writeObject() : 객체 직렬화 메서드
public class Ex09_Output {
	public static void main(String[] args) {
		// 1. VO를 이용해서 객체 만들기
		Ex09_VO vo1 = new Ex09_VO("고길동", 29, 79.6, true);
		Ex09_VO vo2 = new Ex09_VO("이길동", 19, 59.6, true);
		Ex09_VO vo3 = new Ex09_VO("김길동", 21, 62.1, false);
		Ex09_VO vo4 = new Ex09_VO("가길동", 40, 83.6, true);
		Ex09_VO vo5 = new Ex09_VO("나길동", 46, 100.3, false);
		Ex09_VO vo6 = new Ex09_VO("박길동", 10, 20.6, true);
		Ex09_VO vo7 = new Ex09_VO("임길동", 35, 65.7, false);
		Ex09_VO vo8 = new Ex09_VO("배길동", 60, 75.6, true);
		
		// 직렬화 (지금은 파일로 저장하자.)
		String pathname = "D:/chulhwan/util/object01.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 객체 직렬화
			// 1.객체가 하나 일때
			 //oos.writeObject(vo1);
			 //oos.flush();
			
			// 2. 객체가 여러개 일때는 객체를 컬렉션으로 모으자.
			ArrayList<Ex09_VO> list = new ArrayList<Ex09_VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			list.add(vo6);
			list.add(vo7);
			list.add(vo8);
			
			// 객체 직렬화
			oos.writeObject(list);
			oos.flush();
			
			
		} catch (Exception e) {
		} finally {
			try {
				bos.close();
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}



















