package ch20_DataBase.sec04_DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			// 1) JDBC Driver를 메모리로 로딩하기 위해 해당 클래스를 Build Path에서 찾고 메모리로 로딩한다.
			// 이 과정에서 JDBC Driver 클래스의 static 블록이 실행되면서 JDBC Driver 객체를 드라이버를 관리하는 DriverManager에 등록하게된다.
			// DriverManager에 JDBC Driver가 등록되면 getConnection() 메소드로 DB와 연결할 수 있다.
			Class.forName("oracle.jdbc.OracleDriver");
			
			// DB 연결, .getConnection은 Connection 객체를 리턴한다 
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/orcl", // DBMS 마다 작성하는 형식이 다르다 
					"java",	// DB 계정
					"oracle" // DB password
					);
			// thin은 TCP용 JDBC Driver을 사용한다는 의미이다
			System.out.println("연결 성공");

			// DB 작업
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// AutoCloserable을 구현하고있기 때문에 try 안으로 넣을 수 있다.
			if (conn != null) { // conn 상태가 null이 아닐경우에만 실행
				// DB 연결 해제 예외가 발생하던지 상관없이 정상적으로 연결 해제할 수 있도록 finally
				try {
					conn.close();
				} catch (SQLException e) {
				}
				System.out.println("연결 해제");
			}
		}
	}
}
