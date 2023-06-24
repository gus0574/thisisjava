package ch06.sec11.exam01;

public class KoreanExample {
	public static void main(String[] args) {
		Korean kor = new Korean("이도현","123456-1234567");
		
		System.out.println(kor.nation);
		System.out.println(kor.name);
		System.out.println(kor.ssn);
		
		kor.name = "자바";
		System.out.println(kor.name);
		
		// final을 변경하려해서 에러 발생
//		kor.nation = "미국";
//		System.out.println(kor.nation);
		
	}
}
