package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {
	public static void main(String[] args) {
		// 1. 자바를 오라클에 접속할 수 있도록 도와주는 클래스
					Connection conn = null ;
				// 2. SQL 구문 작성
					Statement stmt = null ;
				// 3-1. 결과를 받는 클래스(select 일 때)
					ResultSet rs = null ;
				// 3-2. 결과를 받는 변수(select 아닐 때)
					//int result = 0 ;
				
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
						String sql = "select * from book" ;
						
						// 8. sql 보내기 위해서 구문을 만듬
						stmt = conn.createStatement();
						// 9. 보내서 결과 받기"
						// 9-1 select 문인 경우 
						rs = stmt.executeQuery(sql);
						
						// 9-2 insert, update, delete 인 경우
						// result = stmt.executeUpdate(sql);
						// rs.getXXX(index => 1부터) 
						while (rs.next()) {
							System.out.print(rs.getInt("bookid"+"\t"));
							System.out.print(rs.getString("bookname"+"\t"));
							System.out.print(rs.getString("publisher"+"\t"));
							System.out.print(rs.getInt("price"+"\n"));
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












