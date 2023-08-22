package ch21_게시판구현;

import java.util.Scanner;

public class BoardExample2 {
	//Field
	private Scanner scanner = new Scanner(System.in);
	
	//Constructor
	
	
	//method
	// 게시물 목록을 출력하고 mainMenu() 메소드를 호출하는 메소드
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("=======================================================");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("=======================================================");
		System.out.printf("%-6s%-12s%-16s%-40s \n", "1", "winter", "2022.01.27", "게시글 제목 1");
		System.out.printf("%-6s%-12s%-16s%-40s \n", "2", "winter", "2022.01.27", "게시글 제목 2");
		
		mainMenu();
	}
	
	public void mainMenu() {
		System.out.println("");
		System.out.println("=======================================================");
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
	}
	
	public void read() {
		System.out.println("read 실행");
	}
	
	public void clear() {
		System.out.println("clear 실행");
	}
	
	public void exit() {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardExample2 boardExample = new BoardExample2();
		boardExample.list();
	}

}
