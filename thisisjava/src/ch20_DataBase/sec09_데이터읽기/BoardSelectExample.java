package ch20_DataBase.sec09_데이터읽기;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardSelectExample {

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
					.append("SELECT bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata ")
					.append("FROM boards ")
					.append("WHERE bwriter = ?")
					.toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			
			ResultSet rs = pstmt.executeQuery();
			
			List<Board> boards = new ArrayList<>();
			
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString(3));
				board.setBwriter(rs.getString(4));
				board.setBdate(rs.getDate(5));
				board.setBfilename(rs.getString(6));
				board.setBfiledata(rs.getBlob(7));
				
				// blob 데이터 얻어서 파일로 저장
				Blob blob = board.getBfiledata();
				if(blob != null) {
					InputStream is = blob.getBinaryStream();
					OutputStream os = new FileOutputStream("C:/Temp/"+board.getBfilename());
					is.transferTo(os);
					os.flush();
					is.close();
					os.close();
				}
				
				boards.add(board);
			}
			
			printUser(boards);
			
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

	public static void printUser(List<Board> boards) {
		for(Board board : boards) {
			System.out.println(board);
		}
		
		//내부 반복자
		//boards.stream().forEach(b -> System.out.println(b));
	}

}
