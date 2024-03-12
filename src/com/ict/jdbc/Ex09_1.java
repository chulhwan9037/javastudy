package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
// 삭제하기
public class Ex09_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("삭제할 번호 : ");
		int custid = scan.nextInt();
		//System.out.print("이름 :");
		//String name = scan.next();
		//System.out.print("주소 :");
		//String address = scan.next();
		//System.out.print("전화번호 :");
		//String phone = scan.next();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";

			conn = DriverManager.getConnection(url, user, password);

			String sql = "delete from customer where custid = ? ";

			pstmt = conn.prepareStatement(sql);
			
			// ? 해결 위치
			pstmt.setInt(1, custid);
			//pstmt.setString(2, name);
			//pstmt.setString(3, address);
			//pstmt.setString(4, phone);
			
			// 보내고 결과 받기
			result = pstmt.executeUpdate();
			
			if (result > 0 ) {
				sql = "select * from customer";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}
			}else {
				System.out.println("삭제실패");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				scan.close();
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
