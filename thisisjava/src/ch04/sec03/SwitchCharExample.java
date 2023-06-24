package ch04.sec03;

import java.util.Scanner;

public class SwitchCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		int chNum = sc.nextInt();
		
		String ch = sc.nextLine();
		
		switch(ch) {
//		case "A":
		case "a", "A":
			System.out.println("A 등급");
			break;
//		case "B":
		case "b", "B":
			System.out.println("B 등급");
			break;
		/*
		 * case "c", "C" -> { System.out.println("C 등급"); }
		 */
		default:
			System.out.println("등급외");
			break;
		}
		
		sc.close();
	}

}
