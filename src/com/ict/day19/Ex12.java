package com.ict.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// D:/chulhwan/util/image01.jpg 파일을 D:/chulhwan/image01.jpg 로 복사
public class Ex12 {
	public static void main(String[] args) {
		String inputpath = "D:/chulhwan/util/image01.jpg";
		String outputpath = "D:/chulhwan/image007.jpg";

		File in_file = new File(inputpath);
		FileInputStream fis = null;          // 내용없이 선언만
		BufferedInputStream bis = null;

		File out_file = new File(outputpath);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream(in_file);
			bis = new BufferedInputStream(fis);

			fos = new FileOutputStream(out_file);
			bos = new BufferedOutputStream(fos);

			int b = 0;
			while ((b = bis.read()) != -1) {
				bos.write(b);
				bos.flush();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
				// 원본 삭제 하면 이동하기가 된다.
				boolean s = in_file.delete();
				if (s) {
					System.out.println("삭제성공");
				} else {
					System.out.println("삭제실패");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
