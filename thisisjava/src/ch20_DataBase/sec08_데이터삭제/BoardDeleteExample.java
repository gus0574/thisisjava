package ch20_DataBase.sec08_데이터삭제;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BoardDeleteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","java","oracle");
			
			String sql = new StringBuilder()
					.append("DELETE FROM boards WHERE bno = ?")
					.toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, 2);
			
			int rows = pstmt.executeUpdate();
			System.out.println("수정된 행 개수 : " + rows);
			
			pstmt.close();
			
		} catch(Exception e) {
			
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {}
			}
		}
	}

}
