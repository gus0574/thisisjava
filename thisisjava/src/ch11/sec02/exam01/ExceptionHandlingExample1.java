package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println(result);
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		} finally {
			System.out.println("마무리");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("시작");
		
		printLength("ThisIsJava");
		printLength(null);
		
		System.out.println("종료");
	}
}
