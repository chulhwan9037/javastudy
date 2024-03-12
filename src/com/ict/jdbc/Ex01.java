package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// jar 이란 자바로 압축한 파일 보통 라이브러리에 사용 
	// 자바와 오라클을 연결해주는 드라이버가 필요하다. 
	// 그런데 sqldeveloper 에 존재한다. 해당 드라이버(ojdbc)를 복사해서 until 폴더에 넣자.
	// 이클립스에서 프로젝트에서 마우스 오른쪽 build path  -- configure build path
	
public class Ex01 {
	public static void main(String[] args) {
		// 1. 자바를 오라클에 접속할 수 있도록 도와주는 클래스
			Connection conn = null ;
		// 2. SQL 구문 작성
			Statement stmt = null ;
		// 3-1. 결과를 받는 클래스(select 일 때)
			ResultSet rs = null ;
		// 3-2. 결과를 받는 변수(select 아닐 때)
			int result = 0 ;
		
			try {
				// 4. jdbc 드라이버 로딩 : 오라클, MySQL, mariaDB 다 다르다.
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				// 5. 오라클과 연결하기 위한 정보 
				String url = "jdbc:oracle:thin:@localhost:1521:xe" ;
				String user = "c##ictedu" ;
				String password = "1111" ;
				
				// 6. 오라클에 연결하기
				conn = DriverManager.getConnection(url, user, password);
				
				// 7. SQL 작성
				String sql = "select * from customer " ;
				
				// 8. sql 보내기 위해서 구문을 만듬
				stmt = conn.createStatement();
				// 9. 보내서 결과 받기"
				// 9-1 select 문인 경우 
				rs = stmt.executeQuery(sql);
				
				// 9-2 insert, update, delete 인 경우
				// result = stmt.executeUpdate(sql);
				// rs.getXXX(index => 1부터) 
				while (rs.next()) {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}				
				
			} catch (Exception e) {
			} finally {
				try {
					rs.close();
					stmt.close();
					conn.close();
				} catch (Exception e2) {
				}
			}
		
		
		
		
		
		
	}
}



























