package ch20_DataBase.sec09_데이터읽기;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserSelectExample {

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
			
			String sql = new StringBuilder()
					.append("SELECT userid, username, userpassword, userage, usermail ")
					.append("FROM users ")
					.append("WHERE userid = ?")
					.toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				User user = new User();
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString(2));
				user.setUserPassword(rs.getString(3));
				user.setUserAge(rs.getInt(4));
				user.setUserMail(rs.getString(5));
				
				printUser(user);
			} else {
				System.out.println("사용자 아이디 없음");
			}
			
			rs.close();
			pstmt.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
			} catch(Exception e) {}
		}
	}

	public static void printUser(User user) {
		System.out.println("User ID : "+user.getUserId());
	}
}
