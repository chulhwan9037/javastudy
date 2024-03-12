package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05 {
	public static void main(String[] args) {
		// 장미란을 둘리로 주소는 서울 방학동으로 변경하자. 
		Connection conn = null ;
		Statement stmt = null ;
		ResultSet rs = null ;
		ResultSet rs2 = null ;
		int result = 0 ;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "update customer set name = '장미란' where custid = 3";
			//String sql1 = "update customer set address = '서울 방학동' where custid =3" ;
			
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		//	stmt = conn.createStatement();
		//	rs2 = stmt.executeQuery(sql1);
			
			if(result > 0) {
				System.out.println("변경성공");
				sql = "select * from customer";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
					
				
			//	sql1 = "select * from customer";
				//stmt = conn.createStatement();
				
				
			}else {
				System.out.println("변경실패");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
	}
}




































