package ch04.sec02;

public class MathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = (int) (Math.random() * 10);
		
		System.out.println(a);
		
		switch(a) {
		case 1:
			System.out.println("1나옴");
			break;
		case 2:
			System.out.println("2나옴");
			break;
		case 3:
			System.out.println("3나옴");
			break;
		case 4:
			System.out.println("4나옴");
			break;
		default:
			System.out.println("기본");
			break;
		}
	}

}
