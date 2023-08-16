package ch20_DataBase.sec06_데이터저장;

//jdbc 인터페이스에 포함된 클래스들이다

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;

		try {

			Class.forName("oracle.jdbc.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "java", "oracle");
			System.out.println("연결 성공");
			
			String sql = "insert into users (userid, username, userpassword, userage, usermail) values (?, ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "summer");
			pstmt.setString(2, "차여름");
			pstmt.setString(3, "123123");
			pstmt.setInt(4, 17);
			pstmt.setString(5, "summer@mycompany.com");
			
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수 : " + rows);
			
			pstmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
				System.out.println("연결해제");
			}
		}
	}

}
