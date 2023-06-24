package ch04.sec03;

import java.util.Scanner;

public class SwitchValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String grade = sc.nextLine();
		
		int score = 100;
		score = switch(grade) {
		case "A" -> {
			score = score - 10;
			System.out.println(score);
			yield score;
//			System.out.println(score);
		}
		//연산해서 대입하고싶은 경우 yield를 필수로 작성
		case "B" -> {
			score = score - 20;
			yield score;
		}
		// :와 ->를 섞어서 쓸 수 없다
		/*
		 * case "c": System.out.println("C 등급"); break;
		 */
		default -> 0;
		};
		
		System.out.println(score);
		
		sc.close();
	}

}
