package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		byte a = 65;
		char b = a;
		System.out.println(b);
		*/
		
		// 아래처럼 강제 캐스팅을 사용하면 에러가 발생하지 않는다.
		byte a = 65;
		char b = (char) a;
		System.out.println(b);
	}

}
