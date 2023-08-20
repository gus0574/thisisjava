package ch20_DataBase.sec10_프로시저와함수호출;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ProcedureCallExample {

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
			
			String sql = "{ ? = call user_login(?, ?) }";
			CallableStatement cstmt = conn.prepareCall(sql);
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.setString(2, "summer");
			cstmt.setString(3, "123123");
			
			cstmt.execute();
			
			int rows = cstmt.getInt(1);
			switch(rows) {
			case 1:
				System.out.println("비밀번호 불일치");
				break;
			case 0:
				System.out.println("로그인 성공");
				break;
			case 2:
				System.out.println("아이디 미존재");
				break;
			}
			
			conn.commit();
			cstmt.close();
					
		} catch(Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					// 커넥션은 커넥션풀을 통해 재사용될 수 있기 때문에 오토커밋을 원복해야한다.
					conn.setAutoCommit(true);
					conn.close();
				} catch(Exception e) {}
			}
		}
	}

}
