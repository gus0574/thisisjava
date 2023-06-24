package ch05.sec05;

public class IndexOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject = "이도현님 환영합니다.";
		boolean result = subject.contains("이도현");
		
		//없을경우 -1 리턴
		System.out.println(subject.indexOf("환영합니다"));
		
		System.out.println(result);
	}

}
