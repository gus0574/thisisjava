package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speed = 0;
		String menu = """
				---------------------------
				1. 가속 | 2. 감속 | 3. 중지
				---------------------------
				""";
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("현재속도: " + speed);
			System.out.println(menu);
			System.out.print("입력: ");
			int choice = sc.nextInt();
			if(choice == 1) {
				speed++;
			} else if(choice == 2) {
				speed--;
			} else if(choice == 3) {
				run = false;
			}
		}
		System.out.print("프로그램 종료");
		sc.close();
	}

}
