package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// scanner 를 이용해서 번호, 이름, 주소, 전화번호를 받아 customer 테이블에 삽입 후 확인까지.
		Scanner scan = new Scanner(System.in);
		Connection conn = null ;
		Statement stmt = null ;
		ResultSet rs = null ;
		int result = 0 ;
		
		try {
			Class.forName("oracl.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";
			
			conn = DriverManager.getConnection(url, user, password);
			
			System.out.println("고객번호 입력");
			int custid1 = scan.nextInt();
			System.out.println("이름");
			String name1 = scan.next();
			System.out.println("주소");
			String address1 = scan.next();
			System.out.println("전화번호");
			String phone1 = scan.next();
			
			
			
			String sql = "insert into customer set custid = custid1, name = 'name1', address = 'address1', phone = 'phone1'";
			
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
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
						
			}
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
				scan.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


















