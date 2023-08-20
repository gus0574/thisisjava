package ch20_DataBase.sec11_트랜잭션처리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionExample {

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
			conn.setAutoCommit(false);

			String sql1 = "UPDATE accounts SET balance = balance-? WHERE ano=?";
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			pstmt1.setInt(1, 10000);
			pstmt1.setString(2, "111-111-1111");
			int rows1 = pstmt1.executeUpdate();
			if(rows1 == 0) throw new Exception("출금 되지 않았음");
			pstmt1.close();
			
			String sql2 = "UPDATE accounts SET balance = balance+? WHERE ano=?";
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setInt(1, 10000);
			pstmt2.setString(2, "222-222-1221");
			int rows2 = pstmt2.executeUpdate();
			if(rows2 == 0) throw new Exception("입금 되지 않았음");
			pstmt2.close();
			
			conn.commit();
			System.out.println("성공");
			
		} catch(Exception e) {
			try {
				conn.rollback();
			} catch(Exception e2) {}
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					//커넥션 풀 반납을 위해 원복
					conn.setAutoCommit(true);
					conn.close();
				} catch(Exception e) {}
			}
		}
	}

}
