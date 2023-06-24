package ch04.sec03;

import java.util.Scanner;

public class SwitchExpressonsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String grade = sc.nextLine();
		
		switch(grade) {
		case "B" -> System.out.println("B 등급");
		// :와 ->를 섞어서 쓸 수 없다
		/*
		 * case "c": System.out.println("C 등급"); break;
		 */
		default -> System.out.println("not grade");
		}
		sc.close();
	}

}
