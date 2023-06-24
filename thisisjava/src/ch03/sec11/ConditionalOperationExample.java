package ch03.sec11;

import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : 'C';
		System.out.println(grade);
		sc.close();
	}

}
