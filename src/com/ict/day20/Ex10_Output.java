package com.ict.day20;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex10_Output {
	public static void main(String[] args) {
		// 1. VO를 이용해서 객체 만들기
		Ex10_VO vo1 = new Ex10_VO("고자바", 29, 79.6, true);
		Ex10_VO vo2 = new Ex10_VO("이자바", 19, 59.6, true);
		Ex10_VO vo3 = new Ex10_VO("김자바", 21, 62.1, false);
		Ex10_VO vo4 = new Ex10_VO("가자바", 40, 83.6, true);
		Ex10_VO vo5 = new Ex10_VO("나자바", 46, 100.3, false);
		Ex10_VO vo6 = new Ex10_VO("박자바", 10, 20.6, true);
		Ex10_VO vo7 = new Ex10_VO("임자바", 35, 65.7, false);
		Ex10_VO vo8 = new Ex10_VO("배자바", 60, 75.6, true);

		// 직렬화 (지금은 파일로 저장하자.)
		String pathname = "D:/chulhwan/util/object02.txt";
		File file = new File(pathname);

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

			// 객체 직렬화
			// 2. 객체가 여러개 일때는 객체를 컬렉션으로 모으자.
			ArrayList<Ex10_VO> list = new ArrayList<Ex10_VO>();
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
