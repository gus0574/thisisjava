package ch21_게시판구현;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BoardExample8 {
	//Field
	private Scanner scanner = new Scanner(System.in);
	private Connection conn;
	
	//Constructor 생성자
	public BoardExample8() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/orcl",
					"java",
					"oracle"
					);
		} catch(Exception e) {
			e.printStackTrace();
			exit();
		} finally {
			
		}
	}
	
	//method
	// 게시물 목록을 출력하고 mainMenu() 메소드를 호출하는 메소드
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("=======================================================");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("=======================================================");

		try {
			String sql = new StringBuilder().append("SELECT bno, btitle, bcontent, bwriter, bdate ")
					.append("FROM boards ").append("ORDER BY bno DESC").toString();

			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));

				System.out.printf("%-6s%-12s%-16s%-40s\n", board.getBno(), board.getBtitle(), board.getBcontent(),
						board.getBwriter(), board.getBdate());
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}

		mainMenu();
	}
	
	public void mainMenu() {
		System.out.println("=======================================================");
		System.out.println("");
		System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.print("메뉴 선택: ");
		
		String menuNum = scanner.nextLine();
		System.out.println();
		
		switch(menuNum) {
		case "1": create(); break;
		case "2": read(); break;
		case "3": clear(); break;
		case "4": exit(); break;
		}
	}
	
	public void create() {
		System.out.println("create 실행");
		Board board = new Board();
		
		System.out.println("[새 게시물 입력]");
		System.out.print("제목: ");
		board.setBtitle(scanner.nextLine());
		System.out.print("내용: ");
		board.setBcontent(scanner.nextLine());
		System.out.print("작성자: ");
		board.setBwriter(scanner.nextLine());
		
		System.out.println("=======================================================");
		System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택: ");
		String menuNum = scanner.nextLine();
		if(menuNum.equals("1")) {
			//DB boards 테이블에 데이터 저장
			try {
			String sql = "INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate) VALUES(SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getBtitle());
			pstmt.setString(2, board.getBcontent());
			pstmt.setString(3, board.getBwriter());
			pstmt.executeUpdate();
			pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		
		list();
	}
	
	public void read() {
		System.out.println("read 실행");
		System.out.println("[게시물 읽기]");
		System.out.println("게시물 번호: ");
		int bno = Integer.parseInt(scanner.nextLine());

		try {
			String sql = new StringBuilder().append("SELECT bno, btitle, bcontent, bwriter, bdate ")
					.append("FROM boards ").append("WHERE bno = ? ").append("ORDER BY bno ASC").toString();

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));

				System.out.println("#######################");
				System.out.println("번호: " + board.getBno());
				System.out.println("제목: " + board.getBtitle());
				System.out.println("내용: " + board.getBcontent());
				System.out.println("작성자: " + board.getBwriter());
				System.out.println("날짜: " + board.getBdate());
				System.out.println("#######################");

				System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
				System.out.println("메뉴 선택: ");
				String menuNum = scanner.nextLine();
				if (menuNum.equals("1")) {
					update(board);
				} else if (menuNum.equals("2")) {
					delete(board);
				}
			}

			rs.close();
			pstmt.close();

		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}

		list();
	}
	
	public void update(Board board) {
		System.out.println("[게시물 수정]");
		System.out.println("수정할 제목: ");
		board.setBtitle(scanner.nextLine());
		System.out.println("수정할 내용: ");
		board.setBcontent(scanner.nextLine());
		System.out.println("수정할 작성자: ");
		board.setBwriter(scanner.nextLine());
		System.out.println("=======================================================");
		System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택: ");
		String menuNum = scanner.nextLine();

		if (menuNum.equals("1")) {
			try {
				String sql = "UPDATE boards SET " + "btitle = ?, " + "bcontent = ?, " + "bwriter = ? " + "WHERE bno = ?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBtitle());
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter());
				pstmt.setInt(4, board.getBno());
				pstmt.executeUpdate();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		list();
	}
	
	public void delete(Board board) {
		try {
			
			String sql = "DELETE FROM boards "
					+ "WHERE bno = ? ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBno());
			pstmt.executeUpdate();
			pstmt.close();
			
		} catch(Exception e) {
			e.printStackTrace();
			exit();
		}
		list();
	}
	
	public void clear() {
		System.out.println("[게시물 전체 삭제]");
		System.out.println("=======================================================");
		System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택: ");
		String menuNum = scanner.nextLine();
		
		if(menuNum.equals("1")) {
			try {
			String sql = "TRUNCATE FROM boards";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		
		list();
	}
	
	public void exit() {
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				
			}
			System.out.println("프로그램 종료");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardExample8 boardExample = new BoardExample8();
		boardExample.list();
	}

}
