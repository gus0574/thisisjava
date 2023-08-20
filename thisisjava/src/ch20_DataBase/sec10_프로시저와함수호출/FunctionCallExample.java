package ch20_DataBase.sec10_프로시저와함수호출;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class FunctionCallExample {

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
			
			String sql = "{ call user_create(?, ?, ?, ?, ?, ?) }";
			CallableStatement cstmt = conn.prepareCall(sql);
			cstmt.setString(1, "spring");
			cstmt.setString(2, "봄봄");
			cstmt.setString(3, "12345");
			cstmt.setInt(4, 26);
			cstmt.setString(5, "spring@mycompany.com");
			cstmt.registerOutParameter(6, Types.INTEGER);
			
			cstmt.execute();
			
			int rows = cstmt.getInt(6);
			System.out.println("회원가입 수 : "+rows);
			
			cstmt.close();
					
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
