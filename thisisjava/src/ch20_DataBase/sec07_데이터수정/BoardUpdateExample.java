package ch20_DataBase.sec07_데이터수정;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardUpdateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/orcl",
					"java",
					"oracle"
					);
			System.out.println("연결 성공");
			
			String sql = new StringBuilder()
					.append("UPDATE boards SET ")
					.append("btitle = ?, ")
					.append("bcontent = ? ")
					.append("WHERE bno = ? ")
					.toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"bno"});
			
			pstmt.setString(1, "수정1");
			pstmt.setString(2, "내용수정했음");
			pstmt.setInt(3, 1);
			
			int rows = pstmt.executeUpdate();
			
			ResultSet rs = pstmt.getGeneratedKeys();
			System.out.println("수정된 행 개수 : " + rows);
			
			while(rs.next()) {
				int bno = rs.getInt(1);
				System.out.println("수정된 행 번호 : " + bno);
			}
			
			rs.close();
			pstmt.close();
		} catch(Exception e) {
			
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
			System.out.println("연결 종료");
		}
	}

}
