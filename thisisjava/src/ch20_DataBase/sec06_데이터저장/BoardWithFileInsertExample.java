package ch20_DataBase.sec06_데이터저장;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardWithFileInsertExample {

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
			
//			String sql = "INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata) VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE, ?, ?)";
			String sql = new StringBuilder()
					.append("INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata) ")
					.append("VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE, ?, ?)")
					.toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"bno", "btitle"});
			
			pstmt.setString(1, "눈 오는 날2");
			pstmt.setString(2, "함박눈이 내려요2");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "snow.jpg");
			// 프로젝트 기준 경로
			pstmt.setBlob(5, new FileInputStream("src/ch20_DataBase/sec06_데이터저장/snow.jpg"));
			
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수 : " + rows);
			
			if(rows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				
				if(rs.next()) {
					int bno = rs.getInt(1);
					String btitle = rs.getString(2);
					System.out.println("저장된 bno : " + bno);
					System.out.println("저장된 btitle : " + btitle);
				}
				rs.close();
			}
			
			pstmt.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch(Exception e) {}
			}
		}
	}

}
