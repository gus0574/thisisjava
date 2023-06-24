package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr = "반복";
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println(inputStr);
			str = sc.nextLine();
		} while(!str.equals("q"));
		sc.close();
	}

}
