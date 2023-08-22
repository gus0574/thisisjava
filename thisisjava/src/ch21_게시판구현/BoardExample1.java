package ch21_게시판구현;

public class BoardExample1 {
	//Field
	
	
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
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardExample1 boardExample = new BoardExample1();
		boardExample.list();
	}

}
