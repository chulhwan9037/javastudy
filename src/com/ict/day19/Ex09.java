package com.ict.day19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

	// 스트림은 지연이 될 수 있으므로 Buffer(임시기억)을 이용해서 지연 현상을 해결한다. 
	// BufferedOutputStream 사용 but 혼자서는 사용 못함. 항상 아웃풋스트림이랑 짝을 이룬다.
public class Ex09 {
	public static void main(String[] args) {
		String pathname = "D:/chulhwan/util/test01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			// true 가 있으면 이어쓰기가 된다. 없으면 덮어쓰기다. 
			fos = new FileOutputStream(file, true); //(file);
			bos = new BufferedOutputStream(fos);
			String msg = "한국 ICT 인재개발원 \n 5강의장 \n자바 실습 중\n";
			byte[] b = msg.getBytes();
			bos.write(b);
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}











