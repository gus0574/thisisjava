package ch02.sec13;

// 스캐너를 사용하기 위함 
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		int test1 = 3;
		double test2 = 3.14;
		System.out.println(test1+test2);
		
		//현재컴퓨터(System) 의(.) 입력장치_키보드(in)
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String inputData = scanner.nextLine();
		
		System.out.println(inputData);
		
		System.out.print("정수 입력: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		System.out.println(x);
		
		System.out.print("실수 입력: ");
		String strY = scanner.nextLine();
		double y = Double.parseDouble(strY);
		System.out.println(y);
		
		boolean bool = true;
		while(bool) {
			System.out.println("합: "+(x+y));
			System.out.print("멈추려면 false 입력 :");
			bool = scanner.nextBoolean();
			System.out.print("입력한 참거짓 : "+bool);
		}
		scanner.close();
	}
}
